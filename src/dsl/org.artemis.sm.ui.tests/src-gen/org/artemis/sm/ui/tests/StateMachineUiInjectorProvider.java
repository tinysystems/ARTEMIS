/*
 * generated by Xtext 2.25.0
 */
package org.artemis.sm.ui.tests;

import com.google.inject.Injector;
import org.artemis.sm.ui.internal.SmActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class StateMachineUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return SmActivator.getInstance().getInjector("org.artemis.sm.StateMachine");
	}

}
