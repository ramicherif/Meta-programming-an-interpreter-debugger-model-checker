/**
 */
package fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl;

import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Condition;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Operation;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.PolycreatePackage;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.StructuralCondition;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structural Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.StructuralConditionImpl#getThen <em>Then</em>}</li>
 *   <li>{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.StructuralConditionImpl#getElse <em>Else</em>}</li>
 *   <li>{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.StructuralConditionImpl#getIf <em>If</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructuralConditionImpl extends ControlPolycreateImpl implements StructuralCondition {
	/**
	 * The cached value of the '{@link #getThen() <em>Then</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThen()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> then;

	/**
	 * The cached value of the '{@link #getElse() <em>Else</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElse()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> else_;

	/**
	 * The cached value of the '{@link #getIf() <em>If</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIf()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> if_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuralConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolycreatePackage.Literals.STRUCTURAL_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getThen() {
		if (then == null) {
			then = new EObjectResolvingEList<Operation>(Operation.class, this,
					PolycreatePackage.STRUCTURAL_CONDITION__THEN);
		}
		return then;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getElse() {
		if (else_ == null) {
			else_ = new EObjectResolvingEList<Operation>(Operation.class, this,
					PolycreatePackage.STRUCTURAL_CONDITION__ELSE);
		}
		return else_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getIf() {
		if (if_ == null) {
			if_ = new EObjectResolvingEList<Condition>(Condition.class, this,
					PolycreatePackage.STRUCTURAL_CONDITION__IF);
		}
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PolycreatePackage.STRUCTURAL_CONDITION__THEN:
			return getThen();
		case PolycreatePackage.STRUCTURAL_CONDITION__ELSE:
			return getElse();
		case PolycreatePackage.STRUCTURAL_CONDITION__IF:
			return getIf();
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
		case PolycreatePackage.STRUCTURAL_CONDITION__THEN:
			getThen().clear();
			getThen().addAll((Collection<? extends Operation>) newValue);
			return;
		case PolycreatePackage.STRUCTURAL_CONDITION__ELSE:
			getElse().clear();
			getElse().addAll((Collection<? extends Operation>) newValue);
			return;
		case PolycreatePackage.STRUCTURAL_CONDITION__IF:
			getIf().clear();
			getIf().addAll((Collection<? extends Condition>) newValue);
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
		case PolycreatePackage.STRUCTURAL_CONDITION__THEN:
			getThen().clear();
			return;
		case PolycreatePackage.STRUCTURAL_CONDITION__ELSE:
			getElse().clear();
			return;
		case PolycreatePackage.STRUCTURAL_CONDITION__IF:
			getIf().clear();
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
		case PolycreatePackage.STRUCTURAL_CONDITION__THEN:
			return then != null && !then.isEmpty();
		case PolycreatePackage.STRUCTURAL_CONDITION__ELSE:
			return else_ != null && !else_.isEmpty();
		case PolycreatePackage.STRUCTURAL_CONDITION__IF:
			return if_ != null && !if_.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StructuralConditionImpl
