/*
 * generated by Xtext 2.14.0
 */
package fr.unice.polytech.si5.polycreate.concretesyntax.formatting2

import com.google.inject.Inject
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Polycreate
import fr.unice.polytech.si5.polycreate.concretesyntax.services.PolycreateGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class PolycreateFormatter extends AbstractFormatter2 {
	
	@Inject extension PolycreateGrammarAccess

	def dispatch void format(Polycreate polycreate, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (operation : polycreate.operation) {
			operation.format
		}
		for (variable : polycreate.variable) {
			variable.format
		}
	}
	
	// TODO: implement for 
}