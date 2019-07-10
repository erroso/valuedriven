/**
 */
package dvd_mindmap.tests;

import dvd_mindmap.Dvd_mindmapFactory;
import dvd_mindmap.MainActor;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Main Actor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MainActorTest extends NodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MainActorTest.class);
	}

	/**
	 * Constructs a new Main Actor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainActorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Main Actor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MainActor getFixture() {
		return (MainActor)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Dvd_mindmapFactory.eINSTANCE.createMainActor());
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

} //MainActorTest
