package fr.unice.polytech.si5.polycreate.concretesyntax.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import fr.unice.polytech.si5.polycreate.concretesyntax.services.PolycreateGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPolycreateParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'int'", "'double'", "'PositionSensor'", "'TouchSensor'", "'DistanceSensor'", "'Camera'", "'Receiver'", "'GPS'", "'Motor'", "'Polycreate'", "'{'", "'}'", "'operation'", "','", "'variable'", "'Variable'", "'type'", "'initialValue'", "'GoForward'", "'GoBackward'", "'OpenGripper'", "'CloseGripper'", "'Turn'", "'Stop'", "'StructuralCondition'", "'if'", "'('", "')'", "'then'", "'else'", "'Comparison'", "'leftVariable'", "'rightVariable'", "'value'", "'-'", "'.'", "'GripperSensor'", "'RightSensor'", "'LeftSensor'", "'Object'", "'position'"
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

    	public void setGrammarAccess(PolycreateGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRulePolycreate"
    // InternalPolycreate.g:53:1: entryRulePolycreate : rulePolycreate EOF ;
    public final void entryRulePolycreate() throws RecognitionException {
        try {
            // InternalPolycreate.g:54:1: ( rulePolycreate EOF )
            // InternalPolycreate.g:55:1: rulePolycreate EOF
            {
             before(grammarAccess.getPolycreateRule()); 
            pushFollow(FOLLOW_1);
            rulePolycreate();

            state._fsp--;

             after(grammarAccess.getPolycreateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePolycreate"


    // $ANTLR start "rulePolycreate"
    // InternalPolycreate.g:62:1: rulePolycreate : ( ( rule__Polycreate__Group__0 ) ) ;
    public final void rulePolycreate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:66:2: ( ( ( rule__Polycreate__Group__0 ) ) )
            // InternalPolycreate.g:67:2: ( ( rule__Polycreate__Group__0 ) )
            {
            // InternalPolycreate.g:67:2: ( ( rule__Polycreate__Group__0 ) )
            // InternalPolycreate.g:68:3: ( rule__Polycreate__Group__0 )
            {
             before(grammarAccess.getPolycreateAccess().getGroup()); 
            // InternalPolycreate.g:69:3: ( rule__Polycreate__Group__0 )
            // InternalPolycreate.g:69:4: rule__Polycreate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Polycreate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPolycreateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePolycreate"


    // $ANTLR start "entryRuleOperation"
    // InternalPolycreate.g:78:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // InternalPolycreate.g:79:1: ( ruleOperation EOF )
            // InternalPolycreate.g:80:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalPolycreate.g:87:1: ruleOperation : ( ( rule__Operation__Alternatives ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:91:2: ( ( ( rule__Operation__Alternatives ) ) )
            // InternalPolycreate.g:92:2: ( ( rule__Operation__Alternatives ) )
            {
            // InternalPolycreate.g:92:2: ( ( rule__Operation__Alternatives ) )
            // InternalPolycreate.g:93:3: ( rule__Operation__Alternatives )
            {
             before(grammarAccess.getOperationAccess().getAlternatives()); 
            // InternalPolycreate.g:94:3: ( rule__Operation__Alternatives )
            // InternalPolycreate.g:94:4: rule__Operation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleVariable"
    // InternalPolycreate.g:103:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalPolycreate.g:104:1: ( ruleVariable EOF )
            // InternalPolycreate.g:105:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalPolycreate.g:112:1: ruleVariable : ( ( rule__Variable__Alternatives ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:116:2: ( ( ( rule__Variable__Alternatives ) ) )
            // InternalPolycreate.g:117:2: ( ( rule__Variable__Alternatives ) )
            {
            // InternalPolycreate.g:117:2: ( ( rule__Variable__Alternatives ) )
            // InternalPolycreate.g:118:3: ( rule__Variable__Alternatives )
            {
             before(grammarAccess.getVariableAccess().getAlternatives()); 
            // InternalPolycreate.g:119:3: ( rule__Variable__Alternatives )
            // InternalPolycreate.g:119:4: rule__Variable__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleEString"
    // InternalPolycreate.g:128:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalPolycreate.g:129:1: ( ruleEString EOF )
            // InternalPolycreate.g:130:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalPolycreate.g:137:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:141:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalPolycreate.g:142:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalPolycreate.g:142:2: ( ( rule__EString__Alternatives ) )
            // InternalPolycreate.g:143:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalPolycreate.g:144:3: ( rule__EString__Alternatives )
            // InternalPolycreate.g:144:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleVariable_Impl"
    // InternalPolycreate.g:153:1: entryRuleVariable_Impl : ruleVariable_Impl EOF ;
    public final void entryRuleVariable_Impl() throws RecognitionException {
        try {
            // InternalPolycreate.g:154:1: ( ruleVariable_Impl EOF )
            // InternalPolycreate.g:155:1: ruleVariable_Impl EOF
            {
             before(grammarAccess.getVariable_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable_Impl();

            state._fsp--;

             after(grammarAccess.getVariable_ImplRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable_Impl"


    // $ANTLR start "ruleVariable_Impl"
    // InternalPolycreate.g:162:1: ruleVariable_Impl : ( ( rule__Variable_Impl__Group__0 ) ) ;
    public final void ruleVariable_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:166:2: ( ( ( rule__Variable_Impl__Group__0 ) ) )
            // InternalPolycreate.g:167:2: ( ( rule__Variable_Impl__Group__0 ) )
            {
            // InternalPolycreate.g:167:2: ( ( rule__Variable_Impl__Group__0 ) )
            // InternalPolycreate.g:168:3: ( rule__Variable_Impl__Group__0 )
            {
             before(grammarAccess.getVariable_ImplAccess().getGroup()); 
            // InternalPolycreate.g:169:3: ( rule__Variable_Impl__Group__0 )
            // InternalPolycreate.g:169:4: rule__Variable_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariable_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable_Impl"


    // $ANTLR start "entryRuleGoForward"
    // InternalPolycreate.g:178:1: entryRuleGoForward : ruleGoForward EOF ;
    public final void entryRuleGoForward() throws RecognitionException {
        try {
            // InternalPolycreate.g:179:1: ( ruleGoForward EOF )
            // InternalPolycreate.g:180:1: ruleGoForward EOF
            {
             before(grammarAccess.getGoForwardRule()); 
            pushFollow(FOLLOW_1);
            ruleGoForward();

            state._fsp--;

             after(grammarAccess.getGoForwardRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGoForward"


    // $ANTLR start "ruleGoForward"
    // InternalPolycreate.g:187:1: ruleGoForward : ( ( rule__GoForward__Group__0 ) ) ;
    public final void ruleGoForward() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:191:2: ( ( ( rule__GoForward__Group__0 ) ) )
            // InternalPolycreate.g:192:2: ( ( rule__GoForward__Group__0 ) )
            {
            // InternalPolycreate.g:192:2: ( ( rule__GoForward__Group__0 ) )
            // InternalPolycreate.g:193:3: ( rule__GoForward__Group__0 )
            {
             before(grammarAccess.getGoForwardAccess().getGroup()); 
            // InternalPolycreate.g:194:3: ( rule__GoForward__Group__0 )
            // InternalPolycreate.g:194:4: rule__GoForward__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GoForward__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGoForwardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGoForward"


    // $ANTLR start "entryRuleGoBackward"
    // InternalPolycreate.g:203:1: entryRuleGoBackward : ruleGoBackward EOF ;
    public final void entryRuleGoBackward() throws RecognitionException {
        try {
            // InternalPolycreate.g:204:1: ( ruleGoBackward EOF )
            // InternalPolycreate.g:205:1: ruleGoBackward EOF
            {
             before(grammarAccess.getGoBackwardRule()); 
            pushFollow(FOLLOW_1);
            ruleGoBackward();

            state._fsp--;

             after(grammarAccess.getGoBackwardRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGoBackward"


    // $ANTLR start "ruleGoBackward"
    // InternalPolycreate.g:212:1: ruleGoBackward : ( ( rule__GoBackward__Group__0 ) ) ;
    public final void ruleGoBackward() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:216:2: ( ( ( rule__GoBackward__Group__0 ) ) )
            // InternalPolycreate.g:217:2: ( ( rule__GoBackward__Group__0 ) )
            {
            // InternalPolycreate.g:217:2: ( ( rule__GoBackward__Group__0 ) )
            // InternalPolycreate.g:218:3: ( rule__GoBackward__Group__0 )
            {
             before(grammarAccess.getGoBackwardAccess().getGroup()); 
            // InternalPolycreate.g:219:3: ( rule__GoBackward__Group__0 )
            // InternalPolycreate.g:219:4: rule__GoBackward__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GoBackward__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGoBackwardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGoBackward"


    // $ANTLR start "entryRuleOpenGripper"
    // InternalPolycreate.g:228:1: entryRuleOpenGripper : ruleOpenGripper EOF ;
    public final void entryRuleOpenGripper() throws RecognitionException {
        try {
            // InternalPolycreate.g:229:1: ( ruleOpenGripper EOF )
            // InternalPolycreate.g:230:1: ruleOpenGripper EOF
            {
             before(grammarAccess.getOpenGripperRule()); 
            pushFollow(FOLLOW_1);
            ruleOpenGripper();

            state._fsp--;

             after(grammarAccess.getOpenGripperRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOpenGripper"


    // $ANTLR start "ruleOpenGripper"
    // InternalPolycreate.g:237:1: ruleOpenGripper : ( ( rule__OpenGripper__Group__0 ) ) ;
    public final void ruleOpenGripper() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:241:2: ( ( ( rule__OpenGripper__Group__0 ) ) )
            // InternalPolycreate.g:242:2: ( ( rule__OpenGripper__Group__0 ) )
            {
            // InternalPolycreate.g:242:2: ( ( rule__OpenGripper__Group__0 ) )
            // InternalPolycreate.g:243:3: ( rule__OpenGripper__Group__0 )
            {
             before(grammarAccess.getOpenGripperAccess().getGroup()); 
            // InternalPolycreate.g:244:3: ( rule__OpenGripper__Group__0 )
            // InternalPolycreate.g:244:4: rule__OpenGripper__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OpenGripper__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOpenGripperAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOpenGripper"


    // $ANTLR start "entryRuleCloseGripper"
    // InternalPolycreate.g:253:1: entryRuleCloseGripper : ruleCloseGripper EOF ;
    public final void entryRuleCloseGripper() throws RecognitionException {
        try {
            // InternalPolycreate.g:254:1: ( ruleCloseGripper EOF )
            // InternalPolycreate.g:255:1: ruleCloseGripper EOF
            {
             before(grammarAccess.getCloseGripperRule()); 
            pushFollow(FOLLOW_1);
            ruleCloseGripper();

            state._fsp--;

             after(grammarAccess.getCloseGripperRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCloseGripper"


    // $ANTLR start "ruleCloseGripper"
    // InternalPolycreate.g:262:1: ruleCloseGripper : ( ( rule__CloseGripper__Group__0 ) ) ;
    public final void ruleCloseGripper() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:266:2: ( ( ( rule__CloseGripper__Group__0 ) ) )
            // InternalPolycreate.g:267:2: ( ( rule__CloseGripper__Group__0 ) )
            {
            // InternalPolycreate.g:267:2: ( ( rule__CloseGripper__Group__0 ) )
            // InternalPolycreate.g:268:3: ( rule__CloseGripper__Group__0 )
            {
             before(grammarAccess.getCloseGripperAccess().getGroup()); 
            // InternalPolycreate.g:269:3: ( rule__CloseGripper__Group__0 )
            // InternalPolycreate.g:269:4: rule__CloseGripper__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CloseGripper__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCloseGripperAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCloseGripper"


    // $ANTLR start "entryRuleTurn"
    // InternalPolycreate.g:278:1: entryRuleTurn : ruleTurn EOF ;
    public final void entryRuleTurn() throws RecognitionException {
        try {
            // InternalPolycreate.g:279:1: ( ruleTurn EOF )
            // InternalPolycreate.g:280:1: ruleTurn EOF
            {
             before(grammarAccess.getTurnRule()); 
            pushFollow(FOLLOW_1);
            ruleTurn();

            state._fsp--;

             after(grammarAccess.getTurnRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTurn"


    // $ANTLR start "ruleTurn"
    // InternalPolycreate.g:287:1: ruleTurn : ( ( rule__Turn__Group__0 ) ) ;
    public final void ruleTurn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:291:2: ( ( ( rule__Turn__Group__0 ) ) )
            // InternalPolycreate.g:292:2: ( ( rule__Turn__Group__0 ) )
            {
            // InternalPolycreate.g:292:2: ( ( rule__Turn__Group__0 ) )
            // InternalPolycreate.g:293:3: ( rule__Turn__Group__0 )
            {
             before(grammarAccess.getTurnAccess().getGroup()); 
            // InternalPolycreate.g:294:3: ( rule__Turn__Group__0 )
            // InternalPolycreate.g:294:4: rule__Turn__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Turn__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTurnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTurn"


    // $ANTLR start "entryRuleStop"
    // InternalPolycreate.g:303:1: entryRuleStop : ruleStop EOF ;
    public final void entryRuleStop() throws RecognitionException {
        try {
            // InternalPolycreate.g:304:1: ( ruleStop EOF )
            // InternalPolycreate.g:305:1: ruleStop EOF
            {
             before(grammarAccess.getStopRule()); 
            pushFollow(FOLLOW_1);
            ruleStop();

            state._fsp--;

             after(grammarAccess.getStopRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStop"


    // $ANTLR start "ruleStop"
    // InternalPolycreate.g:312:1: ruleStop : ( ( rule__Stop__Group__0 ) ) ;
    public final void ruleStop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:316:2: ( ( ( rule__Stop__Group__0 ) ) )
            // InternalPolycreate.g:317:2: ( ( rule__Stop__Group__0 ) )
            {
            // InternalPolycreate.g:317:2: ( ( rule__Stop__Group__0 ) )
            // InternalPolycreate.g:318:3: ( rule__Stop__Group__0 )
            {
             before(grammarAccess.getStopAccess().getGroup()); 
            // InternalPolycreate.g:319:3: ( rule__Stop__Group__0 )
            // InternalPolycreate.g:319:4: rule__Stop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Stop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStopAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStop"


    // $ANTLR start "entryRuleStructuralCondition"
    // InternalPolycreate.g:328:1: entryRuleStructuralCondition : ruleStructuralCondition EOF ;
    public final void entryRuleStructuralCondition() throws RecognitionException {
        try {
            // InternalPolycreate.g:329:1: ( ruleStructuralCondition EOF )
            // InternalPolycreate.g:330:1: ruleStructuralCondition EOF
            {
             before(grammarAccess.getStructuralConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleStructuralCondition();

            state._fsp--;

             after(grammarAccess.getStructuralConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStructuralCondition"


    // $ANTLR start "ruleStructuralCondition"
    // InternalPolycreate.g:337:1: ruleStructuralCondition : ( ( rule__StructuralCondition__Group__0 ) ) ;
    public final void ruleStructuralCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:341:2: ( ( ( rule__StructuralCondition__Group__0 ) ) )
            // InternalPolycreate.g:342:2: ( ( rule__StructuralCondition__Group__0 ) )
            {
            // InternalPolycreate.g:342:2: ( ( rule__StructuralCondition__Group__0 ) )
            // InternalPolycreate.g:343:3: ( rule__StructuralCondition__Group__0 )
            {
             before(grammarAccess.getStructuralConditionAccess().getGroup()); 
            // InternalPolycreate.g:344:3: ( rule__StructuralCondition__Group__0 )
            // InternalPolycreate.g:344:4: rule__StructuralCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StructuralCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStructuralConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStructuralCondition"


    // $ANTLR start "entryRuleComparison"
    // InternalPolycreate.g:353:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalPolycreate.g:354:1: ( ruleComparison EOF )
            // InternalPolycreate.g:355:1: ruleComparison EOF
            {
             before(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getComparisonRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalPolycreate.g:362:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:366:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // InternalPolycreate.g:367:2: ( ( rule__Comparison__Group__0 ) )
            {
            // InternalPolycreate.g:367:2: ( ( rule__Comparison__Group__0 ) )
            // InternalPolycreate.g:368:3: ( rule__Comparison__Group__0 )
            {
             before(grammarAccess.getComparisonAccess().getGroup()); 
            // InternalPolycreate.g:369:3: ( rule__Comparison__Group__0 )
            // InternalPolycreate.g:369:4: rule__Comparison__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleEDouble"
    // InternalPolycreate.g:378:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalPolycreate.g:379:1: ( ruleEDouble EOF )
            // InternalPolycreate.g:380:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalPolycreate.g:387:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:391:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalPolycreate.g:392:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalPolycreate.g:392:2: ( ( rule__EDouble__Group__0 ) )
            // InternalPolycreate.g:393:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalPolycreate.g:394:3: ( rule__EDouble__Group__0 )
            // InternalPolycreate.g:394:4: rule__EDouble__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleGripperSensor"
    // InternalPolycreate.g:403:1: entryRuleGripperSensor : ruleGripperSensor EOF ;
    public final void entryRuleGripperSensor() throws RecognitionException {
        try {
            // InternalPolycreate.g:404:1: ( ruleGripperSensor EOF )
            // InternalPolycreate.g:405:1: ruleGripperSensor EOF
            {
             before(grammarAccess.getGripperSensorRule()); 
            pushFollow(FOLLOW_1);
            ruleGripperSensor();

            state._fsp--;

             after(grammarAccess.getGripperSensorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGripperSensor"


    // $ANTLR start "ruleGripperSensor"
    // InternalPolycreate.g:412:1: ruleGripperSensor : ( ( rule__GripperSensor__Group__0 ) ) ;
    public final void ruleGripperSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:416:2: ( ( ( rule__GripperSensor__Group__0 ) ) )
            // InternalPolycreate.g:417:2: ( ( rule__GripperSensor__Group__0 ) )
            {
            // InternalPolycreate.g:417:2: ( ( rule__GripperSensor__Group__0 ) )
            // InternalPolycreate.g:418:3: ( rule__GripperSensor__Group__0 )
            {
             before(grammarAccess.getGripperSensorAccess().getGroup()); 
            // InternalPolycreate.g:419:3: ( rule__GripperSensor__Group__0 )
            // InternalPolycreate.g:419:4: rule__GripperSensor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GripperSensor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGripperSensorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGripperSensor"


    // $ANTLR start "entryRuleRightSensor"
    // InternalPolycreate.g:428:1: entryRuleRightSensor : ruleRightSensor EOF ;
    public final void entryRuleRightSensor() throws RecognitionException {
        try {
            // InternalPolycreate.g:429:1: ( ruleRightSensor EOF )
            // InternalPolycreate.g:430:1: ruleRightSensor EOF
            {
             before(grammarAccess.getRightSensorRule()); 
            pushFollow(FOLLOW_1);
            ruleRightSensor();

            state._fsp--;

             after(grammarAccess.getRightSensorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRightSensor"


    // $ANTLR start "ruleRightSensor"
    // InternalPolycreate.g:437:1: ruleRightSensor : ( ( rule__RightSensor__Group__0 ) ) ;
    public final void ruleRightSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:441:2: ( ( ( rule__RightSensor__Group__0 ) ) )
            // InternalPolycreate.g:442:2: ( ( rule__RightSensor__Group__0 ) )
            {
            // InternalPolycreate.g:442:2: ( ( rule__RightSensor__Group__0 ) )
            // InternalPolycreate.g:443:3: ( rule__RightSensor__Group__0 )
            {
             before(grammarAccess.getRightSensorAccess().getGroup()); 
            // InternalPolycreate.g:444:3: ( rule__RightSensor__Group__0 )
            // InternalPolycreate.g:444:4: rule__RightSensor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RightSensor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRightSensorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRightSensor"


    // $ANTLR start "entryRuleLeftSensor"
    // InternalPolycreate.g:453:1: entryRuleLeftSensor : ruleLeftSensor EOF ;
    public final void entryRuleLeftSensor() throws RecognitionException {
        try {
            // InternalPolycreate.g:454:1: ( ruleLeftSensor EOF )
            // InternalPolycreate.g:455:1: ruleLeftSensor EOF
            {
             before(grammarAccess.getLeftSensorRule()); 
            pushFollow(FOLLOW_1);
            ruleLeftSensor();

            state._fsp--;

             after(grammarAccess.getLeftSensorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLeftSensor"


    // $ANTLR start "ruleLeftSensor"
    // InternalPolycreate.g:462:1: ruleLeftSensor : ( ( rule__LeftSensor__Group__0 ) ) ;
    public final void ruleLeftSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:466:2: ( ( ( rule__LeftSensor__Group__0 ) ) )
            // InternalPolycreate.g:467:2: ( ( rule__LeftSensor__Group__0 ) )
            {
            // InternalPolycreate.g:467:2: ( ( rule__LeftSensor__Group__0 ) )
            // InternalPolycreate.g:468:3: ( rule__LeftSensor__Group__0 )
            {
             before(grammarAccess.getLeftSensorAccess().getGroup()); 
            // InternalPolycreate.g:469:3: ( rule__LeftSensor__Group__0 )
            // InternalPolycreate.g:469:4: rule__LeftSensor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LeftSensor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLeftSensorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLeftSensor"


    // $ANTLR start "entryRuleObject"
    // InternalPolycreate.g:478:1: entryRuleObject : ruleObject EOF ;
    public final void entryRuleObject() throws RecognitionException {
        try {
            // InternalPolycreate.g:479:1: ( ruleObject EOF )
            // InternalPolycreate.g:480:1: ruleObject EOF
            {
             before(grammarAccess.getObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleObject();

            state._fsp--;

             after(grammarAccess.getObjectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
    // InternalPolycreate.g:487:1: ruleObject : ( ( rule__Object__Group__0 ) ) ;
    public final void ruleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:491:2: ( ( ( rule__Object__Group__0 ) ) )
            // InternalPolycreate.g:492:2: ( ( rule__Object__Group__0 ) )
            {
            // InternalPolycreate.g:492:2: ( ( rule__Object__Group__0 ) )
            // InternalPolycreate.g:493:3: ( rule__Object__Group__0 )
            {
             before(grammarAccess.getObjectAccess().getGroup()); 
            // InternalPolycreate.g:494:3: ( rule__Object__Group__0 )
            // InternalPolycreate.g:494:4: rule__Object__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObject"


    // $ANTLR start "ruleVarType"
    // InternalPolycreate.g:503:1: ruleVarType : ( ( rule__VarType__Alternatives ) ) ;
    public final void ruleVarType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:507:1: ( ( ( rule__VarType__Alternatives ) ) )
            // InternalPolycreate.g:508:2: ( ( rule__VarType__Alternatives ) )
            {
            // InternalPolycreate.g:508:2: ( ( rule__VarType__Alternatives ) )
            // InternalPolycreate.g:509:3: ( rule__VarType__Alternatives )
            {
             before(grammarAccess.getVarTypeAccess().getAlternatives()); 
            // InternalPolycreate.g:510:3: ( rule__VarType__Alternatives )
            // InternalPolycreate.g:510:4: rule__VarType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VarType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVarTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVarType"


    // $ANTLR start "rule__Operation__Alternatives"
    // InternalPolycreate.g:518:1: rule__Operation__Alternatives : ( ( ruleGoForward ) | ( ruleGoBackward ) | ( ruleOpenGripper ) | ( ruleCloseGripper ) | ( ruleTurn ) | ( ruleStop ) | ( ruleStructuralCondition ) );
    public final void rule__Operation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:522:1: ( ( ruleGoForward ) | ( ruleGoBackward ) | ( ruleOpenGripper ) | ( ruleCloseGripper ) | ( ruleTurn ) | ( ruleStop ) | ( ruleStructuralCondition ) )
            int alt1=7;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt1=1;
                }
                break;
            case 32:
                {
                alt1=2;
                }
                break;
            case 33:
                {
                alt1=3;
                }
                break;
            case 34:
                {
                alt1=4;
                }
                break;
            case 35:
                {
                alt1=5;
                }
                break;
            case 36:
                {
                alt1=6;
                }
                break;
            case 37:
                {
                alt1=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalPolycreate.g:523:2: ( ruleGoForward )
                    {
                    // InternalPolycreate.g:523:2: ( ruleGoForward )
                    // InternalPolycreate.g:524:3: ruleGoForward
                    {
                     before(grammarAccess.getOperationAccess().getGoForwardParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGoForward();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getGoForwardParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPolycreate.g:529:2: ( ruleGoBackward )
                    {
                    // InternalPolycreate.g:529:2: ( ruleGoBackward )
                    // InternalPolycreate.g:530:3: ruleGoBackward
                    {
                     before(grammarAccess.getOperationAccess().getGoBackwardParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleGoBackward();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getGoBackwardParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPolycreate.g:535:2: ( ruleOpenGripper )
                    {
                    // InternalPolycreate.g:535:2: ( ruleOpenGripper )
                    // InternalPolycreate.g:536:3: ruleOpenGripper
                    {
                     before(grammarAccess.getOperationAccess().getOpenGripperParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleOpenGripper();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getOpenGripperParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPolycreate.g:541:2: ( ruleCloseGripper )
                    {
                    // InternalPolycreate.g:541:2: ( ruleCloseGripper )
                    // InternalPolycreate.g:542:3: ruleCloseGripper
                    {
                     before(grammarAccess.getOperationAccess().getCloseGripperParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleCloseGripper();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getCloseGripperParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPolycreate.g:547:2: ( ruleTurn )
                    {
                    // InternalPolycreate.g:547:2: ( ruleTurn )
                    // InternalPolycreate.g:548:3: ruleTurn
                    {
                     before(grammarAccess.getOperationAccess().getTurnParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleTurn();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getTurnParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalPolycreate.g:553:2: ( ruleStop )
                    {
                    // InternalPolycreate.g:553:2: ( ruleStop )
                    // InternalPolycreate.g:554:3: ruleStop
                    {
                     before(grammarAccess.getOperationAccess().getStopParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleStop();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getStopParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalPolycreate.g:559:2: ( ruleStructuralCondition )
                    {
                    // InternalPolycreate.g:559:2: ( ruleStructuralCondition )
                    // InternalPolycreate.g:560:3: ruleStructuralCondition
                    {
                     before(grammarAccess.getOperationAccess().getStructuralConditionParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleStructuralCondition();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getStructuralConditionParserRuleCall_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Alternatives"


    // $ANTLR start "rule__Variable__Alternatives"
    // InternalPolycreate.g:569:1: rule__Variable__Alternatives : ( ( ruleVariable_Impl ) | ( ruleGripperSensor ) | ( ruleRightSensor ) | ( ruleLeftSensor ) | ( ruleObject ) );
    public final void rule__Variable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:573:1: ( ( ruleVariable_Impl ) | ( ruleGripperSensor ) | ( ruleRightSensor ) | ( ruleLeftSensor ) | ( ruleObject ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt2=1;
                }
                break;
            case 49:
                {
                alt2=2;
                }
                break;
            case 50:
                {
                alt2=3;
                }
                break;
            case 51:
                {
                alt2=4;
                }
                break;
            case 52:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalPolycreate.g:574:2: ( ruleVariable_Impl )
                    {
                    // InternalPolycreate.g:574:2: ( ruleVariable_Impl )
                    // InternalPolycreate.g:575:3: ruleVariable_Impl
                    {
                     before(grammarAccess.getVariableAccess().getVariable_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleVariable_Impl();

                    state._fsp--;

                     after(grammarAccess.getVariableAccess().getVariable_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPolycreate.g:580:2: ( ruleGripperSensor )
                    {
                    // InternalPolycreate.g:580:2: ( ruleGripperSensor )
                    // InternalPolycreate.g:581:3: ruleGripperSensor
                    {
                     before(grammarAccess.getVariableAccess().getGripperSensorParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleGripperSensor();

                    state._fsp--;

                     after(grammarAccess.getVariableAccess().getGripperSensorParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPolycreate.g:586:2: ( ruleRightSensor )
                    {
                    // InternalPolycreate.g:586:2: ( ruleRightSensor )
                    // InternalPolycreate.g:587:3: ruleRightSensor
                    {
                     before(grammarAccess.getVariableAccess().getRightSensorParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRightSensor();

                    state._fsp--;

                     after(grammarAccess.getVariableAccess().getRightSensorParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPolycreate.g:592:2: ( ruleLeftSensor )
                    {
                    // InternalPolycreate.g:592:2: ( ruleLeftSensor )
                    // InternalPolycreate.g:593:3: ruleLeftSensor
                    {
                     before(grammarAccess.getVariableAccess().getLeftSensorParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleLeftSensor();

                    state._fsp--;

                     after(grammarAccess.getVariableAccess().getLeftSensorParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPolycreate.g:598:2: ( ruleObject )
                    {
                    // InternalPolycreate.g:598:2: ( ruleObject )
                    // InternalPolycreate.g:599:3: ruleObject
                    {
                     before(grammarAccess.getVariableAccess().getObjectParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleObject();

                    state._fsp--;

                     after(grammarAccess.getVariableAccess().getObjectParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalPolycreate.g:608:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:612:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalPolycreate.g:613:2: ( RULE_STRING )
                    {
                    // InternalPolycreate.g:613:2: ( RULE_STRING )
                    // InternalPolycreate.g:614:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPolycreate.g:619:2: ( RULE_ID )
                    {
                    // InternalPolycreate.g:619:2: ( RULE_ID )
                    // InternalPolycreate.g:620:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // InternalPolycreate.g:629:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:633:1: ( ( 'E' ) | ( 'e' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalPolycreate.g:634:2: ( 'E' )
                    {
                    // InternalPolycreate.g:634:2: ( 'E' )
                    // InternalPolycreate.g:635:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPolycreate.g:640:2: ( 'e' )
                    {
                    // InternalPolycreate.g:640:2: ( 'e' )
                    // InternalPolycreate.g:641:3: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Alternatives_4_0"


    // $ANTLR start "rule__VarType__Alternatives"
    // InternalPolycreate.g:650:1: rule__VarType__Alternatives : ( ( ( 'int' ) ) | ( ( 'double' ) ) | ( ( 'PositionSensor' ) ) | ( ( 'TouchSensor' ) ) | ( ( 'DistanceSensor' ) ) | ( ( 'Camera' ) ) | ( ( 'Receiver' ) ) | ( ( 'GPS' ) ) | ( ( 'Motor' ) ) );
    public final void rule__VarType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:654:1: ( ( ( 'int' ) ) | ( ( 'double' ) ) | ( ( 'PositionSensor' ) ) | ( ( 'TouchSensor' ) ) | ( ( 'DistanceSensor' ) ) | ( ( 'Camera' ) ) | ( ( 'Receiver' ) ) | ( ( 'GPS' ) ) | ( ( 'Motor' ) ) )
            int alt5=9;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt5=1;
                }
                break;
            case 14:
                {
                alt5=2;
                }
                break;
            case 15:
                {
                alt5=3;
                }
                break;
            case 16:
                {
                alt5=4;
                }
                break;
            case 17:
                {
                alt5=5;
                }
                break;
            case 18:
                {
                alt5=6;
                }
                break;
            case 19:
                {
                alt5=7;
                }
                break;
            case 20:
                {
                alt5=8;
                }
                break;
            case 21:
                {
                alt5=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalPolycreate.g:655:2: ( ( 'int' ) )
                    {
                    // InternalPolycreate.g:655:2: ( ( 'int' ) )
                    // InternalPolycreate.g:656:3: ( 'int' )
                    {
                     before(grammarAccess.getVarTypeAccess().getIntEnumLiteralDeclaration_0()); 
                    // InternalPolycreate.g:657:3: ( 'int' )
                    // InternalPolycreate.g:657:4: 'int'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getVarTypeAccess().getIntEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPolycreate.g:661:2: ( ( 'double' ) )
                    {
                    // InternalPolycreate.g:661:2: ( ( 'double' ) )
                    // InternalPolycreate.g:662:3: ( 'double' )
                    {
                     before(grammarAccess.getVarTypeAccess().getDoubleEnumLiteralDeclaration_1()); 
                    // InternalPolycreate.g:663:3: ( 'double' )
                    // InternalPolycreate.g:663:4: 'double'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getVarTypeAccess().getDoubleEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPolycreate.g:667:2: ( ( 'PositionSensor' ) )
                    {
                    // InternalPolycreate.g:667:2: ( ( 'PositionSensor' ) )
                    // InternalPolycreate.g:668:3: ( 'PositionSensor' )
                    {
                     before(grammarAccess.getVarTypeAccess().getPositionSensorEnumLiteralDeclaration_2()); 
                    // InternalPolycreate.g:669:3: ( 'PositionSensor' )
                    // InternalPolycreate.g:669:4: 'PositionSensor'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getVarTypeAccess().getPositionSensorEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPolycreate.g:673:2: ( ( 'TouchSensor' ) )
                    {
                    // InternalPolycreate.g:673:2: ( ( 'TouchSensor' ) )
                    // InternalPolycreate.g:674:3: ( 'TouchSensor' )
                    {
                     before(grammarAccess.getVarTypeAccess().getTouchSensorEnumLiteralDeclaration_3()); 
                    // InternalPolycreate.g:675:3: ( 'TouchSensor' )
                    // InternalPolycreate.g:675:4: 'TouchSensor'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getVarTypeAccess().getTouchSensorEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPolycreate.g:679:2: ( ( 'DistanceSensor' ) )
                    {
                    // InternalPolycreate.g:679:2: ( ( 'DistanceSensor' ) )
                    // InternalPolycreate.g:680:3: ( 'DistanceSensor' )
                    {
                     before(grammarAccess.getVarTypeAccess().getDistanceSensorEnumLiteralDeclaration_4()); 
                    // InternalPolycreate.g:681:3: ( 'DistanceSensor' )
                    // InternalPolycreate.g:681:4: 'DistanceSensor'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getVarTypeAccess().getDistanceSensorEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalPolycreate.g:685:2: ( ( 'Camera' ) )
                    {
                    // InternalPolycreate.g:685:2: ( ( 'Camera' ) )
                    // InternalPolycreate.g:686:3: ( 'Camera' )
                    {
                     before(grammarAccess.getVarTypeAccess().getCameraEnumLiteralDeclaration_5()); 
                    // InternalPolycreate.g:687:3: ( 'Camera' )
                    // InternalPolycreate.g:687:4: 'Camera'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getVarTypeAccess().getCameraEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalPolycreate.g:691:2: ( ( 'Receiver' ) )
                    {
                    // InternalPolycreate.g:691:2: ( ( 'Receiver' ) )
                    // InternalPolycreate.g:692:3: ( 'Receiver' )
                    {
                     before(grammarAccess.getVarTypeAccess().getReceiverEnumLiteralDeclaration_6()); 
                    // InternalPolycreate.g:693:3: ( 'Receiver' )
                    // InternalPolycreate.g:693:4: 'Receiver'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getVarTypeAccess().getReceiverEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalPolycreate.g:697:2: ( ( 'GPS' ) )
                    {
                    // InternalPolycreate.g:697:2: ( ( 'GPS' ) )
                    // InternalPolycreate.g:698:3: ( 'GPS' )
                    {
                     before(grammarAccess.getVarTypeAccess().getGPSEnumLiteralDeclaration_7()); 
                    // InternalPolycreate.g:699:3: ( 'GPS' )
                    // InternalPolycreate.g:699:4: 'GPS'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getVarTypeAccess().getGPSEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalPolycreate.g:703:2: ( ( 'Motor' ) )
                    {
                    // InternalPolycreate.g:703:2: ( ( 'Motor' ) )
                    // InternalPolycreate.g:704:3: ( 'Motor' )
                    {
                     before(grammarAccess.getVarTypeAccess().getMotorEnumLiteralDeclaration_8()); 
                    // InternalPolycreate.g:705:3: ( 'Motor' )
                    // InternalPolycreate.g:705:4: 'Motor'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getVarTypeAccess().getMotorEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarType__Alternatives"


    // $ANTLR start "rule__Polycreate__Group__0"
    // InternalPolycreate.g:713:1: rule__Polycreate__Group__0 : rule__Polycreate__Group__0__Impl rule__Polycreate__Group__1 ;
    public final void rule__Polycreate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:717:1: ( rule__Polycreate__Group__0__Impl rule__Polycreate__Group__1 )
            // InternalPolycreate.g:718:2: rule__Polycreate__Group__0__Impl rule__Polycreate__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Polycreate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Polycreate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polycreate__Group__0"


    // $ANTLR start "rule__Polycreate__Group__0__Impl"
    // InternalPolycreate.g:725:1: rule__Polycreate__Group__0__Impl : ( () ) ;
    public final void rule__Polycreate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:729:1: ( ( () ) )
            // InternalPolycreate.g:730:1: ( () )
            {
            // InternalPolycreate.g:730:1: ( () )
            // InternalPolycreate.g:731:2: ()
            {
             before(grammarAccess.getPolycreateAccess().getPolycreateAction_0()); 
            // InternalPolycreate.g:732:2: ()
            // InternalPolycreate.g:732:3: 
            {
            }

             after(grammarAccess.getPolycreateAccess().getPolycreateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polycreate__Group__0__Impl"


    // $ANTLR start "rule__Polycreate__Group__1"
    // InternalPolycreate.g:740:1: rule__Polycreate__Group__1 : rule__Polycreate__Group__1__Impl rule__Polycreate__Group__2 ;
    public final void rule__Polycreate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:744:1: ( rule__Polycreate__Group__1__Impl rule__Polycreate__Group__2 )
            // InternalPolycreate.g:745:2: rule__Polycreate__Group__1__Impl rule__Polycreate__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Polycreate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Polycreate__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polycreate__Group__1"


    // $ANTLR start "rule__Polycreate__Group__1__Impl"
    // InternalPolycreate.g:752:1: rule__Polycreate__Group__1__Impl : ( 'Polycreate' ) ;
    public final void rule__Polycreate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:756:1: ( ( 'Polycreate' ) )
            // InternalPolycreate.g:757:1: ( 'Polycreate' )
            {
            // InternalPolycreate.g:757:1: ( 'Polycreate' )
            // InternalPolycreate.g:758:2: 'Polycreate'
            {
             before(grammarAccess.getPolycreateAccess().getPolycreateKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPolycreateAccess().getPolycreateKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polycreate__Group__1__Impl"


    // $ANTLR start "rule__Polycreate__Group__2"
    // InternalPolycreate.g:767:1: rule__Polycreate__Group__2 : rule__Polycreate__Group__2__Impl rule__Polycreate__Group__3 ;
    public final void rule__Polycreate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:771:1: ( rule__Polycreate__Group__2__Impl rule__Polycreate__Group__3 )
            // InternalPolycreate.g:772:2: rule__Polycreate__Group__2__Impl rule__Polycreate__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Polycreate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Polycreate__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polycreate__Group__2"


    // $ANTLR start "rule__Polycreate__Group__2__Impl"
    // InternalPolycreate.g:779:1: rule__Polycreate__Group__2__Impl : ( ( rule__Polycreate__NameAssignment_2 ) ) ;
    public final void rule__Polycreate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:783:1: ( ( ( rule__Polycreate__NameAssignment_2 ) ) )
            // InternalPolycreate.g:784:1: ( ( rule__Polycreate__NameAssignment_2 ) )
            {
            // InternalPolycreate.g:784:1: ( ( rule__Polycreate__NameAssignment_2 ) )
            // InternalPolycreate.g:785:2: ( rule__Polycreate__NameAssignment_2 )
            {
             before(grammarAccess.getPolycreateAccess().getNameAssignment_2()); 
            // InternalPolycreate.g:786:2: ( rule__Polycreate__NameAssignment_2 )
            // InternalPolycreate.g:786:3: rule__Polycreate__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Polycreate__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPolycreateAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polycreate__Group__2__Impl"


    // $ANTLR start "rule__Polycreate__Group__3"
    // InternalPolycreate.g:794:1: rule__Polycreate__Group__3 : rule__Polycreate__Group__3__Impl rule__Polycreate__Group__4 ;
    public final void rule__Polycreate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:798:1: ( rule__Polycreate__Group__3__Impl rule__Polycreate__Group__4 )
            // InternalPolycreate.g:799:2: rule__Polycreate__Group__3__Impl rule__Polycreate__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Polycreate__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Polycreate__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polycreate__Group__3"


    // $ANTLR start "rule__Polycreate__Group__3__Impl"
    // InternalPolycreate.g:806:1: rule__Polycreate__Group__3__Impl : ( '{' ) ;
    public final void rule__Polycreate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:810:1: ( ( '{' ) )
            // InternalPolycreate.g:811:1: ( '{' )
            {
            // InternalPolycreate.g:811:1: ( '{' )
            // InternalPolycreate.g:812:2: '{'
            {
             before(grammarAccess.getPolycreateAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPolycreateAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polycreate__Group__3__Impl"


    // $ANTLR start "rule__Polycreate__Group__4"
    // InternalPolycreate.g:821:1: rule__Polycreate__Group__4 : rule__Polycreate__Group__4__Impl rule__Polycreate__Group__5 ;
    public final void rule__Polycreate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:825:1: ( rule__Polycreate__Group__4__Impl rule__Polycreate__Group__5 )
            // InternalPolycreate.g:826:2: rule__Polycreate__Group__4__Impl rule__Polycreate__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Polycreate__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Polycreate__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polycreate__Group__4"


    // $ANTLR start "rule__Polycreate__Group__4__Impl"
    // InternalPolycreate.g:833:1: rule__Polycreate__Group__4__Impl : ( ( rule__Polycreate__Group_4__0 )? ) ;
    public final void rule__Polycreate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:837:1: ( ( ( rule__Polycreate__Group_4__0 )? ) )
            // InternalPolycreate.g:838:1: ( ( rule__Polycreate__Group_4__0 )? )
            {
            // InternalPolycreate.g:838:1: ( ( rule__Polycreate__Group_4__0 )? )
            // InternalPolycreate.g:839:2: ( rule__Polycreate__Group_4__0 )?
            {
             before(grammarAccess.getPolycreateAccess().getGroup_4()); 
            // InternalPolycreate.g:840:2: ( rule__Polycreate__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPolycreate.g:840:3: rule__Polycreate__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Polycreate__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPolycreateAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polycreate__Group__4__Impl"


    // $ANTLR start "rule__Polycreate__Group__5"
    // InternalPolycreate.g:848:1: rule__Polycreate__Group__5 : rule__Polycreate__Group__5__Impl rule__Polycreate__Group__6 ;
    public final void rule__Polycreate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:852:1: ( rule__Polycreate__Group__5__Impl rule__Polycreate__Group__6 )
            // InternalPolycreate.g:853:2: rule__Polycreate__Group__5__Impl rule__Polycreate__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Polycreate__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Polycreate__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polycreate__Group__5"


    // $ANTLR start "rule__Polycreate__Group__5__Impl"
    // InternalPolycreate.g:860:1: rule__Polycreate__Group__5__Impl : ( ( rule__Polycreate__Group_5__0 )? ) ;
    public final void rule__Polycreate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:864:1: ( ( ( rule__Polycreate__Group_5__0 )? ) )
            // InternalPolycreate.g:865:1: ( ( rule__Polycreate__Group_5__0 )? )
            {
            // InternalPolycreate.g:865:1: ( ( rule__Polycreate__Group_5__0 )? )
            // InternalPolycreate.g:866:2: ( rule__Polycreate__Group_5__0 )?
            {
             before(grammarAccess.getPolycreateAccess().getGroup_5()); 
            // InternalPolycreate.g:867:2: ( rule__Polycreate__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPolycreate.g:867:3: rule__Polycreate__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Polycreate__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPolycreateAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polycreate__Group__5__Impl"


    // $ANTLR start "rule__Polycreate__Group__6"
    // InternalPolycreate.g:875:1: rule__Polycreate__Group__6 : rule__Polycreate__Group__6__Impl ;
    public final void rule__Polycreate__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:879:1: ( rule__Polycreate__Group__6__Impl )
            // InternalPolycreate.g:880:2: rule__Polycreate__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Polycreate__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polycreate__Group__6"


    // $ANTLR start "rule__Polycreate__Group__6__Impl"
    // InternalPolycreate.g:886:1: rule__Polycreate__Group__6__Impl : ( '}' ) ;
    public final void rule__Polycreate__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:890:1: ( ( '}' ) )
            // InternalPolycreate.g:891:1: ( '}' )
            {
            // InternalPolycreate.g:891:1: ( '}' )
            // InternalPolycreate.g:892:2: '}'
            {
             before(grammarAccess.getPolycreateAccess().getRightCurlyBracketKeyword_6()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPolycreateAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polycreate__Group__6__Impl"


    // $ANTLR start "rule__Polycreate__Group_4__0"
    // InternalPolycreate.g:902:1: rule__Polycreate__Group_4__0 : rule__Polycreate__Group_4__0__Impl rule__Polycreate__Group_4__1 ;
    public final void rule__Polycreate__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:906:1: ( rule__Polycreate__Group_4__0__Impl rule__Polycreate__Group_4__1 )
            // InternalPolycreate.g:907:2: rule__Polycreate__Group_4__0__Impl rule__Polycreate__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Polycreate__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Polycreate__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polycreate__Group_4__0"


    // $ANTLR start "rule__Polycreate__Group_4__0__Impl"
    // InternalPolycreate.g:914:1: rule__Polycreate__Group_4__0__Impl : ( 'operation' ) ;
    public final void rule__Polycreate__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:918:1: ( ( 'operation' ) )
            // InternalPolycreate.g:919:1: ( 'operation' )
            {
            // InternalPolycreate.g:919:1: ( 'operation' )
            // InternalPolycreate.g:920:2: 'operation'
            {
             before(grammarAccess.getPolycreateAccess().getOperationKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPolycreateAccess().getOperationKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polycreate__Group_4__0__Impl"


    // $ANTLR start "rule__Polycreate__Group_4__1"
    // InternalPolycreate.g:929:1: rule__Polycreate__Group_4__1 : rule__Polycreate__Group_4__1__Impl rule__Polycreate__Group_4__2 ;
    public final void rule__Polycreate__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:933:1: ( rule__Polycreate__Group_4__1__Impl rule__Polycreate__Group_4__2 )
            // InternalPolycreate.g:934:2: rule__Polycreate__Group_4__1__Impl rule__Polycreate__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__Polycreate__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Polycreate__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polycreate__Group_4__1"


    // $ANTLR start "rule__Polycreate__Group_4__1__Impl"
    // InternalPolycreate.g:941:1: rule__Polycreate__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Polycreate__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:945:1: ( ( '{' ) )
            // InternalPolycreate.g:946:1: ( '{' )
            {
            // InternalPolycreate.g:946:1: ( '{' )
            // InternalPolycreate.g:947:2: '{'
            {
             before(grammarAccess.getPolycreateAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPolycreateAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polycreate__Group_4__1__Impl"


    // $ANTLR start "rule__Polycreate__Group_4__2"
    // InternalPolycreate.g:956:1: rule__Polycreate__Group_4__2 : rule__Polycreate__Group_4__2__Impl rule__Polycreate__Group_4__3 ;
    public final void rule__Polycreate__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:960:1: ( rule__Polycreate__Group_4__2__Impl rule__Polycreate__Group_4__3 )
            // InternalPolycreate.g:961:2: rule__Polycreate__Group_4__2__Impl rule__Polycreate__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__Polycreate__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Polycreate__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polycreate__Group_4__2"


    // $ANTLR start "rule__Polycreate__Group_4__2__Impl"
    // InternalPolycreate.g:968:1: rule__Polycreate__Group_4__2__Impl : ( ( rule__Polycreate__OperationAssignment_4_2 ) ) ;
    public final void rule__Polycreate__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:972:1: ( ( ( rule__Polycreate__OperationAssignment_4_2 ) ) )
            // InternalPolycreate.g:973:1: ( ( rule__Polycreate__OperationAssignment_4_2 ) )
            {
            // InternalPolycreate.g:973:1: ( ( rule__Polycreate__OperationAssignment_4_2 ) )
            // InternalPolycreate.g:974:2: ( rule__Polycreate__OperationAssignment_4_2 )
            {
             before(grammarAccess.getPolycreateAccess().getOperationAssignment_4_2()); 
            // InternalPolycreate.g:975:2: ( rule__Polycreate__OperationAssignment_4_2 )
            // InternalPolycreate.g:975:3: rule__Polycreate__OperationAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Polycreate__OperationAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getPolycreateAccess().getOperationAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polycreate__Group_4__2__Impl"


    // $ANTLR start "rule__Polycreate__Group_4__3"
    // InternalPolycreate.g:983:1: rule__Polycreate__Group_4__3 : rule__Polycreate__Group_4__3__Impl rule__Polycreate__Group_4__4 ;
    public final void rule__Polycreate__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:987:1: ( rule__Polycreate__Group_4__3__Impl rule__Polycreate__Group_4__4 )
            // InternalPolycreate.g:988:2: rule__Polycreate__Group_4__3__Impl rule__Polycreate__Group_4__4
            {
            pushFollow(FOLLOW_8);
            rule__Polycreate__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Polycreate__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polycreate__Group_4__3"


    // $ANTLR start "rule__Polycreate__Group_4__3__Impl"
    // InternalPolycreate.g:995:1: rule__Polycreate__Group_4__3__Impl : ( ( rule__Polycreate__Group_4_3__0 )* ) ;
    public final void rule__Polycreate__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:999:1: ( ( ( rule__Polycreate__Group_4_3__0 )* ) )
            // InternalPolycreate.g:1000:1: ( ( rule__Polycreate__Group_4_3__0 )* )
            {
            // InternalPolycreate.g:1000:1: ( ( rule__Polycreate__Group_4_3__0 )* )
            // InternalPolycreate.g:1001:2: ( rule__Polycreate__Group_4_3__0 )*
            {
             before(grammarAccess.getPolycreateAccess().getGroup_4_3()); 
            // InternalPolycreate.g:1002:2: ( rule__Polycreate__Group_4_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==26) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPolycreate.g:1002:3: rule__Polycreate__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Polycreate__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getPolycreateAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polycreate__Group_4__3__Impl"


    // $ANTLR start "rule__Polycreate__Group_4__4"
    // InternalPolycreate.g:1010:1: rule__Polycreate__Group_4__4 : rule__Polycreate__Group_4__4__Impl ;
    public final void rule__Polycreate__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1014:1: ( rule__Polycreate__Group_4__4__Impl )
            // InternalPolycreate.g:1015:2: rule__Polycreate__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Polycreate__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polycreate__Group_4__4"


    // $ANTLR start "rule__Polycreate__Group_4__4__Impl"
    // InternalPolycreate.g:1021:1: rule__Polycreate__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Polycreate__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1025:1: ( ( '}' ) )
            // InternalPolycreate.g:1026:1: ( '}' )
            {
            // InternalPolycreate.g:1026:1: ( '}' )
            // InternalPolycreate.g:1027:2: '}'
            {
             before(grammarAccess.getPolycreateAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPolycreateAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polycreate__Group_4__4__Impl"


    // $ANTLR start "rule__Polycreate__Group_4_3__0"
    // InternalPolycreate.g:1037:1: rule__Polycreate__Group_4_3__0 : rule__Polycreate__Group_4_3__0__Impl rule__Polycreate__Group_4_3__1 ;
    public final void rule__Polycreate__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1041:1: ( rule__Polycreate__Group_4_3__0__Impl rule__Polycreate__Group_4_3__1 )
            // InternalPolycreate.g:1042:2: rule__Polycreate__Group_4_3__0__Impl rule__Polycreate__Group_4_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Polycreate__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Polycreate__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polycreate__Group_4_3__0"


    // $ANTLR start "rule__Polycreate__Group_4_3__0__Impl"
    // InternalPolycreate.g:1049:1: rule__Polycreate__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Polycreate__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1053:1: ( ( ',' ) )
            // InternalPolycreate.g:1054:1: ( ',' )
            {
            // InternalPolycreate.g:1054:1: ( ',' )
            // InternalPolycreate.g:1055:2: ','
            {
             before(grammarAccess.getPolycreateAccess().getCommaKeyword_4_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPolycreateAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polycreate__Group_4_3__0__Impl"


    // $ANTLR start "rule__Polycreate__Group_4_3__1"
    // InternalPolycreate.g:1064:1: rule__Polycreate__Group_4_3__1 : rule__Polycreate__Group_4_3__1__Impl ;
    public final void rule__Polycreate__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1068:1: ( rule__Polycreate__Group_4_3__1__Impl )
            // InternalPolycreate.g:1069:2: rule__Polycreate__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Polycreate__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polycreate__Group_4_3__1"


    // $ANTLR start "rule__Polycreate__Group_4_3__1__Impl"
    // InternalPolycreate.g:1075:1: rule__Polycreate__Group_4_3__1__Impl : ( ( rule__Polycreate__OperationAssignment_4_3_1 ) ) ;
    public final void rule__Polycreate__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1079:1: ( ( ( rule__Polycreate__OperationAssignment_4_3_1 ) ) )
            // InternalPolycreate.g:1080:1: ( ( rule__Polycreate__OperationAssignment_4_3_1 ) )
            {
            // InternalPolycreate.g:1080:1: ( ( rule__Polycreate__OperationAssignment_4_3_1 ) )
            // InternalPolycreate.g:1081:2: ( rule__Polycreate__OperationAssignment_4_3_1 )
            {
             before(grammarAccess.getPolycreateAccess().getOperationAssignment_4_3_1()); 
            // InternalPolycreate.g:1082:2: ( rule__Polycreate__OperationAssignment_4_3_1 )
            // InternalPolycreate.g:1082:3: rule__Polycreate__OperationAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Polycreate__OperationAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPolycreateAccess().getOperationAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polycreate__Group_4_3__1__Impl"


    // $ANTLR start "rule__Polycreate__Group_5__0"
    // InternalPolycreate.g:1091:1: rule__Polycreate__Group_5__0 : rule__Polycreate__Group_5__0__Impl rule__Polycreate__Group_5__1 ;
    public final void rule__Polycreate__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1095:1: ( rule__Polycreate__Group_5__0__Impl rule__Polycreate__Group_5__1 )
            // InternalPolycreate.g:1096:2: rule__Polycreate__Group_5__0__Impl rule__Polycreate__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Polycreate__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Polycreate__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polycreate__Group_5__0"


    // $ANTLR start "rule__Polycreate__Group_5__0__Impl"
    // InternalPolycreate.g:1103:1: rule__Polycreate__Group_5__0__Impl : ( 'variable' ) ;
    public final void rule__Polycreate__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1107:1: ( ( 'variable' ) )
            // InternalPolycreate.g:1108:1: ( 'variable' )
            {
            // InternalPolycreate.g:1108:1: ( 'variable' )
            // InternalPolycreate.g:1109:2: 'variable'
            {
             before(grammarAccess.getPolycreateAccess().getVariableKeyword_5_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPolycreateAccess().getVariableKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polycreate__Group_5__0__Impl"


    // $ANTLR start "rule__Polycreate__Group_5__1"
    // InternalPolycreate.g:1118:1: rule__Polycreate__Group_5__1 : rule__Polycreate__Group_5__1__Impl rule__Polycreate__Group_5__2 ;
    public final void rule__Polycreate__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1122:1: ( rule__Polycreate__Group_5__1__Impl rule__Polycreate__Group_5__2 )
            // InternalPolycreate.g:1123:2: rule__Polycreate__Group_5__1__Impl rule__Polycreate__Group_5__2
            {
            pushFollow(FOLLOW_10);
            rule__Polycreate__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Polycreate__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polycreate__Group_5__1"


    // $ANTLR start "rule__Polycreate__Group_5__1__Impl"
    // InternalPolycreate.g:1130:1: rule__Polycreate__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Polycreate__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1134:1: ( ( '{' ) )
            // InternalPolycreate.g:1135:1: ( '{' )
            {
            // InternalPolycreate.g:1135:1: ( '{' )
            // InternalPolycreate.g:1136:2: '{'
            {
             before(grammarAccess.getPolycreateAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPolycreateAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polycreate__Group_5__1__Impl"


    // $ANTLR start "rule__Polycreate__Group_5__2"
    // InternalPolycreate.g:1145:1: rule__Polycreate__Group_5__2 : rule__Polycreate__Group_5__2__Impl rule__Polycreate__Group_5__3 ;
    public final void rule__Polycreate__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1149:1: ( rule__Polycreate__Group_5__2__Impl rule__Polycreate__Group_5__3 )
            // InternalPolycreate.g:1150:2: rule__Polycreate__Group_5__2__Impl rule__Polycreate__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__Polycreate__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Polycreate__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polycreate__Group_5__2"


    // $ANTLR start "rule__Polycreate__Group_5__2__Impl"
    // InternalPolycreate.g:1157:1: rule__Polycreate__Group_5__2__Impl : ( ( rule__Polycreate__VariableAssignment_5_2 ) ) ;
    public final void rule__Polycreate__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1161:1: ( ( ( rule__Polycreate__VariableAssignment_5_2 ) ) )
            // InternalPolycreate.g:1162:1: ( ( rule__Polycreate__VariableAssignment_5_2 ) )
            {
            // InternalPolycreate.g:1162:1: ( ( rule__Polycreate__VariableAssignment_5_2 ) )
            // InternalPolycreate.g:1163:2: ( rule__Polycreate__VariableAssignment_5_2 )
            {
             before(grammarAccess.getPolycreateAccess().getVariableAssignment_5_2()); 
            // InternalPolycreate.g:1164:2: ( rule__Polycreate__VariableAssignment_5_2 )
            // InternalPolycreate.g:1164:3: rule__Polycreate__VariableAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Polycreate__VariableAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getPolycreateAccess().getVariableAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polycreate__Group_5__2__Impl"


    // $ANTLR start "rule__Polycreate__Group_5__3"
    // InternalPolycreate.g:1172:1: rule__Polycreate__Group_5__3 : rule__Polycreate__Group_5__3__Impl rule__Polycreate__Group_5__4 ;
    public final void rule__Polycreate__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1176:1: ( rule__Polycreate__Group_5__3__Impl rule__Polycreate__Group_5__4 )
            // InternalPolycreate.g:1177:2: rule__Polycreate__Group_5__3__Impl rule__Polycreate__Group_5__4
            {
            pushFollow(FOLLOW_8);
            rule__Polycreate__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Polycreate__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polycreate__Group_5__3"


    // $ANTLR start "rule__Polycreate__Group_5__3__Impl"
    // InternalPolycreate.g:1184:1: rule__Polycreate__Group_5__3__Impl : ( ( rule__Polycreate__Group_5_3__0 )* ) ;
    public final void rule__Polycreate__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1188:1: ( ( ( rule__Polycreate__Group_5_3__0 )* ) )
            // InternalPolycreate.g:1189:1: ( ( rule__Polycreate__Group_5_3__0 )* )
            {
            // InternalPolycreate.g:1189:1: ( ( rule__Polycreate__Group_5_3__0 )* )
            // InternalPolycreate.g:1190:2: ( rule__Polycreate__Group_5_3__0 )*
            {
             before(grammarAccess.getPolycreateAccess().getGroup_5_3()); 
            // InternalPolycreate.g:1191:2: ( rule__Polycreate__Group_5_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPolycreate.g:1191:3: rule__Polycreate__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Polycreate__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getPolycreateAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polycreate__Group_5__3__Impl"


    // $ANTLR start "rule__Polycreate__Group_5__4"
    // InternalPolycreate.g:1199:1: rule__Polycreate__Group_5__4 : rule__Polycreate__Group_5__4__Impl ;
    public final void rule__Polycreate__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1203:1: ( rule__Polycreate__Group_5__4__Impl )
            // InternalPolycreate.g:1204:2: rule__Polycreate__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Polycreate__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polycreate__Group_5__4"


    // $ANTLR start "rule__Polycreate__Group_5__4__Impl"
    // InternalPolycreate.g:1210:1: rule__Polycreate__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Polycreate__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1214:1: ( ( '}' ) )
            // InternalPolycreate.g:1215:1: ( '}' )
            {
            // InternalPolycreate.g:1215:1: ( '}' )
            // InternalPolycreate.g:1216:2: '}'
            {
             before(grammarAccess.getPolycreateAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPolycreateAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polycreate__Group_5__4__Impl"


    // $ANTLR start "rule__Polycreate__Group_5_3__0"
    // InternalPolycreate.g:1226:1: rule__Polycreate__Group_5_3__0 : rule__Polycreate__Group_5_3__0__Impl rule__Polycreate__Group_5_3__1 ;
    public final void rule__Polycreate__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1230:1: ( rule__Polycreate__Group_5_3__0__Impl rule__Polycreate__Group_5_3__1 )
            // InternalPolycreate.g:1231:2: rule__Polycreate__Group_5_3__0__Impl rule__Polycreate__Group_5_3__1
            {
            pushFollow(FOLLOW_10);
            rule__Polycreate__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Polycreate__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polycreate__Group_5_3__0"


    // $ANTLR start "rule__Polycreate__Group_5_3__0__Impl"
    // InternalPolycreate.g:1238:1: rule__Polycreate__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Polycreate__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1242:1: ( ( ',' ) )
            // InternalPolycreate.g:1243:1: ( ',' )
            {
            // InternalPolycreate.g:1243:1: ( ',' )
            // InternalPolycreate.g:1244:2: ','
            {
             before(grammarAccess.getPolycreateAccess().getCommaKeyword_5_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPolycreateAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polycreate__Group_5_3__0__Impl"


    // $ANTLR start "rule__Polycreate__Group_5_3__1"
    // InternalPolycreate.g:1253:1: rule__Polycreate__Group_5_3__1 : rule__Polycreate__Group_5_3__1__Impl ;
    public final void rule__Polycreate__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1257:1: ( rule__Polycreate__Group_5_3__1__Impl )
            // InternalPolycreate.g:1258:2: rule__Polycreate__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Polycreate__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polycreate__Group_5_3__1"


    // $ANTLR start "rule__Polycreate__Group_5_3__1__Impl"
    // InternalPolycreate.g:1264:1: rule__Polycreate__Group_5_3__1__Impl : ( ( rule__Polycreate__VariableAssignment_5_3_1 ) ) ;
    public final void rule__Polycreate__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1268:1: ( ( ( rule__Polycreate__VariableAssignment_5_3_1 ) ) )
            // InternalPolycreate.g:1269:1: ( ( rule__Polycreate__VariableAssignment_5_3_1 ) )
            {
            // InternalPolycreate.g:1269:1: ( ( rule__Polycreate__VariableAssignment_5_3_1 ) )
            // InternalPolycreate.g:1270:2: ( rule__Polycreate__VariableAssignment_5_3_1 )
            {
             before(grammarAccess.getPolycreateAccess().getVariableAssignment_5_3_1()); 
            // InternalPolycreate.g:1271:2: ( rule__Polycreate__VariableAssignment_5_3_1 )
            // InternalPolycreate.g:1271:3: rule__Polycreate__VariableAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Polycreate__VariableAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPolycreateAccess().getVariableAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polycreate__Group_5_3__1__Impl"


    // $ANTLR start "rule__Variable_Impl__Group__0"
    // InternalPolycreate.g:1280:1: rule__Variable_Impl__Group__0 : rule__Variable_Impl__Group__0__Impl rule__Variable_Impl__Group__1 ;
    public final void rule__Variable_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1284:1: ( rule__Variable_Impl__Group__0__Impl rule__Variable_Impl__Group__1 )
            // InternalPolycreate.g:1285:2: rule__Variable_Impl__Group__0__Impl rule__Variable_Impl__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Variable_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_Impl__Group__0"


    // $ANTLR start "rule__Variable_Impl__Group__0__Impl"
    // InternalPolycreate.g:1292:1: rule__Variable_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Variable_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1296:1: ( ( () ) )
            // InternalPolycreate.g:1297:1: ( () )
            {
            // InternalPolycreate.g:1297:1: ( () )
            // InternalPolycreate.g:1298:2: ()
            {
             before(grammarAccess.getVariable_ImplAccess().getVariableAction_0()); 
            // InternalPolycreate.g:1299:2: ()
            // InternalPolycreate.g:1299:3: 
            {
            }

             after(grammarAccess.getVariable_ImplAccess().getVariableAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_Impl__Group__0__Impl"


    // $ANTLR start "rule__Variable_Impl__Group__1"
    // InternalPolycreate.g:1307:1: rule__Variable_Impl__Group__1 : rule__Variable_Impl__Group__1__Impl rule__Variable_Impl__Group__2 ;
    public final void rule__Variable_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1311:1: ( rule__Variable_Impl__Group__1__Impl rule__Variable_Impl__Group__2 )
            // InternalPolycreate.g:1312:2: rule__Variable_Impl__Group__1__Impl rule__Variable_Impl__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Variable_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_Impl__Group__1"


    // $ANTLR start "rule__Variable_Impl__Group__1__Impl"
    // InternalPolycreate.g:1319:1: rule__Variable_Impl__Group__1__Impl : ( 'Variable' ) ;
    public final void rule__Variable_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1323:1: ( ( 'Variable' ) )
            // InternalPolycreate.g:1324:1: ( 'Variable' )
            {
            // InternalPolycreate.g:1324:1: ( 'Variable' )
            // InternalPolycreate.g:1325:2: 'Variable'
            {
             before(grammarAccess.getVariable_ImplAccess().getVariableKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getVariable_ImplAccess().getVariableKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_Impl__Group__1__Impl"


    // $ANTLR start "rule__Variable_Impl__Group__2"
    // InternalPolycreate.g:1334:1: rule__Variable_Impl__Group__2 : rule__Variable_Impl__Group__2__Impl rule__Variable_Impl__Group__3 ;
    public final void rule__Variable_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1338:1: ( rule__Variable_Impl__Group__2__Impl rule__Variable_Impl__Group__3 )
            // InternalPolycreate.g:1339:2: rule__Variable_Impl__Group__2__Impl rule__Variable_Impl__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Variable_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable_Impl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_Impl__Group__2"


    // $ANTLR start "rule__Variable_Impl__Group__2__Impl"
    // InternalPolycreate.g:1346:1: rule__Variable_Impl__Group__2__Impl : ( ( rule__Variable_Impl__NameAssignment_2 ) ) ;
    public final void rule__Variable_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1350:1: ( ( ( rule__Variable_Impl__NameAssignment_2 ) ) )
            // InternalPolycreate.g:1351:1: ( ( rule__Variable_Impl__NameAssignment_2 ) )
            {
            // InternalPolycreate.g:1351:1: ( ( rule__Variable_Impl__NameAssignment_2 ) )
            // InternalPolycreate.g:1352:2: ( rule__Variable_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getVariable_ImplAccess().getNameAssignment_2()); 
            // InternalPolycreate.g:1353:2: ( rule__Variable_Impl__NameAssignment_2 )
            // InternalPolycreate.g:1353:3: rule__Variable_Impl__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Variable_Impl__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVariable_ImplAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_Impl__Group__2__Impl"


    // $ANTLR start "rule__Variable_Impl__Group__3"
    // InternalPolycreate.g:1361:1: rule__Variable_Impl__Group__3 : rule__Variable_Impl__Group__3__Impl rule__Variable_Impl__Group__4 ;
    public final void rule__Variable_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1365:1: ( rule__Variable_Impl__Group__3__Impl rule__Variable_Impl__Group__4 )
            // InternalPolycreate.g:1366:2: rule__Variable_Impl__Group__3__Impl rule__Variable_Impl__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Variable_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable_Impl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_Impl__Group__3"


    // $ANTLR start "rule__Variable_Impl__Group__3__Impl"
    // InternalPolycreate.g:1373:1: rule__Variable_Impl__Group__3__Impl : ( '{' ) ;
    public final void rule__Variable_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1377:1: ( ( '{' ) )
            // InternalPolycreate.g:1378:1: ( '{' )
            {
            // InternalPolycreate.g:1378:1: ( '{' )
            // InternalPolycreate.g:1379:2: '{'
            {
             before(grammarAccess.getVariable_ImplAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getVariable_ImplAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_Impl__Group__3__Impl"


    // $ANTLR start "rule__Variable_Impl__Group__4"
    // InternalPolycreate.g:1388:1: rule__Variable_Impl__Group__4 : rule__Variable_Impl__Group__4__Impl rule__Variable_Impl__Group__5 ;
    public final void rule__Variable_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1392:1: ( rule__Variable_Impl__Group__4__Impl rule__Variable_Impl__Group__5 )
            // InternalPolycreate.g:1393:2: rule__Variable_Impl__Group__4__Impl rule__Variable_Impl__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Variable_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable_Impl__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_Impl__Group__4"


    // $ANTLR start "rule__Variable_Impl__Group__4__Impl"
    // InternalPolycreate.g:1400:1: rule__Variable_Impl__Group__4__Impl : ( ( rule__Variable_Impl__Group_4__0 )? ) ;
    public final void rule__Variable_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1404:1: ( ( ( rule__Variable_Impl__Group_4__0 )? ) )
            // InternalPolycreate.g:1405:1: ( ( rule__Variable_Impl__Group_4__0 )? )
            {
            // InternalPolycreate.g:1405:1: ( ( rule__Variable_Impl__Group_4__0 )? )
            // InternalPolycreate.g:1406:2: ( rule__Variable_Impl__Group_4__0 )?
            {
             before(grammarAccess.getVariable_ImplAccess().getGroup_4()); 
            // InternalPolycreate.g:1407:2: ( rule__Variable_Impl__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPolycreate.g:1407:3: rule__Variable_Impl__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variable_Impl__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariable_ImplAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_Impl__Group__4__Impl"


    // $ANTLR start "rule__Variable_Impl__Group__5"
    // InternalPolycreate.g:1415:1: rule__Variable_Impl__Group__5 : rule__Variable_Impl__Group__5__Impl rule__Variable_Impl__Group__6 ;
    public final void rule__Variable_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1419:1: ( rule__Variable_Impl__Group__5__Impl rule__Variable_Impl__Group__6 )
            // InternalPolycreate.g:1420:2: rule__Variable_Impl__Group__5__Impl rule__Variable_Impl__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Variable_Impl__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable_Impl__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_Impl__Group__5"


    // $ANTLR start "rule__Variable_Impl__Group__5__Impl"
    // InternalPolycreate.g:1427:1: rule__Variable_Impl__Group__5__Impl : ( ( rule__Variable_Impl__Group_5__0 )? ) ;
    public final void rule__Variable_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1431:1: ( ( ( rule__Variable_Impl__Group_5__0 )? ) )
            // InternalPolycreate.g:1432:1: ( ( rule__Variable_Impl__Group_5__0 )? )
            {
            // InternalPolycreate.g:1432:1: ( ( rule__Variable_Impl__Group_5__0 )? )
            // InternalPolycreate.g:1433:2: ( rule__Variable_Impl__Group_5__0 )?
            {
             before(grammarAccess.getVariable_ImplAccess().getGroup_5()); 
            // InternalPolycreate.g:1434:2: ( rule__Variable_Impl__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalPolycreate.g:1434:3: rule__Variable_Impl__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variable_Impl__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariable_ImplAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_Impl__Group__5__Impl"


    // $ANTLR start "rule__Variable_Impl__Group__6"
    // InternalPolycreate.g:1442:1: rule__Variable_Impl__Group__6 : rule__Variable_Impl__Group__6__Impl ;
    public final void rule__Variable_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1446:1: ( rule__Variable_Impl__Group__6__Impl )
            // InternalPolycreate.g:1447:2: rule__Variable_Impl__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable_Impl__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_Impl__Group__6"


    // $ANTLR start "rule__Variable_Impl__Group__6__Impl"
    // InternalPolycreate.g:1453:1: rule__Variable_Impl__Group__6__Impl : ( '}' ) ;
    public final void rule__Variable_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1457:1: ( ( '}' ) )
            // InternalPolycreate.g:1458:1: ( '}' )
            {
            // InternalPolycreate.g:1458:1: ( '}' )
            // InternalPolycreate.g:1459:2: '}'
            {
             before(grammarAccess.getVariable_ImplAccess().getRightCurlyBracketKeyword_6()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getVariable_ImplAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_Impl__Group__6__Impl"


    // $ANTLR start "rule__Variable_Impl__Group_4__0"
    // InternalPolycreate.g:1469:1: rule__Variable_Impl__Group_4__0 : rule__Variable_Impl__Group_4__0__Impl rule__Variable_Impl__Group_4__1 ;
    public final void rule__Variable_Impl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1473:1: ( rule__Variable_Impl__Group_4__0__Impl rule__Variable_Impl__Group_4__1 )
            // InternalPolycreate.g:1474:2: rule__Variable_Impl__Group_4__0__Impl rule__Variable_Impl__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__Variable_Impl__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable_Impl__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_Impl__Group_4__0"


    // $ANTLR start "rule__Variable_Impl__Group_4__0__Impl"
    // InternalPolycreate.g:1481:1: rule__Variable_Impl__Group_4__0__Impl : ( 'type' ) ;
    public final void rule__Variable_Impl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1485:1: ( ( 'type' ) )
            // InternalPolycreate.g:1486:1: ( 'type' )
            {
            // InternalPolycreate.g:1486:1: ( 'type' )
            // InternalPolycreate.g:1487:2: 'type'
            {
             before(grammarAccess.getVariable_ImplAccess().getTypeKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getVariable_ImplAccess().getTypeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_Impl__Group_4__0__Impl"


    // $ANTLR start "rule__Variable_Impl__Group_4__1"
    // InternalPolycreate.g:1496:1: rule__Variable_Impl__Group_4__1 : rule__Variable_Impl__Group_4__1__Impl ;
    public final void rule__Variable_Impl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1500:1: ( rule__Variable_Impl__Group_4__1__Impl )
            // InternalPolycreate.g:1501:2: rule__Variable_Impl__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable_Impl__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_Impl__Group_4__1"


    // $ANTLR start "rule__Variable_Impl__Group_4__1__Impl"
    // InternalPolycreate.g:1507:1: rule__Variable_Impl__Group_4__1__Impl : ( ( rule__Variable_Impl__TypeAssignment_4_1 ) ) ;
    public final void rule__Variable_Impl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1511:1: ( ( ( rule__Variable_Impl__TypeAssignment_4_1 ) ) )
            // InternalPolycreate.g:1512:1: ( ( rule__Variable_Impl__TypeAssignment_4_1 ) )
            {
            // InternalPolycreate.g:1512:1: ( ( rule__Variable_Impl__TypeAssignment_4_1 ) )
            // InternalPolycreate.g:1513:2: ( rule__Variable_Impl__TypeAssignment_4_1 )
            {
             before(grammarAccess.getVariable_ImplAccess().getTypeAssignment_4_1()); 
            // InternalPolycreate.g:1514:2: ( rule__Variable_Impl__TypeAssignment_4_1 )
            // InternalPolycreate.g:1514:3: rule__Variable_Impl__TypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable_Impl__TypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getVariable_ImplAccess().getTypeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_Impl__Group_4__1__Impl"


    // $ANTLR start "rule__Variable_Impl__Group_5__0"
    // InternalPolycreate.g:1523:1: rule__Variable_Impl__Group_5__0 : rule__Variable_Impl__Group_5__0__Impl rule__Variable_Impl__Group_5__1 ;
    public final void rule__Variable_Impl__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1527:1: ( rule__Variable_Impl__Group_5__0__Impl rule__Variable_Impl__Group_5__1 )
            // InternalPolycreate.g:1528:2: rule__Variable_Impl__Group_5__0__Impl rule__Variable_Impl__Group_5__1
            {
            pushFollow(FOLLOW_14);
            rule__Variable_Impl__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable_Impl__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_Impl__Group_5__0"


    // $ANTLR start "rule__Variable_Impl__Group_5__0__Impl"
    // InternalPolycreate.g:1535:1: rule__Variable_Impl__Group_5__0__Impl : ( 'initialValue' ) ;
    public final void rule__Variable_Impl__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1539:1: ( ( 'initialValue' ) )
            // InternalPolycreate.g:1540:1: ( 'initialValue' )
            {
            // InternalPolycreate.g:1540:1: ( 'initialValue' )
            // InternalPolycreate.g:1541:2: 'initialValue'
            {
             before(grammarAccess.getVariable_ImplAccess().getInitialValueKeyword_5_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getVariable_ImplAccess().getInitialValueKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_Impl__Group_5__0__Impl"


    // $ANTLR start "rule__Variable_Impl__Group_5__1"
    // InternalPolycreate.g:1550:1: rule__Variable_Impl__Group_5__1 : rule__Variable_Impl__Group_5__1__Impl ;
    public final void rule__Variable_Impl__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1554:1: ( rule__Variable_Impl__Group_5__1__Impl )
            // InternalPolycreate.g:1555:2: rule__Variable_Impl__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable_Impl__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_Impl__Group_5__1"


    // $ANTLR start "rule__Variable_Impl__Group_5__1__Impl"
    // InternalPolycreate.g:1561:1: rule__Variable_Impl__Group_5__1__Impl : ( ( rule__Variable_Impl__InitialValueAssignment_5_1 ) ) ;
    public final void rule__Variable_Impl__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1565:1: ( ( ( rule__Variable_Impl__InitialValueAssignment_5_1 ) ) )
            // InternalPolycreate.g:1566:1: ( ( rule__Variable_Impl__InitialValueAssignment_5_1 ) )
            {
            // InternalPolycreate.g:1566:1: ( ( rule__Variable_Impl__InitialValueAssignment_5_1 ) )
            // InternalPolycreate.g:1567:2: ( rule__Variable_Impl__InitialValueAssignment_5_1 )
            {
             before(grammarAccess.getVariable_ImplAccess().getInitialValueAssignment_5_1()); 
            // InternalPolycreate.g:1568:2: ( rule__Variable_Impl__InitialValueAssignment_5_1 )
            // InternalPolycreate.g:1568:3: rule__Variable_Impl__InitialValueAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable_Impl__InitialValueAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getVariable_ImplAccess().getInitialValueAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_Impl__Group_5__1__Impl"


    // $ANTLR start "rule__GoForward__Group__0"
    // InternalPolycreate.g:1577:1: rule__GoForward__Group__0 : rule__GoForward__Group__0__Impl rule__GoForward__Group__1 ;
    public final void rule__GoForward__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1581:1: ( rule__GoForward__Group__0__Impl rule__GoForward__Group__1 )
            // InternalPolycreate.g:1582:2: rule__GoForward__Group__0__Impl rule__GoForward__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__GoForward__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoForward__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoForward__Group__0"


    // $ANTLR start "rule__GoForward__Group__0__Impl"
    // InternalPolycreate.g:1589:1: rule__GoForward__Group__0__Impl : ( () ) ;
    public final void rule__GoForward__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1593:1: ( ( () ) )
            // InternalPolycreate.g:1594:1: ( () )
            {
            // InternalPolycreate.g:1594:1: ( () )
            // InternalPolycreate.g:1595:2: ()
            {
             before(grammarAccess.getGoForwardAccess().getGoForwardAction_0()); 
            // InternalPolycreate.g:1596:2: ()
            // InternalPolycreate.g:1596:3: 
            {
            }

             after(grammarAccess.getGoForwardAccess().getGoForwardAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoForward__Group__0__Impl"


    // $ANTLR start "rule__GoForward__Group__1"
    // InternalPolycreate.g:1604:1: rule__GoForward__Group__1 : rule__GoForward__Group__1__Impl ;
    public final void rule__GoForward__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1608:1: ( rule__GoForward__Group__1__Impl )
            // InternalPolycreate.g:1609:2: rule__GoForward__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GoForward__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoForward__Group__1"


    // $ANTLR start "rule__GoForward__Group__1__Impl"
    // InternalPolycreate.g:1615:1: rule__GoForward__Group__1__Impl : ( 'GoForward' ) ;
    public final void rule__GoForward__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1619:1: ( ( 'GoForward' ) )
            // InternalPolycreate.g:1620:1: ( 'GoForward' )
            {
            // InternalPolycreate.g:1620:1: ( 'GoForward' )
            // InternalPolycreate.g:1621:2: 'GoForward'
            {
             before(grammarAccess.getGoForwardAccess().getGoForwardKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getGoForwardAccess().getGoForwardKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoForward__Group__1__Impl"


    // $ANTLR start "rule__GoBackward__Group__0"
    // InternalPolycreate.g:1631:1: rule__GoBackward__Group__0 : rule__GoBackward__Group__0__Impl rule__GoBackward__Group__1 ;
    public final void rule__GoBackward__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1635:1: ( rule__GoBackward__Group__0__Impl rule__GoBackward__Group__1 )
            // InternalPolycreate.g:1636:2: rule__GoBackward__Group__0__Impl rule__GoBackward__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__GoBackward__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoBackward__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoBackward__Group__0"


    // $ANTLR start "rule__GoBackward__Group__0__Impl"
    // InternalPolycreate.g:1643:1: rule__GoBackward__Group__0__Impl : ( () ) ;
    public final void rule__GoBackward__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1647:1: ( ( () ) )
            // InternalPolycreate.g:1648:1: ( () )
            {
            // InternalPolycreate.g:1648:1: ( () )
            // InternalPolycreate.g:1649:2: ()
            {
             before(grammarAccess.getGoBackwardAccess().getGoBackwardAction_0()); 
            // InternalPolycreate.g:1650:2: ()
            // InternalPolycreate.g:1650:3: 
            {
            }

             after(grammarAccess.getGoBackwardAccess().getGoBackwardAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoBackward__Group__0__Impl"


    // $ANTLR start "rule__GoBackward__Group__1"
    // InternalPolycreate.g:1658:1: rule__GoBackward__Group__1 : rule__GoBackward__Group__1__Impl ;
    public final void rule__GoBackward__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1662:1: ( rule__GoBackward__Group__1__Impl )
            // InternalPolycreate.g:1663:2: rule__GoBackward__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GoBackward__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoBackward__Group__1"


    // $ANTLR start "rule__GoBackward__Group__1__Impl"
    // InternalPolycreate.g:1669:1: rule__GoBackward__Group__1__Impl : ( 'GoBackward' ) ;
    public final void rule__GoBackward__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1673:1: ( ( 'GoBackward' ) )
            // InternalPolycreate.g:1674:1: ( 'GoBackward' )
            {
            // InternalPolycreate.g:1674:1: ( 'GoBackward' )
            // InternalPolycreate.g:1675:2: 'GoBackward'
            {
             before(grammarAccess.getGoBackwardAccess().getGoBackwardKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getGoBackwardAccess().getGoBackwardKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoBackward__Group__1__Impl"


    // $ANTLR start "rule__OpenGripper__Group__0"
    // InternalPolycreate.g:1685:1: rule__OpenGripper__Group__0 : rule__OpenGripper__Group__0__Impl rule__OpenGripper__Group__1 ;
    public final void rule__OpenGripper__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1689:1: ( rule__OpenGripper__Group__0__Impl rule__OpenGripper__Group__1 )
            // InternalPolycreate.g:1690:2: rule__OpenGripper__Group__0__Impl rule__OpenGripper__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__OpenGripper__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpenGripper__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenGripper__Group__0"


    // $ANTLR start "rule__OpenGripper__Group__0__Impl"
    // InternalPolycreate.g:1697:1: rule__OpenGripper__Group__0__Impl : ( () ) ;
    public final void rule__OpenGripper__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1701:1: ( ( () ) )
            // InternalPolycreate.g:1702:1: ( () )
            {
            // InternalPolycreate.g:1702:1: ( () )
            // InternalPolycreate.g:1703:2: ()
            {
             before(grammarAccess.getOpenGripperAccess().getOpenGripperAction_0()); 
            // InternalPolycreate.g:1704:2: ()
            // InternalPolycreate.g:1704:3: 
            {
            }

             after(grammarAccess.getOpenGripperAccess().getOpenGripperAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenGripper__Group__0__Impl"


    // $ANTLR start "rule__OpenGripper__Group__1"
    // InternalPolycreate.g:1712:1: rule__OpenGripper__Group__1 : rule__OpenGripper__Group__1__Impl ;
    public final void rule__OpenGripper__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1716:1: ( rule__OpenGripper__Group__1__Impl )
            // InternalPolycreate.g:1717:2: rule__OpenGripper__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpenGripper__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenGripper__Group__1"


    // $ANTLR start "rule__OpenGripper__Group__1__Impl"
    // InternalPolycreate.g:1723:1: rule__OpenGripper__Group__1__Impl : ( 'OpenGripper' ) ;
    public final void rule__OpenGripper__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1727:1: ( ( 'OpenGripper' ) )
            // InternalPolycreate.g:1728:1: ( 'OpenGripper' )
            {
            // InternalPolycreate.g:1728:1: ( 'OpenGripper' )
            // InternalPolycreate.g:1729:2: 'OpenGripper'
            {
             before(grammarAccess.getOpenGripperAccess().getOpenGripperKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getOpenGripperAccess().getOpenGripperKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenGripper__Group__1__Impl"


    // $ANTLR start "rule__CloseGripper__Group__0"
    // InternalPolycreate.g:1739:1: rule__CloseGripper__Group__0 : rule__CloseGripper__Group__0__Impl rule__CloseGripper__Group__1 ;
    public final void rule__CloseGripper__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1743:1: ( rule__CloseGripper__Group__0__Impl rule__CloseGripper__Group__1 )
            // InternalPolycreate.g:1744:2: rule__CloseGripper__Group__0__Impl rule__CloseGripper__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__CloseGripper__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CloseGripper__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CloseGripper__Group__0"


    // $ANTLR start "rule__CloseGripper__Group__0__Impl"
    // InternalPolycreate.g:1751:1: rule__CloseGripper__Group__0__Impl : ( () ) ;
    public final void rule__CloseGripper__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1755:1: ( ( () ) )
            // InternalPolycreate.g:1756:1: ( () )
            {
            // InternalPolycreate.g:1756:1: ( () )
            // InternalPolycreate.g:1757:2: ()
            {
             before(grammarAccess.getCloseGripperAccess().getCloseGripperAction_0()); 
            // InternalPolycreate.g:1758:2: ()
            // InternalPolycreate.g:1758:3: 
            {
            }

             after(grammarAccess.getCloseGripperAccess().getCloseGripperAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CloseGripper__Group__0__Impl"


    // $ANTLR start "rule__CloseGripper__Group__1"
    // InternalPolycreate.g:1766:1: rule__CloseGripper__Group__1 : rule__CloseGripper__Group__1__Impl ;
    public final void rule__CloseGripper__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1770:1: ( rule__CloseGripper__Group__1__Impl )
            // InternalPolycreate.g:1771:2: rule__CloseGripper__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CloseGripper__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CloseGripper__Group__1"


    // $ANTLR start "rule__CloseGripper__Group__1__Impl"
    // InternalPolycreate.g:1777:1: rule__CloseGripper__Group__1__Impl : ( 'CloseGripper' ) ;
    public final void rule__CloseGripper__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1781:1: ( ( 'CloseGripper' ) )
            // InternalPolycreate.g:1782:1: ( 'CloseGripper' )
            {
            // InternalPolycreate.g:1782:1: ( 'CloseGripper' )
            // InternalPolycreate.g:1783:2: 'CloseGripper'
            {
             before(grammarAccess.getCloseGripperAccess().getCloseGripperKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCloseGripperAccess().getCloseGripperKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CloseGripper__Group__1__Impl"


    // $ANTLR start "rule__Turn__Group__0"
    // InternalPolycreate.g:1793:1: rule__Turn__Group__0 : rule__Turn__Group__0__Impl rule__Turn__Group__1 ;
    public final void rule__Turn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1797:1: ( rule__Turn__Group__0__Impl rule__Turn__Group__1 )
            // InternalPolycreate.g:1798:2: rule__Turn__Group__0__Impl rule__Turn__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Turn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Turn__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Turn__Group__0"


    // $ANTLR start "rule__Turn__Group__0__Impl"
    // InternalPolycreate.g:1805:1: rule__Turn__Group__0__Impl : ( () ) ;
    public final void rule__Turn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1809:1: ( ( () ) )
            // InternalPolycreate.g:1810:1: ( () )
            {
            // InternalPolycreate.g:1810:1: ( () )
            // InternalPolycreate.g:1811:2: ()
            {
             before(grammarAccess.getTurnAccess().getTurnAction_0()); 
            // InternalPolycreate.g:1812:2: ()
            // InternalPolycreate.g:1812:3: 
            {
            }

             after(grammarAccess.getTurnAccess().getTurnAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Turn__Group__0__Impl"


    // $ANTLR start "rule__Turn__Group__1"
    // InternalPolycreate.g:1820:1: rule__Turn__Group__1 : rule__Turn__Group__1__Impl ;
    public final void rule__Turn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1824:1: ( rule__Turn__Group__1__Impl )
            // InternalPolycreate.g:1825:2: rule__Turn__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Turn__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Turn__Group__1"


    // $ANTLR start "rule__Turn__Group__1__Impl"
    // InternalPolycreate.g:1831:1: rule__Turn__Group__1__Impl : ( 'Turn' ) ;
    public final void rule__Turn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1835:1: ( ( 'Turn' ) )
            // InternalPolycreate.g:1836:1: ( 'Turn' )
            {
            // InternalPolycreate.g:1836:1: ( 'Turn' )
            // InternalPolycreate.g:1837:2: 'Turn'
            {
             before(grammarAccess.getTurnAccess().getTurnKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTurnAccess().getTurnKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Turn__Group__1__Impl"


    // $ANTLR start "rule__Stop__Group__0"
    // InternalPolycreate.g:1847:1: rule__Stop__Group__0 : rule__Stop__Group__0__Impl rule__Stop__Group__1 ;
    public final void rule__Stop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1851:1: ( rule__Stop__Group__0__Impl rule__Stop__Group__1 )
            // InternalPolycreate.g:1852:2: rule__Stop__Group__0__Impl rule__Stop__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Stop__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stop__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stop__Group__0"


    // $ANTLR start "rule__Stop__Group__0__Impl"
    // InternalPolycreate.g:1859:1: rule__Stop__Group__0__Impl : ( () ) ;
    public final void rule__Stop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1863:1: ( ( () ) )
            // InternalPolycreate.g:1864:1: ( () )
            {
            // InternalPolycreate.g:1864:1: ( () )
            // InternalPolycreate.g:1865:2: ()
            {
             before(grammarAccess.getStopAccess().getStopAction_0()); 
            // InternalPolycreate.g:1866:2: ()
            // InternalPolycreate.g:1866:3: 
            {
            }

             after(grammarAccess.getStopAccess().getStopAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stop__Group__0__Impl"


    // $ANTLR start "rule__Stop__Group__1"
    // InternalPolycreate.g:1874:1: rule__Stop__Group__1 : rule__Stop__Group__1__Impl ;
    public final void rule__Stop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1878:1: ( rule__Stop__Group__1__Impl )
            // InternalPolycreate.g:1879:2: rule__Stop__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Stop__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stop__Group__1"


    // $ANTLR start "rule__Stop__Group__1__Impl"
    // InternalPolycreate.g:1885:1: rule__Stop__Group__1__Impl : ( 'Stop' ) ;
    public final void rule__Stop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1889:1: ( ( 'Stop' ) )
            // InternalPolycreate.g:1890:1: ( 'Stop' )
            {
            // InternalPolycreate.g:1890:1: ( 'Stop' )
            // InternalPolycreate.g:1891:2: 'Stop'
            {
             before(grammarAccess.getStopAccess().getStopKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getStopAccess().getStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stop__Group__1__Impl"


    // $ANTLR start "rule__StructuralCondition__Group__0"
    // InternalPolycreate.g:1901:1: rule__StructuralCondition__Group__0 : rule__StructuralCondition__Group__0__Impl rule__StructuralCondition__Group__1 ;
    public final void rule__StructuralCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1905:1: ( rule__StructuralCondition__Group__0__Impl rule__StructuralCondition__Group__1 )
            // InternalPolycreate.g:1906:2: rule__StructuralCondition__Group__0__Impl rule__StructuralCondition__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__StructuralCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructuralCondition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__Group__0"


    // $ANTLR start "rule__StructuralCondition__Group__0__Impl"
    // InternalPolycreate.g:1913:1: rule__StructuralCondition__Group__0__Impl : ( 'StructuralCondition' ) ;
    public final void rule__StructuralCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1917:1: ( ( 'StructuralCondition' ) )
            // InternalPolycreate.g:1918:1: ( 'StructuralCondition' )
            {
            // InternalPolycreate.g:1918:1: ( 'StructuralCondition' )
            // InternalPolycreate.g:1919:2: 'StructuralCondition'
            {
             before(grammarAccess.getStructuralConditionAccess().getStructuralConditionKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getStructuralConditionAccess().getStructuralConditionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__Group__0__Impl"


    // $ANTLR start "rule__StructuralCondition__Group__1"
    // InternalPolycreate.g:1928:1: rule__StructuralCondition__Group__1 : rule__StructuralCondition__Group__1__Impl rule__StructuralCondition__Group__2 ;
    public final void rule__StructuralCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1932:1: ( rule__StructuralCondition__Group__1__Impl rule__StructuralCondition__Group__2 )
            // InternalPolycreate.g:1933:2: rule__StructuralCondition__Group__1__Impl rule__StructuralCondition__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__StructuralCondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructuralCondition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__Group__1"


    // $ANTLR start "rule__StructuralCondition__Group__1__Impl"
    // InternalPolycreate.g:1940:1: rule__StructuralCondition__Group__1__Impl : ( '{' ) ;
    public final void rule__StructuralCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1944:1: ( ( '{' ) )
            // InternalPolycreate.g:1945:1: ( '{' )
            {
            // InternalPolycreate.g:1945:1: ( '{' )
            // InternalPolycreate.g:1946:2: '{'
            {
             before(grammarAccess.getStructuralConditionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getStructuralConditionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__Group__1__Impl"


    // $ANTLR start "rule__StructuralCondition__Group__2"
    // InternalPolycreate.g:1955:1: rule__StructuralCondition__Group__2 : rule__StructuralCondition__Group__2__Impl rule__StructuralCondition__Group__3 ;
    public final void rule__StructuralCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1959:1: ( rule__StructuralCondition__Group__2__Impl rule__StructuralCondition__Group__3 )
            // InternalPolycreate.g:1960:2: rule__StructuralCondition__Group__2__Impl rule__StructuralCondition__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__StructuralCondition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructuralCondition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__Group__2"


    // $ANTLR start "rule__StructuralCondition__Group__2__Impl"
    // InternalPolycreate.g:1967:1: rule__StructuralCondition__Group__2__Impl : ( ( rule__StructuralCondition__Group_2__0 )? ) ;
    public final void rule__StructuralCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1971:1: ( ( ( rule__StructuralCondition__Group_2__0 )? ) )
            // InternalPolycreate.g:1972:1: ( ( rule__StructuralCondition__Group_2__0 )? )
            {
            // InternalPolycreate.g:1972:1: ( ( rule__StructuralCondition__Group_2__0 )? )
            // InternalPolycreate.g:1973:2: ( rule__StructuralCondition__Group_2__0 )?
            {
             before(grammarAccess.getStructuralConditionAccess().getGroup_2()); 
            // InternalPolycreate.g:1974:2: ( rule__StructuralCondition__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==41) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalPolycreate.g:1974:3: rule__StructuralCondition__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StructuralCondition__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStructuralConditionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__Group__2__Impl"


    // $ANTLR start "rule__StructuralCondition__Group__3"
    // InternalPolycreate.g:1982:1: rule__StructuralCondition__Group__3 : rule__StructuralCondition__Group__3__Impl rule__StructuralCondition__Group__4 ;
    public final void rule__StructuralCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1986:1: ( rule__StructuralCondition__Group__3__Impl rule__StructuralCondition__Group__4 )
            // InternalPolycreate.g:1987:2: rule__StructuralCondition__Group__3__Impl rule__StructuralCondition__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__StructuralCondition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructuralCondition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__Group__3"


    // $ANTLR start "rule__StructuralCondition__Group__3__Impl"
    // InternalPolycreate.g:1994:1: rule__StructuralCondition__Group__3__Impl : ( ( rule__StructuralCondition__Group_3__0 )? ) ;
    public final void rule__StructuralCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1998:1: ( ( ( rule__StructuralCondition__Group_3__0 )? ) )
            // InternalPolycreate.g:1999:1: ( ( rule__StructuralCondition__Group_3__0 )? )
            {
            // InternalPolycreate.g:1999:1: ( ( rule__StructuralCondition__Group_3__0 )? )
            // InternalPolycreate.g:2000:2: ( rule__StructuralCondition__Group_3__0 )?
            {
             before(grammarAccess.getStructuralConditionAccess().getGroup_3()); 
            // InternalPolycreate.g:2001:2: ( rule__StructuralCondition__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==42) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalPolycreate.g:2001:3: rule__StructuralCondition__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StructuralCondition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStructuralConditionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__Group__3__Impl"


    // $ANTLR start "rule__StructuralCondition__Group__4"
    // InternalPolycreate.g:2009:1: rule__StructuralCondition__Group__4 : rule__StructuralCondition__Group__4__Impl rule__StructuralCondition__Group__5 ;
    public final void rule__StructuralCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2013:1: ( rule__StructuralCondition__Group__4__Impl rule__StructuralCondition__Group__5 )
            // InternalPolycreate.g:2014:2: rule__StructuralCondition__Group__4__Impl rule__StructuralCondition__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__StructuralCondition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructuralCondition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__Group__4"


    // $ANTLR start "rule__StructuralCondition__Group__4__Impl"
    // InternalPolycreate.g:2021:1: rule__StructuralCondition__Group__4__Impl : ( 'if' ) ;
    public final void rule__StructuralCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2025:1: ( ( 'if' ) )
            // InternalPolycreate.g:2026:1: ( 'if' )
            {
            // InternalPolycreate.g:2026:1: ( 'if' )
            // InternalPolycreate.g:2027:2: 'if'
            {
             before(grammarAccess.getStructuralConditionAccess().getIfKeyword_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getStructuralConditionAccess().getIfKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__Group__4__Impl"


    // $ANTLR start "rule__StructuralCondition__Group__5"
    // InternalPolycreate.g:2036:1: rule__StructuralCondition__Group__5 : rule__StructuralCondition__Group__5__Impl rule__StructuralCondition__Group__6 ;
    public final void rule__StructuralCondition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2040:1: ( rule__StructuralCondition__Group__5__Impl rule__StructuralCondition__Group__6 )
            // InternalPolycreate.g:2041:2: rule__StructuralCondition__Group__5__Impl rule__StructuralCondition__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__StructuralCondition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructuralCondition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__Group__5"


    // $ANTLR start "rule__StructuralCondition__Group__5__Impl"
    // InternalPolycreate.g:2048:1: rule__StructuralCondition__Group__5__Impl : ( '(' ) ;
    public final void rule__StructuralCondition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2052:1: ( ( '(' ) )
            // InternalPolycreate.g:2053:1: ( '(' )
            {
            // InternalPolycreate.g:2053:1: ( '(' )
            // InternalPolycreate.g:2054:2: '('
            {
             before(grammarAccess.getStructuralConditionAccess().getLeftParenthesisKeyword_5()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getStructuralConditionAccess().getLeftParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__Group__5__Impl"


    // $ANTLR start "rule__StructuralCondition__Group__6"
    // InternalPolycreate.g:2063:1: rule__StructuralCondition__Group__6 : rule__StructuralCondition__Group__6__Impl rule__StructuralCondition__Group__7 ;
    public final void rule__StructuralCondition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2067:1: ( rule__StructuralCondition__Group__6__Impl rule__StructuralCondition__Group__7 )
            // InternalPolycreate.g:2068:2: rule__StructuralCondition__Group__6__Impl rule__StructuralCondition__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__StructuralCondition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructuralCondition__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__Group__6"


    // $ANTLR start "rule__StructuralCondition__Group__6__Impl"
    // InternalPolycreate.g:2075:1: rule__StructuralCondition__Group__6__Impl : ( ( rule__StructuralCondition__IfAssignment_6 ) ) ;
    public final void rule__StructuralCondition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2079:1: ( ( ( rule__StructuralCondition__IfAssignment_6 ) ) )
            // InternalPolycreate.g:2080:1: ( ( rule__StructuralCondition__IfAssignment_6 ) )
            {
            // InternalPolycreate.g:2080:1: ( ( rule__StructuralCondition__IfAssignment_6 ) )
            // InternalPolycreate.g:2081:2: ( rule__StructuralCondition__IfAssignment_6 )
            {
             before(grammarAccess.getStructuralConditionAccess().getIfAssignment_6()); 
            // InternalPolycreate.g:2082:2: ( rule__StructuralCondition__IfAssignment_6 )
            // InternalPolycreate.g:2082:3: rule__StructuralCondition__IfAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__StructuralCondition__IfAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getStructuralConditionAccess().getIfAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__Group__6__Impl"


    // $ANTLR start "rule__StructuralCondition__Group__7"
    // InternalPolycreate.g:2090:1: rule__StructuralCondition__Group__7 : rule__StructuralCondition__Group__7__Impl rule__StructuralCondition__Group__8 ;
    public final void rule__StructuralCondition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2094:1: ( rule__StructuralCondition__Group__7__Impl rule__StructuralCondition__Group__8 )
            // InternalPolycreate.g:2095:2: rule__StructuralCondition__Group__7__Impl rule__StructuralCondition__Group__8
            {
            pushFollow(FOLLOW_23);
            rule__StructuralCondition__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructuralCondition__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__Group__7"


    // $ANTLR start "rule__StructuralCondition__Group__7__Impl"
    // InternalPolycreate.g:2102:1: rule__StructuralCondition__Group__7__Impl : ( ( rule__StructuralCondition__Group_7__0 )* ) ;
    public final void rule__StructuralCondition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2106:1: ( ( ( rule__StructuralCondition__Group_7__0 )* ) )
            // InternalPolycreate.g:2107:1: ( ( rule__StructuralCondition__Group_7__0 )* )
            {
            // InternalPolycreate.g:2107:1: ( ( rule__StructuralCondition__Group_7__0 )* )
            // InternalPolycreate.g:2108:2: ( rule__StructuralCondition__Group_7__0 )*
            {
             before(grammarAccess.getStructuralConditionAccess().getGroup_7()); 
            // InternalPolycreate.g:2109:2: ( rule__StructuralCondition__Group_7__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==26) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalPolycreate.g:2109:3: rule__StructuralCondition__Group_7__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__StructuralCondition__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getStructuralConditionAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__Group__7__Impl"


    // $ANTLR start "rule__StructuralCondition__Group__8"
    // InternalPolycreate.g:2117:1: rule__StructuralCondition__Group__8 : rule__StructuralCondition__Group__8__Impl rule__StructuralCondition__Group__9 ;
    public final void rule__StructuralCondition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2121:1: ( rule__StructuralCondition__Group__8__Impl rule__StructuralCondition__Group__9 )
            // InternalPolycreate.g:2122:2: rule__StructuralCondition__Group__8__Impl rule__StructuralCondition__Group__9
            {
            pushFollow(FOLLOW_24);
            rule__StructuralCondition__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructuralCondition__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__Group__8"


    // $ANTLR start "rule__StructuralCondition__Group__8__Impl"
    // InternalPolycreate.g:2129:1: rule__StructuralCondition__Group__8__Impl : ( ')' ) ;
    public final void rule__StructuralCondition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2133:1: ( ( ')' ) )
            // InternalPolycreate.g:2134:1: ( ')' )
            {
            // InternalPolycreate.g:2134:1: ( ')' )
            // InternalPolycreate.g:2135:2: ')'
            {
             before(grammarAccess.getStructuralConditionAccess().getRightParenthesisKeyword_8()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getStructuralConditionAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__Group__8__Impl"


    // $ANTLR start "rule__StructuralCondition__Group__9"
    // InternalPolycreate.g:2144:1: rule__StructuralCondition__Group__9 : rule__StructuralCondition__Group__9__Impl ;
    public final void rule__StructuralCondition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2148:1: ( rule__StructuralCondition__Group__9__Impl )
            // InternalPolycreate.g:2149:2: rule__StructuralCondition__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StructuralCondition__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__Group__9"


    // $ANTLR start "rule__StructuralCondition__Group__9__Impl"
    // InternalPolycreate.g:2155:1: rule__StructuralCondition__Group__9__Impl : ( '}' ) ;
    public final void rule__StructuralCondition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2159:1: ( ( '}' ) )
            // InternalPolycreate.g:2160:1: ( '}' )
            {
            // InternalPolycreate.g:2160:1: ( '}' )
            // InternalPolycreate.g:2161:2: '}'
            {
             before(grammarAccess.getStructuralConditionAccess().getRightCurlyBracketKeyword_9()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getStructuralConditionAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__Group__9__Impl"


    // $ANTLR start "rule__StructuralCondition__Group_2__0"
    // InternalPolycreate.g:2171:1: rule__StructuralCondition__Group_2__0 : rule__StructuralCondition__Group_2__0__Impl rule__StructuralCondition__Group_2__1 ;
    public final void rule__StructuralCondition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2175:1: ( rule__StructuralCondition__Group_2__0__Impl rule__StructuralCondition__Group_2__1 )
            // InternalPolycreate.g:2176:2: rule__StructuralCondition__Group_2__0__Impl rule__StructuralCondition__Group_2__1
            {
            pushFollow(FOLLOW_22);
            rule__StructuralCondition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructuralCondition__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__Group_2__0"


    // $ANTLR start "rule__StructuralCondition__Group_2__0__Impl"
    // InternalPolycreate.g:2183:1: rule__StructuralCondition__Group_2__0__Impl : ( 'then' ) ;
    public final void rule__StructuralCondition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2187:1: ( ( 'then' ) )
            // InternalPolycreate.g:2188:1: ( 'then' )
            {
            // InternalPolycreate.g:2188:1: ( 'then' )
            // InternalPolycreate.g:2189:2: 'then'
            {
             before(grammarAccess.getStructuralConditionAccess().getThenKeyword_2_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getStructuralConditionAccess().getThenKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__Group_2__0__Impl"


    // $ANTLR start "rule__StructuralCondition__Group_2__1"
    // InternalPolycreate.g:2198:1: rule__StructuralCondition__Group_2__1 : rule__StructuralCondition__Group_2__1__Impl rule__StructuralCondition__Group_2__2 ;
    public final void rule__StructuralCondition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2202:1: ( rule__StructuralCondition__Group_2__1__Impl rule__StructuralCondition__Group_2__2 )
            // InternalPolycreate.g:2203:2: rule__StructuralCondition__Group_2__1__Impl rule__StructuralCondition__Group_2__2
            {
            pushFollow(FOLLOW_4);
            rule__StructuralCondition__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructuralCondition__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__Group_2__1"


    // $ANTLR start "rule__StructuralCondition__Group_2__1__Impl"
    // InternalPolycreate.g:2210:1: rule__StructuralCondition__Group_2__1__Impl : ( '(' ) ;
    public final void rule__StructuralCondition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2214:1: ( ( '(' ) )
            // InternalPolycreate.g:2215:1: ( '(' )
            {
            // InternalPolycreate.g:2215:1: ( '(' )
            // InternalPolycreate.g:2216:2: '('
            {
             before(grammarAccess.getStructuralConditionAccess().getLeftParenthesisKeyword_2_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getStructuralConditionAccess().getLeftParenthesisKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__Group_2__1__Impl"


    // $ANTLR start "rule__StructuralCondition__Group_2__2"
    // InternalPolycreate.g:2225:1: rule__StructuralCondition__Group_2__2 : rule__StructuralCondition__Group_2__2__Impl rule__StructuralCondition__Group_2__3 ;
    public final void rule__StructuralCondition__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2229:1: ( rule__StructuralCondition__Group_2__2__Impl rule__StructuralCondition__Group_2__3 )
            // InternalPolycreate.g:2230:2: rule__StructuralCondition__Group_2__2__Impl rule__StructuralCondition__Group_2__3
            {
            pushFollow(FOLLOW_23);
            rule__StructuralCondition__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructuralCondition__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__Group_2__2"


    // $ANTLR start "rule__StructuralCondition__Group_2__2__Impl"
    // InternalPolycreate.g:2237:1: rule__StructuralCondition__Group_2__2__Impl : ( ( rule__StructuralCondition__ThenAssignment_2_2 ) ) ;
    public final void rule__StructuralCondition__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2241:1: ( ( ( rule__StructuralCondition__ThenAssignment_2_2 ) ) )
            // InternalPolycreate.g:2242:1: ( ( rule__StructuralCondition__ThenAssignment_2_2 ) )
            {
            // InternalPolycreate.g:2242:1: ( ( rule__StructuralCondition__ThenAssignment_2_2 ) )
            // InternalPolycreate.g:2243:2: ( rule__StructuralCondition__ThenAssignment_2_2 )
            {
             before(grammarAccess.getStructuralConditionAccess().getThenAssignment_2_2()); 
            // InternalPolycreate.g:2244:2: ( rule__StructuralCondition__ThenAssignment_2_2 )
            // InternalPolycreate.g:2244:3: rule__StructuralCondition__ThenAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__StructuralCondition__ThenAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getStructuralConditionAccess().getThenAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__Group_2__2__Impl"


    // $ANTLR start "rule__StructuralCondition__Group_2__3"
    // InternalPolycreate.g:2252:1: rule__StructuralCondition__Group_2__3 : rule__StructuralCondition__Group_2__3__Impl rule__StructuralCondition__Group_2__4 ;
    public final void rule__StructuralCondition__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2256:1: ( rule__StructuralCondition__Group_2__3__Impl rule__StructuralCondition__Group_2__4 )
            // InternalPolycreate.g:2257:2: rule__StructuralCondition__Group_2__3__Impl rule__StructuralCondition__Group_2__4
            {
            pushFollow(FOLLOW_23);
            rule__StructuralCondition__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructuralCondition__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__Group_2__3"


    // $ANTLR start "rule__StructuralCondition__Group_2__3__Impl"
    // InternalPolycreate.g:2264:1: rule__StructuralCondition__Group_2__3__Impl : ( ( rule__StructuralCondition__Group_2_3__0 )* ) ;
    public final void rule__StructuralCondition__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2268:1: ( ( ( rule__StructuralCondition__Group_2_3__0 )* ) )
            // InternalPolycreate.g:2269:1: ( ( rule__StructuralCondition__Group_2_3__0 )* )
            {
            // InternalPolycreate.g:2269:1: ( ( rule__StructuralCondition__Group_2_3__0 )* )
            // InternalPolycreate.g:2270:2: ( rule__StructuralCondition__Group_2_3__0 )*
            {
             before(grammarAccess.getStructuralConditionAccess().getGroup_2_3()); 
            // InternalPolycreate.g:2271:2: ( rule__StructuralCondition__Group_2_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==26) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalPolycreate.g:2271:3: rule__StructuralCondition__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__StructuralCondition__Group_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getStructuralConditionAccess().getGroup_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__Group_2__3__Impl"


    // $ANTLR start "rule__StructuralCondition__Group_2__4"
    // InternalPolycreate.g:2279:1: rule__StructuralCondition__Group_2__4 : rule__StructuralCondition__Group_2__4__Impl ;
    public final void rule__StructuralCondition__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2283:1: ( rule__StructuralCondition__Group_2__4__Impl )
            // InternalPolycreate.g:2284:2: rule__StructuralCondition__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StructuralCondition__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__Group_2__4"


    // $ANTLR start "rule__StructuralCondition__Group_2__4__Impl"
    // InternalPolycreate.g:2290:1: rule__StructuralCondition__Group_2__4__Impl : ( ')' ) ;
    public final void rule__StructuralCondition__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2294:1: ( ( ')' ) )
            // InternalPolycreate.g:2295:1: ( ')' )
            {
            // InternalPolycreate.g:2295:1: ( ')' )
            // InternalPolycreate.g:2296:2: ')'
            {
             before(grammarAccess.getStructuralConditionAccess().getRightParenthesisKeyword_2_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getStructuralConditionAccess().getRightParenthesisKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__Group_2__4__Impl"


    // $ANTLR start "rule__StructuralCondition__Group_2_3__0"
    // InternalPolycreate.g:2306:1: rule__StructuralCondition__Group_2_3__0 : rule__StructuralCondition__Group_2_3__0__Impl rule__StructuralCondition__Group_2_3__1 ;
    public final void rule__StructuralCondition__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2310:1: ( rule__StructuralCondition__Group_2_3__0__Impl rule__StructuralCondition__Group_2_3__1 )
            // InternalPolycreate.g:2311:2: rule__StructuralCondition__Group_2_3__0__Impl rule__StructuralCondition__Group_2_3__1
            {
            pushFollow(FOLLOW_4);
            rule__StructuralCondition__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructuralCondition__Group_2_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__Group_2_3__0"


    // $ANTLR start "rule__StructuralCondition__Group_2_3__0__Impl"
    // InternalPolycreate.g:2318:1: rule__StructuralCondition__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__StructuralCondition__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2322:1: ( ( ',' ) )
            // InternalPolycreate.g:2323:1: ( ',' )
            {
            // InternalPolycreate.g:2323:1: ( ',' )
            // InternalPolycreate.g:2324:2: ','
            {
             before(grammarAccess.getStructuralConditionAccess().getCommaKeyword_2_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getStructuralConditionAccess().getCommaKeyword_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__Group_2_3__0__Impl"


    // $ANTLR start "rule__StructuralCondition__Group_2_3__1"
    // InternalPolycreate.g:2333:1: rule__StructuralCondition__Group_2_3__1 : rule__StructuralCondition__Group_2_3__1__Impl ;
    public final void rule__StructuralCondition__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2337:1: ( rule__StructuralCondition__Group_2_3__1__Impl )
            // InternalPolycreate.g:2338:2: rule__StructuralCondition__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StructuralCondition__Group_2_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__Group_2_3__1"


    // $ANTLR start "rule__StructuralCondition__Group_2_3__1__Impl"
    // InternalPolycreate.g:2344:1: rule__StructuralCondition__Group_2_3__1__Impl : ( ( rule__StructuralCondition__ThenAssignment_2_3_1 ) ) ;
    public final void rule__StructuralCondition__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2348:1: ( ( ( rule__StructuralCondition__ThenAssignment_2_3_1 ) ) )
            // InternalPolycreate.g:2349:1: ( ( rule__StructuralCondition__ThenAssignment_2_3_1 ) )
            {
            // InternalPolycreate.g:2349:1: ( ( rule__StructuralCondition__ThenAssignment_2_3_1 ) )
            // InternalPolycreate.g:2350:2: ( rule__StructuralCondition__ThenAssignment_2_3_1 )
            {
             before(grammarAccess.getStructuralConditionAccess().getThenAssignment_2_3_1()); 
            // InternalPolycreate.g:2351:2: ( rule__StructuralCondition__ThenAssignment_2_3_1 )
            // InternalPolycreate.g:2351:3: rule__StructuralCondition__ThenAssignment_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__StructuralCondition__ThenAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStructuralConditionAccess().getThenAssignment_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__Group_2_3__1__Impl"


    // $ANTLR start "rule__StructuralCondition__Group_3__0"
    // InternalPolycreate.g:2360:1: rule__StructuralCondition__Group_3__0 : rule__StructuralCondition__Group_3__0__Impl rule__StructuralCondition__Group_3__1 ;
    public final void rule__StructuralCondition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2364:1: ( rule__StructuralCondition__Group_3__0__Impl rule__StructuralCondition__Group_3__1 )
            // InternalPolycreate.g:2365:2: rule__StructuralCondition__Group_3__0__Impl rule__StructuralCondition__Group_3__1
            {
            pushFollow(FOLLOW_22);
            rule__StructuralCondition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructuralCondition__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__Group_3__0"


    // $ANTLR start "rule__StructuralCondition__Group_3__0__Impl"
    // InternalPolycreate.g:2372:1: rule__StructuralCondition__Group_3__0__Impl : ( 'else' ) ;
    public final void rule__StructuralCondition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2376:1: ( ( 'else' ) )
            // InternalPolycreate.g:2377:1: ( 'else' )
            {
            // InternalPolycreate.g:2377:1: ( 'else' )
            // InternalPolycreate.g:2378:2: 'else'
            {
             before(grammarAccess.getStructuralConditionAccess().getElseKeyword_3_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getStructuralConditionAccess().getElseKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__Group_3__0__Impl"


    // $ANTLR start "rule__StructuralCondition__Group_3__1"
    // InternalPolycreate.g:2387:1: rule__StructuralCondition__Group_3__1 : rule__StructuralCondition__Group_3__1__Impl rule__StructuralCondition__Group_3__2 ;
    public final void rule__StructuralCondition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2391:1: ( rule__StructuralCondition__Group_3__1__Impl rule__StructuralCondition__Group_3__2 )
            // InternalPolycreate.g:2392:2: rule__StructuralCondition__Group_3__1__Impl rule__StructuralCondition__Group_3__2
            {
            pushFollow(FOLLOW_4);
            rule__StructuralCondition__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructuralCondition__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__Group_3__1"


    // $ANTLR start "rule__StructuralCondition__Group_3__1__Impl"
    // InternalPolycreate.g:2399:1: rule__StructuralCondition__Group_3__1__Impl : ( '(' ) ;
    public final void rule__StructuralCondition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2403:1: ( ( '(' ) )
            // InternalPolycreate.g:2404:1: ( '(' )
            {
            // InternalPolycreate.g:2404:1: ( '(' )
            // InternalPolycreate.g:2405:2: '('
            {
             before(grammarAccess.getStructuralConditionAccess().getLeftParenthesisKeyword_3_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getStructuralConditionAccess().getLeftParenthesisKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__Group_3__1__Impl"


    // $ANTLR start "rule__StructuralCondition__Group_3__2"
    // InternalPolycreate.g:2414:1: rule__StructuralCondition__Group_3__2 : rule__StructuralCondition__Group_3__2__Impl rule__StructuralCondition__Group_3__3 ;
    public final void rule__StructuralCondition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2418:1: ( rule__StructuralCondition__Group_3__2__Impl rule__StructuralCondition__Group_3__3 )
            // InternalPolycreate.g:2419:2: rule__StructuralCondition__Group_3__2__Impl rule__StructuralCondition__Group_3__3
            {
            pushFollow(FOLLOW_23);
            rule__StructuralCondition__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructuralCondition__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__Group_3__2"


    // $ANTLR start "rule__StructuralCondition__Group_3__2__Impl"
    // InternalPolycreate.g:2426:1: rule__StructuralCondition__Group_3__2__Impl : ( ( rule__StructuralCondition__ElseAssignment_3_2 ) ) ;
    public final void rule__StructuralCondition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2430:1: ( ( ( rule__StructuralCondition__ElseAssignment_3_2 ) ) )
            // InternalPolycreate.g:2431:1: ( ( rule__StructuralCondition__ElseAssignment_3_2 ) )
            {
            // InternalPolycreate.g:2431:1: ( ( rule__StructuralCondition__ElseAssignment_3_2 ) )
            // InternalPolycreate.g:2432:2: ( rule__StructuralCondition__ElseAssignment_3_2 )
            {
             before(grammarAccess.getStructuralConditionAccess().getElseAssignment_3_2()); 
            // InternalPolycreate.g:2433:2: ( rule__StructuralCondition__ElseAssignment_3_2 )
            // InternalPolycreate.g:2433:3: rule__StructuralCondition__ElseAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__StructuralCondition__ElseAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getStructuralConditionAccess().getElseAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__Group_3__2__Impl"


    // $ANTLR start "rule__StructuralCondition__Group_3__3"
    // InternalPolycreate.g:2441:1: rule__StructuralCondition__Group_3__3 : rule__StructuralCondition__Group_3__3__Impl rule__StructuralCondition__Group_3__4 ;
    public final void rule__StructuralCondition__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2445:1: ( rule__StructuralCondition__Group_3__3__Impl rule__StructuralCondition__Group_3__4 )
            // InternalPolycreate.g:2446:2: rule__StructuralCondition__Group_3__3__Impl rule__StructuralCondition__Group_3__4
            {
            pushFollow(FOLLOW_23);
            rule__StructuralCondition__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructuralCondition__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__Group_3__3"


    // $ANTLR start "rule__StructuralCondition__Group_3__3__Impl"
    // InternalPolycreate.g:2453:1: rule__StructuralCondition__Group_3__3__Impl : ( ( rule__StructuralCondition__Group_3_3__0 )* ) ;
    public final void rule__StructuralCondition__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2457:1: ( ( ( rule__StructuralCondition__Group_3_3__0 )* ) )
            // InternalPolycreate.g:2458:1: ( ( rule__StructuralCondition__Group_3_3__0 )* )
            {
            // InternalPolycreate.g:2458:1: ( ( rule__StructuralCondition__Group_3_3__0 )* )
            // InternalPolycreate.g:2459:2: ( rule__StructuralCondition__Group_3_3__0 )*
            {
             before(grammarAccess.getStructuralConditionAccess().getGroup_3_3()); 
            // InternalPolycreate.g:2460:2: ( rule__StructuralCondition__Group_3_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==26) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalPolycreate.g:2460:3: rule__StructuralCondition__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__StructuralCondition__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getStructuralConditionAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__Group_3__3__Impl"


    // $ANTLR start "rule__StructuralCondition__Group_3__4"
    // InternalPolycreate.g:2468:1: rule__StructuralCondition__Group_3__4 : rule__StructuralCondition__Group_3__4__Impl ;
    public final void rule__StructuralCondition__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2472:1: ( rule__StructuralCondition__Group_3__4__Impl )
            // InternalPolycreate.g:2473:2: rule__StructuralCondition__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StructuralCondition__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__Group_3__4"


    // $ANTLR start "rule__StructuralCondition__Group_3__4__Impl"
    // InternalPolycreate.g:2479:1: rule__StructuralCondition__Group_3__4__Impl : ( ')' ) ;
    public final void rule__StructuralCondition__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2483:1: ( ( ')' ) )
            // InternalPolycreate.g:2484:1: ( ')' )
            {
            // InternalPolycreate.g:2484:1: ( ')' )
            // InternalPolycreate.g:2485:2: ')'
            {
             before(grammarAccess.getStructuralConditionAccess().getRightParenthesisKeyword_3_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getStructuralConditionAccess().getRightParenthesisKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__Group_3__4__Impl"


    // $ANTLR start "rule__StructuralCondition__Group_3_3__0"
    // InternalPolycreate.g:2495:1: rule__StructuralCondition__Group_3_3__0 : rule__StructuralCondition__Group_3_3__0__Impl rule__StructuralCondition__Group_3_3__1 ;
    public final void rule__StructuralCondition__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2499:1: ( rule__StructuralCondition__Group_3_3__0__Impl rule__StructuralCondition__Group_3_3__1 )
            // InternalPolycreate.g:2500:2: rule__StructuralCondition__Group_3_3__0__Impl rule__StructuralCondition__Group_3_3__1
            {
            pushFollow(FOLLOW_4);
            rule__StructuralCondition__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructuralCondition__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__Group_3_3__0"


    // $ANTLR start "rule__StructuralCondition__Group_3_3__0__Impl"
    // InternalPolycreate.g:2507:1: rule__StructuralCondition__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__StructuralCondition__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2511:1: ( ( ',' ) )
            // InternalPolycreate.g:2512:1: ( ',' )
            {
            // InternalPolycreate.g:2512:1: ( ',' )
            // InternalPolycreate.g:2513:2: ','
            {
             before(grammarAccess.getStructuralConditionAccess().getCommaKeyword_3_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getStructuralConditionAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__Group_3_3__0__Impl"


    // $ANTLR start "rule__StructuralCondition__Group_3_3__1"
    // InternalPolycreate.g:2522:1: rule__StructuralCondition__Group_3_3__1 : rule__StructuralCondition__Group_3_3__1__Impl ;
    public final void rule__StructuralCondition__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2526:1: ( rule__StructuralCondition__Group_3_3__1__Impl )
            // InternalPolycreate.g:2527:2: rule__StructuralCondition__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StructuralCondition__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__Group_3_3__1"


    // $ANTLR start "rule__StructuralCondition__Group_3_3__1__Impl"
    // InternalPolycreate.g:2533:1: rule__StructuralCondition__Group_3_3__1__Impl : ( ( rule__StructuralCondition__ElseAssignment_3_3_1 ) ) ;
    public final void rule__StructuralCondition__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2537:1: ( ( ( rule__StructuralCondition__ElseAssignment_3_3_1 ) ) )
            // InternalPolycreate.g:2538:1: ( ( rule__StructuralCondition__ElseAssignment_3_3_1 ) )
            {
            // InternalPolycreate.g:2538:1: ( ( rule__StructuralCondition__ElseAssignment_3_3_1 ) )
            // InternalPolycreate.g:2539:2: ( rule__StructuralCondition__ElseAssignment_3_3_1 )
            {
             before(grammarAccess.getStructuralConditionAccess().getElseAssignment_3_3_1()); 
            // InternalPolycreate.g:2540:2: ( rule__StructuralCondition__ElseAssignment_3_3_1 )
            // InternalPolycreate.g:2540:3: rule__StructuralCondition__ElseAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__StructuralCondition__ElseAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStructuralConditionAccess().getElseAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__Group_3_3__1__Impl"


    // $ANTLR start "rule__StructuralCondition__Group_7__0"
    // InternalPolycreate.g:2549:1: rule__StructuralCondition__Group_7__0 : rule__StructuralCondition__Group_7__0__Impl rule__StructuralCondition__Group_7__1 ;
    public final void rule__StructuralCondition__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2553:1: ( rule__StructuralCondition__Group_7__0__Impl rule__StructuralCondition__Group_7__1 )
            // InternalPolycreate.g:2554:2: rule__StructuralCondition__Group_7__0__Impl rule__StructuralCondition__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__StructuralCondition__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructuralCondition__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__Group_7__0"


    // $ANTLR start "rule__StructuralCondition__Group_7__0__Impl"
    // InternalPolycreate.g:2561:1: rule__StructuralCondition__Group_7__0__Impl : ( ',' ) ;
    public final void rule__StructuralCondition__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2565:1: ( ( ',' ) )
            // InternalPolycreate.g:2566:1: ( ',' )
            {
            // InternalPolycreate.g:2566:1: ( ',' )
            // InternalPolycreate.g:2567:2: ','
            {
             before(grammarAccess.getStructuralConditionAccess().getCommaKeyword_7_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getStructuralConditionAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__Group_7__0__Impl"


    // $ANTLR start "rule__StructuralCondition__Group_7__1"
    // InternalPolycreate.g:2576:1: rule__StructuralCondition__Group_7__1 : rule__StructuralCondition__Group_7__1__Impl ;
    public final void rule__StructuralCondition__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2580:1: ( rule__StructuralCondition__Group_7__1__Impl )
            // InternalPolycreate.g:2581:2: rule__StructuralCondition__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StructuralCondition__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__Group_7__1"


    // $ANTLR start "rule__StructuralCondition__Group_7__1__Impl"
    // InternalPolycreate.g:2587:1: rule__StructuralCondition__Group_7__1__Impl : ( ( rule__StructuralCondition__IfAssignment_7_1 ) ) ;
    public final void rule__StructuralCondition__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2591:1: ( ( ( rule__StructuralCondition__IfAssignment_7_1 ) ) )
            // InternalPolycreate.g:2592:1: ( ( rule__StructuralCondition__IfAssignment_7_1 ) )
            {
            // InternalPolycreate.g:2592:1: ( ( rule__StructuralCondition__IfAssignment_7_1 ) )
            // InternalPolycreate.g:2593:2: ( rule__StructuralCondition__IfAssignment_7_1 )
            {
             before(grammarAccess.getStructuralConditionAccess().getIfAssignment_7_1()); 
            // InternalPolycreate.g:2594:2: ( rule__StructuralCondition__IfAssignment_7_1 )
            // InternalPolycreate.g:2594:3: rule__StructuralCondition__IfAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__StructuralCondition__IfAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getStructuralConditionAccess().getIfAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__Group_7__1__Impl"


    // $ANTLR start "rule__Comparison__Group__0"
    // InternalPolycreate.g:2603:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2607:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalPolycreate.g:2608:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Comparison__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__0"


    // $ANTLR start "rule__Comparison__Group__0__Impl"
    // InternalPolycreate.g:2615:1: rule__Comparison__Group__0__Impl : ( 'Comparison' ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2619:1: ( ( 'Comparison' ) )
            // InternalPolycreate.g:2620:1: ( 'Comparison' )
            {
            // InternalPolycreate.g:2620:1: ( 'Comparison' )
            // InternalPolycreate.g:2621:2: 'Comparison'
            {
             before(grammarAccess.getComparisonAccess().getComparisonKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getComparisonAccess().getComparisonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__0__Impl"


    // $ANTLR start "rule__Comparison__Group__1"
    // InternalPolycreate.g:2630:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl rule__Comparison__Group__2 ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2634:1: ( rule__Comparison__Group__1__Impl rule__Comparison__Group__2 )
            // InternalPolycreate.g:2635:2: rule__Comparison__Group__1__Impl rule__Comparison__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Comparison__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__1"


    // $ANTLR start "rule__Comparison__Group__1__Impl"
    // InternalPolycreate.g:2642:1: rule__Comparison__Group__1__Impl : ( '{' ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2646:1: ( ( '{' ) )
            // InternalPolycreate.g:2647:1: ( '{' )
            {
            // InternalPolycreate.g:2647:1: ( '{' )
            // InternalPolycreate.g:2648:2: '{'
            {
             before(grammarAccess.getComparisonAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getComparisonAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__1__Impl"


    // $ANTLR start "rule__Comparison__Group__2"
    // InternalPolycreate.g:2657:1: rule__Comparison__Group__2 : rule__Comparison__Group__2__Impl rule__Comparison__Group__3 ;
    public final void rule__Comparison__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2661:1: ( rule__Comparison__Group__2__Impl rule__Comparison__Group__3 )
            // InternalPolycreate.g:2662:2: rule__Comparison__Group__2__Impl rule__Comparison__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Comparison__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__2"


    // $ANTLR start "rule__Comparison__Group__2__Impl"
    // InternalPolycreate.g:2669:1: rule__Comparison__Group__2__Impl : ( ( rule__Comparison__Group_2__0 )? ) ;
    public final void rule__Comparison__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2673:1: ( ( ( rule__Comparison__Group_2__0 )? ) )
            // InternalPolycreate.g:2674:1: ( ( rule__Comparison__Group_2__0 )? )
            {
            // InternalPolycreate.g:2674:1: ( ( rule__Comparison__Group_2__0 )? )
            // InternalPolycreate.g:2675:2: ( rule__Comparison__Group_2__0 )?
            {
             before(grammarAccess.getComparisonAccess().getGroup_2()); 
            // InternalPolycreate.g:2676:2: ( rule__Comparison__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==46) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalPolycreate.g:2676:3: rule__Comparison__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparison__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComparisonAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__2__Impl"


    // $ANTLR start "rule__Comparison__Group__3"
    // InternalPolycreate.g:2684:1: rule__Comparison__Group__3 : rule__Comparison__Group__3__Impl rule__Comparison__Group__4 ;
    public final void rule__Comparison__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2688:1: ( rule__Comparison__Group__3__Impl rule__Comparison__Group__4 )
            // InternalPolycreate.g:2689:2: rule__Comparison__Group__3__Impl rule__Comparison__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Comparison__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__3"


    // $ANTLR start "rule__Comparison__Group__3__Impl"
    // InternalPolycreate.g:2696:1: rule__Comparison__Group__3__Impl : ( 'leftVariable' ) ;
    public final void rule__Comparison__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2700:1: ( ( 'leftVariable' ) )
            // InternalPolycreate.g:2701:1: ( 'leftVariable' )
            {
            // InternalPolycreate.g:2701:1: ( 'leftVariable' )
            // InternalPolycreate.g:2702:2: 'leftVariable'
            {
             before(grammarAccess.getComparisonAccess().getLeftVariableKeyword_3()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getComparisonAccess().getLeftVariableKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__3__Impl"


    // $ANTLR start "rule__Comparison__Group__4"
    // InternalPolycreate.g:2711:1: rule__Comparison__Group__4 : rule__Comparison__Group__4__Impl rule__Comparison__Group__5 ;
    public final void rule__Comparison__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2715:1: ( rule__Comparison__Group__4__Impl rule__Comparison__Group__5 )
            // InternalPolycreate.g:2716:2: rule__Comparison__Group__4__Impl rule__Comparison__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__Comparison__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__4"


    // $ANTLR start "rule__Comparison__Group__4__Impl"
    // InternalPolycreate.g:2723:1: rule__Comparison__Group__4__Impl : ( ( rule__Comparison__LeftVariableAssignment_4 ) ) ;
    public final void rule__Comparison__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2727:1: ( ( ( rule__Comparison__LeftVariableAssignment_4 ) ) )
            // InternalPolycreate.g:2728:1: ( ( rule__Comparison__LeftVariableAssignment_4 ) )
            {
            // InternalPolycreate.g:2728:1: ( ( rule__Comparison__LeftVariableAssignment_4 ) )
            // InternalPolycreate.g:2729:2: ( rule__Comparison__LeftVariableAssignment_4 )
            {
             before(grammarAccess.getComparisonAccess().getLeftVariableAssignment_4()); 
            // InternalPolycreate.g:2730:2: ( rule__Comparison__LeftVariableAssignment_4 )
            // InternalPolycreate.g:2730:3: rule__Comparison__LeftVariableAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__LeftVariableAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getLeftVariableAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__4__Impl"


    // $ANTLR start "rule__Comparison__Group__5"
    // InternalPolycreate.g:2738:1: rule__Comparison__Group__5 : rule__Comparison__Group__5__Impl rule__Comparison__Group__6 ;
    public final void rule__Comparison__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2742:1: ( rule__Comparison__Group__5__Impl rule__Comparison__Group__6 )
            // InternalPolycreate.g:2743:2: rule__Comparison__Group__5__Impl rule__Comparison__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__Comparison__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__5"


    // $ANTLR start "rule__Comparison__Group__5__Impl"
    // InternalPolycreate.g:2750:1: rule__Comparison__Group__5__Impl : ( 'rightVariable' ) ;
    public final void rule__Comparison__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2754:1: ( ( 'rightVariable' ) )
            // InternalPolycreate.g:2755:1: ( 'rightVariable' )
            {
            // InternalPolycreate.g:2755:1: ( 'rightVariable' )
            // InternalPolycreate.g:2756:2: 'rightVariable'
            {
             before(grammarAccess.getComparisonAccess().getRightVariableKeyword_5()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getComparisonAccess().getRightVariableKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__5__Impl"


    // $ANTLR start "rule__Comparison__Group__6"
    // InternalPolycreate.g:2765:1: rule__Comparison__Group__6 : rule__Comparison__Group__6__Impl rule__Comparison__Group__7 ;
    public final void rule__Comparison__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2769:1: ( rule__Comparison__Group__6__Impl rule__Comparison__Group__7 )
            // InternalPolycreate.g:2770:2: rule__Comparison__Group__6__Impl rule__Comparison__Group__7
            {
            pushFollow(FOLLOW_24);
            rule__Comparison__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__6"


    // $ANTLR start "rule__Comparison__Group__6__Impl"
    // InternalPolycreate.g:2777:1: rule__Comparison__Group__6__Impl : ( ( rule__Comparison__RightVariableAssignment_6 ) ) ;
    public final void rule__Comparison__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2781:1: ( ( ( rule__Comparison__RightVariableAssignment_6 ) ) )
            // InternalPolycreate.g:2782:1: ( ( rule__Comparison__RightVariableAssignment_6 ) )
            {
            // InternalPolycreate.g:2782:1: ( ( rule__Comparison__RightVariableAssignment_6 ) )
            // InternalPolycreate.g:2783:2: ( rule__Comparison__RightVariableAssignment_6 )
            {
             before(grammarAccess.getComparisonAccess().getRightVariableAssignment_6()); 
            // InternalPolycreate.g:2784:2: ( rule__Comparison__RightVariableAssignment_6 )
            // InternalPolycreate.g:2784:3: rule__Comparison__RightVariableAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__RightVariableAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getRightVariableAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__6__Impl"


    // $ANTLR start "rule__Comparison__Group__7"
    // InternalPolycreate.g:2792:1: rule__Comparison__Group__7 : rule__Comparison__Group__7__Impl ;
    public final void rule__Comparison__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2796:1: ( rule__Comparison__Group__7__Impl )
            // InternalPolycreate.g:2797:2: rule__Comparison__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__7"


    // $ANTLR start "rule__Comparison__Group__7__Impl"
    // InternalPolycreate.g:2803:1: rule__Comparison__Group__7__Impl : ( '}' ) ;
    public final void rule__Comparison__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2807:1: ( ( '}' ) )
            // InternalPolycreate.g:2808:1: ( '}' )
            {
            // InternalPolycreate.g:2808:1: ( '}' )
            // InternalPolycreate.g:2809:2: '}'
            {
             before(grammarAccess.getComparisonAccess().getRightCurlyBracketKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getComparisonAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__7__Impl"


    // $ANTLR start "rule__Comparison__Group_2__0"
    // InternalPolycreate.g:2819:1: rule__Comparison__Group_2__0 : rule__Comparison__Group_2__0__Impl rule__Comparison__Group_2__1 ;
    public final void rule__Comparison__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2823:1: ( rule__Comparison__Group_2__0__Impl rule__Comparison__Group_2__1 )
            // InternalPolycreate.g:2824:2: rule__Comparison__Group_2__0__Impl rule__Comparison__Group_2__1
            {
            pushFollow(FOLLOW_13);
            rule__Comparison__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_2__0"


    // $ANTLR start "rule__Comparison__Group_2__0__Impl"
    // InternalPolycreate.g:2831:1: rule__Comparison__Group_2__0__Impl : ( 'value' ) ;
    public final void rule__Comparison__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2835:1: ( ( 'value' ) )
            // InternalPolycreate.g:2836:1: ( 'value' )
            {
            // InternalPolycreate.g:2836:1: ( 'value' )
            // InternalPolycreate.g:2837:2: 'value'
            {
             before(grammarAccess.getComparisonAccess().getValueKeyword_2_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getComparisonAccess().getValueKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_2__0__Impl"


    // $ANTLR start "rule__Comparison__Group_2__1"
    // InternalPolycreate.g:2846:1: rule__Comparison__Group_2__1 : rule__Comparison__Group_2__1__Impl ;
    public final void rule__Comparison__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2850:1: ( rule__Comparison__Group_2__1__Impl )
            // InternalPolycreate.g:2851:2: rule__Comparison__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_2__1"


    // $ANTLR start "rule__Comparison__Group_2__1__Impl"
    // InternalPolycreate.g:2857:1: rule__Comparison__Group_2__1__Impl : ( ( rule__Comparison__ValueAssignment_2_1 ) ) ;
    public final void rule__Comparison__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2861:1: ( ( ( rule__Comparison__ValueAssignment_2_1 ) ) )
            // InternalPolycreate.g:2862:1: ( ( rule__Comparison__ValueAssignment_2_1 ) )
            {
            // InternalPolycreate.g:2862:1: ( ( rule__Comparison__ValueAssignment_2_1 ) )
            // InternalPolycreate.g:2863:2: ( rule__Comparison__ValueAssignment_2_1 )
            {
             before(grammarAccess.getComparisonAccess().getValueAssignment_2_1()); 
            // InternalPolycreate.g:2864:2: ( rule__Comparison__ValueAssignment_2_1 )
            // InternalPolycreate.g:2864:3: rule__Comparison__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getValueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_2__1__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalPolycreate.g:2873:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2877:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalPolycreate.g:2878:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // InternalPolycreate.g:2885:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2889:1: ( ( ( '-' )? ) )
            // InternalPolycreate.g:2890:1: ( ( '-' )? )
            {
            // InternalPolycreate.g:2890:1: ( ( '-' )? )
            // InternalPolycreate.g:2891:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalPolycreate.g:2892:2: ( '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==47) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalPolycreate.g:2892:3: '-'
                    {
                    match(input,47,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // InternalPolycreate.g:2900:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2904:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalPolycreate.g:2905:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // InternalPolycreate.g:2912:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2916:1: ( ( ( RULE_INT )? ) )
            // InternalPolycreate.g:2917:1: ( ( RULE_INT )? )
            {
            // InternalPolycreate.g:2917:1: ( ( RULE_INT )? )
            // InternalPolycreate.g:2918:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalPolycreate.g:2919:2: ( RULE_INT )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_INT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalPolycreate.g:2919:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // InternalPolycreate.g:2927:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2931:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalPolycreate.g:2932:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // InternalPolycreate.g:2939:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2943:1: ( ( '.' ) )
            // InternalPolycreate.g:2944:1: ( '.' )
            {
            // InternalPolycreate.g:2944:1: ( '.' )
            // InternalPolycreate.g:2945:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__3"
    // InternalPolycreate.g:2954:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2958:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalPolycreate.g:2959:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__EDouble__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3"


    // $ANTLR start "rule__EDouble__Group__3__Impl"
    // InternalPolycreate.g:2966:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2970:1: ( ( RULE_INT ) )
            // InternalPolycreate.g:2971:1: ( RULE_INT )
            {
            // InternalPolycreate.g:2971:1: ( RULE_INT )
            // InternalPolycreate.g:2972:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__4"
    // InternalPolycreate.g:2981:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2985:1: ( rule__EDouble__Group__4__Impl )
            // InternalPolycreate.g:2986:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4"


    // $ANTLR start "rule__EDouble__Group__4__Impl"
    // InternalPolycreate.g:2992:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2996:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalPolycreate.g:2997:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalPolycreate.g:2997:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalPolycreate.g:2998:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalPolycreate.g:2999:2: ( rule__EDouble__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=11 && LA20_0<=12)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalPolycreate.g:2999:3: rule__EDouble__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDouble__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4__Impl"


    // $ANTLR start "rule__EDouble__Group_4__0"
    // InternalPolycreate.g:3008:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3012:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalPolycreate.g:3013:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_29);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0"


    // $ANTLR start "rule__EDouble__Group_4__0__Impl"
    // InternalPolycreate.g:3020:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3024:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalPolycreate.g:3025:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalPolycreate.g:3025:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalPolycreate.g:3026:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalPolycreate.g:3027:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalPolycreate.g:3027:3: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0__Impl"


    // $ANTLR start "rule__EDouble__Group_4__1"
    // InternalPolycreate.g:3035:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3039:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalPolycreate.g:3040:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_29);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1"


    // $ANTLR start "rule__EDouble__Group_4__1__Impl"
    // InternalPolycreate.g:3047:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3051:1: ( ( ( '-' )? ) )
            // InternalPolycreate.g:3052:1: ( ( '-' )? )
            {
            // InternalPolycreate.g:3052:1: ( ( '-' )? )
            // InternalPolycreate.g:3053:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalPolycreate.g:3054:2: ( '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==47) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalPolycreate.g:3054:3: '-'
                    {
                    match(input,47,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1__Impl"


    // $ANTLR start "rule__EDouble__Group_4__2"
    // InternalPolycreate.g:3062:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3066:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalPolycreate.g:3067:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2"


    // $ANTLR start "rule__EDouble__Group_4__2__Impl"
    // InternalPolycreate.g:3073:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3077:1: ( ( RULE_INT ) )
            // InternalPolycreate.g:3078:1: ( RULE_INT )
            {
            // InternalPolycreate.g:3078:1: ( RULE_INT )
            // InternalPolycreate.g:3079:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2__Impl"


    // $ANTLR start "rule__GripperSensor__Group__0"
    // InternalPolycreate.g:3089:1: rule__GripperSensor__Group__0 : rule__GripperSensor__Group__0__Impl rule__GripperSensor__Group__1 ;
    public final void rule__GripperSensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3093:1: ( rule__GripperSensor__Group__0__Impl rule__GripperSensor__Group__1 )
            // InternalPolycreate.g:3094:2: rule__GripperSensor__Group__0__Impl rule__GripperSensor__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__GripperSensor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GripperSensor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GripperSensor__Group__0"


    // $ANTLR start "rule__GripperSensor__Group__0__Impl"
    // InternalPolycreate.g:3101:1: rule__GripperSensor__Group__0__Impl : ( () ) ;
    public final void rule__GripperSensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3105:1: ( ( () ) )
            // InternalPolycreate.g:3106:1: ( () )
            {
            // InternalPolycreate.g:3106:1: ( () )
            // InternalPolycreate.g:3107:2: ()
            {
             before(grammarAccess.getGripperSensorAccess().getGripperSensorAction_0()); 
            // InternalPolycreate.g:3108:2: ()
            // InternalPolycreate.g:3108:3: 
            {
            }

             after(grammarAccess.getGripperSensorAccess().getGripperSensorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GripperSensor__Group__0__Impl"


    // $ANTLR start "rule__GripperSensor__Group__1"
    // InternalPolycreate.g:3116:1: rule__GripperSensor__Group__1 : rule__GripperSensor__Group__1__Impl rule__GripperSensor__Group__2 ;
    public final void rule__GripperSensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3120:1: ( rule__GripperSensor__Group__1__Impl rule__GripperSensor__Group__2 )
            // InternalPolycreate.g:3121:2: rule__GripperSensor__Group__1__Impl rule__GripperSensor__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__GripperSensor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GripperSensor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GripperSensor__Group__1"


    // $ANTLR start "rule__GripperSensor__Group__1__Impl"
    // InternalPolycreate.g:3128:1: rule__GripperSensor__Group__1__Impl : ( 'GripperSensor' ) ;
    public final void rule__GripperSensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3132:1: ( ( 'GripperSensor' ) )
            // InternalPolycreate.g:3133:1: ( 'GripperSensor' )
            {
            // InternalPolycreate.g:3133:1: ( 'GripperSensor' )
            // InternalPolycreate.g:3134:2: 'GripperSensor'
            {
             before(grammarAccess.getGripperSensorAccess().getGripperSensorKeyword_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getGripperSensorAccess().getGripperSensorKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GripperSensor__Group__1__Impl"


    // $ANTLR start "rule__GripperSensor__Group__2"
    // InternalPolycreate.g:3143:1: rule__GripperSensor__Group__2 : rule__GripperSensor__Group__2__Impl rule__GripperSensor__Group__3 ;
    public final void rule__GripperSensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3147:1: ( rule__GripperSensor__Group__2__Impl rule__GripperSensor__Group__3 )
            // InternalPolycreate.g:3148:2: rule__GripperSensor__Group__2__Impl rule__GripperSensor__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__GripperSensor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GripperSensor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GripperSensor__Group__2"


    // $ANTLR start "rule__GripperSensor__Group__2__Impl"
    // InternalPolycreate.g:3155:1: rule__GripperSensor__Group__2__Impl : ( ( rule__GripperSensor__NameAssignment_2 ) ) ;
    public final void rule__GripperSensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3159:1: ( ( ( rule__GripperSensor__NameAssignment_2 ) ) )
            // InternalPolycreate.g:3160:1: ( ( rule__GripperSensor__NameAssignment_2 ) )
            {
            // InternalPolycreate.g:3160:1: ( ( rule__GripperSensor__NameAssignment_2 ) )
            // InternalPolycreate.g:3161:2: ( rule__GripperSensor__NameAssignment_2 )
            {
             before(grammarAccess.getGripperSensorAccess().getNameAssignment_2()); 
            // InternalPolycreate.g:3162:2: ( rule__GripperSensor__NameAssignment_2 )
            // InternalPolycreate.g:3162:3: rule__GripperSensor__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GripperSensor__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGripperSensorAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GripperSensor__Group__2__Impl"


    // $ANTLR start "rule__GripperSensor__Group__3"
    // InternalPolycreate.g:3170:1: rule__GripperSensor__Group__3 : rule__GripperSensor__Group__3__Impl rule__GripperSensor__Group__4 ;
    public final void rule__GripperSensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3174:1: ( rule__GripperSensor__Group__3__Impl rule__GripperSensor__Group__4 )
            // InternalPolycreate.g:3175:2: rule__GripperSensor__Group__3__Impl rule__GripperSensor__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__GripperSensor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GripperSensor__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GripperSensor__Group__3"


    // $ANTLR start "rule__GripperSensor__Group__3__Impl"
    // InternalPolycreate.g:3182:1: rule__GripperSensor__Group__3__Impl : ( '{' ) ;
    public final void rule__GripperSensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3186:1: ( ( '{' ) )
            // InternalPolycreate.g:3187:1: ( '{' )
            {
            // InternalPolycreate.g:3187:1: ( '{' )
            // InternalPolycreate.g:3188:2: '{'
            {
             before(grammarAccess.getGripperSensorAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getGripperSensorAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GripperSensor__Group__3__Impl"


    // $ANTLR start "rule__GripperSensor__Group__4"
    // InternalPolycreate.g:3197:1: rule__GripperSensor__Group__4 : rule__GripperSensor__Group__4__Impl rule__GripperSensor__Group__5 ;
    public final void rule__GripperSensor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3201:1: ( rule__GripperSensor__Group__4__Impl rule__GripperSensor__Group__5 )
            // InternalPolycreate.g:3202:2: rule__GripperSensor__Group__4__Impl rule__GripperSensor__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__GripperSensor__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GripperSensor__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GripperSensor__Group__4"


    // $ANTLR start "rule__GripperSensor__Group__4__Impl"
    // InternalPolycreate.g:3209:1: rule__GripperSensor__Group__4__Impl : ( ( rule__GripperSensor__Group_4__0 )? ) ;
    public final void rule__GripperSensor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3213:1: ( ( ( rule__GripperSensor__Group_4__0 )? ) )
            // InternalPolycreate.g:3214:1: ( ( rule__GripperSensor__Group_4__0 )? )
            {
            // InternalPolycreate.g:3214:1: ( ( rule__GripperSensor__Group_4__0 )? )
            // InternalPolycreate.g:3215:2: ( rule__GripperSensor__Group_4__0 )?
            {
             before(grammarAccess.getGripperSensorAccess().getGroup_4()); 
            // InternalPolycreate.g:3216:2: ( rule__GripperSensor__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPolycreate.g:3216:3: rule__GripperSensor__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GripperSensor__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGripperSensorAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GripperSensor__Group__4__Impl"


    // $ANTLR start "rule__GripperSensor__Group__5"
    // InternalPolycreate.g:3224:1: rule__GripperSensor__Group__5 : rule__GripperSensor__Group__5__Impl rule__GripperSensor__Group__6 ;
    public final void rule__GripperSensor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3228:1: ( rule__GripperSensor__Group__5__Impl rule__GripperSensor__Group__6 )
            // InternalPolycreate.g:3229:2: rule__GripperSensor__Group__5__Impl rule__GripperSensor__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__GripperSensor__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GripperSensor__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GripperSensor__Group__5"


    // $ANTLR start "rule__GripperSensor__Group__5__Impl"
    // InternalPolycreate.g:3236:1: rule__GripperSensor__Group__5__Impl : ( ( rule__GripperSensor__Group_5__0 )? ) ;
    public final void rule__GripperSensor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3240:1: ( ( ( rule__GripperSensor__Group_5__0 )? ) )
            // InternalPolycreate.g:3241:1: ( ( rule__GripperSensor__Group_5__0 )? )
            {
            // InternalPolycreate.g:3241:1: ( ( rule__GripperSensor__Group_5__0 )? )
            // InternalPolycreate.g:3242:2: ( rule__GripperSensor__Group_5__0 )?
            {
             before(grammarAccess.getGripperSensorAccess().getGroup_5()); 
            // InternalPolycreate.g:3243:2: ( rule__GripperSensor__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==30) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalPolycreate.g:3243:3: rule__GripperSensor__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GripperSensor__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGripperSensorAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GripperSensor__Group__5__Impl"


    // $ANTLR start "rule__GripperSensor__Group__6"
    // InternalPolycreate.g:3251:1: rule__GripperSensor__Group__6 : rule__GripperSensor__Group__6__Impl ;
    public final void rule__GripperSensor__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3255:1: ( rule__GripperSensor__Group__6__Impl )
            // InternalPolycreate.g:3256:2: rule__GripperSensor__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GripperSensor__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GripperSensor__Group__6"


    // $ANTLR start "rule__GripperSensor__Group__6__Impl"
    // InternalPolycreate.g:3262:1: rule__GripperSensor__Group__6__Impl : ( '}' ) ;
    public final void rule__GripperSensor__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3266:1: ( ( '}' ) )
            // InternalPolycreate.g:3267:1: ( '}' )
            {
            // InternalPolycreate.g:3267:1: ( '}' )
            // InternalPolycreate.g:3268:2: '}'
            {
             before(grammarAccess.getGripperSensorAccess().getRightCurlyBracketKeyword_6()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getGripperSensorAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GripperSensor__Group__6__Impl"


    // $ANTLR start "rule__GripperSensor__Group_4__0"
    // InternalPolycreate.g:3278:1: rule__GripperSensor__Group_4__0 : rule__GripperSensor__Group_4__0__Impl rule__GripperSensor__Group_4__1 ;
    public final void rule__GripperSensor__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3282:1: ( rule__GripperSensor__Group_4__0__Impl rule__GripperSensor__Group_4__1 )
            // InternalPolycreate.g:3283:2: rule__GripperSensor__Group_4__0__Impl rule__GripperSensor__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__GripperSensor__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GripperSensor__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GripperSensor__Group_4__0"


    // $ANTLR start "rule__GripperSensor__Group_4__0__Impl"
    // InternalPolycreate.g:3290:1: rule__GripperSensor__Group_4__0__Impl : ( 'type' ) ;
    public final void rule__GripperSensor__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3294:1: ( ( 'type' ) )
            // InternalPolycreate.g:3295:1: ( 'type' )
            {
            // InternalPolycreate.g:3295:1: ( 'type' )
            // InternalPolycreate.g:3296:2: 'type'
            {
             before(grammarAccess.getGripperSensorAccess().getTypeKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getGripperSensorAccess().getTypeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GripperSensor__Group_4__0__Impl"


    // $ANTLR start "rule__GripperSensor__Group_4__1"
    // InternalPolycreate.g:3305:1: rule__GripperSensor__Group_4__1 : rule__GripperSensor__Group_4__1__Impl ;
    public final void rule__GripperSensor__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3309:1: ( rule__GripperSensor__Group_4__1__Impl )
            // InternalPolycreate.g:3310:2: rule__GripperSensor__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GripperSensor__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GripperSensor__Group_4__1"


    // $ANTLR start "rule__GripperSensor__Group_4__1__Impl"
    // InternalPolycreate.g:3316:1: rule__GripperSensor__Group_4__1__Impl : ( ( rule__GripperSensor__TypeAssignment_4_1 ) ) ;
    public final void rule__GripperSensor__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3320:1: ( ( ( rule__GripperSensor__TypeAssignment_4_1 ) ) )
            // InternalPolycreate.g:3321:1: ( ( rule__GripperSensor__TypeAssignment_4_1 ) )
            {
            // InternalPolycreate.g:3321:1: ( ( rule__GripperSensor__TypeAssignment_4_1 ) )
            // InternalPolycreate.g:3322:2: ( rule__GripperSensor__TypeAssignment_4_1 )
            {
             before(grammarAccess.getGripperSensorAccess().getTypeAssignment_4_1()); 
            // InternalPolycreate.g:3323:2: ( rule__GripperSensor__TypeAssignment_4_1 )
            // InternalPolycreate.g:3323:3: rule__GripperSensor__TypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__GripperSensor__TypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getGripperSensorAccess().getTypeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GripperSensor__Group_4__1__Impl"


    // $ANTLR start "rule__GripperSensor__Group_5__0"
    // InternalPolycreate.g:3332:1: rule__GripperSensor__Group_5__0 : rule__GripperSensor__Group_5__0__Impl rule__GripperSensor__Group_5__1 ;
    public final void rule__GripperSensor__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3336:1: ( rule__GripperSensor__Group_5__0__Impl rule__GripperSensor__Group_5__1 )
            // InternalPolycreate.g:3337:2: rule__GripperSensor__Group_5__0__Impl rule__GripperSensor__Group_5__1
            {
            pushFollow(FOLLOW_14);
            rule__GripperSensor__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GripperSensor__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GripperSensor__Group_5__0"


    // $ANTLR start "rule__GripperSensor__Group_5__0__Impl"
    // InternalPolycreate.g:3344:1: rule__GripperSensor__Group_5__0__Impl : ( 'initialValue' ) ;
    public final void rule__GripperSensor__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3348:1: ( ( 'initialValue' ) )
            // InternalPolycreate.g:3349:1: ( 'initialValue' )
            {
            // InternalPolycreate.g:3349:1: ( 'initialValue' )
            // InternalPolycreate.g:3350:2: 'initialValue'
            {
             before(grammarAccess.getGripperSensorAccess().getInitialValueKeyword_5_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getGripperSensorAccess().getInitialValueKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GripperSensor__Group_5__0__Impl"


    // $ANTLR start "rule__GripperSensor__Group_5__1"
    // InternalPolycreate.g:3359:1: rule__GripperSensor__Group_5__1 : rule__GripperSensor__Group_5__1__Impl ;
    public final void rule__GripperSensor__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3363:1: ( rule__GripperSensor__Group_5__1__Impl )
            // InternalPolycreate.g:3364:2: rule__GripperSensor__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GripperSensor__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GripperSensor__Group_5__1"


    // $ANTLR start "rule__GripperSensor__Group_5__1__Impl"
    // InternalPolycreate.g:3370:1: rule__GripperSensor__Group_5__1__Impl : ( ( rule__GripperSensor__InitialValueAssignment_5_1 ) ) ;
    public final void rule__GripperSensor__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3374:1: ( ( ( rule__GripperSensor__InitialValueAssignment_5_1 ) ) )
            // InternalPolycreate.g:3375:1: ( ( rule__GripperSensor__InitialValueAssignment_5_1 ) )
            {
            // InternalPolycreate.g:3375:1: ( ( rule__GripperSensor__InitialValueAssignment_5_1 ) )
            // InternalPolycreate.g:3376:2: ( rule__GripperSensor__InitialValueAssignment_5_1 )
            {
             before(grammarAccess.getGripperSensorAccess().getInitialValueAssignment_5_1()); 
            // InternalPolycreate.g:3377:2: ( rule__GripperSensor__InitialValueAssignment_5_1 )
            // InternalPolycreate.g:3377:3: rule__GripperSensor__InitialValueAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__GripperSensor__InitialValueAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getGripperSensorAccess().getInitialValueAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GripperSensor__Group_5__1__Impl"


    // $ANTLR start "rule__RightSensor__Group__0"
    // InternalPolycreate.g:3386:1: rule__RightSensor__Group__0 : rule__RightSensor__Group__0__Impl rule__RightSensor__Group__1 ;
    public final void rule__RightSensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3390:1: ( rule__RightSensor__Group__0__Impl rule__RightSensor__Group__1 )
            // InternalPolycreate.g:3391:2: rule__RightSensor__Group__0__Impl rule__RightSensor__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__RightSensor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RightSensor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightSensor__Group__0"


    // $ANTLR start "rule__RightSensor__Group__0__Impl"
    // InternalPolycreate.g:3398:1: rule__RightSensor__Group__0__Impl : ( () ) ;
    public final void rule__RightSensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3402:1: ( ( () ) )
            // InternalPolycreate.g:3403:1: ( () )
            {
            // InternalPolycreate.g:3403:1: ( () )
            // InternalPolycreate.g:3404:2: ()
            {
             before(grammarAccess.getRightSensorAccess().getRightSensorAction_0()); 
            // InternalPolycreate.g:3405:2: ()
            // InternalPolycreate.g:3405:3: 
            {
            }

             after(grammarAccess.getRightSensorAccess().getRightSensorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightSensor__Group__0__Impl"


    // $ANTLR start "rule__RightSensor__Group__1"
    // InternalPolycreate.g:3413:1: rule__RightSensor__Group__1 : rule__RightSensor__Group__1__Impl rule__RightSensor__Group__2 ;
    public final void rule__RightSensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3417:1: ( rule__RightSensor__Group__1__Impl rule__RightSensor__Group__2 )
            // InternalPolycreate.g:3418:2: rule__RightSensor__Group__1__Impl rule__RightSensor__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__RightSensor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RightSensor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightSensor__Group__1"


    // $ANTLR start "rule__RightSensor__Group__1__Impl"
    // InternalPolycreate.g:3425:1: rule__RightSensor__Group__1__Impl : ( 'RightSensor' ) ;
    public final void rule__RightSensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3429:1: ( ( 'RightSensor' ) )
            // InternalPolycreate.g:3430:1: ( 'RightSensor' )
            {
            // InternalPolycreate.g:3430:1: ( 'RightSensor' )
            // InternalPolycreate.g:3431:2: 'RightSensor'
            {
             before(grammarAccess.getRightSensorAccess().getRightSensorKeyword_1()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getRightSensorAccess().getRightSensorKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightSensor__Group__1__Impl"


    // $ANTLR start "rule__RightSensor__Group__2"
    // InternalPolycreate.g:3440:1: rule__RightSensor__Group__2 : rule__RightSensor__Group__2__Impl rule__RightSensor__Group__3 ;
    public final void rule__RightSensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3444:1: ( rule__RightSensor__Group__2__Impl rule__RightSensor__Group__3 )
            // InternalPolycreate.g:3445:2: rule__RightSensor__Group__2__Impl rule__RightSensor__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__RightSensor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RightSensor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightSensor__Group__2"


    // $ANTLR start "rule__RightSensor__Group__2__Impl"
    // InternalPolycreate.g:3452:1: rule__RightSensor__Group__2__Impl : ( ( rule__RightSensor__NameAssignment_2 ) ) ;
    public final void rule__RightSensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3456:1: ( ( ( rule__RightSensor__NameAssignment_2 ) ) )
            // InternalPolycreate.g:3457:1: ( ( rule__RightSensor__NameAssignment_2 ) )
            {
            // InternalPolycreate.g:3457:1: ( ( rule__RightSensor__NameAssignment_2 ) )
            // InternalPolycreate.g:3458:2: ( rule__RightSensor__NameAssignment_2 )
            {
             before(grammarAccess.getRightSensorAccess().getNameAssignment_2()); 
            // InternalPolycreate.g:3459:2: ( rule__RightSensor__NameAssignment_2 )
            // InternalPolycreate.g:3459:3: rule__RightSensor__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RightSensor__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRightSensorAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightSensor__Group__2__Impl"


    // $ANTLR start "rule__RightSensor__Group__3"
    // InternalPolycreate.g:3467:1: rule__RightSensor__Group__3 : rule__RightSensor__Group__3__Impl rule__RightSensor__Group__4 ;
    public final void rule__RightSensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3471:1: ( rule__RightSensor__Group__3__Impl rule__RightSensor__Group__4 )
            // InternalPolycreate.g:3472:2: rule__RightSensor__Group__3__Impl rule__RightSensor__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__RightSensor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RightSensor__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightSensor__Group__3"


    // $ANTLR start "rule__RightSensor__Group__3__Impl"
    // InternalPolycreate.g:3479:1: rule__RightSensor__Group__3__Impl : ( '{' ) ;
    public final void rule__RightSensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3483:1: ( ( '{' ) )
            // InternalPolycreate.g:3484:1: ( '{' )
            {
            // InternalPolycreate.g:3484:1: ( '{' )
            // InternalPolycreate.g:3485:2: '{'
            {
             before(grammarAccess.getRightSensorAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRightSensorAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightSensor__Group__3__Impl"


    // $ANTLR start "rule__RightSensor__Group__4"
    // InternalPolycreate.g:3494:1: rule__RightSensor__Group__4 : rule__RightSensor__Group__4__Impl rule__RightSensor__Group__5 ;
    public final void rule__RightSensor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3498:1: ( rule__RightSensor__Group__4__Impl rule__RightSensor__Group__5 )
            // InternalPolycreate.g:3499:2: rule__RightSensor__Group__4__Impl rule__RightSensor__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__RightSensor__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RightSensor__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightSensor__Group__4"


    // $ANTLR start "rule__RightSensor__Group__4__Impl"
    // InternalPolycreate.g:3506:1: rule__RightSensor__Group__4__Impl : ( ( rule__RightSensor__Group_4__0 )? ) ;
    public final void rule__RightSensor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3510:1: ( ( ( rule__RightSensor__Group_4__0 )? ) )
            // InternalPolycreate.g:3511:1: ( ( rule__RightSensor__Group_4__0 )? )
            {
            // InternalPolycreate.g:3511:1: ( ( rule__RightSensor__Group_4__0 )? )
            // InternalPolycreate.g:3512:2: ( rule__RightSensor__Group_4__0 )?
            {
             before(grammarAccess.getRightSensorAccess().getGroup_4()); 
            // InternalPolycreate.g:3513:2: ( rule__RightSensor__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==29) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalPolycreate.g:3513:3: rule__RightSensor__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RightSensor__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRightSensorAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightSensor__Group__4__Impl"


    // $ANTLR start "rule__RightSensor__Group__5"
    // InternalPolycreate.g:3521:1: rule__RightSensor__Group__5 : rule__RightSensor__Group__5__Impl rule__RightSensor__Group__6 ;
    public final void rule__RightSensor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3525:1: ( rule__RightSensor__Group__5__Impl rule__RightSensor__Group__6 )
            // InternalPolycreate.g:3526:2: rule__RightSensor__Group__5__Impl rule__RightSensor__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__RightSensor__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RightSensor__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightSensor__Group__5"


    // $ANTLR start "rule__RightSensor__Group__5__Impl"
    // InternalPolycreate.g:3533:1: rule__RightSensor__Group__5__Impl : ( ( rule__RightSensor__Group_5__0 )? ) ;
    public final void rule__RightSensor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3537:1: ( ( ( rule__RightSensor__Group_5__0 )? ) )
            // InternalPolycreate.g:3538:1: ( ( rule__RightSensor__Group_5__0 )? )
            {
            // InternalPolycreate.g:3538:1: ( ( rule__RightSensor__Group_5__0 )? )
            // InternalPolycreate.g:3539:2: ( rule__RightSensor__Group_5__0 )?
            {
             before(grammarAccess.getRightSensorAccess().getGroup_5()); 
            // InternalPolycreate.g:3540:2: ( rule__RightSensor__Group_5__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==30) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalPolycreate.g:3540:3: rule__RightSensor__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RightSensor__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRightSensorAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightSensor__Group__5__Impl"


    // $ANTLR start "rule__RightSensor__Group__6"
    // InternalPolycreate.g:3548:1: rule__RightSensor__Group__6 : rule__RightSensor__Group__6__Impl ;
    public final void rule__RightSensor__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3552:1: ( rule__RightSensor__Group__6__Impl )
            // InternalPolycreate.g:3553:2: rule__RightSensor__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RightSensor__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightSensor__Group__6"


    // $ANTLR start "rule__RightSensor__Group__6__Impl"
    // InternalPolycreate.g:3559:1: rule__RightSensor__Group__6__Impl : ( '}' ) ;
    public final void rule__RightSensor__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3563:1: ( ( '}' ) )
            // InternalPolycreate.g:3564:1: ( '}' )
            {
            // InternalPolycreate.g:3564:1: ( '}' )
            // InternalPolycreate.g:3565:2: '}'
            {
             before(grammarAccess.getRightSensorAccess().getRightCurlyBracketKeyword_6()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRightSensorAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightSensor__Group__6__Impl"


    // $ANTLR start "rule__RightSensor__Group_4__0"
    // InternalPolycreate.g:3575:1: rule__RightSensor__Group_4__0 : rule__RightSensor__Group_4__0__Impl rule__RightSensor__Group_4__1 ;
    public final void rule__RightSensor__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3579:1: ( rule__RightSensor__Group_4__0__Impl rule__RightSensor__Group_4__1 )
            // InternalPolycreate.g:3580:2: rule__RightSensor__Group_4__0__Impl rule__RightSensor__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__RightSensor__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RightSensor__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightSensor__Group_4__0"


    // $ANTLR start "rule__RightSensor__Group_4__0__Impl"
    // InternalPolycreate.g:3587:1: rule__RightSensor__Group_4__0__Impl : ( 'type' ) ;
    public final void rule__RightSensor__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3591:1: ( ( 'type' ) )
            // InternalPolycreate.g:3592:1: ( 'type' )
            {
            // InternalPolycreate.g:3592:1: ( 'type' )
            // InternalPolycreate.g:3593:2: 'type'
            {
             before(grammarAccess.getRightSensorAccess().getTypeKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRightSensorAccess().getTypeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightSensor__Group_4__0__Impl"


    // $ANTLR start "rule__RightSensor__Group_4__1"
    // InternalPolycreate.g:3602:1: rule__RightSensor__Group_4__1 : rule__RightSensor__Group_4__1__Impl ;
    public final void rule__RightSensor__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3606:1: ( rule__RightSensor__Group_4__1__Impl )
            // InternalPolycreate.g:3607:2: rule__RightSensor__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RightSensor__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightSensor__Group_4__1"


    // $ANTLR start "rule__RightSensor__Group_4__1__Impl"
    // InternalPolycreate.g:3613:1: rule__RightSensor__Group_4__1__Impl : ( ( rule__RightSensor__TypeAssignment_4_1 ) ) ;
    public final void rule__RightSensor__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3617:1: ( ( ( rule__RightSensor__TypeAssignment_4_1 ) ) )
            // InternalPolycreate.g:3618:1: ( ( rule__RightSensor__TypeAssignment_4_1 ) )
            {
            // InternalPolycreate.g:3618:1: ( ( rule__RightSensor__TypeAssignment_4_1 ) )
            // InternalPolycreate.g:3619:2: ( rule__RightSensor__TypeAssignment_4_1 )
            {
             before(grammarAccess.getRightSensorAccess().getTypeAssignment_4_1()); 
            // InternalPolycreate.g:3620:2: ( rule__RightSensor__TypeAssignment_4_1 )
            // InternalPolycreate.g:3620:3: rule__RightSensor__TypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__RightSensor__TypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRightSensorAccess().getTypeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightSensor__Group_4__1__Impl"


    // $ANTLR start "rule__RightSensor__Group_5__0"
    // InternalPolycreate.g:3629:1: rule__RightSensor__Group_5__0 : rule__RightSensor__Group_5__0__Impl rule__RightSensor__Group_5__1 ;
    public final void rule__RightSensor__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3633:1: ( rule__RightSensor__Group_5__0__Impl rule__RightSensor__Group_5__1 )
            // InternalPolycreate.g:3634:2: rule__RightSensor__Group_5__0__Impl rule__RightSensor__Group_5__1
            {
            pushFollow(FOLLOW_14);
            rule__RightSensor__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RightSensor__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightSensor__Group_5__0"


    // $ANTLR start "rule__RightSensor__Group_5__0__Impl"
    // InternalPolycreate.g:3641:1: rule__RightSensor__Group_5__0__Impl : ( 'initialValue' ) ;
    public final void rule__RightSensor__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3645:1: ( ( 'initialValue' ) )
            // InternalPolycreate.g:3646:1: ( 'initialValue' )
            {
            // InternalPolycreate.g:3646:1: ( 'initialValue' )
            // InternalPolycreate.g:3647:2: 'initialValue'
            {
             before(grammarAccess.getRightSensorAccess().getInitialValueKeyword_5_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRightSensorAccess().getInitialValueKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightSensor__Group_5__0__Impl"


    // $ANTLR start "rule__RightSensor__Group_5__1"
    // InternalPolycreate.g:3656:1: rule__RightSensor__Group_5__1 : rule__RightSensor__Group_5__1__Impl ;
    public final void rule__RightSensor__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3660:1: ( rule__RightSensor__Group_5__1__Impl )
            // InternalPolycreate.g:3661:2: rule__RightSensor__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RightSensor__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightSensor__Group_5__1"


    // $ANTLR start "rule__RightSensor__Group_5__1__Impl"
    // InternalPolycreate.g:3667:1: rule__RightSensor__Group_5__1__Impl : ( ( rule__RightSensor__InitialValueAssignment_5_1 ) ) ;
    public final void rule__RightSensor__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3671:1: ( ( ( rule__RightSensor__InitialValueAssignment_5_1 ) ) )
            // InternalPolycreate.g:3672:1: ( ( rule__RightSensor__InitialValueAssignment_5_1 ) )
            {
            // InternalPolycreate.g:3672:1: ( ( rule__RightSensor__InitialValueAssignment_5_1 ) )
            // InternalPolycreate.g:3673:2: ( rule__RightSensor__InitialValueAssignment_5_1 )
            {
             before(grammarAccess.getRightSensorAccess().getInitialValueAssignment_5_1()); 
            // InternalPolycreate.g:3674:2: ( rule__RightSensor__InitialValueAssignment_5_1 )
            // InternalPolycreate.g:3674:3: rule__RightSensor__InitialValueAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__RightSensor__InitialValueAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getRightSensorAccess().getInitialValueAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightSensor__Group_5__1__Impl"


    // $ANTLR start "rule__LeftSensor__Group__0"
    // InternalPolycreate.g:3683:1: rule__LeftSensor__Group__0 : rule__LeftSensor__Group__0__Impl rule__LeftSensor__Group__1 ;
    public final void rule__LeftSensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3687:1: ( rule__LeftSensor__Group__0__Impl rule__LeftSensor__Group__1 )
            // InternalPolycreate.g:3688:2: rule__LeftSensor__Group__0__Impl rule__LeftSensor__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__LeftSensor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LeftSensor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftSensor__Group__0"


    // $ANTLR start "rule__LeftSensor__Group__0__Impl"
    // InternalPolycreate.g:3695:1: rule__LeftSensor__Group__0__Impl : ( () ) ;
    public final void rule__LeftSensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3699:1: ( ( () ) )
            // InternalPolycreate.g:3700:1: ( () )
            {
            // InternalPolycreate.g:3700:1: ( () )
            // InternalPolycreate.g:3701:2: ()
            {
             before(grammarAccess.getLeftSensorAccess().getLeftSensorAction_0()); 
            // InternalPolycreate.g:3702:2: ()
            // InternalPolycreate.g:3702:3: 
            {
            }

             after(grammarAccess.getLeftSensorAccess().getLeftSensorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftSensor__Group__0__Impl"


    // $ANTLR start "rule__LeftSensor__Group__1"
    // InternalPolycreate.g:3710:1: rule__LeftSensor__Group__1 : rule__LeftSensor__Group__1__Impl rule__LeftSensor__Group__2 ;
    public final void rule__LeftSensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3714:1: ( rule__LeftSensor__Group__1__Impl rule__LeftSensor__Group__2 )
            // InternalPolycreate.g:3715:2: rule__LeftSensor__Group__1__Impl rule__LeftSensor__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__LeftSensor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LeftSensor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftSensor__Group__1"


    // $ANTLR start "rule__LeftSensor__Group__1__Impl"
    // InternalPolycreate.g:3722:1: rule__LeftSensor__Group__1__Impl : ( 'LeftSensor' ) ;
    public final void rule__LeftSensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3726:1: ( ( 'LeftSensor' ) )
            // InternalPolycreate.g:3727:1: ( 'LeftSensor' )
            {
            // InternalPolycreate.g:3727:1: ( 'LeftSensor' )
            // InternalPolycreate.g:3728:2: 'LeftSensor'
            {
             before(grammarAccess.getLeftSensorAccess().getLeftSensorKeyword_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getLeftSensorAccess().getLeftSensorKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftSensor__Group__1__Impl"


    // $ANTLR start "rule__LeftSensor__Group__2"
    // InternalPolycreate.g:3737:1: rule__LeftSensor__Group__2 : rule__LeftSensor__Group__2__Impl rule__LeftSensor__Group__3 ;
    public final void rule__LeftSensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3741:1: ( rule__LeftSensor__Group__2__Impl rule__LeftSensor__Group__3 )
            // InternalPolycreate.g:3742:2: rule__LeftSensor__Group__2__Impl rule__LeftSensor__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__LeftSensor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LeftSensor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftSensor__Group__2"


    // $ANTLR start "rule__LeftSensor__Group__2__Impl"
    // InternalPolycreate.g:3749:1: rule__LeftSensor__Group__2__Impl : ( ( rule__LeftSensor__NameAssignment_2 ) ) ;
    public final void rule__LeftSensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3753:1: ( ( ( rule__LeftSensor__NameAssignment_2 ) ) )
            // InternalPolycreate.g:3754:1: ( ( rule__LeftSensor__NameAssignment_2 ) )
            {
            // InternalPolycreate.g:3754:1: ( ( rule__LeftSensor__NameAssignment_2 ) )
            // InternalPolycreate.g:3755:2: ( rule__LeftSensor__NameAssignment_2 )
            {
             before(grammarAccess.getLeftSensorAccess().getNameAssignment_2()); 
            // InternalPolycreate.g:3756:2: ( rule__LeftSensor__NameAssignment_2 )
            // InternalPolycreate.g:3756:3: rule__LeftSensor__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LeftSensor__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLeftSensorAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftSensor__Group__2__Impl"


    // $ANTLR start "rule__LeftSensor__Group__3"
    // InternalPolycreate.g:3764:1: rule__LeftSensor__Group__3 : rule__LeftSensor__Group__3__Impl rule__LeftSensor__Group__4 ;
    public final void rule__LeftSensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3768:1: ( rule__LeftSensor__Group__3__Impl rule__LeftSensor__Group__4 )
            // InternalPolycreate.g:3769:2: rule__LeftSensor__Group__3__Impl rule__LeftSensor__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__LeftSensor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LeftSensor__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftSensor__Group__3"


    // $ANTLR start "rule__LeftSensor__Group__3__Impl"
    // InternalPolycreate.g:3776:1: rule__LeftSensor__Group__3__Impl : ( '{' ) ;
    public final void rule__LeftSensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3780:1: ( ( '{' ) )
            // InternalPolycreate.g:3781:1: ( '{' )
            {
            // InternalPolycreate.g:3781:1: ( '{' )
            // InternalPolycreate.g:3782:2: '{'
            {
             before(grammarAccess.getLeftSensorAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getLeftSensorAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftSensor__Group__3__Impl"


    // $ANTLR start "rule__LeftSensor__Group__4"
    // InternalPolycreate.g:3791:1: rule__LeftSensor__Group__4 : rule__LeftSensor__Group__4__Impl rule__LeftSensor__Group__5 ;
    public final void rule__LeftSensor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3795:1: ( rule__LeftSensor__Group__4__Impl rule__LeftSensor__Group__5 )
            // InternalPolycreate.g:3796:2: rule__LeftSensor__Group__4__Impl rule__LeftSensor__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__LeftSensor__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LeftSensor__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftSensor__Group__4"


    // $ANTLR start "rule__LeftSensor__Group__4__Impl"
    // InternalPolycreate.g:3803:1: rule__LeftSensor__Group__4__Impl : ( ( rule__LeftSensor__Group_4__0 )? ) ;
    public final void rule__LeftSensor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3807:1: ( ( ( rule__LeftSensor__Group_4__0 )? ) )
            // InternalPolycreate.g:3808:1: ( ( rule__LeftSensor__Group_4__0 )? )
            {
            // InternalPolycreate.g:3808:1: ( ( rule__LeftSensor__Group_4__0 )? )
            // InternalPolycreate.g:3809:2: ( rule__LeftSensor__Group_4__0 )?
            {
             before(grammarAccess.getLeftSensorAccess().getGroup_4()); 
            // InternalPolycreate.g:3810:2: ( rule__LeftSensor__Group_4__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==29) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalPolycreate.g:3810:3: rule__LeftSensor__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LeftSensor__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLeftSensorAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftSensor__Group__4__Impl"


    // $ANTLR start "rule__LeftSensor__Group__5"
    // InternalPolycreate.g:3818:1: rule__LeftSensor__Group__5 : rule__LeftSensor__Group__5__Impl rule__LeftSensor__Group__6 ;
    public final void rule__LeftSensor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3822:1: ( rule__LeftSensor__Group__5__Impl rule__LeftSensor__Group__6 )
            // InternalPolycreate.g:3823:2: rule__LeftSensor__Group__5__Impl rule__LeftSensor__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__LeftSensor__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LeftSensor__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftSensor__Group__5"


    // $ANTLR start "rule__LeftSensor__Group__5__Impl"
    // InternalPolycreate.g:3830:1: rule__LeftSensor__Group__5__Impl : ( ( rule__LeftSensor__Group_5__0 )? ) ;
    public final void rule__LeftSensor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3834:1: ( ( ( rule__LeftSensor__Group_5__0 )? ) )
            // InternalPolycreate.g:3835:1: ( ( rule__LeftSensor__Group_5__0 )? )
            {
            // InternalPolycreate.g:3835:1: ( ( rule__LeftSensor__Group_5__0 )? )
            // InternalPolycreate.g:3836:2: ( rule__LeftSensor__Group_5__0 )?
            {
             before(grammarAccess.getLeftSensorAccess().getGroup_5()); 
            // InternalPolycreate.g:3837:2: ( rule__LeftSensor__Group_5__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==30) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalPolycreate.g:3837:3: rule__LeftSensor__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LeftSensor__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLeftSensorAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftSensor__Group__5__Impl"


    // $ANTLR start "rule__LeftSensor__Group__6"
    // InternalPolycreate.g:3845:1: rule__LeftSensor__Group__6 : rule__LeftSensor__Group__6__Impl ;
    public final void rule__LeftSensor__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3849:1: ( rule__LeftSensor__Group__6__Impl )
            // InternalPolycreate.g:3850:2: rule__LeftSensor__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LeftSensor__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftSensor__Group__6"


    // $ANTLR start "rule__LeftSensor__Group__6__Impl"
    // InternalPolycreate.g:3856:1: rule__LeftSensor__Group__6__Impl : ( '}' ) ;
    public final void rule__LeftSensor__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3860:1: ( ( '}' ) )
            // InternalPolycreate.g:3861:1: ( '}' )
            {
            // InternalPolycreate.g:3861:1: ( '}' )
            // InternalPolycreate.g:3862:2: '}'
            {
             before(grammarAccess.getLeftSensorAccess().getRightCurlyBracketKeyword_6()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getLeftSensorAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftSensor__Group__6__Impl"


    // $ANTLR start "rule__LeftSensor__Group_4__0"
    // InternalPolycreate.g:3872:1: rule__LeftSensor__Group_4__0 : rule__LeftSensor__Group_4__0__Impl rule__LeftSensor__Group_4__1 ;
    public final void rule__LeftSensor__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3876:1: ( rule__LeftSensor__Group_4__0__Impl rule__LeftSensor__Group_4__1 )
            // InternalPolycreate.g:3877:2: rule__LeftSensor__Group_4__0__Impl rule__LeftSensor__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__LeftSensor__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LeftSensor__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftSensor__Group_4__0"


    // $ANTLR start "rule__LeftSensor__Group_4__0__Impl"
    // InternalPolycreate.g:3884:1: rule__LeftSensor__Group_4__0__Impl : ( 'type' ) ;
    public final void rule__LeftSensor__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3888:1: ( ( 'type' ) )
            // InternalPolycreate.g:3889:1: ( 'type' )
            {
            // InternalPolycreate.g:3889:1: ( 'type' )
            // InternalPolycreate.g:3890:2: 'type'
            {
             before(grammarAccess.getLeftSensorAccess().getTypeKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getLeftSensorAccess().getTypeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftSensor__Group_4__0__Impl"


    // $ANTLR start "rule__LeftSensor__Group_4__1"
    // InternalPolycreate.g:3899:1: rule__LeftSensor__Group_4__1 : rule__LeftSensor__Group_4__1__Impl ;
    public final void rule__LeftSensor__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3903:1: ( rule__LeftSensor__Group_4__1__Impl )
            // InternalPolycreate.g:3904:2: rule__LeftSensor__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LeftSensor__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftSensor__Group_4__1"


    // $ANTLR start "rule__LeftSensor__Group_4__1__Impl"
    // InternalPolycreate.g:3910:1: rule__LeftSensor__Group_4__1__Impl : ( ( rule__LeftSensor__TypeAssignment_4_1 ) ) ;
    public final void rule__LeftSensor__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3914:1: ( ( ( rule__LeftSensor__TypeAssignment_4_1 ) ) )
            // InternalPolycreate.g:3915:1: ( ( rule__LeftSensor__TypeAssignment_4_1 ) )
            {
            // InternalPolycreate.g:3915:1: ( ( rule__LeftSensor__TypeAssignment_4_1 ) )
            // InternalPolycreate.g:3916:2: ( rule__LeftSensor__TypeAssignment_4_1 )
            {
             before(grammarAccess.getLeftSensorAccess().getTypeAssignment_4_1()); 
            // InternalPolycreate.g:3917:2: ( rule__LeftSensor__TypeAssignment_4_1 )
            // InternalPolycreate.g:3917:3: rule__LeftSensor__TypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__LeftSensor__TypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getLeftSensorAccess().getTypeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftSensor__Group_4__1__Impl"


    // $ANTLR start "rule__LeftSensor__Group_5__0"
    // InternalPolycreate.g:3926:1: rule__LeftSensor__Group_5__0 : rule__LeftSensor__Group_5__0__Impl rule__LeftSensor__Group_5__1 ;
    public final void rule__LeftSensor__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3930:1: ( rule__LeftSensor__Group_5__0__Impl rule__LeftSensor__Group_5__1 )
            // InternalPolycreate.g:3931:2: rule__LeftSensor__Group_5__0__Impl rule__LeftSensor__Group_5__1
            {
            pushFollow(FOLLOW_14);
            rule__LeftSensor__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LeftSensor__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftSensor__Group_5__0"


    // $ANTLR start "rule__LeftSensor__Group_5__0__Impl"
    // InternalPolycreate.g:3938:1: rule__LeftSensor__Group_5__0__Impl : ( 'initialValue' ) ;
    public final void rule__LeftSensor__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3942:1: ( ( 'initialValue' ) )
            // InternalPolycreate.g:3943:1: ( 'initialValue' )
            {
            // InternalPolycreate.g:3943:1: ( 'initialValue' )
            // InternalPolycreate.g:3944:2: 'initialValue'
            {
             before(grammarAccess.getLeftSensorAccess().getInitialValueKeyword_5_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getLeftSensorAccess().getInitialValueKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftSensor__Group_5__0__Impl"


    // $ANTLR start "rule__LeftSensor__Group_5__1"
    // InternalPolycreate.g:3953:1: rule__LeftSensor__Group_5__1 : rule__LeftSensor__Group_5__1__Impl ;
    public final void rule__LeftSensor__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3957:1: ( rule__LeftSensor__Group_5__1__Impl )
            // InternalPolycreate.g:3958:2: rule__LeftSensor__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LeftSensor__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftSensor__Group_5__1"


    // $ANTLR start "rule__LeftSensor__Group_5__1__Impl"
    // InternalPolycreate.g:3964:1: rule__LeftSensor__Group_5__1__Impl : ( ( rule__LeftSensor__InitialValueAssignment_5_1 ) ) ;
    public final void rule__LeftSensor__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3968:1: ( ( ( rule__LeftSensor__InitialValueAssignment_5_1 ) ) )
            // InternalPolycreate.g:3969:1: ( ( rule__LeftSensor__InitialValueAssignment_5_1 ) )
            {
            // InternalPolycreate.g:3969:1: ( ( rule__LeftSensor__InitialValueAssignment_5_1 ) )
            // InternalPolycreate.g:3970:2: ( rule__LeftSensor__InitialValueAssignment_5_1 )
            {
             before(grammarAccess.getLeftSensorAccess().getInitialValueAssignment_5_1()); 
            // InternalPolycreate.g:3971:2: ( rule__LeftSensor__InitialValueAssignment_5_1 )
            // InternalPolycreate.g:3971:3: rule__LeftSensor__InitialValueAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__LeftSensor__InitialValueAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getLeftSensorAccess().getInitialValueAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftSensor__Group_5__1__Impl"


    // $ANTLR start "rule__Object__Group__0"
    // InternalPolycreate.g:3980:1: rule__Object__Group__0 : rule__Object__Group__0__Impl rule__Object__Group__1 ;
    public final void rule__Object__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3984:1: ( rule__Object__Group__0__Impl rule__Object__Group__1 )
            // InternalPolycreate.g:3985:2: rule__Object__Group__0__Impl rule__Object__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Object__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__0"


    // $ANTLR start "rule__Object__Group__0__Impl"
    // InternalPolycreate.g:3992:1: rule__Object__Group__0__Impl : ( () ) ;
    public final void rule__Object__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3996:1: ( ( () ) )
            // InternalPolycreate.g:3997:1: ( () )
            {
            // InternalPolycreate.g:3997:1: ( () )
            // InternalPolycreate.g:3998:2: ()
            {
             before(grammarAccess.getObjectAccess().getObjectAction_0()); 
            // InternalPolycreate.g:3999:2: ()
            // InternalPolycreate.g:3999:3: 
            {
            }

             after(grammarAccess.getObjectAccess().getObjectAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__0__Impl"


    // $ANTLR start "rule__Object__Group__1"
    // InternalPolycreate.g:4007:1: rule__Object__Group__1 : rule__Object__Group__1__Impl rule__Object__Group__2 ;
    public final void rule__Object__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4011:1: ( rule__Object__Group__1__Impl rule__Object__Group__2 )
            // InternalPolycreate.g:4012:2: rule__Object__Group__1__Impl rule__Object__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Object__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__1"


    // $ANTLR start "rule__Object__Group__1__Impl"
    // InternalPolycreate.g:4019:1: rule__Object__Group__1__Impl : ( 'Object' ) ;
    public final void rule__Object__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4023:1: ( ( 'Object' ) )
            // InternalPolycreate.g:4024:1: ( 'Object' )
            {
            // InternalPolycreate.g:4024:1: ( 'Object' )
            // InternalPolycreate.g:4025:2: 'Object'
            {
             before(grammarAccess.getObjectAccess().getObjectKeyword_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getObjectKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__1__Impl"


    // $ANTLR start "rule__Object__Group__2"
    // InternalPolycreate.g:4034:1: rule__Object__Group__2 : rule__Object__Group__2__Impl rule__Object__Group__3 ;
    public final void rule__Object__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4038:1: ( rule__Object__Group__2__Impl rule__Object__Group__3 )
            // InternalPolycreate.g:4039:2: rule__Object__Group__2__Impl rule__Object__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Object__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__2"


    // $ANTLR start "rule__Object__Group__2__Impl"
    // InternalPolycreate.g:4046:1: rule__Object__Group__2__Impl : ( ( rule__Object__NameAssignment_2 ) ) ;
    public final void rule__Object__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4050:1: ( ( ( rule__Object__NameAssignment_2 ) ) )
            // InternalPolycreate.g:4051:1: ( ( rule__Object__NameAssignment_2 ) )
            {
            // InternalPolycreate.g:4051:1: ( ( rule__Object__NameAssignment_2 ) )
            // InternalPolycreate.g:4052:2: ( rule__Object__NameAssignment_2 )
            {
             before(grammarAccess.getObjectAccess().getNameAssignment_2()); 
            // InternalPolycreate.g:4053:2: ( rule__Object__NameAssignment_2 )
            // InternalPolycreate.g:4053:3: rule__Object__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Object__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__2__Impl"


    // $ANTLR start "rule__Object__Group__3"
    // InternalPolycreate.g:4061:1: rule__Object__Group__3 : rule__Object__Group__3__Impl rule__Object__Group__4 ;
    public final void rule__Object__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4065:1: ( rule__Object__Group__3__Impl rule__Object__Group__4 )
            // InternalPolycreate.g:4066:2: rule__Object__Group__3__Impl rule__Object__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__Object__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__3"


    // $ANTLR start "rule__Object__Group__3__Impl"
    // InternalPolycreate.g:4073:1: rule__Object__Group__3__Impl : ( '{' ) ;
    public final void rule__Object__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4077:1: ( ( '{' ) )
            // InternalPolycreate.g:4078:1: ( '{' )
            {
            // InternalPolycreate.g:4078:1: ( '{' )
            // InternalPolycreate.g:4079:2: '{'
            {
             before(grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__3__Impl"


    // $ANTLR start "rule__Object__Group__4"
    // InternalPolycreate.g:4088:1: rule__Object__Group__4 : rule__Object__Group__4__Impl rule__Object__Group__5 ;
    public final void rule__Object__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4092:1: ( rule__Object__Group__4__Impl rule__Object__Group__5 )
            // InternalPolycreate.g:4093:2: rule__Object__Group__4__Impl rule__Object__Group__5
            {
            pushFollow(FOLLOW_33);
            rule__Object__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__4"


    // $ANTLR start "rule__Object__Group__4__Impl"
    // InternalPolycreate.g:4100:1: rule__Object__Group__4__Impl : ( ( rule__Object__Group_4__0 )? ) ;
    public final void rule__Object__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4104:1: ( ( ( rule__Object__Group_4__0 )? ) )
            // InternalPolycreate.g:4105:1: ( ( rule__Object__Group_4__0 )? )
            {
            // InternalPolycreate.g:4105:1: ( ( rule__Object__Group_4__0 )? )
            // InternalPolycreate.g:4106:2: ( rule__Object__Group_4__0 )?
            {
             before(grammarAccess.getObjectAccess().getGroup_4()); 
            // InternalPolycreate.g:4107:2: ( rule__Object__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==29) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalPolycreate.g:4107:3: rule__Object__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Object__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjectAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__4__Impl"


    // $ANTLR start "rule__Object__Group__5"
    // InternalPolycreate.g:4115:1: rule__Object__Group__5 : rule__Object__Group__5__Impl rule__Object__Group__6 ;
    public final void rule__Object__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4119:1: ( rule__Object__Group__5__Impl rule__Object__Group__6 )
            // InternalPolycreate.g:4120:2: rule__Object__Group__5__Impl rule__Object__Group__6
            {
            pushFollow(FOLLOW_33);
            rule__Object__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__5"


    // $ANTLR start "rule__Object__Group__5__Impl"
    // InternalPolycreate.g:4127:1: rule__Object__Group__5__Impl : ( ( rule__Object__Group_5__0 )? ) ;
    public final void rule__Object__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4131:1: ( ( ( rule__Object__Group_5__0 )? ) )
            // InternalPolycreate.g:4132:1: ( ( rule__Object__Group_5__0 )? )
            {
            // InternalPolycreate.g:4132:1: ( ( rule__Object__Group_5__0 )? )
            // InternalPolycreate.g:4133:2: ( rule__Object__Group_5__0 )?
            {
             before(grammarAccess.getObjectAccess().getGroup_5()); 
            // InternalPolycreate.g:4134:2: ( rule__Object__Group_5__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==30) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalPolycreate.g:4134:3: rule__Object__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Object__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjectAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__5__Impl"


    // $ANTLR start "rule__Object__Group__6"
    // InternalPolycreate.g:4142:1: rule__Object__Group__6 : rule__Object__Group__6__Impl rule__Object__Group__7 ;
    public final void rule__Object__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4146:1: ( rule__Object__Group__6__Impl rule__Object__Group__7 )
            // InternalPolycreate.g:4147:2: rule__Object__Group__6__Impl rule__Object__Group__7
            {
            pushFollow(FOLLOW_33);
            rule__Object__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__6"


    // $ANTLR start "rule__Object__Group__6__Impl"
    // InternalPolycreate.g:4154:1: rule__Object__Group__6__Impl : ( ( rule__Object__Group_6__0 )? ) ;
    public final void rule__Object__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4158:1: ( ( ( rule__Object__Group_6__0 )? ) )
            // InternalPolycreate.g:4159:1: ( ( rule__Object__Group_6__0 )? )
            {
            // InternalPolycreate.g:4159:1: ( ( rule__Object__Group_6__0 )? )
            // InternalPolycreate.g:4160:2: ( rule__Object__Group_6__0 )?
            {
             before(grammarAccess.getObjectAccess().getGroup_6()); 
            // InternalPolycreate.g:4161:2: ( rule__Object__Group_6__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==53) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalPolycreate.g:4161:3: rule__Object__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Object__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjectAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__6__Impl"


    // $ANTLR start "rule__Object__Group__7"
    // InternalPolycreate.g:4169:1: rule__Object__Group__7 : rule__Object__Group__7__Impl ;
    public final void rule__Object__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4173:1: ( rule__Object__Group__7__Impl )
            // InternalPolycreate.g:4174:2: rule__Object__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__7"


    // $ANTLR start "rule__Object__Group__7__Impl"
    // InternalPolycreate.g:4180:1: rule__Object__Group__7__Impl : ( '}' ) ;
    public final void rule__Object__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4184:1: ( ( '}' ) )
            // InternalPolycreate.g:4185:1: ( '}' )
            {
            // InternalPolycreate.g:4185:1: ( '}' )
            // InternalPolycreate.g:4186:2: '}'
            {
             before(grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__7__Impl"


    // $ANTLR start "rule__Object__Group_4__0"
    // InternalPolycreate.g:4196:1: rule__Object__Group_4__0 : rule__Object__Group_4__0__Impl rule__Object__Group_4__1 ;
    public final void rule__Object__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4200:1: ( rule__Object__Group_4__0__Impl rule__Object__Group_4__1 )
            // InternalPolycreate.g:4201:2: rule__Object__Group_4__0__Impl rule__Object__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__Object__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_4__0"


    // $ANTLR start "rule__Object__Group_4__0__Impl"
    // InternalPolycreate.g:4208:1: rule__Object__Group_4__0__Impl : ( 'type' ) ;
    public final void rule__Object__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4212:1: ( ( 'type' ) )
            // InternalPolycreate.g:4213:1: ( 'type' )
            {
            // InternalPolycreate.g:4213:1: ( 'type' )
            // InternalPolycreate.g:4214:2: 'type'
            {
             before(grammarAccess.getObjectAccess().getTypeKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getTypeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_4__0__Impl"


    // $ANTLR start "rule__Object__Group_4__1"
    // InternalPolycreate.g:4223:1: rule__Object__Group_4__1 : rule__Object__Group_4__1__Impl ;
    public final void rule__Object__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4227:1: ( rule__Object__Group_4__1__Impl )
            // InternalPolycreate.g:4228:2: rule__Object__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_4__1"


    // $ANTLR start "rule__Object__Group_4__1__Impl"
    // InternalPolycreate.g:4234:1: rule__Object__Group_4__1__Impl : ( ( rule__Object__TypeAssignment_4_1 ) ) ;
    public final void rule__Object__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4238:1: ( ( ( rule__Object__TypeAssignment_4_1 ) ) )
            // InternalPolycreate.g:4239:1: ( ( rule__Object__TypeAssignment_4_1 ) )
            {
            // InternalPolycreate.g:4239:1: ( ( rule__Object__TypeAssignment_4_1 ) )
            // InternalPolycreate.g:4240:2: ( rule__Object__TypeAssignment_4_1 )
            {
             before(grammarAccess.getObjectAccess().getTypeAssignment_4_1()); 
            // InternalPolycreate.g:4241:2: ( rule__Object__TypeAssignment_4_1 )
            // InternalPolycreate.g:4241:3: rule__Object__TypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Object__TypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getTypeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_4__1__Impl"


    // $ANTLR start "rule__Object__Group_5__0"
    // InternalPolycreate.g:4250:1: rule__Object__Group_5__0 : rule__Object__Group_5__0__Impl rule__Object__Group_5__1 ;
    public final void rule__Object__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4254:1: ( rule__Object__Group_5__0__Impl rule__Object__Group_5__1 )
            // InternalPolycreate.g:4255:2: rule__Object__Group_5__0__Impl rule__Object__Group_5__1
            {
            pushFollow(FOLLOW_14);
            rule__Object__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_5__0"


    // $ANTLR start "rule__Object__Group_5__0__Impl"
    // InternalPolycreate.g:4262:1: rule__Object__Group_5__0__Impl : ( 'initialValue' ) ;
    public final void rule__Object__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4266:1: ( ( 'initialValue' ) )
            // InternalPolycreate.g:4267:1: ( 'initialValue' )
            {
            // InternalPolycreate.g:4267:1: ( 'initialValue' )
            // InternalPolycreate.g:4268:2: 'initialValue'
            {
             before(grammarAccess.getObjectAccess().getInitialValueKeyword_5_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getInitialValueKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_5__0__Impl"


    // $ANTLR start "rule__Object__Group_5__1"
    // InternalPolycreate.g:4277:1: rule__Object__Group_5__1 : rule__Object__Group_5__1__Impl ;
    public final void rule__Object__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4281:1: ( rule__Object__Group_5__1__Impl )
            // InternalPolycreate.g:4282:2: rule__Object__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_5__1"


    // $ANTLR start "rule__Object__Group_5__1__Impl"
    // InternalPolycreate.g:4288:1: rule__Object__Group_5__1__Impl : ( ( rule__Object__InitialValueAssignment_5_1 ) ) ;
    public final void rule__Object__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4292:1: ( ( ( rule__Object__InitialValueAssignment_5_1 ) ) )
            // InternalPolycreate.g:4293:1: ( ( rule__Object__InitialValueAssignment_5_1 ) )
            {
            // InternalPolycreate.g:4293:1: ( ( rule__Object__InitialValueAssignment_5_1 ) )
            // InternalPolycreate.g:4294:2: ( rule__Object__InitialValueAssignment_5_1 )
            {
             before(grammarAccess.getObjectAccess().getInitialValueAssignment_5_1()); 
            // InternalPolycreate.g:4295:2: ( rule__Object__InitialValueAssignment_5_1 )
            // InternalPolycreate.g:4295:3: rule__Object__InitialValueAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Object__InitialValueAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getInitialValueAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_5__1__Impl"


    // $ANTLR start "rule__Object__Group_6__0"
    // InternalPolycreate.g:4304:1: rule__Object__Group_6__0 : rule__Object__Group_6__0__Impl rule__Object__Group_6__1 ;
    public final void rule__Object__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4308:1: ( rule__Object__Group_6__0__Impl rule__Object__Group_6__1 )
            // InternalPolycreate.g:4309:2: rule__Object__Group_6__0__Impl rule__Object__Group_6__1
            {
            pushFollow(FOLLOW_13);
            rule__Object__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_6__0"


    // $ANTLR start "rule__Object__Group_6__0__Impl"
    // InternalPolycreate.g:4316:1: rule__Object__Group_6__0__Impl : ( 'position' ) ;
    public final void rule__Object__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4320:1: ( ( 'position' ) )
            // InternalPolycreate.g:4321:1: ( 'position' )
            {
            // InternalPolycreate.g:4321:1: ( 'position' )
            // InternalPolycreate.g:4322:2: 'position'
            {
             before(grammarAccess.getObjectAccess().getPositionKeyword_6_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getPositionKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_6__0__Impl"


    // $ANTLR start "rule__Object__Group_6__1"
    // InternalPolycreate.g:4331:1: rule__Object__Group_6__1 : rule__Object__Group_6__1__Impl ;
    public final void rule__Object__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4335:1: ( rule__Object__Group_6__1__Impl )
            // InternalPolycreate.g:4336:2: rule__Object__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_6__1"


    // $ANTLR start "rule__Object__Group_6__1__Impl"
    // InternalPolycreate.g:4342:1: rule__Object__Group_6__1__Impl : ( ( rule__Object__PositionAssignment_6_1 ) ) ;
    public final void rule__Object__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4346:1: ( ( ( rule__Object__PositionAssignment_6_1 ) ) )
            // InternalPolycreate.g:4347:1: ( ( rule__Object__PositionAssignment_6_1 ) )
            {
            // InternalPolycreate.g:4347:1: ( ( rule__Object__PositionAssignment_6_1 ) )
            // InternalPolycreate.g:4348:2: ( rule__Object__PositionAssignment_6_1 )
            {
             before(grammarAccess.getObjectAccess().getPositionAssignment_6_1()); 
            // InternalPolycreate.g:4349:2: ( rule__Object__PositionAssignment_6_1 )
            // InternalPolycreate.g:4349:3: rule__Object__PositionAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Object__PositionAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getPositionAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_6__1__Impl"


    // $ANTLR start "rule__Polycreate__NameAssignment_2"
    // InternalPolycreate.g:4358:1: rule__Polycreate__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Polycreate__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4362:1: ( ( ruleEString ) )
            // InternalPolycreate.g:4363:2: ( ruleEString )
            {
            // InternalPolycreate.g:4363:2: ( ruleEString )
            // InternalPolycreate.g:4364:3: ruleEString
            {
             before(grammarAccess.getPolycreateAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPolycreateAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polycreate__NameAssignment_2"


    // $ANTLR start "rule__Polycreate__OperationAssignment_4_2"
    // InternalPolycreate.g:4373:1: rule__Polycreate__OperationAssignment_4_2 : ( ruleOperation ) ;
    public final void rule__Polycreate__OperationAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4377:1: ( ( ruleOperation ) )
            // InternalPolycreate.g:4378:2: ( ruleOperation )
            {
            // InternalPolycreate.g:4378:2: ( ruleOperation )
            // InternalPolycreate.g:4379:3: ruleOperation
            {
             before(grammarAccess.getPolycreateAccess().getOperationOperationParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getPolycreateAccess().getOperationOperationParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polycreate__OperationAssignment_4_2"


    // $ANTLR start "rule__Polycreate__OperationAssignment_4_3_1"
    // InternalPolycreate.g:4388:1: rule__Polycreate__OperationAssignment_4_3_1 : ( ruleOperation ) ;
    public final void rule__Polycreate__OperationAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4392:1: ( ( ruleOperation ) )
            // InternalPolycreate.g:4393:2: ( ruleOperation )
            {
            // InternalPolycreate.g:4393:2: ( ruleOperation )
            // InternalPolycreate.g:4394:3: ruleOperation
            {
             before(grammarAccess.getPolycreateAccess().getOperationOperationParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getPolycreateAccess().getOperationOperationParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polycreate__OperationAssignment_4_3_1"


    // $ANTLR start "rule__Polycreate__VariableAssignment_5_2"
    // InternalPolycreate.g:4403:1: rule__Polycreate__VariableAssignment_5_2 : ( ruleVariable ) ;
    public final void rule__Polycreate__VariableAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4407:1: ( ( ruleVariable ) )
            // InternalPolycreate.g:4408:2: ( ruleVariable )
            {
            // InternalPolycreate.g:4408:2: ( ruleVariable )
            // InternalPolycreate.g:4409:3: ruleVariable
            {
             before(grammarAccess.getPolycreateAccess().getVariableVariableParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getPolycreateAccess().getVariableVariableParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polycreate__VariableAssignment_5_2"


    // $ANTLR start "rule__Polycreate__VariableAssignment_5_3_1"
    // InternalPolycreate.g:4418:1: rule__Polycreate__VariableAssignment_5_3_1 : ( ruleVariable ) ;
    public final void rule__Polycreate__VariableAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4422:1: ( ( ruleVariable ) )
            // InternalPolycreate.g:4423:2: ( ruleVariable )
            {
            // InternalPolycreate.g:4423:2: ( ruleVariable )
            // InternalPolycreate.g:4424:3: ruleVariable
            {
             before(grammarAccess.getPolycreateAccess().getVariableVariableParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getPolycreateAccess().getVariableVariableParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polycreate__VariableAssignment_5_3_1"


    // $ANTLR start "rule__Variable_Impl__NameAssignment_2"
    // InternalPolycreate.g:4433:1: rule__Variable_Impl__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Variable_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4437:1: ( ( ruleEString ) )
            // InternalPolycreate.g:4438:2: ( ruleEString )
            {
            // InternalPolycreate.g:4438:2: ( ruleEString )
            // InternalPolycreate.g:4439:3: ruleEString
            {
             before(grammarAccess.getVariable_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVariable_ImplAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_Impl__NameAssignment_2"


    // $ANTLR start "rule__Variable_Impl__TypeAssignment_4_1"
    // InternalPolycreate.g:4448:1: rule__Variable_Impl__TypeAssignment_4_1 : ( ruleVarType ) ;
    public final void rule__Variable_Impl__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4452:1: ( ( ruleVarType ) )
            // InternalPolycreate.g:4453:2: ( ruleVarType )
            {
            // InternalPolycreate.g:4453:2: ( ruleVarType )
            // InternalPolycreate.g:4454:3: ruleVarType
            {
             before(grammarAccess.getVariable_ImplAccess().getTypeVarTypeEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVarType();

            state._fsp--;

             after(grammarAccess.getVariable_ImplAccess().getTypeVarTypeEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_Impl__TypeAssignment_4_1"


    // $ANTLR start "rule__Variable_Impl__InitialValueAssignment_5_1"
    // InternalPolycreate.g:4463:1: rule__Variable_Impl__InitialValueAssignment_5_1 : ( ruleEDouble ) ;
    public final void rule__Variable_Impl__InitialValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4467:1: ( ( ruleEDouble ) )
            // InternalPolycreate.g:4468:2: ( ruleEDouble )
            {
            // InternalPolycreate.g:4468:2: ( ruleEDouble )
            // InternalPolycreate.g:4469:3: ruleEDouble
            {
             before(grammarAccess.getVariable_ImplAccess().getInitialValueEDoubleParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getVariable_ImplAccess().getInitialValueEDoubleParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_Impl__InitialValueAssignment_5_1"


    // $ANTLR start "rule__StructuralCondition__ThenAssignment_2_2"
    // InternalPolycreate.g:4478:1: rule__StructuralCondition__ThenAssignment_2_2 : ( ( ruleEString ) ) ;
    public final void rule__StructuralCondition__ThenAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4482:1: ( ( ( ruleEString ) ) )
            // InternalPolycreate.g:4483:2: ( ( ruleEString ) )
            {
            // InternalPolycreate.g:4483:2: ( ( ruleEString ) )
            // InternalPolycreate.g:4484:3: ( ruleEString )
            {
             before(grammarAccess.getStructuralConditionAccess().getThenOperationCrossReference_2_2_0()); 
            // InternalPolycreate.g:4485:3: ( ruleEString )
            // InternalPolycreate.g:4486:4: ruleEString
            {
             before(grammarAccess.getStructuralConditionAccess().getThenOperationEStringParserRuleCall_2_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStructuralConditionAccess().getThenOperationEStringParserRuleCall_2_2_0_1()); 

            }

             after(grammarAccess.getStructuralConditionAccess().getThenOperationCrossReference_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__ThenAssignment_2_2"


    // $ANTLR start "rule__StructuralCondition__ThenAssignment_2_3_1"
    // InternalPolycreate.g:4497:1: rule__StructuralCondition__ThenAssignment_2_3_1 : ( ( ruleEString ) ) ;
    public final void rule__StructuralCondition__ThenAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4501:1: ( ( ( ruleEString ) ) )
            // InternalPolycreate.g:4502:2: ( ( ruleEString ) )
            {
            // InternalPolycreate.g:4502:2: ( ( ruleEString ) )
            // InternalPolycreate.g:4503:3: ( ruleEString )
            {
             before(grammarAccess.getStructuralConditionAccess().getThenOperationCrossReference_2_3_1_0()); 
            // InternalPolycreate.g:4504:3: ( ruleEString )
            // InternalPolycreate.g:4505:4: ruleEString
            {
             before(grammarAccess.getStructuralConditionAccess().getThenOperationEStringParserRuleCall_2_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStructuralConditionAccess().getThenOperationEStringParserRuleCall_2_3_1_0_1()); 

            }

             after(grammarAccess.getStructuralConditionAccess().getThenOperationCrossReference_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__ThenAssignment_2_3_1"


    // $ANTLR start "rule__StructuralCondition__ElseAssignment_3_2"
    // InternalPolycreate.g:4516:1: rule__StructuralCondition__ElseAssignment_3_2 : ( ( ruleEString ) ) ;
    public final void rule__StructuralCondition__ElseAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4520:1: ( ( ( ruleEString ) ) )
            // InternalPolycreate.g:4521:2: ( ( ruleEString ) )
            {
            // InternalPolycreate.g:4521:2: ( ( ruleEString ) )
            // InternalPolycreate.g:4522:3: ( ruleEString )
            {
             before(grammarAccess.getStructuralConditionAccess().getElseOperationCrossReference_3_2_0()); 
            // InternalPolycreate.g:4523:3: ( ruleEString )
            // InternalPolycreate.g:4524:4: ruleEString
            {
             before(grammarAccess.getStructuralConditionAccess().getElseOperationEStringParserRuleCall_3_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStructuralConditionAccess().getElseOperationEStringParserRuleCall_3_2_0_1()); 

            }

             after(grammarAccess.getStructuralConditionAccess().getElseOperationCrossReference_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__ElseAssignment_3_2"


    // $ANTLR start "rule__StructuralCondition__ElseAssignment_3_3_1"
    // InternalPolycreate.g:4535:1: rule__StructuralCondition__ElseAssignment_3_3_1 : ( ( ruleEString ) ) ;
    public final void rule__StructuralCondition__ElseAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4539:1: ( ( ( ruleEString ) ) )
            // InternalPolycreate.g:4540:2: ( ( ruleEString ) )
            {
            // InternalPolycreate.g:4540:2: ( ( ruleEString ) )
            // InternalPolycreate.g:4541:3: ( ruleEString )
            {
             before(grammarAccess.getStructuralConditionAccess().getElseOperationCrossReference_3_3_1_0()); 
            // InternalPolycreate.g:4542:3: ( ruleEString )
            // InternalPolycreate.g:4543:4: ruleEString
            {
             before(grammarAccess.getStructuralConditionAccess().getElseOperationEStringParserRuleCall_3_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStructuralConditionAccess().getElseOperationEStringParserRuleCall_3_3_1_0_1()); 

            }

             after(grammarAccess.getStructuralConditionAccess().getElseOperationCrossReference_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__ElseAssignment_3_3_1"


    // $ANTLR start "rule__StructuralCondition__IfAssignment_6"
    // InternalPolycreate.g:4554:1: rule__StructuralCondition__IfAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__StructuralCondition__IfAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4558:1: ( ( ( ruleEString ) ) )
            // InternalPolycreate.g:4559:2: ( ( ruleEString ) )
            {
            // InternalPolycreate.g:4559:2: ( ( ruleEString ) )
            // InternalPolycreate.g:4560:3: ( ruleEString )
            {
             before(grammarAccess.getStructuralConditionAccess().getIfConditionCrossReference_6_0()); 
            // InternalPolycreate.g:4561:3: ( ruleEString )
            // InternalPolycreate.g:4562:4: ruleEString
            {
             before(grammarAccess.getStructuralConditionAccess().getIfConditionEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStructuralConditionAccess().getIfConditionEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getStructuralConditionAccess().getIfConditionCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__IfAssignment_6"


    // $ANTLR start "rule__StructuralCondition__IfAssignment_7_1"
    // InternalPolycreate.g:4573:1: rule__StructuralCondition__IfAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__StructuralCondition__IfAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4577:1: ( ( ( ruleEString ) ) )
            // InternalPolycreate.g:4578:2: ( ( ruleEString ) )
            {
            // InternalPolycreate.g:4578:2: ( ( ruleEString ) )
            // InternalPolycreate.g:4579:3: ( ruleEString )
            {
             before(grammarAccess.getStructuralConditionAccess().getIfConditionCrossReference_7_1_0()); 
            // InternalPolycreate.g:4580:3: ( ruleEString )
            // InternalPolycreate.g:4581:4: ruleEString
            {
             before(grammarAccess.getStructuralConditionAccess().getIfConditionEStringParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStructuralConditionAccess().getIfConditionEStringParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getStructuralConditionAccess().getIfConditionCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralCondition__IfAssignment_7_1"


    // $ANTLR start "rule__Comparison__ValueAssignment_2_1"
    // InternalPolycreate.g:4592:1: rule__Comparison__ValueAssignment_2_1 : ( ruleVarType ) ;
    public final void rule__Comparison__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4596:1: ( ( ruleVarType ) )
            // InternalPolycreate.g:4597:2: ( ruleVarType )
            {
            // InternalPolycreate.g:4597:2: ( ruleVarType )
            // InternalPolycreate.g:4598:3: ruleVarType
            {
             before(grammarAccess.getComparisonAccess().getValueVarTypeEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVarType();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getValueVarTypeEnumRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__ValueAssignment_2_1"


    // $ANTLR start "rule__Comparison__LeftVariableAssignment_4"
    // InternalPolycreate.g:4607:1: rule__Comparison__LeftVariableAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Comparison__LeftVariableAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4611:1: ( ( ( ruleEString ) ) )
            // InternalPolycreate.g:4612:2: ( ( ruleEString ) )
            {
            // InternalPolycreate.g:4612:2: ( ( ruleEString ) )
            // InternalPolycreate.g:4613:3: ( ruleEString )
            {
             before(grammarAccess.getComparisonAccess().getLeftVariableVariableCrossReference_4_0()); 
            // InternalPolycreate.g:4614:3: ( ruleEString )
            // InternalPolycreate.g:4615:4: ruleEString
            {
             before(grammarAccess.getComparisonAccess().getLeftVariableVariableEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getLeftVariableVariableEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getComparisonAccess().getLeftVariableVariableCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__LeftVariableAssignment_4"


    // $ANTLR start "rule__Comparison__RightVariableAssignment_6"
    // InternalPolycreate.g:4626:1: rule__Comparison__RightVariableAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__Comparison__RightVariableAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4630:1: ( ( ( ruleEString ) ) )
            // InternalPolycreate.g:4631:2: ( ( ruleEString ) )
            {
            // InternalPolycreate.g:4631:2: ( ( ruleEString ) )
            // InternalPolycreate.g:4632:3: ( ruleEString )
            {
             before(grammarAccess.getComparisonAccess().getRightVariableVariableCrossReference_6_0()); 
            // InternalPolycreate.g:4633:3: ( ruleEString )
            // InternalPolycreate.g:4634:4: ruleEString
            {
             before(grammarAccess.getComparisonAccess().getRightVariableVariableEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getRightVariableVariableEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getComparisonAccess().getRightVariableVariableCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__RightVariableAssignment_6"


    // $ANTLR start "rule__GripperSensor__NameAssignment_2"
    // InternalPolycreate.g:4645:1: rule__GripperSensor__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__GripperSensor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4649:1: ( ( ruleEString ) )
            // InternalPolycreate.g:4650:2: ( ruleEString )
            {
            // InternalPolycreate.g:4650:2: ( ruleEString )
            // InternalPolycreate.g:4651:3: ruleEString
            {
             before(grammarAccess.getGripperSensorAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGripperSensorAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GripperSensor__NameAssignment_2"


    // $ANTLR start "rule__GripperSensor__TypeAssignment_4_1"
    // InternalPolycreate.g:4660:1: rule__GripperSensor__TypeAssignment_4_1 : ( ruleVarType ) ;
    public final void rule__GripperSensor__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4664:1: ( ( ruleVarType ) )
            // InternalPolycreate.g:4665:2: ( ruleVarType )
            {
            // InternalPolycreate.g:4665:2: ( ruleVarType )
            // InternalPolycreate.g:4666:3: ruleVarType
            {
             before(grammarAccess.getGripperSensorAccess().getTypeVarTypeEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVarType();

            state._fsp--;

             after(grammarAccess.getGripperSensorAccess().getTypeVarTypeEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GripperSensor__TypeAssignment_4_1"


    // $ANTLR start "rule__GripperSensor__InitialValueAssignment_5_1"
    // InternalPolycreate.g:4675:1: rule__GripperSensor__InitialValueAssignment_5_1 : ( ruleEDouble ) ;
    public final void rule__GripperSensor__InitialValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4679:1: ( ( ruleEDouble ) )
            // InternalPolycreate.g:4680:2: ( ruleEDouble )
            {
            // InternalPolycreate.g:4680:2: ( ruleEDouble )
            // InternalPolycreate.g:4681:3: ruleEDouble
            {
             before(grammarAccess.getGripperSensorAccess().getInitialValueEDoubleParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getGripperSensorAccess().getInitialValueEDoubleParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GripperSensor__InitialValueAssignment_5_1"


    // $ANTLR start "rule__RightSensor__NameAssignment_2"
    // InternalPolycreate.g:4690:1: rule__RightSensor__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RightSensor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4694:1: ( ( ruleEString ) )
            // InternalPolycreate.g:4695:2: ( ruleEString )
            {
            // InternalPolycreate.g:4695:2: ( ruleEString )
            // InternalPolycreate.g:4696:3: ruleEString
            {
             before(grammarAccess.getRightSensorAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRightSensorAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightSensor__NameAssignment_2"


    // $ANTLR start "rule__RightSensor__TypeAssignment_4_1"
    // InternalPolycreate.g:4705:1: rule__RightSensor__TypeAssignment_4_1 : ( ruleVarType ) ;
    public final void rule__RightSensor__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4709:1: ( ( ruleVarType ) )
            // InternalPolycreate.g:4710:2: ( ruleVarType )
            {
            // InternalPolycreate.g:4710:2: ( ruleVarType )
            // InternalPolycreate.g:4711:3: ruleVarType
            {
             before(grammarAccess.getRightSensorAccess().getTypeVarTypeEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVarType();

            state._fsp--;

             after(grammarAccess.getRightSensorAccess().getTypeVarTypeEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightSensor__TypeAssignment_4_1"


    // $ANTLR start "rule__RightSensor__InitialValueAssignment_5_1"
    // InternalPolycreate.g:4720:1: rule__RightSensor__InitialValueAssignment_5_1 : ( ruleEDouble ) ;
    public final void rule__RightSensor__InitialValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4724:1: ( ( ruleEDouble ) )
            // InternalPolycreate.g:4725:2: ( ruleEDouble )
            {
            // InternalPolycreate.g:4725:2: ( ruleEDouble )
            // InternalPolycreate.g:4726:3: ruleEDouble
            {
             before(grammarAccess.getRightSensorAccess().getInitialValueEDoubleParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getRightSensorAccess().getInitialValueEDoubleParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightSensor__InitialValueAssignment_5_1"


    // $ANTLR start "rule__LeftSensor__NameAssignment_2"
    // InternalPolycreate.g:4735:1: rule__LeftSensor__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__LeftSensor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4739:1: ( ( ruleEString ) )
            // InternalPolycreate.g:4740:2: ( ruleEString )
            {
            // InternalPolycreate.g:4740:2: ( ruleEString )
            // InternalPolycreate.g:4741:3: ruleEString
            {
             before(grammarAccess.getLeftSensorAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLeftSensorAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftSensor__NameAssignment_2"


    // $ANTLR start "rule__LeftSensor__TypeAssignment_4_1"
    // InternalPolycreate.g:4750:1: rule__LeftSensor__TypeAssignment_4_1 : ( ruleVarType ) ;
    public final void rule__LeftSensor__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4754:1: ( ( ruleVarType ) )
            // InternalPolycreate.g:4755:2: ( ruleVarType )
            {
            // InternalPolycreate.g:4755:2: ( ruleVarType )
            // InternalPolycreate.g:4756:3: ruleVarType
            {
             before(grammarAccess.getLeftSensorAccess().getTypeVarTypeEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVarType();

            state._fsp--;

             after(grammarAccess.getLeftSensorAccess().getTypeVarTypeEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftSensor__TypeAssignment_4_1"


    // $ANTLR start "rule__LeftSensor__InitialValueAssignment_5_1"
    // InternalPolycreate.g:4765:1: rule__LeftSensor__InitialValueAssignment_5_1 : ( ruleEDouble ) ;
    public final void rule__LeftSensor__InitialValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4769:1: ( ( ruleEDouble ) )
            // InternalPolycreate.g:4770:2: ( ruleEDouble )
            {
            // InternalPolycreate.g:4770:2: ( ruleEDouble )
            // InternalPolycreate.g:4771:3: ruleEDouble
            {
             before(grammarAccess.getLeftSensorAccess().getInitialValueEDoubleParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getLeftSensorAccess().getInitialValueEDoubleParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftSensor__InitialValueAssignment_5_1"


    // $ANTLR start "rule__Object__NameAssignment_2"
    // InternalPolycreate.g:4780:1: rule__Object__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Object__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4784:1: ( ( ruleEString ) )
            // InternalPolycreate.g:4785:2: ( ruleEString )
            {
            // InternalPolycreate.g:4785:2: ( ruleEString )
            // InternalPolycreate.g:4786:3: ruleEString
            {
             before(grammarAccess.getObjectAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getObjectAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__NameAssignment_2"


    // $ANTLR start "rule__Object__TypeAssignment_4_1"
    // InternalPolycreate.g:4795:1: rule__Object__TypeAssignment_4_1 : ( ruleVarType ) ;
    public final void rule__Object__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4799:1: ( ( ruleVarType ) )
            // InternalPolycreate.g:4800:2: ( ruleVarType )
            {
            // InternalPolycreate.g:4800:2: ( ruleVarType )
            // InternalPolycreate.g:4801:3: ruleVarType
            {
             before(grammarAccess.getObjectAccess().getTypeVarTypeEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVarType();

            state._fsp--;

             after(grammarAccess.getObjectAccess().getTypeVarTypeEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__TypeAssignment_4_1"


    // $ANTLR start "rule__Object__InitialValueAssignment_5_1"
    // InternalPolycreate.g:4810:1: rule__Object__InitialValueAssignment_5_1 : ( ruleEDouble ) ;
    public final void rule__Object__InitialValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4814:1: ( ( ruleEDouble ) )
            // InternalPolycreate.g:4815:2: ( ruleEDouble )
            {
            // InternalPolycreate.g:4815:2: ( ruleEDouble )
            // InternalPolycreate.g:4816:3: ruleEDouble
            {
             before(grammarAccess.getObjectAccess().getInitialValueEDoubleParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getObjectAccess().getInitialValueEDoubleParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__InitialValueAssignment_5_1"


    // $ANTLR start "rule__Object__PositionAssignment_6_1"
    // InternalPolycreate.g:4825:1: rule__Object__PositionAssignment_6_1 : ( ruleVarType ) ;
    public final void rule__Object__PositionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:4829:1: ( ( ruleVarType ) )
            // InternalPolycreate.g:4830:2: ( ruleVarType )
            {
            // InternalPolycreate.g:4830:2: ( ruleVarType )
            // InternalPolycreate.g:4831:3: ruleVarType
            {
             before(grammarAccess.getObjectAccess().getPositionVarTypeEnumRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVarType();

            state._fsp--;

             after(grammarAccess.getObjectAccess().getPositionVarTypeEnumRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__PositionAssignment_6_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000B000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000003F80000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x001E000010000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000061000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000003FE000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0001800000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000064000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000010004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000500000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000800000000040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0020000061000000L});

}