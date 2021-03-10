// AspectJ classes that have been aspectized and name
package fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate;
public aspect AspectJGoForward{
double around (fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.GoForward self)  :target (self) && (call ( double fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.GoForward.execute(  ) ) ) { return fr.unice.polytech.si5.polycreate.rewritingrules.GoForwardAspect.execute(self );}

}
