/**
 */
package fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Comparison#getValue <em>Value</em>}</li>
 *   <li>{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Comparison#getLeftVariable <em>Left Variable</em>}</li>
 *   <li>{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Comparison#getRightVariable <em>Right Variable</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.PolycreatePackage#getComparison()
 * @model
 * @generated
 */
public interface Comparison extends Condition {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"double"</code>.
	 * The literals are from the enumeration {@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.VarType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.VarType
	 * @see #setValue(VarType)
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.PolycreatePackage#getComparison_Value()
	 * @model default="double"
	 * @generated
	 */
	VarType getValue();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Comparison#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.VarType
	 * @see #getValue()
	 * @generated
	 */
	void setValue(VarType value);

	/**
	 * Returns the value of the '<em><b>Left Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Variable</em>' reference.
	 * @see #setLeftVariable(Variable)
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.PolycreatePackage#getComparison_LeftVariable()
	 * @model required="true"
	 * @generated
	 */
	Variable getLeftVariable();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Comparison#getLeftVariable <em>Left Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Variable</em>' reference.
	 * @see #getLeftVariable()
	 * @generated
	 */
	void setLeftVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Right Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Variable</em>' reference.
	 * @see #setRightVariable(Variable)
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.PolycreatePackage#getComparison_RightVariable()
	 * @model required="true"
	 * @generated
	 */
	Variable getRightVariable();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Comparison#getRightVariable <em>Right Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Variable</em>' reference.
	 * @see #getRightVariable()
	 * @generated
	 */
	void setRightVariable(Variable value);

} // Comparison
