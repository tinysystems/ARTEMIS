/*
 * generated by Xtext 2.25.0
 */
package org.artemis.sm.validation;

import java.util.ArrayList;
import java.util.List;
import org.artemis.base.validation.BaseValidator;
import org.eclipse.emf.ecore.EPackage;

public abstract class AbstractStateMachineValidator extends BaseValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>(super.getEPackages());
		result.add(org.artemis.sm.stateMachine.StateMachinePackage.eINSTANCE);
		return result;
	}
}
