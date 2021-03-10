package fr.unice.polytech.si5.polycreate.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.GoForward;
import fr.unice.polytech.si5.polycreate.rewritingrules.GoForwardAspectGoForwardAspectProperties;
import fr.unice.polytech.si5.polycreate.rewritingrules.OperationAspect;
import fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler;

@Aspect(className = GoForward.class)
@Step
@SuppressWarnings("all")
public class GoForwardAspect extends OperationAspect {
  @Step
  @OverrideAspectMethod
  @ReplaceAspectMethod
  public static double execute(final GoForward _self) {
    final fr.unice.polytech.si5.polycreate.rewritingrules.GoForwardAspectGoForwardAspectProperties _self_ = fr.unice.polytech.si5.polycreate.rewritingrules.GoForwardAspectGoForwardAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# double execute()
    if (_self instanceof fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.GoForward){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(fr.unice.polytech.si5.polycreate.rewritingrules.GoForwardAspect._privk3_execute(_self_, (fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.GoForward)_self));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "GoForward", "execute");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (double)result;
  }
  
  private static PolyCreateControler controler(final GoForward _self) {
    final fr.unice.polytech.si5.polycreate.rewritingrules.GoForwardAspectGoForwardAspectProperties _self_ = fr.unice.polytech.si5.polycreate.rewritingrules.GoForwardAspectGoForwardAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# PolyCreateControler controler()
    if (_self instanceof fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.GoForward){
    	result = fr.unice.polytech.si5.polycreate.rewritingrules.GoForwardAspect._privk3_controler(_self_, (fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.GoForward)_self);
    };
    return (fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler)result;
  }
  
  private static void controler(final GoForward _self, final PolyCreateControler controler) {
    final fr.unice.polytech.si5.polycreate.rewritingrules.GoForwardAspectGoForwardAspectProperties _self_ = fr.unice.polytech.si5.polycreate.rewritingrules.GoForwardAspectGoForwardAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void controler(PolyCreateControler)
    if (_self instanceof fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.GoForward){
    	fr.unice.polytech.si5.polycreate.rewritingrules.GoForwardAspect._privk3_controler(_self_, (fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.GoForward)_self,controler);
    };
  }
  
  private static double super_execute(final GoForward _self) {
    final fr.unice.polytech.si5.polycreate.rewritingrules.OperationAspectOperationAspectProperties _self_ = fr.unice.polytech.si5.polycreate.rewritingrules.OperationAspectOperationAspectContext.getSelf(_self);
    return  fr.unice.polytech.si5.polycreate.rewritingrules.OperationAspect._privk3_execute(_self_, _self);
  }
  
  protected static double _privk3_execute(final GoForwardAspectGoForwardAspectProperties _self_, final GoForward _self) {
    GoForwardAspect.controler(_self).goForward();
    return (-1);
  }
  
  protected static PolyCreateControler _privk3_controler(final GoForwardAspectGoForwardAspectProperties _self_, final GoForward _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getControler") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.controler;
  }
  
  protected static void _privk3_controler(final GoForwardAspectGoForwardAspectProperties _self_, final GoForward _self, final PolyCreateControler controler) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setControler")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, controler);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.controler = controler;
    }
  }
}
