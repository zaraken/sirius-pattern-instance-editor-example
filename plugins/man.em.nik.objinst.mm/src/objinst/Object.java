/**
 */
package objinst;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link objinst.Object#getInstanceType <em>Instance Type</em>}</li>
 *   <li>{@link objinst.Object#getReferencedBy <em>Referenced By</em>}</li>
 *   <li>{@link objinst.Object#getRelations <em>Relations</em>}</li>
 *   <li>{@link objinst.Object#getName <em>Name</em>}</li>
 *   <li>{@link objinst.Object#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see objinst.ObjinstPackage#getObject()
 * @model
 * @generated
 */
public interface Object extends EObject {
	/**
	 * Returns the value of the '<em><b>Instance Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link objinst.Object#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Type</em>' reference.
	 * @see #setInstanceType(Object)
	 * @see objinst.ObjinstPackage#getObject_InstanceType()
	 * @see objinst.Object#getChildren
	 * @model opposite="children"
	 * @generated
	 */
	Object getInstanceType();

	/**
	 * Sets the value of the '{@link objinst.Object#getInstanceType <em>Instance Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Type</em>' reference.
	 * @see #getInstanceType()
	 * @generated
	 */
	void setInstanceType(Object value);

	/**
	 * Returns the value of the '<em><b>Referenced By</b></em>' reference list.
	 * The list contents are of type {@link objinst.Relation}.
	 * It is bidirectional and its opposite is '{@link objinst.Relation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced By</em>' reference list.
	 * @see objinst.ObjinstPackage#getObject_ReferencedBy()
	 * @see objinst.Relation#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Relation> getReferencedBy();

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link objinst.Relation}.
	 * It is bidirectional and its opposite is '{@link objinst.Relation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relations</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see objinst.ObjinstPackage#getObject_Relations()
	 * @see objinst.Relation#getSource
	 * @model opposite="source" containment="true"
	 * @generated
	 */
	EList<Relation> getRelations();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see objinst.ObjinstPackage#getObject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link objinst.Object#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link objinst.Object}.
	 * It is bidirectional and its opposite is '{@link objinst.Object#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see objinst.ObjinstPackage#getObject_Children()
	 * @see objinst.Object#getInstanceType
	 * @model opposite="instanceType"
	 * @generated
	 */
	EList<Object> getChildren();

} // Object
