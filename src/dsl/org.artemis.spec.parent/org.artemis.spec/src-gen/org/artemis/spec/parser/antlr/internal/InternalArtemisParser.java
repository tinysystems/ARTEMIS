package org.artemis.spec.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.artemis.spec.services.ArtemisGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalArtemisParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Task'", "'('", "'Path:'", "','", "')'", "'{'", "'}'", "'period:'", "'ms'", "'onFail:'", "'maxAttempt:'", "';'", "'maxTries:'", "'maxDuration:'", "'MITD:'", "'dpTask:'", "'collect:'", "'restartPath'", "'skipPath'", "'restartTask'", "'skipTask'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int RULE_FLOAT=6;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalArtemisParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalArtemisParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalArtemisParser.tokenNames; }
    public String getGrammarFileName() { return "InternalArtemis.g"; }



     	private ArtemisGrammarAccess grammarAccess;

        public InternalArtemisParser(TokenStream input, ArtemisGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ArtemisModel";
       	}

       	@Override
       	protected ArtemisGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleArtemisModel"
    // InternalArtemis.g:64:1: entryRuleArtemisModel returns [EObject current=null] : iv_ruleArtemisModel= ruleArtemisModel EOF ;
    public final EObject entryRuleArtemisModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtemisModel = null;


        try {
            // InternalArtemis.g:64:53: (iv_ruleArtemisModel= ruleArtemisModel EOF )
            // InternalArtemis.g:65:2: iv_ruleArtemisModel= ruleArtemisModel EOF
            {
             newCompositeNode(grammarAccess.getArtemisModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArtemisModel=ruleArtemisModel();

            state._fsp--;

             current =iv_ruleArtemisModel; 
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
    // $ANTLR end "entryRuleArtemisModel"


    // $ANTLR start "ruleArtemisModel"
    // InternalArtemis.g:71:1: ruleArtemisModel returns [EObject current=null] : ( ( (lv_tasks_0_0= ruleTask ) )+ ( (lv_paths_1_0= rulePath ) )+ ( (lv_taskProperties_2_0= ruleTaskProperties ) )+ ) ;
    public final EObject ruleArtemisModel() throws RecognitionException {
        EObject current = null;

        EObject lv_tasks_0_0 = null;

        EObject lv_paths_1_0 = null;

        EObject lv_taskProperties_2_0 = null;



        	enterRule();

        try {
            // InternalArtemis.g:77:2: ( ( ( (lv_tasks_0_0= ruleTask ) )+ ( (lv_paths_1_0= rulePath ) )+ ( (lv_taskProperties_2_0= ruleTaskProperties ) )+ ) )
            // InternalArtemis.g:78:2: ( ( (lv_tasks_0_0= ruleTask ) )+ ( (lv_paths_1_0= rulePath ) )+ ( (lv_taskProperties_2_0= ruleTaskProperties ) )+ )
            {
            // InternalArtemis.g:78:2: ( ( (lv_tasks_0_0= ruleTask ) )+ ( (lv_paths_1_0= rulePath ) )+ ( (lv_taskProperties_2_0= ruleTaskProperties ) )+ )
            // InternalArtemis.g:79:3: ( (lv_tasks_0_0= ruleTask ) )+ ( (lv_paths_1_0= rulePath ) )+ ( (lv_taskProperties_2_0= ruleTaskProperties ) )+
            {
            // InternalArtemis.g:79:3: ( (lv_tasks_0_0= ruleTask ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalArtemis.g:80:4: (lv_tasks_0_0= ruleTask )
            	    {
            	    // InternalArtemis.g:80:4: (lv_tasks_0_0= ruleTask )
            	    // InternalArtemis.g:81:5: lv_tasks_0_0= ruleTask
            	    {

            	    					newCompositeNode(grammarAccess.getArtemisModelAccess().getTasksTaskParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_tasks_0_0=ruleTask();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getArtemisModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tasks",
            	    						lv_tasks_0_0,
            	    						"org.artemis.spec.Artemis.Task");
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

            // InternalArtemis.g:98:3: ( (lv_paths_1_0= rulePath ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalArtemis.g:99:4: (lv_paths_1_0= rulePath )
            	    {
            	    // InternalArtemis.g:99:4: (lv_paths_1_0= rulePath )
            	    // InternalArtemis.g:100:5: lv_paths_1_0= rulePath
            	    {

            	    					newCompositeNode(grammarAccess.getArtemisModelAccess().getPathsPathParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_paths_1_0=rulePath();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getArtemisModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"paths",
            	    						lv_paths_1_0,
            	    						"org.artemis.spec.Artemis.Path");
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

            // InternalArtemis.g:117:3: ( (lv_taskProperties_2_0= ruleTaskProperties ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalArtemis.g:118:4: (lv_taskProperties_2_0= ruleTaskProperties )
            	    {
            	    // InternalArtemis.g:118:4: (lv_taskProperties_2_0= ruleTaskProperties )
            	    // InternalArtemis.g:119:5: lv_taskProperties_2_0= ruleTaskProperties
            	    {

            	    					newCompositeNode(grammarAccess.getArtemisModelAccess().getTaskPropertiesTaskPropertiesParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_taskProperties_2_0=ruleTaskProperties();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getArtemisModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"taskProperties",
            	    						lv_taskProperties_2_0,
            	    						"org.artemis.spec.Artemis.TaskProperties");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
    // $ANTLR end "ruleArtemisModel"


    // $ANTLR start "entryRuleTask"
    // InternalArtemis.g:140:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalArtemis.g:140:45: (iv_ruleTask= ruleTask EOF )
            // InternalArtemis.g:141:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
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
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalArtemis.g:147:1: ruleTask returns [EObject current=null] : (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalArtemis.g:153:2: ( (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalArtemis.g:154:2: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalArtemis.g:154:2: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalArtemis.g:155:3: otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
            		
            // InternalArtemis.g:159:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalArtemis.g:160:4: (lv_name_1_0= RULE_ID )
            {
            // InternalArtemis.g:160:4: (lv_name_1_0= RULE_ID )
            // InternalArtemis.g:161:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
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
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRulePath"
    // InternalArtemis.g:181:1: entryRulePath returns [EObject current=null] : iv_rulePath= rulePath EOF ;
    public final EObject entryRulePath() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePath = null;


        try {
            // InternalArtemis.g:181:45: (iv_rulePath= rulePath EOF )
            // InternalArtemis.g:182:2: iv_rulePath= rulePath EOF
            {
             newCompositeNode(grammarAccess.getPathRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePath=rulePath();

            state._fsp--;

             current =iv_rulePath; 
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
    // $ANTLR end "entryRulePath"


    // $ANTLR start "rulePath"
    // InternalArtemis.g:188:1: rulePath returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'Path:' ( (lv_id_2_0= RULE_INT ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= ')' ) ;
    public final EObject rulePath() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalArtemis.g:194:2: ( (otherlv_0= '(' otherlv_1= 'Path:' ( (lv_id_2_0= RULE_INT ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= ')' ) )
            // InternalArtemis.g:195:2: (otherlv_0= '(' otherlv_1= 'Path:' ( (lv_id_2_0= RULE_INT ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= ')' )
            {
            // InternalArtemis.g:195:2: (otherlv_0= '(' otherlv_1= 'Path:' ( (lv_id_2_0= RULE_INT ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= ')' )
            // InternalArtemis.g:196:3: otherlv_0= '(' otherlv_1= 'Path:' ( (lv_id_2_0= RULE_INT ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPathAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getPathAccess().getPathKeyword_1());
            		
            // InternalArtemis.g:204:3: ( (lv_id_2_0= RULE_INT ) )
            // InternalArtemis.g:205:4: (lv_id_2_0= RULE_INT )
            {
            // InternalArtemis.g:205:4: (lv_id_2_0= RULE_INT )
            // InternalArtemis.g:206:5: lv_id_2_0= RULE_INT
            {
            lv_id_2_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            					newLeafNode(lv_id_2_0, grammarAccess.getPathAccess().getIdINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPathRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalArtemis.g:222:3: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalArtemis.g:223:4: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_6); 

            	    				newLeafNode(otherlv_3, grammarAccess.getPathAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalArtemis.g:227:4: ( (otherlv_4= RULE_ID ) )
            	    // InternalArtemis.g:228:5: (otherlv_4= RULE_ID )
            	    {
            	    // InternalArtemis.g:228:5: (otherlv_4= RULE_ID )
            	    // InternalArtemis.g:229:6: otherlv_4= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPathRule());
            	    						}
            	    					
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    						newLeafNode(otherlv_4, grammarAccess.getPathAccess().getTasksTaskCrossReference_3_1_0());
            	    					

            	    }


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

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPathAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "rulePath"


    // $ANTLR start "entryRuleTaskProperties"
    // InternalArtemis.g:249:1: entryRuleTaskProperties returns [EObject current=null] : iv_ruleTaskProperties= ruleTaskProperties EOF ;
    public final EObject entryRuleTaskProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskProperties = null;


        try {
            // InternalArtemis.g:249:55: (iv_ruleTaskProperties= ruleTaskProperties EOF )
            // InternalArtemis.g:250:2: iv_ruleTaskProperties= ruleTaskProperties EOF
            {
             newCompositeNode(grammarAccess.getTaskPropertiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskProperties=ruleTaskProperties();

            state._fsp--;

             current =iv_ruleTaskProperties; 
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
    // $ANTLR end "entryRuleTaskProperties"


    // $ANTLR start "ruleTaskProperties"
    // InternalArtemis.g:256:1: ruleTaskProperties returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( (lv_properties_2_0= ruleProperty ) )+ otherlv_3= '}' ) ;
    public final EObject ruleTaskProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_properties_2_0 = null;



        	enterRule();

        try {
            // InternalArtemis.g:262:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( (lv_properties_2_0= ruleProperty ) )+ otherlv_3= '}' ) )
            // InternalArtemis.g:263:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( (lv_properties_2_0= ruleProperty ) )+ otherlv_3= '}' )
            {
            // InternalArtemis.g:263:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( (lv_properties_2_0= ruleProperty ) )+ otherlv_3= '}' )
            // InternalArtemis.g:264:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( (lv_properties_2_0= ruleProperty ) )+ otherlv_3= '}'
            {
            // InternalArtemis.g:264:3: ( (otherlv_0= RULE_ID ) )
            // InternalArtemis.g:265:4: (otherlv_0= RULE_ID )
            {
            // InternalArtemis.g:265:4: (otherlv_0= RULE_ID )
            // InternalArtemis.g:266:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskPropertiesRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_0, grammarAccess.getTaskPropertiesAccess().getTaskTaskCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskPropertiesAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalArtemis.g:281:3: ( (lv_properties_2_0= ruleProperty ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19||(LA5_0>=24 && LA5_0<=26)||LA5_0==28) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalArtemis.g:282:4: (lv_properties_2_0= ruleProperty )
            	    {
            	    // InternalArtemis.g:282:4: (lv_properties_2_0= ruleProperty )
            	    // InternalArtemis.g:283:5: lv_properties_2_0= ruleProperty
            	    {

            	    					newCompositeNode(grammarAccess.getTaskPropertiesAccess().getPropertiesPropertyParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_properties_2_0=ruleProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTaskPropertiesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_2_0,
            	    						"org.artemis.spec.Artemis.Property");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            otherlv_3=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getTaskPropertiesAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleTaskProperties"


    // $ANTLR start "entryRuleProperty"
    // InternalArtemis.g:308:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalArtemis.g:308:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalArtemis.g:309:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalArtemis.g:315:1: ruleProperty returns [EObject current=null] : (this_Period_0= rulePeriod | this_MaxTries_1= ruleMaxTries | this_MaxDuration_2= ruleMaxDuration | this_Mitd_3= ruleMitd | this_Collect_4= ruleCollect ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        EObject this_Period_0 = null;

        EObject this_MaxTries_1 = null;

        EObject this_MaxDuration_2 = null;

        EObject this_Mitd_3 = null;

        EObject this_Collect_4 = null;



        	enterRule();

        try {
            // InternalArtemis.g:321:2: ( (this_Period_0= rulePeriod | this_MaxTries_1= ruleMaxTries | this_MaxDuration_2= ruleMaxDuration | this_Mitd_3= ruleMitd | this_Collect_4= ruleCollect ) )
            // InternalArtemis.g:322:2: (this_Period_0= rulePeriod | this_MaxTries_1= ruleMaxTries | this_MaxDuration_2= ruleMaxDuration | this_Mitd_3= ruleMitd | this_Collect_4= ruleCollect )
            {
            // InternalArtemis.g:322:2: (this_Period_0= rulePeriod | this_MaxTries_1= ruleMaxTries | this_MaxDuration_2= ruleMaxDuration | this_Mitd_3= ruleMitd | this_Collect_4= ruleCollect )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt6=1;
                }
                break;
            case 24:
                {
                alt6=2;
                }
                break;
            case 25:
                {
                alt6=3;
                }
                break;
            case 26:
                {
                alt6=4;
                }
                break;
            case 28:
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
                    // InternalArtemis.g:323:3: this_Period_0= rulePeriod
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getPeriodParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Period_0=rulePeriod();

                    state._fsp--;


                    			current = this_Period_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalArtemis.g:332:3: this_MaxTries_1= ruleMaxTries
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getMaxTriesParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MaxTries_1=ruleMaxTries();

                    state._fsp--;


                    			current = this_MaxTries_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalArtemis.g:341:3: this_MaxDuration_2= ruleMaxDuration
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getMaxDurationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MaxDuration_2=ruleMaxDuration();

                    state._fsp--;


                    			current = this_MaxDuration_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalArtemis.g:350:3: this_Mitd_3= ruleMitd
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getMitdParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Mitd_3=ruleMitd();

                    state._fsp--;


                    			current = this_Mitd_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalArtemis.g:359:3: this_Collect_4= ruleCollect
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getCollectParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Collect_4=ruleCollect();

                    state._fsp--;


                    			current = this_Collect_4;
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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRulePeriod"
    // InternalArtemis.g:371:1: entryRulePeriod returns [EObject current=null] : iv_rulePeriod= rulePeriod EOF ;
    public final EObject entryRulePeriod() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePeriod = null;


        try {
            // InternalArtemis.g:371:47: (iv_rulePeriod= rulePeriod EOF )
            // InternalArtemis.g:372:2: iv_rulePeriod= rulePeriod EOF
            {
             newCompositeNode(grammarAccess.getPeriodRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePeriod=rulePeriod();

            state._fsp--;

             current =iv_rulePeriod; 
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
    // $ANTLR end "entryRulePeriod"


    // $ANTLR start "rulePeriod"
    // InternalArtemis.g:378:1: rulePeriod returns [EObject current=null] : (otherlv_0= 'period:' ( (lv_period_1_0= RULE_FLOAT ) ) otherlv_2= 'ms' otherlv_3= 'onFail:' ( (lv_onFailAction_4_0= ruleOnFailAction ) ) otherlv_5= 'maxAttempt:' ( (lv_maxAttempts_6_0= RULE_INT ) ) otherlv_7= 'onFail:' ( (lv_onFailMaxAttemptAction_8_0= ruleOnFailAction ) ) otherlv_9= ';' ) ;
    public final EObject rulePeriod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_period_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_maxAttempts_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_onFailAction_4_0 = null;

        EObject lv_onFailMaxAttemptAction_8_0 = null;



        	enterRule();

        try {
            // InternalArtemis.g:384:2: ( (otherlv_0= 'period:' ( (lv_period_1_0= RULE_FLOAT ) ) otherlv_2= 'ms' otherlv_3= 'onFail:' ( (lv_onFailAction_4_0= ruleOnFailAction ) ) otherlv_5= 'maxAttempt:' ( (lv_maxAttempts_6_0= RULE_INT ) ) otherlv_7= 'onFail:' ( (lv_onFailMaxAttemptAction_8_0= ruleOnFailAction ) ) otherlv_9= ';' ) )
            // InternalArtemis.g:385:2: (otherlv_0= 'period:' ( (lv_period_1_0= RULE_FLOAT ) ) otherlv_2= 'ms' otherlv_3= 'onFail:' ( (lv_onFailAction_4_0= ruleOnFailAction ) ) otherlv_5= 'maxAttempt:' ( (lv_maxAttempts_6_0= RULE_INT ) ) otherlv_7= 'onFail:' ( (lv_onFailMaxAttemptAction_8_0= ruleOnFailAction ) ) otherlv_9= ';' )
            {
            // InternalArtemis.g:385:2: (otherlv_0= 'period:' ( (lv_period_1_0= RULE_FLOAT ) ) otherlv_2= 'ms' otherlv_3= 'onFail:' ( (lv_onFailAction_4_0= ruleOnFailAction ) ) otherlv_5= 'maxAttempt:' ( (lv_maxAttempts_6_0= RULE_INT ) ) otherlv_7= 'onFail:' ( (lv_onFailMaxAttemptAction_8_0= ruleOnFailAction ) ) otherlv_9= ';' )
            // InternalArtemis.g:386:3: otherlv_0= 'period:' ( (lv_period_1_0= RULE_FLOAT ) ) otherlv_2= 'ms' otherlv_3= 'onFail:' ( (lv_onFailAction_4_0= ruleOnFailAction ) ) otherlv_5= 'maxAttempt:' ( (lv_maxAttempts_6_0= RULE_INT ) ) otherlv_7= 'onFail:' ( (lv_onFailMaxAttemptAction_8_0= ruleOnFailAction ) ) otherlv_9= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getPeriodAccess().getPeriodKeyword_0());
            		
            // InternalArtemis.g:390:3: ( (lv_period_1_0= RULE_FLOAT ) )
            // InternalArtemis.g:391:4: (lv_period_1_0= RULE_FLOAT )
            {
            // InternalArtemis.g:391:4: (lv_period_1_0= RULE_FLOAT )
            // InternalArtemis.g:392:5: lv_period_1_0= RULE_FLOAT
            {
            lv_period_1_0=(Token)match(input,RULE_FLOAT,FOLLOW_15); 

            					newLeafNode(lv_period_1_0, grammarAccess.getPeriodAccess().getPeriodFLOATTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPeriodRule());
            					}
            					setWithLastConsumed(
            						current,
            						"period",
            						lv_period_1_0,
            						"org.artemis.spec.Artemis.FLOAT");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getPeriodAccess().getMsKeyword_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getPeriodAccess().getOnFailKeyword_3());
            		
            // InternalArtemis.g:416:3: ( (lv_onFailAction_4_0= ruleOnFailAction ) )
            // InternalArtemis.g:417:4: (lv_onFailAction_4_0= ruleOnFailAction )
            {
            // InternalArtemis.g:417:4: (lv_onFailAction_4_0= ruleOnFailAction )
            // InternalArtemis.g:418:5: lv_onFailAction_4_0= ruleOnFailAction
            {

            					newCompositeNode(grammarAccess.getPeriodAccess().getOnFailActionOnFailActionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_18);
            lv_onFailAction_4_0=ruleOnFailAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPeriodRule());
            					}
            					set(
            						current,
            						"onFailAction",
            						lv_onFailAction_4_0,
            						"org.artemis.spec.Artemis.OnFailAction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getPeriodAccess().getMaxAttemptKeyword_5());
            		
            // InternalArtemis.g:439:3: ( (lv_maxAttempts_6_0= RULE_INT ) )
            // InternalArtemis.g:440:4: (lv_maxAttempts_6_0= RULE_INT )
            {
            // InternalArtemis.g:440:4: (lv_maxAttempts_6_0= RULE_INT )
            // InternalArtemis.g:441:5: lv_maxAttempts_6_0= RULE_INT
            {
            lv_maxAttempts_6_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_maxAttempts_6_0, grammarAccess.getPeriodAccess().getMaxAttemptsINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPeriodRule());
            					}
            					setWithLastConsumed(
            						current,
            						"maxAttempts",
            						lv_maxAttempts_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_7=(Token)match(input,21,FOLLOW_17); 

            			newLeafNode(otherlv_7, grammarAccess.getPeriodAccess().getOnFailKeyword_7());
            		
            // InternalArtemis.g:461:3: ( (lv_onFailMaxAttemptAction_8_0= ruleOnFailAction ) )
            // InternalArtemis.g:462:4: (lv_onFailMaxAttemptAction_8_0= ruleOnFailAction )
            {
            // InternalArtemis.g:462:4: (lv_onFailMaxAttemptAction_8_0= ruleOnFailAction )
            // InternalArtemis.g:463:5: lv_onFailMaxAttemptAction_8_0= ruleOnFailAction
            {

            					newCompositeNode(grammarAccess.getPeriodAccess().getOnFailMaxAttemptActionOnFailActionParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_19);
            lv_onFailMaxAttemptAction_8_0=ruleOnFailAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPeriodRule());
            					}
            					set(
            						current,
            						"onFailMaxAttemptAction",
            						lv_onFailMaxAttemptAction_8_0,
            						"org.artemis.spec.Artemis.OnFailAction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getPeriodAccess().getSemicolonKeyword_9());
            		

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
    // $ANTLR end "rulePeriod"


    // $ANTLR start "entryRuleMaxTries"
    // InternalArtemis.g:488:1: entryRuleMaxTries returns [EObject current=null] : iv_ruleMaxTries= ruleMaxTries EOF ;
    public final EObject entryRuleMaxTries() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxTries = null;


        try {
            // InternalArtemis.g:488:49: (iv_ruleMaxTries= ruleMaxTries EOF )
            // InternalArtemis.g:489:2: iv_ruleMaxTries= ruleMaxTries EOF
            {
             newCompositeNode(grammarAccess.getMaxTriesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaxTries=ruleMaxTries();

            state._fsp--;

             current =iv_ruleMaxTries; 
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
    // $ANTLR end "entryRuleMaxTries"


    // $ANTLR start "ruleMaxTries"
    // InternalArtemis.g:495:1: ruleMaxTries returns [EObject current=null] : (otherlv_0= 'maxTries:' ( (lv_nrTries_1_0= RULE_INT ) ) otherlv_2= 'onFail:' ( (lv_onFailAction_3_0= ruleOnFailAction ) ) otherlv_4= ';' ) ;
    public final EObject ruleMaxTries() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nrTries_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_onFailAction_3_0 = null;



        	enterRule();

        try {
            // InternalArtemis.g:501:2: ( (otherlv_0= 'maxTries:' ( (lv_nrTries_1_0= RULE_INT ) ) otherlv_2= 'onFail:' ( (lv_onFailAction_3_0= ruleOnFailAction ) ) otherlv_4= ';' ) )
            // InternalArtemis.g:502:2: (otherlv_0= 'maxTries:' ( (lv_nrTries_1_0= RULE_INT ) ) otherlv_2= 'onFail:' ( (lv_onFailAction_3_0= ruleOnFailAction ) ) otherlv_4= ';' )
            {
            // InternalArtemis.g:502:2: (otherlv_0= 'maxTries:' ( (lv_nrTries_1_0= RULE_INT ) ) otherlv_2= 'onFail:' ( (lv_onFailAction_3_0= ruleOnFailAction ) ) otherlv_4= ';' )
            // InternalArtemis.g:503:3: otherlv_0= 'maxTries:' ( (lv_nrTries_1_0= RULE_INT ) ) otherlv_2= 'onFail:' ( (lv_onFailAction_3_0= ruleOnFailAction ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getMaxTriesAccess().getMaxTriesKeyword_0());
            		
            // InternalArtemis.g:507:3: ( (lv_nrTries_1_0= RULE_INT ) )
            // InternalArtemis.g:508:4: (lv_nrTries_1_0= RULE_INT )
            {
            // InternalArtemis.g:508:4: (lv_nrTries_1_0= RULE_INT )
            // InternalArtemis.g:509:5: lv_nrTries_1_0= RULE_INT
            {
            lv_nrTries_1_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_nrTries_1_0, grammarAccess.getMaxTriesAccess().getNrTriesINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaxTriesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nrTries",
            						lv_nrTries_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getMaxTriesAccess().getOnFailKeyword_2());
            		
            // InternalArtemis.g:529:3: ( (lv_onFailAction_3_0= ruleOnFailAction ) )
            // InternalArtemis.g:530:4: (lv_onFailAction_3_0= ruleOnFailAction )
            {
            // InternalArtemis.g:530:4: (lv_onFailAction_3_0= ruleOnFailAction )
            // InternalArtemis.g:531:5: lv_onFailAction_3_0= ruleOnFailAction
            {

            					newCompositeNode(grammarAccess.getMaxTriesAccess().getOnFailActionOnFailActionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_onFailAction_3_0=ruleOnFailAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMaxTriesRule());
            					}
            					set(
            						current,
            						"onFailAction",
            						lv_onFailAction_3_0,
            						"org.artemis.spec.Artemis.OnFailAction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMaxTriesAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleMaxTries"


    // $ANTLR start "entryRuleMaxDuration"
    // InternalArtemis.g:556:1: entryRuleMaxDuration returns [EObject current=null] : iv_ruleMaxDuration= ruleMaxDuration EOF ;
    public final EObject entryRuleMaxDuration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxDuration = null;


        try {
            // InternalArtemis.g:556:52: (iv_ruleMaxDuration= ruleMaxDuration EOF )
            // InternalArtemis.g:557:2: iv_ruleMaxDuration= ruleMaxDuration EOF
            {
             newCompositeNode(grammarAccess.getMaxDurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaxDuration=ruleMaxDuration();

            state._fsp--;

             current =iv_ruleMaxDuration; 
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
    // $ANTLR end "entryRuleMaxDuration"


    // $ANTLR start "ruleMaxDuration"
    // InternalArtemis.g:563:1: ruleMaxDuration returns [EObject current=null] : (otherlv_0= 'maxDuration:' ( (lv_maxDuration_1_0= RULE_FLOAT ) ) otherlv_2= 'ms' otherlv_3= 'onFail:' ( (lv_onFailAction_4_0= ruleOnFailAction ) ) otherlv_5= ';' ) ;
    public final EObject ruleMaxDuration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_maxDuration_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_onFailAction_4_0 = null;



        	enterRule();

        try {
            // InternalArtemis.g:569:2: ( (otherlv_0= 'maxDuration:' ( (lv_maxDuration_1_0= RULE_FLOAT ) ) otherlv_2= 'ms' otherlv_3= 'onFail:' ( (lv_onFailAction_4_0= ruleOnFailAction ) ) otherlv_5= ';' ) )
            // InternalArtemis.g:570:2: (otherlv_0= 'maxDuration:' ( (lv_maxDuration_1_0= RULE_FLOAT ) ) otherlv_2= 'ms' otherlv_3= 'onFail:' ( (lv_onFailAction_4_0= ruleOnFailAction ) ) otherlv_5= ';' )
            {
            // InternalArtemis.g:570:2: (otherlv_0= 'maxDuration:' ( (lv_maxDuration_1_0= RULE_FLOAT ) ) otherlv_2= 'ms' otherlv_3= 'onFail:' ( (lv_onFailAction_4_0= ruleOnFailAction ) ) otherlv_5= ';' )
            // InternalArtemis.g:571:3: otherlv_0= 'maxDuration:' ( (lv_maxDuration_1_0= RULE_FLOAT ) ) otherlv_2= 'ms' otherlv_3= 'onFail:' ( (lv_onFailAction_4_0= ruleOnFailAction ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getMaxDurationAccess().getMaxDurationKeyword_0());
            		
            // InternalArtemis.g:575:3: ( (lv_maxDuration_1_0= RULE_FLOAT ) )
            // InternalArtemis.g:576:4: (lv_maxDuration_1_0= RULE_FLOAT )
            {
            // InternalArtemis.g:576:4: (lv_maxDuration_1_0= RULE_FLOAT )
            // InternalArtemis.g:577:5: lv_maxDuration_1_0= RULE_FLOAT
            {
            lv_maxDuration_1_0=(Token)match(input,RULE_FLOAT,FOLLOW_15); 

            					newLeafNode(lv_maxDuration_1_0, grammarAccess.getMaxDurationAccess().getMaxDurationFLOATTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaxDurationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"maxDuration",
            						lv_maxDuration_1_0,
            						"org.artemis.spec.Artemis.FLOAT");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getMaxDurationAccess().getMsKeyword_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getMaxDurationAccess().getOnFailKeyword_3());
            		
            // InternalArtemis.g:601:3: ( (lv_onFailAction_4_0= ruleOnFailAction ) )
            // InternalArtemis.g:602:4: (lv_onFailAction_4_0= ruleOnFailAction )
            {
            // InternalArtemis.g:602:4: (lv_onFailAction_4_0= ruleOnFailAction )
            // InternalArtemis.g:603:5: lv_onFailAction_4_0= ruleOnFailAction
            {

            					newCompositeNode(grammarAccess.getMaxDurationAccess().getOnFailActionOnFailActionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_19);
            lv_onFailAction_4_0=ruleOnFailAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMaxDurationRule());
            					}
            					set(
            						current,
            						"onFailAction",
            						lv_onFailAction_4_0,
            						"org.artemis.spec.Artemis.OnFailAction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMaxDurationAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleMaxDuration"


    // $ANTLR start "entryRuleMitd"
    // InternalArtemis.g:628:1: entryRuleMitd returns [EObject current=null] : iv_ruleMitd= ruleMitd EOF ;
    public final EObject entryRuleMitd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMitd = null;


        try {
            // InternalArtemis.g:628:45: (iv_ruleMitd= ruleMitd EOF )
            // InternalArtemis.g:629:2: iv_ruleMitd= ruleMitd EOF
            {
             newCompositeNode(grammarAccess.getMitdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMitd=ruleMitd();

            state._fsp--;

             current =iv_ruleMitd; 
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
    // $ANTLR end "entryRuleMitd"


    // $ANTLR start "ruleMitd"
    // InternalArtemis.g:635:1: ruleMitd returns [EObject current=null] : (otherlv_0= 'MITD:' ( (lv_duration_1_0= RULE_FLOAT ) ) otherlv_2= 'ms' otherlv_3= 'dpTask:' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'onFail:' ( (lv_onFailAction_6_0= ruleOnFailAction ) ) otherlv_7= 'maxAttempt:' ( (lv_maxAttempts_8_0= RULE_INT ) ) otherlv_9= 'onFail:' ( (lv_onFailMaxAttemptAction_10_0= ruleOnFailAction ) ) otherlv_11= ';' ) ;
    public final EObject ruleMitd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_duration_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_maxAttempts_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_onFailAction_6_0 = null;

        EObject lv_onFailMaxAttemptAction_10_0 = null;



        	enterRule();

        try {
            // InternalArtemis.g:641:2: ( (otherlv_0= 'MITD:' ( (lv_duration_1_0= RULE_FLOAT ) ) otherlv_2= 'ms' otherlv_3= 'dpTask:' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'onFail:' ( (lv_onFailAction_6_0= ruleOnFailAction ) ) otherlv_7= 'maxAttempt:' ( (lv_maxAttempts_8_0= RULE_INT ) ) otherlv_9= 'onFail:' ( (lv_onFailMaxAttemptAction_10_0= ruleOnFailAction ) ) otherlv_11= ';' ) )
            // InternalArtemis.g:642:2: (otherlv_0= 'MITD:' ( (lv_duration_1_0= RULE_FLOAT ) ) otherlv_2= 'ms' otherlv_3= 'dpTask:' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'onFail:' ( (lv_onFailAction_6_0= ruleOnFailAction ) ) otherlv_7= 'maxAttempt:' ( (lv_maxAttempts_8_0= RULE_INT ) ) otherlv_9= 'onFail:' ( (lv_onFailMaxAttemptAction_10_0= ruleOnFailAction ) ) otherlv_11= ';' )
            {
            // InternalArtemis.g:642:2: (otherlv_0= 'MITD:' ( (lv_duration_1_0= RULE_FLOAT ) ) otherlv_2= 'ms' otherlv_3= 'dpTask:' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'onFail:' ( (lv_onFailAction_6_0= ruleOnFailAction ) ) otherlv_7= 'maxAttempt:' ( (lv_maxAttempts_8_0= RULE_INT ) ) otherlv_9= 'onFail:' ( (lv_onFailMaxAttemptAction_10_0= ruleOnFailAction ) ) otherlv_11= ';' )
            // InternalArtemis.g:643:3: otherlv_0= 'MITD:' ( (lv_duration_1_0= RULE_FLOAT ) ) otherlv_2= 'ms' otherlv_3= 'dpTask:' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'onFail:' ( (lv_onFailAction_6_0= ruleOnFailAction ) ) otherlv_7= 'maxAttempt:' ( (lv_maxAttempts_8_0= RULE_INT ) ) otherlv_9= 'onFail:' ( (lv_onFailMaxAttemptAction_10_0= ruleOnFailAction ) ) otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getMitdAccess().getMITDKeyword_0());
            		
            // InternalArtemis.g:647:3: ( (lv_duration_1_0= RULE_FLOAT ) )
            // InternalArtemis.g:648:4: (lv_duration_1_0= RULE_FLOAT )
            {
            // InternalArtemis.g:648:4: (lv_duration_1_0= RULE_FLOAT )
            // InternalArtemis.g:649:5: lv_duration_1_0= RULE_FLOAT
            {
            lv_duration_1_0=(Token)match(input,RULE_FLOAT,FOLLOW_15); 

            					newLeafNode(lv_duration_1_0, grammarAccess.getMitdAccess().getDurationFLOATTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMitdRule());
            					}
            					setWithLastConsumed(
            						current,
            						"duration",
            						lv_duration_1_0,
            						"org.artemis.spec.Artemis.FLOAT");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getMitdAccess().getMsKeyword_2());
            		
            otherlv_3=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getMitdAccess().getDpTaskKeyword_3());
            		
            // InternalArtemis.g:673:3: ( (otherlv_4= RULE_ID ) )
            // InternalArtemis.g:674:4: (otherlv_4= RULE_ID )
            {
            // InternalArtemis.g:674:4: (otherlv_4= RULE_ID )
            // InternalArtemis.g:675:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMitdRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_4, grammarAccess.getMitdAccess().getDependsOnTaskCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getMitdAccess().getOnFailKeyword_5());
            		
            // InternalArtemis.g:690:3: ( (lv_onFailAction_6_0= ruleOnFailAction ) )
            // InternalArtemis.g:691:4: (lv_onFailAction_6_0= ruleOnFailAction )
            {
            // InternalArtemis.g:691:4: (lv_onFailAction_6_0= ruleOnFailAction )
            // InternalArtemis.g:692:5: lv_onFailAction_6_0= ruleOnFailAction
            {

            					newCompositeNode(grammarAccess.getMitdAccess().getOnFailActionOnFailActionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_18);
            lv_onFailAction_6_0=ruleOnFailAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMitdRule());
            					}
            					set(
            						current,
            						"onFailAction",
            						lv_onFailAction_6_0,
            						"org.artemis.spec.Artemis.OnFailAction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getMitdAccess().getMaxAttemptKeyword_7());
            		
            // InternalArtemis.g:713:3: ( (lv_maxAttempts_8_0= RULE_INT ) )
            // InternalArtemis.g:714:4: (lv_maxAttempts_8_0= RULE_INT )
            {
            // InternalArtemis.g:714:4: (lv_maxAttempts_8_0= RULE_INT )
            // InternalArtemis.g:715:5: lv_maxAttempts_8_0= RULE_INT
            {
            lv_maxAttempts_8_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_maxAttempts_8_0, grammarAccess.getMitdAccess().getMaxAttemptsINTTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMitdRule());
            					}
            					setWithLastConsumed(
            						current,
            						"maxAttempts",
            						lv_maxAttempts_8_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_9=(Token)match(input,21,FOLLOW_17); 

            			newLeafNode(otherlv_9, grammarAccess.getMitdAccess().getOnFailKeyword_9());
            		
            // InternalArtemis.g:735:3: ( (lv_onFailMaxAttemptAction_10_0= ruleOnFailAction ) )
            // InternalArtemis.g:736:4: (lv_onFailMaxAttemptAction_10_0= ruleOnFailAction )
            {
            // InternalArtemis.g:736:4: (lv_onFailMaxAttemptAction_10_0= ruleOnFailAction )
            // InternalArtemis.g:737:5: lv_onFailMaxAttemptAction_10_0= ruleOnFailAction
            {

            					newCompositeNode(grammarAccess.getMitdAccess().getOnFailMaxAttemptActionOnFailActionParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_19);
            lv_onFailMaxAttemptAction_10_0=ruleOnFailAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMitdRule());
            					}
            					set(
            						current,
            						"onFailMaxAttemptAction",
            						lv_onFailMaxAttemptAction_10_0,
            						"org.artemis.spec.Artemis.OnFailAction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getMitdAccess().getSemicolonKeyword_11());
            		

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
    // $ANTLR end "ruleMitd"


    // $ANTLR start "entryRuleCollect"
    // InternalArtemis.g:762:1: entryRuleCollect returns [EObject current=null] : iv_ruleCollect= ruleCollect EOF ;
    public final EObject entryRuleCollect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollect = null;


        try {
            // InternalArtemis.g:762:48: (iv_ruleCollect= ruleCollect EOF )
            // InternalArtemis.g:763:2: iv_ruleCollect= ruleCollect EOF
            {
             newCompositeNode(grammarAccess.getCollectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCollect=ruleCollect();

            state._fsp--;

             current =iv_ruleCollect; 
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
    // $ANTLR end "entryRuleCollect"


    // $ANTLR start "ruleCollect"
    // InternalArtemis.g:769:1: ruleCollect returns [EObject current=null] : (otherlv_0= 'collect:' ( (lv_nrItems_1_0= RULE_INT ) ) otherlv_2= 'dpTask:' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'onFail:' ( (lv_onFailAction_5_0= ruleOnFailAction ) ) otherlv_6= ';' ) ;
    public final EObject ruleCollect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nrItems_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_onFailAction_5_0 = null;



        	enterRule();

        try {
            // InternalArtemis.g:775:2: ( (otherlv_0= 'collect:' ( (lv_nrItems_1_0= RULE_INT ) ) otherlv_2= 'dpTask:' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'onFail:' ( (lv_onFailAction_5_0= ruleOnFailAction ) ) otherlv_6= ';' ) )
            // InternalArtemis.g:776:2: (otherlv_0= 'collect:' ( (lv_nrItems_1_0= RULE_INT ) ) otherlv_2= 'dpTask:' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'onFail:' ( (lv_onFailAction_5_0= ruleOnFailAction ) ) otherlv_6= ';' )
            {
            // InternalArtemis.g:776:2: (otherlv_0= 'collect:' ( (lv_nrItems_1_0= RULE_INT ) ) otherlv_2= 'dpTask:' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'onFail:' ( (lv_onFailAction_5_0= ruleOnFailAction ) ) otherlv_6= ';' )
            // InternalArtemis.g:777:3: otherlv_0= 'collect:' ( (lv_nrItems_1_0= RULE_INT ) ) otherlv_2= 'dpTask:' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'onFail:' ( (lv_onFailAction_5_0= ruleOnFailAction ) ) otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getCollectAccess().getCollectKeyword_0());
            		
            // InternalArtemis.g:781:3: ( (lv_nrItems_1_0= RULE_INT ) )
            // InternalArtemis.g:782:4: (lv_nrItems_1_0= RULE_INT )
            {
            // InternalArtemis.g:782:4: (lv_nrItems_1_0= RULE_INT )
            // InternalArtemis.g:783:5: lv_nrItems_1_0= RULE_INT
            {
            lv_nrItems_1_0=(Token)match(input,RULE_INT,FOLLOW_20); 

            					newLeafNode(lv_nrItems_1_0, grammarAccess.getCollectAccess().getNrItemsINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCollectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nrItems",
            						lv_nrItems_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getCollectAccess().getDpTaskKeyword_2());
            		
            // InternalArtemis.g:803:3: ( (otherlv_3= RULE_ID ) )
            // InternalArtemis.g:804:4: (otherlv_3= RULE_ID )
            {
            // InternalArtemis.g:804:4: (otherlv_3= RULE_ID )
            // InternalArtemis.g:805:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCollectRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_3, grammarAccess.getCollectAccess().getDependsOnTaskCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getCollectAccess().getOnFailKeyword_4());
            		
            // InternalArtemis.g:820:3: ( (lv_onFailAction_5_0= ruleOnFailAction ) )
            // InternalArtemis.g:821:4: (lv_onFailAction_5_0= ruleOnFailAction )
            {
            // InternalArtemis.g:821:4: (lv_onFailAction_5_0= ruleOnFailAction )
            // InternalArtemis.g:822:5: lv_onFailAction_5_0= ruleOnFailAction
            {

            					newCompositeNode(grammarAccess.getCollectAccess().getOnFailActionOnFailActionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_19);
            lv_onFailAction_5_0=ruleOnFailAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCollectRule());
            					}
            					set(
            						current,
            						"onFailAction",
            						lv_onFailAction_5_0,
            						"org.artemis.spec.Artemis.OnFailAction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCollectAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruleCollect"


    // $ANTLR start "entryRuleOnFailAction"
    // InternalArtemis.g:847:1: entryRuleOnFailAction returns [EObject current=null] : iv_ruleOnFailAction= ruleOnFailAction EOF ;
    public final EObject entryRuleOnFailAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnFailAction = null;


        try {
            // InternalArtemis.g:847:53: (iv_ruleOnFailAction= ruleOnFailAction EOF )
            // InternalArtemis.g:848:2: iv_ruleOnFailAction= ruleOnFailAction EOF
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
    // InternalArtemis.g:854:1: ruleOnFailAction returns [EObject current=null] : (this_RestartPath_0= ruleRestartPath | this_SkipPath_1= ruleSkipPath | this_RestartTask_2= ruleRestartTask | this_SkipTask_3= ruleSkipTask ) ;
    public final EObject ruleOnFailAction() throws RecognitionException {
        EObject current = null;

        EObject this_RestartPath_0 = null;

        EObject this_SkipPath_1 = null;

        EObject this_RestartTask_2 = null;

        EObject this_SkipTask_3 = null;



        	enterRule();

        try {
            // InternalArtemis.g:860:2: ( (this_RestartPath_0= ruleRestartPath | this_SkipPath_1= ruleSkipPath | this_RestartTask_2= ruleRestartTask | this_SkipTask_3= ruleSkipTask ) )
            // InternalArtemis.g:861:2: (this_RestartPath_0= ruleRestartPath | this_SkipPath_1= ruleSkipPath | this_RestartTask_2= ruleRestartTask | this_SkipTask_3= ruleSkipTask )
            {
            // InternalArtemis.g:861:2: (this_RestartPath_0= ruleRestartPath | this_SkipPath_1= ruleSkipPath | this_RestartTask_2= ruleRestartTask | this_SkipTask_3= ruleSkipTask )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt7=1;
                }
                break;
            case 30:
                {
                alt7=2;
                }
                break;
            case 31:
                {
                alt7=3;
                }
                break;
            case 32:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalArtemis.g:862:3: this_RestartPath_0= ruleRestartPath
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
                    // InternalArtemis.g:871:3: this_SkipPath_1= ruleSkipPath
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
                    // InternalArtemis.g:880:3: this_RestartTask_2= ruleRestartTask
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
                    // InternalArtemis.g:889:3: this_SkipTask_3= ruleSkipTask
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
    // InternalArtemis.g:901:1: entryRuleRestartPath returns [EObject current=null] : iv_ruleRestartPath= ruleRestartPath EOF ;
    public final EObject entryRuleRestartPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestartPath = null;


        try {
            // InternalArtemis.g:901:52: (iv_ruleRestartPath= ruleRestartPath EOF )
            // InternalArtemis.g:902:2: iv_ruleRestartPath= ruleRestartPath EOF
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
    // InternalArtemis.g:908:1: ruleRestartPath returns [EObject current=null] : ( () otherlv_1= 'restartPath' (otherlv_2= 'Path:' ( (lv_path_3_0= RULE_INT ) ) )? ) ;
    public final EObject ruleRestartPath() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_path_3_0=null;


        	enterRule();

        try {
            // InternalArtemis.g:914:2: ( ( () otherlv_1= 'restartPath' (otherlv_2= 'Path:' ( (lv_path_3_0= RULE_INT ) ) )? ) )
            // InternalArtemis.g:915:2: ( () otherlv_1= 'restartPath' (otherlv_2= 'Path:' ( (lv_path_3_0= RULE_INT ) ) )? )
            {
            // InternalArtemis.g:915:2: ( () otherlv_1= 'restartPath' (otherlv_2= 'Path:' ( (lv_path_3_0= RULE_INT ) ) )? )
            // InternalArtemis.g:916:3: () otherlv_1= 'restartPath' (otherlv_2= 'Path:' ( (lv_path_3_0= RULE_INT ) ) )?
            {
            // InternalArtemis.g:916:3: ()
            // InternalArtemis.g:917:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRestartPathAccess().getRestartPathAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getRestartPathAccess().getRestartPathKeyword_1());
            		
            // InternalArtemis.g:927:3: (otherlv_2= 'Path:' ( (lv_path_3_0= RULE_INT ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalArtemis.g:928:4: otherlv_2= 'Path:' ( (lv_path_3_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getRestartPathAccess().getPathKeyword_2_0());
                    			
                    // InternalArtemis.g:932:4: ( (lv_path_3_0= RULE_INT ) )
                    // InternalArtemis.g:933:5: (lv_path_3_0= RULE_INT )
                    {
                    // InternalArtemis.g:933:5: (lv_path_3_0= RULE_INT )
                    // InternalArtemis.g:934:6: lv_path_3_0= RULE_INT
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
    // InternalArtemis.g:955:1: entryRuleSkipPath returns [EObject current=null] : iv_ruleSkipPath= ruleSkipPath EOF ;
    public final EObject entryRuleSkipPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkipPath = null;


        try {
            // InternalArtemis.g:955:49: (iv_ruleSkipPath= ruleSkipPath EOF )
            // InternalArtemis.g:956:2: iv_ruleSkipPath= ruleSkipPath EOF
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
    // InternalArtemis.g:962:1: ruleSkipPath returns [EObject current=null] : ( () otherlv_1= 'skipPath' (otherlv_2= 'Path:' ( (lv_path_3_0= RULE_INT ) ) )? ) ;
    public final EObject ruleSkipPath() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_path_3_0=null;


        	enterRule();

        try {
            // InternalArtemis.g:968:2: ( ( () otherlv_1= 'skipPath' (otherlv_2= 'Path:' ( (lv_path_3_0= RULE_INT ) ) )? ) )
            // InternalArtemis.g:969:2: ( () otherlv_1= 'skipPath' (otherlv_2= 'Path:' ( (lv_path_3_0= RULE_INT ) ) )? )
            {
            // InternalArtemis.g:969:2: ( () otherlv_1= 'skipPath' (otherlv_2= 'Path:' ( (lv_path_3_0= RULE_INT ) ) )? )
            // InternalArtemis.g:970:3: () otherlv_1= 'skipPath' (otherlv_2= 'Path:' ( (lv_path_3_0= RULE_INT ) ) )?
            {
            // InternalArtemis.g:970:3: ()
            // InternalArtemis.g:971:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSkipPathAccess().getSkipPathAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getSkipPathAccess().getSkipPathKeyword_1());
            		
            // InternalArtemis.g:981:3: (otherlv_2= 'Path:' ( (lv_path_3_0= RULE_INT ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==14) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalArtemis.g:982:4: otherlv_2= 'Path:' ( (lv_path_3_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getSkipPathAccess().getPathKeyword_2_0());
                    			
                    // InternalArtemis.g:986:4: ( (lv_path_3_0= RULE_INT ) )
                    // InternalArtemis.g:987:5: (lv_path_3_0= RULE_INT )
                    {
                    // InternalArtemis.g:987:5: (lv_path_3_0= RULE_INT )
                    // InternalArtemis.g:988:6: lv_path_3_0= RULE_INT
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
    // InternalArtemis.g:1009:1: entryRuleRestartTask returns [EObject current=null] : iv_ruleRestartTask= ruleRestartTask EOF ;
    public final EObject entryRuleRestartTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestartTask = null;


        try {
            // InternalArtemis.g:1009:52: (iv_ruleRestartTask= ruleRestartTask EOF )
            // InternalArtemis.g:1010:2: iv_ruleRestartTask= ruleRestartTask EOF
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
    // InternalArtemis.g:1016:1: ruleRestartTask returns [EObject current=null] : ( () otherlv_1= 'restartTask' ) ;
    public final EObject ruleRestartTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalArtemis.g:1022:2: ( ( () otherlv_1= 'restartTask' ) )
            // InternalArtemis.g:1023:2: ( () otherlv_1= 'restartTask' )
            {
            // InternalArtemis.g:1023:2: ( () otherlv_1= 'restartTask' )
            // InternalArtemis.g:1024:3: () otherlv_1= 'restartTask'
            {
            // InternalArtemis.g:1024:3: ()
            // InternalArtemis.g:1025:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRestartTaskAccess().getRestartTaskAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_2); 

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
    // InternalArtemis.g:1039:1: entryRuleSkipTask returns [EObject current=null] : iv_ruleSkipTask= ruleSkipTask EOF ;
    public final EObject entryRuleSkipTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkipTask = null;


        try {
            // InternalArtemis.g:1039:49: (iv_ruleSkipTask= ruleSkipTask EOF )
            // InternalArtemis.g:1040:2: iv_ruleSkipTask= ruleSkipTask EOF
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
    // InternalArtemis.g:1046:1: ruleSkipTask returns [EObject current=null] : ( () otherlv_1= 'skipTask' ) ;
    public final EObject ruleSkipTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalArtemis.g:1052:2: ( ( () otherlv_1= 'skipTask' ) )
            // InternalArtemis.g:1053:2: ( () otherlv_1= 'skipTask' )
            {
            // InternalArtemis.g:1053:2: ( () otherlv_1= 'skipTask' )
            // InternalArtemis.g:1054:3: () otherlv_1= 'skipTask'
            {
            // InternalArtemis.g:1054:3: ()
            // InternalArtemis.g:1055:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSkipTaskAccess().getSkipTaskAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_2); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000017080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000170C0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000001E0000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000004002L});

}