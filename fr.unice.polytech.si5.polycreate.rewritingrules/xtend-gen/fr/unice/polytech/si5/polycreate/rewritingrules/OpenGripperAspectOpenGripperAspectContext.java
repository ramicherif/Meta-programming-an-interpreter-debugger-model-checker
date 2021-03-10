package fr.unice.polytech.si5.polycreate.rewritingrules;

import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.OpenGripper;
import fr.unice.polytech.si5.polycreate.rewritingrules.OpenGripperAspectOpenGripperAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class OpenGripperAspectOpenGripperAspectContext {
  public final static OpenGripperAspectOpenGripperAspectContext INSTANCE = new OpenGripperAspectOpenGripperAspectContext();
  
  public static OpenGripperAspectOpenGripperAspectProperties getSelf(final OpenGripper _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.unice.polytech.si5.polycreate.rewritingrules.OpenGripperAspectOpenGripperAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<OpenGripper, OpenGripperAspectOpenGripperAspectProperties> map = new java.util.WeakHashMap<fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.OpenGripper, fr.unice.polytech.si5.polycreate.rewritingrules.OpenGripperAspectOpenGripperAspectProperties>();
  
  public Map<OpenGripper, OpenGripperAspectOpenGripperAspectProperties> getMap() {
    return map;
  }
}
