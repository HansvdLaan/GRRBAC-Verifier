/**
 */
package com.vanderhighway.grrbac.model.grrbac.model.impl;

import com.vanderhighway.grrbac.model.grrbac.model.AccessControlSystemTopology;
import com.vanderhighway.grrbac.model.grrbac.model.AuthenticationPolicy;
import com.vanderhighway.grrbac.model.grrbac.model.AuthorizationPolicy;
import com.vanderhighway.grrbac.model.grrbac.model.ContextContainer;
import com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage;
import com.vanderhighway.grrbac.model.grrbac.model.PolicyDependentAuthorizationConstraint;
import com.vanderhighway.grrbac.model.grrbac.model.SiteAccessControlSystem;

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
 * An implementation of the model object '<em><b>Site Access Control System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.SiteAccessControlSystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.SiteAccessControlSystemImpl#getAuthorizationConstraints <em>Authorization Constraints</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.SiteAccessControlSystemImpl#getAuthorizationPolicy <em>Authorization Policy</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.SiteAccessControlSystemImpl#getContextContainer <em>Context Container</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.SiteAccessControlSystemImpl#getAuthenticationPolicy <em>Authentication Policy</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.SiteAccessControlSystemImpl#getTopology <em>Topology</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SiteAccessControlSystemImpl extends MinimalEObjectImpl.Container implements SiteAccessControlSystem {
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
	 * The cached value of the '{@link #getAuthorizationConstraints() <em>Authorization Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizationConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<PolicyDependentAuthorizationConstraint> authorizationConstraints;

	/**
	 * The cached value of the '{@link #getAuthorizationPolicy() <em>Authorization Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizationPolicy()
	 * @generated
	 * @ordered
	 */
	protected AuthorizationPolicy authorizationPolicy;

	/**
	 * The cached value of the '{@link #getContextContainer() <em>Context Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextContainer()
	 * @generated
	 * @ordered
	 */
	protected ContextContainer contextContainer;

	/**
	 * The cached value of the '{@link #getAuthenticationPolicy() <em>Authentication Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationPolicy()
	 * @generated
	 * @ordered
	 */
	protected AuthenticationPolicy authenticationPolicy;

	/**
	 * The cached value of the '{@link #getTopology() <em>Topology</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopology()
	 * @generated
	 * @ordered
	 */
	protected AccessControlSystemTopology topology;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SiteAccessControlSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GRRBACPackage.Literals.SITE_ACCESS_CONTROL_SYSTEM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GRRBACPackage.SITE_ACCESS_CONTROL_SYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PolicyDependentAuthorizationConstraint> getAuthorizationConstraints() {
		if (authorizationConstraints == null) {
			authorizationConstraints = new EObjectContainmentEList<PolicyDependentAuthorizationConstraint>(PolicyDependentAuthorizationConstraint.class, this, GRRBACPackage.SITE_ACCESS_CONTROL_SYSTEM__AUTHORIZATION_CONSTRAINTS);
		}
		return authorizationConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthorizationPolicy getAuthorizationPolicy() {
		return authorizationPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthorizationPolicy(AuthorizationPolicy newAuthorizationPolicy, NotificationChain msgs) {
		AuthorizationPolicy oldAuthorizationPolicy = authorizationPolicy;
		authorizationPolicy = newAuthorizationPolicy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GRRBACPackage.SITE_ACCESS_CONTROL_SYSTEM__AUTHORIZATION_POLICY, oldAuthorizationPolicy, newAuthorizationPolicy);
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
	public void setAuthorizationPolicy(AuthorizationPolicy newAuthorizationPolicy) {
		if (newAuthorizationPolicy != authorizationPolicy) {
			NotificationChain msgs = null;
			if (authorizationPolicy != null)
				msgs = ((InternalEObject)authorizationPolicy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GRRBACPackage.SITE_ACCESS_CONTROL_SYSTEM__AUTHORIZATION_POLICY, null, msgs);
			if (newAuthorizationPolicy != null)
				msgs = ((InternalEObject)newAuthorizationPolicy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GRRBACPackage.SITE_ACCESS_CONTROL_SYSTEM__AUTHORIZATION_POLICY, null, msgs);
			msgs = basicSetAuthorizationPolicy(newAuthorizationPolicy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRRBACPackage.SITE_ACCESS_CONTROL_SYSTEM__AUTHORIZATION_POLICY, newAuthorizationPolicy, newAuthorizationPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContextContainer getContextContainer() {
		return contextContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContextContainer(ContextContainer newContextContainer, NotificationChain msgs) {
		ContextContainer oldContextContainer = contextContainer;
		contextContainer = newContextContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GRRBACPackage.SITE_ACCESS_CONTROL_SYSTEM__CONTEXT_CONTAINER, oldContextContainer, newContextContainer);
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
	public void setContextContainer(ContextContainer newContextContainer) {
		if (newContextContainer != contextContainer) {
			NotificationChain msgs = null;
			if (contextContainer != null)
				msgs = ((InternalEObject)contextContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GRRBACPackage.SITE_ACCESS_CONTROL_SYSTEM__CONTEXT_CONTAINER, null, msgs);
			if (newContextContainer != null)
				msgs = ((InternalEObject)newContextContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GRRBACPackage.SITE_ACCESS_CONTROL_SYSTEM__CONTEXT_CONTAINER, null, msgs);
			msgs = basicSetContextContainer(newContextContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRRBACPackage.SITE_ACCESS_CONTROL_SYSTEM__CONTEXT_CONTAINER, newContextContainer, newContextContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthenticationPolicy getAuthenticationPolicy() {
		return authenticationPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthenticationPolicy(AuthenticationPolicy newAuthenticationPolicy, NotificationChain msgs) {
		AuthenticationPolicy oldAuthenticationPolicy = authenticationPolicy;
		authenticationPolicy = newAuthenticationPolicy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GRRBACPackage.SITE_ACCESS_CONTROL_SYSTEM__AUTHENTICATION_POLICY, oldAuthenticationPolicy, newAuthenticationPolicy);
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
	public void setAuthenticationPolicy(AuthenticationPolicy newAuthenticationPolicy) {
		if (newAuthenticationPolicy != authenticationPolicy) {
			NotificationChain msgs = null;
			if (authenticationPolicy != null)
				msgs = ((InternalEObject)authenticationPolicy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GRRBACPackage.SITE_ACCESS_CONTROL_SYSTEM__AUTHENTICATION_POLICY, null, msgs);
			if (newAuthenticationPolicy != null)
				msgs = ((InternalEObject)newAuthenticationPolicy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GRRBACPackage.SITE_ACCESS_CONTROL_SYSTEM__AUTHENTICATION_POLICY, null, msgs);
			msgs = basicSetAuthenticationPolicy(newAuthenticationPolicy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRRBACPackage.SITE_ACCESS_CONTROL_SYSTEM__AUTHENTICATION_POLICY, newAuthenticationPolicy, newAuthenticationPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessControlSystemTopology getTopology() {
		return topology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopology(AccessControlSystemTopology newTopology, NotificationChain msgs) {
		AccessControlSystemTopology oldTopology = topology;
		topology = newTopology;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GRRBACPackage.SITE_ACCESS_CONTROL_SYSTEM__TOPOLOGY, oldTopology, newTopology);
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
	public void setTopology(AccessControlSystemTopology newTopology) {
		if (newTopology != topology) {
			NotificationChain msgs = null;
			if (topology != null)
				msgs = ((InternalEObject)topology).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GRRBACPackage.SITE_ACCESS_CONTROL_SYSTEM__TOPOLOGY, null, msgs);
			if (newTopology != null)
				msgs = ((InternalEObject)newTopology).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GRRBACPackage.SITE_ACCESS_CONTROL_SYSTEM__TOPOLOGY, null, msgs);
			msgs = basicSetTopology(newTopology, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRRBACPackage.SITE_ACCESS_CONTROL_SYSTEM__TOPOLOGY, newTopology, newTopology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GRRBACPackage.SITE_ACCESS_CONTROL_SYSTEM__AUTHORIZATION_CONSTRAINTS:
				return ((InternalEList<?>)getAuthorizationConstraints()).basicRemove(otherEnd, msgs);
			case GRRBACPackage.SITE_ACCESS_CONTROL_SYSTEM__AUTHORIZATION_POLICY:
				return basicSetAuthorizationPolicy(null, msgs);
			case GRRBACPackage.SITE_ACCESS_CONTROL_SYSTEM__CONTEXT_CONTAINER:
				return basicSetContextContainer(null, msgs);
			case GRRBACPackage.SITE_ACCESS_CONTROL_SYSTEM__AUTHENTICATION_POLICY:
				return basicSetAuthenticationPolicy(null, msgs);
			case GRRBACPackage.SITE_ACCESS_CONTROL_SYSTEM__TOPOLOGY:
				return basicSetTopology(null, msgs);
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
			case GRRBACPackage.SITE_ACCESS_CONTROL_SYSTEM__NAME:
				return getName();
			case GRRBACPackage.SITE_ACCESS_CONTROL_SYSTEM__AUTHORIZATION_CONSTRAINTS:
				return getAuthorizationConstraints();
			case GRRBACPackage.SITE_ACCESS_CONTROL_SYSTEM__AUTHORIZATION_POLICY:
				return getAuthorizationPolicy();
			case GRRBACPackage.SITE_ACCESS_CONTROL_SYSTEM__CONTEXT_CONTAINER:
				return getContextContainer();
			case GRRBACPackage.SITE_ACCESS_CONTROL_SYSTEM__AUTHENTICATION_POLICY:
				return getAuthenticationPolicy();
			case GRRBACPackage.SITE_ACCESS_CONTROL_SYSTEM__TOPOLOGY:
				return getTopology();
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
			case GRRBACPackage.SITE_ACCESS_CONTROL_SYSTEM__NAME:
				setName((String)newValue);
				return;
			case GRRBACPackage.SITE_ACCESS_CONTROL_SYSTEM__AUTHORIZATION_CONSTRAINTS:
				getAuthorizationConstraints().clear();
				getAuthorizationConstraints().addAll((Collection<? extends PolicyDependentAuthorizationConstraint>)newValue);
				return;
			case GRRBACPackage.SITE_ACCESS_CONTROL_SYSTEM__AUTHORIZATION_POLICY:
				setAuthorizationPolicy((AuthorizationPolicy)newValue);
				return;
			case GRRBACPackage.SITE_ACCESS_CONTROL_SYSTEM__CONTEXT_CONTAINER:
				setContextContainer((ContextContainer)newValue);
				return;
			case GRRBACPackage.SITE_ACCESS_CONTROL_SYSTEM__AUTHENTICATION_POLICY:
				setAuthenticationPolicy((AuthenticationPolicy)newValue);
				return;
			case GRRBACPackage.SITE_ACCESS_CONTROL_SYSTEM__TOPOLOGY:
				setTopology((AccessControlSystemTopology)newValue);
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
			case GRRBACPackage.SITE_ACCESS_CONTROL_SYSTEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GRRBACPackage.SITE_ACCESS_CONTROL_SYSTEM__AUTHORIZATION_CONSTRAINTS:
				getAuthorizationConstraints().clear();
				return;
			case GRRBACPackage.SITE_ACCESS_CONTROL_SYSTEM__AUTHORIZATION_POLICY:
				setAuthorizationPolicy((AuthorizationPolicy)null);
				return;
			case GRRBACPackage.SITE_ACCESS_CONTROL_SYSTEM__CONTEXT_CONTAINER:
				setContextContainer((ContextContainer)null);
				return;
			case GRRBACPackage.SITE_ACCESS_CONTROL_SYSTEM__AUTHENTICATION_POLICY:
				setAuthenticationPolicy((AuthenticationPolicy)null);
				return;
			case GRRBACPackage.SITE_ACCESS_CONTROL_SYSTEM__TOPOLOGY:
				setTopology((AccessControlSystemTopology)null);
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
			case GRRBACPackage.SITE_ACCESS_CONTROL_SYSTEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GRRBACPackage.SITE_ACCESS_CONTROL_SYSTEM__AUTHORIZATION_CONSTRAINTS:
				return authorizationConstraints != null && !authorizationConstraints.isEmpty();
			case GRRBACPackage.SITE_ACCESS_CONTROL_SYSTEM__AUTHORIZATION_POLICY:
				return authorizationPolicy != null;
			case GRRBACPackage.SITE_ACCESS_CONTROL_SYSTEM__CONTEXT_CONTAINER:
				return contextContainer != null;
			case GRRBACPackage.SITE_ACCESS_CONTROL_SYSTEM__AUTHENTICATION_POLICY:
				return authenticationPolicy != null;
			case GRRBACPackage.SITE_ACCESS_CONTROL_SYSTEM__TOPOLOGY:
				return topology != null;
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

} //SiteAccessControlSystemImpl
