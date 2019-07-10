/**
 */
package dvd_mindmap.impl;

import dvd_mindmap.Dvd_mindmapPackage;
import dvd_mindmap.Notation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Notation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dvd_mindmap.impl.NotationImpl#getNotationID <em>Notation ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NotationImpl extends EObjectImpl implements Notation {
	/**
	 * The default value of the '{@link #getNotationID() <em>Notation ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotationID()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotationID() <em>Notation ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotationID()
	 * @generated
	 * @ordered
	 */
	protected String notationID = NOTATION_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dvd_mindmapPackage.Literals.NOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNotationID() {
		return notationID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotationID(String newNotationID) {
		String oldNotationID = notationID;
		notationID = newNotationID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dvd_mindmapPackage.NOTATION__NOTATION_ID, oldNotationID, notationID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Dvd_mindmapPackage.NOTATION__NOTATION_ID:
				return getNotationID();
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
			case Dvd_mindmapPackage.NOTATION__NOTATION_ID:
				setNotationID((String)newValue);
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
			case Dvd_mindmapPackage.NOTATION__NOTATION_ID:
				setNotationID(NOTATION_ID_EDEFAULT);
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
			case Dvd_mindmapPackage.NOTATION__NOTATION_ID:
				return NOTATION_ID_EDEFAULT == null ? notationID != null : !NOTATION_ID_EDEFAULT.equals(notationID);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (notationID: ");
		result.append(notationID);
		result.append(')');
		return result.toString();
	}

} //NotationImpl
