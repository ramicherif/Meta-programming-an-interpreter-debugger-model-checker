package fr.unice.polytech.si5.polycreate.rewritingrules;

import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Comparison;
import fr.unice.polytech.si5.polycreate.rewritingrules.ComparisonAspectComparisonAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class ComparisonAspectComparisonAspectContext {
  public final static ComparisonAspectComparisonAspectContext INSTANCE = new ComparisonAspectComparisonAspectContext();
  
  public static ComparisonAspectComparisonAspectProperties getSelf(final Comparison _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.unice.polytech.si5.polycreate.rewritingrules.ComparisonAspectComparisonAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Comparison, ComparisonAspectComparisonAspectProperties> map = new java.util.WeakHashMap<fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Comparison, fr.unice.polytech.si5.polycreate.rewritingrules.ComparisonAspectComparisonAspectProperties>();
  
  public Map<Comparison, ComparisonAspectComparisonAspectProperties> getMap() {
    return map;
  }
}
