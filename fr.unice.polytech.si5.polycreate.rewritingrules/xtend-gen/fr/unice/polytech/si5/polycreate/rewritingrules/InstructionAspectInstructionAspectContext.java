package fr.unice.polytech.si5.polycreate.rewritingrules;

import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Instruction;
import fr.unice.polytech.si5.polycreate.rewritingrules.InstructionAspectInstructionAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class InstructionAspectInstructionAspectContext {
  public final static InstructionAspectInstructionAspectContext INSTANCE = new InstructionAspectInstructionAspectContext();
  
  public static InstructionAspectInstructionAspectProperties getSelf(final Instruction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.unice.polytech.si5.polycreate.rewritingrules.InstructionAspectInstructionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Instruction, InstructionAspectInstructionAspectProperties> map = new java.util.WeakHashMap<fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Instruction, fr.unice.polytech.si5.polycreate.rewritingrules.InstructionAspectInstructionAspectProperties>();
  
  public Map<Instruction, InstructionAspectInstructionAspectProperties> getMap() {
    return map;
  }
}
