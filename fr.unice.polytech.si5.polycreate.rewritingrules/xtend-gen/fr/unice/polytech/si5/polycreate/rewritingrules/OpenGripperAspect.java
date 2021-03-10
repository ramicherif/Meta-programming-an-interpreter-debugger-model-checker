package fr.unice.polytech.si5.polycreate.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.OpenGripper;
import fr.unice.polytech.si5.polycreate.rewritingrules.InstructionAspect;
import fr.unice.polytech.si5.polycreate.rewritingrules.OpenGripperAspectOpenGripperAspectProperties;
import fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler;

@Aspect(className = OpenGripper.class)
@SuppressWarnings("all")
public class OpenGripperAspect extends InstructionAspect {
  @Step
  public static void openG(final OpenGripper _self) {
    final fr.unice.polytech.si5.polycreate.rewritingrules.OpenGripperAspectOpenGripperAspectProperties _self_ = fr.unice.polytech.si5.polycreate.rewritingrules.OpenGripperAspectOpenGripperAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void openG()
    if (_self instanceof fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.OpenGripper){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			fr.unice.polytech.si5.polycreate.rewritingrules.OpenGripperAspect._privk3_openG(_self_, (fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.OpenGripper)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "OpenGripper", "openG");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  private static PolyCreateControler controler(final OpenGripper _self) {
    final fr.unice.polytech.si5.polycreate.rewritingrules.OpenGripperAspectOpenGripperAspectProperties _self_ = fr.unice.polytech.si5.polycreate.rewritingrules.OpenGripperAspectOpenGripperAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# PolyCreateControler controler()
    if (_self instanceof fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.OpenGripper){
    	result = fr.unice.polytech.si5.polycreate.rewritingrules.OpenGripperAspect._privk3_controler(_self_, (fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.OpenGripper)_self);
    };
    return (fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler)result;
  }
  
  private static void controler(final OpenGripper _self, final PolyCreateControler controler) {
    final fr.unice.polytech.si5.polycreate.rewritingrules.OpenGripperAspectOpenGripperAspectProperties _self_ = fr.unice.polytech.si5.polycreate.rewritingrules.OpenGripperAspectOpenGripperAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void controler(PolyCreateControler)
    if (_self instanceof fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.OpenGripper){
    	fr.unice.polytech.si5.polycreate.rewritingrules.OpenGripperAspect._privk3_controler(_self_, (fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.OpenGripper)_self,controler);
    };
  }
  
  protected static void _privk3_openG(final OpenGripperAspectOpenGripperAspectProperties _self_, final OpenGripper _self) {
    OpenGripperAspect.controler(_self).openGripper();
  }
  
  protected static PolyCreateControler _privk3_controler(final OpenGripperAspectOpenGripperAspectProperties _self_, final OpenGripper _self) {
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
  
  protected static void _privk3_controler(final OpenGripperAspectOpenGripperAspectProperties _self_, final OpenGripper _self, final PolyCreateControler controler) {
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
