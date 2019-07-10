/**
 */
package dvd_mindmap;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dvd_mindmap.Dvd_mindmapFactory
 * @model kind="package"
 * @generated
 */
public interface Dvd_mindmapPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dvd_mindmap";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "dvd_mindmap";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dvd_mindmap";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Dvd_mindmapPackage eINSTANCE = dvd_mindmap.impl.Dvd_mindmapPackageImpl.init();

	/**
	 * The meta object id for the '{@link dvd_mindmap.impl.DynamicValueDescriptionModelImpl <em>Dynamic Value Description Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dvd_mindmap.impl.DynamicValueDescriptionModelImpl
	 * @see dvd_mindmap.impl.Dvd_mindmapPackageImpl#getDynamicValueDescriptionModel()
	 * @generated
	 */
	int DYNAMIC_VALUE_DESCRIPTION_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_VALUE_DESCRIPTION_MODEL__EDGES = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_VALUE_DESCRIPTION_MODEL__NODES = 1;

	/**
	 * The number of structural features of the '<em>Dynamic Value Description Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_VALUE_DESCRIPTION_MODEL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link dvd_mindmap.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dvd_mindmap.impl.NodeImpl
	 * @see dvd_mindmap.impl.Dvd_mindmapPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The feature id for the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NODE_ID = 0;

	/**
	 * The feature id for the '<em><b>Visual Notation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__VISUAL_NOTATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link dvd_mindmap.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dvd_mindmap.impl.EdgeImpl
	 * @see dvd_mindmap.impl.Dvd_mindmapPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link dvd_mindmap.impl.ValueExchangeImpl <em>Value Exchange</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dvd_mindmap.impl.ValueExchangeImpl
	 * @see dvd_mindmap.impl.Dvd_mindmapPackageImpl#getValueExchange()
	 * @generated
	 */
	int VALUE_EXCHANGE = 3;

	/**
	 * The feature id for the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_EXCHANGE__NODE_ID = NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Visual Notation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_EXCHANGE__VISUAL_NOTATION = NODE__VISUAL_NOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_EXCHANGE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_EXCHANGE__PRIORITY = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Level Agreement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_EXCHANGE__VALUE_LEVEL_AGREEMENT = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Environment Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_EXCHANGE__ENVIRONMENT_ACTOR = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Main Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_EXCHANGE__MAIN_ACTOR = NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Out Value Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_EXCHANGE__OUT_VALUE_PORT = NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>In Value Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_EXCHANGE__IN_VALUE_PORT = NODE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Value Exchange</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_EXCHANGE_FEATURE_COUNT = NODE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link dvd_mindmap.impl.OutValuePortImpl <em>Out Value Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dvd_mindmap.impl.OutValuePortImpl
	 * @see dvd_mindmap.impl.Dvd_mindmapPackageImpl#getOutValuePort()
	 * @generated
	 */
	int OUT_VALUE_PORT = 4;

	/**
	 * The feature id for the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_VALUE_PORT__NODE_ID = NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Visual Notation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_VALUE_PORT__VISUAL_NOTATION = NODE__VISUAL_NOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_VALUE_PORT__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Belongs To Value Exchange</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_VALUE_PORT__BELONGS_TO_VALUE_EXCHANGE = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_VALUE_PORT__VALUE_OBJECT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Out Value Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_VALUE_PORT_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link dvd_mindmap.impl.ValueObjectImpl <em>Value Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dvd_mindmap.impl.ValueObjectImpl
	 * @see dvd_mindmap.impl.Dvd_mindmapPackageImpl#getValueObject()
	 * @generated
	 */
	int VALUE_OBJECT = 5;

	/**
	 * The feature id for the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__NODE_ID = NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Visual Notation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__VISUAL_NOTATION = NODE__VISUAL_NOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__NAME = NODE__NAME;

	/**
	 * The number of structural features of the '<em>Value Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dvd_mindmap.impl.MainActorImpl <em>Main Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dvd_mindmap.impl.MainActorImpl
	 * @see dvd_mindmap.impl.Dvd_mindmapPackageImpl#getMainActor()
	 * @generated
	 */
	int MAIN_ACTOR = 6;

	/**
	 * The feature id for the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_ACTOR__NODE_ID = NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Visual Notation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_ACTOR__VISUAL_NOTATION = NODE__VISUAL_NOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_ACTOR__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Belongs To Value Exchange</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_ACTOR__BELONGS_TO_VALUE_EXCHANGE = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Main Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_ACTOR_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dvd_mindmap.impl.EnvironmentActorImpl <em>Environment Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dvd_mindmap.impl.EnvironmentActorImpl
	 * @see dvd_mindmap.impl.Dvd_mindmapPackageImpl#getEnvironmentActor()
	 * @generated
	 */
	int ENVIRONMENT_ACTOR = 7;

	/**
	 * The feature id for the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_ACTOR__NODE_ID = NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Visual Notation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_ACTOR__VISUAL_NOTATION = NODE__VISUAL_NOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_ACTOR__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Belongs To Value Exchange</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_ACTOR__BELONGS_TO_VALUE_EXCHANGE = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Environment Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_ACTOR_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dvd_mindmap.impl.NotationImpl <em>Notation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dvd_mindmap.impl.NotationImpl
	 * @see dvd_mindmap.impl.Dvd_mindmapPackageImpl#getNotation()
	 * @generated
	 */
	int NOTATION = 8;

	/**
	 * The feature id for the '<em><b>Notation ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTATION__NOTATION_ID = 0;

	/**
	 * The number of structural features of the '<em>Notation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link dvd_mindmap.impl.InValuePortImpl <em>In Value Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dvd_mindmap.impl.InValuePortImpl
	 * @see dvd_mindmap.impl.Dvd_mindmapPackageImpl#getInValuePort()
	 * @generated
	 */
	int IN_VALUE_PORT = 9;

	/**
	 * The feature id for the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_VALUE_PORT__NODE_ID = NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Visual Notation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_VALUE_PORT__VISUAL_NOTATION = NODE__VISUAL_NOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_VALUE_PORT__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Belongs To Value Exchange</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_VALUE_PORT__BELONGS_TO_VALUE_EXCHANGE = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_VALUE_PORT__VALUE_OBJECT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>In Value Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_VALUE_PORT_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link dvd_mindmap.EnumPriority <em>Enum Priority</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dvd_mindmap.EnumPriority
	 * @see dvd_mindmap.impl.Dvd_mindmapPackageImpl#getEnumPriority()
	 * @generated
	 */
	int ENUM_PRIORITY = 10;


	/**
	 * Returns the meta object for class '{@link dvd_mindmap.DynamicValueDescriptionModel <em>Dynamic Value Description Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Value Description Model</em>'.
	 * @see dvd_mindmap.DynamicValueDescriptionModel
	 * @generated
	 */
	EClass getDynamicValueDescriptionModel();

	/**
	 * Returns the meta object for the containment reference list '{@link dvd_mindmap.DynamicValueDescriptionModel#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edges</em>'.
	 * @see dvd_mindmap.DynamicValueDescriptionModel#getEdges()
	 * @see #getDynamicValueDescriptionModel()
	 * @generated
	 */
	EReference getDynamicValueDescriptionModel_Edges();

	/**
	 * Returns the meta object for the containment reference list '{@link dvd_mindmap.DynamicValueDescriptionModel#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see dvd_mindmap.DynamicValueDescriptionModel#getNodes()
	 * @see #getDynamicValueDescriptionModel()
	 * @generated
	 */
	EReference getDynamicValueDescriptionModel_Nodes();

	/**
	 * Returns the meta object for class '{@link dvd_mindmap.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see dvd_mindmap.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link dvd_mindmap.Node#getNodeID <em>Node ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node ID</em>'.
	 * @see dvd_mindmap.Node#getNodeID()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_NodeID();

	/**
	 * Returns the meta object for the containment reference list '{@link dvd_mindmap.Node#getVisualNotation <em>Visual Notation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Visual Notation</em>'.
	 * @see dvd_mindmap.Node#getVisualNotation()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_VisualNotation();

	/**
	 * Returns the meta object for the attribute '{@link dvd_mindmap.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dvd_mindmap.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for class '{@link dvd_mindmap.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see dvd_mindmap.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the reference '{@link dvd_mindmap.Edge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see dvd_mindmap.Edge#getSource()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Source();

	/**
	 * Returns the meta object for the reference '{@link dvd_mindmap.Edge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see dvd_mindmap.Edge#getTarget()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Target();

	/**
	 * Returns the meta object for class '{@link dvd_mindmap.ValueExchange <em>Value Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Exchange</em>'.
	 * @see dvd_mindmap.ValueExchange
	 * @generated
	 */
	EClass getValueExchange();

	/**
	 * Returns the meta object for the attribute '{@link dvd_mindmap.ValueExchange#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see dvd_mindmap.ValueExchange#getPriority()
	 * @see #getValueExchange()
	 * @generated
	 */
	EAttribute getValueExchange_Priority();

	/**
	 * Returns the meta object for the attribute '{@link dvd_mindmap.ValueExchange#getValueLevelAgreement <em>Value Level Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Level Agreement</em>'.
	 * @see dvd_mindmap.ValueExchange#getValueLevelAgreement()
	 * @see #getValueExchange()
	 * @generated
	 */
	EAttribute getValueExchange_ValueLevelAgreement();

	/**
	 * Returns the meta object for the reference '{@link dvd_mindmap.ValueExchange#getEnvironmentActor <em>Environment Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Environment Actor</em>'.
	 * @see dvd_mindmap.ValueExchange#getEnvironmentActor()
	 * @see #getValueExchange()
	 * @generated
	 */
	EReference getValueExchange_EnvironmentActor();

	/**
	 * Returns the meta object for the reference '{@link dvd_mindmap.ValueExchange#getMainActor <em>Main Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Main Actor</em>'.
	 * @see dvd_mindmap.ValueExchange#getMainActor()
	 * @see #getValueExchange()
	 * @generated
	 */
	EReference getValueExchange_MainActor();

	/**
	 * Returns the meta object for the reference '{@link dvd_mindmap.ValueExchange#getOutValuePort <em>Out Value Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Out Value Port</em>'.
	 * @see dvd_mindmap.ValueExchange#getOutValuePort()
	 * @see #getValueExchange()
	 * @generated
	 */
	EReference getValueExchange_OutValuePort();

	/**
	 * Returns the meta object for the reference '{@link dvd_mindmap.ValueExchange#getInValuePort <em>In Value Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Value Port</em>'.
	 * @see dvd_mindmap.ValueExchange#getInValuePort()
	 * @see #getValueExchange()
	 * @generated
	 */
	EReference getValueExchange_InValuePort();

	/**
	 * Returns the meta object for class '{@link dvd_mindmap.OutValuePort <em>Out Value Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Out Value Port</em>'.
	 * @see dvd_mindmap.OutValuePort
	 * @generated
	 */
	EClass getOutValuePort();

	/**
	 * Returns the meta object for the reference '{@link dvd_mindmap.OutValuePort#getBelongsToValueExchange <em>Belongs To Value Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Belongs To Value Exchange</em>'.
	 * @see dvd_mindmap.OutValuePort#getBelongsToValueExchange()
	 * @see #getOutValuePort()
	 * @generated
	 */
	EReference getOutValuePort_BelongsToValueExchange();

	/**
	 * Returns the meta object for the reference '{@link dvd_mindmap.OutValuePort#getValueObject <em>Value Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Object</em>'.
	 * @see dvd_mindmap.OutValuePort#getValueObject()
	 * @see #getOutValuePort()
	 * @generated
	 */
	EReference getOutValuePort_ValueObject();

	/**
	 * Returns the meta object for class '{@link dvd_mindmap.ValueObject <em>Value Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Object</em>'.
	 * @see dvd_mindmap.ValueObject
	 * @generated
	 */
	EClass getValueObject();

	/**
	 * Returns the meta object for class '{@link dvd_mindmap.MainActor <em>Main Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main Actor</em>'.
	 * @see dvd_mindmap.MainActor
	 * @generated
	 */
	EClass getMainActor();

	/**
	 * Returns the meta object for the reference list '{@link dvd_mindmap.MainActor#getBelongsToValueExchange <em>Belongs To Value Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Belongs To Value Exchange</em>'.
	 * @see dvd_mindmap.MainActor#getBelongsToValueExchange()
	 * @see #getMainActor()
	 * @generated
	 */
	EReference getMainActor_BelongsToValueExchange();

	/**
	 * Returns the meta object for class '{@link dvd_mindmap.EnvironmentActor <em>Environment Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment Actor</em>'.
	 * @see dvd_mindmap.EnvironmentActor
	 * @generated
	 */
	EClass getEnvironmentActor();

	/**
	 * Returns the meta object for the reference list '{@link dvd_mindmap.EnvironmentActor#getBelongsToValueExchange <em>Belongs To Value Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Belongs To Value Exchange</em>'.
	 * @see dvd_mindmap.EnvironmentActor#getBelongsToValueExchange()
	 * @see #getEnvironmentActor()
	 * @generated
	 */
	EReference getEnvironmentActor_BelongsToValueExchange();

	/**
	 * Returns the meta object for class '{@link dvd_mindmap.Notation <em>Notation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notation</em>'.
	 * @see dvd_mindmap.Notation
	 * @generated
	 */
	EClass getNotation();

	/**
	 * Returns the meta object for the attribute '{@link dvd_mindmap.Notation#getNotationID <em>Notation ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notation ID</em>'.
	 * @see dvd_mindmap.Notation#getNotationID()
	 * @see #getNotation()
	 * @generated
	 */
	EAttribute getNotation_NotationID();

	/**
	 * Returns the meta object for class '{@link dvd_mindmap.InValuePort <em>In Value Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Value Port</em>'.
	 * @see dvd_mindmap.InValuePort
	 * @generated
	 */
	EClass getInValuePort();

	/**
	 * Returns the meta object for the reference '{@link dvd_mindmap.InValuePort#getBelongsToValueExchange <em>Belongs To Value Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Belongs To Value Exchange</em>'.
	 * @see dvd_mindmap.InValuePort#getBelongsToValueExchange()
	 * @see #getInValuePort()
	 * @generated
	 */
	EReference getInValuePort_BelongsToValueExchange();

	/**
	 * Returns the meta object for the reference '{@link dvd_mindmap.InValuePort#getValueObject <em>Value Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Object</em>'.
	 * @see dvd_mindmap.InValuePort#getValueObject()
	 * @see #getInValuePort()
	 * @generated
	 */
	EReference getInValuePort_ValueObject();

	/**
	 * Returns the meta object for enum '{@link dvd_mindmap.EnumPriority <em>Enum Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Priority</em>'.
	 * @see dvd_mindmap.EnumPriority
	 * @generated
	 */
	EEnum getEnumPriority();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Dvd_mindmapFactory getDvd_mindmapFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dvd_mindmap.impl.DynamicValueDescriptionModelImpl <em>Dynamic Value Description Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dvd_mindmap.impl.DynamicValueDescriptionModelImpl
		 * @see dvd_mindmap.impl.Dvd_mindmapPackageImpl#getDynamicValueDescriptionModel()
		 * @generated
		 */
		EClass DYNAMIC_VALUE_DESCRIPTION_MODEL = eINSTANCE.getDynamicValueDescriptionModel();

		/**
		 * The meta object literal for the '<em><b>Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_VALUE_DESCRIPTION_MODEL__EDGES = eINSTANCE.getDynamicValueDescriptionModel_Edges();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_VALUE_DESCRIPTION_MODEL__NODES = eINSTANCE.getDynamicValueDescriptionModel_Nodes();

		/**
		 * The meta object literal for the '{@link dvd_mindmap.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dvd_mindmap.impl.NodeImpl
		 * @see dvd_mindmap.impl.Dvd_mindmapPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Node ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NODE_ID = eINSTANCE.getNode_NodeID();

		/**
		 * The meta object literal for the '<em><b>Visual Notation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__VISUAL_NOTATION = eINSTANCE.getNode_VisualNotation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '{@link dvd_mindmap.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dvd_mindmap.impl.EdgeImpl
		 * @see dvd_mindmap.impl.Dvd_mindmapPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__SOURCE = eINSTANCE.getEdge_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__TARGET = eINSTANCE.getEdge_Target();

		/**
		 * The meta object literal for the '{@link dvd_mindmap.impl.ValueExchangeImpl <em>Value Exchange</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dvd_mindmap.impl.ValueExchangeImpl
		 * @see dvd_mindmap.impl.Dvd_mindmapPackageImpl#getValueExchange()
		 * @generated
		 */
		EClass VALUE_EXCHANGE = eINSTANCE.getValueExchange();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_EXCHANGE__PRIORITY = eINSTANCE.getValueExchange_Priority();

		/**
		 * The meta object literal for the '<em><b>Value Level Agreement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_EXCHANGE__VALUE_LEVEL_AGREEMENT = eINSTANCE.getValueExchange_ValueLevelAgreement();

		/**
		 * The meta object literal for the '<em><b>Environment Actor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_EXCHANGE__ENVIRONMENT_ACTOR = eINSTANCE.getValueExchange_EnvironmentActor();

		/**
		 * The meta object literal for the '<em><b>Main Actor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_EXCHANGE__MAIN_ACTOR = eINSTANCE.getValueExchange_MainActor();

		/**
		 * The meta object literal for the '<em><b>Out Value Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_EXCHANGE__OUT_VALUE_PORT = eINSTANCE.getValueExchange_OutValuePort();

		/**
		 * The meta object literal for the '<em><b>In Value Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_EXCHANGE__IN_VALUE_PORT = eINSTANCE.getValueExchange_InValuePort();

		/**
		 * The meta object literal for the '{@link dvd_mindmap.impl.OutValuePortImpl <em>Out Value Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dvd_mindmap.impl.OutValuePortImpl
		 * @see dvd_mindmap.impl.Dvd_mindmapPackageImpl#getOutValuePort()
		 * @generated
		 */
		EClass OUT_VALUE_PORT = eINSTANCE.getOutValuePort();

		/**
		 * The meta object literal for the '<em><b>Belongs To Value Exchange</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUT_VALUE_PORT__BELONGS_TO_VALUE_EXCHANGE = eINSTANCE.getOutValuePort_BelongsToValueExchange();

		/**
		 * The meta object literal for the '<em><b>Value Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUT_VALUE_PORT__VALUE_OBJECT = eINSTANCE.getOutValuePort_ValueObject();

		/**
		 * The meta object literal for the '{@link dvd_mindmap.impl.ValueObjectImpl <em>Value Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dvd_mindmap.impl.ValueObjectImpl
		 * @see dvd_mindmap.impl.Dvd_mindmapPackageImpl#getValueObject()
		 * @generated
		 */
		EClass VALUE_OBJECT = eINSTANCE.getValueObject();

		/**
		 * The meta object literal for the '{@link dvd_mindmap.impl.MainActorImpl <em>Main Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dvd_mindmap.impl.MainActorImpl
		 * @see dvd_mindmap.impl.Dvd_mindmapPackageImpl#getMainActor()
		 * @generated
		 */
		EClass MAIN_ACTOR = eINSTANCE.getMainActor();

		/**
		 * The meta object literal for the '<em><b>Belongs To Value Exchange</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_ACTOR__BELONGS_TO_VALUE_EXCHANGE = eINSTANCE.getMainActor_BelongsToValueExchange();

		/**
		 * The meta object literal for the '{@link dvd_mindmap.impl.EnvironmentActorImpl <em>Environment Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dvd_mindmap.impl.EnvironmentActorImpl
		 * @see dvd_mindmap.impl.Dvd_mindmapPackageImpl#getEnvironmentActor()
		 * @generated
		 */
		EClass ENVIRONMENT_ACTOR = eINSTANCE.getEnvironmentActor();

		/**
		 * The meta object literal for the '<em><b>Belongs To Value Exchange</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT_ACTOR__BELONGS_TO_VALUE_EXCHANGE = eINSTANCE.getEnvironmentActor_BelongsToValueExchange();

		/**
		 * The meta object literal for the '{@link dvd_mindmap.impl.NotationImpl <em>Notation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dvd_mindmap.impl.NotationImpl
		 * @see dvd_mindmap.impl.Dvd_mindmapPackageImpl#getNotation()
		 * @generated
		 */
		EClass NOTATION = eINSTANCE.getNotation();

		/**
		 * The meta object literal for the '<em><b>Notation ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTATION__NOTATION_ID = eINSTANCE.getNotation_NotationID();

		/**
		 * The meta object literal for the '{@link dvd_mindmap.impl.InValuePortImpl <em>In Value Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dvd_mindmap.impl.InValuePortImpl
		 * @see dvd_mindmap.impl.Dvd_mindmapPackageImpl#getInValuePort()
		 * @generated
		 */
		EClass IN_VALUE_PORT = eINSTANCE.getInValuePort();

		/**
		 * The meta object literal for the '<em><b>Belongs To Value Exchange</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IN_VALUE_PORT__BELONGS_TO_VALUE_EXCHANGE = eINSTANCE.getInValuePort_BelongsToValueExchange();

		/**
		 * The meta object literal for the '<em><b>Value Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IN_VALUE_PORT__VALUE_OBJECT = eINSTANCE.getInValuePort_ValueObject();

		/**
		 * The meta object literal for the '{@link dvd_mindmap.EnumPriority <em>Enum Priority</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dvd_mindmap.EnumPriority
		 * @see dvd_mindmap.impl.Dvd_mindmapPackageImpl#getEnumPriority()
		 * @generated
		 */
		EEnum ENUM_PRIORITY = eINSTANCE.getEnumPriority();

	}

} //Dvd_mindmapPackage
