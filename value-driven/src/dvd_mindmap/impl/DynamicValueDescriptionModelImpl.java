/**
 */
package dvd_mindmap.impl;

import dvd_mindmap.Dvd_mindmapPackage;
import dvd_mindmap.DynamicValueDescriptionModel;
import dvd_mindmap.Edge;
import dvd_mindmap.Node;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Value Description Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dvd_mindmap.impl.DynamicValueDescriptionModelImpl#getEdges <em>Edges</em>}</li>
 *   <li>{@link dvd_mindmap.impl.DynamicValueDescriptionModelImpl#getNodes <em>Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DynamicValueDescriptionModelImpl extends EObjectImpl implements DynamicValueDescriptionModel {
	/**
	 * The cached value of the '{@link #getEdges() <em>Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge> edges;

	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> nodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicValueDescriptionModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dvd_mindmapPackage.Literals.DYNAMIC_VALUE_DESCRIPTION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Edge> getEdges() {
		if (edges == null) {
			edges = new EObjectContainmentEList<Edge>(Edge.class, this, Dvd_mindmapPackage.DYNAMIC_VALUE_DESCRIPTION_MODEL__EDGES);
		}
		return edges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<Node>(Node.class, this, Dvd_mindmapPackage.DYNAMIC_VALUE_DESCRIPTION_MODEL__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Dvd_mindmapPackage.DYNAMIC_VALUE_DESCRIPTION_MODEL__EDGES:
				return ((InternalEList<?>)getEdges()).basicRemove(otherEnd, msgs);
			case Dvd_mindmapPackage.DYNAMIC_VALUE_DESCRIPTION_MODEL__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Dvd_mindmapPackage.DYNAMIC_VALUE_DESCRIPTION_MODEL__EDGES:
				return getEdges();
			case Dvd_mindmapPackage.DYNAMIC_VALUE_DESCRIPTION_MODEL__NODES:
				return getNodes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Dvd_mindmapPackage.DYNAMIC_VALUE_DESCRIPTION_MODEL__EDGES:
				getEdges().clear();
				getEdges().addAll((Collection<? extends Edge>)newValue);
				return;
			case Dvd_mindmapPackage.DYNAMIC_VALUE_DESCRIPTION_MODEL__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends Node>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Dvd_mindmapPackage.DYNAMIC_VALUE_DESCRIPTION_MODEL__EDGES:
				getEdges().clear();
				return;
			case Dvd_mindmapPackage.DYNAMIC_VALUE_DESCRIPTION_MODEL__NODES:
				getNodes().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Dvd_mindmapPackage.DYNAMIC_VALUE_DESCRIPTION_MODEL__EDGES:
				return edges != null && !edges.isEmpty();
			case Dvd_mindmapPackage.DYNAMIC_VALUE_DESCRIPTION_MODEL__NODES:
				return nodes != null && !nodes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DynamicValueDescriptionModelImpl
