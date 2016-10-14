/**
 */
package objinst;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container01</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link objinst.Container01#getObjects <em>Objects</em>}</li>
 *   <li>{@link objinst.Container01#getInstances <em>Instances</em>}</li>
 * </ul>
 *
 * @see objinst.ObjinstPackage#getContainer01()
 * @model
 * @generated
 */
public interface Container01 extends EObject {
	/**
	 * Returns the value of the '<em><b>Objects</b></em>' containment reference list.
	 * The list contents are of type {@link objinst.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects</em>' containment reference list.
	 * @see objinst.ObjinstPackage#getContainer01_Objects()
	 * @model containment="true"
	 * @generated
	 */
	EList<objinst.Object> getObjects();

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' containment reference list.
	 * The list contents are of type {@link objinst.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' containment reference list.
	 * @see objinst.ObjinstPackage#getContainer01_Instances()
	 * @model containment="true"
	 * @generated
	 */
	EList<objinst.Object> getInstances();

} // Container01
