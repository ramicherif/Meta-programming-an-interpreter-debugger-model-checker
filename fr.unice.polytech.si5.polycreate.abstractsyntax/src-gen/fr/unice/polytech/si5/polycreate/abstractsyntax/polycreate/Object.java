/**
 */
package fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Object#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.PolycreatePackage#getObject()
 * @model
 * @generated
 */
public interface Object extends Variable {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * The default value is <code>"GPS"</code>.
	 * The literals are from the enumeration {@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.VarType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.VarType
	 * @see #setPosition(VarType)
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.PolycreatePackage#getObject_Position()
	 * @model default="GPS"
	 * @generated
	 */
	VarType getPosition();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Object#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.VarType
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(VarType value);

} // Object
