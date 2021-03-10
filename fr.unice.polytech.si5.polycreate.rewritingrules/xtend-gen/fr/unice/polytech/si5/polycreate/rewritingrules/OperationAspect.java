package fr.unice.polytech.si5.polycreate.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Operation;
import fr.unice.polytech.si5.polycreate.rewritingrules.OperationAspectOperationAspectProperties;

@Aspect(className = Operation.class)
@SuppressWarnings("all")
public class OperationAspect {
  @Step
  @ReplaceAspectMethod
  public static double execute(final Operation _self) {
    final fr.unice.polytech.si5.polycreate.rewritingrules.OperationAspectOperationAspectProperties _self_ = fr.unice.polytech.si5.polycreate.rewritingrules.OperationAspectOperationAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto fr.unice.polytech.si5.polycreate.rewritingrules.OperationAspect#double execute() from fr.unice.polytech.si5.polycreate.rewritingrules.GoForwardAspect
    		if (_self instanceof fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.GoForward){
    			result = fr.unice.polytech.si5.polycreate.rewritingrules.GoForwardAspect.execute((fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.GoForward)_self);
    		} else
    		// EndInjectInto fr.unice.polytech.si5.polycreate.rewritingrules.OperationAspect#double execute() from fr.unice.polytech.si5.polycreate.rewritingrules.GoForwardAspect
    // #DispatchPointCut_before# double execute()
    if (_self instanceof fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Operation){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(fr.unice.polytech.si5.polycreate.rewritingrules.OperationAspect._privk3_execute(_self_, (fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Operation)_self));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Operation", "execute");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (double)result;
  }
  
  protected static double _privk3_execute(final OperationAspectOperationAspectProperties _self_, final Operation _self) {
    return (-1);
  }
}
