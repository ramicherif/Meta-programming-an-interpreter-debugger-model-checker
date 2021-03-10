// AspectJ classes that have been aspectized and name
package fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate;
public aspect AspectJOperation{
double around (fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Operation self)  :target (self) && (call ( double fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Operation.execute(  ) ) ) { return fr.unice.polytech.si5.polycreate.rewritingrules.OperationAspect.execute(self );}

}
