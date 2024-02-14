/*
 * generated by Xtext 2.25.0
 */
package org.artemis.spec.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.artemis.spec.ide.contentassist.antlr.internal.InternalArtemisParser;
import org.artemis.spec.services.ArtemisGrammarAccess;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class ArtemisParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(ArtemisGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, ArtemisGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getPropertyAccess().getAlternatives(), "rule__Property__Alternatives");
			builder.put(grammarAccess.getOnFailActionAccess().getAlternatives(), "rule__OnFailAction__Alternatives");
			builder.put(grammarAccess.getArtemisModelAccess().getGroup(), "rule__ArtemisModel__Group__0");
			builder.put(grammarAccess.getTaskAccess().getGroup(), "rule__Task__Group__0");
			builder.put(grammarAccess.getPathAccess().getGroup(), "rule__Path__Group__0");
			builder.put(grammarAccess.getPathAccess().getGroup_3(), "rule__Path__Group_3__0");
			builder.put(grammarAccess.getTaskPropertiesAccess().getGroup(), "rule__TaskProperties__Group__0");
			builder.put(grammarAccess.getPeriodAccess().getGroup(), "rule__Period__Group__0");
			builder.put(grammarAccess.getMaxTriesAccess().getGroup(), "rule__MaxTries__Group__0");
			builder.put(grammarAccess.getMaxDurationAccess().getGroup(), "rule__MaxDuration__Group__0");
			builder.put(grammarAccess.getMitdAccess().getGroup(), "rule__Mitd__Group__0");
			builder.put(grammarAccess.getCollectAccess().getGroup(), "rule__Collect__Group__0");
			builder.put(grammarAccess.getRestartPathAccess().getGroup(), "rule__RestartPath__Group__0");
			builder.put(grammarAccess.getRestartPathAccess().getGroup_2(), "rule__RestartPath__Group_2__0");
			builder.put(grammarAccess.getSkipPathAccess().getGroup(), "rule__SkipPath__Group__0");
			builder.put(grammarAccess.getSkipPathAccess().getGroup_2(), "rule__SkipPath__Group_2__0");
			builder.put(grammarAccess.getRestartTaskAccess().getGroup(), "rule__RestartTask__Group__0");
			builder.put(grammarAccess.getSkipTaskAccess().getGroup(), "rule__SkipTask__Group__0");
			builder.put(grammarAccess.getArtemisModelAccess().getTasksAssignment_0(), "rule__ArtemisModel__TasksAssignment_0");
			builder.put(grammarAccess.getArtemisModelAccess().getPathsAssignment_1(), "rule__ArtemisModel__PathsAssignment_1");
			builder.put(grammarAccess.getArtemisModelAccess().getTaskPropertiesAssignment_2(), "rule__ArtemisModel__TaskPropertiesAssignment_2");
			builder.put(grammarAccess.getTaskAccess().getNameAssignment_1(), "rule__Task__NameAssignment_1");
			builder.put(grammarAccess.getPathAccess().getIdAssignment_2(), "rule__Path__IdAssignment_2");
			builder.put(grammarAccess.getPathAccess().getTasksAssignment_3_1(), "rule__Path__TasksAssignment_3_1");
			builder.put(grammarAccess.getTaskPropertiesAccess().getTaskAssignment_0(), "rule__TaskProperties__TaskAssignment_0");
			builder.put(grammarAccess.getTaskPropertiesAccess().getPropertiesAssignment_2(), "rule__TaskProperties__PropertiesAssignment_2");
			builder.put(grammarAccess.getPeriodAccess().getPeriodAssignment_1(), "rule__Period__PeriodAssignment_1");
			builder.put(grammarAccess.getPeriodAccess().getOnFailActionAssignment_4(), "rule__Period__OnFailActionAssignment_4");
			builder.put(grammarAccess.getPeriodAccess().getMaxAttemptsAssignment_6(), "rule__Period__MaxAttemptsAssignment_6");
			builder.put(grammarAccess.getPeriodAccess().getOnFailMaxAttemptActionAssignment_8(), "rule__Period__OnFailMaxAttemptActionAssignment_8");
			builder.put(grammarAccess.getMaxTriesAccess().getNrTriesAssignment_1(), "rule__MaxTries__NrTriesAssignment_1");
			builder.put(grammarAccess.getMaxTriesAccess().getOnFailActionAssignment_3(), "rule__MaxTries__OnFailActionAssignment_3");
			builder.put(grammarAccess.getMaxDurationAccess().getMaxDurationAssignment_1(), "rule__MaxDuration__MaxDurationAssignment_1");
			builder.put(grammarAccess.getMaxDurationAccess().getOnFailActionAssignment_4(), "rule__MaxDuration__OnFailActionAssignment_4");
			builder.put(grammarAccess.getMitdAccess().getDurationAssignment_1(), "rule__Mitd__DurationAssignment_1");
			builder.put(grammarAccess.getMitdAccess().getDependsOnAssignment_4(), "rule__Mitd__DependsOnAssignment_4");
			builder.put(grammarAccess.getMitdAccess().getOnFailActionAssignment_6(), "rule__Mitd__OnFailActionAssignment_6");
			builder.put(grammarAccess.getMitdAccess().getMaxAttemptsAssignment_8(), "rule__Mitd__MaxAttemptsAssignment_8");
			builder.put(grammarAccess.getMitdAccess().getOnFailMaxAttemptActionAssignment_10(), "rule__Mitd__OnFailMaxAttemptActionAssignment_10");
			builder.put(grammarAccess.getCollectAccess().getNrItemsAssignment_1(), "rule__Collect__NrItemsAssignment_1");
			builder.put(grammarAccess.getCollectAccess().getDependsOnAssignment_3(), "rule__Collect__DependsOnAssignment_3");
			builder.put(grammarAccess.getCollectAccess().getOnFailActionAssignment_5(), "rule__Collect__OnFailActionAssignment_5");
			builder.put(grammarAccess.getRestartPathAccess().getPathAssignment_2_1(), "rule__RestartPath__PathAssignment_2_1");
			builder.put(grammarAccess.getSkipPathAccess().getPathAssignment_2_1(), "rule__SkipPath__PathAssignment_2_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private ArtemisGrammarAccess grammarAccess;

	@Override
	protected InternalArtemisParser createParser() {
		InternalArtemisParser result = new InternalArtemisParser(null);
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

	public ArtemisGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ArtemisGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
