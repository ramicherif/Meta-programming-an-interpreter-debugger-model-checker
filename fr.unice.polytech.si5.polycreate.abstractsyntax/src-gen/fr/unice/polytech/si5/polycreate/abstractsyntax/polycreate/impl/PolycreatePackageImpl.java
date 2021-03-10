/**
 */
package fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.impl;

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
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.PolycreateFactory;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.PolycreatePackage;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.RightSensor;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Stop;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.StructuralCondition;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Turn;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.VarType;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Variable;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PolycreatePackageImpl extends EPackageImpl implements PolycreatePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedELementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polycreateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlPolycreateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gripperSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rightSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leftSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goForwardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goBackwardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openGripperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass closeGripperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuralConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparisonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum varTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.PolycreatePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PolycreatePackageImpl() {
		super(eNS_URI, PolycreateFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link PolycreatePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PolycreatePackage init() {
		if (isInited)
			return (PolycreatePackage) EPackage.Registry.INSTANCE.getEPackage(PolycreatePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPolycreatePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PolycreatePackageImpl thePolycreatePackage = registeredPolycreatePackage instanceof PolycreatePackageImpl
				? (PolycreatePackageImpl) registeredPolycreatePackage
				: new PolycreatePackageImpl();

		isInited = true;

		// Create package meta-data objects
		thePolycreatePackage.createPackageContents();

		// Initialize created meta-data
		thePolycreatePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePolycreatePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PolycreatePackage.eNS_URI, thePolycreatePackage);
		return thePolycreatePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedELement() {
		return namedELementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedELement_Name() {
		return (EAttribute) namedELementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolycreate() {
		return polycreateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolycreate_Operation() {
		return (EReference) polycreateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolycreate_Variable() {
		return (EReference) polycreateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Type() {
		return (EAttribute) variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_InitialValue() {
		return (EAttribute) variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariable__Initialize() {
		return variableEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperation__Execute() {
		return operationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction() {
		return instructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlPolycreate() {
		return controlPolycreateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGripperSensor() {
		return gripperSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRightSensor() {
		return rightSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeftSensor() {
		return leftSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject() {
		return objectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObject_Position() {
		return (EAttribute) objectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoForward() {
		return goForwardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoBackward() {
		return goBackwardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenGripper() {
		return openGripperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloseGripper() {
		return closeGripperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTurn() {
		return turnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStop() {
		return stopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuralCondition() {
		return structuralConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuralCondition_Then() {
		return (EReference) structuralConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuralCondition_Else() {
		return (EReference) structuralConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuralCondition_If() {
		return (EReference) structuralConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComparison() {
		return comparisonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComparison_Value() {
		return (EAttribute) comparisonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComparison_LeftVariable() {
		return (EReference) comparisonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComparison_RightVariable() {
		return (EReference) comparisonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVarType() {
		return varTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolycreateFactory getPolycreateFactory() {
		return (PolycreateFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		namedELementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedELementEClass, NAMED_ELEMENT__NAME);

		polycreateEClass = createEClass(POLYCREATE);
		createEReference(polycreateEClass, POLYCREATE__OPERATION);
		createEReference(polycreateEClass, POLYCREATE__VARIABLE);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__TYPE);
		createEAttribute(variableEClass, VARIABLE__INITIAL_VALUE);
		createEOperation(variableEClass, VARIABLE___INITIALIZE);

		operationEClass = createEClass(OPERATION);
		createEOperation(operationEClass, OPERATION___EXECUTE);

		instructionEClass = createEClass(INSTRUCTION);

		controlPolycreateEClass = createEClass(CONTROL_POLYCREATE);

		gripperSensorEClass = createEClass(GRIPPER_SENSOR);

		rightSensorEClass = createEClass(RIGHT_SENSOR);

		leftSensorEClass = createEClass(LEFT_SENSOR);

		objectEClass = createEClass(OBJECT);
		createEAttribute(objectEClass, OBJECT__POSITION);

		goForwardEClass = createEClass(GO_FORWARD);

		goBackwardEClass = createEClass(GO_BACKWARD);

		openGripperEClass = createEClass(OPEN_GRIPPER);

		closeGripperEClass = createEClass(CLOSE_GRIPPER);

		turnEClass = createEClass(TURN);

		stopEClass = createEClass(STOP);

		structuralConditionEClass = createEClass(STRUCTURAL_CONDITION);
		createEReference(structuralConditionEClass, STRUCTURAL_CONDITION__THEN);
		createEReference(structuralConditionEClass, STRUCTURAL_CONDITION__ELSE);
		createEReference(structuralConditionEClass, STRUCTURAL_CONDITION__IF);

		conditionEClass = createEClass(CONDITION);

		comparisonEClass = createEClass(COMPARISON);
		createEAttribute(comparisonEClass, COMPARISON__VALUE);
		createEReference(comparisonEClass, COMPARISON__LEFT_VARIABLE);
		createEReference(comparisonEClass, COMPARISON__RIGHT_VARIABLE);

		// Create enums
		varTypeEEnum = createEEnum(VAR_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		polycreateEClass.getESuperTypes().add(this.getNamedELement());
		variableEClass.getESuperTypes().add(this.getNamedELement());
		instructionEClass.getESuperTypes().add(this.getOperation());
		controlPolycreateEClass.getESuperTypes().add(this.getOperation());
		gripperSensorEClass.getESuperTypes().add(this.getVariable());
		rightSensorEClass.getESuperTypes().add(this.getVariable());
		leftSensorEClass.getESuperTypes().add(this.getVariable());
		objectEClass.getESuperTypes().add(this.getVariable());
		goForwardEClass.getESuperTypes().add(this.getInstruction());
		goBackwardEClass.getESuperTypes().add(this.getInstruction());
		openGripperEClass.getESuperTypes().add(this.getInstruction());
		closeGripperEClass.getESuperTypes().add(this.getInstruction());
		turnEClass.getESuperTypes().add(this.getInstruction());
		stopEClass.getESuperTypes().add(this.getInstruction());
		structuralConditionEClass.getESuperTypes().add(this.getControlPolycreate());
		comparisonEClass.getESuperTypes().add(this.getCondition());

		// Initialize classes, features, and operations; add parameters
		initEClass(namedELementEClass, NamedELement.class, "NamedELement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedELement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedELement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(polycreateEClass, Polycreate.class, "Polycreate", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPolycreate_Operation(), this.getOperation(), null, "operation", null, 0, -1, Polycreate.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolycreate_Variable(), this.getVariable(), null, "variable", null, 0, -1, Polycreate.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Type(), this.getVarType(), "type", "int", 0, 1, Variable.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_InitialValue(), ecorePackage.getEDouble(), "initialValue", "0.0", 0, 1,
				Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEOperation(getVariable__Initialize(), null, "initialize", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getOperation__Execute(), null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(instructionEClass, Instruction.class, "Instruction", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(controlPolycreateEClass, ControlPolycreate.class, "ControlPolycreate", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(gripperSensorEClass, GripperSensor.class, "GripperSensor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(rightSensorEClass, RightSensor.class, "RightSensor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(leftSensorEClass, LeftSensor.class, "LeftSensor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectEClass, fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Object.class, "Object",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObject_Position(), this.getVarType(), "position", "GPS", 0, 1,
				fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Object.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(goForwardEClass, GoForward.class, "GoForward", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(goBackwardEClass, GoBackward.class, "GoBackward", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(openGripperEClass, OpenGripper.class, "OpenGripper", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(closeGripperEClass, CloseGripper.class, "CloseGripper", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(turnEClass, Turn.class, "Turn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stopEClass, Stop.class, "Stop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(structuralConditionEClass, StructuralCondition.class, "StructuralCondition", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructuralCondition_Then(), this.getOperation(), null, "then", null, 0, -1,
				StructuralCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructuralCondition_Else(), this.getOperation(), null, "else", null, 0, -1,
				StructuralCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructuralCondition_If(), this.getCondition(), null, "if", null, 1, -1,
				StructuralCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(comparisonEClass, Comparison.class, "Comparison", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComparison_Value(), this.getVarType(), "value", "double", 0, 1, Comparison.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComparison_LeftVariable(), this.getVariable(), null, "leftVariable", null, 1, 1,
				Comparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComparison_RightVariable(), this.getVariable(), null, "rightVariable", null, 1, 1,
				Comparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(varTypeEEnum, VarType.class, "VarType");
		addEEnumLiteral(varTypeEEnum, VarType.INT);
		addEEnumLiteral(varTypeEEnum, VarType.DOUBLE);
		addEEnumLiteral(varTypeEEnum, VarType.POSITION_SENSOR);
		addEEnumLiteral(varTypeEEnum, VarType.TOUCH_SENSOR);
		addEEnumLiteral(varTypeEEnum, VarType.DISTANCE_SENSOR);
		addEEnumLiteral(varTypeEEnum, VarType.CAMERA);
		addEEnumLiteral(varTypeEEnum, VarType.RECEIVER);
		addEEnumLiteral(varTypeEEnum, VarType.GPS);
		addEEnumLiteral(varTypeEEnum, VarType.MOTOR);

		// Create resource
		createResource(eNS_URI);
	}

} //PolycreatePackageImpl
