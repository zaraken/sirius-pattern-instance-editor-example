package man.em.nik.objinst.design;

import java.util.Collection;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.diagram.ui.business.api.view.SiriusGMFHelper;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

/**
 * @author nik
 *
 */
public class SourceViewRecorder implements IExternalJavaAction {

	// variables hold values for element that the user last interacted with
	// 
	// those will be used and reset by a trigger that reacts to changes in Sirius model
	public static EObject newElement = null;
	public static DNode sourceView = null;
	public static Node sourceGmfView = null;
	public static DNode targetView = null;
	public static Node targetGmfView = null;
	
	/**
	 * 
	 */
	public SourceViewRecorder() {
		// TODO Auto-generated constructor stub
	}

	public static void reset(){
		newElement = null;
		sourceView = null;
		sourceGmfView = null;
		targetView = null;
		targetGmfView = null;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.sirius.tools.api.ui.IExternalJavaAction#execute(java.util.Collection, java.util.Map)
	 */
	@Override
	public void execute(Collection<? extends EObject> selections,
			Map<String, Object> parameters) {
		if (selections.size() != 1) {
			return;
		}
		//EObject sourceElement = null;
		//DDiagram diagram = null;
		
		
		for (String key : parameters.keySet()){
			if ("sourceView".equals(key)){
				sourceView = (DNode)parameters.get(key);
				sourceGmfView = SiriusGMFHelper.getGmfNode(SourceViewRecorder.sourceView);
				System.err.println("sourceGmfView " + sourceGmfView);
			} else if ("createdView".equals(key)){
				targetView = (DNode)parameters.get(key);
				targetGmfView = SiriusGMFHelper.getGmfNode(SourceViewRecorder.sourceView);
				System.err.println("targetGmfView " + targetGmfView);
			} else if ("sourceElement".equals(key)){
				//sourceElement = (EObject) parameters.get(key);
			} else if ("newElement".equals(key)){
				newElement = (EObject) parameters.get(key);
			} else if ("diagram".equals(key)){
				//diagram = (DDiagram) parameters.get(key);
			}
		}
		
		return;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.sirius.tools.api.ui.IExternalJavaAction#canExecute(java.util.Collection)
	 */
	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

}
