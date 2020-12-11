/**
 */
package com.vanderhighway.grrbac.model.grrbac.model.impl;

import com.vanderhighway.grrbac.model.grrbac.model.ContextContainer;
import com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage;
import com.vanderhighway.grrbac.model.grrbac.model.MyScenario;
import com.vanderhighway.grrbac.model.grrbac.model.TemporalContext;
import com.vanderhighway.grrbac.model.grrbac.model.ValidDay;

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
 * An implementation of the model object '<em><b>Context Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.ContextContainerImpl#getTemporalContexts <em>Temporal Contexts</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.ContextContainerImpl#getValidDays <em>Valid Days</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.ContextContainerImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.ContextContainerImpl#getMyScenarios <em>My Scenarios</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextContainerImpl extends MinimalEObjectImpl.Container implements ContextContainer {
	/**
	 * The cached value of the '{@link #getTemporalContexts() <em>Temporal Contexts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporalContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<TemporalContext> temporalContexts;

	/**
	 * The cached value of the '{@link #getValidDays() <em>Valid Days</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidDays()
	 * @generated
	 * @ordered
	 */
	protected EList<ValidDay> validDays;

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
	 * The cached value of the '{@link #getMyScenarios() <em>My Scenarios</em>}' containment reference list.
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
	protected ContextContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GRRBACPackage.Literals.CONTEXT_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TemporalContext> getTemporalContexts() {
		if (temporalContexts == null) {
			temporalContexts = new EObjectContainmentEList<TemporalContext>(TemporalContext.class, this, GRRBACPackage.CONTEXT_CONTAINER__TEMPORAL_CONTEXTS);
		}
		return temporalContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ValidDay> getValidDays() {
		if (validDays == null) {
			validDays = new EObjectContainmentEList<ValidDay>(ValidDay.class, this, GRRBACPackage.CONTEXT_CONTAINER__VALID_DAYS);
		}
		return validDays;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GRRBACPackage.CONTEXT_CONTAINER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MyScenario> getMyScenarios() {
		if (myScenarios == null) {
			myScenarios = new EObjectContainmentEList<MyScenario>(MyScenario.class, this, GRRBACPackage.CONTEXT_CONTAINER__MY_SCENARIOS);
		}
		return myScenarios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GRRBACPackage.CONTEXT_CONTAINER__TEMPORAL_CONTEXTS:
				return ((InternalEList<?>)getTemporalContexts()).basicRemove(otherEnd, msgs);
			case GRRBACPackage.CONTEXT_CONTAINER__VALID_DAYS:
				return ((InternalEList<?>)getValidDays()).basicRemove(otherEnd, msgs);
			case GRRBACPackage.CONTEXT_CONTAINER__MY_SCENARIOS:
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
			case GRRBACPackage.CONTEXT_CONTAINER__TEMPORAL_CONTEXTS:
				return getTemporalContexts();
			case GRRBACPackage.CONTEXT_CONTAINER__VALID_DAYS:
				return getValidDays();
			case GRRBACPackage.CONTEXT_CONTAINER__NAME:
				return getName();
			case GRRBACPackage.CONTEXT_CONTAINER__MY_SCENARIOS:
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
			case GRRBACPackage.CONTEXT_CONTAINER__TEMPORAL_CONTEXTS:
				getTemporalContexts().clear();
				getTemporalContexts().addAll((Collection<? extends TemporalContext>)newValue);
				return;
			case GRRBACPackage.CONTEXT_CONTAINER__VALID_DAYS:
				getValidDays().clear();
				getValidDays().addAll((Collection<? extends ValidDay>)newValue);
				return;
			case GRRBACPackage.CONTEXT_CONTAINER__NAME:
				setName((String)newValue);
				return;
			case GRRBACPackage.CONTEXT_CONTAINER__MY_SCENARIOS:
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
			case GRRBACPackage.CONTEXT_CONTAINER__TEMPORAL_CONTEXTS:
				getTemporalContexts().clear();
				return;
			case GRRBACPackage.CONTEXT_CONTAINER__VALID_DAYS:
				getValidDays().clear();
				return;
			case GRRBACPackage.CONTEXT_CONTAINER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GRRBACPackage.CONTEXT_CONTAINER__MY_SCENARIOS:
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
			case GRRBACPackage.CONTEXT_CONTAINER__TEMPORAL_CONTEXTS:
				return temporalContexts != null && !temporalContexts.isEmpty();
			case GRRBACPackage.CONTEXT_CONTAINER__VALID_DAYS:
				return validDays != null && !validDays.isEmpty();
			case GRRBACPackage.CONTEXT_CONTAINER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GRRBACPackage.CONTEXT_CONTAINER__MY_SCENARIOS:
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

} //ContextContainerImpl
