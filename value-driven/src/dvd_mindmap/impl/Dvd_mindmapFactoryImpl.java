/**
 */
package dvd_mindmap.impl;

import dvd_mindmap.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Dvd_mindmapFactoryImpl extends EFactoryImpl implements Dvd_mindmapFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Dvd_mindmapFactory init() {
		try {
			Dvd_mindmapFactory theDvd_mindmapFactory = (Dvd_mindmapFactory)EPackage.Registry.INSTANCE.getEFactory(Dvd_mindmapPackage.eNS_URI);
			if (theDvd_mindmapFactory != null) {
				return theDvd_mindmapFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Dvd_mindmapFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dvd_mindmapFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Dvd_mindmapPackage.DYNAMIC_VALUE_DESCRIPTION_MODEL: return createDynamicValueDescriptionModel();
			case Dvd_mindmapPackage.NODE: return createNode();
			case Dvd_mindmapPackage.EDGE: return createEdge();
			case Dvd_mindmapPackage.VALUE_EXCHANGE: return createValueExchange();
			case Dvd_mindmapPackage.OUT_VALUE_PORT: return createOutValuePort();
			case Dvd_mindmapPackage.VALUE_OBJECT: return createValueObject();
			case Dvd_mindmapPackage.MAIN_ACTOR: return createMainActor();
			case Dvd_mindmapPackage.ENVIRONMENT_ACTOR: return createEnvironmentActor();
			case Dvd_mindmapPackage.NOTATION: return createNotation();
			case Dvd_mindmapPackage.IN_VALUE_PORT: return createInValuePort();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Dvd_mindmapPackage.ENUM_PRIORITY:
				return createEnumPriorityFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Dvd_mindmapPackage.ENUM_PRIORITY:
				return convertEnumPriorityToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicValueDescriptionModel createDynamicValueDescriptionModel() {
		DynamicValueDescriptionModelImpl dynamicValueDescriptionModel = new DynamicValueDescriptionModelImpl();
		return dynamicValueDescriptionModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edge createEdge() {
		EdgeImpl edge = new EdgeImpl();
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueExchange createValueExchange() {
		ValueExchangeImpl valueExchange = new ValueExchangeImpl();
		return valueExchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutValuePort createOutValuePort() {
		OutValuePortImpl outValuePort = new OutValuePortImpl();
		return outValuePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueObject createValueObject() {
		ValueObjectImpl valueObject = new ValueObjectImpl();
		return valueObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainActor createMainActor() {
		MainActorImpl mainActor = new MainActorImpl();
		return mainActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentActor createEnvironmentActor() {
		EnvironmentActorImpl environmentActor = new EnvironmentActorImpl();
		return environmentActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Notation createNotation() {
		NotationImpl notation = new NotationImpl();
		return notation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InValuePort createInValuePort() {
		InValuePortImpl inValuePort = new InValuePortImpl();
		return inValuePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumPriority createEnumPriorityFromString(EDataType eDataType, String initialValue) {
		EnumPriority result = EnumPriority.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumPriorityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dvd_mindmapPackage getDvd_mindmapPackage() {
		return (Dvd_mindmapPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Dvd_mindmapPackage getPackage() {
		return Dvd_mindmapPackage.eINSTANCE;
	}

} //Dvd_mindmapFactoryImpl
