/**
 */
package objinst;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see objinst.ObjinstFactory
 * @model kind="package"
 * @generated
 */
public interface ObjinstPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "objinst";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://nik.em.man/objinstmm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "objinst";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ObjinstPackage eINSTANCE = objinst.impl.ObjinstPackageImpl.init();

	/**
	 * The meta object id for the '{@link objinst.impl.Container0Impl <em>Container0</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see objinst.impl.Container0Impl
	 * @see objinst.impl.ObjinstPackageImpl#getContainer0()
	 * @generated
	 */
	int CONTAINER0 = 0;

	/**
	 * The feature id for the '<em><b>Container01</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER0__CONTAINER01 = 0;

	/**
	 * The number of structural features of the '<em>Container0</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER0_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Container0</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER0_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link objinst.impl.Container01Impl <em>Container01</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see objinst.impl.Container01Impl
	 * @see objinst.impl.ObjinstPackageImpl#getContainer01()
	 * @generated
	 */
	int CONTAINER01 = 1;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER01__OBJECTS = 0;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER01__INSTANCES = 1;

	/**
	 * The number of structural features of the '<em>Container01</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER01_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Container01</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER01_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link objinst.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see objinst.impl.ObjectImpl
	 * @see objinst.impl.ObjinstPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__INSTANCE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Referenced By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__REFERENCED_BY = 1;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__RELATIONS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__NAME = 3;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__CHILDREN = 4;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link objinst.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see objinst.impl.RelationImpl
	 * @see objinst.impl.ObjinstPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NAME = 2;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link objinst.Container0 <em>Container0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container0</em>'.
	 * @see objinst.Container0
	 * @generated
	 */
	EClass getContainer0();

	/**
	 * Returns the meta object for the containment reference list '{@link objinst.Container0#getContainer01 <em>Container01</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Container01</em>'.
	 * @see objinst.Container0#getContainer01()
	 * @see #getContainer0()
	 * @generated
	 */
	EReference getContainer0_Container01();

	/**
	 * Returns the meta object for class '{@link objinst.Container01 <em>Container01</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container01</em>'.
	 * @see objinst.Container01
	 * @generated
	 */
	EClass getContainer01();

	/**
	 * Returns the meta object for the containment reference list '{@link objinst.Container01#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objects</em>'.
	 * @see objinst.Container01#getObjects()
	 * @see #getContainer01()
	 * @generated
	 */
	EReference getContainer01_Objects();

	/**
	 * Returns the meta object for the containment reference list '{@link objinst.Container01#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instances</em>'.
	 * @see objinst.Container01#getInstances()
	 * @see #getContainer01()
	 * @generated
	 */
	EReference getContainer01_Instances();

	/**
	 * Returns the meta object for class '{@link objinst.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see objinst.Object
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for the reference '{@link objinst.Object#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance Type</em>'.
	 * @see objinst.Object#getInstanceType()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_InstanceType();

	/**
	 * Returns the meta object for the reference list '{@link objinst.Object#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced By</em>'.
	 * @see objinst.Object#getReferencedBy()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_ReferencedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link objinst.Object#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see objinst.Object#getRelations()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Relations();

	/**
	 * Returns the meta object for the attribute '{@link objinst.Object#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see objinst.Object#getName()
	 * @see #getObject()
	 * @generated
	 */
	EAttribute getObject_Name();

	/**
	 * Returns the meta object for the reference list '{@link objinst.Object#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see objinst.Object#getChildren()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Children();

	/**
	 * Returns the meta object for class '{@link objinst.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see objinst.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the reference '{@link objinst.Relation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see objinst.Relation#getTarget()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Target();

	/**
	 * Returns the meta object for the container reference '{@link objinst.Relation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source</em>'.
	 * @see objinst.Relation#getSource()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Source();

	/**
	 * Returns the meta object for the attribute '{@link objinst.Relation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see objinst.Relation#getName()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ObjinstFactory getObjinstFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link objinst.impl.Container0Impl <em>Container0</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see objinst.impl.Container0Impl
		 * @see objinst.impl.ObjinstPackageImpl#getContainer0()
		 * @generated
		 */
		EClass CONTAINER0 = eINSTANCE.getContainer0();

		/**
		 * The meta object literal for the '<em><b>Container01</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER0__CONTAINER01 = eINSTANCE.getContainer0_Container01();

		/**
		 * The meta object literal for the '{@link objinst.impl.Container01Impl <em>Container01</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see objinst.impl.Container01Impl
		 * @see objinst.impl.ObjinstPackageImpl#getContainer01()
		 * @generated
		 */
		EClass CONTAINER01 = eINSTANCE.getContainer01();

		/**
		 * The meta object literal for the '<em><b>Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER01__OBJECTS = eINSTANCE.getContainer01_Objects();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER01__INSTANCES = eINSTANCE.getContainer01_Instances();

		/**
		 * The meta object literal for the '{@link objinst.impl.ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see objinst.impl.ObjectImpl
		 * @see objinst.impl.ObjinstPackageImpl#getObject()
		 * @generated
		 */
		EClass OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '<em><b>Instance Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__INSTANCE_TYPE = eINSTANCE.getObject_InstanceType();

		/**
		 * The meta object literal for the '<em><b>Referenced By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__REFERENCED_BY = eINSTANCE.getObject_ReferencedBy();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__RELATIONS = eINSTANCE.getObject_Relations();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT__NAME = eINSTANCE.getObject_Name();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__CHILDREN = eINSTANCE.getObject_Children();

		/**
		 * The meta object literal for the '{@link objinst.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see objinst.impl.RelationImpl
		 * @see objinst.impl.ObjinstPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__TARGET = eINSTANCE.getRelation_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__SOURCE = eINSTANCE.getRelation_Source();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__NAME = eINSTANCE.getRelation_Name();

	}

} //ObjinstPackage
