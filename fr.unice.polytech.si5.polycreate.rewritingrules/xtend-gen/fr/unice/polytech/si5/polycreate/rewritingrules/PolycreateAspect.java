package fr.unice.polytech.si5.polycreate.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Operation;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Polycreate;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Variable;
import fr.unice.polytech.si5.polycreate.rewritingrules.PolycreateAspectPolycreateAspectProperties;
import fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler;
import org.eclipse.emf.common.util.EList;

/**
 * @Aspect(className=Polycreate)
 * class VariableAspect {
 * public var Double currentValue =0.0
 * 
 * def void init() {
 * _self.currentValue = _self.initialValue
 * }
 * 
 * 
 * }
 */
@Aspect(className = Polycreate.class)
@SuppressWarnings("all")
public class PolycreateAspect {
  @Main
  public static void entryPoint(final Polycreate _self) {
    final fr.unice.polytech.si5.polycreate.rewritingrules.PolycreateAspectPolycreateAspectProperties _self_ = fr.unice.polytech.si5.polycreate.rewritingrules.PolycreateAspectPolycreateAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void entryPoint()
    if (_self instanceof fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Polycreate){
    	fr.unice.polytech.si5.polycreate.rewritingrules.PolycreateAspect._privk3_entryPoint(_self_, (fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Polycreate)_self);
    };
  }
  
  private static PolyCreateControler controler(final Polycreate _self) {
    final fr.unice.polytech.si5.polycreate.rewritingrules.PolycreateAspectPolycreateAspectProperties _self_ = fr.unice.polytech.si5.polycreate.rewritingrules.PolycreateAspectPolycreateAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# PolyCreateControler controler()
    if (_self instanceof fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Polycreate){
    	result = fr.unice.polytech.si5.polycreate.rewritingrules.PolycreateAspect._privk3_controler(_self_, (fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Polycreate)_self);
    };
    return (fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler)result;
  }
  
  private static void controler(final Polycreate _self, final PolyCreateControler controler) {
    final fr.unice.polytech.si5.polycreate.rewritingrules.PolycreateAspectPolycreateAspectProperties _self_ = fr.unice.polytech.si5.polycreate.rewritingrules.PolycreateAspectPolycreateAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void controler(PolyCreateControler)
    if (_self instanceof fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Polycreate){
    	fr.unice.polytech.si5.polycreate.rewritingrules.PolycreateAspect._privk3_controler(_self_, (fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Polycreate)_self,controler);
    };
  }
  
  protected static void _privk3_entryPoint(final PolycreateAspectPolycreateAspectProperties _self_, final Polycreate _self) {
    PolycreateAspect.controler(_self).passiveWait(10);
    EList<Variable> _variable = _self.getVariable();
    for (final Variable v : _variable) {
      v.initialize();
    }
    EList<Operation> _operation = _self.getOperation();
    for (final Operation i : _operation) {
      i.execute();
    }
  }
  
  protected static PolyCreateControler _privk3_controler(final PolycreateAspectPolycreateAspectProperties _self_, final Polycreate _self) {
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
  
  protected static void _privk3_controler(final PolycreateAspectPolycreateAspectProperties _self_, final Polycreate _self, final PolyCreateControler controler) {
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
