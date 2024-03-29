/*
 * generated by Xtext 2.25.0
 */
grammar InternalBase;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.artemis.base.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getTypesTypeDeclParserRuleCall_0());
			}
			lv_types_0_0=ruleTypeDecl
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				add(
					$current,
					"types",
					lv_types_0_0,
					"org.artemis.base.Base.TypeDecl");
				afterParserOrEnumRuleCall();
			}
		)
	)+
;

// Entry rule entryRuleTypeDecl
entryRuleTypeDecl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeDeclRule()); }
	iv_ruleTypeDecl=ruleTypeDecl
	{ $current=$iv_ruleTypeDecl.current; }
	EOF;

// Rule TypeDecl
ruleTypeDecl returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getTypeDeclAccess().getEnumTypeDeclParserRuleCall_0());
		}
		this_EnumTypeDecl_0=ruleEnumTypeDecl
		{
			$current = $this_EnumTypeDecl_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTypeDeclAccess().getSimpleTypeDeclParserRuleCall_1());
		}
		this_SimpleTypeDecl_1=ruleSimpleTypeDecl
		{
			$current = $this_SimpleTypeDecl_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleSimpleTypeDecl
entryRuleSimpleTypeDecl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSimpleTypeDeclRule()); }
	iv_ruleSimpleTypeDecl=ruleSimpleTypeDecl
	{ $current=$iv_ruleSimpleTypeDecl.current; }
	EOF;

// Rule SimpleTypeDecl
ruleSimpleTypeDecl returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='type'
		{
			newLeafNode(otherlv_0, grammarAccess.getSimpleTypeDeclAccess().getTypeKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getSimpleTypeDeclAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSimpleTypeDeclRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleEnumTypeDecl
entryRuleEnumTypeDecl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEnumTypeDeclRule()); }
	iv_ruleEnumTypeDecl=ruleEnumTypeDecl
	{ $current=$iv_ruleEnumTypeDecl.current; }
	EOF;

// Rule EnumTypeDecl
ruleEnumTypeDecl returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='enum'
		{
			newLeafNode(otherlv_0, grammarAccess.getEnumTypeDeclAccess().getEnumKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getEnumTypeDeclAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEnumTypeDeclRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getEnumTypeDeclAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEnumTypeDeclAccess().getLiteralsEnumElementParserRuleCall_3_0());
				}
				lv_literals_3_0=ruleEnumElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEnumTypeDeclRule());
					}
					add(
						$current,
						"literals",
						lv_literals_3_0,
						"org.artemis.base.Base.EnumElement");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getEnumTypeDeclAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleEnumElement
entryRuleEnumElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEnumElementRule()); }
	iv_ruleEnumElement=ruleEnumElement
	{ $current=$iv_ruleEnumElement.current; }
	EOF;

// Rule EnumElement
ruleEnumElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getEnumElementAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getEnumElementRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleArray
entryRuleArray returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getArrayRule()); }
	iv_ruleArray=ruleArray
	{ $current=$iv_ruleArray.current; }
	EOF;

// Rule Array
ruleArray returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getArrayRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getArrayAccess().getBaseTypeTypeDeclCrossReference_0_0());
				}
			)
		)
		otherlv_1='['
		{
			newLeafNode(otherlv_1, grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_1());
		}
		otherlv_2=']'
		{
			newLeafNode(otherlv_2, grammarAccess.getArrayAccess().getRightSquareBracketKeyword_2());
		}
	)
;

// Entry rule entryRuleTypeRef
entryRuleTypeRef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeRefRule()); }
	iv_ruleTypeRef=ruleTypeRef
	{ $current=$iv_ruleTypeRef.current; }
	EOF;

// Rule TypeRef
ruleTypeRef returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getTypeRefRule());
				}
			}
			otherlv_0=RULE_ID
			{
				newLeafNode(otherlv_0, grammarAccess.getTypeRefAccess().getTypeTypeDeclCrossReference_0());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
