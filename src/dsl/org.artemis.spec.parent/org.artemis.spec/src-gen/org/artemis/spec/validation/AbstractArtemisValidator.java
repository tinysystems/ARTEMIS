/*
 * generated by Xtext 2.25.0
 */
package org.artemis.spec.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractArtemisValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.artemis.spec.artemis.ArtemisPackage.eINSTANCE);
		return result;
	}
}