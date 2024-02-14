package org.artemis.sm.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.artemis.sm.services.StateMachineGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStateMachineParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_BOOL_LITERAL", "RULE_FLOAT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'machine'", "'{'", "'variables'", "'}'", "'initial'", "'state'", "'on'", "'guard:'", "'next'", "'state:'", "'startTask'", "'('", "','", "')'", "'endTask'", "'anyEvent'", "'='", "'restartPath'", "'Path:'", "'skipPath'", "'restartTask'", "'skipTask'", "'AND'", "'and'", "'OR'", "'or'", "'=='", "'!='", "'>='", "'>'", "'<='", "'<'", "'+'", "'-'", "'*'", "'/'", "'max'", "'min'", "'^'", "'NOT'", "'not'", "'type'", "'enum'", "'['", "']'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
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
    public static final int RULE_BOOL_LITERAL=6;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=7;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalStateMachineParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalStateMachineParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalStateMachineParser.tokenNames; }
    public String getGrammarFileName() { return "InternalStateMachine.g"; }



     	private StateMachineGrammarAccess grammarAccess;

        public InternalStateMachineParser(TokenStream input, StateMachineGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Monitor";
       	}

       	@Override
       	protected StateMachineGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMonitor"
    // InternalStateMachine.g:64:1: entryRuleMonitor returns [EObject current=null] : iv_ruleMonitor= ruleMonitor EOF ;
    public final EObject entryRuleMonitor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonitor = null;


        try {
            // InternalStateMachine.g:64:48: (iv_ruleMonitor= ruleMonitor EOF )
            // InternalStateMachine.g:65:2: iv_ruleMonitor= ruleMonitor EOF
            {
             newCompositeNode(grammarAccess.getMonitorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMonitor=ruleMonitor();

            state._fsp--;

             current =iv_ruleMonitor; 
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
    // $ANTLR end "entryRuleMonitor"


    // $ANTLR start "ruleMonitor"
    // InternalStateMachine.g:71:1: ruleMonitor returns [EObject current=null] : ( (lv_machines_0_0= ruleStateMachine ) )+ ;
    public final EObject ruleMonitor() throws RecognitionException {
        EObject current = null;

        EObject lv_machines_0_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:77:2: ( ( (lv_machines_0_0= ruleStateMachine ) )+ )
            // InternalStateMachine.g:78:2: ( (lv_machines_0_0= ruleStateMachine ) )+
            {
            // InternalStateMachine.g:78:2: ( (lv_machines_0_0= ruleStateMachine ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalStateMachine.g:79:3: (lv_machines_0_0= ruleStateMachine )
            	    {
            	    // InternalStateMachine.g:79:3: (lv_machines_0_0= ruleStateMachine )
            	    // InternalStateMachine.g:80:4: lv_machines_0_0= ruleStateMachine
            	    {

            	    				newCompositeNode(grammarAccess.getMonitorAccess().getMachinesStateMachineParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_machines_0_0=ruleStateMachine();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getMonitorRule());
            	    				}
            	    				add(
            	    					current,
            	    					"machines",
            	    					lv_machines_0_0,
            	    					"org.artemis.sm.StateMachine.StateMachine");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


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
    // $ANTLR end "ruleMonitor"


    // $ANTLR start "entryRuleStateMachine"
    // InternalStateMachine.g:100:1: entryRuleStateMachine returns [EObject current=null] : iv_ruleStateMachine= ruleStateMachine EOF ;
    public final EObject entryRuleStateMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateMachine = null;


        try {
            // InternalStateMachine.g:100:53: (iv_ruleStateMachine= ruleStateMachine EOF )
            // InternalStateMachine.g:101:2: iv_ruleStateMachine= ruleStateMachine EOF
            {
             newCompositeNode(grammarAccess.getStateMachineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateMachine=ruleStateMachine();

            state._fsp--;

             current =iv_ruleStateMachine; 
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
    // $ANTLR end "entryRuleStateMachine"


    // $ANTLR start "ruleStateMachine"
    // InternalStateMachine.g:107:1: ruleStateMachine returns [EObject current=null] : (otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'variables' ( (lv_vars_4_0= ruleTypedVariable ) )+ )? ( (lv_states_5_0= ruleState ) )+ otherlv_6= '}' ) ;
    public final EObject ruleStateMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_vars_4_0 = null;

        EObject lv_states_5_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:113:2: ( (otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'variables' ( (lv_vars_4_0= ruleTypedVariable ) )+ )? ( (lv_states_5_0= ruleState ) )+ otherlv_6= '}' ) )
            // InternalStateMachine.g:114:2: (otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'variables' ( (lv_vars_4_0= ruleTypedVariable ) )+ )? ( (lv_states_5_0= ruleState ) )+ otherlv_6= '}' )
            {
            // InternalStateMachine.g:114:2: (otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'variables' ( (lv_vars_4_0= ruleTypedVariable ) )+ )? ( (lv_states_5_0= ruleState ) )+ otherlv_6= '}' )
            // InternalStateMachine.g:115:3: otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'variables' ( (lv_vars_4_0= ruleTypedVariable ) )+ )? ( (lv_states_5_0= ruleState ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStateMachineAccess().getMachineKeyword_0());
            		
            // InternalStateMachine.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateMachine.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStateMachine.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalStateMachine.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStateMachineAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateMachineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalStateMachine.g:141:3: (otherlv_3= 'variables' ( (lv_vars_4_0= ruleTypedVariable ) )+ )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalStateMachine.g:142:4: otherlv_3= 'variables' ( (lv_vars_4_0= ruleTypedVariable ) )+
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getStateMachineAccess().getVariablesKeyword_3_0());
                    			
                    // InternalStateMachine.g:146:4: ( (lv_vars_4_0= ruleTypedVariable ) )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_ID) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalStateMachine.g:147:5: (lv_vars_4_0= ruleTypedVariable )
                    	    {
                    	    // InternalStateMachine.g:147:5: (lv_vars_4_0= ruleTypedVariable )
                    	    // InternalStateMachine.g:148:6: lv_vars_4_0= ruleTypedVariable
                    	    {

                    	    						newCompositeNode(grammarAccess.getStateMachineAccess().getVarsTypedVariableParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_7);
                    	    lv_vars_4_0=ruleTypedVariable();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"vars",
                    	    							lv_vars_4_0,
                    	    							"org.artemis.sm.StateMachine.TypedVariable");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);


                    }
                    break;

            }

            // InternalStateMachine.g:166:3: ( (lv_states_5_0= ruleState ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=17 && LA4_0<=18)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalStateMachine.g:167:4: (lv_states_5_0= ruleState )
            	    {
            	    // InternalStateMachine.g:167:4: (lv_states_5_0= ruleState )
            	    // InternalStateMachine.g:168:5: lv_states_5_0= ruleState
            	    {

            	    					newCompositeNode(grammarAccess.getStateMachineAccess().getStatesStateParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_states_5_0=ruleState();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"states",
            	    						lv_states_5_0,
            	    						"org.artemis.sm.StateMachine.State");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleStateMachine"


    // $ANTLR start "entryRuleState"
    // InternalStateMachine.g:193:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalStateMachine.g:193:46: (iv_ruleState= ruleState EOF )
            // InternalStateMachine.g:194:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalStateMachine.g:200:1: ruleState returns [EObject current=null] : ( ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_transitions_4_0= ruleTransition ) )* otherlv_5= '}' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_initial_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_transitions_4_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:206:2: ( ( ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_transitions_4_0= ruleTransition ) )* otherlv_5= '}' ) )
            // InternalStateMachine.g:207:2: ( ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_transitions_4_0= ruleTransition ) )* otherlv_5= '}' )
            {
            // InternalStateMachine.g:207:2: ( ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_transitions_4_0= ruleTransition ) )* otherlv_5= '}' )
            // InternalStateMachine.g:208:3: ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_transitions_4_0= ruleTransition ) )* otherlv_5= '}'
            {
            // InternalStateMachine.g:208:3: ( (lv_initial_0_0= 'initial' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalStateMachine.g:209:4: (lv_initial_0_0= 'initial' )
                    {
                    // InternalStateMachine.g:209:4: (lv_initial_0_0= 'initial' )
                    // InternalStateMachine.g:210:5: lv_initial_0_0= 'initial'
                    {
                    lv_initial_0_0=(Token)match(input,17,FOLLOW_9); 

                    					newLeafNode(lv_initial_0_0, grammarAccess.getStateAccess().getInitialInitialKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStateRule());
                    					}
                    					setWithLastConsumed(current, "initial", lv_initial_0_0 != null, "initial");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_1());
            		
            // InternalStateMachine.g:226:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalStateMachine.g:227:4: (lv_name_2_0= RULE_ID )
            {
            // InternalStateMachine.g:227:4: (lv_name_2_0= RULE_ID )
            // InternalStateMachine.g:228:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalStateMachine.g:248:3: ( (lv_transitions_4_0= ruleTransition ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalStateMachine.g:249:4: (lv_transitions_4_0= ruleTransition )
            	    {
            	    // InternalStateMachine.g:249:4: (lv_transitions_4_0= ruleTransition )
            	    // InternalStateMachine.g:250:5: lv_transitions_4_0= ruleTransition
            	    {

            	    					newCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_transitions_4_0=ruleTransition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStateRule());
            	    					}
            	    					add(
            	    						current,
            	    						"transitions",
            	    						lv_transitions_4_0,
            	    						"org.artemis.sm.StateMachine.Transition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // InternalStateMachine.g:275:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalStateMachine.g:275:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalStateMachine.g:276:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalStateMachine.g:282:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'on' ( (lv_event_1_0= ruleEvent ) ) (otherlv_2= 'guard:' ( (lv_guard_3_0= ruleExpression ) ) )? ( (lv_actions_4_0= ruleAction ) )* ( (lv_onFail_5_0= ruleOnFailAction ) )? otherlv_6= 'next' otherlv_7= 'state:' ( (otherlv_8= RULE_ID ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_event_1_0 = null;

        EObject lv_guard_3_0 = null;

        EObject lv_actions_4_0 = null;

        EObject lv_onFail_5_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:288:2: ( (otherlv_0= 'on' ( (lv_event_1_0= ruleEvent ) ) (otherlv_2= 'guard:' ( (lv_guard_3_0= ruleExpression ) ) )? ( (lv_actions_4_0= ruleAction ) )* ( (lv_onFail_5_0= ruleOnFailAction ) )? otherlv_6= 'next' otherlv_7= 'state:' ( (otherlv_8= RULE_ID ) ) ) )
            // InternalStateMachine.g:289:2: (otherlv_0= 'on' ( (lv_event_1_0= ruleEvent ) ) (otherlv_2= 'guard:' ( (lv_guard_3_0= ruleExpression ) ) )? ( (lv_actions_4_0= ruleAction ) )* ( (lv_onFail_5_0= ruleOnFailAction ) )? otherlv_6= 'next' otherlv_7= 'state:' ( (otherlv_8= RULE_ID ) ) )
            {
            // InternalStateMachine.g:289:2: (otherlv_0= 'on' ( (lv_event_1_0= ruleEvent ) ) (otherlv_2= 'guard:' ( (lv_guard_3_0= ruleExpression ) ) )? ( (lv_actions_4_0= ruleAction ) )* ( (lv_onFail_5_0= ruleOnFailAction ) )? otherlv_6= 'next' otherlv_7= 'state:' ( (otherlv_8= RULE_ID ) ) )
            // InternalStateMachine.g:290:3: otherlv_0= 'on' ( (lv_event_1_0= ruleEvent ) ) (otherlv_2= 'guard:' ( (lv_guard_3_0= ruleExpression ) ) )? ( (lv_actions_4_0= ruleAction ) )* ( (lv_onFail_5_0= ruleOnFailAction ) )? otherlv_6= 'next' otherlv_7= 'state:' ( (otherlv_8= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getOnKeyword_0());
            		
            // InternalStateMachine.g:294:3: ( (lv_event_1_0= ruleEvent ) )
            // InternalStateMachine.g:295:4: (lv_event_1_0= ruleEvent )
            {
            // InternalStateMachine.g:295:4: (lv_event_1_0= ruleEvent )
            // InternalStateMachine.g:296:5: lv_event_1_0= ruleEvent
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getEventEventParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_event_1_0=ruleEvent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"event",
            						lv_event_1_0,
            						"org.artemis.sm.StateMachine.Event");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalStateMachine.g:313:3: (otherlv_2= 'guard:' ( (lv_guard_3_0= ruleExpression ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalStateMachine.g:314:4: otherlv_2= 'guard:' ( (lv_guard_3_0= ruleExpression ) )
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getGuardKeyword_2_0());
                    			
                    // InternalStateMachine.g:318:4: ( (lv_guard_3_0= ruleExpression ) )
                    // InternalStateMachine.g:319:5: (lv_guard_3_0= ruleExpression )
                    {
                    // InternalStateMachine.g:319:5: (lv_guard_3_0= ruleExpression )
                    // InternalStateMachine.g:320:6: lv_guard_3_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getTransitionAccess().getGuardExpressionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_guard_3_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransitionRule());
                    						}
                    						set(
                    							current,
                    							"guard",
                    							lv_guard_3_0,
                    							"org.artemis.sm.StateMachine.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalStateMachine.g:338:3: ( (lv_actions_4_0= ruleAction ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalStateMachine.g:339:4: (lv_actions_4_0= ruleAction )
            	    {
            	    // InternalStateMachine.g:339:4: (lv_actions_4_0= ruleAction )
            	    // InternalStateMachine.g:340:5: lv_actions_4_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getTransitionAccess().getActionsActionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_actions_4_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTransitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_4_0,
            	    						"org.artemis.sm.StateMachine.Action");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalStateMachine.g:357:3: ( (lv_onFail_5_0= ruleOnFailAction ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30||(LA9_0>=32 && LA9_0<=34)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalStateMachine.g:358:4: (lv_onFail_5_0= ruleOnFailAction )
                    {
                    // InternalStateMachine.g:358:4: (lv_onFail_5_0= ruleOnFailAction )
                    // InternalStateMachine.g:359:5: lv_onFail_5_0= ruleOnFailAction
                    {

                    					newCompositeNode(grammarAccess.getTransitionAccess().getOnFailOnFailActionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_15);
                    lv_onFail_5_0=ruleOnFailAction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTransitionRule());
                    					}
                    					set(
                    						current,
                    						"onFail",
                    						lv_onFail_5_0,
                    						"org.artemis.sm.StateMachine.OnFailAction");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getNextKeyword_5());
            		
            otherlv_7=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getStateKeyword_6());
            		
            // InternalStateMachine.g:384:3: ( (otherlv_8= RULE_ID ) )
            // InternalStateMachine.g:385:4: (otherlv_8= RULE_ID )
            {
            // InternalStateMachine.g:385:4: (otherlv_8= RULE_ID )
            // InternalStateMachine.g:386:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_8, grammarAccess.getTransitionAccess().getNextStateCrossReference_7_0());
            				

            }


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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleEvent"
    // InternalStateMachine.g:401:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalStateMachine.g:401:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalStateMachine.g:402:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalStateMachine.g:408:1: ruleEvent returns [EObject current=null] : (this_StartTask_0= ruleStartTask | this_EndTask_1= ruleEndTask | this_AnyEvent_2= ruleAnyEvent ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        EObject this_StartTask_0 = null;

        EObject this_EndTask_1 = null;

        EObject this_AnyEvent_2 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:414:2: ( (this_StartTask_0= ruleStartTask | this_EndTask_1= ruleEndTask | this_AnyEvent_2= ruleAnyEvent ) )
            // InternalStateMachine.g:415:2: (this_StartTask_0= ruleStartTask | this_EndTask_1= ruleEndTask | this_AnyEvent_2= ruleAnyEvent )
            {
            // InternalStateMachine.g:415:2: (this_StartTask_0= ruleStartTask | this_EndTask_1= ruleEndTask | this_AnyEvent_2= ruleAnyEvent )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt10=1;
                }
                break;
            case 27:
                {
                alt10=2;
                }
                break;
            case 28:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalStateMachine.g:416:3: this_StartTask_0= ruleStartTask
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getStartTaskParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StartTask_0=ruleStartTask();

                    state._fsp--;


                    			current = this_StartTask_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalStateMachine.g:425:3: this_EndTask_1= ruleEndTask
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getEndTaskParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EndTask_1=ruleEndTask();

                    state._fsp--;


                    			current = this_EndTask_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalStateMachine.g:434:3: this_AnyEvent_2= ruleAnyEvent
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getAnyEventParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AnyEvent_2=ruleAnyEvent();

                    state._fsp--;


                    			current = this_AnyEvent_2;
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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleStartTask"
    // InternalStateMachine.g:446:1: entryRuleStartTask returns [EObject current=null] : iv_ruleStartTask= ruleStartTask EOF ;
    public final EObject entryRuleStartTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartTask = null;


        try {
            // InternalStateMachine.g:446:50: (iv_ruleStartTask= ruleStartTask EOF )
            // InternalStateMachine.g:447:2: iv_ruleStartTask= ruleStartTask EOF
            {
             newCompositeNode(grammarAccess.getStartTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStartTask=ruleStartTask();

            state._fsp--;

             current =iv_ruleStartTask; 
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
    // $ANTLR end "entryRuleStartTask"


    // $ANTLR start "ruleStartTask"
    // InternalStateMachine.g:453:1: ruleStartTask returns [EObject current=null] : (otherlv_0= 'startTask' otherlv_1= '(' ( (lv_task_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_timeVar_4_0= ruleUntypedVariable ) ) otherlv_5= ')' ) ;
    public final EObject ruleStartTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_task_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_timeVar_4_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:459:2: ( (otherlv_0= 'startTask' otherlv_1= '(' ( (lv_task_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_timeVar_4_0= ruleUntypedVariable ) ) otherlv_5= ')' ) )
            // InternalStateMachine.g:460:2: (otherlv_0= 'startTask' otherlv_1= '(' ( (lv_task_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_timeVar_4_0= ruleUntypedVariable ) ) otherlv_5= ')' )
            {
            // InternalStateMachine.g:460:2: (otherlv_0= 'startTask' otherlv_1= '(' ( (lv_task_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_timeVar_4_0= ruleUntypedVariable ) ) otherlv_5= ')' )
            // InternalStateMachine.g:461:3: otherlv_0= 'startTask' otherlv_1= '(' ( (lv_task_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_timeVar_4_0= ruleUntypedVariable ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getStartTaskAccess().getStartTaskKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getStartTaskAccess().getLeftParenthesisKeyword_1());
            		
            // InternalStateMachine.g:469:3: ( (lv_task_2_0= RULE_ID ) )
            // InternalStateMachine.g:470:4: (lv_task_2_0= RULE_ID )
            {
            // InternalStateMachine.g:470:4: (lv_task_2_0= RULE_ID )
            // InternalStateMachine.g:471:5: lv_task_2_0= RULE_ID
            {
            lv_task_2_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_task_2_0, grammarAccess.getStartTaskAccess().getTaskIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStartTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"task",
            						lv_task_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getStartTaskAccess().getCommaKeyword_3());
            		
            // InternalStateMachine.g:491:3: ( (lv_timeVar_4_0= ruleUntypedVariable ) )
            // InternalStateMachine.g:492:4: (lv_timeVar_4_0= ruleUntypedVariable )
            {
            // InternalStateMachine.g:492:4: (lv_timeVar_4_0= ruleUntypedVariable )
            // InternalStateMachine.g:493:5: lv_timeVar_4_0= ruleUntypedVariable
            {

            					newCompositeNode(grammarAccess.getStartTaskAccess().getTimeVarUntypedVariableParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_19);
            lv_timeVar_4_0=ruleUntypedVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStartTaskRule());
            					}
            					set(
            						current,
            						"timeVar",
            						lv_timeVar_4_0,
            						"org.artemis.sm.StateMachine.UntypedVariable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getStartTaskAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleStartTask"


    // $ANTLR start "entryRuleEndTask"
    // InternalStateMachine.g:518:1: entryRuleEndTask returns [EObject current=null] : iv_ruleEndTask= ruleEndTask EOF ;
    public final EObject entryRuleEndTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndTask = null;


        try {
            // InternalStateMachine.g:518:48: (iv_ruleEndTask= ruleEndTask EOF )
            // InternalStateMachine.g:519:2: iv_ruleEndTask= ruleEndTask EOF
            {
             newCompositeNode(grammarAccess.getEndTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEndTask=ruleEndTask();

            state._fsp--;

             current =iv_ruleEndTask; 
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
    // $ANTLR end "entryRuleEndTask"


    // $ANTLR start "ruleEndTask"
    // InternalStateMachine.g:525:1: ruleEndTask returns [EObject current=null] : (otherlv_0= 'endTask' otherlv_1= '(' ( (lv_task_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_timeVar_4_0= ruleUntypedVariable ) ) otherlv_5= ')' ) ;
    public final EObject ruleEndTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_task_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_timeVar_4_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:531:2: ( (otherlv_0= 'endTask' otherlv_1= '(' ( (lv_task_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_timeVar_4_0= ruleUntypedVariable ) ) otherlv_5= ')' ) )
            // InternalStateMachine.g:532:2: (otherlv_0= 'endTask' otherlv_1= '(' ( (lv_task_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_timeVar_4_0= ruleUntypedVariable ) ) otherlv_5= ')' )
            {
            // InternalStateMachine.g:532:2: (otherlv_0= 'endTask' otherlv_1= '(' ( (lv_task_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_timeVar_4_0= ruleUntypedVariable ) ) otherlv_5= ')' )
            // InternalStateMachine.g:533:3: otherlv_0= 'endTask' otherlv_1= '(' ( (lv_task_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_timeVar_4_0= ruleUntypedVariable ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getEndTaskAccess().getEndTaskKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEndTaskAccess().getLeftParenthesisKeyword_1());
            		
            // InternalStateMachine.g:541:3: ( (lv_task_2_0= RULE_ID ) )
            // InternalStateMachine.g:542:4: (lv_task_2_0= RULE_ID )
            {
            // InternalStateMachine.g:542:4: (lv_task_2_0= RULE_ID )
            // InternalStateMachine.g:543:5: lv_task_2_0= RULE_ID
            {
            lv_task_2_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_task_2_0, grammarAccess.getEndTaskAccess().getTaskIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEndTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"task",
            						lv_task_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getEndTaskAccess().getCommaKeyword_3());
            		
            // InternalStateMachine.g:563:3: ( (lv_timeVar_4_0= ruleUntypedVariable ) )
            // InternalStateMachine.g:564:4: (lv_timeVar_4_0= ruleUntypedVariable )
            {
            // InternalStateMachine.g:564:4: (lv_timeVar_4_0= ruleUntypedVariable )
            // InternalStateMachine.g:565:5: lv_timeVar_4_0= ruleUntypedVariable
            {

            					newCompositeNode(grammarAccess.getEndTaskAccess().getTimeVarUntypedVariableParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_19);
            lv_timeVar_4_0=ruleUntypedVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEndTaskRule());
            					}
            					set(
            						current,
            						"timeVar",
            						lv_timeVar_4_0,
            						"org.artemis.sm.StateMachine.UntypedVariable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getEndTaskAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleEndTask"


    // $ANTLR start "entryRuleAnyEvent"
    // InternalStateMachine.g:590:1: entryRuleAnyEvent returns [EObject current=null] : iv_ruleAnyEvent= ruleAnyEvent EOF ;
    public final EObject entryRuleAnyEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyEvent = null;


        try {
            // InternalStateMachine.g:590:49: (iv_ruleAnyEvent= ruleAnyEvent EOF )
            // InternalStateMachine.g:591:2: iv_ruleAnyEvent= ruleAnyEvent EOF
            {
             newCompositeNode(grammarAccess.getAnyEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnyEvent=ruleAnyEvent();

            state._fsp--;

             current =iv_ruleAnyEvent; 
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
    // $ANTLR end "entryRuleAnyEvent"


    // $ANTLR start "ruleAnyEvent"
    // InternalStateMachine.g:597:1: ruleAnyEvent returns [EObject current=null] : (otherlv_0= 'anyEvent' otherlv_1= '(' ( (lv_timeVar_2_0= ruleUntypedVariable ) ) otherlv_3= ')' ) ;
    public final EObject ruleAnyEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_timeVar_2_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:603:2: ( (otherlv_0= 'anyEvent' otherlv_1= '(' ( (lv_timeVar_2_0= ruleUntypedVariable ) ) otherlv_3= ')' ) )
            // InternalStateMachine.g:604:2: (otherlv_0= 'anyEvent' otherlv_1= '(' ( (lv_timeVar_2_0= ruleUntypedVariable ) ) otherlv_3= ')' )
            {
            // InternalStateMachine.g:604:2: (otherlv_0= 'anyEvent' otherlv_1= '(' ( (lv_timeVar_2_0= ruleUntypedVariable ) ) otherlv_3= ')' )
            // InternalStateMachine.g:605:3: otherlv_0= 'anyEvent' otherlv_1= '(' ( (lv_timeVar_2_0= ruleUntypedVariable ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getAnyEventAccess().getAnyEventKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAnyEventAccess().getLeftParenthesisKeyword_1());
            		
            // InternalStateMachine.g:613:3: ( (lv_timeVar_2_0= ruleUntypedVariable ) )
            // InternalStateMachine.g:614:4: (lv_timeVar_2_0= ruleUntypedVariable )
            {
            // InternalStateMachine.g:614:4: (lv_timeVar_2_0= ruleUntypedVariable )
            // InternalStateMachine.g:615:5: lv_timeVar_2_0= ruleUntypedVariable
            {

            					newCompositeNode(grammarAccess.getAnyEventAccess().getTimeVarUntypedVariableParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_19);
            lv_timeVar_2_0=ruleUntypedVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnyEventRule());
            					}
            					set(
            						current,
            						"timeVar",
            						lv_timeVar_2_0,
            						"org.artemis.sm.StateMachine.UntypedVariable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAnyEventAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleAnyEvent"


    // $ANTLR start "entryRuleUntypedVariable"
    // InternalStateMachine.g:640:1: entryRuleUntypedVariable returns [EObject current=null] : iv_ruleUntypedVariable= ruleUntypedVariable EOF ;
    public final EObject entryRuleUntypedVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUntypedVariable = null;


        try {
            // InternalStateMachine.g:640:56: (iv_ruleUntypedVariable= ruleUntypedVariable EOF )
            // InternalStateMachine.g:641:2: iv_ruleUntypedVariable= ruleUntypedVariable EOF
            {
             newCompositeNode(grammarAccess.getUntypedVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUntypedVariable=ruleUntypedVariable();

            state._fsp--;

             current =iv_ruleUntypedVariable; 
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
    // $ANTLR end "entryRuleUntypedVariable"


    // $ANTLR start "ruleUntypedVariable"
    // InternalStateMachine.g:647:1: ruleUntypedVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleUntypedVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalStateMachine.g:653:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalStateMachine.g:654:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalStateMachine.g:654:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalStateMachine.g:655:3: (lv_name_0_0= RULE_ID )
            {
            // InternalStateMachine.g:655:3: (lv_name_0_0= RULE_ID )
            // InternalStateMachine.g:656:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getUntypedVariableAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getUntypedVariableRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleUntypedVariable"


    // $ANTLR start "entryRuleTypedVariable"
    // InternalStateMachine.g:675:1: entryRuleTypedVariable returns [EObject current=null] : iv_ruleTypedVariable= ruleTypedVariable EOF ;
    public final EObject entryRuleTypedVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedVariable = null;


        try {
            // InternalStateMachine.g:675:54: (iv_ruleTypedVariable= ruleTypedVariable EOF )
            // InternalStateMachine.g:676:2: iv_ruleTypedVariable= ruleTypedVariable EOF
            {
             newCompositeNode(grammarAccess.getTypedVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypedVariable=ruleTypedVariable();

            state._fsp--;

             current =iv_ruleTypedVariable; 
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
    // $ANTLR end "entryRuleTypedVariable"


    // $ANTLR start "ruleTypedVariable"
    // InternalStateMachine.g:682:1: ruleTypedVariable returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_expr_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleTypedVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_0_0 = null;

        EObject lv_expr_3_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:688:2: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_expr_3_0= ruleExpression ) ) )? ) )
            // InternalStateMachine.g:689:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_expr_3_0= ruleExpression ) ) )? )
            {
            // InternalStateMachine.g:689:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_expr_3_0= ruleExpression ) ) )? )
            // InternalStateMachine.g:690:3: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_expr_3_0= ruleExpression ) ) )?
            {
            // InternalStateMachine.g:690:3: ( (lv_type_0_0= ruleType ) )
            // InternalStateMachine.g:691:4: (lv_type_0_0= ruleType )
            {
            // InternalStateMachine.g:691:4: (lv_type_0_0= ruleType )
            // InternalStateMachine.g:692:5: lv_type_0_0= ruleType
            {

            					newCompositeNode(grammarAccess.getTypedVariableAccess().getTypeTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_type_0_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypedVariableRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.artemis.base.Base.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalStateMachine.g:709:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateMachine.g:710:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStateMachine.g:710:4: (lv_name_1_0= RULE_ID )
            // InternalStateMachine.g:711:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTypedVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypedVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalStateMachine.g:727:3: (otherlv_2= '=' ( (lv_expr_3_0= ruleExpression ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalStateMachine.g:728:4: otherlv_2= '=' ( (lv_expr_3_0= ruleExpression ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getTypedVariableAccess().getEqualsSignKeyword_2_0());
                    			
                    // InternalStateMachine.g:732:4: ( (lv_expr_3_0= ruleExpression ) )
                    // InternalStateMachine.g:733:5: (lv_expr_3_0= ruleExpression )
                    {
                    // InternalStateMachine.g:733:5: (lv_expr_3_0= ruleExpression )
                    // InternalStateMachine.g:734:6: lv_expr_3_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getTypedVariableAccess().getExprExpressionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expr_3_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTypedVariableRule());
                    						}
                    						set(
                    							current,
                    							"expr",
                    							lv_expr_3_0,
                    							"org.artemis.sm.StateMachine.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleTypedVariable"


    // $ANTLR start "entryRuleAction"
    // InternalStateMachine.g:756:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalStateMachine.g:756:47: (iv_ruleAction= ruleAction EOF )
            // InternalStateMachine.g:757:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalStateMachine.g:763:1: ruleAction returns [EObject current=null] : this_AssignmentAction_0= ruleAssignmentAction ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_AssignmentAction_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:769:2: (this_AssignmentAction_0= ruleAssignmentAction )
            // InternalStateMachine.g:770:2: this_AssignmentAction_0= ruleAssignmentAction
            {

            		newCompositeNode(grammarAccess.getActionAccess().getAssignmentActionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_AssignmentAction_0=ruleAssignmentAction();

            state._fsp--;


            		current = this_AssignmentAction_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleAssignmentAction"
    // InternalStateMachine.g:781:1: entryRuleAssignmentAction returns [EObject current=null] : iv_ruleAssignmentAction= ruleAssignmentAction EOF ;
    public final EObject entryRuleAssignmentAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentAction = null;


        try {
            // InternalStateMachine.g:781:57: (iv_ruleAssignmentAction= ruleAssignmentAction EOF )
            // InternalStateMachine.g:782:2: iv_ruleAssignmentAction= ruleAssignmentAction EOF
            {
             newCompositeNode(grammarAccess.getAssignmentActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignmentAction=ruleAssignmentAction();

            state._fsp--;

             current =iv_ruleAssignmentAction; 
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
    // $ANTLR end "entryRuleAssignmentAction"


    // $ANTLR start "ruleAssignmentAction"
    // InternalStateMachine.g:788:1: ruleAssignmentAction returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignmentAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:794:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) ) )
            // InternalStateMachine.g:795:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) )
            {
            // InternalStateMachine.g:795:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) )
            // InternalStateMachine.g:796:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) )
            {
            // InternalStateMachine.g:796:3: ( (otherlv_0= RULE_ID ) )
            // InternalStateMachine.g:797:4: (otherlv_0= RULE_ID )
            {
            // InternalStateMachine.g:797:4: (otherlv_0= RULE_ID )
            // InternalStateMachine.g:798:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssignmentActionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_0, grammarAccess.getAssignmentActionAccess().getVarVariableCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getAssignmentActionAccess().getEqualsSignKeyword_1());
            		
            // InternalStateMachine.g:813:3: ( (lv_expr_2_0= ruleExpression ) )
            // InternalStateMachine.g:814:4: (lv_expr_2_0= ruleExpression )
            {
            // InternalStateMachine.g:814:4: (lv_expr_2_0= ruleExpression )
            // InternalStateMachine.g:815:5: lv_expr_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAssignmentActionAccess().getExprExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_expr_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignmentActionRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_2_0,
            						"org.artemis.sm.StateMachine.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleAssignmentAction"


    // $ANTLR start "entryRuleOnFailAction"
    // InternalStateMachine.g:836:1: entryRuleOnFailAction returns [EObject current=null] : iv_ruleOnFailAction= ruleOnFailAction EOF ;
    public final EObject entryRuleOnFailAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnFailAction = null;


        try {
            // InternalStateMachine.g:836:53: (iv_ruleOnFailAction= ruleOnFailAction EOF )
            // InternalStateMachine.g:837:2: iv_ruleOnFailAction= ruleOnFailAction EOF
            {
             newCompositeNode(grammarAccess.getOnFailActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOnFailAction=ruleOnFailAction();

            state._fsp--;

             current =iv_ruleOnFailAction; 
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
    // $ANTLR end "entryRuleOnFailAction"


    // $ANTLR start "ruleOnFailAction"
    // InternalStateMachine.g:843:1: ruleOnFailAction returns [EObject current=null] : (this_RestartPath_0= ruleRestartPath | this_SkipPath_1= ruleSkipPath | this_RestartTask_2= ruleRestartTask | this_SkipTask_3= ruleSkipTask ) ;
    public final EObject ruleOnFailAction() throws RecognitionException {
        EObject current = null;

        EObject this_RestartPath_0 = null;

        EObject this_SkipPath_1 = null;

        EObject this_RestartTask_2 = null;

        EObject this_SkipTask_3 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:849:2: ( (this_RestartPath_0= ruleRestartPath | this_SkipPath_1= ruleSkipPath | this_RestartTask_2= ruleRestartTask | this_SkipTask_3= ruleSkipTask ) )
            // InternalStateMachine.g:850:2: (this_RestartPath_0= ruleRestartPath | this_SkipPath_1= ruleSkipPath | this_RestartTask_2= ruleRestartTask | this_SkipTask_3= ruleSkipTask )
            {
            // InternalStateMachine.g:850:2: (this_RestartPath_0= ruleRestartPath | this_SkipPath_1= ruleSkipPath | this_RestartTask_2= ruleRestartTask | this_SkipTask_3= ruleSkipTask )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt12=1;
                }
                break;
            case 32:
                {
                alt12=2;
                }
                break;
            case 33:
                {
                alt12=3;
                }
                break;
            case 34:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalStateMachine.g:851:3: this_RestartPath_0= ruleRestartPath
                    {

                    			newCompositeNode(grammarAccess.getOnFailActionAccess().getRestartPathParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RestartPath_0=ruleRestartPath();

                    state._fsp--;


                    			current = this_RestartPath_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalStateMachine.g:860:3: this_SkipPath_1= ruleSkipPath
                    {

                    			newCompositeNode(grammarAccess.getOnFailActionAccess().getSkipPathParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SkipPath_1=ruleSkipPath();

                    state._fsp--;


                    			current = this_SkipPath_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalStateMachine.g:869:3: this_RestartTask_2= ruleRestartTask
                    {

                    			newCompositeNode(grammarAccess.getOnFailActionAccess().getRestartTaskParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RestartTask_2=ruleRestartTask();

                    state._fsp--;


                    			current = this_RestartTask_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalStateMachine.g:878:3: this_SkipTask_3= ruleSkipTask
                    {

                    			newCompositeNode(grammarAccess.getOnFailActionAccess().getSkipTaskParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_SkipTask_3=ruleSkipTask();

                    state._fsp--;


                    			current = this_SkipTask_3;
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
    // $ANTLR end "ruleOnFailAction"


    // $ANTLR start "entryRuleRestartPath"
    // InternalStateMachine.g:890:1: entryRuleRestartPath returns [EObject current=null] : iv_ruleRestartPath= ruleRestartPath EOF ;
    public final EObject entryRuleRestartPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestartPath = null;


        try {
            // InternalStateMachine.g:890:52: (iv_ruleRestartPath= ruleRestartPath EOF )
            // InternalStateMachine.g:891:2: iv_ruleRestartPath= ruleRestartPath EOF
            {
             newCompositeNode(grammarAccess.getRestartPathRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRestartPath=ruleRestartPath();

            state._fsp--;

             current =iv_ruleRestartPath; 
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
    // $ANTLR end "entryRuleRestartPath"


    // $ANTLR start "ruleRestartPath"
    // InternalStateMachine.g:897:1: ruleRestartPath returns [EObject current=null] : ( () otherlv_1= 'restartPath' (otherlv_2= 'Path:' ( (lv_path_3_0= RULE_INT ) ) )? ) ;
    public final EObject ruleRestartPath() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_path_3_0=null;


        	enterRule();

        try {
            // InternalStateMachine.g:903:2: ( ( () otherlv_1= 'restartPath' (otherlv_2= 'Path:' ( (lv_path_3_0= RULE_INT ) ) )? ) )
            // InternalStateMachine.g:904:2: ( () otherlv_1= 'restartPath' (otherlv_2= 'Path:' ( (lv_path_3_0= RULE_INT ) ) )? )
            {
            // InternalStateMachine.g:904:2: ( () otherlv_1= 'restartPath' (otherlv_2= 'Path:' ( (lv_path_3_0= RULE_INT ) ) )? )
            // InternalStateMachine.g:905:3: () otherlv_1= 'restartPath' (otherlv_2= 'Path:' ( (lv_path_3_0= RULE_INT ) ) )?
            {
            // InternalStateMachine.g:905:3: ()
            // InternalStateMachine.g:906:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRestartPathAccess().getRestartPathAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getRestartPathAccess().getRestartPathKeyword_1());
            		
            // InternalStateMachine.g:916:3: (otherlv_2= 'Path:' ( (lv_path_3_0= RULE_INT ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalStateMachine.g:917:4: otherlv_2= 'Path:' ( (lv_path_3_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_23); 

                    				newLeafNode(otherlv_2, grammarAccess.getRestartPathAccess().getPathKeyword_2_0());
                    			
                    // InternalStateMachine.g:921:4: ( (lv_path_3_0= RULE_INT ) )
                    // InternalStateMachine.g:922:5: (lv_path_3_0= RULE_INT )
                    {
                    // InternalStateMachine.g:922:5: (lv_path_3_0= RULE_INT )
                    // InternalStateMachine.g:923:6: lv_path_3_0= RULE_INT
                    {
                    lv_path_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_path_3_0, grammarAccess.getRestartPathAccess().getPathINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRestartPathRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"path",
                    							lv_path_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


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
    // $ANTLR end "ruleRestartPath"


    // $ANTLR start "entryRuleSkipPath"
    // InternalStateMachine.g:944:1: entryRuleSkipPath returns [EObject current=null] : iv_ruleSkipPath= ruleSkipPath EOF ;
    public final EObject entryRuleSkipPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkipPath = null;


        try {
            // InternalStateMachine.g:944:49: (iv_ruleSkipPath= ruleSkipPath EOF )
            // InternalStateMachine.g:945:2: iv_ruleSkipPath= ruleSkipPath EOF
            {
             newCompositeNode(grammarAccess.getSkipPathRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSkipPath=ruleSkipPath();

            state._fsp--;

             current =iv_ruleSkipPath; 
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
    // $ANTLR end "entryRuleSkipPath"


    // $ANTLR start "ruleSkipPath"
    // InternalStateMachine.g:951:1: ruleSkipPath returns [EObject current=null] : ( () otherlv_1= 'skipPath' (otherlv_2= 'Path:' ( (lv_path_3_0= RULE_INT ) ) )? ) ;
    public final EObject ruleSkipPath() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_path_3_0=null;


        	enterRule();

        try {
            // InternalStateMachine.g:957:2: ( ( () otherlv_1= 'skipPath' (otherlv_2= 'Path:' ( (lv_path_3_0= RULE_INT ) ) )? ) )
            // InternalStateMachine.g:958:2: ( () otherlv_1= 'skipPath' (otherlv_2= 'Path:' ( (lv_path_3_0= RULE_INT ) ) )? )
            {
            // InternalStateMachine.g:958:2: ( () otherlv_1= 'skipPath' (otherlv_2= 'Path:' ( (lv_path_3_0= RULE_INT ) ) )? )
            // InternalStateMachine.g:959:3: () otherlv_1= 'skipPath' (otherlv_2= 'Path:' ( (lv_path_3_0= RULE_INT ) ) )?
            {
            // InternalStateMachine.g:959:3: ()
            // InternalStateMachine.g:960:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSkipPathAccess().getSkipPathAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getSkipPathAccess().getSkipPathKeyword_1());
            		
            // InternalStateMachine.g:970:3: (otherlv_2= 'Path:' ( (lv_path_3_0= RULE_INT ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalStateMachine.g:971:4: otherlv_2= 'Path:' ( (lv_path_3_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_23); 

                    				newLeafNode(otherlv_2, grammarAccess.getSkipPathAccess().getPathKeyword_2_0());
                    			
                    // InternalStateMachine.g:975:4: ( (lv_path_3_0= RULE_INT ) )
                    // InternalStateMachine.g:976:5: (lv_path_3_0= RULE_INT )
                    {
                    // InternalStateMachine.g:976:5: (lv_path_3_0= RULE_INT )
                    // InternalStateMachine.g:977:6: lv_path_3_0= RULE_INT
                    {
                    lv_path_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_path_3_0, grammarAccess.getSkipPathAccess().getPathINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSkipPathRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"path",
                    							lv_path_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


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
    // $ANTLR end "ruleSkipPath"


    // $ANTLR start "entryRuleRestartTask"
    // InternalStateMachine.g:998:1: entryRuleRestartTask returns [EObject current=null] : iv_ruleRestartTask= ruleRestartTask EOF ;
    public final EObject entryRuleRestartTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestartTask = null;


        try {
            // InternalStateMachine.g:998:52: (iv_ruleRestartTask= ruleRestartTask EOF )
            // InternalStateMachine.g:999:2: iv_ruleRestartTask= ruleRestartTask EOF
            {
             newCompositeNode(grammarAccess.getRestartTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRestartTask=ruleRestartTask();

            state._fsp--;

             current =iv_ruleRestartTask; 
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
    // $ANTLR end "entryRuleRestartTask"


    // $ANTLR start "ruleRestartTask"
    // InternalStateMachine.g:1005:1: ruleRestartTask returns [EObject current=null] : ( () otherlv_1= 'restartTask' ) ;
    public final EObject ruleRestartTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalStateMachine.g:1011:2: ( ( () otherlv_1= 'restartTask' ) )
            // InternalStateMachine.g:1012:2: ( () otherlv_1= 'restartTask' )
            {
            // InternalStateMachine.g:1012:2: ( () otherlv_1= 'restartTask' )
            // InternalStateMachine.g:1013:3: () otherlv_1= 'restartTask'
            {
            // InternalStateMachine.g:1013:3: ()
            // InternalStateMachine.g:1014:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRestartTaskAccess().getRestartTaskAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getRestartTaskAccess().getRestartTaskKeyword_1());
            		

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
    // $ANTLR end "ruleRestartTask"


    // $ANTLR start "entryRuleSkipTask"
    // InternalStateMachine.g:1028:1: entryRuleSkipTask returns [EObject current=null] : iv_ruleSkipTask= ruleSkipTask EOF ;
    public final EObject entryRuleSkipTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkipTask = null;


        try {
            // InternalStateMachine.g:1028:49: (iv_ruleSkipTask= ruleSkipTask EOF )
            // InternalStateMachine.g:1029:2: iv_ruleSkipTask= ruleSkipTask EOF
            {
             newCompositeNode(grammarAccess.getSkipTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSkipTask=ruleSkipTask();

            state._fsp--;

             current =iv_ruleSkipTask; 
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
    // $ANTLR end "entryRuleSkipTask"


    // $ANTLR start "ruleSkipTask"
    // InternalStateMachine.g:1035:1: ruleSkipTask returns [EObject current=null] : ( () otherlv_1= 'skipTask' ) ;
    public final EObject ruleSkipTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalStateMachine.g:1041:2: ( ( () otherlv_1= 'skipTask' ) )
            // InternalStateMachine.g:1042:2: ( () otherlv_1= 'skipTask' )
            {
            // InternalStateMachine.g:1042:2: ( () otherlv_1= 'skipTask' )
            // InternalStateMachine.g:1043:3: () otherlv_1= 'skipTask'
            {
            // InternalStateMachine.g:1043:3: ()
            // InternalStateMachine.g:1044:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSkipTaskAccess().getSkipTaskAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getSkipTaskAccess().getSkipTaskKeyword_1());
            		

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
    // $ANTLR end "ruleSkipTask"


    // $ANTLR start "entryRuleExpression"
    // InternalStateMachine.g:1058:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalStateMachine.g:1058:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalStateMachine.g:1059:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalStateMachine.g:1065:1: ruleExpression returns [EObject current=null] : this_ExpressionLevel1_0= ruleExpressionLevel1 ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionLevel1_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:1071:2: (this_ExpressionLevel1_0= ruleExpressionLevel1 )
            // InternalStateMachine.g:1072:2: this_ExpressionLevel1_0= ruleExpressionLevel1
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getExpressionLevel1ParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ExpressionLevel1_0=ruleExpressionLevel1();

            state._fsp--;


            		current = this_ExpressionLevel1_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleExpressionLevel1"
    // InternalStateMachine.g:1083:1: entryRuleExpressionLevel1 returns [EObject current=null] : iv_ruleExpressionLevel1= ruleExpressionLevel1 EOF ;
    public final EObject entryRuleExpressionLevel1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLevel1 = null;


        try {
            // InternalStateMachine.g:1083:57: (iv_ruleExpressionLevel1= ruleExpressionLevel1 EOF )
            // InternalStateMachine.g:1084:2: iv_ruleExpressionLevel1= ruleExpressionLevel1 EOF
            {
             newCompositeNode(grammarAccess.getExpressionLevel1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionLevel1=ruleExpressionLevel1();

            state._fsp--;

             current =iv_ruleExpressionLevel1; 
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
    // $ANTLR end "entryRuleExpressionLevel1"


    // $ANTLR start "ruleExpressionLevel1"
    // InternalStateMachine.g:1090:1: ruleExpressionLevel1 returns [EObject current=null] : (this_ExpressionLevel2_0= ruleExpressionLevel2 ( ( () (otherlv_2= 'AND' | otherlv_3= 'and' ) ( (lv_right_4_0= ruleExpressionLevel2 ) ) ) | ( () (otherlv_6= 'OR' | otherlv_7= 'or' ) ( (lv_right_8_0= ruleExpressionLevel2 ) ) ) )* ) ;
    public final EObject ruleExpressionLevel1() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject this_ExpressionLevel2_0 = null;

        EObject lv_right_4_0 = null;

        EObject lv_right_8_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:1096:2: ( (this_ExpressionLevel2_0= ruleExpressionLevel2 ( ( () (otherlv_2= 'AND' | otherlv_3= 'and' ) ( (lv_right_4_0= ruleExpressionLevel2 ) ) ) | ( () (otherlv_6= 'OR' | otherlv_7= 'or' ) ( (lv_right_8_0= ruleExpressionLevel2 ) ) ) )* ) )
            // InternalStateMachine.g:1097:2: (this_ExpressionLevel2_0= ruleExpressionLevel2 ( ( () (otherlv_2= 'AND' | otherlv_3= 'and' ) ( (lv_right_4_0= ruleExpressionLevel2 ) ) ) | ( () (otherlv_6= 'OR' | otherlv_7= 'or' ) ( (lv_right_8_0= ruleExpressionLevel2 ) ) ) )* )
            {
            // InternalStateMachine.g:1097:2: (this_ExpressionLevel2_0= ruleExpressionLevel2 ( ( () (otherlv_2= 'AND' | otherlv_3= 'and' ) ( (lv_right_4_0= ruleExpressionLevel2 ) ) ) | ( () (otherlv_6= 'OR' | otherlv_7= 'or' ) ( (lv_right_8_0= ruleExpressionLevel2 ) ) ) )* )
            // InternalStateMachine.g:1098:3: this_ExpressionLevel2_0= ruleExpressionLevel2 ( ( () (otherlv_2= 'AND' | otherlv_3= 'and' ) ( (lv_right_4_0= ruleExpressionLevel2 ) ) ) | ( () (otherlv_6= 'OR' | otherlv_7= 'or' ) ( (lv_right_8_0= ruleExpressionLevel2 ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpressionLevel1Access().getExpressionLevel2ParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            this_ExpressionLevel2_0=ruleExpressionLevel2();

            state._fsp--;


            			current = this_ExpressionLevel2_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalStateMachine.g:1106:3: ( ( () (otherlv_2= 'AND' | otherlv_3= 'and' ) ( (lv_right_4_0= ruleExpressionLevel2 ) ) ) | ( () (otherlv_6= 'OR' | otherlv_7= 'or' ) ( (lv_right_8_0= ruleExpressionLevel2 ) ) ) )*
            loop17:
            do {
                int alt17=3;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=35 && LA17_0<=36)) ) {
                    alt17=1;
                }
                else if ( ((LA17_0>=37 && LA17_0<=38)) ) {
                    alt17=2;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalStateMachine.g:1107:4: ( () (otherlv_2= 'AND' | otherlv_3= 'and' ) ( (lv_right_4_0= ruleExpressionLevel2 ) ) )
            	    {
            	    // InternalStateMachine.g:1107:4: ( () (otherlv_2= 'AND' | otherlv_3= 'and' ) ( (lv_right_4_0= ruleExpressionLevel2 ) ) )
            	    // InternalStateMachine.g:1108:5: () (otherlv_2= 'AND' | otherlv_3= 'and' ) ( (lv_right_4_0= ruleExpressionLevel2 ) )
            	    {
            	    // InternalStateMachine.g:1108:5: ()
            	    // InternalStateMachine.g:1109:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpressionLevel1Access().getExpressionAndLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    // InternalStateMachine.g:1115:5: (otherlv_2= 'AND' | otherlv_3= 'and' )
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==35) ) {
            	        alt15=1;
            	    }
            	    else if ( (LA15_0==36) ) {
            	        alt15=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // InternalStateMachine.g:1116:6: otherlv_2= 'AND'
            	            {
            	            otherlv_2=(Token)match(input,35,FOLLOW_13); 

            	            						newLeafNode(otherlv_2, grammarAccess.getExpressionLevel1Access().getANDKeyword_1_0_1_0());
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalStateMachine.g:1121:6: otherlv_3= 'and'
            	            {
            	            otherlv_3=(Token)match(input,36,FOLLOW_13); 

            	            						newLeafNode(otherlv_3, grammarAccess.getExpressionLevel1Access().getAndKeyword_1_0_1_1());
            	            					

            	            }
            	            break;

            	    }

            	    // InternalStateMachine.g:1126:5: ( (lv_right_4_0= ruleExpressionLevel2 ) )
            	    // InternalStateMachine.g:1127:6: (lv_right_4_0= ruleExpressionLevel2 )
            	    {
            	    // InternalStateMachine.g:1127:6: (lv_right_4_0= ruleExpressionLevel2 )
            	    // InternalStateMachine.g:1128:7: lv_right_4_0= ruleExpressionLevel2
            	    {

            	    							newCompositeNode(grammarAccess.getExpressionLevel1Access().getRightExpressionLevel2ParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_24);
            	    lv_right_4_0=ruleExpressionLevel2();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getExpressionLevel1Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_4_0,
            	    								"org.artemis.sm.StateMachine.ExpressionLevel2");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalStateMachine.g:1147:4: ( () (otherlv_6= 'OR' | otherlv_7= 'or' ) ( (lv_right_8_0= ruleExpressionLevel2 ) ) )
            	    {
            	    // InternalStateMachine.g:1147:4: ( () (otherlv_6= 'OR' | otherlv_7= 'or' ) ( (lv_right_8_0= ruleExpressionLevel2 ) ) )
            	    // InternalStateMachine.g:1148:5: () (otherlv_6= 'OR' | otherlv_7= 'or' ) ( (lv_right_8_0= ruleExpressionLevel2 ) )
            	    {
            	    // InternalStateMachine.g:1148:5: ()
            	    // InternalStateMachine.g:1149:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpressionLevel1Access().getExpressionOrLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    // InternalStateMachine.g:1155:5: (otherlv_6= 'OR' | otherlv_7= 'or' )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==37) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==38) ) {
            	        alt16=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // InternalStateMachine.g:1156:6: otherlv_6= 'OR'
            	            {
            	            otherlv_6=(Token)match(input,37,FOLLOW_13); 

            	            						newLeafNode(otherlv_6, grammarAccess.getExpressionLevel1Access().getORKeyword_1_1_1_0());
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalStateMachine.g:1161:6: otherlv_7= 'or'
            	            {
            	            otherlv_7=(Token)match(input,38,FOLLOW_13); 

            	            						newLeafNode(otherlv_7, grammarAccess.getExpressionLevel1Access().getOrKeyword_1_1_1_1());
            	            					

            	            }
            	            break;

            	    }

            	    // InternalStateMachine.g:1166:5: ( (lv_right_8_0= ruleExpressionLevel2 ) )
            	    // InternalStateMachine.g:1167:6: (lv_right_8_0= ruleExpressionLevel2 )
            	    {
            	    // InternalStateMachine.g:1167:6: (lv_right_8_0= ruleExpressionLevel2 )
            	    // InternalStateMachine.g:1168:7: lv_right_8_0= ruleExpressionLevel2
            	    {

            	    							newCompositeNode(grammarAccess.getExpressionLevel1Access().getRightExpressionLevel2ParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_24);
            	    lv_right_8_0=ruleExpressionLevel2();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getExpressionLevel1Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_8_0,
            	    								"org.artemis.sm.StateMachine.ExpressionLevel2");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


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
    // $ANTLR end "ruleExpressionLevel1"


    // $ANTLR start "entryRuleExpressionLevel2"
    // InternalStateMachine.g:1191:1: entryRuleExpressionLevel2 returns [EObject current=null] : iv_ruleExpressionLevel2= ruleExpressionLevel2 EOF ;
    public final EObject entryRuleExpressionLevel2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLevel2 = null;


        try {
            // InternalStateMachine.g:1191:57: (iv_ruleExpressionLevel2= ruleExpressionLevel2 EOF )
            // InternalStateMachine.g:1192:2: iv_ruleExpressionLevel2= ruleExpressionLevel2 EOF
            {
             newCompositeNode(grammarAccess.getExpressionLevel2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionLevel2=ruleExpressionLevel2();

            state._fsp--;

             current =iv_ruleExpressionLevel2; 
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
    // $ANTLR end "entryRuleExpressionLevel2"


    // $ANTLR start "ruleExpressionLevel2"
    // InternalStateMachine.g:1198:1: ruleExpressionLevel2 returns [EObject current=null] : (this_ExpressionLevel3_0= ruleExpressionLevel3 ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpressionLevel3 ) ) ) )* ) ;
    public final EObject ruleExpressionLevel2() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_ExpressionLevel3_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:1204:2: ( (this_ExpressionLevel3_0= ruleExpressionLevel3 ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpressionLevel3 ) ) ) )* ) )
            // InternalStateMachine.g:1205:2: (this_ExpressionLevel3_0= ruleExpressionLevel3 ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpressionLevel3 ) ) ) )* )
            {
            // InternalStateMachine.g:1205:2: (this_ExpressionLevel3_0= ruleExpressionLevel3 ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpressionLevel3 ) ) ) )* )
            // InternalStateMachine.g:1206:3: this_ExpressionLevel3_0= ruleExpressionLevel3 ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpressionLevel3 ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpressionLevel2Access().getExpressionLevel3ParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_ExpressionLevel3_0=ruleExpressionLevel3();

            state._fsp--;


            			current = this_ExpressionLevel3_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalStateMachine.g:1214:3: ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpressionLevel3 ) ) ) )*
            loop18:
            do {
                int alt18=3;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==39) ) {
                    alt18=1;
                }
                else if ( (LA18_0==40) ) {
                    alt18=2;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalStateMachine.g:1215:4: ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpressionLevel3 ) ) )
            	    {
            	    // InternalStateMachine.g:1215:4: ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpressionLevel3 ) ) )
            	    // InternalStateMachine.g:1216:5: () otherlv_2= '==' ( (lv_right_3_0= ruleExpressionLevel3 ) )
            	    {
            	    // InternalStateMachine.g:1216:5: ()
            	    // InternalStateMachine.g:1217:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpressionLevel2Access().getExpressionEqualLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,39,FOLLOW_13); 

            	    					newLeafNode(otherlv_2, grammarAccess.getExpressionLevel2Access().getEqualsSignEqualsSignKeyword_1_0_1());
            	    				
            	    // InternalStateMachine.g:1227:5: ( (lv_right_3_0= ruleExpressionLevel3 ) )
            	    // InternalStateMachine.g:1228:6: (lv_right_3_0= ruleExpressionLevel3 )
            	    {
            	    // InternalStateMachine.g:1228:6: (lv_right_3_0= ruleExpressionLevel3 )
            	    // InternalStateMachine.g:1229:7: lv_right_3_0= ruleExpressionLevel3
            	    {

            	    							newCompositeNode(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_25);
            	    lv_right_3_0=ruleExpressionLevel3();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getExpressionLevel2Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_3_0,
            	    								"org.artemis.sm.StateMachine.ExpressionLevel3");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalStateMachine.g:1248:4: ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpressionLevel3 ) ) )
            	    {
            	    // InternalStateMachine.g:1248:4: ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpressionLevel3 ) ) )
            	    // InternalStateMachine.g:1249:5: () otherlv_5= '!=' ( (lv_right_6_0= ruleExpressionLevel3 ) )
            	    {
            	    // InternalStateMachine.g:1249:5: ()
            	    // InternalStateMachine.g:1250:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpressionLevel2Access().getExpressionNEqualLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,40,FOLLOW_13); 

            	    					newLeafNode(otherlv_5, grammarAccess.getExpressionLevel2Access().getExclamationMarkEqualsSignKeyword_1_1_1());
            	    				
            	    // InternalStateMachine.g:1260:5: ( (lv_right_6_0= ruleExpressionLevel3 ) )
            	    // InternalStateMachine.g:1261:6: (lv_right_6_0= ruleExpressionLevel3 )
            	    {
            	    // InternalStateMachine.g:1261:6: (lv_right_6_0= ruleExpressionLevel3 )
            	    // InternalStateMachine.g:1262:7: lv_right_6_0= ruleExpressionLevel3
            	    {

            	    							newCompositeNode(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_25);
            	    lv_right_6_0=ruleExpressionLevel3();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getExpressionLevel2Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_6_0,
            	    								"org.artemis.sm.StateMachine.ExpressionLevel3");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


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
    // $ANTLR end "ruleExpressionLevel2"


    // $ANTLR start "entryRuleExpressionLevel3"
    // InternalStateMachine.g:1285:1: entryRuleExpressionLevel3 returns [EObject current=null] : iv_ruleExpressionLevel3= ruleExpressionLevel3 EOF ;
    public final EObject entryRuleExpressionLevel3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLevel3 = null;


        try {
            // InternalStateMachine.g:1285:57: (iv_ruleExpressionLevel3= ruleExpressionLevel3 EOF )
            // InternalStateMachine.g:1286:2: iv_ruleExpressionLevel3= ruleExpressionLevel3 EOF
            {
             newCompositeNode(grammarAccess.getExpressionLevel3Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionLevel3=ruleExpressionLevel3();

            state._fsp--;

             current =iv_ruleExpressionLevel3; 
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
    // $ANTLR end "entryRuleExpressionLevel3"


    // $ANTLR start "ruleExpressionLevel3"
    // InternalStateMachine.g:1292:1: ruleExpressionLevel3 returns [EObject current=null] : (this_ExpressionLevel4_0= ruleExpressionLevel4 ( ( () otherlv_2= '>=' ( (lv_right_3_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_5= '>' ( (lv_right_6_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_8= '<=' ( (lv_right_9_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_11= '<' ( (lv_right_12_0= ruleExpressionLevel4 ) ) ) )* ) ;
    public final EObject ruleExpressionLevel3() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        EObject this_ExpressionLevel4_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;

        EObject lv_right_9_0 = null;

        EObject lv_right_12_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:1298:2: ( (this_ExpressionLevel4_0= ruleExpressionLevel4 ( ( () otherlv_2= '>=' ( (lv_right_3_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_5= '>' ( (lv_right_6_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_8= '<=' ( (lv_right_9_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_11= '<' ( (lv_right_12_0= ruleExpressionLevel4 ) ) ) )* ) )
            // InternalStateMachine.g:1299:2: (this_ExpressionLevel4_0= ruleExpressionLevel4 ( ( () otherlv_2= '>=' ( (lv_right_3_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_5= '>' ( (lv_right_6_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_8= '<=' ( (lv_right_9_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_11= '<' ( (lv_right_12_0= ruleExpressionLevel4 ) ) ) )* )
            {
            // InternalStateMachine.g:1299:2: (this_ExpressionLevel4_0= ruleExpressionLevel4 ( ( () otherlv_2= '>=' ( (lv_right_3_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_5= '>' ( (lv_right_6_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_8= '<=' ( (lv_right_9_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_11= '<' ( (lv_right_12_0= ruleExpressionLevel4 ) ) ) )* )
            // InternalStateMachine.g:1300:3: this_ExpressionLevel4_0= ruleExpressionLevel4 ( ( () otherlv_2= '>=' ( (lv_right_3_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_5= '>' ( (lv_right_6_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_8= '<=' ( (lv_right_9_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_11= '<' ( (lv_right_12_0= ruleExpressionLevel4 ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpressionLevel3Access().getExpressionLevel4ParserRuleCall_0());
            		
            pushFollow(FOLLOW_26);
            this_ExpressionLevel4_0=ruleExpressionLevel4();

            state._fsp--;


            			current = this_ExpressionLevel4_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalStateMachine.g:1308:3: ( ( () otherlv_2= '>=' ( (lv_right_3_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_5= '>' ( (lv_right_6_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_8= '<=' ( (lv_right_9_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_11= '<' ( (lv_right_12_0= ruleExpressionLevel4 ) ) ) )*
            loop19:
            do {
                int alt19=5;
                switch ( input.LA(1) ) {
                case 41:
                    {
                    alt19=1;
                    }
                    break;
                case 42:
                    {
                    alt19=2;
                    }
                    break;
                case 43:
                    {
                    alt19=3;
                    }
                    break;
                case 44:
                    {
                    alt19=4;
                    }
                    break;

                }

                switch (alt19) {
            	case 1 :
            	    // InternalStateMachine.g:1309:4: ( () otherlv_2= '>=' ( (lv_right_3_0= ruleExpressionLevel4 ) ) )
            	    {
            	    // InternalStateMachine.g:1309:4: ( () otherlv_2= '>=' ( (lv_right_3_0= ruleExpressionLevel4 ) ) )
            	    // InternalStateMachine.g:1310:5: () otherlv_2= '>=' ( (lv_right_3_0= ruleExpressionLevel4 ) )
            	    {
            	    // InternalStateMachine.g:1310:5: ()
            	    // InternalStateMachine.g:1311:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpressionLevel3Access().getExpressionGeqLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,41,FOLLOW_13); 

            	    					newLeafNode(otherlv_2, grammarAccess.getExpressionLevel3Access().getGreaterThanSignEqualsSignKeyword_1_0_1());
            	    				
            	    // InternalStateMachine.g:1321:5: ( (lv_right_3_0= ruleExpressionLevel4 ) )
            	    // InternalStateMachine.g:1322:6: (lv_right_3_0= ruleExpressionLevel4 )
            	    {
            	    // InternalStateMachine.g:1322:6: (lv_right_3_0= ruleExpressionLevel4 )
            	    // InternalStateMachine.g:1323:7: lv_right_3_0= ruleExpressionLevel4
            	    {

            	    							newCompositeNode(grammarAccess.getExpressionLevel3Access().getRightExpressionLevel4ParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_26);
            	    lv_right_3_0=ruleExpressionLevel4();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getExpressionLevel3Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_3_0,
            	    								"org.artemis.sm.StateMachine.ExpressionLevel4");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalStateMachine.g:1342:4: ( () otherlv_5= '>' ( (lv_right_6_0= ruleExpressionLevel4 ) ) )
            	    {
            	    // InternalStateMachine.g:1342:4: ( () otherlv_5= '>' ( (lv_right_6_0= ruleExpressionLevel4 ) ) )
            	    // InternalStateMachine.g:1343:5: () otherlv_5= '>' ( (lv_right_6_0= ruleExpressionLevel4 ) )
            	    {
            	    // InternalStateMachine.g:1343:5: ()
            	    // InternalStateMachine.g:1344:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpressionLevel3Access().getExpressionGreaterLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,42,FOLLOW_13); 

            	    					newLeafNode(otherlv_5, grammarAccess.getExpressionLevel3Access().getGreaterThanSignKeyword_1_1_1());
            	    				
            	    // InternalStateMachine.g:1354:5: ( (lv_right_6_0= ruleExpressionLevel4 ) )
            	    // InternalStateMachine.g:1355:6: (lv_right_6_0= ruleExpressionLevel4 )
            	    {
            	    // InternalStateMachine.g:1355:6: (lv_right_6_0= ruleExpressionLevel4 )
            	    // InternalStateMachine.g:1356:7: lv_right_6_0= ruleExpressionLevel4
            	    {

            	    							newCompositeNode(grammarAccess.getExpressionLevel3Access().getRightExpressionLevel4ParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_26);
            	    lv_right_6_0=ruleExpressionLevel4();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getExpressionLevel3Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_6_0,
            	    								"org.artemis.sm.StateMachine.ExpressionLevel4");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalStateMachine.g:1375:4: ( () otherlv_8= '<=' ( (lv_right_9_0= ruleExpressionLevel4 ) ) )
            	    {
            	    // InternalStateMachine.g:1375:4: ( () otherlv_8= '<=' ( (lv_right_9_0= ruleExpressionLevel4 ) ) )
            	    // InternalStateMachine.g:1376:5: () otherlv_8= '<=' ( (lv_right_9_0= ruleExpressionLevel4 ) )
            	    {
            	    // InternalStateMachine.g:1376:5: ()
            	    // InternalStateMachine.g:1377:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpressionLevel3Access().getExpressionLeqLeftAction_1_2_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_8=(Token)match(input,43,FOLLOW_13); 

            	    					newLeafNode(otherlv_8, grammarAccess.getExpressionLevel3Access().getLessThanSignEqualsSignKeyword_1_2_1());
            	    				
            	    // InternalStateMachine.g:1387:5: ( (lv_right_9_0= ruleExpressionLevel4 ) )
            	    // InternalStateMachine.g:1388:6: (lv_right_9_0= ruleExpressionLevel4 )
            	    {
            	    // InternalStateMachine.g:1388:6: (lv_right_9_0= ruleExpressionLevel4 )
            	    // InternalStateMachine.g:1389:7: lv_right_9_0= ruleExpressionLevel4
            	    {

            	    							newCompositeNode(grammarAccess.getExpressionLevel3Access().getRightExpressionLevel4ParserRuleCall_1_2_2_0());
            	    						
            	    pushFollow(FOLLOW_26);
            	    lv_right_9_0=ruleExpressionLevel4();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getExpressionLevel3Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_9_0,
            	    								"org.artemis.sm.StateMachine.ExpressionLevel4");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalStateMachine.g:1408:4: ( () otherlv_11= '<' ( (lv_right_12_0= ruleExpressionLevel4 ) ) )
            	    {
            	    // InternalStateMachine.g:1408:4: ( () otherlv_11= '<' ( (lv_right_12_0= ruleExpressionLevel4 ) ) )
            	    // InternalStateMachine.g:1409:5: () otherlv_11= '<' ( (lv_right_12_0= ruleExpressionLevel4 ) )
            	    {
            	    // InternalStateMachine.g:1409:5: ()
            	    // InternalStateMachine.g:1410:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpressionLevel3Access().getExpressionLessLeftAction_1_3_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_11=(Token)match(input,44,FOLLOW_13); 

            	    					newLeafNode(otherlv_11, grammarAccess.getExpressionLevel3Access().getLessThanSignKeyword_1_3_1());
            	    				
            	    // InternalStateMachine.g:1420:5: ( (lv_right_12_0= ruleExpressionLevel4 ) )
            	    // InternalStateMachine.g:1421:6: (lv_right_12_0= ruleExpressionLevel4 )
            	    {
            	    // InternalStateMachine.g:1421:6: (lv_right_12_0= ruleExpressionLevel4 )
            	    // InternalStateMachine.g:1422:7: lv_right_12_0= ruleExpressionLevel4
            	    {

            	    							newCompositeNode(grammarAccess.getExpressionLevel3Access().getRightExpressionLevel4ParserRuleCall_1_3_2_0());
            	    						
            	    pushFollow(FOLLOW_26);
            	    lv_right_12_0=ruleExpressionLevel4();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getExpressionLevel3Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_12_0,
            	    								"org.artemis.sm.StateMachine.ExpressionLevel4");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


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
    // $ANTLR end "ruleExpressionLevel3"


    // $ANTLR start "entryRuleExpressionLevel4"
    // InternalStateMachine.g:1445:1: entryRuleExpressionLevel4 returns [EObject current=null] : iv_ruleExpressionLevel4= ruleExpressionLevel4 EOF ;
    public final EObject entryRuleExpressionLevel4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLevel4 = null;


        try {
            // InternalStateMachine.g:1445:57: (iv_ruleExpressionLevel4= ruleExpressionLevel4 EOF )
            // InternalStateMachine.g:1446:2: iv_ruleExpressionLevel4= ruleExpressionLevel4 EOF
            {
             newCompositeNode(grammarAccess.getExpressionLevel4Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionLevel4=ruleExpressionLevel4();

            state._fsp--;

             current =iv_ruleExpressionLevel4; 
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
    // $ANTLR end "entryRuleExpressionLevel4"


    // $ANTLR start "ruleExpressionLevel4"
    // InternalStateMachine.g:1452:1: ruleExpressionLevel4 returns [EObject current=null] : (this_ExpressionLevel5_0= ruleExpressionLevel5 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel5 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel5 ) ) ) )* ) ;
    public final EObject ruleExpressionLevel4() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_ExpressionLevel5_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:1458:2: ( (this_ExpressionLevel5_0= ruleExpressionLevel5 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel5 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel5 ) ) ) )* ) )
            // InternalStateMachine.g:1459:2: (this_ExpressionLevel5_0= ruleExpressionLevel5 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel5 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel5 ) ) ) )* )
            {
            // InternalStateMachine.g:1459:2: (this_ExpressionLevel5_0= ruleExpressionLevel5 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel5 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel5 ) ) ) )* )
            // InternalStateMachine.g:1460:3: this_ExpressionLevel5_0= ruleExpressionLevel5 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel5 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel5 ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpressionLevel4Access().getExpressionLevel5ParserRuleCall_0());
            		
            pushFollow(FOLLOW_27);
            this_ExpressionLevel5_0=ruleExpressionLevel5();

            state._fsp--;


            			current = this_ExpressionLevel5_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalStateMachine.g:1468:3: ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel5 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel5 ) ) ) )*
            loop20:
            do {
                int alt20=3;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==45) ) {
                    alt20=1;
                }
                else if ( (LA20_0==46) ) {
                    alt20=2;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalStateMachine.g:1469:4: ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel5 ) ) )
            	    {
            	    // InternalStateMachine.g:1469:4: ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel5 ) ) )
            	    // InternalStateMachine.g:1470:5: () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel5 ) )
            	    {
            	    // InternalStateMachine.g:1470:5: ()
            	    // InternalStateMachine.g:1471:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpressionLevel4Access().getExpressionAdditionLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,45,FOLLOW_13); 

            	    					newLeafNode(otherlv_2, grammarAccess.getExpressionLevel4Access().getPlusSignKeyword_1_0_1());
            	    				
            	    // InternalStateMachine.g:1481:5: ( (lv_right_3_0= ruleExpressionLevel5 ) )
            	    // InternalStateMachine.g:1482:6: (lv_right_3_0= ruleExpressionLevel5 )
            	    {
            	    // InternalStateMachine.g:1482:6: (lv_right_3_0= ruleExpressionLevel5 )
            	    // InternalStateMachine.g:1483:7: lv_right_3_0= ruleExpressionLevel5
            	    {

            	    							newCompositeNode(grammarAccess.getExpressionLevel4Access().getRightExpressionLevel5ParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_27);
            	    lv_right_3_0=ruleExpressionLevel5();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getExpressionLevel4Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_3_0,
            	    								"org.artemis.sm.StateMachine.ExpressionLevel5");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalStateMachine.g:1502:4: ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel5 ) ) )
            	    {
            	    // InternalStateMachine.g:1502:4: ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel5 ) ) )
            	    // InternalStateMachine.g:1503:5: () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel5 ) )
            	    {
            	    // InternalStateMachine.g:1503:5: ()
            	    // InternalStateMachine.g:1504:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpressionLevel4Access().getExpressionSubtractionLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,46,FOLLOW_13); 

            	    					newLeafNode(otherlv_5, grammarAccess.getExpressionLevel4Access().getHyphenMinusKeyword_1_1_1());
            	    				
            	    // InternalStateMachine.g:1514:5: ( (lv_right_6_0= ruleExpressionLevel5 ) )
            	    // InternalStateMachine.g:1515:6: (lv_right_6_0= ruleExpressionLevel5 )
            	    {
            	    // InternalStateMachine.g:1515:6: (lv_right_6_0= ruleExpressionLevel5 )
            	    // InternalStateMachine.g:1516:7: lv_right_6_0= ruleExpressionLevel5
            	    {

            	    							newCompositeNode(grammarAccess.getExpressionLevel4Access().getRightExpressionLevel5ParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_27);
            	    lv_right_6_0=ruleExpressionLevel5();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getExpressionLevel4Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_6_0,
            	    								"org.artemis.sm.StateMachine.ExpressionLevel5");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


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
    // $ANTLR end "ruleExpressionLevel4"


    // $ANTLR start "entryRuleExpressionLevel5"
    // InternalStateMachine.g:1539:1: entryRuleExpressionLevel5 returns [EObject current=null] : iv_ruleExpressionLevel5= ruleExpressionLevel5 EOF ;
    public final EObject entryRuleExpressionLevel5() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLevel5 = null;


        try {
            // InternalStateMachine.g:1539:57: (iv_ruleExpressionLevel5= ruleExpressionLevel5 EOF )
            // InternalStateMachine.g:1540:2: iv_ruleExpressionLevel5= ruleExpressionLevel5 EOF
            {
             newCompositeNode(grammarAccess.getExpressionLevel5Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionLevel5=ruleExpressionLevel5();

            state._fsp--;

             current =iv_ruleExpressionLevel5; 
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
    // $ANTLR end "entryRuleExpressionLevel5"


    // $ANTLR start "ruleExpressionLevel5"
    // InternalStateMachine.g:1546:1: ruleExpressionLevel5 returns [EObject current=null] : (this_ExpressionLevel6_0= ruleExpressionLevel6 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel6 ) ) ) )* ) ;
    public final EObject ruleExpressionLevel5() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        EObject this_ExpressionLevel6_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;

        EObject lv_right_9_0 = null;

        EObject lv_right_12_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:1552:2: ( (this_ExpressionLevel6_0= ruleExpressionLevel6 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel6 ) ) ) )* ) )
            // InternalStateMachine.g:1553:2: (this_ExpressionLevel6_0= ruleExpressionLevel6 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel6 ) ) ) )* )
            {
            // InternalStateMachine.g:1553:2: (this_ExpressionLevel6_0= ruleExpressionLevel6 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel6 ) ) ) )* )
            // InternalStateMachine.g:1554:3: this_ExpressionLevel6_0= ruleExpressionLevel6 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel6 ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpressionLevel5Access().getExpressionLevel6ParserRuleCall_0());
            		
            pushFollow(FOLLOW_28);
            this_ExpressionLevel6_0=ruleExpressionLevel6();

            state._fsp--;


            			current = this_ExpressionLevel6_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalStateMachine.g:1562:3: ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel6 ) ) ) )*
            loop21:
            do {
                int alt21=5;
                switch ( input.LA(1) ) {
                case 47:
                    {
                    alt21=1;
                    }
                    break;
                case 48:
                    {
                    alt21=2;
                    }
                    break;
                case 49:
                    {
                    alt21=3;
                    }
                    break;
                case 50:
                    {
                    alt21=4;
                    }
                    break;

                }

                switch (alt21) {
            	case 1 :
            	    // InternalStateMachine.g:1563:4: ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel6 ) ) )
            	    {
            	    // InternalStateMachine.g:1563:4: ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel6 ) ) )
            	    // InternalStateMachine.g:1564:5: () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel6 ) )
            	    {
            	    // InternalStateMachine.g:1564:5: ()
            	    // InternalStateMachine.g:1565:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpressionLevel5Access().getExpressionMultiplyLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,47,FOLLOW_13); 

            	    					newLeafNode(otherlv_2, grammarAccess.getExpressionLevel5Access().getAsteriskKeyword_1_0_1());
            	    				
            	    // InternalStateMachine.g:1575:5: ( (lv_right_3_0= ruleExpressionLevel6 ) )
            	    // InternalStateMachine.g:1576:6: (lv_right_3_0= ruleExpressionLevel6 )
            	    {
            	    // InternalStateMachine.g:1576:6: (lv_right_3_0= ruleExpressionLevel6 )
            	    // InternalStateMachine.g:1577:7: lv_right_3_0= ruleExpressionLevel6
            	    {

            	    							newCompositeNode(grammarAccess.getExpressionLevel5Access().getRightExpressionLevel6ParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_28);
            	    lv_right_3_0=ruleExpressionLevel6();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getExpressionLevel5Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_3_0,
            	    								"org.artemis.sm.StateMachine.ExpressionLevel6");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalStateMachine.g:1596:4: ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel6 ) ) )
            	    {
            	    // InternalStateMachine.g:1596:4: ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel6 ) ) )
            	    // InternalStateMachine.g:1597:5: () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel6 ) )
            	    {
            	    // InternalStateMachine.g:1597:5: ()
            	    // InternalStateMachine.g:1598:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpressionLevel5Access().getExpressionDivisionLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,48,FOLLOW_13); 

            	    					newLeafNode(otherlv_5, grammarAccess.getExpressionLevel5Access().getSolidusKeyword_1_1_1());
            	    				
            	    // InternalStateMachine.g:1608:5: ( (lv_right_6_0= ruleExpressionLevel6 ) )
            	    // InternalStateMachine.g:1609:6: (lv_right_6_0= ruleExpressionLevel6 )
            	    {
            	    // InternalStateMachine.g:1609:6: (lv_right_6_0= ruleExpressionLevel6 )
            	    // InternalStateMachine.g:1610:7: lv_right_6_0= ruleExpressionLevel6
            	    {

            	    							newCompositeNode(grammarAccess.getExpressionLevel5Access().getRightExpressionLevel6ParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_28);
            	    lv_right_6_0=ruleExpressionLevel6();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getExpressionLevel5Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_6_0,
            	    								"org.artemis.sm.StateMachine.ExpressionLevel6");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalStateMachine.g:1629:4: ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel6 ) ) )
            	    {
            	    // InternalStateMachine.g:1629:4: ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel6 ) ) )
            	    // InternalStateMachine.g:1630:5: () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel6 ) )
            	    {
            	    // InternalStateMachine.g:1630:5: ()
            	    // InternalStateMachine.g:1631:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpressionLevel5Access().getExpressionMaximumLeftAction_1_2_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_8=(Token)match(input,49,FOLLOW_13); 

            	    					newLeafNode(otherlv_8, grammarAccess.getExpressionLevel5Access().getMaxKeyword_1_2_1());
            	    				
            	    // InternalStateMachine.g:1641:5: ( (lv_right_9_0= ruleExpressionLevel6 ) )
            	    // InternalStateMachine.g:1642:6: (lv_right_9_0= ruleExpressionLevel6 )
            	    {
            	    // InternalStateMachine.g:1642:6: (lv_right_9_0= ruleExpressionLevel6 )
            	    // InternalStateMachine.g:1643:7: lv_right_9_0= ruleExpressionLevel6
            	    {

            	    							newCompositeNode(grammarAccess.getExpressionLevel5Access().getRightExpressionLevel6ParserRuleCall_1_2_2_0());
            	    						
            	    pushFollow(FOLLOW_28);
            	    lv_right_9_0=ruleExpressionLevel6();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getExpressionLevel5Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_9_0,
            	    								"org.artemis.sm.StateMachine.ExpressionLevel6");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalStateMachine.g:1662:4: ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel6 ) ) )
            	    {
            	    // InternalStateMachine.g:1662:4: ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel6 ) ) )
            	    // InternalStateMachine.g:1663:5: () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel6 ) )
            	    {
            	    // InternalStateMachine.g:1663:5: ()
            	    // InternalStateMachine.g:1664:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpressionLevel5Access().getExpressionMinimumLeftAction_1_3_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_11=(Token)match(input,50,FOLLOW_13); 

            	    					newLeafNode(otherlv_11, grammarAccess.getExpressionLevel5Access().getMinKeyword_1_3_1());
            	    				
            	    // InternalStateMachine.g:1674:5: ( (lv_right_12_0= ruleExpressionLevel6 ) )
            	    // InternalStateMachine.g:1675:6: (lv_right_12_0= ruleExpressionLevel6 )
            	    {
            	    // InternalStateMachine.g:1675:6: (lv_right_12_0= ruleExpressionLevel6 )
            	    // InternalStateMachine.g:1676:7: lv_right_12_0= ruleExpressionLevel6
            	    {

            	    							newCompositeNode(grammarAccess.getExpressionLevel5Access().getRightExpressionLevel6ParserRuleCall_1_3_2_0());
            	    						
            	    pushFollow(FOLLOW_28);
            	    lv_right_12_0=ruleExpressionLevel6();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getExpressionLevel5Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_12_0,
            	    								"org.artemis.sm.StateMachine.ExpressionLevel6");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


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
    // $ANTLR end "ruleExpressionLevel5"


    // $ANTLR start "entryRuleExpressionLevel6"
    // InternalStateMachine.g:1699:1: entryRuleExpressionLevel6 returns [EObject current=null] : iv_ruleExpressionLevel6= ruleExpressionLevel6 EOF ;
    public final EObject entryRuleExpressionLevel6() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLevel6 = null;


        try {
            // InternalStateMachine.g:1699:57: (iv_ruleExpressionLevel6= ruleExpressionLevel6 EOF )
            // InternalStateMachine.g:1700:2: iv_ruleExpressionLevel6= ruleExpressionLevel6 EOF
            {
             newCompositeNode(grammarAccess.getExpressionLevel6Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionLevel6=ruleExpressionLevel6();

            state._fsp--;

             current =iv_ruleExpressionLevel6; 
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
    // $ANTLR end "entryRuleExpressionLevel6"


    // $ANTLR start "ruleExpressionLevel6"
    // InternalStateMachine.g:1706:1: ruleExpressionLevel6 returns [EObject current=null] : (this_ExpressionLevel7_0= ruleExpressionLevel7 ( () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel6 ) ) )? ) ;
    public final EObject ruleExpressionLevel6() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ExpressionLevel7_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:1712:2: ( (this_ExpressionLevel7_0= ruleExpressionLevel7 ( () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel6 ) ) )? ) )
            // InternalStateMachine.g:1713:2: (this_ExpressionLevel7_0= ruleExpressionLevel7 ( () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel6 ) ) )? )
            {
            // InternalStateMachine.g:1713:2: (this_ExpressionLevel7_0= ruleExpressionLevel7 ( () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel6 ) ) )? )
            // InternalStateMachine.g:1714:3: this_ExpressionLevel7_0= ruleExpressionLevel7 ( () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel6 ) ) )?
            {

            			newCompositeNode(grammarAccess.getExpressionLevel6Access().getExpressionLevel7ParserRuleCall_0());
            		
            pushFollow(FOLLOW_29);
            this_ExpressionLevel7_0=ruleExpressionLevel7();

            state._fsp--;


            			current = this_ExpressionLevel7_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalStateMachine.g:1722:3: ( () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel6 ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==51) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalStateMachine.g:1723:4: () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel6 ) )
                    {
                    // InternalStateMachine.g:1723:4: ()
                    // InternalStateMachine.g:1724:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getExpressionLevel6Access().getExpressionPowerLeftAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,51,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getExpressionLevel6Access().getCircumflexAccentKeyword_1_1());
                    			
                    // InternalStateMachine.g:1734:4: ( (lv_right_3_0= ruleExpressionLevel6 ) )
                    // InternalStateMachine.g:1735:5: (lv_right_3_0= ruleExpressionLevel6 )
                    {
                    // InternalStateMachine.g:1735:5: (lv_right_3_0= ruleExpressionLevel6 )
                    // InternalStateMachine.g:1736:6: lv_right_3_0= ruleExpressionLevel6
                    {

                    						newCompositeNode(grammarAccess.getExpressionLevel6Access().getRightExpressionLevel6ParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleExpressionLevel6();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressionLevel6Rule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_3_0,
                    							"org.artemis.sm.StateMachine.ExpressionLevel6");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleExpressionLevel6"


    // $ANTLR start "entryRuleExpressionLevel7"
    // InternalStateMachine.g:1758:1: entryRuleExpressionLevel7 returns [EObject current=null] : iv_ruleExpressionLevel7= ruleExpressionLevel7 EOF ;
    public final EObject entryRuleExpressionLevel7() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLevel7 = null;


        try {
            // InternalStateMachine.g:1758:57: (iv_ruleExpressionLevel7= ruleExpressionLevel7 EOF )
            // InternalStateMachine.g:1759:2: iv_ruleExpressionLevel7= ruleExpressionLevel7 EOF
            {
             newCompositeNode(grammarAccess.getExpressionLevel7Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionLevel7=ruleExpressionLevel7();

            state._fsp--;

             current =iv_ruleExpressionLevel7; 
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
    // $ANTLR end "entryRuleExpressionLevel7"


    // $ANTLR start "ruleExpressionLevel7"
    // InternalStateMachine.g:1765:1: ruleExpressionLevel7 returns [EObject current=null] : (this_ExpressionNot_0= ruleExpressionNot | this_ExpressionMinus_1= ruleExpressionMinus | this_ExpressionPlus_2= ruleExpressionPlus | this_ExpressionLevel8_3= ruleExpressionLevel8 ) ;
    public final EObject ruleExpressionLevel7() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionNot_0 = null;

        EObject this_ExpressionMinus_1 = null;

        EObject this_ExpressionPlus_2 = null;

        EObject this_ExpressionLevel8_3 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:1771:2: ( (this_ExpressionNot_0= ruleExpressionNot | this_ExpressionMinus_1= ruleExpressionMinus | this_ExpressionPlus_2= ruleExpressionPlus | this_ExpressionLevel8_3= ruleExpressionLevel8 ) )
            // InternalStateMachine.g:1772:2: (this_ExpressionNot_0= ruleExpressionNot | this_ExpressionMinus_1= ruleExpressionMinus | this_ExpressionPlus_2= ruleExpressionPlus | this_ExpressionLevel8_3= ruleExpressionLevel8 )
            {
            // InternalStateMachine.g:1772:2: (this_ExpressionNot_0= ruleExpressionNot | this_ExpressionMinus_1= ruleExpressionMinus | this_ExpressionPlus_2= ruleExpressionPlus | this_ExpressionLevel8_3= ruleExpressionLevel8 )
            int alt23=4;
            switch ( input.LA(1) ) {
            case 52:
            case 53:
                {
                alt23=1;
                }
                break;
            case 46:
                {
                alt23=2;
                }
                break;
            case 45:
                {
                alt23=3;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_BOOL_LITERAL:
            case RULE_FLOAT:
            case RULE_STRING:
            case 24:
                {
                alt23=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalStateMachine.g:1773:3: this_ExpressionNot_0= ruleExpressionNot
                    {

                    			newCompositeNode(grammarAccess.getExpressionLevel7Access().getExpressionNotParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpressionNot_0=ruleExpressionNot();

                    state._fsp--;


                    			current = this_ExpressionNot_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalStateMachine.g:1782:3: this_ExpressionMinus_1= ruleExpressionMinus
                    {

                    			newCompositeNode(grammarAccess.getExpressionLevel7Access().getExpressionMinusParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpressionMinus_1=ruleExpressionMinus();

                    state._fsp--;


                    			current = this_ExpressionMinus_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalStateMachine.g:1791:3: this_ExpressionPlus_2= ruleExpressionPlus
                    {

                    			newCompositeNode(grammarAccess.getExpressionLevel7Access().getExpressionPlusParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpressionPlus_2=ruleExpressionPlus();

                    state._fsp--;


                    			current = this_ExpressionPlus_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalStateMachine.g:1800:3: this_ExpressionLevel8_3= ruleExpressionLevel8
                    {

                    			newCompositeNode(grammarAccess.getExpressionLevel7Access().getExpressionLevel8ParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpressionLevel8_3=ruleExpressionLevel8();

                    state._fsp--;


                    			current = this_ExpressionLevel8_3;
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
    // $ANTLR end "ruleExpressionLevel7"


    // $ANTLR start "entryRuleExpressionNot"
    // InternalStateMachine.g:1812:1: entryRuleExpressionNot returns [EObject current=null] : iv_ruleExpressionNot= ruleExpressionNot EOF ;
    public final EObject entryRuleExpressionNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionNot = null;


        try {
            // InternalStateMachine.g:1812:54: (iv_ruleExpressionNot= ruleExpressionNot EOF )
            // InternalStateMachine.g:1813:2: iv_ruleExpressionNot= ruleExpressionNot EOF
            {
             newCompositeNode(grammarAccess.getExpressionNotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionNot=ruleExpressionNot();

            state._fsp--;

             current =iv_ruleExpressionNot; 
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
    // $ANTLR end "entryRuleExpressionNot"


    // $ANTLR start "ruleExpressionNot"
    // InternalStateMachine.g:1819:1: ruleExpressionNot returns [EObject current=null] : ( (otherlv_0= 'NOT' | otherlv_1= 'not' ) ( (lv_sub_2_0= ruleExpressionLevel8 ) ) ) ;
    public final EObject ruleExpressionNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_sub_2_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:1825:2: ( ( (otherlv_0= 'NOT' | otherlv_1= 'not' ) ( (lv_sub_2_0= ruleExpressionLevel8 ) ) ) )
            // InternalStateMachine.g:1826:2: ( (otherlv_0= 'NOT' | otherlv_1= 'not' ) ( (lv_sub_2_0= ruleExpressionLevel8 ) ) )
            {
            // InternalStateMachine.g:1826:2: ( (otherlv_0= 'NOT' | otherlv_1= 'not' ) ( (lv_sub_2_0= ruleExpressionLevel8 ) ) )
            // InternalStateMachine.g:1827:3: (otherlv_0= 'NOT' | otherlv_1= 'not' ) ( (lv_sub_2_0= ruleExpressionLevel8 ) )
            {
            // InternalStateMachine.g:1827:3: (otherlv_0= 'NOT' | otherlv_1= 'not' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==52) ) {
                alt24=1;
            }
            else if ( (LA24_0==53) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalStateMachine.g:1828:4: otherlv_0= 'NOT'
                    {
                    otherlv_0=(Token)match(input,52,FOLLOW_13); 

                    				newLeafNode(otherlv_0, grammarAccess.getExpressionNotAccess().getNOTKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalStateMachine.g:1833:4: otherlv_1= 'not'
                    {
                    otherlv_1=(Token)match(input,53,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getExpressionNotAccess().getNotKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalStateMachine.g:1838:3: ( (lv_sub_2_0= ruleExpressionLevel8 ) )
            // InternalStateMachine.g:1839:4: (lv_sub_2_0= ruleExpressionLevel8 )
            {
            // InternalStateMachine.g:1839:4: (lv_sub_2_0= ruleExpressionLevel8 )
            // InternalStateMachine.g:1840:5: lv_sub_2_0= ruleExpressionLevel8
            {

            					newCompositeNode(grammarAccess.getExpressionNotAccess().getSubExpressionLevel8ParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_sub_2_0=ruleExpressionLevel8();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionNotRule());
            					}
            					set(
            						current,
            						"sub",
            						lv_sub_2_0,
            						"org.artemis.sm.StateMachine.ExpressionLevel8");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleExpressionNot"


    // $ANTLR start "entryRuleExpressionMinus"
    // InternalStateMachine.g:1861:1: entryRuleExpressionMinus returns [EObject current=null] : iv_ruleExpressionMinus= ruleExpressionMinus EOF ;
    public final EObject entryRuleExpressionMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionMinus = null;


        try {
            // InternalStateMachine.g:1861:56: (iv_ruleExpressionMinus= ruleExpressionMinus EOF )
            // InternalStateMachine.g:1862:2: iv_ruleExpressionMinus= ruleExpressionMinus EOF
            {
             newCompositeNode(grammarAccess.getExpressionMinusRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionMinus=ruleExpressionMinus();

            state._fsp--;

             current =iv_ruleExpressionMinus; 
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
    // $ANTLR end "entryRuleExpressionMinus"


    // $ANTLR start "ruleExpressionMinus"
    // InternalStateMachine.g:1868:1: ruleExpressionMinus returns [EObject current=null] : (otherlv_0= '-' ( (lv_sub_1_0= ruleExpressionLevel8 ) ) ) ;
    public final EObject ruleExpressionMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_sub_1_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:1874:2: ( (otherlv_0= '-' ( (lv_sub_1_0= ruleExpressionLevel8 ) ) ) )
            // InternalStateMachine.g:1875:2: (otherlv_0= '-' ( (lv_sub_1_0= ruleExpressionLevel8 ) ) )
            {
            // InternalStateMachine.g:1875:2: (otherlv_0= '-' ( (lv_sub_1_0= ruleExpressionLevel8 ) ) )
            // InternalStateMachine.g:1876:3: otherlv_0= '-' ( (lv_sub_1_0= ruleExpressionLevel8 ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getExpressionMinusAccess().getHyphenMinusKeyword_0());
            		
            // InternalStateMachine.g:1880:3: ( (lv_sub_1_0= ruleExpressionLevel8 ) )
            // InternalStateMachine.g:1881:4: (lv_sub_1_0= ruleExpressionLevel8 )
            {
            // InternalStateMachine.g:1881:4: (lv_sub_1_0= ruleExpressionLevel8 )
            // InternalStateMachine.g:1882:5: lv_sub_1_0= ruleExpressionLevel8
            {

            					newCompositeNode(grammarAccess.getExpressionMinusAccess().getSubExpressionLevel8ParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_sub_1_0=ruleExpressionLevel8();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionMinusRule());
            					}
            					set(
            						current,
            						"sub",
            						lv_sub_1_0,
            						"org.artemis.sm.StateMachine.ExpressionLevel8");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleExpressionMinus"


    // $ANTLR start "entryRuleExpressionPlus"
    // InternalStateMachine.g:1903:1: entryRuleExpressionPlus returns [EObject current=null] : iv_ruleExpressionPlus= ruleExpressionPlus EOF ;
    public final EObject entryRuleExpressionPlus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionPlus = null;


        try {
            // InternalStateMachine.g:1903:55: (iv_ruleExpressionPlus= ruleExpressionPlus EOF )
            // InternalStateMachine.g:1904:2: iv_ruleExpressionPlus= ruleExpressionPlus EOF
            {
             newCompositeNode(grammarAccess.getExpressionPlusRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionPlus=ruleExpressionPlus();

            state._fsp--;

             current =iv_ruleExpressionPlus; 
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
    // $ANTLR end "entryRuleExpressionPlus"


    // $ANTLR start "ruleExpressionPlus"
    // InternalStateMachine.g:1910:1: ruleExpressionPlus returns [EObject current=null] : (otherlv_0= '+' ( (lv_sub_1_0= ruleExpressionLevel8 ) ) ) ;
    public final EObject ruleExpressionPlus() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_sub_1_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:1916:2: ( (otherlv_0= '+' ( (lv_sub_1_0= ruleExpressionLevel8 ) ) ) )
            // InternalStateMachine.g:1917:2: (otherlv_0= '+' ( (lv_sub_1_0= ruleExpressionLevel8 ) ) )
            {
            // InternalStateMachine.g:1917:2: (otherlv_0= '+' ( (lv_sub_1_0= ruleExpressionLevel8 ) ) )
            // InternalStateMachine.g:1918:3: otherlv_0= '+' ( (lv_sub_1_0= ruleExpressionLevel8 ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getExpressionPlusAccess().getPlusSignKeyword_0());
            		
            // InternalStateMachine.g:1922:3: ( (lv_sub_1_0= ruleExpressionLevel8 ) )
            // InternalStateMachine.g:1923:4: (lv_sub_1_0= ruleExpressionLevel8 )
            {
            // InternalStateMachine.g:1923:4: (lv_sub_1_0= ruleExpressionLevel8 )
            // InternalStateMachine.g:1924:5: lv_sub_1_0= ruleExpressionLevel8
            {

            					newCompositeNode(grammarAccess.getExpressionPlusAccess().getSubExpressionLevel8ParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_sub_1_0=ruleExpressionLevel8();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionPlusRule());
            					}
            					set(
            						current,
            						"sub",
            						lv_sub_1_0,
            						"org.artemis.sm.StateMachine.ExpressionLevel8");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleExpressionPlus"


    // $ANTLR start "entryRuleExpressionLevel8"
    // InternalStateMachine.g:1945:1: entryRuleExpressionLevel8 returns [EObject current=null] : iv_ruleExpressionLevel8= ruleExpressionLevel8 EOF ;
    public final EObject entryRuleExpressionLevel8() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLevel8 = null;


        try {
            // InternalStateMachine.g:1945:57: (iv_ruleExpressionLevel8= ruleExpressionLevel8 EOF )
            // InternalStateMachine.g:1946:2: iv_ruleExpressionLevel8= ruleExpressionLevel8 EOF
            {
             newCompositeNode(grammarAccess.getExpressionLevel8Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionLevel8=ruleExpressionLevel8();

            state._fsp--;

             current =iv_ruleExpressionLevel8; 
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
    // $ANTLR end "entryRuleExpressionLevel8"


    // $ANTLR start "ruleExpressionLevel8"
    // InternalStateMachine.g:1952:1: ruleExpressionLevel8 returns [EObject current=null] : (this_ExpressionBracket_0= ruleExpressionBracket | this_ExpressionConstantBool_1= ruleExpressionConstantBool | this_ExpressionConstantInt_2= ruleExpressionConstantInt | this_ExpressionConstantReal_3= ruleExpressionConstantReal | this_ExpressionConstantString_4= ruleExpressionConstantString | this_ExpressionVariable_5= ruleExpressionVariable ) ;
    public final EObject ruleExpressionLevel8() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionBracket_0 = null;

        EObject this_ExpressionConstantBool_1 = null;

        EObject this_ExpressionConstantInt_2 = null;

        EObject this_ExpressionConstantReal_3 = null;

        EObject this_ExpressionConstantString_4 = null;

        EObject this_ExpressionVariable_5 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:1958:2: ( (this_ExpressionBracket_0= ruleExpressionBracket | this_ExpressionConstantBool_1= ruleExpressionConstantBool | this_ExpressionConstantInt_2= ruleExpressionConstantInt | this_ExpressionConstantReal_3= ruleExpressionConstantReal | this_ExpressionConstantString_4= ruleExpressionConstantString | this_ExpressionVariable_5= ruleExpressionVariable ) )
            // InternalStateMachine.g:1959:2: (this_ExpressionBracket_0= ruleExpressionBracket | this_ExpressionConstantBool_1= ruleExpressionConstantBool | this_ExpressionConstantInt_2= ruleExpressionConstantInt | this_ExpressionConstantReal_3= ruleExpressionConstantReal | this_ExpressionConstantString_4= ruleExpressionConstantString | this_ExpressionVariable_5= ruleExpressionVariable )
            {
            // InternalStateMachine.g:1959:2: (this_ExpressionBracket_0= ruleExpressionBracket | this_ExpressionConstantBool_1= ruleExpressionConstantBool | this_ExpressionConstantInt_2= ruleExpressionConstantInt | this_ExpressionConstantReal_3= ruleExpressionConstantReal | this_ExpressionConstantString_4= ruleExpressionConstantString | this_ExpressionVariable_5= ruleExpressionVariable )
            int alt25=6;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt25=1;
                }
                break;
            case RULE_BOOL_LITERAL:
                {
                alt25=2;
                }
                break;
            case RULE_INT:
                {
                alt25=3;
                }
                break;
            case RULE_FLOAT:
                {
                alt25=4;
                }
                break;
            case RULE_STRING:
                {
                alt25=5;
                }
                break;
            case RULE_ID:
                {
                alt25=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalStateMachine.g:1960:3: this_ExpressionBracket_0= ruleExpressionBracket
                    {

                    			newCompositeNode(grammarAccess.getExpressionLevel8Access().getExpressionBracketParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpressionBracket_0=ruleExpressionBracket();

                    state._fsp--;


                    			current = this_ExpressionBracket_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalStateMachine.g:1969:3: this_ExpressionConstantBool_1= ruleExpressionConstantBool
                    {

                    			newCompositeNode(grammarAccess.getExpressionLevel8Access().getExpressionConstantBoolParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpressionConstantBool_1=ruleExpressionConstantBool();

                    state._fsp--;


                    			current = this_ExpressionConstantBool_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalStateMachine.g:1978:3: this_ExpressionConstantInt_2= ruleExpressionConstantInt
                    {

                    			newCompositeNode(grammarAccess.getExpressionLevel8Access().getExpressionConstantIntParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpressionConstantInt_2=ruleExpressionConstantInt();

                    state._fsp--;


                    			current = this_ExpressionConstantInt_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalStateMachine.g:1987:3: this_ExpressionConstantReal_3= ruleExpressionConstantReal
                    {

                    			newCompositeNode(grammarAccess.getExpressionLevel8Access().getExpressionConstantRealParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpressionConstantReal_3=ruleExpressionConstantReal();

                    state._fsp--;


                    			current = this_ExpressionConstantReal_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalStateMachine.g:1996:3: this_ExpressionConstantString_4= ruleExpressionConstantString
                    {

                    			newCompositeNode(grammarAccess.getExpressionLevel8Access().getExpressionConstantStringParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpressionConstantString_4=ruleExpressionConstantString();

                    state._fsp--;


                    			current = this_ExpressionConstantString_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalStateMachine.g:2005:3: this_ExpressionVariable_5= ruleExpressionVariable
                    {

                    			newCompositeNode(grammarAccess.getExpressionLevel8Access().getExpressionVariableParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpressionVariable_5=ruleExpressionVariable();

                    state._fsp--;


                    			current = this_ExpressionVariable_5;
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
    // $ANTLR end "ruleExpressionLevel8"


    // $ANTLR start "entryRuleExpressionBracket"
    // InternalStateMachine.g:2017:1: entryRuleExpressionBracket returns [EObject current=null] : iv_ruleExpressionBracket= ruleExpressionBracket EOF ;
    public final EObject entryRuleExpressionBracket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionBracket = null;


        try {
            // InternalStateMachine.g:2017:58: (iv_ruleExpressionBracket= ruleExpressionBracket EOF )
            // InternalStateMachine.g:2018:2: iv_ruleExpressionBracket= ruleExpressionBracket EOF
            {
             newCompositeNode(grammarAccess.getExpressionBracketRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionBracket=ruleExpressionBracket();

            state._fsp--;

             current =iv_ruleExpressionBracket; 
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
    // $ANTLR end "entryRuleExpressionBracket"


    // $ANTLR start "ruleExpressionBracket"
    // InternalStateMachine.g:2024:1: ruleExpressionBracket returns [EObject current=null] : (otherlv_0= '(' ( (lv_sub_1_0= ruleExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleExpressionBracket() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_sub_1_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:2030:2: ( (otherlv_0= '(' ( (lv_sub_1_0= ruleExpression ) ) otherlv_2= ')' ) )
            // InternalStateMachine.g:2031:2: (otherlv_0= '(' ( (lv_sub_1_0= ruleExpression ) ) otherlv_2= ')' )
            {
            // InternalStateMachine.g:2031:2: (otherlv_0= '(' ( (lv_sub_1_0= ruleExpression ) ) otherlv_2= ')' )
            // InternalStateMachine.g:2032:3: otherlv_0= '(' ( (lv_sub_1_0= ruleExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getExpressionBracketAccess().getLeftParenthesisKeyword_0());
            		
            // InternalStateMachine.g:2036:3: ( (lv_sub_1_0= ruleExpression ) )
            // InternalStateMachine.g:2037:4: (lv_sub_1_0= ruleExpression )
            {
            // InternalStateMachine.g:2037:4: (lv_sub_1_0= ruleExpression )
            // InternalStateMachine.g:2038:5: lv_sub_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getExpressionBracketAccess().getSubExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_sub_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionBracketRule());
            					}
            					set(
            						current,
            						"sub",
            						lv_sub_1_0,
            						"org.artemis.sm.StateMachine.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getExpressionBracketAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleExpressionBracket"


    // $ANTLR start "entryRuleExpressionConstantBool"
    // InternalStateMachine.g:2063:1: entryRuleExpressionConstantBool returns [EObject current=null] : iv_ruleExpressionConstantBool= ruleExpressionConstantBool EOF ;
    public final EObject entryRuleExpressionConstantBool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionConstantBool = null;


        try {
            // InternalStateMachine.g:2063:63: (iv_ruleExpressionConstantBool= ruleExpressionConstantBool EOF )
            // InternalStateMachine.g:2064:2: iv_ruleExpressionConstantBool= ruleExpressionConstantBool EOF
            {
             newCompositeNode(grammarAccess.getExpressionConstantBoolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionConstantBool=ruleExpressionConstantBool();

            state._fsp--;

             current =iv_ruleExpressionConstantBool; 
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
    // $ANTLR end "entryRuleExpressionConstantBool"


    // $ANTLR start "ruleExpressionConstantBool"
    // InternalStateMachine.g:2070:1: ruleExpressionConstantBool returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOL_LITERAL ) ) ;
    public final EObject ruleExpressionConstantBool() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalStateMachine.g:2076:2: ( ( (lv_value_0_0= RULE_BOOL_LITERAL ) ) )
            // InternalStateMachine.g:2077:2: ( (lv_value_0_0= RULE_BOOL_LITERAL ) )
            {
            // InternalStateMachine.g:2077:2: ( (lv_value_0_0= RULE_BOOL_LITERAL ) )
            // InternalStateMachine.g:2078:3: (lv_value_0_0= RULE_BOOL_LITERAL )
            {
            // InternalStateMachine.g:2078:3: (lv_value_0_0= RULE_BOOL_LITERAL )
            // InternalStateMachine.g:2079:4: lv_value_0_0= RULE_BOOL_LITERAL
            {
            lv_value_0_0=(Token)match(input,RULE_BOOL_LITERAL,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getExpressionConstantBoolAccess().getValueBOOL_LITERALTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getExpressionConstantBoolRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.artemis.sm.StateMachine.BOOL_LITERAL");
            			

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
    // $ANTLR end "ruleExpressionConstantBool"


    // $ANTLR start "entryRuleExpressionConstantInt"
    // InternalStateMachine.g:2098:1: entryRuleExpressionConstantInt returns [EObject current=null] : iv_ruleExpressionConstantInt= ruleExpressionConstantInt EOF ;
    public final EObject entryRuleExpressionConstantInt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionConstantInt = null;


        try {
            // InternalStateMachine.g:2098:62: (iv_ruleExpressionConstantInt= ruleExpressionConstantInt EOF )
            // InternalStateMachine.g:2099:2: iv_ruleExpressionConstantInt= ruleExpressionConstantInt EOF
            {
             newCompositeNode(grammarAccess.getExpressionConstantIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionConstantInt=ruleExpressionConstantInt();

            state._fsp--;

             current =iv_ruleExpressionConstantInt; 
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
    // $ANTLR end "entryRuleExpressionConstantInt"


    // $ANTLR start "ruleExpressionConstantInt"
    // InternalStateMachine.g:2105:1: ruleExpressionConstantInt returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleExpressionConstantInt() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalStateMachine.g:2111:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalStateMachine.g:2112:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalStateMachine.g:2112:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalStateMachine.g:2113:3: (lv_value_0_0= RULE_INT )
            {
            // InternalStateMachine.g:2113:3: (lv_value_0_0= RULE_INT )
            // InternalStateMachine.g:2114:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getExpressionConstantIntAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getExpressionConstantIntRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleExpressionConstantInt"


    // $ANTLR start "entryRuleExpressionConstantReal"
    // InternalStateMachine.g:2133:1: entryRuleExpressionConstantReal returns [EObject current=null] : iv_ruleExpressionConstantReal= ruleExpressionConstantReal EOF ;
    public final EObject entryRuleExpressionConstantReal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionConstantReal = null;


        try {
            // InternalStateMachine.g:2133:63: (iv_ruleExpressionConstantReal= ruleExpressionConstantReal EOF )
            // InternalStateMachine.g:2134:2: iv_ruleExpressionConstantReal= ruleExpressionConstantReal EOF
            {
             newCompositeNode(grammarAccess.getExpressionConstantRealRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionConstantReal=ruleExpressionConstantReal();

            state._fsp--;

             current =iv_ruleExpressionConstantReal; 
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
    // $ANTLR end "entryRuleExpressionConstantReal"


    // $ANTLR start "ruleExpressionConstantReal"
    // InternalStateMachine.g:2140:1: ruleExpressionConstantReal returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleExpressionConstantReal() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalStateMachine.g:2146:2: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // InternalStateMachine.g:2147:2: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // InternalStateMachine.g:2147:2: ( (lv_value_0_0= RULE_FLOAT ) )
            // InternalStateMachine.g:2148:3: (lv_value_0_0= RULE_FLOAT )
            {
            // InternalStateMachine.g:2148:3: (lv_value_0_0= RULE_FLOAT )
            // InternalStateMachine.g:2149:4: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)match(input,RULE_FLOAT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getExpressionConstantRealAccess().getValueFLOATTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getExpressionConstantRealRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.artemis.sm.StateMachine.FLOAT");
            			

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
    // $ANTLR end "ruleExpressionConstantReal"


    // $ANTLR start "entryRuleExpressionConstantString"
    // InternalStateMachine.g:2168:1: entryRuleExpressionConstantString returns [EObject current=null] : iv_ruleExpressionConstantString= ruleExpressionConstantString EOF ;
    public final EObject entryRuleExpressionConstantString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionConstantString = null;


        try {
            // InternalStateMachine.g:2168:65: (iv_ruleExpressionConstantString= ruleExpressionConstantString EOF )
            // InternalStateMachine.g:2169:2: iv_ruleExpressionConstantString= ruleExpressionConstantString EOF
            {
             newCompositeNode(grammarAccess.getExpressionConstantStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionConstantString=ruleExpressionConstantString();

            state._fsp--;

             current =iv_ruleExpressionConstantString; 
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
    // $ANTLR end "entryRuleExpressionConstantString"


    // $ANTLR start "ruleExpressionConstantString"
    // InternalStateMachine.g:2175:1: ruleExpressionConstantString returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleExpressionConstantString() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalStateMachine.g:2181:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalStateMachine.g:2182:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalStateMachine.g:2182:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalStateMachine.g:2183:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalStateMachine.g:2183:3: (lv_value_0_0= RULE_STRING )
            // InternalStateMachine.g:2184:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getExpressionConstantStringAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getExpressionConstantStringRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleExpressionConstantString"


    // $ANTLR start "entryRuleExpressionVariable"
    // InternalStateMachine.g:2203:1: entryRuleExpressionVariable returns [EObject current=null] : iv_ruleExpressionVariable= ruleExpressionVariable EOF ;
    public final EObject entryRuleExpressionVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionVariable = null;


        try {
            // InternalStateMachine.g:2203:59: (iv_ruleExpressionVariable= ruleExpressionVariable EOF )
            // InternalStateMachine.g:2204:2: iv_ruleExpressionVariable= ruleExpressionVariable EOF
            {
             newCompositeNode(grammarAccess.getExpressionVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionVariable=ruleExpressionVariable();

            state._fsp--;

             current =iv_ruleExpressionVariable; 
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
    // $ANTLR end "entryRuleExpressionVariable"


    // $ANTLR start "ruleExpressionVariable"
    // InternalStateMachine.g:2210:1: ruleExpressionVariable returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleExpressionVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalStateMachine.g:2216:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalStateMachine.g:2217:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalStateMachine.g:2217:2: ( (otherlv_0= RULE_ID ) )
            // InternalStateMachine.g:2218:3: (otherlv_0= RULE_ID )
            {
            // InternalStateMachine.g:2218:3: (otherlv_0= RULE_ID )
            // InternalStateMachine.g:2219:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getExpressionVariableRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getExpressionVariableAccess().getVariableVariableCrossReference_0());
            			

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
    // $ANTLR end "ruleExpressionVariable"


    // $ANTLR start "entryRuleTypeDecl"
    // InternalStateMachine.g:2233:1: entryRuleTypeDecl returns [EObject current=null] : iv_ruleTypeDecl= ruleTypeDecl EOF ;
    public final EObject entryRuleTypeDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDecl = null;


        try {
            // InternalStateMachine.g:2233:49: (iv_ruleTypeDecl= ruleTypeDecl EOF )
            // InternalStateMachine.g:2234:2: iv_ruleTypeDecl= ruleTypeDecl EOF
            {
             newCompositeNode(grammarAccess.getTypeDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeDecl=ruleTypeDecl();

            state._fsp--;

             current =iv_ruleTypeDecl; 
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
    // $ANTLR end "entryRuleTypeDecl"


    // $ANTLR start "ruleTypeDecl"
    // InternalStateMachine.g:2240:1: ruleTypeDecl returns [EObject current=null] : (this_EnumTypeDecl_0= ruleEnumTypeDecl | this_SimpleTypeDecl_1= ruleSimpleTypeDecl ) ;
    public final EObject ruleTypeDecl() throws RecognitionException {
        EObject current = null;

        EObject this_EnumTypeDecl_0 = null;

        EObject this_SimpleTypeDecl_1 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:2246:2: ( (this_EnumTypeDecl_0= ruleEnumTypeDecl | this_SimpleTypeDecl_1= ruleSimpleTypeDecl ) )
            // InternalStateMachine.g:2247:2: (this_EnumTypeDecl_0= ruleEnumTypeDecl | this_SimpleTypeDecl_1= ruleSimpleTypeDecl )
            {
            // InternalStateMachine.g:2247:2: (this_EnumTypeDecl_0= ruleEnumTypeDecl | this_SimpleTypeDecl_1= ruleSimpleTypeDecl )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==55) ) {
                alt26=1;
            }
            else if ( (LA26_0==54) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalStateMachine.g:2248:3: this_EnumTypeDecl_0= ruleEnumTypeDecl
                    {

                    			newCompositeNode(grammarAccess.getTypeDeclAccess().getEnumTypeDeclParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EnumTypeDecl_0=ruleEnumTypeDecl();

                    state._fsp--;


                    			current = this_EnumTypeDecl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalStateMachine.g:2257:3: this_SimpleTypeDecl_1= ruleSimpleTypeDecl
                    {

                    			newCompositeNode(grammarAccess.getTypeDeclAccess().getSimpleTypeDeclParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleTypeDecl_1=ruleSimpleTypeDecl();

                    state._fsp--;


                    			current = this_SimpleTypeDecl_1;
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
    // $ANTLR end "ruleTypeDecl"


    // $ANTLR start "entryRuleSimpleTypeDecl"
    // InternalStateMachine.g:2269:1: entryRuleSimpleTypeDecl returns [EObject current=null] : iv_ruleSimpleTypeDecl= ruleSimpleTypeDecl EOF ;
    public final EObject entryRuleSimpleTypeDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleTypeDecl = null;


        try {
            // InternalStateMachine.g:2269:55: (iv_ruleSimpleTypeDecl= ruleSimpleTypeDecl EOF )
            // InternalStateMachine.g:2270:2: iv_ruleSimpleTypeDecl= ruleSimpleTypeDecl EOF
            {
             newCompositeNode(grammarAccess.getSimpleTypeDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleTypeDecl=ruleSimpleTypeDecl();

            state._fsp--;

             current =iv_ruleSimpleTypeDecl; 
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
    // $ANTLR end "entryRuleSimpleTypeDecl"


    // $ANTLR start "ruleSimpleTypeDecl"
    // InternalStateMachine.g:2276:1: ruleSimpleTypeDecl returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSimpleTypeDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalStateMachine.g:2282:2: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalStateMachine.g:2283:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalStateMachine.g:2283:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalStateMachine.g:2284:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSimpleTypeDeclAccess().getTypeKeyword_0());
            		
            // InternalStateMachine.g:2288:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateMachine.g:2289:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStateMachine.g:2289:4: (lv_name_1_0= RULE_ID )
            // InternalStateMachine.g:2290:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSimpleTypeDeclAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSimpleTypeDeclRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


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
    // $ANTLR end "ruleSimpleTypeDecl"


    // $ANTLR start "entryRuleEnumTypeDecl"
    // InternalStateMachine.g:2310:1: entryRuleEnumTypeDecl returns [EObject current=null] : iv_ruleEnumTypeDecl= ruleEnumTypeDecl EOF ;
    public final EObject entryRuleEnumTypeDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumTypeDecl = null;


        try {
            // InternalStateMachine.g:2310:53: (iv_ruleEnumTypeDecl= ruleEnumTypeDecl EOF )
            // InternalStateMachine.g:2311:2: iv_ruleEnumTypeDecl= ruleEnumTypeDecl EOF
            {
             newCompositeNode(grammarAccess.getEnumTypeDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumTypeDecl=ruleEnumTypeDecl();

            state._fsp--;

             current =iv_ruleEnumTypeDecl; 
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
    // $ANTLR end "entryRuleEnumTypeDecl"


    // $ANTLR start "ruleEnumTypeDecl"
    // InternalStateMachine.g:2317:1: ruleEnumTypeDecl returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleEnumElement ) )+ otherlv_4= '}' ) ;
    public final EObject ruleEnumTypeDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_literals_3_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:2323:2: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleEnumElement ) )+ otherlv_4= '}' ) )
            // InternalStateMachine.g:2324:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleEnumElement ) )+ otherlv_4= '}' )
            {
            // InternalStateMachine.g:2324:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleEnumElement ) )+ otherlv_4= '}' )
            // InternalStateMachine.g:2325:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleEnumElement ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumTypeDeclAccess().getEnumKeyword_0());
            		
            // InternalStateMachine.g:2329:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateMachine.g:2330:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStateMachine.g:2330:4: (lv_name_1_0= RULE_ID )
            // InternalStateMachine.g:2331:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEnumTypeDeclAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumTypeDeclRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumTypeDeclAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalStateMachine.g:2351:3: ( (lv_literals_3_0= ruleEnumElement ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalStateMachine.g:2352:4: (lv_literals_3_0= ruleEnumElement )
            	    {
            	    // InternalStateMachine.g:2352:4: (lv_literals_3_0= ruleEnumElement )
            	    // InternalStateMachine.g:2353:5: lv_literals_3_0= ruleEnumElement
            	    {

            	    					newCompositeNode(grammarAccess.getEnumTypeDeclAccess().getLiteralsEnumElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_30);
            	    lv_literals_3_0=ruleEnumElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEnumTypeDeclRule());
            	    					}
            	    					add(
            	    						current,
            	    						"literals",
            	    						lv_literals_3_0,
            	    						"org.artemis.base.Base.EnumElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEnumTypeDeclAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleEnumTypeDecl"


    // $ANTLR start "entryRuleEnumElement"
    // InternalStateMachine.g:2378:1: entryRuleEnumElement returns [EObject current=null] : iv_ruleEnumElement= ruleEnumElement EOF ;
    public final EObject entryRuleEnumElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumElement = null;


        try {
            // InternalStateMachine.g:2378:52: (iv_ruleEnumElement= ruleEnumElement EOF )
            // InternalStateMachine.g:2379:2: iv_ruleEnumElement= ruleEnumElement EOF
            {
             newCompositeNode(grammarAccess.getEnumElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumElement=ruleEnumElement();

            state._fsp--;

             current =iv_ruleEnumElement; 
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
    // $ANTLR end "entryRuleEnumElement"


    // $ANTLR start "ruleEnumElement"
    // InternalStateMachine.g:2385:1: ruleEnumElement returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEnumElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalStateMachine.g:2391:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalStateMachine.g:2392:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalStateMachine.g:2392:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalStateMachine.g:2393:3: (lv_name_0_0= RULE_ID )
            {
            // InternalStateMachine.g:2393:3: (lv_name_0_0= RULE_ID )
            // InternalStateMachine.g:2394:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getEnumElementAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEnumElementRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleEnumElement"


    // $ANTLR start "entryRuleArray"
    // InternalStateMachine.g:2413:1: entryRuleArray returns [EObject current=null] : iv_ruleArray= ruleArray EOF ;
    public final EObject entryRuleArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArray = null;


        try {
            // InternalStateMachine.g:2413:46: (iv_ruleArray= ruleArray EOF )
            // InternalStateMachine.g:2414:2: iv_ruleArray= ruleArray EOF
            {
             newCompositeNode(grammarAccess.getArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArray=ruleArray();

            state._fsp--;

             current =iv_ruleArray; 
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
    // $ANTLR end "entryRuleArray"


    // $ANTLR start "ruleArray"
    // InternalStateMachine.g:2420:1: ruleArray returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' otherlv_2= ']' ) ;
    public final EObject ruleArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalStateMachine.g:2426:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' otherlv_2= ']' ) )
            // InternalStateMachine.g:2427:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' otherlv_2= ']' )
            {
            // InternalStateMachine.g:2427:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' otherlv_2= ']' )
            // InternalStateMachine.g:2428:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' otherlv_2= ']'
            {
            // InternalStateMachine.g:2428:3: ( (otherlv_0= RULE_ID ) )
            // InternalStateMachine.g:2429:4: (otherlv_0= RULE_ID )
            {
            // InternalStateMachine.g:2429:4: (otherlv_0= RULE_ID )
            // InternalStateMachine.g:2430:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArrayRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(otherlv_0, grammarAccess.getArrayAccess().getBaseTypeTypeDeclCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,56,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,57,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getArrayAccess().getRightSquareBracketKeyword_2());
            		

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
    // $ANTLR end "ruleArray"


    // $ANTLR start "entryRuleType"
    // InternalStateMachine.g:2453:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalStateMachine.g:2453:45: (iv_ruleType= ruleType EOF )
            // InternalStateMachine.g:2454:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalStateMachine.g:2460:1: ruleType returns [EObject current=null] : (this_TypeRef_0= ruleTypeRef | this_Array_1= ruleArray ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_TypeRef_0 = null;

        EObject this_Array_1 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:2466:2: ( (this_TypeRef_0= ruleTypeRef | this_Array_1= ruleArray ) )
            // InternalStateMachine.g:2467:2: (this_TypeRef_0= ruleTypeRef | this_Array_1= ruleArray )
            {
            // InternalStateMachine.g:2467:2: (this_TypeRef_0= ruleTypeRef | this_Array_1= ruleArray )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==EOF||LA28_1==RULE_ID) ) {
                    alt28=1;
                }
                else if ( (LA28_1==56) ) {
                    alt28=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalStateMachine.g:2468:3: this_TypeRef_0= ruleTypeRef
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getTypeRefParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TypeRef_0=ruleTypeRef();

                    state._fsp--;


                    			current = this_TypeRef_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalStateMachine.g:2477:3: this_Array_1= ruleArray
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getArrayParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Array_1=ruleArray();

                    state._fsp--;


                    			current = this_Array_1;
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleTypeRef"
    // InternalStateMachine.g:2489:1: entryRuleTypeRef returns [EObject current=null] : iv_ruleTypeRef= ruleTypeRef EOF ;
    public final EObject entryRuleTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRef = null;


        try {
            // InternalStateMachine.g:2489:48: (iv_ruleTypeRef= ruleTypeRef EOF )
            // InternalStateMachine.g:2490:2: iv_ruleTypeRef= ruleTypeRef EOF
            {
             newCompositeNode(grammarAccess.getTypeRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeRef=ruleTypeRef();

            state._fsp--;

             current =iv_ruleTypeRef; 
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
    // $ANTLR end "entryRuleTypeRef"


    // $ANTLR start "ruleTypeRef"
    // InternalStateMachine.g:2496:1: ruleTypeRef returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalStateMachine.g:2502:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalStateMachine.g:2503:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalStateMachine.g:2503:2: ( (otherlv_0= RULE_ID ) )
            // InternalStateMachine.g:2504:3: (otherlv_0= RULE_ID )
            {
            // InternalStateMachine.g:2504:3: (otherlv_0= RULE_ID )
            // InternalStateMachine.g:2505:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTypeRefRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getTypeRefAccess().getTypeTypeDeclCrossReference_0());
            			

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
    // $ANTLR end "ruleTypeRef"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000068000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000068010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000018800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000740300010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00306000010001F0L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000740200010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000007800000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00001E0000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0007800000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0200000000000000L});

}