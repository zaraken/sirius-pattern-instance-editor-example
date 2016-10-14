/**
 */
package objinst.impl;

import java.util.Collection;

import objinst.Container0;
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
 * An implementation of the model object '<em><b>Container0</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link objinst.impl.Container0Impl#getContainer01 <em>Container01</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Container0Impl extends MinimalEObjectImpl.Container implements Container0 {
	/**
	 * The cached value of the '{@link #getContainer01() <em>Container01</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer01()
	 * @generated
	 * @ordered
	 */
	protected EList<Container01> container01;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Container0Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ObjinstPackage.Literals.CONTAINER0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Container01> getContainer01() {
		if (container01 == null) {
			container01 = new EObjectContainmentEList<Container01>(Container01.class, this, ObjinstPackage.CONTAINER0__CONTAINER01);
		}
		return container01;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ObjinstPackage.CONTAINER0__CONTAINER01:
				return ((InternalEList<?>)getContainer01()).basicRemove(otherEnd, msgs);
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
			case ObjinstPackage.CONTAINER0__CONTAINER01:
				return getContainer01();
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
			case ObjinstPackage.CONTAINER0__CONTAINER01:
				getContainer01().clear();
				getContainer01().addAll((Collection<? extends Container01>)newValue);
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
			case ObjinstPackage.CONTAINER0__CONTAINER01:
				getContainer01().clear();
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
			case ObjinstPackage.CONTAINER0__CONTAINER01:
				return container01 != null && !container01.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Container0Impl
