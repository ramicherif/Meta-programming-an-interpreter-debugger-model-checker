package fr.unice.polytech.si5.polycreate.rewritingrules;

import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Polycreate;
import fr.unice.polytech.si5.polycreate.rewritingrules.PolycreateAspectPolycreateAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class PolycreateAspectPolycreateAspectContext {
  public final static PolycreateAspectPolycreateAspectContext INSTANCE = new PolycreateAspectPolycreateAspectContext();
  
  public static PolycreateAspectPolycreateAspectProperties getSelf(final Polycreate _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.unice.polytech.si5.polycreate.rewritingrules.PolycreateAspectPolycreateAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Polycreate, PolycreateAspectPolycreateAspectProperties> map = new java.util.WeakHashMap<fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Polycreate, fr.unice.polytech.si5.polycreate.rewritingrules.PolycreateAspectPolycreateAspectProperties>();
  
  public Map<Polycreate, PolycreateAspectPolycreateAspectProperties> getMap() {
    return map;
  }
}
