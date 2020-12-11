/**
 */
package com.vanderhighway.grrbac.model.grrbac.model.impl;

import com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage;
import com.vanderhighway.grrbac.model.grrbac.model.MyScenario;
import com.vanderhighway.grrbac.model.grrbac.model.TemporalContext;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>My Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.MyScenarioImpl#getTemporalContexts <em>Temporal Contexts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MyScenarioImpl extends MinimalEObjectImpl.Container implements MyScenario {
	/**
	 * The cached value of the '{@link #getTemporalContexts() <em>Temporal Contexts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporalContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<TemporalContext> temporalContexts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MyScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GRRBACPackage.Literals.MY_SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TemporalContext> getTemporalContexts() {
		if (temporalContexts == null) {
			temporalContexts = new EObjectWithInverseResolvingEList.ManyInverse<TemporalContext>(TemporalContext.class, this, GRRBACPackage.MY_SCENARIO__TEMPORAL_CONTEXTS, GRRBACPackage.TEMPORAL_CONTEXT__MY_SCENARIOS);
		}
		return temporalContexts;
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
			case GRRBACPackage.MY_SCENARIO__TEMPORAL_CONTEXTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTemporalContexts()).basicAdd(otherEnd, msgs);
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
			case GRRBACPackage.MY_SCENARIO__TEMPORAL_CONTEXTS:
				return ((InternalEList<?>)getTemporalContexts()).basicRemove(otherEnd, msgs);
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
			case GRRBACPackage.MY_SCENARIO__TEMPORAL_CONTEXTS:
				return getTemporalContexts();
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
			case GRRBACPackage.MY_SCENARIO__TEMPORAL_CONTEXTS:
				getTemporalContexts().clear();
				getTemporalContexts().addAll((Collection<? extends TemporalContext>)newValue);
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
			case GRRBACPackage.MY_SCENARIO__TEMPORAL_CONTEXTS:
				getTemporalContexts().clear();
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
			case GRRBACPackage.MY_SCENARIO__TEMPORAL_CONTEXTS:
				return temporalContexts != null && !temporalContexts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MyScenarioImpl
