package man.em.nik.objinst.design;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.sirius.business.api.session.ModelChangeTrigger;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.diagram.description.AdditionalLayer;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.eclipse.sirius.diagram.description.Layer;
import org.eclipse.sirius.diagram.tools.api.command.ChangeLayerActivationCommand;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.sirius.ext.base.Options;

/**
 * @author Nik
 *
 */
public class AutoDeactivateConflictingLayers implements ModelChangeTrigger {

	private TransactionalEditingDomain domain;

	public AutoDeactivateConflictingLayers(Session session) {
		super();
		this.domain = session.getTransactionalEditingDomain();
	}
	
	public static final NotificationFilter IS_LAYER_ACTIVATED = new NotificationFilter.Custom() {

		public boolean matches(Notification input) {
			//System.err.println("filter input " + input);
			//System.err.println("filter input event type" + input.getEventType());
			if (input.getEventType() == Notification.ADD
					&& input.getFeature() instanceof EReference
					&& "activatedLayers".equals(((EReference)input.getFeature()).getName())
					&& input.getNewValue() instanceof AdditionalLayer
					&& input.getNotifier() instanceof DSemanticDiagram){
				return true;
//						org.eclipse.emf.ecore.impl.ENotificationImpl@1668c3e3 
//							(		eventType: ADD
//									, position: 2
//									, notifier: org.eclipse.sirius.diagram.business.internal.metamodel.spec.DSemanticDiagramSpec@7ba4591 
//										(documentation: ) (name: new User1) 
//										(synchronized: true, isInLayoutingMode: false, headerHeight: 1)
//									, feature: org.eclipse.emf.ecore.impl.EReferenceImpl@102fcc80 
//										(name: activatedLayers) (ordered: true, unique: true, lowerBound: 0, upperBound: -1) 
//										(changeable: true, volatile: false, transient: false, defaultValueLiteral: null, unsettable: false, derived: false) 
//										(containment: false, resolveProxies: true)
//									, oldValue: null
//									, newValue: org.eclipse.sirius.diagram.business.internal.metamodel.description.spec.AdditionalLayerSpec@7914c8ac 
//										(documentation: ) 
//										(endUserDocumentation: , name: Base2, label: null, icon: null) 
//										(activeByDefault: false, optional: true)
//									, isTouch: false, wasSet: true
//						)
			}
			return false;
		}
	};
	
	/**
     * Deactivate a layer.
     * 
     * @param dDiagram
     *            the {@link DDiagram}
     * @param layerName
     *            the layer name
     * @return <code>true</code> if the deactivation could be made,
     *         <code>false</code> otherwise
     */
    protected final static Command deactivateLayer(final DSemanticDiagram diagramDescription, final String layerName) {
        Layer layer = getLayer(diagramDescription.getDescription(), layerName);
        DDiagram dDiagram = diagramDescription;
        if (layer != null && dDiagram.getActivatedLayers().contains(layer)) {
            Command changeLayersActivationCmd = new ChangeLayerActivationCommand(TransactionUtil.getEditingDomain(dDiagram), dDiagram, layer, new NullProgressMonitor());
            return changeLayersActivationCmd;
        }
        return null;
    }
    
    /**
     * Searches the given {@link DDiagram} for a layer of the given name and
     * returns it.
     * 
     * @param diagram
     *            The diagram to search for a tool.
     * @param layerName
     *            The name of the searched layer.
     * @return The retrieved layer, or <code>null</code> if it cannot be found.
     */
    protected final static Layer getLayer(final DiagramDescription diagramDescription, final String layerName) {
    	final Collection<Layer> layers = new ArrayList<Layer>(diagramDescription.getAllLayers());

        for (final Layer layer : layers) {
            if (layer.getName().equals(layerName)) {
                return layer;
            }
        }
        return null;
    }
    
	@Override
	public Option<Command> localChangesAboutToCommit(
			Collection<Notification> arg0) {
		
		// Define which layers should be deactivated when a certain other is activated
		Map<String, List<String>> conflictingLayers = new HashMap<String, List<String>>();
		conflictingLayers.put("pdiPattern", Arrays.asList((new String[] {"pdiInstantiation", "dummyLayer"})));
		conflictingLayers.put("pdiInstantiation", Arrays.asList((new String[] {"pdiPattern"})));		
		conflictingLayers.put("dummyLayer", Arrays.asList((new String[] {"pdiPattern"})));
		
		CompoundCommand cc = new CompoundCommand();
		for (Notification notif: arg0){
			if (IS_LAYER_ACTIVATED.matches(notif)){
				AdditionalLayer al = (AdditionalLayer) notif.getNewValue();
				String layerName = al.getName();
				DSemanticDiagram dSemDiagram = (DSemanticDiagram)notif.getNotifier();
				Command deactivateCommand = null;

				if (null != conflictingLayers.get(layerName)){
					for (String conflictingLayer: conflictingLayers.get(layerName)){
						deactivateCommand = deactivateLayer(dSemDiagram, conflictingLayer);
						if (deactivateCommand != null) {
							cc.append(deactivateCommand);
						}
					}
				}
			}
		}
		if (cc.getCommandList().size()>0){
			return Options.newSome((Command)cc);
		}
		return Options.newNone();
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.sirius.business.api.session.ModelChangeTrigger#priority()
	 */
	@Override
	public int priority() {
		// TODO Auto-generated method stub
		return 0;
	}

}
