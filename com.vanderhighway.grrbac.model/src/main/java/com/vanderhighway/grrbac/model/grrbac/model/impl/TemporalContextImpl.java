/**
 */
package com.vanderhighway.grrbac.model.grrbac.model.impl;

import com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage;
import com.vanderhighway.grrbac.model.grrbac.model.MyScenario;
import com.vanderhighway.grrbac.model.grrbac.model.PolicyDependentAuthorizationConstraint;
import com.vanderhighway.grrbac.model.grrbac.model.TemporalAuthenticationRule;
import com.vanderhighway.grrbac.model.grrbac.model.TemporalContext;
import com.vanderhighway.grrbac.model.grrbac.model.TemporalGrantRule;
import com.vanderhighway.grrbac.model.grrbac.model.TimeRange;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Temporal Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.TemporalContextImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.TemporalContextImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.TemporalContextImpl#getTemporalGrantRules <em>Temporal Grant Rules</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.TemporalContextImpl#getAuthorizationConstraints <em>Authorization Constraints</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.TemporalContextImpl#getTemporalAuthenticationRules <em>Temporal Authentication Rules</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.TemporalContextImpl#getMyScenarios <em>My Scenarios</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemporalContextImpl extends MinimalEObjectImpl.Container implements TemporalContext {
	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<TimeRange> instances;

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
	 * The cached value of the '{@link #getTemporalGrantRules() <em>Temporal Grant Rules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporalGrantRules()
	 * @generated
	 * @ordered
	 */
	protected EList<TemporalGrantRule> temporalGrantRules;

	/**
	 * The cached value of the '{@link #getAuthorizationConstraints() <em>Authorization Constraints</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizationConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<PolicyDependentAuthorizationConstraint> authorizationConstraints;

	/**
	 * The cached value of the '{@link #getTemporalAuthenticationRules() <em>Temporal Authentication Rules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporalAuthenticationRules()
	 * @generated
	 * @ordered
	 */
	protected EList<TemporalAuthenticationRule> temporalAuthenticationRules;

	/**
	 * The cached value of the '{@link #getMyScenarios() <em>My Scenarios</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyScenarios()
	 * @generated
	 * @ordered
	 */
	protected EList<MyScenario> myScenarios;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemporalContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GRRBACPackage.Literals.TEMPORAL_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TimeRange> getInstances() {
		if (instances == null) {
			instances = new EObjectContainmentEList<TimeRange>(TimeRange.class, this, GRRBACPackage.TEMPORAL_CONTEXT__INSTANCES);
		}
		return instances;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GRRBACPackage.TEMPORAL_CONTEXT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TemporalGrantRule> getTemporalGrantRules() {
		if (temporalGrantRules == null) {
			temporalGrantRules = new EObjectWithInverseResolvingEList<TemporalGrantRule>(TemporalGrantRule.class, this, GRRBACPackage.TEMPORAL_CONTEXT__TEMPORAL_GRANT_RULES, GRRBACPackage.TEMPORAL_GRANT_RULE__TEMPORAL_CONTEXT);
		}
		return temporalGrantRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PolicyDependentAuthorizationConstraint> getAuthorizationConstraints() {
		if (authorizationConstraints == null) {
			authorizationConstraints = new EObjectWithInverseResolvingEList<PolicyDependentAuthorizationConstraint>(PolicyDependentAuthorizationConstraint.class, this, GRRBACPackage.TEMPORAL_CONTEXT__AUTHORIZATION_CONSTRAINTS, GRRBACPackage.POLICY_DEPENDENT_AUTHORIZATION_CONSTRAINT__TEMPORAL_CONTEXT);
		}
		return authorizationConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TemporalAuthenticationRule> getTemporalAuthenticationRules() {
		if (temporalAuthenticationRules == null) {
			temporalAuthenticationRules = new EObjectWithInverseResolvingEList<TemporalAuthenticationRule>(TemporalAuthenticationRule.class, this, GRRBACPackage.TEMPORAL_CONTEXT__TEMPORAL_AUTHENTICATION_RULES, GRRBACPackage.TEMPORAL_AUTHENTICATION_RULE__TEMPORAL_CONTEXT);
		}
		return temporalAuthenticationRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MyScenario> getMyScenarios() {
		if (myScenarios == null) {
			myScenarios = new EObjectWithInverseResolvingEList.ManyInverse<MyScenario>(MyScenario.class, this, GRRBACPackage.TEMPORAL_CONTEXT__MY_SCENARIOS, GRRBACPackage.MY_SCENARIO__TEMPORAL_CONTEXTS);
		}
		return myScenarios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GRRBACPackage.TEMPORAL_CONTEXT__TEMPORAL_GRANT_RULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTemporalGrantRules()).basicAdd(otherEnd, msgs);
			case GRRBACPackage.TEMPORAL_CONTEXT__AUTHORIZATION_CONSTRAINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAuthorizationConstraints()).basicAdd(otherEnd, msgs);
			case GRRBACPackage.TEMPORAL_CONTEXT__TEMPORAL_AUTHENTICATION_RULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTemporalAuthenticationRules()).basicAdd(otherEnd, msgs);
			case GRRBACPackage.TEMPORAL_CONTEXT__MY_SCENARIOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMyScenarios()).basicAdd(otherEnd, msgs);
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
			case GRRBACPackage.TEMPORAL_CONTEXT__INSTANCES:
				return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
			case GRRBACPackage.TEMPORAL_CONTEXT__TEMPORAL_GRANT_RULES:
				return ((InternalEList<?>)getTemporalGrantRules()).basicRemove(otherEnd, msgs);
			case GRRBACPackage.TEMPORAL_CONTEXT__AUTHORIZATION_CONSTRAINTS:
				return ((InternalEList<?>)getAuthorizationConstraints()).basicRemove(otherEnd, msgs);
			case GRRBACPackage.TEMPORAL_CONTEXT__TEMPORAL_AUTHENTICATION_RULES:
				return ((InternalEList<?>)getTemporalAuthenticationRules()).basicRemove(otherEnd, msgs);
			case GRRBACPackage.TEMPORAL_CONTEXT__MY_SCENARIOS:
				return ((InternalEList<?>)getMyScenarios()).basicRemove(otherEnd, msgs);
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
			case GRRBACPackage.TEMPORAL_CONTEXT__INSTANCES:
				return getInstances();
			case GRRBACPackage.TEMPORAL_CONTEXT__NAME:
				return getName();
			case GRRBACPackage.TEMPORAL_CONTEXT__TEMPORAL_GRANT_RULES:
				return getTemporalGrantRules();
			case GRRBACPackage.TEMPORAL_CONTEXT__AUTHORIZATION_CONSTRAINTS:
				return getAuthorizationConstraints();
			case GRRBACPackage.TEMPORAL_CONTEXT__TEMPORAL_AUTHENTICATION_RULES:
				return getTemporalAuthenticationRules();
			case GRRBACPackage.TEMPORAL_CONTEXT__MY_SCENARIOS:
				return getMyScenarios();
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
			case GRRBACPackage.TEMPORAL_CONTEXT__INSTANCES:
				getInstances().clear();
				getInstances().addAll((Collection<? extends TimeRange>)newValue);
				return;
			case GRRBACPackage.TEMPORAL_CONTEXT__NAME:
				setName((String)newValue);
				return;
			case GRRBACPackage.TEMPORAL_CONTEXT__TEMPORAL_GRANT_RULES:
				getTemporalGrantRules().clear();
				getTemporalGrantRules().addAll((Collection<? extends TemporalGrantRule>)newValue);
				return;
			case GRRBACPackage.TEMPORAL_CONTEXT__AUTHORIZATION_CONSTRAINTS:
				getAuthorizationConstraints().clear();
				getAuthorizationConstraints().addAll((Collection<? extends PolicyDependentAuthorizationConstraint>)newValue);
				return;
			case GRRBACPackage.TEMPORAL_CONTEXT__TEMPORAL_AUTHENTICATION_RULES:
				getTemporalAuthenticationRules().clear();
				getTemporalAuthenticationRules().addAll((Collection<? extends TemporalAuthenticationRule>)newValue);
				return;
			case GRRBACPackage.TEMPORAL_CONTEXT__MY_SCENARIOS:
				getMyScenarios().clear();
				getMyScenarios().addAll((Collection<? extends MyScenario>)newValue);
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
			case GRRBACPackage.TEMPORAL_CONTEXT__INSTANCES:
				getInstances().clear();
				return;
			case GRRBACPackage.TEMPORAL_CONTEXT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GRRBACPackage.TEMPORAL_CONTEXT__TEMPORAL_GRANT_RULES:
				getTemporalGrantRules().clear();
				return;
			case GRRBACPackage.TEMPORAL_CONTEXT__AUTHORIZATION_CONSTRAINTS:
				getAuthorizationConstraints().clear();
				return;
			case GRRBACPackage.TEMPORAL_CONTEXT__TEMPORAL_AUTHENTICATION_RULES:
				getTemporalAuthenticationRules().clear();
				return;
			case GRRBACPackage.TEMPORAL_CONTEXT__MY_SCENARIOS:
				getMyScenarios().clear();
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
			case GRRBACPackage.TEMPORAL_CONTEXT__INSTANCES:
				return instances != null && !instances.isEmpty();
			case GRRBACPackage.TEMPORAL_CONTEXT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GRRBACPackage.TEMPORAL_CONTEXT__TEMPORAL_GRANT_RULES:
				return temporalGrantRules != null && !temporalGrantRules.isEmpty();
			case GRRBACPackage.TEMPORAL_CONTEXT__AUTHORIZATION_CONSTRAINTS:
				return authorizationConstraints != null && !authorizationConstraints.isEmpty();
			case GRRBACPackage.TEMPORAL_CONTEXT__TEMPORAL_AUTHENTICATION_RULES:
				return temporalAuthenticationRules != null && !temporalAuthenticationRules.isEmpty();
			case GRRBACPackage.TEMPORAL_CONTEXT__MY_SCENARIOS:
				return myScenarios != null && !myScenarios.isEmpty();
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

} //TemporalContextImpl
