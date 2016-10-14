/**
 */
package objinst;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see objinst.ObjinstPackage
 * @generated
 */
public interface ObjinstFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ObjinstFactory eINSTANCE = objinst.impl.ObjinstFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Container0</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container0</em>'.
	 * @generated
	 */
	Container0 createContainer0();

	/**
	 * Returns a new object of class '<em>Container01</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container01</em>'.
	 * @generated
	 */
	Container01 createContainer01();

	/**
	 * Returns a new object of class '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object</em>'.
	 * @generated
	 */
	Object createObject();

	/**
	 * Returns a new object of class '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation</em>'.
	 * @generated
	 */
	Relation createRelation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ObjinstPackage getObjinstPackage();

} //ObjinstFactory
