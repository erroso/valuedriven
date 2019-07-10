/**
 */
package dvd_mindmap.tests;

import dvd_mindmap.Dvd_mindmapFactory;
import dvd_mindmap.ValueExchange;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Value Exchange</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ValueExchangeTest extends NodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ValueExchangeTest.class);
	}

	/**
	 * Constructs a new Value Exchange test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueExchangeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Value Exchange test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ValueExchange getFixture() {
		return (ValueExchange)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Dvd_mindmapFactory.eINSTANCE.createValueExchange());
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

} //ValueExchangeTest
