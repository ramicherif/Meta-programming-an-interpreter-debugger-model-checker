package fr.unice.polytech.si5.polycreate.rewritingrules;

import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.GoForward;
import fr.unice.polytech.si5.polycreate.rewritingrules.GoForwardAspectGoForwardAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class GoForwardAspectGoForwardAspectContext {
  public final static GoForwardAspectGoForwardAspectContext INSTANCE = new GoForwardAspectGoForwardAspectContext();
  
  public static GoForwardAspectGoForwardAspectProperties getSelf(final GoForward _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.unice.polytech.si5.polycreate.rewritingrules.GoForwardAspectGoForwardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<GoForward, GoForwardAspectGoForwardAspectProperties> map = new java.util.WeakHashMap<fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.GoForward, fr.unice.polytech.si5.polycreate.rewritingrules.GoForwardAspectGoForwardAspectProperties>();
  
  public Map<GoForward, GoForwardAspectGoForwardAspectProperties> getMap() {
    return map;
  }
}
