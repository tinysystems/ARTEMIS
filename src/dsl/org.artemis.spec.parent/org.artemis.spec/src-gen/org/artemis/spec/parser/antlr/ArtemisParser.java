/*
 * generated by Xtext 2.25.0
 */
package org.artemis.spec.parser.antlr;

import com.google.inject.Inject;
import org.artemis.spec.parser.antlr.internal.InternalArtemisParser;
import org.artemis.spec.services.ArtemisGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class ArtemisParser extends AbstractAntlrParser {

	@Inject
	private ArtemisGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalArtemisParser createParser(XtextTokenStream stream) {
		return new InternalArtemisParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "ArtemisModel";
	}

	public ArtemisGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ArtemisGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
