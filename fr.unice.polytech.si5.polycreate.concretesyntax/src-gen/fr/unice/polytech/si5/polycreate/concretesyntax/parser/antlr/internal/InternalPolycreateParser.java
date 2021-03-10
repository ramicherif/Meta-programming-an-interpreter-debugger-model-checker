package fr.unice.polytech.si5.polycreate.concretesyntax.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.unice.polytech.si5.polycreate.concretesyntax.services.PolycreateGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPolycreateParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Polycreate'", "'{'", "'operation'", "','", "'}'", "'variable'", "'Variable'", "'type'", "'initialValue'", "'GoForward'", "'GoBackward'", "'OpenGripper'", "'CloseGripper'", "'Turn'", "'Stop'", "'StructuralCondition'", "'then'", "'('", "')'", "'else'", "'if'", "'Comparison'", "'value'", "'leftVariable'", "'rightVariable'", "'-'", "'.'", "'E'", "'e'", "'GripperSensor'", "'RightSensor'", "'LeftSensor'", "'Object'", "'position'", "'int'", "'double'", "'PositionSensor'", "'TouchSensor'", "'DistanceSensor'", "'Camera'", "'Receiver'", "'GPS'", "'Motor'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalPolycreateParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPolycreateParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPolycreateParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPolycreate.g"; }



     	private PolycreateGrammarAccess grammarAccess;

        public InternalPolycreateParser(TokenStream input, PolycreateGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Polycreate";
       	}

       	@Override
       	protected PolycreateGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePolycreate"
    // InternalPolycreate.g:65:1: entryRulePolycreate returns [EObject current=null] : iv_rulePolycreate= rulePolycreate EOF ;
    public final EObject entryRulePolycreate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolycreate = null;


        try {
            // InternalPolycreate.g:65:51: (iv_rulePolycreate= rulePolycreate EOF )
            // InternalPolycreate.g:66:2: iv_rulePolycreate= rulePolycreate EOF
            {
             newCompositeNode(grammarAccess.getPolycreateRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePolycreate=rulePolycreate();

            state._fsp--;

             current =iv_rulePolycreate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePolycreate"


    // $ANTLR start "rulePolycreate"
    // InternalPolycreate.g:72:1: rulePolycreate returns [EObject current=null] : ( () otherlv_1= 'Polycreate' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'operation' otherlv_5= '{' ( (lv_operation_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_operation_8_0= ruleOperation ) ) )* otherlv_9= '}' )? (otherlv_10= 'variable' otherlv_11= '{' ( (lv_variable_12_0= ruleVariable ) ) (otherlv_13= ',' ( (lv_variable_14_0= ruleVariable ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject rulePolycreate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_operation_6_0 = null;

        EObject lv_operation_8_0 = null;

        EObject lv_variable_12_0 = null;

        EObject lv_variable_14_0 = null;



        	enterRule();

        try {
            // InternalPolycreate.g:78:2: ( ( () otherlv_1= 'Polycreate' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'operation' otherlv_5= '{' ( (lv_operation_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_operation_8_0= ruleOperation ) ) )* otherlv_9= '}' )? (otherlv_10= 'variable' otherlv_11= '{' ( (lv_variable_12_0= ruleVariable ) ) (otherlv_13= ',' ( (lv_variable_14_0= ruleVariable ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalPolycreate.g:79:2: ( () otherlv_1= 'Polycreate' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'operation' otherlv_5= '{' ( (lv_operation_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_operation_8_0= ruleOperation ) ) )* otherlv_9= '}' )? (otherlv_10= 'variable' otherlv_11= '{' ( (lv_variable_12_0= ruleVariable ) ) (otherlv_13= ',' ( (lv_variable_14_0= ruleVariable ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalPolycreate.g:79:2: ( () otherlv_1= 'Polycreate' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'operation' otherlv_5= '{' ( (lv_operation_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_operation_8_0= ruleOperation ) ) )* otherlv_9= '}' )? (otherlv_10= 'variable' otherlv_11= '{' ( (lv_variable_12_0= ruleVariable ) ) (otherlv_13= ',' ( (lv_variable_14_0= ruleVariable ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalPolycreate.g:80:3: () otherlv_1= 'Polycreate' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'operation' otherlv_5= '{' ( (lv_operation_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_operation_8_0= ruleOperation ) ) )* otherlv_9= '}' )? (otherlv_10= 'variable' otherlv_11= '{' ( (lv_variable_12_0= ruleVariable ) ) (otherlv_13= ',' ( (lv_variable_14_0= ruleVariable ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalPolycreate.g:80:3: ()
            // InternalPolycreate.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPolycreateAccess().getPolycreateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPolycreateAccess().getPolycreateKeyword_1());
            		
            // InternalPolycreate.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPolycreate.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalPolycreate.g:92:4: (lv_name_2_0= ruleEString )
            // InternalPolycreate.g:93:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPolycreateAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPolycreateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.unice.polytech.si5.polycreate.concretesyntax.Polycreate.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getPolycreateAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalPolycreate.g:114:3: (otherlv_4= 'operation' otherlv_5= '{' ( (lv_operation_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_operation_8_0= ruleOperation ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalPolycreate.g:115:4: otherlv_4= 'operation' otherlv_5= '{' ( (lv_operation_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_operation_8_0= ruleOperation ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getPolycreateAccess().getOperationKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getPolycreateAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalPolycreate.g:123:4: ( (lv_operation_6_0= ruleOperation ) )
                    // InternalPolycreate.g:124:5: (lv_operation_6_0= ruleOperation )
                    {
                    // InternalPolycreate.g:124:5: (lv_operation_6_0= ruleOperation )
                    // InternalPolycreate.g:125:6: lv_operation_6_0= ruleOperation
                    {

                    						newCompositeNode(grammarAccess.getPolycreateAccess().getOperationOperationParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_operation_6_0=ruleOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPolycreateRule());
                    						}
                    						add(
                    							current,
                    							"operation",
                    							lv_operation_6_0,
                    							"fr.unice.polytech.si5.polycreate.concretesyntax.Polycreate.Operation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPolycreate.g:142:4: (otherlv_7= ',' ( (lv_operation_8_0= ruleOperation ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalPolycreate.g:143:5: otherlv_7= ',' ( (lv_operation_8_0= ruleOperation ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getPolycreateAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalPolycreate.g:147:5: ( (lv_operation_8_0= ruleOperation ) )
                    	    // InternalPolycreate.g:148:6: (lv_operation_8_0= ruleOperation )
                    	    {
                    	    // InternalPolycreate.g:148:6: (lv_operation_8_0= ruleOperation )
                    	    // InternalPolycreate.g:149:7: lv_operation_8_0= ruleOperation
                    	    {

                    	    							newCompositeNode(grammarAccess.getPolycreateAccess().getOperationOperationParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_operation_8_0=ruleOperation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPolycreateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"operation",
                    	    								lv_operation_8_0,
                    	    								"fr.unice.polytech.si5.polycreate.concretesyntax.Polycreate.Operation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getPolycreateAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalPolycreate.g:172:3: (otherlv_10= 'variable' otherlv_11= '{' ( (lv_variable_12_0= ruleVariable ) ) (otherlv_13= ',' ( (lv_variable_14_0= ruleVariable ) ) )* otherlv_15= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPolycreate.g:173:4: otherlv_10= 'variable' otherlv_11= '{' ( (lv_variable_12_0= ruleVariable ) ) (otherlv_13= ',' ( (lv_variable_14_0= ruleVariable ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getPolycreateAccess().getVariableKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getPolycreateAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalPolycreate.g:181:4: ( (lv_variable_12_0= ruleVariable ) )
                    // InternalPolycreate.g:182:5: (lv_variable_12_0= ruleVariable )
                    {
                    // InternalPolycreate.g:182:5: (lv_variable_12_0= ruleVariable )
                    // InternalPolycreate.g:183:6: lv_variable_12_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getPolycreateAccess().getVariableVariableParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_variable_12_0=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPolycreateRule());
                    						}
                    						add(
                    							current,
                    							"variable",
                    							lv_variable_12_0,
                    							"fr.unice.polytech.si5.polycreate.concretesyntax.Polycreate.Variable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPolycreate.g:200:4: (otherlv_13= ',' ( (lv_variable_14_0= ruleVariable ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalPolycreate.g:201:5: otherlv_13= ',' ( (lv_variable_14_0= ruleVariable ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getPolycreateAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalPolycreate.g:205:5: ( (lv_variable_14_0= ruleVariable ) )
                    	    // InternalPolycreate.g:206:6: (lv_variable_14_0= ruleVariable )
                    	    {
                    	    // InternalPolycreate.g:206:6: (lv_variable_14_0= ruleVariable )
                    	    // InternalPolycreate.g:207:7: lv_variable_14_0= ruleVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getPolycreateAccess().getVariableVariableParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_variable_14_0=ruleVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPolycreateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"variable",
                    	    								lv_variable_14_0,
                    	    								"fr.unice.polytech.si5.polycreate.concretesyntax.Polycreate.Variable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_15, grammarAccess.getPolycreateAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getPolycreateAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePolycreate"


    // $ANTLR start "entryRuleOperation"
    // InternalPolycreate.g:238:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalPolycreate.g:238:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalPolycreate.g:239:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalPolycreate.g:245:1: ruleOperation returns [EObject current=null] : (this_GoForward_0= ruleGoForward | this_GoBackward_1= ruleGoBackward | this_OpenGripper_2= ruleOpenGripper | this_CloseGripper_3= ruleCloseGripper | this_Turn_4= ruleTurn | this_Stop_5= ruleStop | this_StructuralCondition_6= ruleStructuralCondition ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        EObject this_GoForward_0 = null;

        EObject this_GoBackward_1 = null;

        EObject this_OpenGripper_2 = null;

        EObject this_CloseGripper_3 = null;

        EObject this_Turn_4 = null;

        EObject this_Stop_5 = null;

        EObject this_StructuralCondition_6 = null;



        	enterRule();

        try {
            // InternalPolycreate.g:251:2: ( (this_GoForward_0= ruleGoForward | this_GoBackward_1= ruleGoBackward | this_OpenGripper_2= ruleOpenGripper | this_CloseGripper_3= ruleCloseGripper | this_Turn_4= ruleTurn | this_Stop_5= ruleStop | this_StructuralCondition_6= ruleStructuralCondition ) )
            // InternalPolycreate.g:252:2: (this_GoForward_0= ruleGoForward | this_GoBackward_1= ruleGoBackward | this_OpenGripper_2= ruleOpenGripper | this_CloseGripper_3= ruleCloseGripper | this_Turn_4= ruleTurn | this_Stop_5= ruleStop | this_StructuralCondition_6= ruleStructuralCondition )
            {
            // InternalPolycreate.g:252:2: (this_GoForward_0= ruleGoForward | this_GoBackward_1= ruleGoBackward | this_OpenGripper_2= ruleOpenGripper | this_CloseGripper_3= ruleCloseGripper | this_Turn_4= ruleTurn | this_Stop_5= ruleStop | this_StructuralCondition_6= ruleStructuralCondition )
            int alt5=7;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt5=1;
                }
                break;
            case 21:
                {
                alt5=2;
                }
                break;
            case 22:
                {
                alt5=3;
                }
                break;
            case 23:
                {
                alt5=4;
                }
                break;
            case 24:
                {
                alt5=5;
                }
                break;
            case 25:
                {
                alt5=6;
                }
                break;
            case 26:
                {
                alt5=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalPolycreate.g:253:3: this_GoForward_0= ruleGoForward
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getGoForwardParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GoForward_0=ruleGoForward();

                    state._fsp--;


                    			current = this_GoForward_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPolycreate.g:262:3: this_GoBackward_1= ruleGoBackward
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getGoBackwardParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_GoBackward_1=ruleGoBackward();

                    state._fsp--;


                    			current = this_GoBackward_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPolycreate.g:271:3: this_OpenGripper_2= ruleOpenGripper
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getOpenGripperParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_OpenGripper_2=ruleOpenGripper();

                    state._fsp--;


                    			current = this_OpenGripper_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPolycreate.g:280:3: this_CloseGripper_3= ruleCloseGripper
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getCloseGripperParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_CloseGripper_3=ruleCloseGripper();

                    state._fsp--;


                    			current = this_CloseGripper_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalPolycreate.g:289:3: this_Turn_4= ruleTurn
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getTurnParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Turn_4=ruleTurn();

                    state._fsp--;


                    			current = this_Turn_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalPolycreate.g:298:3: this_Stop_5= ruleStop
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getStopParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Stop_5=ruleStop();

                    state._fsp--;


                    			current = this_Stop_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalPolycreate.g:307:3: this_StructuralCondition_6= ruleStructuralCondition
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getStructuralConditionParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_StructuralCondition_6=ruleStructuralCondition();

                    state._fsp--;


                    			current = this_StructuralCondition_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleVariable"
    // InternalPolycreate.g:319:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalPolycreate.g:319:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalPolycreate.g:320:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalPolycreate.g:326:1: ruleVariable returns [EObject current=null] : (this_Variable_Impl_0= ruleVariable_Impl | this_GripperSensor_1= ruleGripperSensor | this_RightSensor_2= ruleRightSensor | this_LeftSensor_3= ruleLeftSensor | this_Object_4= ruleObject ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        EObject this_Variable_Impl_0 = null;

        EObject this_GripperSensor_1 = null;

        EObject this_RightSensor_2 = null;

        EObject this_LeftSensor_3 = null;

        EObject this_Object_4 = null;



        	enterRule();

        try {
            // InternalPolycreate.g:332:2: ( (this_Variable_Impl_0= ruleVariable_Impl | this_GripperSensor_1= ruleGripperSensor | this_RightSensor_2= ruleRightSensor | this_LeftSensor_3= ruleLeftSensor | this_Object_4= ruleObject ) )
            // InternalPolycreate.g:333:2: (this_Variable_Impl_0= ruleVariable_Impl | this_GripperSensor_1= ruleGripperSensor | this_RightSensor_2= ruleRightSensor | this_LeftSensor_3= ruleLeftSensor | this_Object_4= ruleObject )
            {
            // InternalPolycreate.g:333:2: (this_Variable_Impl_0= ruleVariable_Impl | this_GripperSensor_1= ruleGripperSensor | this_RightSensor_2= ruleRightSensor | this_LeftSensor_3= ruleLeftSensor | this_Object_4= ruleObject )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt6=1;
                }
                break;
            case 40:
                {
                alt6=2;
                }
                break;
            case 41:
                {
                alt6=3;
                }
                break;
            case 42:
                {
                alt6=4;
                }
                break;
            case 43:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalPolycreate.g:334:3: this_Variable_Impl_0= ruleVariable_Impl
                    {

                    			newCompositeNode(grammarAccess.getVariableAccess().getVariable_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Variable_Impl_0=ruleVariable_Impl();

                    state._fsp--;


                    			current = this_Variable_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPolycreate.g:343:3: this_GripperSensor_1= ruleGripperSensor
                    {

                    			newCompositeNode(grammarAccess.getVariableAccess().getGripperSensorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_GripperSensor_1=ruleGripperSensor();

                    state._fsp--;


                    			current = this_GripperSensor_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPolycreate.g:352:3: this_RightSensor_2= ruleRightSensor
                    {

                    			newCompositeNode(grammarAccess.getVariableAccess().getRightSensorParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RightSensor_2=ruleRightSensor();

                    state._fsp--;


                    			current = this_RightSensor_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPolycreate.g:361:3: this_LeftSensor_3= ruleLeftSensor
                    {

                    			newCompositeNode(grammarAccess.getVariableAccess().getLeftSensorParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_LeftSensor_3=ruleLeftSensor();

                    state._fsp--;


                    			current = this_LeftSensor_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalPolycreate.g:370:3: this_Object_4= ruleObject
                    {

                    			newCompositeNode(grammarAccess.getVariableAccess().getObjectParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Object_4=ruleObject();

                    state._fsp--;


                    			current = this_Object_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleEString"
    // InternalPolycreate.g:382:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalPolycreate.g:382:47: (iv_ruleEString= ruleEString EOF )
            // InternalPolycreate.g:383:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalPolycreate.g:389:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalPolycreate.g:395:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalPolycreate.g:396:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalPolycreate.g:396:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalPolycreate.g:397:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPolycreate.g:405:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleVariable_Impl"
    // InternalPolycreate.g:416:1: entryRuleVariable_Impl returns [EObject current=null] : iv_ruleVariable_Impl= ruleVariable_Impl EOF ;
    public final EObject entryRuleVariable_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable_Impl = null;


        try {
            // InternalPolycreate.g:416:54: (iv_ruleVariable_Impl= ruleVariable_Impl EOF )
            // InternalPolycreate.g:417:2: iv_ruleVariable_Impl= ruleVariable_Impl EOF
            {
             newCompositeNode(grammarAccess.getVariable_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable_Impl=ruleVariable_Impl();

            state._fsp--;

             current =iv_ruleVariable_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable_Impl"


    // $ANTLR start "ruleVariable_Impl"
    // InternalPolycreate.g:423:1: ruleVariable_Impl returns [EObject current=null] : ( () otherlv_1= 'Variable' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )? (otherlv_6= 'initialValue' ( (lv_initialValue_7_0= ruleEDouble ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleVariable_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_type_5_0 = null;

        AntlrDatatypeRuleToken lv_initialValue_7_0 = null;



        	enterRule();

        try {
            // InternalPolycreate.g:429:2: ( ( () otherlv_1= 'Variable' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )? (otherlv_6= 'initialValue' ( (lv_initialValue_7_0= ruleEDouble ) ) )? otherlv_8= '}' ) )
            // InternalPolycreate.g:430:2: ( () otherlv_1= 'Variable' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )? (otherlv_6= 'initialValue' ( (lv_initialValue_7_0= ruleEDouble ) ) )? otherlv_8= '}' )
            {
            // InternalPolycreate.g:430:2: ( () otherlv_1= 'Variable' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )? (otherlv_6= 'initialValue' ( (lv_initialValue_7_0= ruleEDouble ) ) )? otherlv_8= '}' )
            // InternalPolycreate.g:431:3: () otherlv_1= 'Variable' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )? (otherlv_6= 'initialValue' ( (lv_initialValue_7_0= ruleEDouble ) ) )? otherlv_8= '}'
            {
            // InternalPolycreate.g:431:3: ()
            // InternalPolycreate.g:432:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariable_ImplAccess().getVariableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getVariable_ImplAccess().getVariableKeyword_1());
            		
            // InternalPolycreate.g:442:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPolycreate.g:443:4: (lv_name_2_0= ruleEString )
            {
            // InternalPolycreate.g:443:4: (lv_name_2_0= ruleEString )
            // InternalPolycreate.g:444:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVariable_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariable_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.unice.polytech.si5.polycreate.concretesyntax.Polycreate.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getVariable_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalPolycreate.g:465:3: (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPolycreate.g:466:4: otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getVariable_ImplAccess().getTypeKeyword_4_0());
                    			
                    // InternalPolycreate.g:470:4: ( (lv_type_5_0= ruleVarType ) )
                    // InternalPolycreate.g:471:5: (lv_type_5_0= ruleVarType )
                    {
                    // InternalPolycreate.g:471:5: (lv_type_5_0= ruleVarType )
                    // InternalPolycreate.g:472:6: lv_type_5_0= ruleVarType
                    {

                    						newCompositeNode(grammarAccess.getVariable_ImplAccess().getTypeVarTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_type_5_0=ruleVarType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariable_ImplRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_5_0,
                    							"fr.unice.polytech.si5.polycreate.concretesyntax.Polycreate.VarType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPolycreate.g:490:3: (otherlv_6= 'initialValue' ( (lv_initialValue_7_0= ruleEDouble ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPolycreate.g:491:4: otherlv_6= 'initialValue' ( (lv_initialValue_7_0= ruleEDouble ) )
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getVariable_ImplAccess().getInitialValueKeyword_5_0());
                    			
                    // InternalPolycreate.g:495:4: ( (lv_initialValue_7_0= ruleEDouble ) )
                    // InternalPolycreate.g:496:5: (lv_initialValue_7_0= ruleEDouble )
                    {
                    // InternalPolycreate.g:496:5: (lv_initialValue_7_0= ruleEDouble )
                    // InternalPolycreate.g:497:6: lv_initialValue_7_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getVariable_ImplAccess().getInitialValueEDoubleParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_initialValue_7_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariable_ImplRule());
                    						}
                    						set(
                    							current,
                    							"initialValue",
                    							lv_initialValue_7_0,
                    							"fr.unice.polytech.si5.polycreate.concretesyntax.Polycreate.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getVariable_ImplAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable_Impl"


    // $ANTLR start "entryRuleGoForward"
    // InternalPolycreate.g:523:1: entryRuleGoForward returns [EObject current=null] : iv_ruleGoForward= ruleGoForward EOF ;
    public final EObject entryRuleGoForward() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoForward = null;


        try {
            // InternalPolycreate.g:523:50: (iv_ruleGoForward= ruleGoForward EOF )
            // InternalPolycreate.g:524:2: iv_ruleGoForward= ruleGoForward EOF
            {
             newCompositeNode(grammarAccess.getGoForwardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGoForward=ruleGoForward();

            state._fsp--;

             current =iv_ruleGoForward; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGoForward"


    // $ANTLR start "ruleGoForward"
    // InternalPolycreate.g:530:1: ruleGoForward returns [EObject current=null] : ( () otherlv_1= 'GoForward' ) ;
    public final EObject ruleGoForward() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPolycreate.g:536:2: ( ( () otherlv_1= 'GoForward' ) )
            // InternalPolycreate.g:537:2: ( () otherlv_1= 'GoForward' )
            {
            // InternalPolycreate.g:537:2: ( () otherlv_1= 'GoForward' )
            // InternalPolycreate.g:538:3: () otherlv_1= 'GoForward'
            {
            // InternalPolycreate.g:538:3: ()
            // InternalPolycreate.g:539:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGoForwardAccess().getGoForwardAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getGoForwardAccess().getGoForwardKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGoForward"


    // $ANTLR start "entryRuleGoBackward"
    // InternalPolycreate.g:553:1: entryRuleGoBackward returns [EObject current=null] : iv_ruleGoBackward= ruleGoBackward EOF ;
    public final EObject entryRuleGoBackward() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoBackward = null;


        try {
            // InternalPolycreate.g:553:51: (iv_ruleGoBackward= ruleGoBackward EOF )
            // InternalPolycreate.g:554:2: iv_ruleGoBackward= ruleGoBackward EOF
            {
             newCompositeNode(grammarAccess.getGoBackwardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGoBackward=ruleGoBackward();

            state._fsp--;

             current =iv_ruleGoBackward; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGoBackward"


    // $ANTLR start "ruleGoBackward"
    // InternalPolycreate.g:560:1: ruleGoBackward returns [EObject current=null] : ( () otherlv_1= 'GoBackward' ) ;
    public final EObject ruleGoBackward() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPolycreate.g:566:2: ( ( () otherlv_1= 'GoBackward' ) )
            // InternalPolycreate.g:567:2: ( () otherlv_1= 'GoBackward' )
            {
            // InternalPolycreate.g:567:2: ( () otherlv_1= 'GoBackward' )
            // InternalPolycreate.g:568:3: () otherlv_1= 'GoBackward'
            {
            // InternalPolycreate.g:568:3: ()
            // InternalPolycreate.g:569:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGoBackwardAccess().getGoBackwardAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getGoBackwardAccess().getGoBackwardKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGoBackward"


    // $ANTLR start "entryRuleOpenGripper"
    // InternalPolycreate.g:583:1: entryRuleOpenGripper returns [EObject current=null] : iv_ruleOpenGripper= ruleOpenGripper EOF ;
    public final EObject entryRuleOpenGripper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpenGripper = null;


        try {
            // InternalPolycreate.g:583:52: (iv_ruleOpenGripper= ruleOpenGripper EOF )
            // InternalPolycreate.g:584:2: iv_ruleOpenGripper= ruleOpenGripper EOF
            {
             newCompositeNode(grammarAccess.getOpenGripperRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpenGripper=ruleOpenGripper();

            state._fsp--;

             current =iv_ruleOpenGripper; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpenGripper"


    // $ANTLR start "ruleOpenGripper"
    // InternalPolycreate.g:590:1: ruleOpenGripper returns [EObject current=null] : ( () otherlv_1= 'OpenGripper' ) ;
    public final EObject ruleOpenGripper() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPolycreate.g:596:2: ( ( () otherlv_1= 'OpenGripper' ) )
            // InternalPolycreate.g:597:2: ( () otherlv_1= 'OpenGripper' )
            {
            // InternalPolycreate.g:597:2: ( () otherlv_1= 'OpenGripper' )
            // InternalPolycreate.g:598:3: () otherlv_1= 'OpenGripper'
            {
            // InternalPolycreate.g:598:3: ()
            // InternalPolycreate.g:599:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOpenGripperAccess().getOpenGripperAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getOpenGripperAccess().getOpenGripperKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpenGripper"


    // $ANTLR start "entryRuleCloseGripper"
    // InternalPolycreate.g:613:1: entryRuleCloseGripper returns [EObject current=null] : iv_ruleCloseGripper= ruleCloseGripper EOF ;
    public final EObject entryRuleCloseGripper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCloseGripper = null;


        try {
            // InternalPolycreate.g:613:53: (iv_ruleCloseGripper= ruleCloseGripper EOF )
            // InternalPolycreate.g:614:2: iv_ruleCloseGripper= ruleCloseGripper EOF
            {
             newCompositeNode(grammarAccess.getCloseGripperRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCloseGripper=ruleCloseGripper();

            state._fsp--;

             current =iv_ruleCloseGripper; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCloseGripper"


    // $ANTLR start "ruleCloseGripper"
    // InternalPolycreate.g:620:1: ruleCloseGripper returns [EObject current=null] : ( () otherlv_1= 'CloseGripper' ) ;
    public final EObject ruleCloseGripper() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPolycreate.g:626:2: ( ( () otherlv_1= 'CloseGripper' ) )
            // InternalPolycreate.g:627:2: ( () otherlv_1= 'CloseGripper' )
            {
            // InternalPolycreate.g:627:2: ( () otherlv_1= 'CloseGripper' )
            // InternalPolycreate.g:628:3: () otherlv_1= 'CloseGripper'
            {
            // InternalPolycreate.g:628:3: ()
            // InternalPolycreate.g:629:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCloseGripperAccess().getCloseGripperAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getCloseGripperAccess().getCloseGripperKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCloseGripper"


    // $ANTLR start "entryRuleTurn"
    // InternalPolycreate.g:643:1: entryRuleTurn returns [EObject current=null] : iv_ruleTurn= ruleTurn EOF ;
    public final EObject entryRuleTurn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurn = null;


        try {
            // InternalPolycreate.g:643:45: (iv_ruleTurn= ruleTurn EOF )
            // InternalPolycreate.g:644:2: iv_ruleTurn= ruleTurn EOF
            {
             newCompositeNode(grammarAccess.getTurnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTurn=ruleTurn();

            state._fsp--;

             current =iv_ruleTurn; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTurn"


    // $ANTLR start "ruleTurn"
    // InternalPolycreate.g:650:1: ruleTurn returns [EObject current=null] : ( () otherlv_1= 'Turn' ) ;
    public final EObject ruleTurn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPolycreate.g:656:2: ( ( () otherlv_1= 'Turn' ) )
            // InternalPolycreate.g:657:2: ( () otherlv_1= 'Turn' )
            {
            // InternalPolycreate.g:657:2: ( () otherlv_1= 'Turn' )
            // InternalPolycreate.g:658:3: () otherlv_1= 'Turn'
            {
            // InternalPolycreate.g:658:3: ()
            // InternalPolycreate.g:659:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTurnAccess().getTurnAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getTurnAccess().getTurnKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTurn"


    // $ANTLR start "entryRuleStop"
    // InternalPolycreate.g:673:1: entryRuleStop returns [EObject current=null] : iv_ruleStop= ruleStop EOF ;
    public final EObject entryRuleStop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStop = null;


        try {
            // InternalPolycreate.g:673:45: (iv_ruleStop= ruleStop EOF )
            // InternalPolycreate.g:674:2: iv_ruleStop= ruleStop EOF
            {
             newCompositeNode(grammarAccess.getStopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStop=ruleStop();

            state._fsp--;

             current =iv_ruleStop; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStop"


    // $ANTLR start "ruleStop"
    // InternalPolycreate.g:680:1: ruleStop returns [EObject current=null] : ( () otherlv_1= 'Stop' ) ;
    public final EObject ruleStop() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPolycreate.g:686:2: ( ( () otherlv_1= 'Stop' ) )
            // InternalPolycreate.g:687:2: ( () otherlv_1= 'Stop' )
            {
            // InternalPolycreate.g:687:2: ( () otherlv_1= 'Stop' )
            // InternalPolycreate.g:688:3: () otherlv_1= 'Stop'
            {
            // InternalPolycreate.g:688:3: ()
            // InternalPolycreate.g:689:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStopAccess().getStopAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getStopAccess().getStopKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStop"


    // $ANTLR start "entryRuleStructuralCondition"
    // InternalPolycreate.g:703:1: entryRuleStructuralCondition returns [EObject current=null] : iv_ruleStructuralCondition= ruleStructuralCondition EOF ;
    public final EObject entryRuleStructuralCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructuralCondition = null;


        try {
            // InternalPolycreate.g:703:60: (iv_ruleStructuralCondition= ruleStructuralCondition EOF )
            // InternalPolycreate.g:704:2: iv_ruleStructuralCondition= ruleStructuralCondition EOF
            {
             newCompositeNode(grammarAccess.getStructuralConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStructuralCondition=ruleStructuralCondition();

            state._fsp--;

             current =iv_ruleStructuralCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStructuralCondition"


    // $ANTLR start "ruleStructuralCondition"
    // InternalPolycreate.g:710:1: ruleStructuralCondition returns [EObject current=null] : (otherlv_0= 'StructuralCondition' otherlv_1= '{' (otherlv_2= 'then' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? (otherlv_8= 'else' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= 'if' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' otherlv_20= '}' ) ;
    public final EObject ruleStructuralCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;


        	enterRule();

        try {
            // InternalPolycreate.g:716:2: ( (otherlv_0= 'StructuralCondition' otherlv_1= '{' (otherlv_2= 'then' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? (otherlv_8= 'else' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= 'if' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' otherlv_20= '}' ) )
            // InternalPolycreate.g:717:2: (otherlv_0= 'StructuralCondition' otherlv_1= '{' (otherlv_2= 'then' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? (otherlv_8= 'else' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= 'if' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' otherlv_20= '}' )
            {
            // InternalPolycreate.g:717:2: (otherlv_0= 'StructuralCondition' otherlv_1= '{' (otherlv_2= 'then' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? (otherlv_8= 'else' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= 'if' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' otherlv_20= '}' )
            // InternalPolycreate.g:718:3: otherlv_0= 'StructuralCondition' otherlv_1= '{' (otherlv_2= 'then' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? (otherlv_8= 'else' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? otherlv_14= 'if' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStructuralConditionAccess().getStructuralConditionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getStructuralConditionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalPolycreate.g:726:3: (otherlv_2= 'then' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalPolycreate.g:727:4: otherlv_2= 'then' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_16); 

                    				newLeafNode(otherlv_2, grammarAccess.getStructuralConditionAccess().getThenKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getStructuralConditionAccess().getLeftParenthesisKeyword_2_1());
                    			
                    // InternalPolycreate.g:735:4: ( ( ruleEString ) )
                    // InternalPolycreate.g:736:5: ( ruleEString )
                    {
                    // InternalPolycreate.g:736:5: ( ruleEString )
                    // InternalPolycreate.g:737:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStructuralConditionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getStructuralConditionAccess().getThenOperationCrossReference_2_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPolycreate.g:751:4: (otherlv_5= ',' ( ( ruleEString ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==14) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalPolycreate.g:752:5: otherlv_5= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getStructuralConditionAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalPolycreate.g:756:5: ( ( ruleEString ) )
                    	    // InternalPolycreate.g:757:6: ( ruleEString )
                    	    {
                    	    // InternalPolycreate.g:757:6: ( ruleEString )
                    	    // InternalPolycreate.g:758:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getStructuralConditionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getStructuralConditionAccess().getThenOperationCrossReference_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,29,FOLLOW_18); 

                    				newLeafNode(otherlv_7, grammarAccess.getStructuralConditionAccess().getRightParenthesisKeyword_2_4());
                    			

                    }
                    break;

            }

            // InternalPolycreate.g:778:3: (otherlv_8= 'else' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalPolycreate.g:779:4: otherlv_8= 'else' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')'
                    {
                    otherlv_8=(Token)match(input,30,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getStructuralConditionAccess().getElseKeyword_3_0());
                    			
                    otherlv_9=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getStructuralConditionAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalPolycreate.g:787:4: ( ( ruleEString ) )
                    // InternalPolycreate.g:788:5: ( ruleEString )
                    {
                    // InternalPolycreate.g:788:5: ( ruleEString )
                    // InternalPolycreate.g:789:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStructuralConditionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getStructuralConditionAccess().getElseOperationCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPolycreate.g:803:4: (otherlv_11= ',' ( ( ruleEString ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==14) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalPolycreate.g:804:5: otherlv_11= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getStructuralConditionAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalPolycreate.g:808:5: ( ( ruleEString ) )
                    	    // InternalPolycreate.g:809:6: ( ruleEString )
                    	    {
                    	    // InternalPolycreate.g:809:6: ( ruleEString )
                    	    // InternalPolycreate.g:810:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getStructuralConditionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getStructuralConditionAccess().getElseOperationCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_13, grammarAccess.getStructuralConditionAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,31,FOLLOW_16); 

            			newLeafNode(otherlv_14, grammarAccess.getStructuralConditionAccess().getIfKeyword_4());
            		
            otherlv_15=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_15, grammarAccess.getStructuralConditionAccess().getLeftParenthesisKeyword_5());
            		
            // InternalPolycreate.g:838:3: ( ( ruleEString ) )
            // InternalPolycreate.g:839:4: ( ruleEString )
            {
            // InternalPolycreate.g:839:4: ( ruleEString )
            // InternalPolycreate.g:840:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStructuralConditionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getStructuralConditionAccess().getIfConditionCrossReference_6_0());
            				
            pushFollow(FOLLOW_17);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPolycreate.g:854:3: (otherlv_17= ',' ( ( ruleEString ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==14) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalPolycreate.g:855:4: otherlv_17= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_17=(Token)match(input,14,FOLLOW_3); 

            	    				newLeafNode(otherlv_17, grammarAccess.getStructuralConditionAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalPolycreate.g:859:4: ( ( ruleEString ) )
            	    // InternalPolycreate.g:860:5: ( ruleEString )
            	    {
            	    // InternalPolycreate.g:860:5: ( ruleEString )
            	    // InternalPolycreate.g:861:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getStructuralConditionRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getStructuralConditionAccess().getIfConditionCrossReference_7_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_19=(Token)match(input,29,FOLLOW_10); 

            			newLeafNode(otherlv_19, grammarAccess.getStructuralConditionAccess().getRightParenthesisKeyword_8());
            		
            otherlv_20=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getStructuralConditionAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStructuralCondition"


    // $ANTLR start "entryRuleComparison"
    // InternalPolycreate.g:888:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalPolycreate.g:888:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalPolycreate.g:889:2: iv_ruleComparison= ruleComparison EOF
            {
             newCompositeNode(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;

             current =iv_ruleComparison; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalPolycreate.g:895:1: ruleComparison returns [EObject current=null] : (otherlv_0= 'Comparison' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleVarType ) ) )? otherlv_4= 'leftVariable' ( ( ruleEString ) ) otherlv_6= 'rightVariable' ( ( ruleEString ) ) otherlv_8= '}' ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalPolycreate.g:901:2: ( (otherlv_0= 'Comparison' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleVarType ) ) )? otherlv_4= 'leftVariable' ( ( ruleEString ) ) otherlv_6= 'rightVariable' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalPolycreate.g:902:2: (otherlv_0= 'Comparison' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleVarType ) ) )? otherlv_4= 'leftVariable' ( ( ruleEString ) ) otherlv_6= 'rightVariable' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalPolycreate.g:902:2: (otherlv_0= 'Comparison' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleVarType ) ) )? otherlv_4= 'leftVariable' ( ( ruleEString ) ) otherlv_6= 'rightVariable' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalPolycreate.g:903:3: otherlv_0= 'Comparison' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleVarType ) ) )? otherlv_4= 'leftVariable' ( ( ruleEString ) ) otherlv_6= 'rightVariable' ( ( ruleEString ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getComparisonAccess().getComparisonKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getComparisonAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalPolycreate.g:911:3: (otherlv_2= 'value' ( (lv_value_3_0= ruleVarType ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalPolycreate.g:912:4: otherlv_2= 'value' ( (lv_value_3_0= ruleVarType ) )
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getComparisonAccess().getValueKeyword_2_0());
                    			
                    // InternalPolycreate.g:916:4: ( (lv_value_3_0= ruleVarType ) )
                    // InternalPolycreate.g:917:5: (lv_value_3_0= ruleVarType )
                    {
                    // InternalPolycreate.g:917:5: (lv_value_3_0= ruleVarType )
                    // InternalPolycreate.g:918:6: lv_value_3_0= ruleVarType
                    {

                    						newCompositeNode(grammarAccess.getComparisonAccess().getValueVarTypeEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_value_3_0=ruleVarType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComparisonRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"fr.unice.polytech.si5.polycreate.concretesyntax.Polycreate.VarType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getComparisonAccess().getLeftVariableKeyword_3());
            		
            // InternalPolycreate.g:940:3: ( ( ruleEString ) )
            // InternalPolycreate.g:941:4: ( ruleEString )
            {
            // InternalPolycreate.g:941:4: ( ruleEString )
            // InternalPolycreate.g:942:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComparisonRule());
            					}
            				

            					newCompositeNode(grammarAccess.getComparisonAccess().getLeftVariableVariableCrossReference_4_0());
            				
            pushFollow(FOLLOW_22);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getComparisonAccess().getRightVariableKeyword_5());
            		
            // InternalPolycreate.g:960:3: ( ( ruleEString ) )
            // InternalPolycreate.g:961:4: ( ruleEString )
            {
            // InternalPolycreate.g:961:4: ( ruleEString )
            // InternalPolycreate.g:962:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComparisonRule());
            					}
            				

            					newCompositeNode(grammarAccess.getComparisonAccess().getRightVariableVariableCrossReference_6_0());
            				
            pushFollow(FOLLOW_10);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getComparisonAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleEDouble"
    // InternalPolycreate.g:984:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalPolycreate.g:984:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalPolycreate.g:985:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalPolycreate.g:991:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalPolycreate.g:997:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalPolycreate.g:998:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalPolycreate.g:998:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalPolycreate.g:999:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalPolycreate.g:999:3: (kw= '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==36) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPolycreate.g:1000:4: kw= '-'
                    {
                    kw=(Token)match(input,36,FOLLOW_23); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalPolycreate.g:1006:3: (this_INT_1= RULE_INT )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalPolycreate.g:1007:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_24); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,37,FOLLOW_25); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_26); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalPolycreate.g:1027:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=38 && LA20_0<=39)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalPolycreate.g:1028:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalPolycreate.g:1028:4: (kw= 'E' | kw= 'e' )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==38) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==39) ) {
                        alt18=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalPolycreate.g:1029:5: kw= 'E'
                            {
                            kw=(Token)match(input,38,FOLLOW_27); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalPolycreate.g:1035:5: kw= 'e'
                            {
                            kw=(Token)match(input,39,FOLLOW_27); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalPolycreate.g:1041:4: (kw= '-' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==36) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalPolycreate.g:1042:5: kw= '-'
                            {
                            kw=(Token)match(input,36,FOLLOW_25); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleGripperSensor"
    // InternalPolycreate.g:1060:1: entryRuleGripperSensor returns [EObject current=null] : iv_ruleGripperSensor= ruleGripperSensor EOF ;
    public final EObject entryRuleGripperSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGripperSensor = null;


        try {
            // InternalPolycreate.g:1060:54: (iv_ruleGripperSensor= ruleGripperSensor EOF )
            // InternalPolycreate.g:1061:2: iv_ruleGripperSensor= ruleGripperSensor EOF
            {
             newCompositeNode(grammarAccess.getGripperSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGripperSensor=ruleGripperSensor();

            state._fsp--;

             current =iv_ruleGripperSensor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGripperSensor"


    // $ANTLR start "ruleGripperSensor"
    // InternalPolycreate.g:1067:1: ruleGripperSensor returns [EObject current=null] : ( () otherlv_1= 'GripperSensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )? (otherlv_6= 'initialValue' ( (lv_initialValue_7_0= ruleEDouble ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleGripperSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_type_5_0 = null;

        AntlrDatatypeRuleToken lv_initialValue_7_0 = null;



        	enterRule();

        try {
            // InternalPolycreate.g:1073:2: ( ( () otherlv_1= 'GripperSensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )? (otherlv_6= 'initialValue' ( (lv_initialValue_7_0= ruleEDouble ) ) )? otherlv_8= '}' ) )
            // InternalPolycreate.g:1074:2: ( () otherlv_1= 'GripperSensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )? (otherlv_6= 'initialValue' ( (lv_initialValue_7_0= ruleEDouble ) ) )? otherlv_8= '}' )
            {
            // InternalPolycreate.g:1074:2: ( () otherlv_1= 'GripperSensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )? (otherlv_6= 'initialValue' ( (lv_initialValue_7_0= ruleEDouble ) ) )? otherlv_8= '}' )
            // InternalPolycreate.g:1075:3: () otherlv_1= 'GripperSensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )? (otherlv_6= 'initialValue' ( (lv_initialValue_7_0= ruleEDouble ) ) )? otherlv_8= '}'
            {
            // InternalPolycreate.g:1075:3: ()
            // InternalPolycreate.g:1076:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGripperSensorAccess().getGripperSensorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGripperSensorAccess().getGripperSensorKeyword_1());
            		
            // InternalPolycreate.g:1086:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPolycreate.g:1087:4: (lv_name_2_0= ruleEString )
            {
            // InternalPolycreate.g:1087:4: (lv_name_2_0= ruleEString )
            // InternalPolycreate.g:1088:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGripperSensorAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGripperSensorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.unice.polytech.si5.polycreate.concretesyntax.Polycreate.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getGripperSensorAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalPolycreate.g:1109:3: (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==18) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalPolycreate.g:1110:4: otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getGripperSensorAccess().getTypeKeyword_4_0());
                    			
                    // InternalPolycreate.g:1114:4: ( (lv_type_5_0= ruleVarType ) )
                    // InternalPolycreate.g:1115:5: (lv_type_5_0= ruleVarType )
                    {
                    // InternalPolycreate.g:1115:5: (lv_type_5_0= ruleVarType )
                    // InternalPolycreate.g:1116:6: lv_type_5_0= ruleVarType
                    {

                    						newCompositeNode(grammarAccess.getGripperSensorAccess().getTypeVarTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_type_5_0=ruleVarType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGripperSensorRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_5_0,
                    							"fr.unice.polytech.si5.polycreate.concretesyntax.Polycreate.VarType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPolycreate.g:1134:3: (otherlv_6= 'initialValue' ( (lv_initialValue_7_0= ruleEDouble ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==19) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPolycreate.g:1135:4: otherlv_6= 'initialValue' ( (lv_initialValue_7_0= ruleEDouble ) )
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getGripperSensorAccess().getInitialValueKeyword_5_0());
                    			
                    // InternalPolycreate.g:1139:4: ( (lv_initialValue_7_0= ruleEDouble ) )
                    // InternalPolycreate.g:1140:5: (lv_initialValue_7_0= ruleEDouble )
                    {
                    // InternalPolycreate.g:1140:5: (lv_initialValue_7_0= ruleEDouble )
                    // InternalPolycreate.g:1141:6: lv_initialValue_7_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getGripperSensorAccess().getInitialValueEDoubleParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_initialValue_7_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGripperSensorRule());
                    						}
                    						set(
                    							current,
                    							"initialValue",
                    							lv_initialValue_7_0,
                    							"fr.unice.polytech.si5.polycreate.concretesyntax.Polycreate.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getGripperSensorAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGripperSensor"


    // $ANTLR start "entryRuleRightSensor"
    // InternalPolycreate.g:1167:1: entryRuleRightSensor returns [EObject current=null] : iv_ruleRightSensor= ruleRightSensor EOF ;
    public final EObject entryRuleRightSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightSensor = null;


        try {
            // InternalPolycreate.g:1167:52: (iv_ruleRightSensor= ruleRightSensor EOF )
            // InternalPolycreate.g:1168:2: iv_ruleRightSensor= ruleRightSensor EOF
            {
             newCompositeNode(grammarAccess.getRightSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRightSensor=ruleRightSensor();

            state._fsp--;

             current =iv_ruleRightSensor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRightSensor"


    // $ANTLR start "ruleRightSensor"
    // InternalPolycreate.g:1174:1: ruleRightSensor returns [EObject current=null] : ( () otherlv_1= 'RightSensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )? (otherlv_6= 'initialValue' ( (lv_initialValue_7_0= ruleEDouble ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleRightSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_type_5_0 = null;

        AntlrDatatypeRuleToken lv_initialValue_7_0 = null;



        	enterRule();

        try {
            // InternalPolycreate.g:1180:2: ( ( () otherlv_1= 'RightSensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )? (otherlv_6= 'initialValue' ( (lv_initialValue_7_0= ruleEDouble ) ) )? otherlv_8= '}' ) )
            // InternalPolycreate.g:1181:2: ( () otherlv_1= 'RightSensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )? (otherlv_6= 'initialValue' ( (lv_initialValue_7_0= ruleEDouble ) ) )? otherlv_8= '}' )
            {
            // InternalPolycreate.g:1181:2: ( () otherlv_1= 'RightSensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )? (otherlv_6= 'initialValue' ( (lv_initialValue_7_0= ruleEDouble ) ) )? otherlv_8= '}' )
            // InternalPolycreate.g:1182:3: () otherlv_1= 'RightSensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )? (otherlv_6= 'initialValue' ( (lv_initialValue_7_0= ruleEDouble ) ) )? otherlv_8= '}'
            {
            // InternalPolycreate.g:1182:3: ()
            // InternalPolycreate.g:1183:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRightSensorAccess().getRightSensorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRightSensorAccess().getRightSensorKeyword_1());
            		
            // InternalPolycreate.g:1193:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPolycreate.g:1194:4: (lv_name_2_0= ruleEString )
            {
            // InternalPolycreate.g:1194:4: (lv_name_2_0= ruleEString )
            // InternalPolycreate.g:1195:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRightSensorAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRightSensorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.unice.polytech.si5.polycreate.concretesyntax.Polycreate.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getRightSensorAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalPolycreate.g:1216:3: (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==18) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalPolycreate.g:1217:4: otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getRightSensorAccess().getTypeKeyword_4_0());
                    			
                    // InternalPolycreate.g:1221:4: ( (lv_type_5_0= ruleVarType ) )
                    // InternalPolycreate.g:1222:5: (lv_type_5_0= ruleVarType )
                    {
                    // InternalPolycreate.g:1222:5: (lv_type_5_0= ruleVarType )
                    // InternalPolycreate.g:1223:6: lv_type_5_0= ruleVarType
                    {

                    						newCompositeNode(grammarAccess.getRightSensorAccess().getTypeVarTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_type_5_0=ruleVarType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRightSensorRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_5_0,
                    							"fr.unice.polytech.si5.polycreate.concretesyntax.Polycreate.VarType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPolycreate.g:1241:3: (otherlv_6= 'initialValue' ( (lv_initialValue_7_0= ruleEDouble ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==19) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalPolycreate.g:1242:4: otherlv_6= 'initialValue' ( (lv_initialValue_7_0= ruleEDouble ) )
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getRightSensorAccess().getInitialValueKeyword_5_0());
                    			
                    // InternalPolycreate.g:1246:4: ( (lv_initialValue_7_0= ruleEDouble ) )
                    // InternalPolycreate.g:1247:5: (lv_initialValue_7_0= ruleEDouble )
                    {
                    // InternalPolycreate.g:1247:5: (lv_initialValue_7_0= ruleEDouble )
                    // InternalPolycreate.g:1248:6: lv_initialValue_7_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getRightSensorAccess().getInitialValueEDoubleParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_initialValue_7_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRightSensorRule());
                    						}
                    						set(
                    							current,
                    							"initialValue",
                    							lv_initialValue_7_0,
                    							"fr.unice.polytech.si5.polycreate.concretesyntax.Polycreate.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRightSensorAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRightSensor"


    // $ANTLR start "entryRuleLeftSensor"
    // InternalPolycreate.g:1274:1: entryRuleLeftSensor returns [EObject current=null] : iv_ruleLeftSensor= ruleLeftSensor EOF ;
    public final EObject entryRuleLeftSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftSensor = null;


        try {
            // InternalPolycreate.g:1274:51: (iv_ruleLeftSensor= ruleLeftSensor EOF )
            // InternalPolycreate.g:1275:2: iv_ruleLeftSensor= ruleLeftSensor EOF
            {
             newCompositeNode(grammarAccess.getLeftSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLeftSensor=ruleLeftSensor();

            state._fsp--;

             current =iv_ruleLeftSensor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLeftSensor"


    // $ANTLR start "ruleLeftSensor"
    // InternalPolycreate.g:1281:1: ruleLeftSensor returns [EObject current=null] : ( () otherlv_1= 'LeftSensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )? (otherlv_6= 'initialValue' ( (lv_initialValue_7_0= ruleEDouble ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleLeftSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_type_5_0 = null;

        AntlrDatatypeRuleToken lv_initialValue_7_0 = null;



        	enterRule();

        try {
            // InternalPolycreate.g:1287:2: ( ( () otherlv_1= 'LeftSensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )? (otherlv_6= 'initialValue' ( (lv_initialValue_7_0= ruleEDouble ) ) )? otherlv_8= '}' ) )
            // InternalPolycreate.g:1288:2: ( () otherlv_1= 'LeftSensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )? (otherlv_6= 'initialValue' ( (lv_initialValue_7_0= ruleEDouble ) ) )? otherlv_8= '}' )
            {
            // InternalPolycreate.g:1288:2: ( () otherlv_1= 'LeftSensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )? (otherlv_6= 'initialValue' ( (lv_initialValue_7_0= ruleEDouble ) ) )? otherlv_8= '}' )
            // InternalPolycreate.g:1289:3: () otherlv_1= 'LeftSensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )? (otherlv_6= 'initialValue' ( (lv_initialValue_7_0= ruleEDouble ) ) )? otherlv_8= '}'
            {
            // InternalPolycreate.g:1289:3: ()
            // InternalPolycreate.g:1290:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLeftSensorAccess().getLeftSensorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLeftSensorAccess().getLeftSensorKeyword_1());
            		
            // InternalPolycreate.g:1300:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPolycreate.g:1301:4: (lv_name_2_0= ruleEString )
            {
            // InternalPolycreate.g:1301:4: (lv_name_2_0= ruleEString )
            // InternalPolycreate.g:1302:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLeftSensorAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLeftSensorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.unice.polytech.si5.polycreate.concretesyntax.Polycreate.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getLeftSensorAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalPolycreate.g:1323:3: (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==18) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalPolycreate.g:1324:4: otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getLeftSensorAccess().getTypeKeyword_4_0());
                    			
                    // InternalPolycreate.g:1328:4: ( (lv_type_5_0= ruleVarType ) )
                    // InternalPolycreate.g:1329:5: (lv_type_5_0= ruleVarType )
                    {
                    // InternalPolycreate.g:1329:5: (lv_type_5_0= ruleVarType )
                    // InternalPolycreate.g:1330:6: lv_type_5_0= ruleVarType
                    {

                    						newCompositeNode(grammarAccess.getLeftSensorAccess().getTypeVarTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_type_5_0=ruleVarType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLeftSensorRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_5_0,
                    							"fr.unice.polytech.si5.polycreate.concretesyntax.Polycreate.VarType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPolycreate.g:1348:3: (otherlv_6= 'initialValue' ( (lv_initialValue_7_0= ruleEDouble ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==19) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalPolycreate.g:1349:4: otherlv_6= 'initialValue' ( (lv_initialValue_7_0= ruleEDouble ) )
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getLeftSensorAccess().getInitialValueKeyword_5_0());
                    			
                    // InternalPolycreate.g:1353:4: ( (lv_initialValue_7_0= ruleEDouble ) )
                    // InternalPolycreate.g:1354:5: (lv_initialValue_7_0= ruleEDouble )
                    {
                    // InternalPolycreate.g:1354:5: (lv_initialValue_7_0= ruleEDouble )
                    // InternalPolycreate.g:1355:6: lv_initialValue_7_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getLeftSensorAccess().getInitialValueEDoubleParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_initialValue_7_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLeftSensorRule());
                    						}
                    						set(
                    							current,
                    							"initialValue",
                    							lv_initialValue_7_0,
                    							"fr.unice.polytech.si5.polycreate.concretesyntax.Polycreate.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getLeftSensorAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLeftSensor"


    // $ANTLR start "entryRuleObject"
    // InternalPolycreate.g:1381:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // InternalPolycreate.g:1381:47: (iv_ruleObject= ruleObject EOF )
            // InternalPolycreate.g:1382:2: iv_ruleObject= ruleObject EOF
            {
             newCompositeNode(grammarAccess.getObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObject=ruleObject();

            state._fsp--;

             current =iv_ruleObject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
    // InternalPolycreate.g:1388:1: ruleObject returns [EObject current=null] : ( () otherlv_1= 'Object' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )? (otherlv_6= 'initialValue' ( (lv_initialValue_7_0= ruleEDouble ) ) )? (otherlv_8= 'position' ( (lv_position_9_0= ruleVarType ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_type_5_0 = null;

        AntlrDatatypeRuleToken lv_initialValue_7_0 = null;

        Enumerator lv_position_9_0 = null;



        	enterRule();

        try {
            // InternalPolycreate.g:1394:2: ( ( () otherlv_1= 'Object' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )? (otherlv_6= 'initialValue' ( (lv_initialValue_7_0= ruleEDouble ) ) )? (otherlv_8= 'position' ( (lv_position_9_0= ruleVarType ) ) )? otherlv_10= '}' ) )
            // InternalPolycreate.g:1395:2: ( () otherlv_1= 'Object' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )? (otherlv_6= 'initialValue' ( (lv_initialValue_7_0= ruleEDouble ) ) )? (otherlv_8= 'position' ( (lv_position_9_0= ruleVarType ) ) )? otherlv_10= '}' )
            {
            // InternalPolycreate.g:1395:2: ( () otherlv_1= 'Object' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )? (otherlv_6= 'initialValue' ( (lv_initialValue_7_0= ruleEDouble ) ) )? (otherlv_8= 'position' ( (lv_position_9_0= ruleVarType ) ) )? otherlv_10= '}' )
            // InternalPolycreate.g:1396:3: () otherlv_1= 'Object' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )? (otherlv_6= 'initialValue' ( (lv_initialValue_7_0= ruleEDouble ) ) )? (otherlv_8= 'position' ( (lv_position_9_0= ruleVarType ) ) )? otherlv_10= '}'
            {
            // InternalPolycreate.g:1396:3: ()
            // InternalPolycreate.g:1397:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getObjectAccess().getObjectAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectAccess().getObjectKeyword_1());
            		
            // InternalPolycreate.g:1407:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPolycreate.g:1408:4: (lv_name_2_0= ruleEString )
            {
            // InternalPolycreate.g:1408:4: (lv_name_2_0= ruleEString )
            // InternalPolycreate.g:1409:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getObjectAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.unice.polytech.si5.polycreate.concretesyntax.Polycreate.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_3, grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalPolycreate.g:1430:3: (otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==18) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalPolycreate.g:1431:4: otherlv_4= 'type' ( (lv_type_5_0= ruleVarType ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getObjectAccess().getTypeKeyword_4_0());
                    			
                    // InternalPolycreate.g:1435:4: ( (lv_type_5_0= ruleVarType ) )
                    // InternalPolycreate.g:1436:5: (lv_type_5_0= ruleVarType )
                    {
                    // InternalPolycreate.g:1436:5: (lv_type_5_0= ruleVarType )
                    // InternalPolycreate.g:1437:6: lv_type_5_0= ruleVarType
                    {

                    						newCompositeNode(grammarAccess.getObjectAccess().getTypeVarTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_type_5_0=ruleVarType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getObjectRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_5_0,
                    							"fr.unice.polytech.si5.polycreate.concretesyntax.Polycreate.VarType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPolycreate.g:1455:3: (otherlv_6= 'initialValue' ( (lv_initialValue_7_0= ruleEDouble ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==19) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalPolycreate.g:1456:4: otherlv_6= 'initialValue' ( (lv_initialValue_7_0= ruleEDouble ) )
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getObjectAccess().getInitialValueKeyword_5_0());
                    			
                    // InternalPolycreate.g:1460:4: ( (lv_initialValue_7_0= ruleEDouble ) )
                    // InternalPolycreate.g:1461:5: (lv_initialValue_7_0= ruleEDouble )
                    {
                    // InternalPolycreate.g:1461:5: (lv_initialValue_7_0= ruleEDouble )
                    // InternalPolycreate.g:1462:6: lv_initialValue_7_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getObjectAccess().getInitialValueEDoubleParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_initialValue_7_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getObjectRule());
                    						}
                    						set(
                    							current,
                    							"initialValue",
                    							lv_initialValue_7_0,
                    							"fr.unice.polytech.si5.polycreate.concretesyntax.Polycreate.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPolycreate.g:1480:3: (otherlv_8= 'position' ( (lv_position_9_0= ruleVarType ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==44) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalPolycreate.g:1481:4: otherlv_8= 'position' ( (lv_position_9_0= ruleVarType ) )
                    {
                    otherlv_8=(Token)match(input,44,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getObjectAccess().getPositionKeyword_6_0());
                    			
                    // InternalPolycreate.g:1485:4: ( (lv_position_9_0= ruleVarType ) )
                    // InternalPolycreate.g:1486:5: (lv_position_9_0= ruleVarType )
                    {
                    // InternalPolycreate.g:1486:5: (lv_position_9_0= ruleVarType )
                    // InternalPolycreate.g:1487:6: lv_position_9_0= ruleVarType
                    {

                    						newCompositeNode(grammarAccess.getObjectAccess().getPositionVarTypeEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_position_9_0=ruleVarType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getObjectRule());
                    						}
                    						set(
                    							current,
                    							"position",
                    							lv_position_9_0,
                    							"fr.unice.polytech.si5.polycreate.concretesyntax.Polycreate.VarType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObject"


    // $ANTLR start "ruleVarType"
    // InternalPolycreate.g:1513:1: ruleVarType returns [Enumerator current=null] : ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'double' ) | (enumLiteral_2= 'PositionSensor' ) | (enumLiteral_3= 'TouchSensor' ) | (enumLiteral_4= 'DistanceSensor' ) | (enumLiteral_5= 'Camera' ) | (enumLiteral_6= 'Receiver' ) | (enumLiteral_7= 'GPS' ) | (enumLiteral_8= 'Motor' ) ) ;
    public final Enumerator ruleVarType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;


        	enterRule();

        try {
            // InternalPolycreate.g:1519:2: ( ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'double' ) | (enumLiteral_2= 'PositionSensor' ) | (enumLiteral_3= 'TouchSensor' ) | (enumLiteral_4= 'DistanceSensor' ) | (enumLiteral_5= 'Camera' ) | (enumLiteral_6= 'Receiver' ) | (enumLiteral_7= 'GPS' ) | (enumLiteral_8= 'Motor' ) ) )
            // InternalPolycreate.g:1520:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'double' ) | (enumLiteral_2= 'PositionSensor' ) | (enumLiteral_3= 'TouchSensor' ) | (enumLiteral_4= 'DistanceSensor' ) | (enumLiteral_5= 'Camera' ) | (enumLiteral_6= 'Receiver' ) | (enumLiteral_7= 'GPS' ) | (enumLiteral_8= 'Motor' ) )
            {
            // InternalPolycreate.g:1520:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'double' ) | (enumLiteral_2= 'PositionSensor' ) | (enumLiteral_3= 'TouchSensor' ) | (enumLiteral_4= 'DistanceSensor' ) | (enumLiteral_5= 'Camera' ) | (enumLiteral_6= 'Receiver' ) | (enumLiteral_7= 'GPS' ) | (enumLiteral_8= 'Motor' ) )
            int alt30=9;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt30=1;
                }
                break;
            case 46:
                {
                alt30=2;
                }
                break;
            case 47:
                {
                alt30=3;
                }
                break;
            case 48:
                {
                alt30=4;
                }
                break;
            case 49:
                {
                alt30=5;
                }
                break;
            case 50:
                {
                alt30=6;
                }
                break;
            case 51:
                {
                alt30=7;
                }
                break;
            case 52:
                {
                alt30=8;
                }
                break;
            case 53:
                {
                alt30=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalPolycreate.g:1521:3: (enumLiteral_0= 'int' )
                    {
                    // InternalPolycreate.g:1521:3: (enumLiteral_0= 'int' )
                    // InternalPolycreate.g:1522:4: enumLiteral_0= 'int'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getVarTypeAccess().getIntEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVarTypeAccess().getIntEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPolycreate.g:1529:3: (enumLiteral_1= 'double' )
                    {
                    // InternalPolycreate.g:1529:3: (enumLiteral_1= 'double' )
                    // InternalPolycreate.g:1530:4: enumLiteral_1= 'double'
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getVarTypeAccess().getDoubleEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVarTypeAccess().getDoubleEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPolycreate.g:1537:3: (enumLiteral_2= 'PositionSensor' )
                    {
                    // InternalPolycreate.g:1537:3: (enumLiteral_2= 'PositionSensor' )
                    // InternalPolycreate.g:1538:4: enumLiteral_2= 'PositionSensor'
                    {
                    enumLiteral_2=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getVarTypeAccess().getPositionSensorEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVarTypeAccess().getPositionSensorEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalPolycreate.g:1545:3: (enumLiteral_3= 'TouchSensor' )
                    {
                    // InternalPolycreate.g:1545:3: (enumLiteral_3= 'TouchSensor' )
                    // InternalPolycreate.g:1546:4: enumLiteral_3= 'TouchSensor'
                    {
                    enumLiteral_3=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getVarTypeAccess().getTouchSensorEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getVarTypeAccess().getTouchSensorEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalPolycreate.g:1553:3: (enumLiteral_4= 'DistanceSensor' )
                    {
                    // InternalPolycreate.g:1553:3: (enumLiteral_4= 'DistanceSensor' )
                    // InternalPolycreate.g:1554:4: enumLiteral_4= 'DistanceSensor'
                    {
                    enumLiteral_4=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getVarTypeAccess().getDistanceSensorEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getVarTypeAccess().getDistanceSensorEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalPolycreate.g:1561:3: (enumLiteral_5= 'Camera' )
                    {
                    // InternalPolycreate.g:1561:3: (enumLiteral_5= 'Camera' )
                    // InternalPolycreate.g:1562:4: enumLiteral_5= 'Camera'
                    {
                    enumLiteral_5=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getVarTypeAccess().getCameraEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getVarTypeAccess().getCameraEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalPolycreate.g:1569:3: (enumLiteral_6= 'Receiver' )
                    {
                    // InternalPolycreate.g:1569:3: (enumLiteral_6= 'Receiver' )
                    // InternalPolycreate.g:1570:4: enumLiteral_6= 'Receiver'
                    {
                    enumLiteral_6=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getVarTypeAccess().getReceiverEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getVarTypeAccess().getReceiverEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalPolycreate.g:1577:3: (enumLiteral_7= 'GPS' )
                    {
                    // InternalPolycreate.g:1577:3: (enumLiteral_7= 'GPS' )
                    // InternalPolycreate.g:1578:4: enumLiteral_7= 'GPS'
                    {
                    enumLiteral_7=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getVarTypeAccess().getGPSEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getVarTypeAccess().getGPSEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalPolycreate.g:1585:3: (enumLiteral_8= 'Motor' )
                    {
                    // InternalPolycreate.g:1585:3: (enumLiteral_8= 'Motor' )
                    // InternalPolycreate.g:1586:4: enumLiteral_8= 'Motor'
                    {
                    enumLiteral_8=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getVarTypeAccess().getMotorEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getVarTypeAccess().getMotorEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000007F00000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000F0000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C8000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x003FE00000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000003000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000C8000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020004000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00001000000C8000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000100000088000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000100000008000L});

}