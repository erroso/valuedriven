/**
 */
package dvd_mindmap.impl;

import dvd_mindmap.Dvd_mindmapPackage;
import dvd_mindmap.EnumPriority;
import dvd_mindmap.EnvironmentActor;
import dvd_mindmap.InValuePort;
import dvd_mindmap.MainActor;
import dvd_mindmap.OutValuePort;
import dvd_mindmap.ValueExchange;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Exchange</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dvd_mindmap.impl.ValueExchangeImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link dvd_mindmap.impl.ValueExchangeImpl#getValueLevelAgreement <em>Value Level Agreement</em>}</li>
 *   <li>{@link dvd_mindmap.impl.ValueExchangeImpl#getEnvironmentActor <em>Environment Actor</em>}</li>
 *   <li>{@link dvd_mindmap.impl.ValueExchangeImpl#getMainActor <em>Main Actor</em>}</li>
 *   <li>{@link dvd_mindmap.impl.ValueExchangeImpl#getOutValuePort <em>Out Value Port</em>}</li>
 *   <li>{@link dvd_mindmap.impl.ValueExchangeImpl#getInValuePort <em>In Value Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValueExchangeImpl extends NodeImpl implements ValueExchange {
	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final EnumPriority PRIORITY_EDEFAULT = EnumPriority.LOW;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected EnumPriority priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueLevelAgreement() <em>Value Level Agreement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueLevelAgreement()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_LEVEL_AGREEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueLevelAgreement() <em>Value Level Agreement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueLevelAgreement()
	 * @generated
	 * @ordered
	 */
	protected String valueLevelAgreement = VALUE_LEVEL_AGREEMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnvironmentActor() <em>Environment Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironmentActor()
	 * @generated
	 * @ordered
	 */
	protected EnvironmentActor environmentActor;

	/**
	 * The cached value of the '{@link #getMainActor() <em>Main Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainActor()
	 * @generated
	 * @ordered
	 */
	protected MainActor mainActor;

	/**
	 * The cached value of the '{@link #getOutValuePort() <em>Out Value Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutValuePort()
	 * @generated
	 * @ordered
	 */
	protected OutValuePort outValuePort;

	/**
	 * The cached value of the '{@link #getInValuePort() <em>In Value Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInValuePort()
	 * @generated
	 * @ordered
	 */
	protected InValuePort inValuePort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueExchangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dvd_mindmapPackage.Literals.VALUE_EXCHANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumPriority getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(EnumPriority newPriority) {
		EnumPriority oldPriority = priority;
		priority = newPriority == null ? PRIORITY_EDEFAULT : newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dvd_mindmapPackage.VALUE_EXCHANGE__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueLevelAgreement() {
		return valueLevelAgreement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueLevelAgreement(String newValueLevelAgreement) {
		String oldValueLevelAgreement = valueLevelAgreement;
		valueLevelAgreement = newValueLevelAgreement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dvd_mindmapPackage.VALUE_EXCHANGE__VALUE_LEVEL_AGREEMENT, oldValueLevelAgreement, valueLevelAgreement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentActor getEnvironmentActor() {
		if (environmentActor != null && environmentActor.eIsProxy()) {
			InternalEObject oldEnvironmentActor = (InternalEObject)environmentActor;
			environmentActor = (EnvironmentActor)eResolveProxy(oldEnvironmentActor);
			if (environmentActor != oldEnvironmentActor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Dvd_mindmapPackage.VALUE_EXCHANGE__ENVIRONMENT_ACTOR, oldEnvironmentActor, environmentActor));
			}
		}
		return environmentActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentActor basicGetEnvironmentActor() {
		return environmentActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironmentActor(EnvironmentActor newEnvironmentActor) {
		EnvironmentActor oldEnvironmentActor = environmentActor;
		environmentActor = newEnvironmentActor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dvd_mindmapPackage.VALUE_EXCHANGE__ENVIRONMENT_ACTOR, oldEnvironmentActor, environmentActor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainActor getMainActor() {
		if (mainActor != null && mainActor.eIsProxy()) {
			InternalEObject oldMainActor = (InternalEObject)mainActor;
			mainActor = (MainActor)eResolveProxy(oldMainActor);
			if (mainActor != oldMainActor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Dvd_mindmapPackage.VALUE_EXCHANGE__MAIN_ACTOR, oldMainActor, mainActor));
			}
		}
		return mainActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainActor basicGetMainActor() {
		return mainActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainActor(MainActor newMainActor) {
		MainActor oldMainActor = mainActor;
		mainActor = newMainActor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dvd_mindmapPackage.VALUE_EXCHANGE__MAIN_ACTOR, oldMainActor, mainActor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutValuePort getOutValuePort() {
		if (outValuePort != null && outValuePort.eIsProxy()) {
			InternalEObject oldOutValuePort = (InternalEObject)outValuePort;
			outValuePort = (OutValuePort)eResolveProxy(oldOutValuePort);
			if (outValuePort != oldOutValuePort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Dvd_mindmapPackage.VALUE_EXCHANGE__OUT_VALUE_PORT, oldOutValuePort, outValuePort));
			}
		}
		return outValuePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutValuePort basicGetOutValuePort() {
		return outValuePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutValuePort(OutValuePort newOutValuePort) {
		OutValuePort oldOutValuePort = outValuePort;
		outValuePort = newOutValuePort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dvd_mindmapPackage.VALUE_EXCHANGE__OUT_VALUE_PORT, oldOutValuePort, outValuePort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InValuePort getInValuePort() {
		if (inValuePort != null && inValuePort.eIsProxy()) {
			InternalEObject oldInValuePort = (InternalEObject)inValuePort;
			inValuePort = (InValuePort)eResolveProxy(oldInValuePort);
			if (inValuePort != oldInValuePort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Dvd_mindmapPackage.VALUE_EXCHANGE__IN_VALUE_PORT, oldInValuePort, inValuePort));
			}
		}
		return inValuePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InValuePort basicGetInValuePort() {
		return inValuePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInValuePort(InValuePort newInValuePort) {
		InValuePort oldInValuePort = inValuePort;
		inValuePort = newInValuePort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dvd_mindmapPackage.VALUE_EXCHANGE__IN_VALUE_PORT, oldInValuePort, inValuePort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Dvd_mindmapPackage.VALUE_EXCHANGE__PRIORITY:
				return getPriority();
			case Dvd_mindmapPackage.VALUE_EXCHANGE__VALUE_LEVEL_AGREEMENT:
				return getValueLevelAgreement();
			case Dvd_mindmapPackage.VALUE_EXCHANGE__ENVIRONMENT_ACTOR:
				if (resolve) return getEnvironmentActor();
				return basicGetEnvironmentActor();
			case Dvd_mindmapPackage.VALUE_EXCHANGE__MAIN_ACTOR:
				if (resolve) return getMainActor();
				return basicGetMainActor();
			case Dvd_mindmapPackage.VALUE_EXCHANGE__OUT_VALUE_PORT:
				if (resolve) return getOutValuePort();
				return basicGetOutValuePort();
			case Dvd_mindmapPackage.VALUE_EXCHANGE__IN_VALUE_PORT:
				if (resolve) return getInValuePort();
				return basicGetInValuePort();
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
			case Dvd_mindmapPackage.VALUE_EXCHANGE__PRIORITY:
				setPriority((EnumPriority)newValue);
				return;
			case Dvd_mindmapPackage.VALUE_EXCHANGE__VALUE_LEVEL_AGREEMENT:
				setValueLevelAgreement((String)newValue);
				return;
			case Dvd_mindmapPackage.VALUE_EXCHANGE__ENVIRONMENT_ACTOR:
				setEnvironmentActor((EnvironmentActor)newValue);
				return;
			case Dvd_mindmapPackage.VALUE_EXCHANGE__MAIN_ACTOR:
				setMainActor((MainActor)newValue);
				return;
			case Dvd_mindmapPackage.VALUE_EXCHANGE__OUT_VALUE_PORT:
				setOutValuePort((OutValuePort)newValue);
				return;
			case Dvd_mindmapPackage.VALUE_EXCHANGE__IN_VALUE_PORT:
				setInValuePort((InValuePort)newValue);
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
			case Dvd_mindmapPackage.VALUE_EXCHANGE__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case Dvd_mindmapPackage.VALUE_EXCHANGE__VALUE_LEVEL_AGREEMENT:
				setValueLevelAgreement(VALUE_LEVEL_AGREEMENT_EDEFAULT);
				return;
			case Dvd_mindmapPackage.VALUE_EXCHANGE__ENVIRONMENT_ACTOR:
				setEnvironmentActor((EnvironmentActor)null);
				return;
			case Dvd_mindmapPackage.VALUE_EXCHANGE__MAIN_ACTOR:
				setMainActor((MainActor)null);
				return;
			case Dvd_mindmapPackage.VALUE_EXCHANGE__OUT_VALUE_PORT:
				setOutValuePort((OutValuePort)null);
				return;
			case Dvd_mindmapPackage.VALUE_EXCHANGE__IN_VALUE_PORT:
				setInValuePort((InValuePort)null);
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
			case Dvd_mindmapPackage.VALUE_EXCHANGE__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case Dvd_mindmapPackage.VALUE_EXCHANGE__VALUE_LEVEL_AGREEMENT:
				return VALUE_LEVEL_AGREEMENT_EDEFAULT == null ? valueLevelAgreement != null : !VALUE_LEVEL_AGREEMENT_EDEFAULT.equals(valueLevelAgreement);
			case Dvd_mindmapPackage.VALUE_EXCHANGE__ENVIRONMENT_ACTOR:
				return environmentActor != null;
			case Dvd_mindmapPackage.VALUE_EXCHANGE__MAIN_ACTOR:
				return mainActor != null;
			case Dvd_mindmapPackage.VALUE_EXCHANGE__OUT_VALUE_PORT:
				return outValuePort != null;
			case Dvd_mindmapPackage.VALUE_EXCHANGE__IN_VALUE_PORT:
				return inValuePort != null;
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
		result.append(" (priority: ");
		result.append(priority);
		result.append(", valueLevelAgreement: ");
		result.append(valueLevelAgreement);
		result.append(')');
		return result.toString();
	}

} //ValueExchangeImpl
