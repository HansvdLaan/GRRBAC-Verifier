/**
 */
package com.vanderhighway.grrbac.model.grrbac.model.impl;

import com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage;
import com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfMonth;
import com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfWeekMonth;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Valid Day Of Month</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.ValidDayOfMonthImpl#getValidDaysOfWeekMonth <em>Valid Days Of Week Month</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValidDayOfMonthImpl extends ValidDayImpl implements ValidDayOfMonth {
	/**
	 * The cached value of the '{@link #getValidDaysOfWeekMonth() <em>Valid Days Of Week Month</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidDaysOfWeekMonth()
	 * @generated
	 * @ordered
	 */
	protected EList<ValidDayOfWeekMonth> validDaysOfWeekMonth;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValidDayOfMonthImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GRRBACPackage.Literals.VALID_DAY_OF_MONTH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ValidDayOfWeekMonth> getValidDaysOfWeekMonth() {
		if (validDaysOfWeekMonth == null) {
			validDaysOfWeekMonth = new EObjectWithInverseResolvingEList<ValidDayOfWeekMonth>(ValidDayOfWeekMonth.class, this, GRRBACPackage.VALID_DAY_OF_MONTH__VALID_DAYS_OF_WEEK_MONTH, GRRBACPackage.VALID_DAY_OF_WEEK_MONTH__VALID_DAY_OF_MONTH);
		}
		return validDaysOfWeekMonth;
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
			case GRRBACPackage.VALID_DAY_OF_MONTH__VALID_DAYS_OF_WEEK_MONTH:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getValidDaysOfWeekMonth()).basicAdd(otherEnd, msgs);
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
			case GRRBACPackage.VALID_DAY_OF_MONTH__VALID_DAYS_OF_WEEK_MONTH:
				return ((InternalEList<?>)getValidDaysOfWeekMonth()).basicRemove(otherEnd, msgs);
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
			case GRRBACPackage.VALID_DAY_OF_MONTH__VALID_DAYS_OF_WEEK_MONTH:
				return getValidDaysOfWeekMonth();
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
			case GRRBACPackage.VALID_DAY_OF_MONTH__VALID_DAYS_OF_WEEK_MONTH:
				getValidDaysOfWeekMonth().clear();
				getValidDaysOfWeekMonth().addAll((Collection<? extends ValidDayOfWeekMonth>)newValue);
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
			case GRRBACPackage.VALID_DAY_OF_MONTH__VALID_DAYS_OF_WEEK_MONTH:
				getValidDaysOfWeekMonth().clear();
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
			case GRRBACPackage.VALID_DAY_OF_MONTH__VALID_DAYS_OF_WEEK_MONTH:
				return validDaysOfWeekMonth != null && !validDaysOfWeekMonth.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ValidDayOfMonthImpl
