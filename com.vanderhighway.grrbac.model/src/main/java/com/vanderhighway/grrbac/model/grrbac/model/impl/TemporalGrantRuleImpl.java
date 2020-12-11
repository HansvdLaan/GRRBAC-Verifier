/**
 */
package com.vanderhighway.grrbac.model.grrbac.model.impl;

import com.vanderhighway.grrbac.model.grrbac.model.Demarcation;
import com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage;
import com.vanderhighway.grrbac.model.grrbac.model.Role;
import com.vanderhighway.grrbac.model.grrbac.model.TemporalContext;
import com.vanderhighway.grrbac.model.grrbac.model.TemporalGrantRule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Temporal Grant Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.TemporalGrantRuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.TemporalGrantRuleImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.TemporalGrantRuleImpl#isIsGrant <em>Is Grant</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.TemporalGrantRuleImpl#getRole <em>Role</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.TemporalGrantRuleImpl#getDemarcation <em>Demarcation</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.TemporalGrantRuleImpl#getTemporalContext <em>Temporal Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemporalGrantRuleImpl extends MinimalEObjectImpl.Container implements TemporalGrantRule {
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
	 * The default value of the '{@link #isIsGrant() <em>Is Grant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsGrant()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_GRANT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsGrant() <em>Is Grant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsGrant()
	 * @generated
	 * @ordered
	 */
	protected boolean isGrant = IS_GRANT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected Role role;

	/**
	 * The cached value of the '{@link #getDemarcation() <em>Demarcation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDemarcation()
	 * @generated
	 * @ordered
	 */
	protected Demarcation demarcation;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemporalGrantRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GRRBACPackage.Literals.TEMPORAL_GRANT_RULE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GRRBACPackage.TEMPORAL_GRANT_RULE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GRRBACPackage.TEMPORAL_GRANT_RULE__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsGrant() {
		return isGrant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsGrant(boolean newIsGrant) {
		boolean oldIsGrant = isGrant;
		isGrant = newIsGrant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRRBACPackage.TEMPORAL_GRANT_RULE__IS_GRANT, oldIsGrant, isGrant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role getRole() {
		if (role != null && role.eIsProxy()) {
			InternalEObject oldRole = (InternalEObject)role;
			role = (Role)eResolveProxy(oldRole);
			if (role != oldRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GRRBACPackage.TEMPORAL_GRANT_RULE__ROLE, oldRole, role));
			}
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole(Role newRole, NotificationChain msgs) {
		Role oldRole = role;
		role = newRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GRRBACPackage.TEMPORAL_GRANT_RULE__ROLE, oldRole, newRole);
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
	public void setRole(Role newRole) {
		if (newRole != role) {
			NotificationChain msgs = null;
			if (role != null)
				msgs = ((InternalEObject)role).eInverseRemove(this, GRRBACPackage.ROLE__CONSTRAINED_BY, Role.class, msgs);
			if (newRole != null)
				msgs = ((InternalEObject)newRole).eInverseAdd(this, GRRBACPackage.ROLE__CONSTRAINED_BY, Role.class, msgs);
			msgs = basicSetRole(newRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRRBACPackage.TEMPORAL_GRANT_RULE__ROLE, newRole, newRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Demarcation getDemarcation() {
		if (demarcation != null && demarcation.eIsProxy()) {
			InternalEObject oldDemarcation = (InternalEObject)demarcation;
			demarcation = (Demarcation)eResolveProxy(oldDemarcation);
			if (demarcation != oldDemarcation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GRRBACPackage.TEMPORAL_GRANT_RULE__DEMARCATION, oldDemarcation, demarcation));
			}
		}
		return demarcation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Demarcation basicGetDemarcation() {
		return demarcation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDemarcation(Demarcation newDemarcation, NotificationChain msgs) {
		Demarcation oldDemarcation = demarcation;
		demarcation = newDemarcation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GRRBACPackage.TEMPORAL_GRANT_RULE__DEMARCATION, oldDemarcation, newDemarcation);
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
	public void setDemarcation(Demarcation newDemarcation) {
		if (newDemarcation != demarcation) {
			NotificationChain msgs = null;
			if (demarcation != null)
				msgs = ((InternalEObject)demarcation).eInverseRemove(this, GRRBACPackage.DEMARCATION__CONSTRAINED_BY, Demarcation.class, msgs);
			if (newDemarcation != null)
				msgs = ((InternalEObject)newDemarcation).eInverseAdd(this, GRRBACPackage.DEMARCATION__CONSTRAINED_BY, Demarcation.class, msgs);
			msgs = basicSetDemarcation(newDemarcation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRRBACPackage.TEMPORAL_GRANT_RULE__DEMARCATION, newDemarcation, newDemarcation));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GRRBACPackage.TEMPORAL_GRANT_RULE__TEMPORAL_CONTEXT, oldTemporalContext, temporalContext));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GRRBACPackage.TEMPORAL_GRANT_RULE__TEMPORAL_CONTEXT, oldTemporalContext, newTemporalContext);
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
				msgs = ((InternalEObject)temporalContext).eInverseRemove(this, GRRBACPackage.TEMPORAL_CONTEXT__TEMPORAL_GRANT_RULES, TemporalContext.class, msgs);
			if (newTemporalContext != null)
				msgs = ((InternalEObject)newTemporalContext).eInverseAdd(this, GRRBACPackage.TEMPORAL_CONTEXT__TEMPORAL_GRANT_RULES, TemporalContext.class, msgs);
			msgs = basicSetTemporalContext(newTemporalContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRRBACPackage.TEMPORAL_GRANT_RULE__TEMPORAL_CONTEXT, newTemporalContext, newTemporalContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GRRBACPackage.TEMPORAL_GRANT_RULE__ROLE:
				if (role != null)
					msgs = ((InternalEObject)role).eInverseRemove(this, GRRBACPackage.ROLE__CONSTRAINED_BY, Role.class, msgs);
				return basicSetRole((Role)otherEnd, msgs);
			case GRRBACPackage.TEMPORAL_GRANT_RULE__DEMARCATION:
				if (demarcation != null)
					msgs = ((InternalEObject)demarcation).eInverseRemove(this, GRRBACPackage.DEMARCATION__CONSTRAINED_BY, Demarcation.class, msgs);
				return basicSetDemarcation((Demarcation)otherEnd, msgs);
			case GRRBACPackage.TEMPORAL_GRANT_RULE__TEMPORAL_CONTEXT:
				if (temporalContext != null)
					msgs = ((InternalEObject)temporalContext).eInverseRemove(this, GRRBACPackage.TEMPORAL_CONTEXT__TEMPORAL_GRANT_RULES, TemporalContext.class, msgs);
				return basicSetTemporalContext((TemporalContext)otherEnd, msgs);
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
			case GRRBACPackage.TEMPORAL_GRANT_RULE__ROLE:
				return basicSetRole(null, msgs);
			case GRRBACPackage.TEMPORAL_GRANT_RULE__DEMARCATION:
				return basicSetDemarcation(null, msgs);
			case GRRBACPackage.TEMPORAL_GRANT_RULE__TEMPORAL_CONTEXT:
				return basicSetTemporalContext(null, msgs);
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
			case GRRBACPackage.TEMPORAL_GRANT_RULE__NAME:
				return getName();
			case GRRBACPackage.TEMPORAL_GRANT_RULE__PRIORITY:
				return getPriority();
			case GRRBACPackage.TEMPORAL_GRANT_RULE__IS_GRANT:
				return isIsGrant();
			case GRRBACPackage.TEMPORAL_GRANT_RULE__ROLE:
				if (resolve) return getRole();
				return basicGetRole();
			case GRRBACPackage.TEMPORAL_GRANT_RULE__DEMARCATION:
				if (resolve) return getDemarcation();
				return basicGetDemarcation();
			case GRRBACPackage.TEMPORAL_GRANT_RULE__TEMPORAL_CONTEXT:
				if (resolve) return getTemporalContext();
				return basicGetTemporalContext();
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
			case GRRBACPackage.TEMPORAL_GRANT_RULE__NAME:
				setName((String)newValue);
				return;
			case GRRBACPackage.TEMPORAL_GRANT_RULE__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case GRRBACPackage.TEMPORAL_GRANT_RULE__IS_GRANT:
				setIsGrant((Boolean)newValue);
				return;
			case GRRBACPackage.TEMPORAL_GRANT_RULE__ROLE:
				setRole((Role)newValue);
				return;
			case GRRBACPackage.TEMPORAL_GRANT_RULE__DEMARCATION:
				setDemarcation((Demarcation)newValue);
				return;
			case GRRBACPackage.TEMPORAL_GRANT_RULE__TEMPORAL_CONTEXT:
				setTemporalContext((TemporalContext)newValue);
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
			case GRRBACPackage.TEMPORAL_GRANT_RULE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GRRBACPackage.TEMPORAL_GRANT_RULE__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case GRRBACPackage.TEMPORAL_GRANT_RULE__IS_GRANT:
				setIsGrant(IS_GRANT_EDEFAULT);
				return;
			case GRRBACPackage.TEMPORAL_GRANT_RULE__ROLE:
				setRole((Role)null);
				return;
			case GRRBACPackage.TEMPORAL_GRANT_RULE__DEMARCATION:
				setDemarcation((Demarcation)null);
				return;
			case GRRBACPackage.TEMPORAL_GRANT_RULE__TEMPORAL_CONTEXT:
				setTemporalContext((TemporalContext)null);
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
			case GRRBACPackage.TEMPORAL_GRANT_RULE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GRRBACPackage.TEMPORAL_GRANT_RULE__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case GRRBACPackage.TEMPORAL_GRANT_RULE__IS_GRANT:
				return isGrant != IS_GRANT_EDEFAULT;
			case GRRBACPackage.TEMPORAL_GRANT_RULE__ROLE:
				return role != null;
			case GRRBACPackage.TEMPORAL_GRANT_RULE__DEMARCATION:
				return demarcation != null;
			case GRRBACPackage.TEMPORAL_GRANT_RULE__TEMPORAL_CONTEXT:
				return temporalContext != null;
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
		result.append(", isGrant: ");
		result.append(isGrant);
		result.append(')');
		return result.toString();
	}

} //TemporalGrantRuleImpl
