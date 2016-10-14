/**
 */
package objinst.impl;

import objinst.Container0;
import objinst.Container01;
import objinst.ObjinstFactory;
import objinst.ObjinstPackage;
import objinst.Relation;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ObjinstFactoryImpl extends EFactoryImpl implements ObjinstFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ObjinstFactory init() {
		try {
			ObjinstFactory theObjinstFactory = (ObjinstFactory)EPackage.Registry.INSTANCE.getEFactory(ObjinstPackage.eNS_URI);
			if (theObjinstFactory != null) {
				return theObjinstFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ObjinstFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjinstFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ObjinstPackage.CONTAINER0: return createContainer0();
			case ObjinstPackage.CONTAINER01: return createContainer01();
			case ObjinstPackage.OBJECT: return createObject();
			case ObjinstPackage.RELATION: return createRelation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Container0 createContainer0() {
		Container0Impl container0 = new Container0Impl();
		return container0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Container01 createContainer01() {
		Container01Impl container01 = new Container01Impl();
		return container01;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public objinst.Object createObject() {
		ObjectImpl object = new ObjectImpl();
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation createRelation() {
		RelationImpl relation = new RelationImpl();
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjinstPackage getObjinstPackage() {
		return (ObjinstPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ObjinstPackage getPackage() {
		return ObjinstPackage.eINSTANCE;
	}

} //ObjinstFactoryImpl
