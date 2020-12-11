/**
 */
package com.vanderhighway.grrbac.model.grrbac.model.impl;

import com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage;
import com.vanderhighway.grrbac.model.grrbac.model.SecurityZone;
import com.vanderhighway.grrbac.model.grrbac.model.TemporalAuthenticationRule;
import com.vanderhighway.grrbac.model.grrbac.model.TemporalContext;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Temporal Authentication Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.TemporalAuthenticationRuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.TemporalAuthenticationRuleImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.TemporalAuthenticationRuleImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.TemporalAuthenticationRuleImpl#getTemporalContext <em>Temporal Context</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.TemporalAuthenticationRuleImpl#getSecurityZone <em>Security Zone</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemporalAuthenticationRuleImpl extends MinimalEObjectImpl.Container implements TemporalAuthenticationRule {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final int STATUS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected int status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTemporalContext() <em>Temporal Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporalContext()
	 * @generated
	 * @ordered
	 */
	protected TemporalContext temporalContext;

	/**
	 * The cached value of the '{@link #getSecurityZone() <em>Security Zone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityZone()
	 * @generated
	 * @ordered
	 */
	protected SecurityZone securityZone;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemporalAuthenticationRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GRRBACPackage.Literals.TEMPORAL_AUTHENTICATION_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRRBACPackage.TEMPORAL_AUTHENTICATION_RULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRRBACPackage.TEMPORAL_AUTHENTICATION_RULE__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(int newStatus) {
		int oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRRBACPackage.TEMPORAL_AUTHENTICATION_RULE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalContext getTemporalContext() {
		if (temporalContext != null && temporalContext.eIsProxy()) {
			InternalEObject oldTemporalContext = (InternalEObject)temporalContext;
			temporalContext = (TemporalContext)eResolveProxy(oldTemporalContext);
			if (temporalContext != oldTemporalContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GRRBACPackage.TEMPORAL_AUTHENTICATION_RULE__TEMPORAL_CONTEXT, oldTemporalContext, temporalContext));
			}
		}
		return temporalContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalContext basicGetTemporalContext() {
		return temporalContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemporalContext(TemporalContext newTemporalContext, NotificationChain msgs) {
		TemporalContext oldTemporalContext = temporalContext;
		temporalContext = newTemporalContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GRRBACPackage.TEMPORAL_AUTHENTICATION_RULE__TEMPORAL_CONTEXT, oldTemporalContext, newTemporalContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemporalContext(TemporalContext newTemporalContext) {
		if (newTemporalContext != temporalContext) {
			NotificationChain msgs = null;
			if (temporalContext != null)
				msgs = ((InternalEObject)temporalContext).eInverseRemove(this, GRRBACPackage.TEMPORAL_CONTEXT__TEMPORAL_AUTHENTICATION_RULES, TemporalContext.class, msgs);
			if (newTemporalContext != null)
				msgs = ((InternalEObject)newTemporalContext).eInverseAdd(this, GRRBACPackage.TEMPORAL_CONTEXT__TEMPORAL_AUTHENTICATION_RULES, TemporalContext.class, msgs);
			msgs = basicSetTemporalContext(newTemporalContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRRBACPackage.TEMPORAL_AUTHENTICATION_RULE__TEMPORAL_CONTEXT, newTemporalContext, newTemporalContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityZone getSecurityZone() {
		if (securityZone != null && securityZone.eIsProxy()) {
			InternalEObject oldSecurityZone = (InternalEObject)securityZone;
			securityZone = (SecurityZone)eResolveProxy(oldSecurityZone);
			if (securityZone != oldSecurityZone) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GRRBACPackage.TEMPORAL_AUTHENTICATION_RULE__SECURITY_ZONE, oldSecurityZone, securityZone));
			}
		}
		return securityZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityZone basicGetSecurityZone() {
		return securityZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurityZone(SecurityZone newSecurityZone, NotificationChain msgs) {
		SecurityZone oldSecurityZone = securityZone;
		securityZone = newSecurityZone;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GRRBACPackage.TEMPORAL_AUTHENTICATION_RULE__SECURITY_ZONE, oldSecurityZone, newSecurityZone);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurityZone(SecurityZone newSecurityZone) {
		if (newSecurityZone != securityZone) {
			NotificationChain msgs = null;
			if (securityZone != null)
				msgs = ((InternalEObject)securityZone).eInverseRemove(this, GRRBACPackage.SECURITY_ZONE__CONSTRAINED_BY, SecurityZone.class, msgs);
			if (newSecurityZone != null)
				msgs = ((InternalEObject)newSecurityZone).eInverseAdd(this, GRRBACPackage.SECURITY_ZONE__CONSTRAINED_BY, SecurityZone.class, msgs);
			msgs = basicSetSecurityZone(newSecurityZone, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRRBACPackage.TEMPORAL_AUTHENTICATION_RULE__SECURITY_ZONE, newSecurityZone, newSecurityZone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GRRBACPackage.TEMPORAL_AUTHENTICATION_RULE__TEMPORAL_CONTEXT:
				if (temporalContext != null)
					msgs = ((InternalEObject)temporalContext).eInverseRemove(this, GRRBACPackage.TEMPORAL_CONTEXT__TEMPORAL_AUTHENTICATION_RULES, TemporalContext.class, msgs);
				return basicSetTemporalContext((TemporalContext)otherEnd, msgs);
			case GRRBACPackage.TEMPORAL_AUTHENTICATION_RULE__SECURITY_ZONE:
				if (securityZone != null)
					msgs = ((InternalEObject)securityZone).eInverseRemove(this, GRRBACPackage.SECURITY_ZONE__CONSTRAINED_BY, SecurityZone.class, msgs);
				return basicSetSecurityZone((SecurityZone)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GRRBACPackage.TEMPORAL_AUTHENTICATION_RULE__TEMPORAL_CONTEXT:
				return basicSetTemporalContext(null, msgs);
			case GRRBACPackage.TEMPORAL_AUTHENTICATION_RULE__SECURITY_ZONE:
				return basicSetSecurityZone(null, msgs);
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
			case GRRBACPackage.TEMPORAL_AUTHENTICATION_RULE__NAME:
				return getName();
			case GRRBACPackage.TEMPORAL_AUTHENTICATION_RULE__PRIORITY:
				return getPriority();
			case GRRBACPackage.TEMPORAL_AUTHENTICATION_RULE__STATUS:
				return getStatus();
			case GRRBACPackage.TEMPORAL_AUTHENTICATION_RULE__TEMPORAL_CONTEXT:
				if (resolve) return getTemporalContext();
				return basicGetTemporalContext();
			case GRRBACPackage.TEMPORAL_AUTHENTICATION_RULE__SECURITY_ZONE:
				if (resolve) return getSecurityZone();
				return basicGetSecurityZone();
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
			case GRRBACPackage.TEMPORAL_AUTHENTICATION_RULE__NAME:
				setName((String)newValue);
				return;
			case GRRBACPackage.TEMPORAL_AUTHENTICATION_RULE__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case GRRBACPackage.TEMPORAL_AUTHENTICATION_RULE__STATUS:
				setStatus((Integer)newValue);
				return;
			case GRRBACPackage.TEMPORAL_AUTHENTICATION_RULE__TEMPORAL_CONTEXT:
				setTemporalContext((TemporalContext)newValue);
				return;
			case GRRBACPackage.TEMPORAL_AUTHENTICATION_RULE__SECURITY_ZONE:
				setSecurityZone((SecurityZone)newValue);
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
			case GRRBACPackage.TEMPORAL_AUTHENTICATION_RULE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GRRBACPackage.TEMPORAL_AUTHENTICATION_RULE__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case GRRBACPackage.TEMPORAL_AUTHENTICATION_RULE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case GRRBACPackage.TEMPORAL_AUTHENTICATION_RULE__TEMPORAL_CONTEXT:
				setTemporalContext((TemporalContext)null);
				return;
			case GRRBACPackage.TEMPORAL_AUTHENTICATION_RULE__SECURITY_ZONE:
				setSecurityZone((SecurityZone)null);
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
			case GRRBACPackage.TEMPORAL_AUTHENTICATION_RULE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GRRBACPackage.TEMPORAL_AUTHENTICATION_RULE__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case GRRBACPackage.TEMPORAL_AUTHENTICATION_RULE__STATUS:
				return status != STATUS_EDEFAULT;
			case GRRBACPackage.TEMPORAL_AUTHENTICATION_RULE__TEMPORAL_CONTEXT:
				return temporalContext != null;
			case GRRBACPackage.TEMPORAL_AUTHENTICATION_RULE__SECURITY_ZONE:
				return securityZone != null;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", priority: ");
		result.append(priority);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //TemporalAuthenticationRuleImpl
