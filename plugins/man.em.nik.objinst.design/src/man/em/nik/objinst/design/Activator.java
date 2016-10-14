package man.em.nik.objinst.design;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.business.api.session.SessionManagerListener;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {
	// The plug-in ID
	public static final String PLUGIN_ID = "man.em.nik.objinst.design";

	// The shared instance
	private static Activator plugin;

	private static Set<Viewpoint> viewpoints; 

	private SessionManagerListener notifWhenSessionAreCreated;

	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		viewpoints = new HashSet<Viewpoint>();
		viewpoints.addAll(ViewpointRegistry.getInstance().registerFromPlugin(PLUGIN_ID + "/description/objinst.odesign")); 

		notifWhenSessionAreCreated = new SessionManagerListener.Stub() {

			@SuppressWarnings("unchecked")
			@Override
			public void notifyAddSession(Session newSession) {
				ResourceSet set = newSession.getTransactionalEditingDomain().getResourceSet();
				Map<URI, URI> result = null;
				// Invoke computePlatformURIMap by reflection because this API
				// change in EMF
				try {
					Method computePlatformURIMap = EcorePlugin.class.getMethod("computePlatformURIMap", Boolean.class);
					result = (Map<URI, URI>) computePlatformURIMap.invoke(null, true);
				} catch (NoSuchMethodException e) {
				} catch (IllegalAccessException e) {
				} catch (IllegalArgumentException e) {
				} catch (InvocationTargetException e) {
				}
				try {
					Method computePlatformURIMap = EcorePlugin.class.getMethod("computePlatformURIMap");
					result = (Map<URI, URI>) computePlatformURIMap.invoke(null);
				} catch (NoSuchMethodException e) {
				} catch (IllegalAccessException e) {
				} catch (IllegalArgumentException e) {
				} catch (InvocationTargetException e) {
				}

				if (result != null) {
					set.getURIConverter().getURIMap().putAll(result);
				} else {
					IStatus status = new Status(IStatus.WARNING, Activator.PLUGIN_ID,
							"The EMF API EcorePlugin.computePlatformURIMap has probably changed and is not supported yet by this plugin.");
					Activator.getDefault().getLog().log(status);

				}

				newSession.getEventBroker().addLocalTrigger(AutoDeactivateConflictingLayers.IS_LAYER_ACTIVATED, new AutoDeactivateConflictingLayers(newSession));
				newSession.getEventBroker().addLocalTrigger(AutoActivateFilter.IS_LAYER_ACTIVATED, new AutoActivateFilter(newSession));
				newSession.getEventBroker().addLocalTrigger(AutoSetPosition.IS_ELEMENT_ADDED, new AutoSetPosition(newSession));

			}
		};
		SessionManager.INSTANCE.addSessionsListener(notifWhenSessionAreCreated);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		if (viewpoints != null) {
			for (final Viewpoint viewpoint: viewpoints) {
				ViewpointRegistry.getInstance().disposeFromPlugin(viewpoint);
			}
			viewpoints.clear();
			viewpoints = null; 
		}
		if (notifWhenSessionAreCreated != null) {
			SessionManager.INSTANCE.removeSessionsListener(notifWhenSessionAreCreated);
		}
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}
}
