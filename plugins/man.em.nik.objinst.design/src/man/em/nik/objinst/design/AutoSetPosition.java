/**
 * 
 */
package man.em.nik.objinst.design;

import java.util.Collection;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.sirius.business.api.session.ModelChangeTrigger;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.diagram.ui.business.api.view.SiriusGMFHelper;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.sirius.ext.base.Options;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.LayoutConstraint;
import org.eclipse.gmf.runtime.notation.Node;

/**
 * @author Nik
 *
 */
public class AutoSetPosition implements ModelChangeTrigger {

	public static final Adapter AUTO_SIZE_MARKER = new AdapterImpl();
	private final TransactionalEditingDomain domain;

	public AutoSetPosition(Session session) {
		super();
		this.domain = session.getTransactionalEditingDomain();
	}
	
	public static final NotificationFilter IS_ELEMENT_ADDED = new NotificationFilter.Custom() {

		public boolean matches(Notification notif) {
			// look for a GmfNode that points to a SiriusNode that points to the semantic element recorded by SourceViewRecorder.
			if (SourceViewRecorder.sourceGmfView != null){// && input.getEventType() == Notification.ADD){
				if (notif.getNewValue() instanceof Node 
						&& ((Node)notif.getNewValue()).getElement() instanceof DNode
						&& ((DNode)((Node)notif.getNewValue()).getElement()).getTarget().equals(SourceViewRecorder.newElement)) {
					return true;
				} else if (notif.getNotifier() instanceof Node 
						&& ((Node)notif.getNotifier()).getElement() instanceof DNode
						&& ((DNode)((Node)notif.getNotifier()).getElement()).getTarget().equals(SourceViewRecorder.newElement)) {
					return true;
				}
			}
			return false;
		}
	};
    
	@Override
	public Option<Command> localChangesAboutToCommit(
			Collection<Notification> arg0) {
		if (SourceViewRecorder.sourceGmfView != null){
			for (Notification notif: arg0){
				if (IS_ELEMENT_ADDED.matches(notif)){
					final Node gmfNode;
					if (notif.getNewValue() instanceof Node 
							&& ((Node)notif.getNewValue()).getElement() instanceof DNode
							&& ((DNode)((Node)notif.getNewValue()).getElement()).getTarget().equals(SourceViewRecorder.newElement)) {
						gmfNode = (Node)notif.getNewValue();
					} else if (notif.getNotifier() instanceof Node 
							&& ((Node)notif.getNotifier()).getElement() instanceof DNode
							&& ((DNode)((Node)notif.getNotifier()).getElement()).getTarget().equals(SourceViewRecorder.newElement)) {
						gmfNode = (Node)notif.getNotifier();
					} else {
						gmfNode = null;
					}
					if (gmfNode == null) continue;
					
					final Bounds srcBounds = (Bounds) SourceViewRecorder.sourceGmfView.getLayoutConstraint();
					
					if ( ((Bounds) gmfNode.getLayoutConstraint()).getX() == srcBounds.getX()
							&& ((Bounds) gmfNode.getLayoutConstraint()).getY() == srcBounds.getY()){
						SourceViewRecorder.reset();
						continue;
					}
					//LayoutConstraint sourceConstrainttrg = gmfNode.getLayoutConstraint();
					Command copyConstraintsCommand  = new RecordingCommand(domain) {
						
						@Override
						protected void doExecute() {
							try {
								//org.eclipse.sirius.diagram.ui.tools.api.layout.LayoutUtils.copyConstraints(SiriusGMFHelper.getGmfNode(SourceViewRecorder.sourceView), gmfNode);
								org.eclipse.sirius.diagram.ui.tools.api.layout.LayoutUtils.copyConstraints(SourceViewRecorder.sourceGmfView, gmfNode);
//								if (gmfNode.getLayoutConstraint() instanceof Bounds) {
//									//((Bounds) gmfNode.getLayoutConstraint()).setWidth(-1);
//									//((Bounds) gmfNode.getLayoutConstraint()).setHeight(-1);
//									((Bounds) gmfNode.getLayoutConstraint()).setX(srcBounds.getX());
//									((Bounds) gmfNode.getLayoutConstraint()).setY(srcBounds.getY());
//								}
								// throws exception System.err.println(SiriusGMFHelper.getGmfNode(SourceViewRecorder.sourceView).getLayoutConstraint());
								//SourceViewRecorder.reset();
							} catch (Exception e){
								e.printStackTrace();
							}
							
						}
					};
					
					return Options.newSome(copyConstraintsCommand);
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
