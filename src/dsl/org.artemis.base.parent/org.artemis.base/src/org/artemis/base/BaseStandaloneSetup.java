/*
 * generated by Xtext 2.25.0
 */
package org.artemis.base;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class BaseStandaloneSetup extends BaseStandaloneSetupGenerated {

	public static void doSetup() {
		new BaseStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
