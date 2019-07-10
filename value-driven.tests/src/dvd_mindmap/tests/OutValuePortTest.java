/**
 */
package dvd_mindmap.tests;

import dvd_mindmap.Dvd_mindmapFactory;
import dvd_mindmap.OutValuePort;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Out Value Port</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OutValuePortTest extends NodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OutValuePortTest.class);
	}

	/**
	 * Constructs a new Out Value Port test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutValuePortTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Out Value Port test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OutValuePort getFixture() {
		return (OutValuePort)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Dvd_mindmapFactory.eINSTANCE.createOutValuePort());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //OutValuePortTest
