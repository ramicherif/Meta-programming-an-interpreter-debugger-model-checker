/**
 */
package fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structural Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.StructuralCondition#getThen <em>Then</em>}</li>
 *   <li>{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.StructuralCondition#getElse <em>Else</em>}</li>
 *   <li>{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.StructuralCondition#getIf <em>If</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.PolycreatePackage#getStructuralCondition()
 * @model
 * @generated
 */
public interface StructuralCondition extends ControlPolycreate {
	/**
	 * Returns the value of the '<em><b>Then</b></em>' reference list.
	 * The list contents are of type {@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then</em>' reference list.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.PolycreatePackage#getStructuralCondition_Then()
	 * @model
	 * @generated
	 */
	EList<Operation> getThen();

	/**
	 * Returns the value of the '<em><b>Else</b></em>' reference list.
	 * The list contents are of type {@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' reference list.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.PolycreatePackage#getStructuralCondition_Else()
	 * @model
	 * @generated
	 */
	EList<Operation> getElse();

	/**
	 * Returns the value of the '<em><b>If</b></em>' reference list.
	 * The list contents are of type {@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If</em>' reference list.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.PolycreatePackage#getStructuralCondition_If()
	 * @model required="true"
	 * @generated
	 */
	EList<Condition> getIf();

} // StructuralCondition
