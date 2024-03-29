/*
 * generated by Xtext 2.25.0
 */
grammar InternalBase;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.artemis.base.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		(
			{ before(grammarAccess.getModelAccess().getTypesAssignment()); }
			(rule__Model__TypesAssignment)
			{ after(grammarAccess.getModelAccess().getTypesAssignment()); }
		)
		(
			{ before(grammarAccess.getModelAccess().getTypesAssignment()); }
			(rule__Model__TypesAssignment)*
			{ after(grammarAccess.getModelAccess().getTypesAssignment()); }
		)
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTypeDecl
entryRuleTypeDecl
:
{ before(grammarAccess.getTypeDeclRule()); }
	 ruleTypeDecl
{ after(grammarAccess.getTypeDeclRule()); } 
	 EOF 
;

// Rule TypeDecl
ruleTypeDecl 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypeDeclAccess().getAlternatives()); }
		(rule__TypeDecl__Alternatives)
		{ after(grammarAccess.getTypeDeclAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSimpleTypeDecl
entryRuleSimpleTypeDecl
:
{ before(grammarAccess.getSimpleTypeDeclRule()); }
	 ruleSimpleTypeDecl
{ after(grammarAccess.getSimpleTypeDeclRule()); } 
	 EOF 
;

// Rule SimpleTypeDecl
ruleSimpleTypeDecl 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSimpleTypeDeclAccess().getGroup()); }
		(rule__SimpleTypeDecl__Group__0)
		{ after(grammarAccess.getSimpleTypeDeclAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEnumTypeDecl
entryRuleEnumTypeDecl
:
{ before(grammarAccess.getEnumTypeDeclRule()); }
	 ruleEnumTypeDecl
{ after(grammarAccess.getEnumTypeDeclRule()); } 
	 EOF 
;

// Rule EnumTypeDecl
ruleEnumTypeDecl 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEnumTypeDeclAccess().getGroup()); }
		(rule__EnumTypeDecl__Group__0)
		{ after(grammarAccess.getEnumTypeDeclAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEnumElement
entryRuleEnumElement
:
{ before(grammarAccess.getEnumElementRule()); }
	 ruleEnumElement
{ after(grammarAccess.getEnumElementRule()); } 
	 EOF 
;

// Rule EnumElement
ruleEnumElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEnumElementAccess().getNameAssignment()); }
		(rule__EnumElement__NameAssignment)
		{ after(grammarAccess.getEnumElementAccess().getNameAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleArray
entryRuleArray
:
{ before(grammarAccess.getArrayRule()); }
	 ruleArray
{ after(grammarAccess.getArrayRule()); } 
	 EOF 
;

// Rule Array
ruleArray 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getArrayAccess().getGroup()); }
		(rule__Array__Group__0)
		{ after(grammarAccess.getArrayAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTypeRef
entryRuleTypeRef
:
{ before(grammarAccess.getTypeRefRule()); }
	 ruleTypeRef
{ after(grammarAccess.getTypeRefRule()); } 
	 EOF 
;

// Rule TypeRef
ruleTypeRef 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypeRefAccess().getTypeAssignment()); }
		(rule__TypeRef__TypeAssignment)
		{ after(grammarAccess.getTypeRefAccess().getTypeAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDecl__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeDeclAccess().getEnumTypeDeclParserRuleCall_0()); }
		ruleEnumTypeDecl
		{ after(grammarAccess.getTypeDeclAccess().getEnumTypeDeclParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getTypeDeclAccess().getSimpleTypeDeclParserRuleCall_1()); }
		ruleSimpleTypeDecl
		{ after(grammarAccess.getTypeDeclAccess().getSimpleTypeDeclParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeDecl__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleTypeDecl__Group__0__Impl
	rule__SimpleTypeDecl__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeDecl__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleTypeDeclAccess().getTypeKeyword_0()); }
	'type'
	{ after(grammarAccess.getSimpleTypeDeclAccess().getTypeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeDecl__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleTypeDecl__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeDecl__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleTypeDeclAccess().getNameAssignment_1()); }
	(rule__SimpleTypeDecl__NameAssignment_1)
	{ after(grammarAccess.getSimpleTypeDeclAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EnumTypeDecl__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumTypeDecl__Group__0__Impl
	rule__EnumTypeDecl__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumTypeDecl__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumTypeDeclAccess().getEnumKeyword_0()); }
	'enum'
	{ after(grammarAccess.getEnumTypeDeclAccess().getEnumKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumTypeDecl__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumTypeDecl__Group__1__Impl
	rule__EnumTypeDecl__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumTypeDecl__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumTypeDeclAccess().getNameAssignment_1()); }
	(rule__EnumTypeDecl__NameAssignment_1)
	{ after(grammarAccess.getEnumTypeDeclAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumTypeDecl__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumTypeDecl__Group__2__Impl
	rule__EnumTypeDecl__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumTypeDecl__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumTypeDeclAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getEnumTypeDeclAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumTypeDecl__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumTypeDecl__Group__3__Impl
	rule__EnumTypeDecl__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumTypeDecl__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getEnumTypeDeclAccess().getLiteralsAssignment_3()); }
		(rule__EnumTypeDecl__LiteralsAssignment_3)
		{ after(grammarAccess.getEnumTypeDeclAccess().getLiteralsAssignment_3()); }
	)
	(
		{ before(grammarAccess.getEnumTypeDeclAccess().getLiteralsAssignment_3()); }
		(rule__EnumTypeDecl__LiteralsAssignment_3)*
		{ after(grammarAccess.getEnumTypeDeclAccess().getLiteralsAssignment_3()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumTypeDecl__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumTypeDecl__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumTypeDecl__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumTypeDeclAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getEnumTypeDeclAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Array__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Array__Group__0__Impl
	rule__Array__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Array__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayAccess().getBaseTypeAssignment_0()); }
	(rule__Array__BaseTypeAssignment_0)
	{ after(grammarAccess.getArrayAccess().getBaseTypeAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Array__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Array__Group__1__Impl
	rule__Array__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Array__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_1()); }
	'['
	{ after(grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Array__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Array__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Array__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayAccess().getRightSquareBracketKeyword_2()); }
	']'
	{ after(grammarAccess.getArrayAccess().getRightSquareBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__TypesAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getTypesTypeDeclParserRuleCall_0()); }
		ruleTypeDecl
		{ after(grammarAccess.getModelAccess().getTypesTypeDeclParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeDecl__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSimpleTypeDeclAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getSimpleTypeDeclAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumTypeDecl__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumTypeDeclAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getEnumTypeDeclAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumTypeDecl__LiteralsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumTypeDeclAccess().getLiteralsEnumElementParserRuleCall_3_0()); }
		ruleEnumElement
		{ after(grammarAccess.getEnumTypeDeclAccess().getLiteralsEnumElementParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumElement__NameAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumElementAccess().getNameIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getEnumElementAccess().getNameIDTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Array__BaseTypeAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getArrayAccess().getBaseTypeTypeDeclCrossReference_0_0()); }
		(
			{ before(grammarAccess.getArrayAccess().getBaseTypeTypeDeclIDTerminalRuleCall_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getArrayAccess().getBaseTypeTypeDeclIDTerminalRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getArrayAccess().getBaseTypeTypeDeclCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeRef__TypeAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeRefAccess().getTypeTypeDeclCrossReference_0()); }
		(
			{ before(grammarAccess.getTypeRefAccess().getTypeTypeDeclIDTerminalRuleCall_0_1()); }
			RULE_ID
			{ after(grammarAccess.getTypeRefAccess().getTypeTypeDeclIDTerminalRuleCall_0_1()); }
		)
		{ after(grammarAccess.getTypeRefAccess().getTypeTypeDeclCrossReference_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
