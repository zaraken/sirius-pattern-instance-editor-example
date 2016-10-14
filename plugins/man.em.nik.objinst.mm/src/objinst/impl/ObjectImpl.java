/**
 */
package objinst.impl;

import java.util.Collection;
import objinst.ObjinstPackage;
import objinst.Relation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link objinst.impl.ObjectImpl#getInstanceType <em>Instance Type</em>}</li>
 *   <li>{@link objinst.impl.ObjectImpl#getReferencedBy <em>Referenced By</em>}</li>
 *   <li>{@link objinst.impl.ObjectImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link objinst.impl.ObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link objinst.impl.ObjectImpl#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectImpl extends MinimalEObjectImpl.Container implements objinst.Object {
	/**
	 * The cached value of the '{@link #getInstanceType() <em>Instance Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceType()
	 * @generated
	 * @ordered
	 */
	protected objinst.Object instanceType;

	/**
	 * The cached value of the '{@link #getReferencedBy() <em>Referenced By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> referencedBy;

	/**
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> relations;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<objinst.Object> children;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ObjinstPackage.Literals.OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public objinst.Object getInstanceType() {
		if (instanceType != null && instanceType.eIsProxy()) {
			InternalEObject oldInstanceType = (InternalEObject)instanceType;
			instanceType = (objinst.Object)eResolveProxy(oldInstanceType);
			if (instanceType != oldInstanceType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ObjinstPackage.OBJECT__INSTANCE_TYPE, oldInstanceType, instanceType));
			}
		}
		return instanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public objinst.Object basicGetInstanceType() {
		return instanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstanceType(objinst.Object newInstanceType, NotificationChain msgs) {
		objinst.Object oldInstanceType = instanceType;
		instanceType = newInstanceType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ObjinstPackage.OBJECT__INSTANCE_TYPE, oldInstanceType, newInstanceType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceType(objinst.Object newInstanceType) {
		if (newInstanceType != instanceType) {
			NotificationChain msgs = null;
			if (instanceType != null)
				msgs = ((InternalEObject)instanceType).eInverseRemove(this, ObjinstPackage.OBJECT__CHILDREN, objinst.Object.class, msgs);
			if (newInstanceType != null)
				msgs = ((InternalEObject)newInstanceType).eInverseAdd(this, ObjinstPackage.OBJECT__CHILDREN, objinst.Object.class, msgs);
			msgs = basicSetInstanceType(newInstanceType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObjinstPackage.OBJECT__INSTANCE_TYPE, newInstanceType, newInstanceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getReferencedBy() {
		if (referencedBy == null) {
			referencedBy = new EObjectWithInverseResolvingEList<Relation>(Relation.class, this, ObjinstPackage.OBJECT__REFERENCED_BY, ObjinstPackage.RELATION__TARGET);
		}
		return referencedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getRelations() {
		if (relations == null) {
			relations = new EObjectContainmentWithInverseEList<Relation>(Relation.class, this, ObjinstPackage.OBJECT__RELATIONS, ObjinstPackage.RELATION__SOURCE);
		}
		return relations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObjinstPackage.OBJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<objinst.Object> getChildren() {
		if (children == null) {
			children = new EObjectWithInverseResolvingEList<objinst.Object>(objinst.Object.class, this, ObjinstPackage.OBJECT__CHILDREN, ObjinstPackage.OBJECT__INSTANCE_TYPE);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ObjinstPackage.OBJECT__INSTANCE_TYPE:
				if (instanceType != null)
					msgs = ((InternalEObject)instanceType).eInverseRemove(this, ObjinstPackage.OBJECT__CHILDREN, objinst.Object.class, msgs);
				return basicSetInstanceType((objinst.Object)otherEnd, msgs);
			case ObjinstPackage.OBJECT__REFERENCED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencedBy()).basicAdd(otherEnd, msgs);
			case ObjinstPackage.OBJECT__RELATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRelations()).basicAdd(otherEnd, msgs);
			case ObjinstPackage.OBJECT__CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ObjinstPackage.OBJECT__INSTANCE_TYPE:
				return basicSetInstanceType(null, msgs);
			case ObjinstPackage.OBJECT__REFERENCED_BY:
				return ((InternalEList<?>)getReferencedBy()).basicRemove(otherEnd, msgs);
			case ObjinstPackage.OBJECT__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
			case ObjinstPackage.OBJECT__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
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
			case ObjinstPackage.OBJECT__INSTANCE_TYPE:
				if (resolve) return getInstanceType();
				return basicGetInstanceType();
			case ObjinstPackage.OBJECT__REFERENCED_BY:
				return getReferencedBy();
			case ObjinstPackage.OBJECT__RELATIONS:
				return getRelations();
			case ObjinstPackage.OBJECT__NAME:
				return getName();
			case ObjinstPackage.OBJECT__CHILDREN:
				return getChildren();
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
			case ObjinstPackage.OBJECT__INSTANCE_TYPE:
				setInstanceType((objinst.Object)newValue);
				return;
			case ObjinstPackage.OBJECT__REFERENCED_BY:
				getReferencedBy().clear();
				getReferencedBy().addAll((Collection<? extends Relation>)newValue);
				return;
			case ObjinstPackage.OBJECT__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends Relation>)newValue);
				return;
			case ObjinstPackage.OBJECT__NAME:
				setName((String)newValue);
				return;
			case ObjinstPackage.OBJECT__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends objinst.Object>)newValue);
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
			case ObjinstPackage.OBJECT__INSTANCE_TYPE:
				setInstanceType((objinst.Object)null);
				return;
			case ObjinstPackage.OBJECT__REFERENCED_BY:
				getReferencedBy().clear();
				return;
			case ObjinstPackage.OBJECT__RELATIONS:
				getRelations().clear();
				return;
			case ObjinstPackage.OBJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ObjinstPackage.OBJECT__CHILDREN:
				getChildren().clear();
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
			case ObjinstPackage.OBJECT__INSTANCE_TYPE:
				return instanceType != null;
			case ObjinstPackage.OBJECT__REFERENCED_BY:
				return referencedBy != null && !referencedBy.isEmpty();
			case ObjinstPackage.OBJECT__RELATIONS:
				return relations != null && !relations.isEmpty();
			case ObjinstPackage.OBJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ObjinstPackage.OBJECT__CHILDREN:
				return children != null && !children.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ObjectImpl
