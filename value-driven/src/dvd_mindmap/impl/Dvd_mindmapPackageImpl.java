/**
 */
package dvd_mindmap.impl;

import dvd_mindmap.Dvd_mindmapFactory;
import dvd_mindmap.Dvd_mindmapPackage;
import dvd_mindmap.DynamicValueDescriptionModel;
import dvd_mindmap.Edge;
import dvd_mindmap.EnumPriority;
import dvd_mindmap.EnvironmentActor;
import dvd_mindmap.InValuePort;
import dvd_mindmap.MainActor;
import dvd_mindmap.Node;
import dvd_mindmap.Notation;
import dvd_mindmap.OutValuePort;
import dvd_mindmap.ValueExchange;
import dvd_mindmap.ValueObject;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Dvd_mindmapPackageImpl extends EPackageImpl implements Dvd_mindmapPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicValueDescriptionModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueExchangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outValuePortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mainActorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentActorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inValuePortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumPriorityEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see dvd_mindmap.Dvd_mindmapPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Dvd_mindmapPackageImpl() {
		super(eNS_URI, Dvd_mindmapFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Dvd_mindmapPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Dvd_mindmapPackage init() {
		if (isInited) return (Dvd_mindmapPackage)EPackage.Registry.INSTANCE.getEPackage(Dvd_mindmapPackage.eNS_URI);

		// Obtain or create and register package
		Dvd_mindmapPackageImpl theDvd_mindmapPackage = (Dvd_mindmapPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Dvd_mindmapPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Dvd_mindmapPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDvd_mindmapPackage.createPackageContents();

		// Initialize created meta-data
		theDvd_mindmapPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDvd_mindmapPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Dvd_mindmapPackage.eNS_URI, theDvd_mindmapPackage);
		return theDvd_mindmapPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynamicValueDescriptionModel() {
		return dynamicValueDescriptionModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicValueDescriptionModel_Edges() {
		return (EReference)dynamicValueDescriptionModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicValueDescriptionModel_Nodes() {
		return (EReference)dynamicValueDescriptionModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_NodeID() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_VisualNotation() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Name() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdge() {
		return edgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdge_Source() {
		return (EReference)edgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdge_Target() {
		return (EReference)edgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueExchange() {
		return valueExchangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueExchange_Priority() {
		return (EAttribute)valueExchangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueExchange_ValueLevelAgreement() {
		return (EAttribute)valueExchangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueExchange_EnvironmentActor() {
		return (EReference)valueExchangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueExchange_MainActor() {
		return (EReference)valueExchangeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueExchange_OutValuePort() {
		return (EReference)valueExchangeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueExchange_InValuePort() {
		return (EReference)valueExchangeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutValuePort() {
		return outValuePortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutValuePort_BelongsToValueExchange() {
		return (EReference)outValuePortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutValuePort_ValueObject() {
		return (EReference)outValuePortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueObject() {
		return valueObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMainActor() {
		return mainActorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMainActor_BelongsToValueExchange() {
		return (EReference)mainActorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvironmentActor() {
		return environmentActorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvironmentActor_BelongsToValueExchange() {
		return (EReference)environmentActorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotation() {
		return notationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotation_NotationID() {
		return (EAttribute)notationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInValuePort() {
		return inValuePortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInValuePort_BelongsToValueExchange() {
		return (EReference)inValuePortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInValuePort_ValueObject() {
		return (EReference)inValuePortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumPriority() {
		return enumPriorityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dvd_mindmapFactory getDvd_mindmapFactory() {
		return (Dvd_mindmapFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		dynamicValueDescriptionModelEClass = createEClass(DYNAMIC_VALUE_DESCRIPTION_MODEL);
		createEReference(dynamicValueDescriptionModelEClass, DYNAMIC_VALUE_DESCRIPTION_MODEL__EDGES);
		createEReference(dynamicValueDescriptionModelEClass, DYNAMIC_VALUE_DESCRIPTION_MODEL__NODES);

		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__NODE_ID);
		createEReference(nodeEClass, NODE__VISUAL_NOTATION);
		createEAttribute(nodeEClass, NODE__NAME);

		edgeEClass = createEClass(EDGE);
		createEReference(edgeEClass, EDGE__SOURCE);
		createEReference(edgeEClass, EDGE__TARGET);

		valueExchangeEClass = createEClass(VALUE_EXCHANGE);
		createEAttribute(valueExchangeEClass, VALUE_EXCHANGE__PRIORITY);
		createEAttribute(valueExchangeEClass, VALUE_EXCHANGE__VALUE_LEVEL_AGREEMENT);
		createEReference(valueExchangeEClass, VALUE_EXCHANGE__ENVIRONMENT_ACTOR);
		createEReference(valueExchangeEClass, VALUE_EXCHANGE__MAIN_ACTOR);
		createEReference(valueExchangeEClass, VALUE_EXCHANGE__OUT_VALUE_PORT);
		createEReference(valueExchangeEClass, VALUE_EXCHANGE__IN_VALUE_PORT);

		outValuePortEClass = createEClass(OUT_VALUE_PORT);
		createEReference(outValuePortEClass, OUT_VALUE_PORT__BELONGS_TO_VALUE_EXCHANGE);
		createEReference(outValuePortEClass, OUT_VALUE_PORT__VALUE_OBJECT);

		valueObjectEClass = createEClass(VALUE_OBJECT);

		mainActorEClass = createEClass(MAIN_ACTOR);
		createEReference(mainActorEClass, MAIN_ACTOR__BELONGS_TO_VALUE_EXCHANGE);

		environmentActorEClass = createEClass(ENVIRONMENT_ACTOR);
		createEReference(environmentActorEClass, ENVIRONMENT_ACTOR__BELONGS_TO_VALUE_EXCHANGE);

		notationEClass = createEClass(NOTATION);
		createEAttribute(notationEClass, NOTATION__NOTATION_ID);

		inValuePortEClass = createEClass(IN_VALUE_PORT);
		createEReference(inValuePortEClass, IN_VALUE_PORT__BELONGS_TO_VALUE_EXCHANGE);
		createEReference(inValuePortEClass, IN_VALUE_PORT__VALUE_OBJECT);

		// Create enums
		enumPriorityEEnum = createEEnum(ENUM_PRIORITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		valueExchangeEClass.getESuperTypes().add(this.getNode());
		outValuePortEClass.getESuperTypes().add(this.getNode());
		valueObjectEClass.getESuperTypes().add(this.getNode());
		mainActorEClass.getESuperTypes().add(this.getNode());
		environmentActorEClass.getESuperTypes().add(this.getNode());
		inValuePortEClass.getESuperTypes().add(this.getNode());

		// Initialize classes and features; add operations and parameters
		initEClass(dynamicValueDescriptionModelEClass, DynamicValueDescriptionModel.class, "DynamicValueDescriptionModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDynamicValueDescriptionModel_Edges(), this.getEdge(), null, "edges", null, 1, -1, DynamicValueDescriptionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDynamicValueDescriptionModel_Nodes(), this.getNode(), null, "nodes", null, 1, -1, DynamicValueDescriptionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_NodeID(), ecorePackage.getEString(), "nodeID", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_VisualNotation(), this.getNotation(), null, "visualNotation", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edgeEClass, Edge.class, "Edge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEdge_Source(), this.getNode(), null, "source", null, 1, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdge_Target(), this.getNode(), null, "target", null, 1, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueExchangeEClass, ValueExchange.class, "ValueExchange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueExchange_Priority(), this.getEnumPriority(), "priority", null, 0, 1, ValueExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueExchange_ValueLevelAgreement(), ecorePackage.getEString(), "valueLevelAgreement", null, 0, 1, ValueExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueExchange_EnvironmentActor(), this.getEnvironmentActor(), null, "environmentActor", null, 1, 1, ValueExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueExchange_MainActor(), this.getMainActor(), null, "mainActor", null, 1, 1, ValueExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueExchange_OutValuePort(), this.getOutValuePort(), null, "outValuePort", null, 1, 1, ValueExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueExchange_InValuePort(), this.getInValuePort(), null, "inValuePort", null, 1, 1, ValueExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outValuePortEClass, OutValuePort.class, "OutValuePort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutValuePort_BelongsToValueExchange(), this.getValueExchange(), null, "belongsToValueExchange", null, 1, 1, OutValuePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutValuePort_ValueObject(), this.getValueObject(), null, "valueObject", null, 1, 1, OutValuePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueObjectEClass, ValueObject.class, "ValueObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mainActorEClass, MainActor.class, "MainActor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMainActor_BelongsToValueExchange(), this.getValueExchange(), null, "belongsToValueExchange", null, 1, -1, MainActor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(environmentActorEClass, EnvironmentActor.class, "EnvironmentActor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnvironmentActor_BelongsToValueExchange(), this.getValueExchange(), null, "belongsToValueExchange", null, 1, -1, EnvironmentActor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notationEClass, Notation.class, "Notation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNotation_NotationID(), ecorePackage.getEString(), "notationID", null, 1, 1, Notation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(inValuePortEClass, InValuePort.class, "InValuePort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInValuePort_BelongsToValueExchange(), this.getValueExchange(), null, "belongsToValueExchange", null, 1, 1, InValuePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInValuePort_ValueObject(), this.getValueObject(), null, "valueObject", null, 1, 1, InValuePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(enumPriorityEEnum, EnumPriority.class, "EnumPriority");
		addEEnumLiteral(enumPriorityEEnum, EnumPriority.LOW);
		addEEnumLiteral(enumPriorityEEnum, EnumPriority.MEDIUM);
		addEEnumLiteral(enumPriorityEEnum, EnumPriority.HIGH);
		addEEnumLiteral(enumPriorityEEnum, EnumPriority.NOT_DEFINED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf.diagram
		createGmfAnnotations();
		// gmf.node
		createGmf_1Annotations();
		// gmf.link
		createGmf_2Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf.diagram";	
		addAnnotation
		  (dynamicValueDescriptionModelEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.node";	
		addAnnotation
		  (nodeEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (mainActorEClass, 
		   source, 
		   new String[] {
			 "figure", "figures.MainActorFigure",
			 "label.icon", "false",
			 "label", "name",
			 "label.placement", "external"
		   });	
		addAnnotation
		  (environmentActorEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "figure", "rectangle",
			 "color", "102,178,255"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.link";	
		addAnnotation
		  (edgeEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "style", "dot",
			 "width", "2",
			 "target.decoration", "arrow"
		   });
	}

} //Dvd_mindmapPackageImpl
