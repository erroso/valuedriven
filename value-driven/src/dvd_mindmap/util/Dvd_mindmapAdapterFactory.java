/**
 */
package dvd_mindmap.util;

import dvd_mindmap.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dvd_mindmap.Dvd_mindmapPackage
 * @generated
 */
public class Dvd_mindmapAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Dvd_mindmapPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dvd_mindmapAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Dvd_mindmapPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Dvd_mindmapSwitch<Adapter> modelSwitch =
		new Dvd_mindmapSwitch<Adapter>() {
			@Override
			public Adapter caseDynamicValueDescriptionModel(DynamicValueDescriptionModel object) {
				return createDynamicValueDescriptionModelAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseEdge(Edge object) {
				return createEdgeAdapter();
			}
			@Override
			public Adapter caseValueExchange(ValueExchange object) {
				return createValueExchangeAdapter();
			}
			@Override
			public Adapter caseOutValuePort(OutValuePort object) {
				return createOutValuePortAdapter();
			}
			@Override
			public Adapter caseValueObject(ValueObject object) {
				return createValueObjectAdapter();
			}
			@Override
			public Adapter caseMainActor(MainActor object) {
				return createMainActorAdapter();
			}
			@Override
			public Adapter caseEnvironmentActor(EnvironmentActor object) {
				return createEnvironmentActorAdapter();
			}
			@Override
			public Adapter caseNotation(Notation object) {
				return createNotationAdapter();
			}
			@Override
			public Adapter caseInValuePort(InValuePort object) {
				return createInValuePortAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link dvd_mindmap.DynamicValueDescriptionModel <em>Dynamic Value Description Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dvd_mindmap.DynamicValueDescriptionModel
	 * @generated
	 */
	public Adapter createDynamicValueDescriptionModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dvd_mindmap.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dvd_mindmap.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dvd_mindmap.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dvd_mindmap.Edge
	 * @generated
	 */
	public Adapter createEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dvd_mindmap.ValueExchange <em>Value Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dvd_mindmap.ValueExchange
	 * @generated
	 */
	public Adapter createValueExchangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dvd_mindmap.OutValuePort <em>Out Value Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dvd_mindmap.OutValuePort
	 * @generated
	 */
	public Adapter createOutValuePortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dvd_mindmap.ValueObject <em>Value Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dvd_mindmap.ValueObject
	 * @generated
	 */
	public Adapter createValueObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dvd_mindmap.MainActor <em>Main Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dvd_mindmap.MainActor
	 * @generated
	 */
	public Adapter createMainActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dvd_mindmap.EnvironmentActor <em>Environment Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dvd_mindmap.EnvironmentActor
	 * @generated
	 */
	public Adapter createEnvironmentActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dvd_mindmap.Notation <em>Notation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dvd_mindmap.Notation
	 * @generated
	 */
	public Adapter createNotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dvd_mindmap.InValuePort <em>In Value Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dvd_mindmap.InValuePort
	 * @generated
	 */
	public Adapter createInValuePortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Dvd_mindmapAdapterFactory
