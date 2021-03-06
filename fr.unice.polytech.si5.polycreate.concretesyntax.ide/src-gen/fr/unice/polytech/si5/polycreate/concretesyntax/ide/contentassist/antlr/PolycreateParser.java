/*
 * generated by Xtext 2.14.0
 */
package fr.unice.polytech.si5.polycreate.concretesyntax.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import fr.unice.polytech.si5.polycreate.concretesyntax.ide.contentassist.antlr.internal.InternalPolycreateParser;
import fr.unice.polytech.si5.polycreate.concretesyntax.services.PolycreateGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class PolycreateParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(PolycreateGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, PolycreateGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getOperationAccess().getAlternatives(), "rule__Operation__Alternatives");
			builder.put(grammarAccess.getVariableAccess().getAlternatives(), "rule__Variable__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getEDoubleAccess().getAlternatives_4_0(), "rule__EDouble__Alternatives_4_0");
			builder.put(grammarAccess.getVarTypeAccess().getAlternatives(), "rule__VarType__Alternatives");
			builder.put(grammarAccess.getPolycreateAccess().getGroup(), "rule__Polycreate__Group__0");
			builder.put(grammarAccess.getPolycreateAccess().getGroup_4(), "rule__Polycreate__Group_4__0");
			builder.put(grammarAccess.getPolycreateAccess().getGroup_4_3(), "rule__Polycreate__Group_4_3__0");
			builder.put(grammarAccess.getPolycreateAccess().getGroup_5(), "rule__Polycreate__Group_5__0");
			builder.put(grammarAccess.getPolycreateAccess().getGroup_5_3(), "rule__Polycreate__Group_5_3__0");
			builder.put(grammarAccess.getVariable_ImplAccess().getGroup(), "rule__Variable_Impl__Group__0");
			builder.put(grammarAccess.getVariable_ImplAccess().getGroup_4(), "rule__Variable_Impl__Group_4__0");
			builder.put(grammarAccess.getVariable_ImplAccess().getGroup_5(), "rule__Variable_Impl__Group_5__0");
			builder.put(grammarAccess.getGoForwardAccess().getGroup(), "rule__GoForward__Group__0");
			builder.put(grammarAccess.getGoBackwardAccess().getGroup(), "rule__GoBackward__Group__0");
			builder.put(grammarAccess.getOpenGripperAccess().getGroup(), "rule__OpenGripper__Group__0");
			builder.put(grammarAccess.getCloseGripperAccess().getGroup(), "rule__CloseGripper__Group__0");
			builder.put(grammarAccess.getTurnAccess().getGroup(), "rule__Turn__Group__0");
			builder.put(grammarAccess.getStopAccess().getGroup(), "rule__Stop__Group__0");
			builder.put(grammarAccess.getStructuralConditionAccess().getGroup(), "rule__StructuralCondition__Group__0");
			builder.put(grammarAccess.getStructuralConditionAccess().getGroup_2(), "rule__StructuralCondition__Group_2__0");
			builder.put(grammarAccess.getStructuralConditionAccess().getGroup_2_3(), "rule__StructuralCondition__Group_2_3__0");
			builder.put(grammarAccess.getStructuralConditionAccess().getGroup_3(), "rule__StructuralCondition__Group_3__0");
			builder.put(grammarAccess.getStructuralConditionAccess().getGroup_3_3(), "rule__StructuralCondition__Group_3_3__0");
			builder.put(grammarAccess.getStructuralConditionAccess().getGroup_7(), "rule__StructuralCondition__Group_7__0");
			builder.put(grammarAccess.getComparisonAccess().getGroup(), "rule__Comparison__Group__0");
			builder.put(grammarAccess.getComparisonAccess().getGroup_2(), "rule__Comparison__Group_2__0");
			builder.put(grammarAccess.getEDoubleAccess().getGroup(), "rule__EDouble__Group__0");
			builder.put(grammarAccess.getEDoubleAccess().getGroup_4(), "rule__EDouble__Group_4__0");
			builder.put(grammarAccess.getGripperSensorAccess().getGroup(), "rule__GripperSensor__Group__0");
			builder.put(grammarAccess.getGripperSensorAccess().getGroup_4(), "rule__GripperSensor__Group_4__0");
			builder.put(grammarAccess.getGripperSensorAccess().getGroup_5(), "rule__GripperSensor__Group_5__0");
			builder.put(grammarAccess.getRightSensorAccess().getGroup(), "rule__RightSensor__Group__0");
			builder.put(grammarAccess.getRightSensorAccess().getGroup_4(), "rule__RightSensor__Group_4__0");
			builder.put(grammarAccess.getRightSensorAccess().getGroup_5(), "rule__RightSensor__Group_5__0");
			builder.put(grammarAccess.getLeftSensorAccess().getGroup(), "rule__LeftSensor__Group__0");
			builder.put(grammarAccess.getLeftSensorAccess().getGroup_4(), "rule__LeftSensor__Group_4__0");
			builder.put(grammarAccess.getLeftSensorAccess().getGroup_5(), "rule__LeftSensor__Group_5__0");
			builder.put(grammarAccess.getObjectAccess().getGroup(), "rule__Object__Group__0");
			builder.put(grammarAccess.getObjectAccess().getGroup_4(), "rule__Object__Group_4__0");
			builder.put(grammarAccess.getObjectAccess().getGroup_5(), "rule__Object__Group_5__0");
			builder.put(grammarAccess.getObjectAccess().getGroup_6(), "rule__Object__Group_6__0");
			builder.put(grammarAccess.getPolycreateAccess().getNameAssignment_2(), "rule__Polycreate__NameAssignment_2");
			builder.put(grammarAccess.getPolycreateAccess().getOperationAssignment_4_2(), "rule__Polycreate__OperationAssignment_4_2");
			builder.put(grammarAccess.getPolycreateAccess().getOperationAssignment_4_3_1(), "rule__Polycreate__OperationAssignment_4_3_1");
			builder.put(grammarAccess.getPolycreateAccess().getVariableAssignment_5_2(), "rule__Polycreate__VariableAssignment_5_2");
			builder.put(grammarAccess.getPolycreateAccess().getVariableAssignment_5_3_1(), "rule__Polycreate__VariableAssignment_5_3_1");
			builder.put(grammarAccess.getVariable_ImplAccess().getNameAssignment_2(), "rule__Variable_Impl__NameAssignment_2");
			builder.put(grammarAccess.getVariable_ImplAccess().getTypeAssignment_4_1(), "rule__Variable_Impl__TypeAssignment_4_1");
			builder.put(grammarAccess.getVariable_ImplAccess().getInitialValueAssignment_5_1(), "rule__Variable_Impl__InitialValueAssignment_5_1");
			builder.put(grammarAccess.getStructuralConditionAccess().getThenAssignment_2_2(), "rule__StructuralCondition__ThenAssignment_2_2");
			builder.put(grammarAccess.getStructuralConditionAccess().getThenAssignment_2_3_1(), "rule__StructuralCondition__ThenAssignment_2_3_1");
			builder.put(grammarAccess.getStructuralConditionAccess().getElseAssignment_3_2(), "rule__StructuralCondition__ElseAssignment_3_2");
			builder.put(grammarAccess.getStructuralConditionAccess().getElseAssignment_3_3_1(), "rule__StructuralCondition__ElseAssignment_3_3_1");
			builder.put(grammarAccess.getStructuralConditionAccess().getIfAssignment_6(), "rule__StructuralCondition__IfAssignment_6");
			builder.put(grammarAccess.getStructuralConditionAccess().getIfAssignment_7_1(), "rule__StructuralCondition__IfAssignment_7_1");
			builder.put(grammarAccess.getComparisonAccess().getValueAssignment_2_1(), "rule__Comparison__ValueAssignment_2_1");
			builder.put(grammarAccess.getComparisonAccess().getLeftVariableAssignment_4(), "rule__Comparison__LeftVariableAssignment_4");
			builder.put(grammarAccess.getComparisonAccess().getRightVariableAssignment_6(), "rule__Comparison__RightVariableAssignment_6");
			builder.put(grammarAccess.getGripperSensorAccess().getNameAssignment_2(), "rule__GripperSensor__NameAssignment_2");
			builder.put(grammarAccess.getGripperSensorAccess().getTypeAssignment_4_1(), "rule__GripperSensor__TypeAssignment_4_1");
			builder.put(grammarAccess.getGripperSensorAccess().getInitialValueAssignment_5_1(), "rule__GripperSensor__InitialValueAssignment_5_1");
			builder.put(grammarAccess.getRightSensorAccess().getNameAssignment_2(), "rule__RightSensor__NameAssignment_2");
			builder.put(grammarAccess.getRightSensorAccess().getTypeAssignment_4_1(), "rule__RightSensor__TypeAssignment_4_1");
			builder.put(grammarAccess.getRightSensorAccess().getInitialValueAssignment_5_1(), "rule__RightSensor__InitialValueAssignment_5_1");
			builder.put(grammarAccess.getLeftSensorAccess().getNameAssignment_2(), "rule__LeftSensor__NameAssignment_2");
			builder.put(grammarAccess.getLeftSensorAccess().getTypeAssignment_4_1(), "rule__LeftSensor__TypeAssignment_4_1");
			builder.put(grammarAccess.getLeftSensorAccess().getInitialValueAssignment_5_1(), "rule__LeftSensor__InitialValueAssignment_5_1");
			builder.put(grammarAccess.getObjectAccess().getNameAssignment_2(), "rule__Object__NameAssignment_2");
			builder.put(grammarAccess.getObjectAccess().getTypeAssignment_4_1(), "rule__Object__TypeAssignment_4_1");
			builder.put(grammarAccess.getObjectAccess().getInitialValueAssignment_5_1(), "rule__Object__InitialValueAssignment_5_1");
			builder.put(grammarAccess.getObjectAccess().getPositionAssignment_6_1(), "rule__Object__PositionAssignment_6_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private PolycreateGrammarAccess grammarAccess;

	@Override
	protected InternalPolycreateParser createParser() {
		InternalPolycreateParser result = new InternalPolycreateParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public PolycreateGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(PolycreateGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
