/*
 * generated by Xtext 2.25.0
 */
package org.artemis.spec.ui;

import com.google.inject.Injector;
import org.artemis.spec.ui.internal.SpecActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ArtemisExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(SpecActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		SpecActivator activator = SpecActivator.getInstance();
		return activator != null ? activator.getInjector(SpecActivator.ORG_ARTEMIS_SPEC_ARTEMIS) : null;
	}

}
