package fr.unice.polytech.si5.polycreate.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.GoBackward;
import fr.unice.polytech.si5.polycreate.rewritingrules.GoBackwardAspectGoBackwardAspectProperties;
import fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler;

@Aspect(className = GoBackward.class)
@Step
@SuppressWarnings("all")
public class GoBackwardAspect {
  public static void goBackward(final GoBackward _self) {
    final fr.unice.polytech.si5.polycreate.rewritingrules.GoBackwardAspectGoBackwardAspectProperties _self_ = fr.unice.polytech.si5.polycreate.rewritingrules.GoBackwardAspectGoBackwardAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void goBackward()
    if (_self instanceof fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.GoBackward){
    	fr.unice.polytech.si5.polycreate.rewritingrules.GoBackwardAspect._privk3_goBackward(_self_, (fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.GoBackward)_self);
    };
  }
  
  private static PolyCreateControler controler(final GoBackward _self) {
    final fr.unice.polytech.si5.polycreate.rewritingrules.GoBackwardAspectGoBackwardAspectProperties _self_ = fr.unice.polytech.si5.polycreate.rewritingrules.GoBackwardAspectGoBackwardAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# PolyCreateControler controler()
    if (_self instanceof fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.GoBackward){
    	result = fr.unice.polytech.si5.polycreate.rewritingrules.GoBackwardAspect._privk3_controler(_self_, (fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.GoBackward)_self);
    };
    return (fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler)result;
  }
  
  private static void controler(final GoBackward _self, final PolyCreateControler controler) {
    final fr.unice.polytech.si5.polycreate.rewritingrules.GoBackwardAspectGoBackwardAspectProperties _self_ = fr.unice.polytech.si5.polycreate.rewritingrules.GoBackwardAspectGoBackwardAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void controler(PolyCreateControler)
    if (_self instanceof fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.GoBackward){
    	fr.unice.polytech.si5.polycreate.rewritingrules.GoBackwardAspect._privk3_controler(_self_, (fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.GoBackward)_self,controler);
    };
  }
  
  protected static void _privk3_goBackward(final GoBackwardAspectGoBackwardAspectProperties _self_, final GoBackward _self) {
    GoBackwardAspect.controler(_self).goBackward();
  }
  
  protected static PolyCreateControler _privk3_controler(final GoBackwardAspectGoBackwardAspectProperties _self_, final GoBackward _self) {
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
  
  protected static void _privk3_controler(final GoBackwardAspectGoBackwardAspectProperties _self_, final GoBackward _self, final PolyCreateControler controler) {
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
