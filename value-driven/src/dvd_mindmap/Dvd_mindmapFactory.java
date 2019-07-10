/**
 */
package dvd_mindmap;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see dvd_mindmap.Dvd_mindmapPackage
 * @generated
 */
public interface Dvd_mindmapFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Dvd_mindmapFactory eINSTANCE = dvd_mindmap.impl.Dvd_mindmapFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Dynamic Value Description Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dynamic Value Description Model</em>'.
	 * @generated
	 */
	DynamicValueDescriptionModel createDynamicValueDescriptionModel();

	/**
	 * Returns a new object of class '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node</em>'.
	 * @generated
	 */
	Node createNode();

	/**
	 * Returns a new object of class '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edge</em>'.
	 * @generated
	 */
	Edge createEdge();

	/**
	 * Returns a new object of class '<em>Value Exchange</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Exchange</em>'.
	 * @generated
	 */
	ValueExchange createValueExchange();

	/**
	 * Returns a new object of class '<em>Out Value Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Out Value Port</em>'.
	 * @generated
	 */
	OutValuePort createOutValuePort();

	/**
	 * Returns a new object of class '<em>Value Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Object</em>'.
	 * @generated
	 */
	ValueObject createValueObject();

	/**
	 * Returns a new object of class '<em>Main Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Main Actor</em>'.
	 * @generated
	 */
	MainActor createMainActor();

	/**
	 * Returns a new object of class '<em>Environment Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Environment Actor</em>'.
	 * @generated
	 */
	EnvironmentActor createEnvironmentActor();

	/**
	 * Returns a new object of class '<em>Notation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Notation</em>'.
	 * @generated
	 */
	Notation createNotation();

	/**
	 * Returns a new object of class '<em>In Value Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>In Value Port</em>'.
	 * @generated
	 */
	InValuePort createInValuePort();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Dvd_mindmapPackage getDvd_mindmapPackage();

} //Dvd_mindmapFactory
