/**
 */
package fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl;

import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.CloseGripper;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Comparison;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.GoBackward;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.GoForward;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.GripperSensor;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.LeftSensor;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.OpenGripper;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Polycreate;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.PolycreateFactory;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.PolycreatePackage;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.RightSensor;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Stop;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.StructuralCondition;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Turn;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.VarType;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Variable;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PolycreateFactoryImpl extends EFactoryImpl implements PolycreateFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PolycreateFactory init() {
		try {
			PolycreateFactory thePolycreateFactory = (PolycreateFactory) EPackage.Registry.INSTANCE
					.getEFactory(PolycreatePackage.eNS_URI);
			if (thePolycreateFactory != null) {
				return thePolycreateFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PolycreateFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolycreateFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case PolycreatePackage.POLYCREATE:
			return createPolycreate();
		case PolycreatePackage.VARIABLE:
			return createVariable();
		case PolycreatePackage.GRIPPER_SENSOR:
			return createGripperSensor();
		case PolycreatePackage.RIGHT_SENSOR:
			return createRightSensor();
		case PolycreatePackage.LEFT_SENSOR:
			return createLeftSensor();
		case PolycreatePackage.OBJECT:
			return createObject();
		case PolycreatePackage.GO_FORWARD:
			return createGoForward();
		case PolycreatePackage.GO_BACKWARD:
			return createGoBackward();
		case PolycreatePackage.OPEN_GRIPPER:
			return createOpenGripper();
		case PolycreatePackage.CLOSE_GRIPPER:
			return createCloseGripper();
		case PolycreatePackage.TURN:
			return createTurn();
		case PolycreatePackage.STOP:
			return createStop();
		case PolycreatePackage.STRUCTURAL_CONDITION:
			return createStructuralCondition();
		case PolycreatePackage.COMPARISON:
			return createComparison();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case PolycreatePackage.VAR_TYPE:
			return createVarTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case PolycreatePackage.VAR_TYPE:
			return convertVarTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Polycreate createPolycreate() {
		PolycreateImpl polycreate = new PolycreateImpl();
		return polycreate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GripperSensor createGripperSensor() {
		GripperSensorImpl gripperSensor = new GripperSensorImpl();
		return gripperSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightSensor createRightSensor() {
		RightSensorImpl rightSensor = new RightSensorImpl();
		return rightSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftSensor createLeftSensor() {
		LeftSensorImpl leftSensor = new LeftSensorImpl();
		return leftSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Object createObject() {
		ObjectImpl object = new ObjectImpl();
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoForward createGoForward() {
		GoForwardImpl goForward = new GoForwardImpl();
		return goForward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoBackward createGoBackward() {
		GoBackwardImpl goBackward = new GoBackwardImpl();
		return goBackward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenGripper createOpenGripper() {
		OpenGripperImpl openGripper = new OpenGripperImpl();
		return openGripper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloseGripper createCloseGripper() {
		CloseGripperImpl closeGripper = new CloseGripperImpl();
		return closeGripper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Turn createTurn() {
		TurnImpl turn = new TurnImpl();
		return turn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stop createStop() {
		StopImpl stop = new StopImpl();
		return stop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralCondition createStructuralCondition() {
		StructuralConditionImpl structuralCondition = new StructuralConditionImpl();
		return structuralCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comparison createComparison() {
		ComparisonImpl comparison = new ComparisonImpl();
		return comparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarType createVarTypeFromString(EDataType eDataType, String initialValue) {
		VarType result = VarType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVarTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolycreatePackage getPolycreatePackage() {
		return (PolycreatePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PolycreatePackage getPackage() {
		return PolycreatePackage.eINSTANCE;
	}

} //PolycreateFactoryImpl
