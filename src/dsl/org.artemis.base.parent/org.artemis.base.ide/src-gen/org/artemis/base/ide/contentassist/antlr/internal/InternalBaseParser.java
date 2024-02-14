package org.artemis.base.ide.contentassist.antlr.internal;

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
import org.artemis.base.services.BaseGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBaseParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(BaseGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalBase.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalBase.g:54:1: ( ruleModel EOF )
            // InternalBase.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalBase.g:62:1: ruleModel : ( ( ( rule__Model__TypesAssignment ) ) ( ( rule__Model__TypesAssignment )* ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBase.g:66:2: ( ( ( ( rule__Model__TypesAssignment ) ) ( ( rule__Model__TypesAssignment )* ) ) )
            // InternalBase.g:67:2: ( ( ( rule__Model__TypesAssignment ) ) ( ( rule__Model__TypesAssignment )* ) )
            {
            // InternalBase.g:67:2: ( ( ( rule__Model__TypesAssignment ) ) ( ( rule__Model__TypesAssignment )* ) )
            // InternalBase.g:68:3: ( ( rule__Model__TypesAssignment ) ) ( ( rule__Model__TypesAssignment )* )
            {
            // InternalBase.g:68:3: ( ( rule__Model__TypesAssignment ) )
            // InternalBase.g:69:4: ( rule__Model__TypesAssignment )
            {
             before(grammarAccess.getModelAccess().getTypesAssignment()); 
            // InternalBase.g:70:4: ( rule__Model__TypesAssignment )
            // InternalBase.g:70:5: rule__Model__TypesAssignment
            {
            pushFollow(FOLLOW_3);
            rule__Model__TypesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getTypesAssignment()); 

            }

            // InternalBase.g:73:3: ( ( rule__Model__TypesAssignment )* )
            // InternalBase.g:74:4: ( rule__Model__TypesAssignment )*
            {
             before(grammarAccess.getModelAccess().getTypesAssignment()); 
            // InternalBase.g:75:4: ( rule__Model__TypesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=12)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBase.g:75:5: rule__Model__TypesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__TypesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getTypesAssignment()); 

            }


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleTypeDecl"
    // InternalBase.g:85:1: entryRuleTypeDecl : ruleTypeDecl EOF ;
    public final void entryRuleTypeDecl() throws RecognitionException {
        try {
            // InternalBase.g:86:1: ( ruleTypeDecl EOF )
            // InternalBase.g:87:1: ruleTypeDecl EOF
            {
             before(grammarAccess.getTypeDeclRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeDecl();

            state._fsp--;

             after(grammarAccess.getTypeDeclRule()); 
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
    // $ANTLR end "entryRuleTypeDecl"


    // $ANTLR start "ruleTypeDecl"
    // InternalBase.g:94:1: ruleTypeDecl : ( ( rule__TypeDecl__Alternatives ) ) ;
    public final void ruleTypeDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBase.g:98:2: ( ( ( rule__TypeDecl__Alternatives ) ) )
            // InternalBase.g:99:2: ( ( rule__TypeDecl__Alternatives ) )
            {
            // InternalBase.g:99:2: ( ( rule__TypeDecl__Alternatives ) )
            // InternalBase.g:100:3: ( rule__TypeDecl__Alternatives )
            {
             before(grammarAccess.getTypeDeclAccess().getAlternatives()); 
            // InternalBase.g:101:3: ( rule__TypeDecl__Alternatives )
            // InternalBase.g:101:4: rule__TypeDecl__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TypeDecl__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeDeclAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTypeDecl"


    // $ANTLR start "entryRuleSimpleTypeDecl"
    // InternalBase.g:110:1: entryRuleSimpleTypeDecl : ruleSimpleTypeDecl EOF ;
    public final void entryRuleSimpleTypeDecl() throws RecognitionException {
        try {
            // InternalBase.g:111:1: ( ruleSimpleTypeDecl EOF )
            // InternalBase.g:112:1: ruleSimpleTypeDecl EOF
            {
             before(grammarAccess.getSimpleTypeDeclRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleTypeDecl();

            state._fsp--;

             after(grammarAccess.getSimpleTypeDeclRule()); 
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
    // $ANTLR end "entryRuleSimpleTypeDecl"


    // $ANTLR start "ruleSimpleTypeDecl"
    // InternalBase.g:119:1: ruleSimpleTypeDecl : ( ( rule__SimpleTypeDecl__Group__0 ) ) ;
    public final void ruleSimpleTypeDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBase.g:123:2: ( ( ( rule__SimpleTypeDecl__Group__0 ) ) )
            // InternalBase.g:124:2: ( ( rule__SimpleTypeDecl__Group__0 ) )
            {
            // InternalBase.g:124:2: ( ( rule__SimpleTypeDecl__Group__0 ) )
            // InternalBase.g:125:3: ( rule__SimpleTypeDecl__Group__0 )
            {
             before(grammarAccess.getSimpleTypeDeclAccess().getGroup()); 
            // InternalBase.g:126:3: ( rule__SimpleTypeDecl__Group__0 )
            // InternalBase.g:126:4: rule__SimpleTypeDecl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleTypeDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleTypeDeclAccess().getGroup()); 

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
    // $ANTLR end "ruleSimpleTypeDecl"


    // $ANTLR start "entryRuleEnumTypeDecl"
    // InternalBase.g:135:1: entryRuleEnumTypeDecl : ruleEnumTypeDecl EOF ;
    public final void entryRuleEnumTypeDecl() throws RecognitionException {
        try {
            // InternalBase.g:136:1: ( ruleEnumTypeDecl EOF )
            // InternalBase.g:137:1: ruleEnumTypeDecl EOF
            {
             before(grammarAccess.getEnumTypeDeclRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumTypeDecl();

            state._fsp--;

             after(grammarAccess.getEnumTypeDeclRule()); 
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
    // $ANTLR end "entryRuleEnumTypeDecl"


    // $ANTLR start "ruleEnumTypeDecl"
    // InternalBase.g:144:1: ruleEnumTypeDecl : ( ( rule__EnumTypeDecl__Group__0 ) ) ;
    public final void ruleEnumTypeDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBase.g:148:2: ( ( ( rule__EnumTypeDecl__Group__0 ) ) )
            // InternalBase.g:149:2: ( ( rule__EnumTypeDecl__Group__0 ) )
            {
            // InternalBase.g:149:2: ( ( rule__EnumTypeDecl__Group__0 ) )
            // InternalBase.g:150:3: ( rule__EnumTypeDecl__Group__0 )
            {
             before(grammarAccess.getEnumTypeDeclAccess().getGroup()); 
            // InternalBase.g:151:3: ( rule__EnumTypeDecl__Group__0 )
            // InternalBase.g:151:4: rule__EnumTypeDecl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnumTypeDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeDeclAccess().getGroup()); 

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
    // $ANTLR end "ruleEnumTypeDecl"


    // $ANTLR start "entryRuleEnumElement"
    // InternalBase.g:160:1: entryRuleEnumElement : ruleEnumElement EOF ;
    public final void entryRuleEnumElement() throws RecognitionException {
        try {
            // InternalBase.g:161:1: ( ruleEnumElement EOF )
            // InternalBase.g:162:1: ruleEnumElement EOF
            {
             before(grammarAccess.getEnumElementRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumElement();

            state._fsp--;

             after(grammarAccess.getEnumElementRule()); 
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
    // $ANTLR end "entryRuleEnumElement"


    // $ANTLR start "ruleEnumElement"
    // InternalBase.g:169:1: ruleEnumElement : ( ( rule__EnumElement__NameAssignment ) ) ;
    public final void ruleEnumElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBase.g:173:2: ( ( ( rule__EnumElement__NameAssignment ) ) )
            // InternalBase.g:174:2: ( ( rule__EnumElement__NameAssignment ) )
            {
            // InternalBase.g:174:2: ( ( rule__EnumElement__NameAssignment ) )
            // InternalBase.g:175:3: ( rule__EnumElement__NameAssignment )
            {
             before(grammarAccess.getEnumElementAccess().getNameAssignment()); 
            // InternalBase.g:176:3: ( rule__EnumElement__NameAssignment )
            // InternalBase.g:176:4: rule__EnumElement__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__EnumElement__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEnumElementAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleEnumElement"


    // $ANTLR start "entryRuleArray"
    // InternalBase.g:185:1: entryRuleArray : ruleArray EOF ;
    public final void entryRuleArray() throws RecognitionException {
        try {
            // InternalBase.g:186:1: ( ruleArray EOF )
            // InternalBase.g:187:1: ruleArray EOF
            {
             before(grammarAccess.getArrayRule()); 
            pushFollow(FOLLOW_1);
            ruleArray();

            state._fsp--;

             after(grammarAccess.getArrayRule()); 
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
    // $ANTLR end "entryRuleArray"


    // $ANTLR start "ruleArray"
    // InternalBase.g:194:1: ruleArray : ( ( rule__Array__Group__0 ) ) ;
    public final void ruleArray() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBase.g:198:2: ( ( ( rule__Array__Group__0 ) ) )
            // InternalBase.g:199:2: ( ( rule__Array__Group__0 ) )
            {
            // InternalBase.g:199:2: ( ( rule__Array__Group__0 ) )
            // InternalBase.g:200:3: ( rule__Array__Group__0 )
            {
             before(grammarAccess.getArrayAccess().getGroup()); 
            // InternalBase.g:201:3: ( rule__Array__Group__0 )
            // InternalBase.g:201:4: rule__Array__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Array__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArrayAccess().getGroup()); 

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
    // $ANTLR end "ruleArray"


    // $ANTLR start "entryRuleTypeRef"
    // InternalBase.g:210:1: entryRuleTypeRef : ruleTypeRef EOF ;
    public final void entryRuleTypeRef() throws RecognitionException {
        try {
            // InternalBase.g:211:1: ( ruleTypeRef EOF )
            // InternalBase.g:212:1: ruleTypeRef EOF
            {
             before(grammarAccess.getTypeRefRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getTypeRefRule()); 
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
    // $ANTLR end "entryRuleTypeRef"


    // $ANTLR start "ruleTypeRef"
    // InternalBase.g:219:1: ruleTypeRef : ( ( rule__TypeRef__TypeAssignment ) ) ;
    public final void ruleTypeRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBase.g:223:2: ( ( ( rule__TypeRef__TypeAssignment ) ) )
            // InternalBase.g:224:2: ( ( rule__TypeRef__TypeAssignment ) )
            {
            // InternalBase.g:224:2: ( ( rule__TypeRef__TypeAssignment ) )
            // InternalBase.g:225:3: ( rule__TypeRef__TypeAssignment )
            {
             before(grammarAccess.getTypeRefAccess().getTypeAssignment()); 
            // InternalBase.g:226:3: ( rule__TypeRef__TypeAssignment )
            // InternalBase.g:226:4: rule__TypeRef__TypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__TypeRef__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTypeRefAccess().getTypeAssignment()); 

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
    // $ANTLR end "ruleTypeRef"


    // $ANTLR start "rule__TypeDecl__Alternatives"
    // InternalBase.g:234:1: rule__TypeDecl__Alternatives : ( ( ruleEnumTypeDecl ) | ( ruleSimpleTypeDecl ) );
    public final void rule__TypeDecl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBase.g:238:1: ( ( ruleEnumTypeDecl ) | ( ruleSimpleTypeDecl ) )
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
                    // InternalBase.g:239:2: ( ruleEnumTypeDecl )
                    {
                    // InternalBase.g:239:2: ( ruleEnumTypeDecl )
                    // InternalBase.g:240:3: ruleEnumTypeDecl
                    {
                     before(grammarAccess.getTypeDeclAccess().getEnumTypeDeclParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEnumTypeDecl();

                    state._fsp--;

                     after(grammarAccess.getTypeDeclAccess().getEnumTypeDeclParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBase.g:245:2: ( ruleSimpleTypeDecl )
                    {
                    // InternalBase.g:245:2: ( ruleSimpleTypeDecl )
                    // InternalBase.g:246:3: ruleSimpleTypeDecl
                    {
                     before(grammarAccess.getTypeDeclAccess().getSimpleTypeDeclParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSimpleTypeDecl();

                    state._fsp--;

                     after(grammarAccess.getTypeDeclAccess().getSimpleTypeDeclParserRuleCall_1()); 

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
    // $ANTLR end "rule__TypeDecl__Alternatives"


    // $ANTLR start "rule__SimpleTypeDecl__Group__0"
    // InternalBase.g:255:1: rule__SimpleTypeDecl__Group__0 : rule__SimpleTypeDecl__Group__0__Impl rule__SimpleTypeDecl__Group__1 ;
    public final void rule__SimpleTypeDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBase.g:259:1: ( rule__SimpleTypeDecl__Group__0__Impl rule__SimpleTypeDecl__Group__1 )
            // InternalBase.g:260:2: rule__SimpleTypeDecl__Group__0__Impl rule__SimpleTypeDecl__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SimpleTypeDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleTypeDecl__Group__1();

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
    // $ANTLR end "rule__SimpleTypeDecl__Group__0"


    // $ANTLR start "rule__SimpleTypeDecl__Group__0__Impl"
    // InternalBase.g:267:1: rule__SimpleTypeDecl__Group__0__Impl : ( 'type' ) ;
    public final void rule__SimpleTypeDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBase.g:271:1: ( ( 'type' ) )
            // InternalBase.g:272:1: ( 'type' )
            {
            // InternalBase.g:272:1: ( 'type' )
            // InternalBase.g:273:2: 'type'
            {
             before(grammarAccess.getSimpleTypeDeclAccess().getTypeKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getSimpleTypeDeclAccess().getTypeKeyword_0()); 

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
    // $ANTLR end "rule__SimpleTypeDecl__Group__0__Impl"


    // $ANTLR start "rule__SimpleTypeDecl__Group__1"
    // InternalBase.g:282:1: rule__SimpleTypeDecl__Group__1 : rule__SimpleTypeDecl__Group__1__Impl ;
    public final void rule__SimpleTypeDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBase.g:286:1: ( rule__SimpleTypeDecl__Group__1__Impl )
            // InternalBase.g:287:2: rule__SimpleTypeDecl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleTypeDecl__Group__1__Impl();

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
    // $ANTLR end "rule__SimpleTypeDecl__Group__1"


    // $ANTLR start "rule__SimpleTypeDecl__Group__1__Impl"
    // InternalBase.g:293:1: rule__SimpleTypeDecl__Group__1__Impl : ( ( rule__SimpleTypeDecl__NameAssignment_1 ) ) ;
    public final void rule__SimpleTypeDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBase.g:297:1: ( ( ( rule__SimpleTypeDecl__NameAssignment_1 ) ) )
            // InternalBase.g:298:1: ( ( rule__SimpleTypeDecl__NameAssignment_1 ) )
            {
            // InternalBase.g:298:1: ( ( rule__SimpleTypeDecl__NameAssignment_1 ) )
            // InternalBase.g:299:2: ( rule__SimpleTypeDecl__NameAssignment_1 )
            {
             before(grammarAccess.getSimpleTypeDeclAccess().getNameAssignment_1()); 
            // InternalBase.g:300:2: ( rule__SimpleTypeDecl__NameAssignment_1 )
            // InternalBase.g:300:3: rule__SimpleTypeDecl__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SimpleTypeDecl__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleTypeDeclAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__SimpleTypeDecl__Group__1__Impl"


    // $ANTLR start "rule__EnumTypeDecl__Group__0"
    // InternalBase.g:309:1: rule__EnumTypeDecl__Group__0 : rule__EnumTypeDecl__Group__0__Impl rule__EnumTypeDecl__Group__1 ;
    public final void rule__EnumTypeDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBase.g:313:1: ( rule__EnumTypeDecl__Group__0__Impl rule__EnumTypeDecl__Group__1 )
            // InternalBase.g:314:2: rule__EnumTypeDecl__Group__0__Impl rule__EnumTypeDecl__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__EnumTypeDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumTypeDecl__Group__1();

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
    // $ANTLR end "rule__EnumTypeDecl__Group__0"


    // $ANTLR start "rule__EnumTypeDecl__Group__0__Impl"
    // InternalBase.g:321:1: rule__EnumTypeDecl__Group__0__Impl : ( 'enum' ) ;
    public final void rule__EnumTypeDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBase.g:325:1: ( ( 'enum' ) )
            // InternalBase.g:326:1: ( 'enum' )
            {
            // InternalBase.g:326:1: ( 'enum' )
            // InternalBase.g:327:2: 'enum'
            {
             before(grammarAccess.getEnumTypeDeclAccess().getEnumKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getEnumTypeDeclAccess().getEnumKeyword_0()); 

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
    // $ANTLR end "rule__EnumTypeDecl__Group__0__Impl"


    // $ANTLR start "rule__EnumTypeDecl__Group__1"
    // InternalBase.g:336:1: rule__EnumTypeDecl__Group__1 : rule__EnumTypeDecl__Group__1__Impl rule__EnumTypeDecl__Group__2 ;
    public final void rule__EnumTypeDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBase.g:340:1: ( rule__EnumTypeDecl__Group__1__Impl rule__EnumTypeDecl__Group__2 )
            // InternalBase.g:341:2: rule__EnumTypeDecl__Group__1__Impl rule__EnumTypeDecl__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__EnumTypeDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumTypeDecl__Group__2();

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
    // $ANTLR end "rule__EnumTypeDecl__Group__1"


    // $ANTLR start "rule__EnumTypeDecl__Group__1__Impl"
    // InternalBase.g:348:1: rule__EnumTypeDecl__Group__1__Impl : ( ( rule__EnumTypeDecl__NameAssignment_1 ) ) ;
    public final void rule__EnumTypeDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBase.g:352:1: ( ( ( rule__EnumTypeDecl__NameAssignment_1 ) ) )
            // InternalBase.g:353:1: ( ( rule__EnumTypeDecl__NameAssignment_1 ) )
            {
            // InternalBase.g:353:1: ( ( rule__EnumTypeDecl__NameAssignment_1 ) )
            // InternalBase.g:354:2: ( rule__EnumTypeDecl__NameAssignment_1 )
            {
             before(grammarAccess.getEnumTypeDeclAccess().getNameAssignment_1()); 
            // InternalBase.g:355:2: ( rule__EnumTypeDecl__NameAssignment_1 )
            // InternalBase.g:355:3: rule__EnumTypeDecl__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumTypeDecl__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeDeclAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__EnumTypeDecl__Group__1__Impl"


    // $ANTLR start "rule__EnumTypeDecl__Group__2"
    // InternalBase.g:363:1: rule__EnumTypeDecl__Group__2 : rule__EnumTypeDecl__Group__2__Impl rule__EnumTypeDecl__Group__3 ;
    public final void rule__EnumTypeDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBase.g:367:1: ( rule__EnumTypeDecl__Group__2__Impl rule__EnumTypeDecl__Group__3 )
            // InternalBase.g:368:2: rule__EnumTypeDecl__Group__2__Impl rule__EnumTypeDecl__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__EnumTypeDecl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumTypeDecl__Group__3();

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
    // $ANTLR end "rule__EnumTypeDecl__Group__2"


    // $ANTLR start "rule__EnumTypeDecl__Group__2__Impl"
    // InternalBase.g:375:1: rule__EnumTypeDecl__Group__2__Impl : ( '{' ) ;
    public final void rule__EnumTypeDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBase.g:379:1: ( ( '{' ) )
            // InternalBase.g:380:1: ( '{' )
            {
            // InternalBase.g:380:1: ( '{' )
            // InternalBase.g:381:2: '{'
            {
             before(grammarAccess.getEnumTypeDeclAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEnumTypeDeclAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__EnumTypeDecl__Group__2__Impl"


    // $ANTLR start "rule__EnumTypeDecl__Group__3"
    // InternalBase.g:390:1: rule__EnumTypeDecl__Group__3 : rule__EnumTypeDecl__Group__3__Impl rule__EnumTypeDecl__Group__4 ;
    public final void rule__EnumTypeDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBase.g:394:1: ( rule__EnumTypeDecl__Group__3__Impl rule__EnumTypeDecl__Group__4 )
            // InternalBase.g:395:2: rule__EnumTypeDecl__Group__3__Impl rule__EnumTypeDecl__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__EnumTypeDecl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumTypeDecl__Group__4();

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
    // $ANTLR end "rule__EnumTypeDecl__Group__3"


    // $ANTLR start "rule__EnumTypeDecl__Group__3__Impl"
    // InternalBase.g:402:1: rule__EnumTypeDecl__Group__3__Impl : ( ( ( rule__EnumTypeDecl__LiteralsAssignment_3 ) ) ( ( rule__EnumTypeDecl__LiteralsAssignment_3 )* ) ) ;
    public final void rule__EnumTypeDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBase.g:406:1: ( ( ( ( rule__EnumTypeDecl__LiteralsAssignment_3 ) ) ( ( rule__EnumTypeDecl__LiteralsAssignment_3 )* ) ) )
            // InternalBase.g:407:1: ( ( ( rule__EnumTypeDecl__LiteralsAssignment_3 ) ) ( ( rule__EnumTypeDecl__LiteralsAssignment_3 )* ) )
            {
            // InternalBase.g:407:1: ( ( ( rule__EnumTypeDecl__LiteralsAssignment_3 ) ) ( ( rule__EnumTypeDecl__LiteralsAssignment_3 )* ) )
            // InternalBase.g:408:2: ( ( rule__EnumTypeDecl__LiteralsAssignment_3 ) ) ( ( rule__EnumTypeDecl__LiteralsAssignment_3 )* )
            {
            // InternalBase.g:408:2: ( ( rule__EnumTypeDecl__LiteralsAssignment_3 ) )
            // InternalBase.g:409:3: ( rule__EnumTypeDecl__LiteralsAssignment_3 )
            {
             before(grammarAccess.getEnumTypeDeclAccess().getLiteralsAssignment_3()); 
            // InternalBase.g:410:3: ( rule__EnumTypeDecl__LiteralsAssignment_3 )
            // InternalBase.g:410:4: rule__EnumTypeDecl__LiteralsAssignment_3
            {
            pushFollow(FOLLOW_7);
            rule__EnumTypeDecl__LiteralsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeDeclAccess().getLiteralsAssignment_3()); 

            }

            // InternalBase.g:413:2: ( ( rule__EnumTypeDecl__LiteralsAssignment_3 )* )
            // InternalBase.g:414:3: ( rule__EnumTypeDecl__LiteralsAssignment_3 )*
            {
             before(grammarAccess.getEnumTypeDeclAccess().getLiteralsAssignment_3()); 
            // InternalBase.g:415:3: ( rule__EnumTypeDecl__LiteralsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBase.g:415:4: rule__EnumTypeDecl__LiteralsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__EnumTypeDecl__LiteralsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getEnumTypeDeclAccess().getLiteralsAssignment_3()); 

            }


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
    // $ANTLR end "rule__EnumTypeDecl__Group__3__Impl"


    // $ANTLR start "rule__EnumTypeDecl__Group__4"
    // InternalBase.g:424:1: rule__EnumTypeDecl__Group__4 : rule__EnumTypeDecl__Group__4__Impl ;
    public final void rule__EnumTypeDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBase.g:428:1: ( rule__EnumTypeDecl__Group__4__Impl )
            // InternalBase.g:429:2: rule__EnumTypeDecl__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumTypeDecl__Group__4__Impl();

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
    // $ANTLR end "rule__EnumTypeDecl__Group__4"


    // $ANTLR start "rule__EnumTypeDecl__Group__4__Impl"
    // InternalBase.g:435:1: rule__EnumTypeDecl__Group__4__Impl : ( '}' ) ;
    public final void rule__EnumTypeDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBase.g:439:1: ( ( '}' ) )
            // InternalBase.g:440:1: ( '}' )
            {
            // InternalBase.g:440:1: ( '}' )
            // InternalBase.g:441:2: '}'
            {
             before(grammarAccess.getEnumTypeDeclAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEnumTypeDeclAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__EnumTypeDecl__Group__4__Impl"


    // $ANTLR start "rule__Array__Group__0"
    // InternalBase.g:451:1: rule__Array__Group__0 : rule__Array__Group__0__Impl rule__Array__Group__1 ;
    public final void rule__Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBase.g:455:1: ( rule__Array__Group__0__Impl rule__Array__Group__1 )
            // InternalBase.g:456:2: rule__Array__Group__0__Impl rule__Array__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Array__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Array__Group__1();

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
    // $ANTLR end "rule__Array__Group__0"


    // $ANTLR start "rule__Array__Group__0__Impl"
    // InternalBase.g:463:1: rule__Array__Group__0__Impl : ( ( rule__Array__BaseTypeAssignment_0 ) ) ;
    public final void rule__Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBase.g:467:1: ( ( ( rule__Array__BaseTypeAssignment_0 ) ) )
            // InternalBase.g:468:1: ( ( rule__Array__BaseTypeAssignment_0 ) )
            {
            // InternalBase.g:468:1: ( ( rule__Array__BaseTypeAssignment_0 ) )
            // InternalBase.g:469:2: ( rule__Array__BaseTypeAssignment_0 )
            {
             before(grammarAccess.getArrayAccess().getBaseTypeAssignment_0()); 
            // InternalBase.g:470:2: ( rule__Array__BaseTypeAssignment_0 )
            // InternalBase.g:470:3: rule__Array__BaseTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Array__BaseTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getArrayAccess().getBaseTypeAssignment_0()); 

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
    // $ANTLR end "rule__Array__Group__0__Impl"


    // $ANTLR start "rule__Array__Group__1"
    // InternalBase.g:478:1: rule__Array__Group__1 : rule__Array__Group__1__Impl rule__Array__Group__2 ;
    public final void rule__Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBase.g:482:1: ( rule__Array__Group__1__Impl rule__Array__Group__2 )
            // InternalBase.g:483:2: rule__Array__Group__1__Impl rule__Array__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Array__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Array__Group__2();

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
    // $ANTLR end "rule__Array__Group__1"


    // $ANTLR start "rule__Array__Group__1__Impl"
    // InternalBase.g:490:1: rule__Array__Group__1__Impl : ( '[' ) ;
    public final void rule__Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBase.g:494:1: ( ( '[' ) )
            // InternalBase.g:495:1: ( '[' )
            {
            // InternalBase.g:495:1: ( '[' )
            // InternalBase.g:496:2: '['
            {
             before(grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_1()); 

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
    // $ANTLR end "rule__Array__Group__1__Impl"


    // $ANTLR start "rule__Array__Group__2"
    // InternalBase.g:505:1: rule__Array__Group__2 : rule__Array__Group__2__Impl ;
    public final void rule__Array__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBase.g:509:1: ( rule__Array__Group__2__Impl )
            // InternalBase.g:510:2: rule__Array__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Array__Group__2__Impl();

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
    // $ANTLR end "rule__Array__Group__2"


    // $ANTLR start "rule__Array__Group__2__Impl"
    // InternalBase.g:516:1: rule__Array__Group__2__Impl : ( ']' ) ;
    public final void rule__Array__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBase.g:520:1: ( ( ']' ) )
            // InternalBase.g:521:1: ( ']' )
            {
            // InternalBase.g:521:1: ( ']' )
            // InternalBase.g:522:2: ']'
            {
             before(grammarAccess.getArrayAccess().getRightSquareBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getArrayAccess().getRightSquareBracketKeyword_2()); 

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
    // $ANTLR end "rule__Array__Group__2__Impl"


    // $ANTLR start "rule__Model__TypesAssignment"
    // InternalBase.g:532:1: rule__Model__TypesAssignment : ( ruleTypeDecl ) ;
    public final void rule__Model__TypesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBase.g:536:1: ( ( ruleTypeDecl ) )
            // InternalBase.g:537:2: ( ruleTypeDecl )
            {
            // InternalBase.g:537:2: ( ruleTypeDecl )
            // InternalBase.g:538:3: ruleTypeDecl
            {
             before(grammarAccess.getModelAccess().getTypesTypeDeclParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeDecl();

            state._fsp--;

             after(grammarAccess.getModelAccess().getTypesTypeDeclParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__TypesAssignment"


    // $ANTLR start "rule__SimpleTypeDecl__NameAssignment_1"
    // InternalBase.g:547:1: rule__SimpleTypeDecl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SimpleTypeDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBase.g:551:1: ( ( RULE_ID ) )
            // InternalBase.g:552:2: ( RULE_ID )
            {
            // InternalBase.g:552:2: ( RULE_ID )
            // InternalBase.g:553:3: RULE_ID
            {
             before(grammarAccess.getSimpleTypeDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSimpleTypeDeclAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__SimpleTypeDecl__NameAssignment_1"


    // $ANTLR start "rule__EnumTypeDecl__NameAssignment_1"
    // InternalBase.g:562:1: rule__EnumTypeDecl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumTypeDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBase.g:566:1: ( ( RULE_ID ) )
            // InternalBase.g:567:2: ( RULE_ID )
            {
            // InternalBase.g:567:2: ( RULE_ID )
            // InternalBase.g:568:3: RULE_ID
            {
             before(grammarAccess.getEnumTypeDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnumTypeDeclAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__EnumTypeDecl__NameAssignment_1"


    // $ANTLR start "rule__EnumTypeDecl__LiteralsAssignment_3"
    // InternalBase.g:577:1: rule__EnumTypeDecl__LiteralsAssignment_3 : ( ruleEnumElement ) ;
    public final void rule__EnumTypeDecl__LiteralsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBase.g:581:1: ( ( ruleEnumElement ) )
            // InternalBase.g:582:2: ( ruleEnumElement )
            {
            // InternalBase.g:582:2: ( ruleEnumElement )
            // InternalBase.g:583:3: ruleEnumElement
            {
             before(grammarAccess.getEnumTypeDeclAccess().getLiteralsEnumElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumElement();

            state._fsp--;

             after(grammarAccess.getEnumTypeDeclAccess().getLiteralsEnumElementParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__EnumTypeDecl__LiteralsAssignment_3"


    // $ANTLR start "rule__EnumElement__NameAssignment"
    // InternalBase.g:592:1: rule__EnumElement__NameAssignment : ( RULE_ID ) ;
    public final void rule__EnumElement__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBase.g:596:1: ( ( RULE_ID ) )
            // InternalBase.g:597:2: ( RULE_ID )
            {
            // InternalBase.g:597:2: ( RULE_ID )
            // InternalBase.g:598:3: RULE_ID
            {
             before(grammarAccess.getEnumElementAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnumElementAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__EnumElement__NameAssignment"


    // $ANTLR start "rule__Array__BaseTypeAssignment_0"
    // InternalBase.g:607:1: rule__Array__BaseTypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Array__BaseTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBase.g:611:1: ( ( ( RULE_ID ) ) )
            // InternalBase.g:612:2: ( ( RULE_ID ) )
            {
            // InternalBase.g:612:2: ( ( RULE_ID ) )
            // InternalBase.g:613:3: ( RULE_ID )
            {
             before(grammarAccess.getArrayAccess().getBaseTypeTypeDeclCrossReference_0_0()); 
            // InternalBase.g:614:3: ( RULE_ID )
            // InternalBase.g:615:4: RULE_ID
            {
             before(grammarAccess.getArrayAccess().getBaseTypeTypeDeclIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getArrayAccess().getBaseTypeTypeDeclIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getArrayAccess().getBaseTypeTypeDeclCrossReference_0_0()); 

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
    // $ANTLR end "rule__Array__BaseTypeAssignment_0"


    // $ANTLR start "rule__TypeRef__TypeAssignment"
    // InternalBase.g:626:1: rule__TypeRef__TypeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__TypeRef__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBase.g:630:1: ( ( ( RULE_ID ) ) )
            // InternalBase.g:631:2: ( ( RULE_ID ) )
            {
            // InternalBase.g:631:2: ( ( RULE_ID ) )
            // InternalBase.g:632:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeRefAccess().getTypeTypeDeclCrossReference_0()); 
            // InternalBase.g:633:3: ( RULE_ID )
            // InternalBase.g:634:4: RULE_ID
            {
             before(grammarAccess.getTypeRefAccess().getTypeTypeDeclIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeRefAccess().getTypeTypeDeclIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getTypeRefAccess().getTypeTypeDeclCrossReference_0()); 

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
    // $ANTLR end "rule__TypeRef__TypeAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});

}