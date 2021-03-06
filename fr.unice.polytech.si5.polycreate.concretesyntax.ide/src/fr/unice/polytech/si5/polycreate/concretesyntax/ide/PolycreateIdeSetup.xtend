/*
 * generated by Xtext 2.14.0
 */
package fr.unice.polytech.si5.polycreate.concretesyntax.ide

import com.google.inject.Guice
import fr.unice.polytech.si5.polycreate.concretesyntax.PolycreateRuntimeModule
import fr.unice.polytech.si5.polycreate.concretesyntax.PolycreateStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class PolycreateIdeSetup extends PolycreateStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new PolycreateRuntimeModule, new PolycreateIdeModule))
	}
	
}
