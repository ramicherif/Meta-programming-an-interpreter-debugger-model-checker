/**
 */
package fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Var Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.PolycreatePackage#getVarType()
 * @model
 * @generated
 */
public enum VarType implements Enumerator {
	/**
	 * The '<em><b>Int</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT_VALUE
	 * @generated
	 * @ordered
	 */
	INT(0, "int", "int"),

	/**
	 * The '<em><b>Double</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE(1, "double", "double"),

	/**
	 * The '<em><b>Position Sensor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSITION_SENSOR_VALUE
	 * @generated
	 * @ordered
	 */
	POSITION_SENSOR(2, "PositionSensor", "PositionSensor"),

	/**
	 * The '<em><b>Touch Sensor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOUCH_SENSOR_VALUE
	 * @generated
	 * @ordered
	 */
	TOUCH_SENSOR(3, "TouchSensor", "TouchSensor"),

	/**
	 * The '<em><b>Distance Sensor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTANCE_SENSOR_VALUE
	 * @generated
	 * @ordered
	 */
	DISTANCE_SENSOR(4, "DistanceSensor", "DistanceSensor"),

	/**
	 * The '<em><b>Camera</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAMERA_VALUE
	 * @generated
	 * @ordered
	 */
	CAMERA(5, "Camera", "Camera"),

	/**
	 * The '<em><b>Receiver</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECEIVER_VALUE
	 * @generated
	 * @ordered
	 */
	RECEIVER(6, "Receiver", "Receiver"),

	/**
	 * The '<em><b>GPS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GPS_VALUE
	 * @generated
	 * @ordered
	 */
	GPS(7, "GPS", "GPS"),

	/**
	 * The '<em><b>Motor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOTOR_VALUE
	 * @generated
	 * @ordered
	 */
	MOTOR(8, "Motor", "Motor");

	/**
	 * The '<em><b>Int</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Int</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INT
	 * @model name="int"
	 * @generated
	 * @ordered
	 */
	public static final int INT_VALUE = 0;

	/**
	 * The '<em><b>Double</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Double</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOUBLE
	 * @model name="double"
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_VALUE = 1;

	/**
	 * The '<em><b>Position Sensor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Position Sensor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POSITION_SENSOR
	 * @model name="PositionSensor"
	 * @generated
	 * @ordered
	 */
	public static final int POSITION_SENSOR_VALUE = 2;

	/**
	 * The '<em><b>Touch Sensor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Touch Sensor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOUCH_SENSOR
	 * @model name="TouchSensor"
	 * @generated
	 * @ordered
	 */
	public static final int TOUCH_SENSOR_VALUE = 3;

	/**
	 * The '<em><b>Distance Sensor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Distance Sensor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISTANCE_SENSOR
	 * @model name="DistanceSensor"
	 * @generated
	 * @ordered
	 */
	public static final int DISTANCE_SENSOR_VALUE = 4;

	/**
	 * The '<em><b>Camera</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Camera</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CAMERA
	 * @model name="Camera"
	 * @generated
	 * @ordered
	 */
	public static final int CAMERA_VALUE = 5;

	/**
	 * The '<em><b>Receiver</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Receiver</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RECEIVER
	 * @model name="Receiver"
	 * @generated
	 * @ordered
	 */
	public static final int RECEIVER_VALUE = 6;

	/**
	 * The '<em><b>GPS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GPS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GPS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GPS_VALUE = 7;

	/**
	 * The '<em><b>Motor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Motor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOTOR
	 * @model name="Motor"
	 * @generated
	 * @ordered
	 */
	public static final int MOTOR_VALUE = 8;

	/**
	 * An array of all the '<em><b>Var Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final VarType[] VALUES_ARRAY = new VarType[] { INT, DOUBLE, POSITION_SENSOR, TOUCH_SENSOR,
			DISTANCE_SENSOR, CAMERA, RECEIVER, GPS, MOTOR, };

	/**
	 * A public read-only list of all the '<em><b>Var Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<VarType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Var Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VarType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VarType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Var Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VarType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VarType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Var Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VarType get(int value) {
		switch (value) {
		case INT_VALUE:
			return INT;
		case DOUBLE_VALUE:
			return DOUBLE;
		case POSITION_SENSOR_VALUE:
			return POSITION_SENSOR;
		case TOUCH_SENSOR_VALUE:
			return TOUCH_SENSOR;
		case DISTANCE_SENSOR_VALUE:
			return DISTANCE_SENSOR;
		case CAMERA_VALUE:
			return CAMERA;
		case RECEIVER_VALUE:
			return RECEIVER;
		case GPS_VALUE:
			return GPS;
		case MOTOR_VALUE:
			return MOTOR;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private VarType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //VarType
