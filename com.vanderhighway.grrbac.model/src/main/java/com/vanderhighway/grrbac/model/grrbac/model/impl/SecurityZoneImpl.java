/**
 */
package com.vanderhighway.grrbac.model.grrbac.model.impl;

import com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage;
import com.vanderhighway.grrbac.model.grrbac.model.SecurityZone;
import com.vanderhighway.grrbac.model.grrbac.model.TemporalAuthenticationRule;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Zone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.SecurityZoneImpl#isPublic <em>Public</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.SecurityZoneImpl#getReachable <em>Reachable</em>}</li>
 *   <li>{@link com.vanderhighway.grrbac.model.grrbac.model.impl.SecurityZoneImpl#getConstrainedBy <em>Constrained By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityZoneImpl extends SACSObjectImpl implements SecurityZone {
	/**
	 * The default value of the '{@link #isPublic() <em>Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPublic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PUBLIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPublic() <em>Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPublic()
	 * @generated
	 * @ordered
	 */
	protected boolean public_ = PUBLIC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReachable() <em>Reachable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReachable()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityZone> reachable;

	/**
	 * The cached value of the '{@link #getConstrainedBy() <em>Constrained By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrainedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<TemporalAuthenticationRule> constrainedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityZoneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GRRBACPackage.Literals.SECURITY_ZONE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPublic() {
		return public_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublic(boolean newPublic) {
		boolean oldPublic = public_;
		public_ = newPublic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRRBACPackage.SECURITY_ZONE__PUBLIC, oldPublic, public_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SecurityZone> getReachable() {
		if (reachable == null) {
			reachable = new EObjectResolvingEList<SecurityZone>(SecurityZone.class, this, GRRBACPackage.SECURITY_ZONE__REACHABLE);
		}
		return reachable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TemporalAuthenticationRule> getConstrainedBy() {
		if (constrainedBy == null) {
			constrainedBy = new EObjectWithInverseResolvingEList<TemporalAuthenticationRule>(TemporalAuthenticationRule.class, this, GRRBACPackage.SECURITY_ZONE__CONSTRAINED_BY, GRRBACPackage.TEMPORAL_AUTHENTICATION_RULE__SECURITY_ZONE);
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
			case GRRBACPackage.SECURITY_ZONE__CONSTRAINED_BY:
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
			case GRRBACPackage.SECURITY_ZONE__CONSTRAINED_BY:
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
			case GRRBACPackage.SECURITY_ZONE__PUBLIC:
				return isPublic();
			case GRRBACPackage.SECURITY_ZONE__REACHABLE:
				return getReachable();
			case GRRBACPackage.SECURITY_ZONE__CONSTRAINED_BY:
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
			case GRRBACPackage.SECURITY_ZONE__PUBLIC:
				setPublic((Boolean)newValue);
				return;
			case GRRBACPackage.SECURITY_ZONE__REACHABLE:
				getReachable().clear();
				getReachable().addAll((Collection<? extends SecurityZone>)newValue);
				return;
			case GRRBACPackage.SECURITY_ZONE__CONSTRAINED_BY:
				getConstrainedBy().clear();
				getConstrainedBy().addAll((Collection<? extends TemporalAuthenticationRule>)newValue);
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
			case GRRBACPackage.SECURITY_ZONE__PUBLIC:
				setPublic(PUBLIC_EDEFAULT);
				return;
			case GRRBACPackage.SECURITY_ZONE__REACHABLE:
				getReachable().clear();
				return;
			case GRRBACPackage.SECURITY_ZONE__CONSTRAINED_BY:
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
			case GRRBACPackage.SECURITY_ZONE__PUBLIC:
				return public_ != PUBLIC_EDEFAULT;
			case GRRBACPackage.SECURITY_ZONE__REACHABLE:
				return reachable != null && !reachable.isEmpty();
			case GRRBACPackage.SECURITY_ZONE__CONSTRAINED_BY:
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
		result.append(" (public: ");
		result.append(public_);
		result.append(')');
		return result.toString();
	}

} //SecurityZoneImpl
