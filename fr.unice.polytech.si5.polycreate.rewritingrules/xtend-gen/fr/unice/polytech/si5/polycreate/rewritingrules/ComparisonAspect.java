package fr.unice.polytech.si5.polycreate.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Comparison;
import fr.unice.polytech.si5.polycreate.rewritingrules.ComparisonAspectComparisonAspectProperties;

@Aspect(className = Comparison.class)
@SuppressWarnings("all")
public class ComparisonAspect {
  public static Boolean eval(final Comparison _self) {
    final fr.unice.polytech.si5.polycreate.rewritingrules.ComparisonAspectComparisonAspectProperties _self_ = fr.unice.polytech.si5.polycreate.rewritingrules.ComparisonAspectComparisonAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Boolean eval()
    if (_self instanceof fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Comparison){
    	result = fr.unice.polytech.si5.polycreate.rewritingrules.ComparisonAspect._privk3_eval(_self_, (fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Comparison)_self);
    };
    return (java.lang.Boolean)result;
  }
  
  protected static Boolean _privk3_eval(final ComparisonAspectComparisonAspectProperties _self_, final Comparison _self) {
    return null;
  }
}
