package fr.unice.polytech.si5.polycreate.rewritingrules;

import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Turn;
import fr.unice.polytech.si5.polycreate.rewritingrules.TurnAspectTurnAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class TurnAspectTurnAspectContext {
  public final static TurnAspectTurnAspectContext INSTANCE = new TurnAspectTurnAspectContext();
  
  public static TurnAspectTurnAspectProperties getSelf(final Turn _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.unice.polytech.si5.polycreate.rewritingrules.TurnAspectTurnAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Turn, TurnAspectTurnAspectProperties> map = new java.util.WeakHashMap<fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Turn, fr.unice.polytech.si5.polycreate.rewritingrules.TurnAspectTurnAspectProperties>();
  
  public Map<Turn, TurnAspectTurnAspectProperties> getMap() {
    return map;
  }
}
