/**
 */
package dvd_mindmap.impl;

import dvd_mindmap.Dvd_mindmapPackage;
import dvd_mindmap.EnvironmentActor;
import dvd_mindmap.ValueExchange;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dvd_mindmap.impl.EnvironmentActorImpl#getBelongsToValueExchange <em>Belongs To Value Exchange</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnvironmentActorImpl extends NodeImpl implements EnvironmentActor {
	/**
	 * The cached value of the '{@link #getBelongsToValueExchange() <em>Belongs To Value Exchange</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBelongsToValueExchange()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueExchange> belongsToValueExchange;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dvd_mindmapPackage.Literals.ENVIRONMENT_ACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueExchange> getBelongsToValueExchange() {
		if (belongsToValueExchange == null) {
			belongsToValueExchange = new EObjectResolvingEList<ValueExchange>(ValueExchange.class, this, Dvd_mindmapPackage.ENVIRONMENT_ACTOR__BELONGS_TO_VALUE_EXCHANGE);
		}
		return belongsToValueExchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Dvd_mindmapPackage.ENVIRONMENT_ACTOR__BELONGS_TO_VALUE_EXCHANGE:
				return getBelongsToValueExchange();
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
			case Dvd_mindmapPackage.ENVIRONMENT_ACTOR__BELONGS_TO_VALUE_EXCHANGE:
				getBelongsToValueExchange().clear();
				getBelongsToValueExchange().addAll((Collection<? extends ValueExchange>)newValue);
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
			case Dvd_mindmapPackage.ENVIRONMENT_ACTOR__BELONGS_TO_VALUE_EXCHANGE:
				getBelongsToValueExchange().clear();
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
			case Dvd_mindmapPackage.ENVIRONMENT_ACTOR__BELONGS_TO_VALUE_EXCHANGE:
				return belongsToValueExchange != null && !belongsToValueExchange.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EnvironmentActorImpl
