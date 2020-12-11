/**
 */
package com.vanderhighway.grrbac.model.grrbac.model.impl;

import com.vanderhighway.grrbac.model.grrbac.model.AuthenticationPolicy;
import com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage;
import com.vanderhighway.grrbac.model.grrbac.model.TemporalAuthenticationRule;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authentication Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.AuthenticationPolicyImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.AuthenticationPolicyImpl#getTemporalAuthenticationRules <em>Temporal Authentication Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuthenticationPolicyImpl extends MinimalEObjectImpl.Container implements AuthenticationPolicy {
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
	 * The cached value of the '{@link #getTemporalAuthenticationRules() <em>Temporal Authentication Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporalAuthenticationRules()
	 * @generated
	 * @ordered
	 */
	protected EList<TemporalAuthenticationRule> temporalAuthenticationRules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthenticationPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GRRBACPackage.Literals.AUTHENTICATION_POLICY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GRRBACPackage.AUTHENTICATION_POLICY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TemporalAuthenticationRule> getTemporalAuthenticationRules() {
		if (temporalAuthenticationRules == null) {
			temporalAuthenticationRules = new EObjectContainmentEList<TemporalAuthenticationRule>(TemporalAuthenticationRule.class, this, GRRBACPackage.AUTHENTICATION_POLICY__TEMPORAL_AUTHENTICATION_RULES);
		}
		return temporalAuthenticationRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GRRBACPackage.AUTHENTICATION_POLICY__TEMPORAL_AUTHENTICATION_RULES:
				return ((InternalEList<?>)getTemporalAuthenticationRules()).basicRemove(otherEnd, msgs);
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
			case GRRBACPackage.AUTHENTICATION_POLICY__NAME:
				return getName();
			case GRRBACPackage.AUTHENTICATION_POLICY__TEMPORAL_AUTHENTICATION_RULES:
				return getTemporalAuthenticationRules();
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
			case GRRBACPackage.AUTHENTICATION_POLICY__NAME:
				setName((String)newValue);
				return;
			case GRRBACPackage.AUTHENTICATION_POLICY__TEMPORAL_AUTHENTICATION_RULES:
				getTemporalAuthenticationRules().clear();
				getTemporalAuthenticationRules().addAll((Collection<? extends TemporalAuthenticationRule>)newValue);
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
			case GRRBACPackage.AUTHENTICATION_POLICY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GRRBACPackage.AUTHENTICATION_POLICY__TEMPORAL_AUTHENTICATION_RULES:
				getTemporalAuthenticationRules().clear();
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
			case GRRBACPackage.AUTHENTICATION_POLICY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GRRBACPackage.AUTHENTICATION_POLICY__TEMPORAL_AUTHENTICATION_RULES:
				return temporalAuthenticationRules != null && !temporalAuthenticationRules.isEmpty();
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

} //AuthenticationPolicyImpl
