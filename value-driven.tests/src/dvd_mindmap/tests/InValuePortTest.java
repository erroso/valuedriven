/**
 */
package dvd_mindmap.tests;

import dvd_mindmap.Dvd_mindmapFactory;
import dvd_mindmap.InValuePort;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>In Value Port</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InValuePortTest extends NodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InValuePortTest.class);
	}

	/**
	 * Constructs a new In Value Port test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InValuePortTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this In Value Port test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InValuePort getFixture() {
		return (InValuePort)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Dvd_mindmapFactory.eINSTANCE.createInValuePort());
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

} //InValuePortTest
