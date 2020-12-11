/**
 */
package com.vanderhighway.grrbac.model.grrbac.model.impl;

import com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage;
import com.vanderhighway.grrbac.model.grrbac.model.ValidDayOfWeek;
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
 * An implementation of the model object '<em><b>Valid Day Of Week</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.ValidDayOfWeekImpl#getValidDayOfWeekMonth <em>Valid Day Of Week Month</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValidDayOfWeekImpl extends ValidDayImpl implements ValidDayOfWeek {
	/**
	 * The cached value of the '{@link #getValidDayOfWeekMonth() <em>Valid Day Of Week Month</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidDayOfWeekMonth()
	 * @generated
	 * @ordered
	 */
	protected EList<ValidDayOfWeekMonth> validDayOfWeekMonth;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValidDayOfWeekImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GRRBACPackage.Literals.VALID_DAY_OF_WEEK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ValidDayOfWeekMonth> getValidDayOfWeekMonth() {
		if (validDayOfWeekMonth == null) {
			validDayOfWeekMonth = new EObjectWithInverseResolvingEList<ValidDayOfWeekMonth>(ValidDayOfWeekMonth.class, this, GRRBACPackage.VALID_DAY_OF_WEEK__VALID_DAY_OF_WEEK_MONTH, GRRBACPackage.VALID_DAY_OF_WEEK_MONTH__VALID_DAY_OF_WEEK);
		}
		return validDayOfWeekMonth;
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
			case GRRBACPackage.VALID_DAY_OF_WEEK__VALID_DAY_OF_WEEK_MONTH:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getValidDayOfWeekMonth()).basicAdd(otherEnd, msgs);
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
			case GRRBACPackage.VALID_DAY_OF_WEEK__VALID_DAY_OF_WEEK_MONTH:
				return ((InternalEList<?>)getValidDayOfWeekMonth()).basicRemove(otherEnd, msgs);
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
			case GRRBACPackage.VALID_DAY_OF_WEEK__VALID_DAY_OF_WEEK_MONTH:
				return getValidDayOfWeekMonth();
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
			case GRRBACPackage.VALID_DAY_OF_WEEK__VALID_DAY_OF_WEEK_MONTH:
				getValidDayOfWeekMonth().clear();
				getValidDayOfWeekMonth().addAll((Collection<? extends ValidDayOfWeekMonth>)newValue);
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
			case GRRBACPackage.VALID_DAY_OF_WEEK__VALID_DAY_OF_WEEK_MONTH:
				getValidDayOfWeekMonth().clear();
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
			case GRRBACPackage.VALID_DAY_OF_WEEK__VALID_DAY_OF_WEEK_MONTH:
				return validDayOfWeekMonth != null && !validDayOfWeekMonth.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ValidDayOfWeekImpl
