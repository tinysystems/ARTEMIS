package org.artemis.spec.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalArtemisLexer extends Lexer {
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

    public InternalArtemisLexer() {;} 
    public InternalArtemisLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalArtemisLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalArtemis.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArtemis.g:11:7: ( 'Task' )
            // InternalArtemis.g:11:9: 'Task'
            {
            match("Task"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArtemis.g:12:7: ( '(' )
            // InternalArtemis.g:12:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArtemis.g:13:7: ( 'Path:' )
            // InternalArtemis.g:13:9: 'Path:'
            {
            match("Path:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArtemis.g:14:7: ( ',' )
            // InternalArtemis.g:14:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArtemis.g:15:7: ( ')' )
            // InternalArtemis.g:15:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArtemis.g:16:7: ( '{' )
            // InternalArtemis.g:16:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArtemis.g:17:7: ( '}' )
            // InternalArtemis.g:17:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArtemis.g:18:7: ( 'period:' )
            // InternalArtemis.g:18:9: 'period:'
            {
            match("period:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArtemis.g:19:7: ( 'ms' )
            // InternalArtemis.g:19:9: 'ms'
            {
            match("ms"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArtemis.g:20:7: ( 'onFail:' )
            // InternalArtemis.g:20:9: 'onFail:'
            {
            match("onFail:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArtemis.g:21:7: ( 'maxAttempt:' )
            // InternalArtemis.g:21:9: 'maxAttempt:'
            {
            match("maxAttempt:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArtemis.g:22:7: ( ';' )
            // InternalArtemis.g:22:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArtemis.g:23:7: ( 'maxTries:' )
            // InternalArtemis.g:23:9: 'maxTries:'
            {
            match("maxTries:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArtemis.g:24:7: ( 'maxDuration:' )
            // InternalArtemis.g:24:9: 'maxDuration:'
            {
            match("maxDuration:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArtemis.g:25:7: ( 'MITD:' )
            // InternalArtemis.g:25:9: 'MITD:'
            {
            match("MITD:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArtemis.g:26:7: ( 'dpTask:' )
            // InternalArtemis.g:26:9: 'dpTask:'
            {
            match("dpTask:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArtemis.g:27:7: ( 'collect:' )
            // InternalArtemis.g:27:9: 'collect:'
            {
            match("collect:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArtemis.g:28:7: ( 'restartPath' )
            // InternalArtemis.g:28:9: 'restartPath'
            {
            match("restartPath"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArtemis.g:29:7: ( 'skipPath' )
            // InternalArtemis.g:29:9: 'skipPath'
            {
            match("skipPath"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArtemis.g:30:7: ( 'restartTask' )
            // InternalArtemis.g:30:9: 'restartTask'
            {
            match("restartTask"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArtemis.g:31:7: ( 'skipTask' )
            // InternalArtemis.g:31:9: 'skipTask'
            {
            match("skipTask"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArtemis.g:1068:12: ( RULE_INT '.' RULE_INT ( ( 'E' | 'e' ) ( '-' )? RULE_INT )? )
            // InternalArtemis.g:1068:14: RULE_INT '.' RULE_INT ( ( 'E' | 'e' ) ( '-' )? RULE_INT )?
            {
            mRULE_INT(); 
            match('.'); 
            mRULE_INT(); 
            // InternalArtemis.g:1068:36: ( ( 'E' | 'e' ) ( '-' )? RULE_INT )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='E'||LA2_0=='e') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalArtemis.g:1068:37: ( 'E' | 'e' ) ( '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalArtemis.g:1068:47: ( '-' )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0=='-') ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // InternalArtemis.g:1068:47: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    mRULE_INT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArtemis.g:1070:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalArtemis.g:1070:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalArtemis.g:1070:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalArtemis.g:1070:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalArtemis.g:1070:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalArtemis.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArtemis.g:1072:10: ( ( '0' .. '9' )+ )
            // InternalArtemis.g:1072:12: ( '0' .. '9' )+
            {
            // InternalArtemis.g:1072:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalArtemis.g:1072:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArtemis.g:1074:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalArtemis.g:1074:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalArtemis.g:1074:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalArtemis.g:1074:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalArtemis.g:1074:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalArtemis.g:1074:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalArtemis.g:1074:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalArtemis.g:1074:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalArtemis.g:1074:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalArtemis.g:1074:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalArtemis.g:1074:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArtemis.g:1076:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalArtemis.g:1076:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalArtemis.g:1076:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalArtemis.g:1076:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArtemis.g:1078:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalArtemis.g:1078:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalArtemis.g:1078:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalArtemis.g:1078:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalArtemis.g:1078:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalArtemis.g:1078:41: ( '\\r' )? '\\n'
                    {
                    // InternalArtemis.g:1078:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalArtemis.g:1078:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArtemis.g:1080:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalArtemis.g:1080:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalArtemis.g:1080:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalArtemis.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArtemis.g:1082:16: ( . )
            // InternalArtemis.g:1082:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalArtemis.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | RULE_FLOAT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=29;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalArtemis.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalArtemis.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalArtemis.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalArtemis.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalArtemis.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalArtemis.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalArtemis.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalArtemis.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalArtemis.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalArtemis.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalArtemis.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalArtemis.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalArtemis.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalArtemis.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalArtemis.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalArtemis.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalArtemis.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalArtemis.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalArtemis.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalArtemis.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalArtemis.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalArtemis.g:1:136: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 23 :
                // InternalArtemis.g:1:147: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 24 :
                // InternalArtemis.g:1:155: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 25 :
                // InternalArtemis.g:1:164: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 26 :
                // InternalArtemis.g:1:176: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 27 :
                // InternalArtemis.g:1:192: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 28 :
                // InternalArtemis.g:1:208: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 29 :
                // InternalArtemis.g:1:216: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\1\32\1\uffff\1\32\4\uffff\3\32\1\uffff\5\32\1\53\1\30\1\uffff\3\30\2\uffff\1\32\2\uffff\1\32\4\uffff\1\32\1\65\2\32\1\uffff\5\32\2\uffff\1\53\4\uffff\3\32\1\uffff\7\32\1\111\13\32\2\uffff\5\32\1\uffff\17\32\1\uffff\3\32\2\uffff\7\32\1\uffff\2\32\1\167\1\170\1\32\1\uffff\3\32\2\uffff\4\32\1\uffff\1\32\1\u0082\1\u0083\3\uffff";
    static final String DFA14_eofS =
        "\u0084\uffff";
    static final String DFA14_minS =
        "\1\0\1\141\1\uffff\1\141\4\uffff\1\145\1\141\1\156\1\uffff\1\111\1\160\1\157\1\145\1\153\1\56\1\101\1\uffff\2\0\1\52\2\uffff\1\163\2\uffff\1\164\4\uffff\1\162\1\60\1\170\1\106\1\uffff\2\124\1\154\1\163\1\151\2\uffff\1\56\4\uffff\1\153\1\150\1\151\1\uffff\1\101\1\141\1\104\1\141\1\154\1\164\1\160\1\60\1\72\1\157\1\164\1\162\1\165\1\151\1\72\1\163\1\145\1\141\1\120\2\uffff\1\144\1\164\1\151\1\162\1\154\1\uffff\1\153\1\143\1\162\2\141\1\72\2\145\1\141\2\72\3\164\1\163\1\uffff\1\155\1\163\1\164\2\uffff\1\72\1\120\1\150\1\153\1\160\1\72\1\151\1\uffff\2\141\2\60\1\164\1\uffff\1\157\1\164\1\163\2\uffff\1\72\1\156\1\150\1\153\1\uffff\1\72\2\60\3\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\141\1\uffff\1\141\4\uffff\1\145\1\163\1\156\1\uffff\1\111\1\160\1\157\1\145\1\153\1\71\1\172\1\uffff\2\uffff\1\57\2\uffff\1\163\2\uffff\1\164\4\uffff\1\162\1\172\1\170\1\106\1\uffff\2\124\1\154\1\163\1\151\2\uffff\1\71\4\uffff\1\153\1\150\1\151\1\uffff\1\124\1\141\1\104\1\141\1\154\1\164\1\160\1\172\1\72\1\157\1\164\1\162\1\165\1\151\1\72\1\163\1\145\1\141\1\124\2\uffff\1\144\1\164\1\151\1\162\1\154\1\uffff\1\153\1\143\1\162\2\141\1\72\2\145\1\141\2\72\3\164\1\163\1\uffff\1\155\1\163\1\164\2\uffff\1\72\1\124\1\150\1\153\1\160\1\72\1\151\1\uffff\2\141\2\172\1\164\1\uffff\1\157\1\164\1\163\2\uffff\1\72\1\156\1\150\1\153\1\uffff\1\72\2\172\3\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\1\uffff\1\4\1\5\1\6\1\7\3\uffff\1\14\7\uffff\1\27\3\uffff\1\34\1\35\1\uffff\1\27\1\2\1\uffff\1\4\1\5\1\6\1\7\4\uffff\1\14\5\uffff\1\30\1\26\1\uffff\1\31\1\32\1\33\1\34\3\uffff\1\11\23\uffff\1\1\1\3\5\uffff\1\17\17\uffff\1\10\3\uffff\1\12\1\20\7\uffff\1\21\5\uffff\1\15\3\uffff\1\23\1\25\4\uffff\1\13\3\uffff\1\16\1\22\1\24";
    static final String DFA14_specialS =
        "\1\1\23\uffff\1\2\1\0\156\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\30\2\27\2\30\1\27\22\30\1\27\1\30\1\24\4\30\1\25\1\2\1\5\2\30\1\4\2\30\1\26\12\21\1\30\1\13\5\30\14\23\1\14\2\23\1\3\3\23\1\1\6\23\3\30\1\22\1\23\1\30\2\23\1\16\1\15\10\23\1\11\1\23\1\12\1\10\1\23\1\17\1\20\7\23\1\6\1\30\1\7\uff82\30",
            "\1\31",
            "",
            "\1\34",
            "",
            "",
            "",
            "",
            "\1\41",
            "\1\43\21\uffff\1\42",
            "\1\44",
            "",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\54\1\uffff\12\55",
            "\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\0\56",
            "\0\56",
            "\1\57\4\uffff\1\60",
            "",
            "",
            "\1\62",
            "",
            "",
            "\1\63",
            "",
            "",
            "",
            "",
            "\1\64",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\66",
            "\1\67",
            "",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "",
            "",
            "\1\54\1\uffff\12\55",
            "",
            "",
            "",
            "",
            "\1\75",
            "\1\76",
            "\1\77",
            "",
            "\1\100\2\uffff\1\102\17\uffff\1\101",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124\3\uffff\1\125",
            "",
            "",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "",
            "\1\152",
            "\1\153",
            "\1\154",
            "",
            "",
            "\1\155",
            "\1\156\3\uffff\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "",
            "\1\165",
            "\1\166",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\171",
            "",
            "\1\172",
            "\1\173",
            "\1\174",
            "",
            "",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "",
            "\1\u0081",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | RULE_FLOAT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_21 = input.LA(1);

                        s = -1;
                        if ( ((LA14_21>='\u0000' && LA14_21<='\uFFFF')) ) {s = 46;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='T') ) {s = 1;}

                        else if ( (LA14_0=='(') ) {s = 2;}

                        else if ( (LA14_0=='P') ) {s = 3;}

                        else if ( (LA14_0==',') ) {s = 4;}

                        else if ( (LA14_0==')') ) {s = 5;}

                        else if ( (LA14_0=='{') ) {s = 6;}

                        else if ( (LA14_0=='}') ) {s = 7;}

                        else if ( (LA14_0=='p') ) {s = 8;}

                        else if ( (LA14_0=='m') ) {s = 9;}

                        else if ( (LA14_0=='o') ) {s = 10;}

                        else if ( (LA14_0==';') ) {s = 11;}

                        else if ( (LA14_0=='M') ) {s = 12;}

                        else if ( (LA14_0=='d') ) {s = 13;}

                        else if ( (LA14_0=='c') ) {s = 14;}

                        else if ( (LA14_0=='r') ) {s = 15;}

                        else if ( (LA14_0=='s') ) {s = 16;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 17;}

                        else if ( (LA14_0=='^') ) {s = 18;}

                        else if ( ((LA14_0>='A' && LA14_0<='L')||(LA14_0>='N' && LA14_0<='O')||(LA14_0>='Q' && LA14_0<='S')||(LA14_0>='U' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='b')||(LA14_0>='e' && LA14_0<='l')||LA14_0=='n'||LA14_0=='q'||(LA14_0>='t' && LA14_0<='z')) ) {s = 19;}

                        else if ( (LA14_0=='\"') ) {s = 20;}

                        else if ( (LA14_0=='\'') ) {s = 21;}

                        else if ( (LA14_0=='/') ) {s = 22;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 23;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='*' && LA14_0<='+')||(LA14_0>='-' && LA14_0<='.')||LA14_0==':'||(LA14_0>='<' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||LA14_0=='|'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 24;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_20 = input.LA(1);

                        s = -1;
                        if ( ((LA14_20>='\u0000' && LA14_20<='\uFFFF')) ) {s = 46;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}