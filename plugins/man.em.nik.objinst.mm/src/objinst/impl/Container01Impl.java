/**
 */
package objinst.impl;

import java.util.Collection;

import objinst.Container01;
import objinst.ObjinstPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container01</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link objinst.impl.Container01Impl#getObjects <em>Objects</em>}</li>
 *   <li>{@link objinst.impl.Container01Impl#getInstances <em>Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Container01Impl extends MinimalEObjectImpl.Container implements Container01 {
	/**
	 * The cached value of the '{@link #getObjects() <em>Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<objinst.Object> objects;

	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<objinst.Object> instances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Container01Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ObjinstPackage.Literals.CONTAINER01;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<objinst.Object> getObjects() {
		if (objects == null) {
			objects = new EObjectContainmentEList<objinst.Object>(objinst.Object.class, this, ObjinstPackage.CONTAINER01__OBJECTS);
		}
		return objects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<objinst.Object> getInstances() {
		if (instances == null) {
			instances = new EObjectContainmentEList<objinst.Object>(objinst.Object.class, this, ObjinstPackage.CONTAINER01__INSTANCES);
		}
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ObjinstPackage.CONTAINER01__OBJECTS:
				return ((InternalEList<?>)getObjects()).basicRemove(otherEnd, msgs);
			case ObjinstPackage.CONTAINER01__INSTANCES:
				return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ObjinstPackage.CONTAINER01__OBJECTS:
				return getObjects();
			case ObjinstPackage.CONTAINER01__INSTANCES:
				return getInstances();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ObjinstPackage.CONTAINER01__OBJECTS:
				getObjects().clear();
				getObjects().addAll((Collection<? extends objinst.Object>)newValue);
				return;
			case ObjinstPackage.CONTAINER01__INSTANCES:
				getInstances().clear();
				getInstances().addAll((Collection<? extends objinst.Object>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ObjinstPackage.CONTAINER01__OBJECTS:
				getObjects().clear();
				return;
			case ObjinstPackage.CONTAINER01__INSTANCES:
				getInstances().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ObjinstPackage.CONTAINER01__OBJECTS:
				return objects != null && !objects.isEmpty();
			case ObjinstPackage.CONTAINER01__INSTANCES:
				return instances != null && !instances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Container01Impl
