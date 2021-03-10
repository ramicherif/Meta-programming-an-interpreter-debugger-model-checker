/**
 */
package fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl;

import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Comparison;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.PolycreatePackage;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.VarType;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Variable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comparison</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.ComparisonImpl#getValue <em>Value</em>}</li>
 *   <li>{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.ComparisonImpl#getLeftVariable <em>Left Variable</em>}</li>
 *   <li>{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.ComparisonImpl#getRightVariable <em>Right Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComparisonImpl extends ConditionImpl implements Comparison {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final VarType VALUE_EDEFAULT = VarType.DOUBLE;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected VarType value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLeftVariable() <em>Left Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable leftVariable;

	/**
	 * The cached value of the '{@link #getRightVariable() <em>Right Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable rightVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComparisonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolycreatePackage.Literals.COMPARISON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarType getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(VarType newValue) {
		VarType oldValue = value;
		value = newValue == null ? VALUE_EDEFAULT : newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolycreatePackage.COMPARISON__VALUE, oldValue,
					value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getLeftVariable() {
		if (leftVariable != null && leftVariable.eIsProxy()) {
			InternalEObject oldLeftVariable = (InternalEObject) leftVariable;
			leftVariable = (Variable) eResolveProxy(oldLeftVariable);
			if (leftVariable != oldLeftVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PolycreatePackage.COMPARISON__LEFT_VARIABLE, oldLeftVariable, leftVariable));
			}
		}
		return leftVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetLeftVariable() {
		return leftVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftVariable(Variable newLeftVariable) {
		Variable oldLeftVariable = leftVariable;
		leftVariable = newLeftVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolycreatePackage.COMPARISON__LEFT_VARIABLE,
					oldLeftVariable, leftVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getRightVariable() {
		if (rightVariable != null && rightVariable.eIsProxy()) {
			InternalEObject oldRightVariable = (InternalEObject) rightVariable;
			rightVariable = (Variable) eResolveProxy(oldRightVariable);
			if (rightVariable != oldRightVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PolycreatePackage.COMPARISON__RIGHT_VARIABLE, oldRightVariable, rightVariable));
			}
		}
		return rightVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetRightVariable() {
		return rightVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightVariable(Variable newRightVariable) {
		Variable oldRightVariable = rightVariable;
		rightVariable = newRightVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolycreatePackage.COMPARISON__RIGHT_VARIABLE,
					oldRightVariable, rightVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PolycreatePackage.COMPARISON__VALUE:
			return getValue();
		case PolycreatePackage.COMPARISON__LEFT_VARIABLE:
			if (resolve)
				return getLeftVariable();
			return basicGetLeftVariable();
		case PolycreatePackage.COMPARISON__RIGHT_VARIABLE:
			if (resolve)
				return getRightVariable();
			return basicGetRightVariable();
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
		case PolycreatePackage.COMPARISON__VALUE:
			setValue((VarType) newValue);
			return;
		case PolycreatePackage.COMPARISON__LEFT_VARIABLE:
			setLeftVariable((Variable) newValue);
			return;
		case PolycreatePackage.COMPARISON__RIGHT_VARIABLE:
			setRightVariable((Variable) newValue);
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
		case PolycreatePackage.COMPARISON__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case PolycreatePackage.COMPARISON__LEFT_VARIABLE:
			setLeftVariable((Variable) null);
			return;
		case PolycreatePackage.COMPARISON__RIGHT_VARIABLE:
			setRightVariable((Variable) null);
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
		case PolycreatePackage.COMPARISON__VALUE:
			return value != VALUE_EDEFAULT;
		case PolycreatePackage.COMPARISON__LEFT_VARIABLE:
			return leftVariable != null;
		case PolycreatePackage.COMPARISON__RIGHT_VARIABLE:
			return rightVariable != null;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //ComparisonImpl
