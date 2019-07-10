/**
 */
package dvd_mindmap.impl;

import dvd_mindmap.Dvd_mindmapPackage;
import dvd_mindmap.InValuePort;
import dvd_mindmap.ValueExchange;
import dvd_mindmap.ValueObject;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>In Value Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dvd_mindmap.impl.InValuePortImpl#getBelongsToValueExchange <em>Belongs To Value Exchange</em>}</li>
 *   <li>{@link dvd_mindmap.impl.InValuePortImpl#getValueObject <em>Value Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InValuePortImpl extends NodeImpl implements InValuePort {
	/**
	 * The cached value of the '{@link #getBelongsToValueExchange() <em>Belongs To Value Exchange</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBelongsToValueExchange()
	 * @generated
	 * @ordered
	 */
	protected ValueExchange belongsToValueExchange;

	/**
	 * The cached value of the '{@link #getValueObject() <em>Value Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueObject()
	 * @generated
	 * @ordered
	 */
	protected ValueObject valueObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InValuePortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dvd_mindmapPackage.Literals.IN_VALUE_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueExchange getBelongsToValueExchange() {
		if (belongsToValueExchange != null && belongsToValueExchange.eIsProxy()) {
			InternalEObject oldBelongsToValueExchange = (InternalEObject)belongsToValueExchange;
			belongsToValueExchange = (ValueExchange)eResolveProxy(oldBelongsToValueExchange);
			if (belongsToValueExchange != oldBelongsToValueExchange) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Dvd_mindmapPackage.IN_VALUE_PORT__BELONGS_TO_VALUE_EXCHANGE, oldBelongsToValueExchange, belongsToValueExchange));
			}
		}
		return belongsToValueExchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueExchange basicGetBelongsToValueExchange() {
		return belongsToValueExchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBelongsToValueExchange(ValueExchange newBelongsToValueExchange) {
		ValueExchange oldBelongsToValueExchange = belongsToValueExchange;
		belongsToValueExchange = newBelongsToValueExchange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dvd_mindmapPackage.IN_VALUE_PORT__BELONGS_TO_VALUE_EXCHANGE, oldBelongsToValueExchange, belongsToValueExchange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueObject getValueObject() {
		if (valueObject != null && valueObject.eIsProxy()) {
			InternalEObject oldValueObject = (InternalEObject)valueObject;
			valueObject = (ValueObject)eResolveProxy(oldValueObject);
			if (valueObject != oldValueObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Dvd_mindmapPackage.IN_VALUE_PORT__VALUE_OBJECT, oldValueObject, valueObject));
			}
		}
		return valueObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueObject basicGetValueObject() {
		return valueObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueObject(ValueObject newValueObject) {
		ValueObject oldValueObject = valueObject;
		valueObject = newValueObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dvd_mindmapPackage.IN_VALUE_PORT__VALUE_OBJECT, oldValueObject, valueObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Dvd_mindmapPackage.IN_VALUE_PORT__BELONGS_TO_VALUE_EXCHANGE:
				if (resolve) return getBelongsToValueExchange();
				return basicGetBelongsToValueExchange();
			case Dvd_mindmapPackage.IN_VALUE_PORT__VALUE_OBJECT:
				if (resolve) return getValueObject();
				return basicGetValueObject();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Dvd_mindmapPackage.IN_VALUE_PORT__BELONGS_TO_VALUE_EXCHANGE:
				setBelongsToValueExchange((ValueExchange)newValue);
				return;
			case Dvd_mindmapPackage.IN_VALUE_PORT__VALUE_OBJECT:
				setValueObject((ValueObject)newValue);
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
			case Dvd_mindmapPackage.IN_VALUE_PORT__BELONGS_TO_VALUE_EXCHANGE:
				setBelongsToValueExchange((ValueExchange)null);
				return;
			case Dvd_mindmapPackage.IN_VALUE_PORT__VALUE_OBJECT:
				setValueObject((ValueObject)null);
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
			case Dvd_mindmapPackage.IN_VALUE_PORT__BELONGS_TO_VALUE_EXCHANGE:
				return belongsToValueExchange != null;
			case Dvd_mindmapPackage.IN_VALUE_PORT__VALUE_OBJECT:
				return valueObject != null;
		}
		return super.eIsSet(featureID);
	}

} //InValuePortImpl
