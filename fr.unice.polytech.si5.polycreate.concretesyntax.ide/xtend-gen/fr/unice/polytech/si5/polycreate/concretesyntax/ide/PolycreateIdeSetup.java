/**
 * generated by Xtext 2.14.0
 */
package fr.unice.polytech.si5.polycreate.concretesyntax.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import fr.unice.polytech.si5.polycreate.concretesyntax.PolycreateRuntimeModule;
import fr.unice.polytech.si5.polycreate.concretesyntax.PolycreateStandaloneSetup;
import fr.unice.polytech.si5.polycreate.concretesyntax.ide.PolycreateIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class PolycreateIdeSetup extends PolycreateStandaloneSetup {
  @Override
  public Injector createInjector() {
    PolycreateRuntimeModule _polycreateRuntimeModule = new PolycreateRuntimeModule();
    PolycreateIdeModule _polycreateIdeModule = new PolycreateIdeModule();
    return Guice.createInjector(Modules2.mixin(_polycreateRuntimeModule, _polycreateIdeModule));
  }
}
