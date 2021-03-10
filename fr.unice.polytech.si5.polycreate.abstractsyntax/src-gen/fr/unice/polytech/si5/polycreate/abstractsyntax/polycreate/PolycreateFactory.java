/**
 */
package fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.PolycreatePackage
 * @generated
 */
public interface PolycreateFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PolycreateFactory eINSTANCE = fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.PolycreateFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Polycreate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Polycreate</em>'.
	 * @generated
	 */
	Polycreate createPolycreate();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>Gripper Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gripper Sensor</em>'.
	 * @generated
	 */
	GripperSensor createGripperSensor();

	/**
	 * Returns a new object of class '<em>Right Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Right Sensor</em>'.
	 * @generated
	 */
	RightSensor createRightSensor();

	/**
	 * Returns a new object of class '<em>Left Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Left Sensor</em>'.
	 * @generated
	 */
	LeftSensor createLeftSensor();

	/**
	 * Returns a new object of class '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object</em>'.
	 * @generated
	 */
	Object createObject();

	/**
	 * Returns a new object of class '<em>Go Forward</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Go Forward</em>'.
	 * @generated
	 */
	GoForward createGoForward();

	/**
	 * Returns a new object of class '<em>Go Backward</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Go Backward</em>'.
	 * @generated
	 */
	GoBackward createGoBackward();

	/**
	 * Returns a new object of class '<em>Open Gripper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Open Gripper</em>'.
	 * @generated
	 */
	OpenGripper createOpenGripper();

	/**
	 * Returns a new object of class '<em>Close Gripper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Close Gripper</em>'.
	 * @generated
	 */
	CloseGripper createCloseGripper();

	/**
	 * Returns a new object of class '<em>Turn</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Turn</em>'.
	 * @generated
	 */
	Turn createTurn();

	/**
	 * Returns a new object of class '<em>Stop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stop</em>'.
	 * @generated
	 */
	Stop createStop();

	/**
	 * Returns a new object of class '<em>Structural Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structural Condition</em>'.
	 * @generated
	 */
	StructuralCondition createStructuralCondition();

	/**
	 * Returns a new object of class '<em>Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comparison</em>'.
	 * @generated
	 */
	Comparison createComparison();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PolycreatePackage getPolycreatePackage();

} //PolycreateFactory
