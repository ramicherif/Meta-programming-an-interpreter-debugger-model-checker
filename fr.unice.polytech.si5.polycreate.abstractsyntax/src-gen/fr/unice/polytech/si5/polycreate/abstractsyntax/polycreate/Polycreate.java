/**
 */
package fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polycreate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Polycreate#getOperation <em>Operation</em>}</li>
 *   <li>{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Polycreate#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.PolycreatePackage#getPolycreate()
 * @model
 * @generated
 */
public interface Polycreate extends NamedELement {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
	 * The list contents are of type {@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference list.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.PolycreatePackage#getPolycreate_Operation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getOperation();

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
	 * The list contents are of type {@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference list.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.PolycreatePackage#getPolycreate_Variable()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariable();

} // Polycreate
