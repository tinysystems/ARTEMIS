/*
 * generated by Xtext 2.25.0
 */
package org.artemis.sm.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.artemis.sm.StateMachineRuntimeModule;
import org.artemis.sm.StateMachineStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class StateMachineIdeSetup extends StateMachineStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new StateMachineRuntimeModule(), new StateMachineIdeModule()));
	}
	
}
