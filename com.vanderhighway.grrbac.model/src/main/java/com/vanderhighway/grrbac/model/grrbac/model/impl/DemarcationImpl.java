/**
 */
package com.vanderhighway.grrbac.model.grrbac.model.impl;

import com.vanderhighway.grrbac.model.grrbac.model.Demarcation;
import com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage;
import com.vanderhighway.grrbac.model.grrbac.model.Permission;
import com.vanderhighway.grrbac.model.grrbac.model.Role;
import com.vanderhighway.grrbac.model.grrbac.model.TemporalGrantRule;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Demarcation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.DemarcationImpl#getDR <em>DR</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.DemarcationImpl#getDP <em>DP</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.DemarcationImpl#getSubdemarcations <em>Subdemarcations</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.DemarcationImpl#getSuperdemarcations <em>Superdemarcations</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.DemarcationImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.DemarcationImpl#getConstrainedBy <em>Constrained By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DemarcationImpl extends MinimalEObjectImpl.Container implements Demarcation {
	/**
	 * The cached value of the '{@link #getDR() <em>DR</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDR()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> dr;

	/**
	 * The cached value of the '{@link #getDP() <em>DP</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDP()
	 * @generated
	 * @ordered
	 */
	protected EList<Permission> dp;

	/**
	 * The cached value of the '{@link #getSubdemarcations() <em>Subdemarcations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubdemarcations()
	 * @generated
	 * @ordered
	 */
	protected EList<Demarcation> subdemarcations;

	/**
	 * The cached value of the '{@link #getSuperdemarcations() <em>Superdemarcations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperdemarcations()
	 * @generated
	 * @ordered
	 */
	protected EList<Demarcation> superdemarcations;

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
	 * The cached value of the '{@link #getConstrainedBy() <em>Constrained By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrainedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<TemporalGrantRule> constrainedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DemarcationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GRRBACPackage.Literals.DEMARCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Role> getDR() {
		if (dr == null) {
			dr = new EObjectWithInverseResolvingEList.ManyInverse<Role>(Role.class, this, GRRBACPackage.DEMARCATION__DR, GRRBACPackage.ROLE__RD);
		}
		return dr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Permission> getDP() {
		if (dp == null) {
			dp = new EObjectWithInverseResolvingEList.ManyInverse<Permission>(Permission.class, this, GRRBACPackage.DEMARCATION__DP, GRRBACPackage.PERMISSION__PD);
		}
		return dp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Demarcation> getSubdemarcations() {
		if (subdemarcations == null) {
			subdemarcations = new EObjectWithInverseResolvingEList.ManyInverse<Demarcation>(Demarcation.class, this, GRRBACPackage.DEMARCATION__SUBDEMARCATIONS, GRRBACPackage.DEMARCATION__SUPERDEMARCATIONS);
		}
		return subdemarcations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Demarcation> getSuperdemarcations() {
		if (superdemarcations == null) {
			superdemarcations = new EObjectWithInverseResolvingEList.ManyInverse<Demarcation>(Demarcation.class, this, GRRBACPackage.DEMARCATION__SUPERDEMARCATIONS, GRRBACPackage.DEMARCATION__SUBDEMARCATIONS);
		}
		return superdemarcations;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GRRBACPackage.DEMARCATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TemporalGrantRule> getConstrainedBy() {
		if (constrainedBy == null) {
			constrainedBy = new EObjectWithInverseResolvingEList<TemporalGrantRule>(TemporalGrantRule.class, this, GRRBACPackage.DEMARCATION__CONSTRAINED_BY, GRRBACPackage.TEMPORAL_GRANT_RULE__DEMARCATION);
		}
		return constrainedBy;
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
			case GRRBACPackage.DEMARCATION__DR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDR()).basicAdd(otherEnd, msgs);
			case GRRBACPackage.DEMARCATION__DP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDP()).basicAdd(otherEnd, msgs);
			case GRRBACPackage.DEMARCATION__SUBDEMARCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubdemarcations()).basicAdd(otherEnd, msgs);
			case GRRBACPackage.DEMARCATION__SUPERDEMARCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSuperdemarcations()).basicAdd(otherEnd, msgs);
			case GRRBACPackage.DEMARCATION__CONSTRAINED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConstrainedBy()).basicAdd(otherEnd, msgs);
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
			case GRRBACPackage.DEMARCATION__DR:
				return ((InternalEList<?>)getDR()).basicRemove(otherEnd, msgs);
			case GRRBACPackage.DEMARCATION__DP:
				return ((InternalEList<?>)getDP()).basicRemove(otherEnd, msgs);
			case GRRBACPackage.DEMARCATION__SUBDEMARCATIONS:
				return ((InternalEList<?>)getSubdemarcations()).basicRemove(otherEnd, msgs);
			case GRRBACPackage.DEMARCATION__SUPERDEMARCATIONS:
				return ((InternalEList<?>)getSuperdemarcations()).basicRemove(otherEnd, msgs);
			case GRRBACPackage.DEMARCATION__CONSTRAINED_BY:
				return ((InternalEList<?>)getConstrainedBy()).basicRemove(otherEnd, msgs);
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
			case GRRBACPackage.DEMARCATION__DR:
				return getDR();
			case GRRBACPackage.DEMARCATION__DP:
				return getDP();
			case GRRBACPackage.DEMARCATION__SUBDEMARCATIONS:
				return getSubdemarcations();
			case GRRBACPackage.DEMARCATION__SUPERDEMARCATIONS:
				return getSuperdemarcations();
			case GRRBACPackage.DEMARCATION__NAME:
				return getName();
			case GRRBACPackage.DEMARCATION__CONSTRAINED_BY:
				return getConstrainedBy();
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
			case GRRBACPackage.DEMARCATION__DR:
				getDR().clear();
				getDR().addAll((Collection<? extends Role>)newValue);
				return;
			case GRRBACPackage.DEMARCATION__DP:
				getDP().clear();
				getDP().addAll((Collection<? extends Permission>)newValue);
				return;
			case GRRBACPackage.DEMARCATION__SUBDEMARCATIONS:
				getSubdemarcations().clear();
				getSubdemarcations().addAll((Collection<? extends Demarcation>)newValue);
				return;
			case GRRBACPackage.DEMARCATION__SUPERDEMARCATIONS:
				getSuperdemarcations().clear();
				getSuperdemarcations().addAll((Collection<? extends Demarcation>)newValue);
				return;
			case GRRBACPackage.DEMARCATION__NAME:
				setName((String)newValue);
				return;
			case GRRBACPackage.DEMARCATION__CONSTRAINED_BY:
				getConstrainedBy().clear();
				getConstrainedBy().addAll((Collection<? extends TemporalGrantRule>)newValue);
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
			case GRRBACPackage.DEMARCATION__DR:
				getDR().clear();
				return;
			case GRRBACPackage.DEMARCATION__DP:
				getDP().clear();
				return;
			case GRRBACPackage.DEMARCATION__SUBDEMARCATIONS:
				getSubdemarcations().clear();
				return;
			case GRRBACPackage.DEMARCATION__SUPERDEMARCATIONS:
				getSuperdemarcations().clear();
				return;
			case GRRBACPackage.DEMARCATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GRRBACPackage.DEMARCATION__CONSTRAINED_BY:
				getConstrainedBy().clear();
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
			case GRRBACPackage.DEMARCATION__DR:
				return dr != null && !dr.isEmpty();
			case GRRBACPackage.DEMARCATION__DP:
				return dp != null && !dp.isEmpty();
			case GRRBACPackage.DEMARCATION__SUBDEMARCATIONS:
				return subdemarcations != null && !subdemarcations.isEmpty();
			case GRRBACPackage.DEMARCATION__SUPERDEMARCATIONS:
				return superdemarcations != null && !superdemarcations.isEmpty();
			case GRRBACPackage.DEMARCATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GRRBACPackage.DEMARCATION__CONSTRAINED_BY:
				return constrainedBy != null && !constrainedBy.isEmpty();
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

} //DemarcationImpl
