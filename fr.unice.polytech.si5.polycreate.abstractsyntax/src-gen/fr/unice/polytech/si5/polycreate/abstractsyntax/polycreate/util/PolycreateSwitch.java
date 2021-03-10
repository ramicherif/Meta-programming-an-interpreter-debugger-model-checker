/**
 */
package fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.util;

import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.CloseGripper;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Comparison;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Condition;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.ControlPolycreate;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.GoBackward;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.GoForward;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.GripperSensor;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Instruction;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.LeftSensor;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.NamedELement;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.OpenGripper;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Operation;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Polycreate;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.PolycreatePackage;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.RightSensor;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Stop;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.StructuralCondition;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Turn;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Variable;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.PolycreatePackage
 * @generated
 */
public class PolycreateSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PolycreatePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolycreateSwitch() {
		if (modelPackage == null) {
			modelPackage = PolycreatePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case PolycreatePackage.NAMED_ELEMENT: {
			NamedELement namedELement = (NamedELement) theEObject;
			T result = caseNamedELement(namedELement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PolycreatePackage.POLYCREATE: {
			Polycreate polycreate = (Polycreate) theEObject;
			T result = casePolycreate(polycreate);
			if (result == null)
				result = caseNamedELement(polycreate);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PolycreatePackage.VARIABLE: {
			Variable variable = (Variable) theEObject;
			T result = caseVariable(variable);
			if (result == null)
				result = caseNamedELement(variable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PolycreatePackage.OPERATION: {
			Operation operation = (Operation) theEObject;
			T result = caseOperation(operation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PolycreatePackage.INSTRUCTION: {
			Instruction instruction = (Instruction) theEObject;
			T result = caseInstruction(instruction);
			if (result == null)
				result = caseOperation(instruction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PolycreatePackage.CONTROL_POLYCREATE: {
			ControlPolycreate controlPolycreate = (ControlPolycreate) theEObject;
			T result = caseControlPolycreate(controlPolycreate);
			if (result == null)
				result = caseOperation(controlPolycreate);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PolycreatePackage.GRIPPER_SENSOR: {
			GripperSensor gripperSensor = (GripperSensor) theEObject;
			T result = caseGripperSensor(gripperSensor);
			if (result == null)
				result = caseVariable(gripperSensor);
			if (result == null)
				result = caseNamedELement(gripperSensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PolycreatePackage.RIGHT_SENSOR: {
			RightSensor rightSensor = (RightSensor) theEObject;
			T result = caseRightSensor(rightSensor);
			if (result == null)
				result = caseVariable(rightSensor);
			if (result == null)
				result = caseNamedELement(rightSensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PolycreatePackage.LEFT_SENSOR: {
			LeftSensor leftSensor = (LeftSensor) theEObject;
			T result = caseLeftSensor(leftSensor);
			if (result == null)
				result = caseVariable(leftSensor);
			if (result == null)
				result = caseNamedELement(leftSensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PolycreatePackage.OBJECT: {
			fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Object object = (fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Object) theEObject;
			T result = caseObject(object);
			if (result == null)
				result = caseVariable(object);
			if (result == null)
				result = caseNamedELement(object);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PolycreatePackage.GO_FORWARD: {
			GoForward goForward = (GoForward) theEObject;
			T result = caseGoForward(goForward);
			if (result == null)
				result = caseInstruction(goForward);
			if (result == null)
				result = caseOperation(goForward);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PolycreatePackage.GO_BACKWARD: {
			GoBackward goBackward = (GoBackward) theEObject;
			T result = caseGoBackward(goBackward);
			if (result == null)
				result = caseInstruction(goBackward);
			if (result == null)
				result = caseOperation(goBackward);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PolycreatePackage.OPEN_GRIPPER: {
			OpenGripper openGripper = (OpenGripper) theEObject;
			T result = caseOpenGripper(openGripper);
			if (result == null)
				result = caseInstruction(openGripper);
			if (result == null)
				result = caseOperation(openGripper);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PolycreatePackage.CLOSE_GRIPPER: {
			CloseGripper closeGripper = (CloseGripper) theEObject;
			T result = caseCloseGripper(closeGripper);
			if (result == null)
				result = caseInstruction(closeGripper);
			if (result == null)
				result = caseOperation(closeGripper);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PolycreatePackage.TURN: {
			Turn turn = (Turn) theEObject;
			T result = caseTurn(turn);
			if (result == null)
				result = caseInstruction(turn);
			if (result == null)
				result = caseOperation(turn);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PolycreatePackage.STOP: {
			Stop stop = (Stop) theEObject;
			T result = caseStop(stop);
			if (result == null)
				result = caseInstruction(stop);
			if (result == null)
				result = caseOperation(stop);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PolycreatePackage.STRUCTURAL_CONDITION: {
			StructuralCondition structuralCondition = (StructuralCondition) theEObject;
			T result = caseStructuralCondition(structuralCondition);
			if (result == null)
				result = caseControlPolycreate(structuralCondition);
			if (result == null)
				result = caseOperation(structuralCondition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PolycreatePackage.CONDITION: {
			Condition condition = (Condition) theEObject;
			T result = caseCondition(condition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PolycreatePackage.COMPARISON: {
			Comparison comparison = (Comparison) theEObject;
			T result = caseComparison(comparison);
			if (result == null)
				result = caseCondition(comparison);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named ELement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named ELement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedELement(NamedELement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polycreate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polycreate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolycreate(Polycreate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstruction(Instruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Polycreate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Polycreate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlPolycreate(ControlPolycreate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gripper Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gripper Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGripperSensor(GripperSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Right Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Right Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRightSensor(RightSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Left Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Left Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeftSensor(LeftSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject(fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Go Forward</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Go Forward</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoForward(GoForward object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Go Backward</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Go Backward</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoBackward(GoBackward object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open Gripper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open Gripper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenGripper(OpenGripper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Close Gripper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Close Gripper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloseGripper(CloseGripper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turn</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turn</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurn(Turn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStop(Stop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structural Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structural Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuralCondition(StructuralCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparison</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparison(Comparison object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PolycreateSwitch
