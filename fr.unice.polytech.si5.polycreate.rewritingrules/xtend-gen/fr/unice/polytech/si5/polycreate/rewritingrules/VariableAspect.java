package fr.unice.polytech.si5.polycreate.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Variable;
import fr.unice.polytech.si5.polycreate.rewritingrules.VariableAspectVariableAspectProperties;

@Aspect(className = Variable.class)
@SuppressWarnings("all")
public class VariableAspect {
  @Step
  @ReplaceAspectMethod
  public static void initialize(final Variable _self) {
    final fr.unice.polytech.si5.polycreate.rewritingrules.VariableAspectVariableAspectProperties _self_ = fr.unice.polytech.si5.polycreate.rewritingrules.VariableAspectVariableAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void initialize()
    if (_self instanceof fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Variable){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			fr.unice.polytech.si5.polycreate.rewritingrules.VariableAspect._privk3_initialize(_self_, (fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Variable)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Variable", "initialize");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  public static Double currentValue(final Variable _self) {
    final fr.unice.polytech.si5.polycreate.rewritingrules.VariableAspectVariableAspectProperties _self_ = fr.unice.polytech.si5.polycreate.rewritingrules.VariableAspectVariableAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Double currentValue()
    if (_self instanceof fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Variable){
    	result = fr.unice.polytech.si5.polycreate.rewritingrules.VariableAspect._privk3_currentValue(_self_, (fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Variable)_self);
    };
    return (java.lang.Double)result;
  }
  
  public static void currentValue(final Variable _self, final Double currentValue) {
    final fr.unice.polytech.si5.polycreate.rewritingrules.VariableAspectVariableAspectProperties _self_ = fr.unice.polytech.si5.polycreate.rewritingrules.VariableAspectVariableAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void currentValue(Double)
    if (_self instanceof fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Variable){
    	fr.unice.polytech.si5.polycreate.rewritingrules.VariableAspect._privk3_currentValue(_self_, (fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Variable)_self,currentValue);
    };
  }
  
  protected static void _privk3_initialize(final VariableAspectVariableAspectProperties _self_, final Variable _self) {
    double _initialValue = _self.getInitialValue();
    VariableAspect.currentValue(_self, ((Double) Double.valueOf(_initialValue)));
  }
  
  protected static Double _privk3_currentValue(final VariableAspectVariableAspectProperties _self_, final Variable _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrentValue") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.Double) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.currentValue;
  }
  
  protected static void _privk3_currentValue(final VariableAspectVariableAspectProperties _self_, final Variable _self, final Double currentValue) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCurrentValue")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, currentValue);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.currentValue = currentValue;
    }
  }
}
