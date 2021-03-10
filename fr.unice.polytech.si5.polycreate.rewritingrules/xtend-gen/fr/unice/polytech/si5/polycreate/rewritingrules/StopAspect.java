package fr.unice.polytech.si5.polycreate.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Stop;
import fr.unice.polytech.si5.polycreate.rewritingrules.StopAspectStopAspectProperties;
import fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler;

@Aspect(className = Stop.class)
@Step
@SuppressWarnings("all")
public class StopAspect {
  public static void stop(final Stop _self) {
    final fr.unice.polytech.si5.polycreate.rewritingrules.StopAspectStopAspectProperties _self_ = fr.unice.polytech.si5.polycreate.rewritingrules.StopAspectStopAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void stop()
    if (_self instanceof fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Stop){
    	fr.unice.polytech.si5.polycreate.rewritingrules.StopAspect._privk3_stop(_self_, (fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Stop)_self);
    };
  }
  
  private static PolyCreateControler controler(final Stop _self) {
    final fr.unice.polytech.si5.polycreate.rewritingrules.StopAspectStopAspectProperties _self_ = fr.unice.polytech.si5.polycreate.rewritingrules.StopAspectStopAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# PolyCreateControler controler()
    if (_self instanceof fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Stop){
    	result = fr.unice.polytech.si5.polycreate.rewritingrules.StopAspect._privk3_controler(_self_, (fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Stop)_self);
    };
    return (fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler)result;
  }
  
  private static void controler(final Stop _self, final PolyCreateControler controler) {
    final fr.unice.polytech.si5.polycreate.rewritingrules.StopAspectStopAspectProperties _self_ = fr.unice.polytech.si5.polycreate.rewritingrules.StopAspectStopAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void controler(PolyCreateControler)
    if (_self instanceof fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Stop){
    	fr.unice.polytech.si5.polycreate.rewritingrules.StopAspect._privk3_controler(_self_, (fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Stop)_self,controler);
    };
  }
  
  protected static void _privk3_stop(final StopAspectStopAspectProperties _self_, final Stop _self) {
    StopAspect.controler(_self).stop();
  }
  
  protected static PolyCreateControler _privk3_controler(final StopAspectStopAspectProperties _self_, final Stop _self) {
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
  
  protected static void _privk3_controler(final StopAspectStopAspectProperties _self_, final Stop _self, final PolyCreateControler controler) {
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
