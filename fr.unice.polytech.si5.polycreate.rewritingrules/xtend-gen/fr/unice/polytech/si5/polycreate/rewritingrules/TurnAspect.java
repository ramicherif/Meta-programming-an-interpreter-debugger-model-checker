package fr.unice.polytech.si5.polycreate.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Turn;
import fr.unice.polytech.si5.polycreate.rewritingrules.TurnAspectTurnAspectProperties;
import fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler;

@Aspect(className = Turn.class)
@Step
@SuppressWarnings("all")
public class TurnAspect {
  public static void turn(final Turn _self) {
    final fr.unice.polytech.si5.polycreate.rewritingrules.TurnAspectTurnAspectProperties _self_ = fr.unice.polytech.si5.polycreate.rewritingrules.TurnAspectTurnAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void turn()
    if (_self instanceof fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Turn){
    	fr.unice.polytech.si5.polycreate.rewritingrules.TurnAspect._privk3_turn(_self_, (fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Turn)_self);
    };
  }
  
  private static PolyCreateControler controler(final Turn _self) {
    final fr.unice.polytech.si5.polycreate.rewritingrules.TurnAspectTurnAspectProperties _self_ = fr.unice.polytech.si5.polycreate.rewritingrules.TurnAspectTurnAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# PolyCreateControler controler()
    if (_self instanceof fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Turn){
    	result = fr.unice.polytech.si5.polycreate.rewritingrules.TurnAspect._privk3_controler(_self_, (fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Turn)_self);
    };
    return (fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler)result;
  }
  
  private static void controler(final Turn _self, final PolyCreateControler controler) {
    final fr.unice.polytech.si5.polycreate.rewritingrules.TurnAspectTurnAspectProperties _self_ = fr.unice.polytech.si5.polycreate.rewritingrules.TurnAspectTurnAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void controler(PolyCreateControler)
    if (_self instanceof fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Turn){
    	fr.unice.polytech.si5.polycreate.rewritingrules.TurnAspect._privk3_controler(_self_, (fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Turn)_self,controler);
    };
  }
  
  protected static void _privk3_turn(final TurnAspectTurnAspectProperties _self_, final Turn _self) {
    TurnAspect.controler(_self).turn(40.5);
  }
  
  protected static PolyCreateControler _privk3_controler(final TurnAspectTurnAspectProperties _self_, final Turn _self) {
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
  
  protected static void _privk3_controler(final TurnAspectTurnAspectProperties _self_, final Turn _self, final PolyCreateControler controler) {
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
