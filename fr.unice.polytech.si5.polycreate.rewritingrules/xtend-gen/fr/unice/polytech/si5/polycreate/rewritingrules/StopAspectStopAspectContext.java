package fr.unice.polytech.si5.polycreate.rewritingrules;

import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Stop;
import fr.unice.polytech.si5.polycreate.rewritingrules.StopAspectStopAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class StopAspectStopAspectContext {
  public final static StopAspectStopAspectContext INSTANCE = new StopAspectStopAspectContext();
  
  public static StopAspectStopAspectProperties getSelf(final Stop _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.unice.polytech.si5.polycreate.rewritingrules.StopAspectStopAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Stop, StopAspectStopAspectProperties> map = new java.util.WeakHashMap<fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Stop, fr.unice.polytech.si5.polycreate.rewritingrules.StopAspectStopAspectProperties>();
  
  public Map<Stop, StopAspectStopAspectProperties> getMap() {
    return map;
  }
}
