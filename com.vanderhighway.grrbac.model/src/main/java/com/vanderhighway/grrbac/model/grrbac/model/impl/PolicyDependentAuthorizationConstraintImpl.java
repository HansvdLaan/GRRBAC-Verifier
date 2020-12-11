/**
 */
package com.vanderhighway.grrbac.model.grrbac.model.impl;

import com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage;
import com.vanderhighway.grrbac.model.grrbac.model.PolicyDependentAuthorizationConstraint;
import com.vanderhighway.grrbac.model.grrbac.model.TemporalContext;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Policy Dependent Authorization Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.PolicyDependentAuthorizationConstraintImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.PolicyDependentAuthorizationConstraintImpl#getTemporalContext <em>Temporal Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PolicyDependentAuthorizationConstraintImpl extends MinimalEObjectImpl.Container implements PolicyDependentAuthorizationConstraint {
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
	protected PolicyDependentAuthorizationConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GRRBACPackage.Literals.POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GRRBACPackage.POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GRRBACPackage.POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT__TEMPORAL_CONTEXT, oldTemporalContext, temporalContext));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GRRBACPackage.POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT__TEMPORAL_CONTEXT, oldTemporalContext, newTemporalContext);
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
				msgs = ((InternalEObject)temporalContext).eInverseRemove(this, GRRBACPackage.TEMPORAL_CONTEXT__AUTHORIZATION_CONSTRAINTS, TemporalContext.class, msgs);
			if (newTemporalContext != null)
				msgs = ((InternalEObject)newTemporalContext).eInverseAdd(this, GRRBACPackage.TEMPORAL_CONTEXT__AUTHORIZATION_CONSTRAINTS, TemporalContext.class, msgs);
			msgs = basicSetTemporalContext(newTemporalContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRRBACPackage.POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT__TEMPORAL_CONTEXT, newTemporalContext, newTemporalContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GRRBACPackage.POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT__TEMPORAL_CONTEXT:
				if (temporalContext != null)
					msgs = ((InternalEObject)temporalContext).eInverseRemove(this, GRRBACPackage.TEMPORAL_CONTEXT__AUTHORIZATION_CONSTRAINTS, TemporalContext.class, msgs);
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
			case GRRBACPackage.POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT__TEMPORAL_CONTEXT:
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
			case GRRBACPackage.POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT__NAME:
				return getName();
			case GRRBACPackage.POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT__TEMPORAL_CONTEXT:
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
			case GRRBACPackage.POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT__NAME:
				setName((String)newValue);
				return;
			case GRRBACPackage.POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT__TEMPORAL_CONTEXT:
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
			case GRRBACPackage.POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GRRBACPackage.POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT__TEMPORAL_CONTEXT:
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
			case GRRBACPackage.POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GRRBACPackage.POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT__TEMPORAL_CONTEXT:
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
		result.append(')');
		return result.toString();
	}

} //PolicyDependentAuthorizationConstraintImpl
