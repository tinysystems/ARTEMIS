/*
 * generated by Xtext 2.25.0
 */
package org.artemis.base.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.artemis.base.ide.contentassist.antlr.internal.InternalBaseParser;
import org.artemis.base.services.BaseGrammarAccess;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class BaseParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(BaseGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, BaseGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getTypeDeclAccess().getAlternatives(), "rule__TypeDecl__Alternatives");
			builder.put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
			builder.put(grammarAccess.getSimpleTypeDeclAccess().getGroup(), "rule__SimpleTypeDecl__Group__0");
			builder.put(grammarAccess.getEnumTypeDeclAccess().getGroup(), "rule__EnumTypeDecl__Group__0");
			builder.put(grammarAccess.getArrayAccess().getGroup(), "rule__Array__Group__0");
			builder.put(grammarAccess.getModelAccess().getTypesAssignment(), "rule__Model__TypesAssignment");
			builder.put(grammarAccess.getSimpleTypeDeclAccess().getNameAssignment_1(), "rule__SimpleTypeDecl__NameAssignment_1");
			builder.put(grammarAccess.getEnumTypeDeclAccess().getNameAssignment_1(), "rule__EnumTypeDecl__NameAssignment_1");
			builder.put(grammarAccess.getEnumTypeDeclAccess().getLiteralsAssignment_3(), "rule__EnumTypeDecl__LiteralsAssignment_3");
			builder.put(grammarAccess.getEnumElementAccess().getNameAssignment(), "rule__EnumElement__NameAssignment");
			builder.put(grammarAccess.getArrayAccess().getBaseTypeAssignment_0(), "rule__Array__BaseTypeAssignment_0");
			builder.put(grammarAccess.getTypeRefAccess().getTypeAssignment(), "rule__TypeRef__TypeAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private BaseGrammarAccess grammarAccess;

	@Override
	protected InternalBaseParser createParser() {
		InternalBaseParser result = new InternalBaseParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public BaseGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(BaseGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
