package fr.unice.polytech.si5.polycreate.rewritingrules;

import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.GoBackward;
import fr.unice.polytech.si5.polycreate.rewritingrules.GoBackwardAspectGoBackwardAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class GoBackwardAspectGoBackwardAspectContext {
  public final static GoBackwardAspectGoBackwardAspectContext INSTANCE = new GoBackwardAspectGoBackwardAspectContext();
  
  public static GoBackwardAspectGoBackwardAspectProperties getSelf(final GoBackward _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.unice.polytech.si5.polycreate.rewritingrules.GoBackwardAspectGoBackwardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<GoBackward, GoBackwardAspectGoBackwardAspectProperties> map = new java.util.WeakHashMap<fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.GoBackward, fr.unice.polytech.si5.polycreate.rewritingrules.GoBackwardAspectGoBackwardAspectProperties>();
  
  public Map<GoBackward, GoBackwardAspectGoBackwardAspectProperties> getMap() {
    return map;
  }
}
