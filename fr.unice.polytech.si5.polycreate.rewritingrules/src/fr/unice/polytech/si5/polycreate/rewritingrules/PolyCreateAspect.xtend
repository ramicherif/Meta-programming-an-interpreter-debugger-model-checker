package fr.unice.polytech.si5.polycreate.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Variable
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Polycreate
import static extension fr.unice.polytech.si5.polycreate.rewritingrules.VariableAspect.*
import static extension fr.unice.polytech.si5.polycreate.rewritingrules.PolycreateAspect.*
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.univcotedazur.kairos.webots.polycreate.controler.*
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Turn
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.GoForward
import com.sun.org.glassfish.external.statistics.annotations.Reset
import fr.inria.diverse.k3.al.annotationprocessor.Step
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Instruction
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Operation
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.OpenGripper
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Comparison
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.GoBackward
import fr.unice.polytech.si5.polycreate.abstractsyntax.polycreate.Stop

/**
 * Sample aspect that gives java.io.File the ability to store Text content and save it to disk
 */

/* @Aspect(className=Polycreate)
class VariableAspect {
	public var Double currentValue =0.0 
	
	def void init() {
		_self.currentValue = _self.initialValue
	}

	
}
*/
@Aspect(className=Polycreate)
class PolycreateAspect { 
var PolyCreateControler controler = new PolyCreateControler()
	
	@Main
	def void entryPoint(){
		//_self.controler.openGripper
		
		
		_self.controler.passiveWait(10)
		
		//_self.controler.goForward()
		
		
		
		
		
		
		for(Variable v : _self.variable) { 
			v.initialize()
		}
		for(Operation i : _self.operation){
			i.execute()
		}
	}
	
	
}
@Aspect(className=Variable)
class VariableAspect {
	public var Double currentValue =0.0 
	
	@Step
	@ReplaceAspectMethod
	def void initialize() {
		_self.currentValue = _self.initialValue as Double
	}
	
	}
	
 @Aspect(className=Instruction)
class InstructionAspect extends OperationAspect{
	
}

@Aspect(className=OpenGripper)

class OpenGripperAspect extends InstructionAspect {
var PolyCreateControler controler = new PolyCreateControler()
@Step
def void openG(){

	
		_self.controler.openGripper}
	
	}


 @Aspect(className=Operation)
class OperationAspect{
	@Step
	@ReplaceAspectMethod
	def double execute(){
	return -1	
	}
}

 @Aspect(className=Comparison)
class ComparisonAspect {
def Boolean eval(){
}

}


@Aspect(className=GoForward)
@Step
class GoForwardAspect extends OperationAspect {
var PolyCreateControler controler = new PolyCreateControler()
@Step
@OverrideAspectMethod
@ReplaceAspectMethod
	def double execute(){
		_self.controler.goForward
		return -1
	}} 



 @Aspect(className=GoBackward)
 @Step
 
class GoBackwardAspect{
var PolyCreateControler controler = new PolyCreateControler()
	def void goBackward(){
		_self.controler.goBackward
	}		
}



@Aspect(className=Turn)
@Step
class TurnAspect{
 	var PolyCreateControler controler = new PolyCreateControler()
	def void turn(){
		_self.controler.turn(40.5)
	}

}


@Aspect(className=Stop)
@Step
class StopAspect{
 	var PolyCreateControler controler = new PolyCreateControler()
	def void stop(){
		_self.controler.stop
	}	
}


