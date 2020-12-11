/**
 */
package com.vanderhighway.grrbac.model.grrbac.model.impl;

import com.vanderhighway.grrbac.model.grrbac.model.AuthorizationPolicy;
import com.vanderhighway.grrbac.model.grrbac.model.Demarcation;
import com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage;
import com.vanderhighway.grrbac.model.grrbac.model.Permission;
import com.vanderhighway.grrbac.model.grrbac.model.Role;
import com.vanderhighway.grrbac.model.grrbac.model.TemporalGrantRule;
import com.vanderhighway.grrbac.model.grrbac.model.User;

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
 * An implementation of the model object '<em><b>Authorization Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.AuthorizationPolicyImpl#getUsers <em>Users</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.AuthorizationPolicyImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.AuthorizationPolicyImpl#getDemarcations <em>Demarcations</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.AuthorizationPolicyImpl#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.AuthorizationPolicyImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.AuthorizationPolicyImpl#getTemporalGrantRules <em>Temporal Grant Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuthorizationPolicyImpl extends MinimalEObjectImpl.Container implements AuthorizationPolicy {
	/**
	 * The cached value of the '{@link #getUsers() <em>Users</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsers()
	 * @generated
	 * @ordered
	 */
	protected EList<User> users;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> roles;

	/**
	 * The cached value of the '{@link #getDemarcations() <em>Demarcations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDemarcations()
	 * @generated
	 * @ordered
	 */
	protected EList<Demarcation> demarcations;

	/**
	 * The cached value of the '{@link #getPermissions() <em>Permissions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissions()
	 * @generated
	 * @ordered
	 */
	protected EList<Permission> permissions;

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
	 * The cached value of the '{@link #getTemporalGrantRules() <em>Temporal Grant Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporalGrantRules()
	 * @generated
	 * @ordered
	 */
	protected EList<TemporalGrantRule> temporalGrantRules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthorizationPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GRRBACPackage.Literals.AUTHORIZATION_POLICY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<User> getUsers() {
		if (users == null) {
			users = new EObjectContainmentEList<User>(User.class, this, GRRBACPackage.AUTHORIZATION_POLICY__USERS);
		}
		return users;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentEList<Role>(Role.class, this, GRRBACPackage.AUTHORIZATION_POLICY__ROLES);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Demarcation> getDemarcations() {
		if (demarcations == null) {
			demarcations = new EObjectContainmentEList<Demarcation>(Demarcation.class, this, GRRBACPackage.AUTHORIZATION_POLICY__DEMARCATIONS);
		}
		return demarcations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Permission> getPermissions() {
		if (permissions == null) {
			permissions = new EObjectContainmentEList<Permission>(Permission.class, this, GRRBACPackage.AUTHORIZATION_POLICY__PERMISSIONS);
		}
		return permissions;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GRRBACPackage.AUTHORIZATION_POLICY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TemporalGrantRule> getTemporalGrantRules() {
		if (temporalGrantRules == null) {
			temporalGrantRules = new EObjectContainmentEList<TemporalGrantRule>(TemporalGrantRule.class, this, GRRBACPackage.AUTHORIZATION_POLICY__TEMPORAL_GRANT_RULES);
		}
		return temporalGrantRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GRRBACPackage.AUTHORIZATION_POLICY__USERS:
				return ((InternalEList<?>)getUsers()).basicRemove(otherEnd, msgs);
			case GRRBACPackage.AUTHORIZATION_POLICY__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
			case GRRBACPackage.AUTHORIZATION_POLICY__DEMARCATIONS:
				return ((InternalEList<?>)getDemarcations()).basicRemove(otherEnd, msgs);
			case GRRBACPackage.AUTHORIZATION_POLICY__PERMISSIONS:
				return ((InternalEList<?>)getPermissions()).basicRemove(otherEnd, msgs);
			case GRRBACPackage.AUTHORIZATION_POLICY__TEMPORAL_GRANT_RULES:
				return ((InternalEList<?>)getTemporalGrantRules()).basicRemove(otherEnd, msgs);
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
			case GRRBACPackage.AUTHORIZATION_POLICY__USERS:
				return getUsers();
			case GRRBACPackage.AUTHORIZATION_POLICY__ROLES:
				return getRoles();
			case GRRBACPackage.AUTHORIZATION_POLICY__DEMARCATIONS:
				return getDemarcations();
			case GRRBACPackage.AUTHORIZATION_POLICY__PERMISSIONS:
				return getPermissions();
			case GRRBACPackage.AUTHORIZATION_POLICY__NAME:
				return getName();
			case GRRBACPackage.AUTHORIZATION_POLICY__TEMPORAL_GRANT_RULES:
				return getTemporalGrantRules();
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
			case GRRBACPackage.AUTHORIZATION_POLICY__USERS:
				getUsers().clear();
				getUsers().addAll((Collection<? extends User>)newValue);
				return;
			case GRRBACPackage.AUTHORIZATION_POLICY__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case GRRBACPackage.AUTHORIZATION_POLICY__DEMARCATIONS:
				getDemarcations().clear();
				getDemarcations().addAll((Collection<? extends Demarcation>)newValue);
				return;
			case GRRBACPackage.AUTHORIZATION_POLICY__PERMISSIONS:
				getPermissions().clear();
				getPermissions().addAll((Collection<? extends Permission>)newValue);
				return;
			case GRRBACPackage.AUTHORIZATION_POLICY__NAME:
				setName((String)newValue);
				return;
			case GRRBACPackage.AUTHORIZATION_POLICY__TEMPORAL_GRANT_RULES:
				getTemporalGrantRules().clear();
				getTemporalGrantRules().addAll((Collection<? extends TemporalGrantRule>)newValue);
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
			case GRRBACPackage.AUTHORIZATION_POLICY__USERS:
				getUsers().clear();
				return;
			case GRRBACPackage.AUTHORIZATION_POLICY__ROLES:
				getRoles().clear();
				return;
			case GRRBACPackage.AUTHORIZATION_POLICY__DEMARCATIONS:
				getDemarcations().clear();
				return;
			case GRRBACPackage.AUTHORIZATION_POLICY__PERMISSIONS:
				getPermissions().clear();
				return;
			case GRRBACPackage.AUTHORIZATION_POLICY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GRRBACPackage.AUTHORIZATION_POLICY__TEMPORAL_GRANT_RULES:
				getTemporalGrantRules().clear();
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
			case GRRBACPackage.AUTHORIZATION_POLICY__USERS:
				return users != null && !users.isEmpty();
			case GRRBACPackage.AUTHORIZATION_POLICY__ROLES:
				return roles != null && !roles.isEmpty();
			case GRRBACPackage.AUTHORIZATION_POLICY__DEMARCATIONS:
				return demarcations != null && !demarcations.isEmpty();
			case GRRBACPackage.AUTHORIZATION_POLICY__PERMISSIONS:
				return permissions != null && !permissions.isEmpty();
			case GRRBACPackage.AUTHORIZATION_POLICY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GRRBACPackage.AUTHORIZATION_POLICY__TEMPORAL_GRANT_RULES:
				return temporalGrantRules != null && !temporalGrantRules.isEmpty();
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

} //AuthorizationPolicyImpl
