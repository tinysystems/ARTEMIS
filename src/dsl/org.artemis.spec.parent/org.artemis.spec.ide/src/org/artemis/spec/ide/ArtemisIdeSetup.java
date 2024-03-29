/*
 * generated by Xtext 2.25.0
 */
package org.artemis.spec.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.artemis.spec.ArtemisRuntimeModule;
import org.artemis.spec.ArtemisStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class ArtemisIdeSetup extends ArtemisStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new ArtemisRuntimeModule(), new ArtemisIdeModule()));
	}
	
}
