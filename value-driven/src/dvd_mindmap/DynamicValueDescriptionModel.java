/**
 */
package dvd_mindmap;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Value Description Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dvd_mindmap.DynamicValueDescriptionModel#getEdges <em>Edges</em>}</li>
 *   <li>{@link dvd_mindmap.DynamicValueDescriptionModel#getNodes <em>Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see dvd_mindmap.Dvd_mindmapPackage#getDynamicValueDescriptionModel()
 * @model
 * @generated
 */
public interface DynamicValueDescriptionModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
	 * The list contents are of type {@link dvd_mindmap.Edge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' containment reference list.
	 * @see dvd_mindmap.Dvd_mindmapPackage#getDynamicValueDescriptionModel_Edges()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Edge> getEdges();

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link dvd_mindmap.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see dvd_mindmap.Dvd_mindmapPackage#getDynamicValueDescriptionModel_Nodes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Node> getNodes();

} // DynamicValueDescriptionModel
