package fr.unice.polytech.si5.polycreate.rewritingrules;

import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Operation;
import fr.unice.polytech.si5.polycreate.rewritingrules.OperationAspectOperationAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class OperationAspectOperationAspectContext {
  public final static OperationAspectOperationAspectContext INSTANCE = new OperationAspectOperationAspectContext();
  
  public static OperationAspectOperationAspectProperties getSelf(final Operation _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.unice.polytech.si5.polycreate.rewritingrules.OperationAspectOperationAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Operation, OperationAspectOperationAspectProperties> map = new java.util.WeakHashMap<fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Operation, fr.unice.polytech.si5.polycreate.rewritingrules.OperationAspectOperationAspectProperties>();
  
  public Map<Operation, OperationAspectOperationAspectProperties> getMap() {
    return map;
  }
}
