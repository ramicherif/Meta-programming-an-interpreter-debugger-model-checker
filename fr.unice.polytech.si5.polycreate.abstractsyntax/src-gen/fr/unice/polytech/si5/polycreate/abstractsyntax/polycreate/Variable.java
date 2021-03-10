/**
 */
package fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Variable#getType <em>Type</em>}</li>
 *   <li>{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Variable#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.PolycreatePackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends NamedELement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"int"</code>.
	 * The literals are from the enumeration {@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.VarType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.VarType
	 * @see #setType(VarType)
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.PolycreatePackage#getVariable_Type()
	 * @model default="int"
	 * @generated
	 */
	VarType getType();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Variable#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.VarType
	 * @see #getType()
	 * @generated
	 */
	void setType(VarType value);

	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' attribute.
	 * @see #setInitialValue(double)
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.PolycreatePackage#getVariable_InitialValue()
	 * @model default="0.0"
	 * @generated
	 */
	double getInitialValue();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Variable#getInitialValue <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' attribute.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initialize();

} // Variable
