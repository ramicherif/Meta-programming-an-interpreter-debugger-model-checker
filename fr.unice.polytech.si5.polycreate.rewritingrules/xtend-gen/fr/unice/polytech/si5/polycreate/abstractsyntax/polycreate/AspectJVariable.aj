// AspectJ classes that have been aspectized and name
package fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate;
public aspect AspectJVariable{
void around (fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Variable self)  :target (self) && (call ( void fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Variable.initialize(  ) ) ) { fr.unice.polytech.si5.polycreate.rewritingrules.VariableAspect.initialize(self );}

}
