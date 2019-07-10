/**
 */
package dvd_mindmap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Notation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dvd_mindmap.Notation#getNotationID <em>Notation ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see dvd_mindmap.Dvd_mindmapPackage#getNotation()
 * @model
 * @generated
 */
public interface Notation extends EObject {
	/**
	 * Returns the value of the '<em><b>Notation ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notation ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notation ID</em>' attribute.
	 * @see #setNotationID(String)
	 * @see dvd_mindmap.Dvd_mindmapPackage#getNotation_NotationID()
	 * @model id="true" required="true" ordered="false"
	 * @generated
	 */
	String getNotationID();

	/**
	 * Sets the value of the '{@link dvd_mindmap.Notation#getNotationID <em>Notation ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notation ID</em>' attribute.
	 * @see #getNotationID()
	 * @generated
	 */
	void setNotationID(String value);

} // Notation
