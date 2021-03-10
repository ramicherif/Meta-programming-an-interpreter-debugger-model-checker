/**
 */
package fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.PolycreateFactory
 * @model kind="package"
 * @generated
 */
public interface PolycreatePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "polycreate";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polytech.unice.fr/polycreate";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "polycreate";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PolycreatePackage eINSTANCE = fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl
			.init();

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.NamedELementImpl <em>Named ELement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.NamedELementImpl
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getNamedELement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named ELement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named ELement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.PolycreateImpl <em>Polycreate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.PolycreateImpl
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getPolycreate()
	 * @generated
	 */
	int POLYCREATE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYCREATE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYCREATE__OPERATION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYCREATE__VARIABLE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Polycreate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYCREATE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Polycreate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYCREATE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.VariableImpl
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__INITIAL_VALUE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE___INITIALIZE = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.OperationImpl
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 3;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___EXECUTE = 0;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.InstructionImpl <em>Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.InstructionImpl
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getInstruction()
	 * @generated
	 */
	int INSTRUCTION = 4;

	/**
	 * The number of structural features of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION___EXECUTE = OPERATION___EXECUTE;

	/**
	 * The number of operations of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.ControlPolycreateImpl <em>Control Polycreate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.ControlPolycreateImpl
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getControlPolycreate()
	 * @generated
	 */
	int CONTROL_POLYCREATE = 5;

	/**
	 * The number of structural features of the '<em>Control Polycreate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_POLYCREATE_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_POLYCREATE___EXECUTE = OPERATION___EXECUTE;

	/**
	 * The number of operations of the '<em>Control Polycreate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_POLYCREATE_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.GripperSensorImpl <em>Gripper Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.GripperSensorImpl
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getGripperSensor()
	 * @generated
	 */
	int GRIPPER_SENSOR = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRIPPER_SENSOR__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRIPPER_SENSOR__TYPE = VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRIPPER_SENSOR__INITIAL_VALUE = VARIABLE__INITIAL_VALUE;

	/**
	 * The number of structural features of the '<em>Gripper Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRIPPER_SENSOR_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRIPPER_SENSOR___INITIALIZE = VARIABLE___INITIALIZE;

	/**
	 * The number of operations of the '<em>Gripper Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRIPPER_SENSOR_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.RightSensorImpl <em>Right Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.RightSensorImpl
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getRightSensor()
	 * @generated
	 */
	int RIGHT_SENSOR = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_SENSOR__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_SENSOR__TYPE = VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_SENSOR__INITIAL_VALUE = VARIABLE__INITIAL_VALUE;

	/**
	 * The number of structural features of the '<em>Right Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_SENSOR_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_SENSOR___INITIALIZE = VARIABLE___INITIALIZE;

	/**
	 * The number of operations of the '<em>Right Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_SENSOR_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.LeftSensorImpl <em>Left Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.LeftSensorImpl
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getLeftSensor()
	 * @generated
	 */
	int LEFT_SENSOR = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_SENSOR__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_SENSOR__TYPE = VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_SENSOR__INITIAL_VALUE = VARIABLE__INITIAL_VALUE;

	/**
	 * The number of structural features of the '<em>Left Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_SENSOR_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_SENSOR___INITIALIZE = VARIABLE___INITIALIZE;

	/**
	 * The number of operations of the '<em>Left Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_SENSOR_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.ObjectImpl
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__TYPE = VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__INITIAL_VALUE = VARIABLE__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__POSITION = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT___INITIALIZE = VARIABLE___INITIALIZE;

	/**
	 * The number of operations of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.GoForwardImpl <em>Go Forward</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.GoForwardImpl
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getGoForward()
	 * @generated
	 */
	int GO_FORWARD = 10;

	/**
	 * The number of structural features of the '<em>Go Forward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_FORWARD_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_FORWARD___EXECUTE = INSTRUCTION___EXECUTE;

	/**
	 * The number of operations of the '<em>Go Forward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_FORWARD_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.GoBackwardImpl <em>Go Backward</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.GoBackwardImpl
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getGoBackward()
	 * @generated
	 */
	int GO_BACKWARD = 11;

	/**
	 * The number of structural features of the '<em>Go Backward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_BACKWARD_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_BACKWARD___EXECUTE = INSTRUCTION___EXECUTE;

	/**
	 * The number of operations of the '<em>Go Backward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_BACKWARD_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.OpenGripperImpl <em>Open Gripper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.OpenGripperImpl
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getOpenGripper()
	 * @generated
	 */
	int OPEN_GRIPPER = 12;

	/**
	 * The number of structural features of the '<em>Open Gripper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_GRIPPER_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_GRIPPER___EXECUTE = INSTRUCTION___EXECUTE;

	/**
	 * The number of operations of the '<em>Open Gripper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_GRIPPER_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.CloseGripperImpl <em>Close Gripper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.CloseGripperImpl
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getCloseGripper()
	 * @generated
	 */
	int CLOSE_GRIPPER = 13;

	/**
	 * The number of structural features of the '<em>Close Gripper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE_GRIPPER_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE_GRIPPER___EXECUTE = INSTRUCTION___EXECUTE;

	/**
	 * The number of operations of the '<em>Close Gripper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE_GRIPPER_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.TurnImpl <em>Turn</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.TurnImpl
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getTurn()
	 * @generated
	 */
	int TURN = 14;

	/**
	 * The number of structural features of the '<em>Turn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN___EXECUTE = INSTRUCTION___EXECUTE;

	/**
	 * The number of operations of the '<em>Turn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.StopImpl <em>Stop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.StopImpl
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getStop()
	 * @generated
	 */
	int STOP = 15;

	/**
	 * The number of structural features of the '<em>Stop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP___EXECUTE = INSTRUCTION___EXECUTE;

	/**
	 * The number of operations of the '<em>Stop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.StructuralConditionImpl <em>Structural Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.StructuralConditionImpl
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getStructuralCondition()
	 * @generated
	 */
	int STRUCTURAL_CONDITION = 16;

	/**
	 * The feature id for the '<em><b>Then</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_CONDITION__THEN = CONTROL_POLYCREATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Else</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_CONDITION__ELSE = CONTROL_POLYCREATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>If</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_CONDITION__IF = CONTROL_POLYCREATE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Structural Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_CONDITION_FEATURE_COUNT = CONTROL_POLYCREATE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_CONDITION___EXECUTE = CONTROL_POLYCREATE___EXECUTE;

	/**
	 * The number of operations of the '<em>Structural Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_CONDITION_OPERATION_COUNT = CONTROL_POLYCREATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.ConditionImpl
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 17;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.ComparisonImpl <em>Comparison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.ComparisonImpl
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getComparison()
	 * @generated
	 */
	int COMPARISON = 18;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__VALUE = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__LEFT_VARIABLE = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__RIGHT_VARIABLE = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.VarType <em>Var Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.VarType
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getVarType()
	 * @generated
	 */
	int VAR_TYPE = 19;

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.NamedELement <em>Named ELement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named ELement</em>'.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.NamedELement
	 * @generated
	 */
	EClass getNamedELement();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.NamedELement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.NamedELement#getName()
	 * @see #getNamedELement()
	 * @generated
	 */
	EAttribute getNamedELement_Name();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Polycreate <em>Polycreate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polycreate</em>'.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Polycreate
	 * @generated
	 */
	EClass getPolycreate();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Polycreate#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Polycreate#getOperation()
	 * @see #getPolycreate()
	 * @generated
	 */
	EReference getPolycreate_Operation();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Polycreate#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Polycreate#getVariable()
	 * @see #getPolycreate()
	 * @generated
	 */
	EReference getPolycreate_Variable();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Type();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Variable#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Variable#getInitialValue()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_InitialValue();

	/**
	 * Returns the meta object for the '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Variable#initialize() <em>Initialize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initialize</em>' operation.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Variable#initialize()
	 * @generated
	 */
	EOperation getVariable__Initialize();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Operation#execute() <em>Execute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Operation#execute()
	 * @generated
	 */
	EOperation getOperation__Execute();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction</em>'.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Instruction
	 * @generated
	 */
	EClass getInstruction();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.ControlPolycreate <em>Control Polycreate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Polycreate</em>'.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.ControlPolycreate
	 * @generated
	 */
	EClass getControlPolycreate();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.GripperSensor <em>Gripper Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gripper Sensor</em>'.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.GripperSensor
	 * @generated
	 */
	EClass getGripperSensor();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.RightSensor <em>Right Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Right Sensor</em>'.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.RightSensor
	 * @generated
	 */
	EClass getRightSensor();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.LeftSensor <em>Left Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Left Sensor</em>'.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.LeftSensor
	 * @generated
	 */
	EClass getLeftSensor();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Object
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Object#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Object#getPosition()
	 * @see #getObject()
	 * @generated
	 */
	EAttribute getObject_Position();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.GoForward <em>Go Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Go Forward</em>'.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.GoForward
	 * @generated
	 */
	EClass getGoForward();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.GoBackward <em>Go Backward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Go Backward</em>'.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.GoBackward
	 * @generated
	 */
	EClass getGoBackward();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.OpenGripper <em>Open Gripper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open Gripper</em>'.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.OpenGripper
	 * @generated
	 */
	EClass getOpenGripper();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.CloseGripper <em>Close Gripper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Close Gripper</em>'.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.CloseGripper
	 * @generated
	 */
	EClass getCloseGripper();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Turn <em>Turn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn</em>'.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Turn
	 * @generated
	 */
	EClass getTurn();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Stop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop</em>'.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Stop
	 * @generated
	 */
	EClass getStop();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.StructuralCondition <em>Structural Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structural Condition</em>'.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.StructuralCondition
	 * @generated
	 */
	EClass getStructuralCondition();

	/**
	 * Returns the meta object for the reference list '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.StructuralCondition#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Then</em>'.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.StructuralCondition#getThen()
	 * @see #getStructuralCondition()
	 * @generated
	 */
	EReference getStructuralCondition_Then();

	/**
	 * Returns the meta object for the reference list '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.StructuralCondition#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Else</em>'.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.StructuralCondition#getElse()
	 * @see #getStructuralCondition()
	 * @generated
	 */
	EReference getStructuralCondition_Else();

	/**
	 * Returns the meta object for the reference list '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.StructuralCondition#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>If</em>'.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.StructuralCondition#getIf()
	 * @see #getStructuralCondition()
	 * @generated
	 */
	EReference getStructuralCondition_If();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Comparison <em>Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison</em>'.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Comparison
	 * @generated
	 */
	EClass getComparison();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Comparison#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Comparison#getValue()
	 * @see #getComparison()
	 * @generated
	 */
	EAttribute getComparison_Value();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Comparison#getLeftVariable <em>Left Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left Variable</em>'.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Comparison#getLeftVariable()
	 * @see #getComparison()
	 * @generated
	 */
	EReference getComparison_LeftVariable();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Comparison#getRightVariable <em>Right Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right Variable</em>'.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Comparison#getRightVariable()
	 * @see #getComparison()
	 * @generated
	 */
	EReference getComparison_RightVariable();

	/**
	 * Returns the meta object for enum '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.VarType <em>Var Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Var Type</em>'.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.VarType
	 * @generated
	 */
	EEnum getVarType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PolycreateFactory getPolycreateFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.NamedELementImpl <em>Named ELement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.NamedELementImpl
		 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getNamedELement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedELement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedELement_Name();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.PolycreateImpl <em>Polycreate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.PolycreateImpl
		 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getPolycreate()
		 * @generated
		 */
		EClass POLYCREATE = eINSTANCE.getPolycreate();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLYCREATE__OPERATION = eINSTANCE.getPolycreate_Operation();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLYCREATE__VARIABLE = eINSTANCE.getPolycreate_Variable();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.VariableImpl
		 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__INITIAL_VALUE = eINSTANCE.getVariable_InitialValue();

		/**
		 * The meta object literal for the '<em><b>Initialize</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE___INITIALIZE = eINSTANCE.getVariable__Initialize();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.OperationImpl
		 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATION___EXECUTE = eINSTANCE.getOperation__Execute();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.InstructionImpl <em>Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.InstructionImpl
		 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getInstruction()
		 * @generated
		 */
		EClass INSTRUCTION = eINSTANCE.getInstruction();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.ControlPolycreateImpl <em>Control Polycreate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.ControlPolycreateImpl
		 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getControlPolycreate()
		 * @generated
		 */
		EClass CONTROL_POLYCREATE = eINSTANCE.getControlPolycreate();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.GripperSensorImpl <em>Gripper Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.GripperSensorImpl
		 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getGripperSensor()
		 * @generated
		 */
		EClass GRIPPER_SENSOR = eINSTANCE.getGripperSensor();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.RightSensorImpl <em>Right Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.RightSensorImpl
		 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getRightSensor()
		 * @generated
		 */
		EClass RIGHT_SENSOR = eINSTANCE.getRightSensor();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.LeftSensorImpl <em>Left Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.LeftSensorImpl
		 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getLeftSensor()
		 * @generated
		 */
		EClass LEFT_SENSOR = eINSTANCE.getLeftSensor();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.ObjectImpl
		 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getObject()
		 * @generated
		 */
		EClass OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT__POSITION = eINSTANCE.getObject_Position();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.GoForwardImpl <em>Go Forward</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.GoForwardImpl
		 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getGoForward()
		 * @generated
		 */
		EClass GO_FORWARD = eINSTANCE.getGoForward();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.GoBackwardImpl <em>Go Backward</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.GoBackwardImpl
		 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getGoBackward()
		 * @generated
		 */
		EClass GO_BACKWARD = eINSTANCE.getGoBackward();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.OpenGripperImpl <em>Open Gripper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.OpenGripperImpl
		 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getOpenGripper()
		 * @generated
		 */
		EClass OPEN_GRIPPER = eINSTANCE.getOpenGripper();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.CloseGripperImpl <em>Close Gripper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.CloseGripperImpl
		 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getCloseGripper()
		 * @generated
		 */
		EClass CLOSE_GRIPPER = eINSTANCE.getCloseGripper();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.TurnImpl <em>Turn</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.TurnImpl
		 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getTurn()
		 * @generated
		 */
		EClass TURN = eINSTANCE.getTurn();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.StopImpl <em>Stop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.StopImpl
		 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getStop()
		 * @generated
		 */
		EClass STOP = eINSTANCE.getStop();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.StructuralConditionImpl <em>Structural Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.StructuralConditionImpl
		 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getStructuralCondition()
		 * @generated
		 */
		EClass STRUCTURAL_CONDITION = eINSTANCE.getStructuralCondition();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURAL_CONDITION__THEN = eINSTANCE.getStructuralCondition_Then();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURAL_CONDITION__ELSE = eINSTANCE.getStructuralCondition_Else();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURAL_CONDITION__IF = eINSTANCE.getStructuralCondition_If();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.ConditionImpl
		 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.ComparisonImpl <em>Comparison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.ComparisonImpl
		 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getComparison()
		 * @generated
		 */
		EClass COMPARISON = eINSTANCE.getComparison();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON__VALUE = eINSTANCE.getComparison_Value();

		/**
		 * The meta object literal for the '<em><b>Left Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARISON__LEFT_VARIABLE = eINSTANCE.getComparison_LeftVariable();

		/**
		 * The meta object literal for the '<em><b>Right Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARISON__RIGHT_VARIABLE = eINSTANCE.getComparison_RightVariable();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.VarType <em>Var Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.VarType
		 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getVarType()
		 * @generated
		 */
		EEnum VAR_TYPE = eINSTANCE.getVarType();

	}

} //PolycreatePackage
