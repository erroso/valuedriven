/**
 */
package dvd_mindmap.tests;

import dvd_mindmap.Dvd_mindmapFactory;
import dvd_mindmap.ValueObject;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Value Object</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ValueObjectTest extends NodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ValueObjectTest.class);
	}

	/**
	 * Constructs a new Value Object test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueObjectTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Value Object test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ValueObject getFixture() {
		return (ValueObject)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Dvd_mindmapFactory.eINSTANCE.createValueObject());
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

} //ValueObjectTest
