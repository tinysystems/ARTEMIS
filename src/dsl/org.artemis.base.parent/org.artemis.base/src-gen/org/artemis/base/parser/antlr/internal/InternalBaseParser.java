package org.artemis.base.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.artemis.base.services.BaseGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBaseParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'type'", "'enum'", "'{'", "'}'", "'['", "']'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalBaseParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBaseParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBaseParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBase.g"; }



     	private BaseGrammarAccess grammarAccess;

        public InternalBaseParser(TokenStream input, BaseGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected BaseGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalBase.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalBase.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalBase.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalBase.g:71:1: ruleModel returns [EObject current=null] : ( (lv_types_0_0= ruleTypeDecl ) )+ ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_types_0_0 = null;



        	enterRule();

        try {
            // InternalBase.g:77:2: ( ( (lv_types_0_0= ruleTypeDecl ) )+ )
            // InternalBase.g:78:2: ( (lv_types_0_0= ruleTypeDecl ) )+
            {
            // InternalBase.g:78:2: ( (lv_types_0_0= ruleTypeDecl ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=12)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBase.g:79:3: (lv_types_0_0= ruleTypeDecl )
            	    {
            	    // InternalBase.g:79:3: (lv_types_0_0= ruleTypeDecl )
            	    // InternalBase.g:80:4: lv_types_0_0= ruleTypeDecl
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getTypesTypeDeclParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_types_0_0=ruleTypeDecl();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"types",
            	    					lv_types_0_0,
            	    					"org.artemis.base.Base.TypeDecl");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleTypeDecl"
    // InternalBase.g:100:1: entryRuleTypeDecl returns [EObject current=null] : iv_ruleTypeDecl= ruleTypeDecl EOF ;
    public final EObject entryRuleTypeDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDecl = null;


        try {
            // InternalBase.g:100:49: (iv_ruleTypeDecl= ruleTypeDecl EOF )
            // InternalBase.g:101:2: iv_ruleTypeDecl= ruleTypeDecl EOF
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
    // InternalBase.g:107:1: ruleTypeDecl returns [EObject current=null] : (this_EnumTypeDecl_0= ruleEnumTypeDecl | this_SimpleTypeDecl_1= ruleSimpleTypeDecl ) ;
    public final EObject ruleTypeDecl() throws RecognitionException {
        EObject current = null;

        EObject this_EnumTypeDecl_0 = null;

        EObject this_SimpleTypeDecl_1 = null;



        	enterRule();

        try {
            // InternalBase.g:113:2: ( (this_EnumTypeDecl_0= ruleEnumTypeDecl | this_SimpleTypeDecl_1= ruleSimpleTypeDecl ) )
            // InternalBase.g:114:2: (this_EnumTypeDecl_0= ruleEnumTypeDecl | this_SimpleTypeDecl_1= ruleSimpleTypeDecl )
            {
            // InternalBase.g:114:2: (this_EnumTypeDecl_0= ruleEnumTypeDecl | this_SimpleTypeDecl_1= ruleSimpleTypeDecl )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==11) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalBase.g:115:3: this_EnumTypeDecl_0= ruleEnumTypeDecl
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
                    // InternalBase.g:124:3: this_SimpleTypeDecl_1= ruleSimpleTypeDecl
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
    // InternalBase.g:136:1: entryRuleSimpleTypeDecl returns [EObject current=null] : iv_ruleSimpleTypeDecl= ruleSimpleTypeDecl EOF ;
    public final EObject entryRuleSimpleTypeDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleTypeDecl = null;


        try {
            // InternalBase.g:136:55: (iv_ruleSimpleTypeDecl= ruleSimpleTypeDecl EOF )
            // InternalBase.g:137:2: iv_ruleSimpleTypeDecl= ruleSimpleTypeDecl EOF
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
    // InternalBase.g:143:1: ruleSimpleTypeDecl returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSimpleTypeDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalBase.g:149:2: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalBase.g:150:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalBase.g:150:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalBase.g:151:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSimpleTypeDeclAccess().getTypeKeyword_0());
            		
            // InternalBase.g:155:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBase.g:156:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBase.g:156:4: (lv_name_1_0= RULE_ID )
            // InternalBase.g:157:5: lv_name_1_0= RULE_ID
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
    // InternalBase.g:177:1: entryRuleEnumTypeDecl returns [EObject current=null] : iv_ruleEnumTypeDecl= ruleEnumTypeDecl EOF ;
    public final EObject entryRuleEnumTypeDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumTypeDecl = null;


        try {
            // InternalBase.g:177:53: (iv_ruleEnumTypeDecl= ruleEnumTypeDecl EOF )
            // InternalBase.g:178:2: iv_ruleEnumTypeDecl= ruleEnumTypeDecl EOF
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
    // InternalBase.g:184:1: ruleEnumTypeDecl returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleEnumElement ) )+ otherlv_4= '}' ) ;
    public final EObject ruleEnumTypeDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_literals_3_0 = null;



        	enterRule();

        try {
            // InternalBase.g:190:2: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleEnumElement ) )+ otherlv_4= '}' ) )
            // InternalBase.g:191:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleEnumElement ) )+ otherlv_4= '}' )
            {
            // InternalBase.g:191:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleEnumElement ) )+ otherlv_4= '}' )
            // InternalBase.g:192:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleEnumElement ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumTypeDeclAccess().getEnumKeyword_0());
            		
            // InternalBase.g:196:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBase.g:197:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBase.g:197:4: (lv_name_1_0= RULE_ID )
            // InternalBase.g:198:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumTypeDeclAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBase.g:218:3: ( (lv_literals_3_0= ruleEnumElement ) )+
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
            	    // InternalBase.g:219:4: (lv_literals_3_0= ruleEnumElement )
            	    {
            	    // InternalBase.g:219:4: (lv_literals_3_0= ruleEnumElement )
            	    // InternalBase.g:220:5: lv_literals_3_0= ruleEnumElement
            	    {

            	    					newCompositeNode(grammarAccess.getEnumTypeDeclAccess().getLiteralsEnumElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
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
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

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
    // InternalBase.g:245:1: entryRuleEnumElement returns [EObject current=null] : iv_ruleEnumElement= ruleEnumElement EOF ;
    public final EObject entryRuleEnumElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumElement = null;


        try {
            // InternalBase.g:245:52: (iv_ruleEnumElement= ruleEnumElement EOF )
            // InternalBase.g:246:2: iv_ruleEnumElement= ruleEnumElement EOF
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
    // InternalBase.g:252:1: ruleEnumElement returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEnumElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBase.g:258:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalBase.g:259:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalBase.g:259:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalBase.g:260:3: (lv_name_0_0= RULE_ID )
            {
            // InternalBase.g:260:3: (lv_name_0_0= RULE_ID )
            // InternalBase.g:261:4: lv_name_0_0= RULE_ID
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
    // InternalBase.g:280:1: entryRuleArray returns [EObject current=null] : iv_ruleArray= ruleArray EOF ;
    public final EObject entryRuleArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArray = null;


        try {
            // InternalBase.g:280:46: (iv_ruleArray= ruleArray EOF )
            // InternalBase.g:281:2: iv_ruleArray= ruleArray EOF
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
    // InternalBase.g:287:1: ruleArray returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' otherlv_2= ']' ) ;
    public final EObject ruleArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalBase.g:293:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' otherlv_2= ']' ) )
            // InternalBase.g:294:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' otherlv_2= ']' )
            {
            // InternalBase.g:294:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' otherlv_2= ']' )
            // InternalBase.g:295:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' otherlv_2= ']'
            {
            // InternalBase.g:295:3: ( (otherlv_0= RULE_ID ) )
            // InternalBase.g:296:4: (otherlv_0= RULE_ID )
            {
            // InternalBase.g:296:4: (otherlv_0= RULE_ID )
            // InternalBase.g:297:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArrayRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_0, grammarAccess.getArrayAccess().getBaseTypeTypeDeclCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_2); 

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


    // $ANTLR start "entryRuleTypeRef"
    // InternalBase.g:320:1: entryRuleTypeRef returns [EObject current=null] : iv_ruleTypeRef= ruleTypeRef EOF ;
    public final EObject entryRuleTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRef = null;


        try {
            // InternalBase.g:320:48: (iv_ruleTypeRef= ruleTypeRef EOF )
            // InternalBase.g:321:2: iv_ruleTypeRef= ruleTypeRef EOF
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
    // InternalBase.g:327:1: ruleTypeRef returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalBase.g:333:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalBase.g:334:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalBase.g:334:2: ( (otherlv_0= RULE_ID ) )
            // InternalBase.g:335:3: (otherlv_0= RULE_ID )
            {
            // InternalBase.g:335:3: (otherlv_0= RULE_ID )
            // InternalBase.g:336:4: otherlv_0= RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});

}