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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.PolycreatePackage
 * @generated
 */
public class PolycreateAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PolycreatePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolycreateAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PolycreatePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolycreateSwitch<Adapter> modelSwitch = new PolycreateSwitch<Adapter>() {
		@Override
		public Adapter caseNamedELement(NamedELement object) {
			return createNamedELementAdapter();
		}

		@Override
		public Adapter casePolycreate(Polycreate object) {
			return createPolycreateAdapter();
		}

		@Override
		public Adapter caseVariable(Variable object) {
			return createVariableAdapter();
		}

		@Override
		public Adapter caseOperation(Operation object) {
			return createOperationAdapter();
		}

		@Override
		public Adapter caseInstruction(Instruction object) {
			return createInstructionAdapter();
		}

		@Override
		public Adapter caseControlPolycreate(ControlPolycreate object) {
			return createControlPolycreateAdapter();
		}

		@Override
		public Adapter caseGripperSensor(GripperSensor object) {
			return createGripperSensorAdapter();
		}

		@Override
		public Adapter caseRightSensor(RightSensor object) {
			return createRightSensorAdapter();
		}

		@Override
		public Adapter caseLeftSensor(LeftSensor object) {
			return createLeftSensorAdapter();
		}

		@Override
		public Adapter caseObject(fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Object object) {
			return createObjectAdapter();
		}

		@Override
		public Adapter caseGoForward(GoForward object) {
			return createGoForwardAdapter();
		}

		@Override
		public Adapter caseGoBackward(GoBackward object) {
			return createGoBackwardAdapter();
		}

		@Override
		public Adapter caseOpenGripper(OpenGripper object) {
			return createOpenGripperAdapter();
		}

		@Override
		public Adapter caseCloseGripper(CloseGripper object) {
			return createCloseGripperAdapter();
		}

		@Override
		public Adapter caseTurn(Turn object) {
			return createTurnAdapter();
		}

		@Override
		public Adapter caseStop(Stop object) {
			return createStopAdapter();
		}

		@Override
		public Adapter caseStructuralCondition(StructuralCondition object) {
			return createStructuralConditionAdapter();
		}

		@Override
		public Adapter caseCondition(Condition object) {
			return createConditionAdapter();
		}

		@Override
		public Adapter caseComparison(Comparison object) {
			return createComparisonAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.NamedELement <em>Named ELement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.NamedELement
	 * @generated
	 */
	public Adapter createNamedELementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Polycreate <em>Polycreate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Polycreate
	 * @generated
	 */
	public Adapter createPolycreateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Instruction
	 * @generated
	 */
	public Adapter createInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.ControlPolycreate <em>Control Polycreate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.ControlPolycreate
	 * @generated
	 */
	public Adapter createControlPolycreateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.GripperSensor <em>Gripper Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.GripperSensor
	 * @generated
	 */
	public Adapter createGripperSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.RightSensor <em>Right Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.RightSensor
	 * @generated
	 */
	public Adapter createRightSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.LeftSensor <em>Left Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.LeftSensor
	 * @generated
	 */
	public Adapter createLeftSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Object
	 * @generated
	 */
	public Adapter createObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.GoForward <em>Go Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.GoForward
	 * @generated
	 */
	public Adapter createGoForwardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.GoBackward <em>Go Backward</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.GoBackward
	 * @generated
	 */
	public Adapter createGoBackwardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.OpenGripper <em>Open Gripper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.OpenGripper
	 * @generated
	 */
	public Adapter createOpenGripperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.CloseGripper <em>Close Gripper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.CloseGripper
	 * @generated
	 */
	public Adapter createCloseGripperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Turn <em>Turn</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Turn
	 * @generated
	 */
	public Adapter createTurnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Stop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Stop
	 * @generated
	 */
	public Adapter createStopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.StructuralCondition <em>Structural Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.StructuralCondition
	 * @generated
	 */
	public Adapter createStructuralConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Comparison <em>Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Comparison
	 * @generated
	 */
	public Adapter createComparisonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PolycreateAdapterFactory
