/**
 */
package dvd_mindmap;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dvd_mindmap.Node#getNodeID <em>Node ID</em>}</li>
 *   <li>{@link dvd_mindmap.Node#getVisualNotation <em>Visual Notation</em>}</li>
 *   <li>{@link dvd_mindmap.Node#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see dvd_mindmap.Dvd_mindmapPackage#getNode()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node ID</em>' attribute.
	 * @see #setNodeID(String)
	 * @see dvd_mindmap.Dvd_mindmapPackage#getNode_NodeID()
	 * @model id="true"
	 * @generated
	 */
	String getNodeID();

	/**
	 * Sets the value of the '{@link dvd_mindmap.Node#getNodeID <em>Node ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node ID</em>' attribute.
	 * @see #getNodeID()
	 * @generated
	 */
	void setNodeID(String value);

	/**
	 * Returns the value of the '<em><b>Visual Notation</b></em>' containment reference list.
	 * The list contents are of type {@link dvd_mindmap.Notation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visual Notation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visual Notation</em>' containment reference list.
	 * @see dvd_mindmap.Dvd_mindmapPackage#getNode_VisualNotation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Notation> getVisualNotation();

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
	 * @see dvd_mindmap.Dvd_mindmapPackage#getNode_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dvd_mindmap.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Node
