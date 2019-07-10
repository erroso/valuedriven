/**
 */
package dvd_mindmap;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Exchange</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dvd_mindmap.ValueExchange#getPriority <em>Priority</em>}</li>
 *   <li>{@link dvd_mindmap.ValueExchange#getValueLevelAgreement <em>Value Level Agreement</em>}</li>
 *   <li>{@link dvd_mindmap.ValueExchange#getEnvironmentActor <em>Environment Actor</em>}</li>
 *   <li>{@link dvd_mindmap.ValueExchange#getMainActor <em>Main Actor</em>}</li>
 *   <li>{@link dvd_mindmap.ValueExchange#getOutValuePort <em>Out Value Port</em>}</li>
 *   <li>{@link dvd_mindmap.ValueExchange#getInValuePort <em>In Value Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see dvd_mindmap.Dvd_mindmapPackage#getValueExchange()
 * @model
 * @generated
 */
public interface ValueExchange extends Node {
	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * The literals are from the enumeration {@link dvd_mindmap.EnumPriority}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see dvd_mindmap.EnumPriority
	 * @see #setPriority(EnumPriority)
	 * @see dvd_mindmap.Dvd_mindmapPackage#getValueExchange_Priority()
	 * @model
	 * @generated
	 */
	EnumPriority getPriority();

	/**
	 * Sets the value of the '{@link dvd_mindmap.ValueExchange#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see dvd_mindmap.EnumPriority
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(EnumPriority value);

	/**
	 * Returns the value of the '<em><b>Value Level Agreement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Level Agreement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Level Agreement</em>' attribute.
	 * @see #setValueLevelAgreement(String)
	 * @see dvd_mindmap.Dvd_mindmapPackage#getValueExchange_ValueLevelAgreement()
	 * @model
	 * @generated
	 */
	String getValueLevelAgreement();

	/**
	 * Sets the value of the '{@link dvd_mindmap.ValueExchange#getValueLevelAgreement <em>Value Level Agreement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Level Agreement</em>' attribute.
	 * @see #getValueLevelAgreement()
	 * @generated
	 */
	void setValueLevelAgreement(String value);

	/**
	 * Returns the value of the '<em><b>Environment Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Environment Actor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment Actor</em>' reference.
	 * @see #setEnvironmentActor(EnvironmentActor)
	 * @see dvd_mindmap.Dvd_mindmapPackage#getValueExchange_EnvironmentActor()
	 * @model required="true"
	 * @generated
	 */
	EnvironmentActor getEnvironmentActor();

	/**
	 * Sets the value of the '{@link dvd_mindmap.ValueExchange#getEnvironmentActor <em>Environment Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment Actor</em>' reference.
	 * @see #getEnvironmentActor()
	 * @generated
	 */
	void setEnvironmentActor(EnvironmentActor value);

	/**
	 * Returns the value of the '<em><b>Main Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Actor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Actor</em>' reference.
	 * @see #setMainActor(MainActor)
	 * @see dvd_mindmap.Dvd_mindmapPackage#getValueExchange_MainActor()
	 * @model required="true"
	 * @generated
	 */
	MainActor getMainActor();

	/**
	 * Sets the value of the '{@link dvd_mindmap.ValueExchange#getMainActor <em>Main Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Actor</em>' reference.
	 * @see #getMainActor()
	 * @generated
	 */
	void setMainActor(MainActor value);

	/**
	 * Returns the value of the '<em><b>Out Value Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Value Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Value Port</em>' reference.
	 * @see #setOutValuePort(OutValuePort)
	 * @see dvd_mindmap.Dvd_mindmapPackage#getValueExchange_OutValuePort()
	 * @model required="true"
	 * @generated
	 */
	OutValuePort getOutValuePort();

	/**
	 * Sets the value of the '{@link dvd_mindmap.ValueExchange#getOutValuePort <em>Out Value Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Value Port</em>' reference.
	 * @see #getOutValuePort()
	 * @generated
	 */
	void setOutValuePort(OutValuePort value);

	/**
	 * Returns the value of the '<em><b>In Value Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Value Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Value Port</em>' reference.
	 * @see #setInValuePort(InValuePort)
	 * @see dvd_mindmap.Dvd_mindmapPackage#getValueExchange_InValuePort()
	 * @model required="true"
	 * @generated
	 */
	InValuePort getInValuePort();

	/**
	 * Sets the value of the '{@link dvd_mindmap.ValueExchange#getInValuePort <em>In Value Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Value Port</em>' reference.
	 * @see #getInValuePort()
	 * @generated
	 */
	void setInValuePort(InValuePort value);

} // ValueExchange
