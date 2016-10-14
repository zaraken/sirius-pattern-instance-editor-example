package man.em.nik.objinst.design;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.sirius.business.api.dialect.command.RefreshRepresentationsCommand;
import org.eclipse.sirius.business.api.session.ModelChangeTrigger;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.common.tools.api.listener.NotificationUtil;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.diagram.Messages;
import org.eclipse.sirius.diagram.business.internal.metamodel.helper.LayerHelper;
import org.eclipse.sirius.diagram.description.AdditionalLayer;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.eclipse.sirius.diagram.description.Layer;
import org.eclipse.sirius.diagram.description.filter.FilterDescription;
import org.eclipse.sirius.diagram.tools.api.command.ChangeLayerActivationCommand;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.sirius.ext.base.Options;

/**
 * @author Nik
 *
 */
public class AutoActivateFilter implements ModelChangeTrigger {

	private final TransactionalEditingDomain domain;

	public AutoActivateFilter(Session session) {
		super();
		this.domain = session.getTransactionalEditingDomain();
	}

	public static final NotificationFilter IS_LAYER_ACTIVATED = new NotificationFilter.Custom() {

		public boolean matches(Notification input) {
			if (input.getFeature() instanceof EReference
					//&& "activatedFilters".equals(((EReference)input.getFeature()).getName())
					//&& input.getNewValue() instanceof CompositeFilterDescription || input.getNewValue() == null
					&& input.getNotifier() instanceof DSemanticDiagram){
				return true;
			}
			return false;
		}
	};

	/**
	 * Activate a Filter.
	 * 
	 * @param dDiagram
	 *            the {@link DDiagram}
	 * @param filterName
	 *            the filter name
	 * @return <code>Command</code> if the activation could be made,
	 *         <code>null</code> otherwise
	 */
	protected final static Command activateFilter(final DSemanticDiagram diagramDescription, final String filterName) {
		final FilterDescription filter = getFilter(diagramDescription.getDescription(), filterName);
		final DDiagram dDiagram = diagramDescription;
		if (filter != null && !dDiagram.getActivatedFilters().contains(filter)) {
			Command activateFilter = new RecordingCommand(TransactionUtil.getEditingDomain(dDiagram), "Activate Filter") {

				@Override
				protected void doExecute() {
					if (!dDiagram.getActivatedFilters().contains(filter)) {
						dDiagram.getActivatedFilters().add(filter);
					}

					new RefreshRepresentationsCommand(TransactionUtil.getEditingDomain(dDiagram), new NullProgressMonitor(), dDiagram).execute();
				}
			};

			return activateFilter;
		}
		return null;
	}

	/**
	 * Searches the given {@link DDiagram} for a filter of the given name and
	 * returns it.
	 * 
	 * @param diagram
	 *            The diagram to search for a tool.
	 * @param filterName
	 *            The name of the searched filter.
	 * @return The retrieved filter, or <code>null</code> if it cannot be found.
	 */
	protected final static FilterDescription getFilter(final DiagramDescription diagramDescription, final String filterName) {
		final Collection<FilterDescription> filters = new ArrayList<>(diagramDescription.getFilters());

		for (final FilterDescription filter : filters) {
			if (filter.getName().equals(filterName)) {
				return filter;
			}
		}
		return null;
	}

	@Override
	public Option<Command> localChangesAboutToCommit(
			Collection<Notification> arg0) {

		nextNotif:
		for (Notification notif: arg0){
			if (IS_LAYER_ACTIVATED.matches(notif)){
				DSemanticDiagram dSemDiagram = (DSemanticDiagram)notif.getNotifier();

				String filterName = "pdiHidePatternObjectWhenInstance";
				for (FilterDescription fil: dSemDiagram.getActivatedFilters()){
					if (filterName.equals(fil.getName())){
						continue nextNotif;
					}
				}

				Command activateCommand = null;
				activateCommand = activateFilter(dSemDiagram, filterName);
				if (activateCommand != null) {
					return Options.newSome(activateCommand);
				}
			}
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
