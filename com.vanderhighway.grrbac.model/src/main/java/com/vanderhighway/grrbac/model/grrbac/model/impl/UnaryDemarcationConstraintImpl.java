/**
 */
package com.vanderhighway.grrbac.model.grrbac.model.impl;

import com.vanderhighway.grrbac.model.grrbac.model.Demarcation;
import com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage;
import com.vanderhighway.grrbac.model.grrbac.model.UnaryDemarcationConstraint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unary Demarcation Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.UnaryDemarcationConstraintImpl#getDemarcation <em>Demarcation</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UnaryDemarcationConstraintImpl extends PolicyDependentAuthorizationConstraintImpl implements UnaryDemarcationConstraint {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnaryDemarcationConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GRRBACPackage.Literals.UNARY_DEMARCATION_CONSTRAINT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GRRBACPackage.UNARY_DEMARCATION_CONSTRAINT__DEMARCATION, oldDemarcation, demarcation));
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
	@Override
	public void setDemarcation(Demarcation newDemarcation) {
		Demarcation oldDemarcation = demarcation;
		demarcation = newDemarcation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRRBACPackage.UNARY_DEMARCATION_CONSTRAINT__DEMARCATION, oldDemarcation, demarcation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GRRBACPackage.UNARY_DEMARCATION_CONSTRAINT__DEMARCATION:
				if (resolve) return getDemarcation();
				return basicGetDemarcation();
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
			case GRRBACPackage.UNARY_DEMARCATION_CONSTRAINT__DEMARCATION:
				setDemarcation((Demarcation)newValue);
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
			case GRRBACPackage.UNARY_DEMARCATION_CONSTRAINT__DEMARCATION:
				setDemarcation((Demarcation)null);
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
			case GRRBACPackage.UNARY_DEMARCATION_CONSTRAINT__DEMARCATION:
				return demarcation != null;
		}
		return super.eIsSet(featureID);
	}

} //UnaryDemarcationConstraintImpl
