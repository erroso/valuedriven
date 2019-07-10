/**
 */
package dvd_mindmap;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>In Value Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dvd_mindmap.InValuePort#getBelongsToValueExchange <em>Belongs To Value Exchange</em>}</li>
 *   <li>{@link dvd_mindmap.InValuePort#getValueObject <em>Value Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see dvd_mindmap.Dvd_mindmapPackage#getInValuePort()
 * @model
 * @generated
 */
public interface InValuePort extends Node {
	/**
	 * Returns the value of the '<em><b>Belongs To Value Exchange</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Belongs To Value Exchange</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belongs To Value Exchange</em>' reference.
	 * @see #setBelongsToValueExchange(ValueExchange)
	 * @see dvd_mindmap.Dvd_mindmapPackage#getInValuePort_BelongsToValueExchange()
	 * @model required="true"
	 * @generated
	 */
	ValueExchange getBelongsToValueExchange();

	/**
	 * Sets the value of the '{@link dvd_mindmap.InValuePort#getBelongsToValueExchange <em>Belongs To Value Exchange</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Belongs To Value Exchange</em>' reference.
	 * @see #getBelongsToValueExchange()
	 * @generated
	 */
	void setBelongsToValueExchange(ValueExchange value);

	/**
	 * Returns the value of the '<em><b>Value Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Object</em>' reference.
	 * @see #setValueObject(ValueObject)
	 * @see dvd_mindmap.Dvd_mindmapPackage#getInValuePort_ValueObject()
	 * @model required="true"
	 * @generated
	 */
	ValueObject getValueObject();

	/**
	 * Sets the value of the '{@link dvd_mindmap.InValuePort#getValueObject <em>Value Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Object</em>' reference.
	 * @see #getValueObject()
	 * @generated
	 */
	void setValueObject(ValueObject value);

} // InValuePort
