package fr.unice.polytech.si5.polycreate.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Instruction;
import fr.unice.polytech.si5.polycreate.rewritingrules.OperationAspect;

@Aspect(className = Instruction.class)
@SuppressWarnings("all")
public class InstructionAspect extends OperationAspect {
}
