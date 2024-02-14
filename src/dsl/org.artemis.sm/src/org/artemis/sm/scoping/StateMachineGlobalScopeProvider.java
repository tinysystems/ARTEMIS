package org.artemis.sm.scoping;

import java.util.LinkedHashSet;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.scoping.impl.ImportUriGlobalScopeProvider;

public class StateMachineGlobalScopeProvider extends ImportUriGlobalScopeProvider {
	static final String BASIC_TYPES_JAR_PATH = "org/artemis/base/globals.base";
    static final URI BASIC_TYPES_PATH = URI.createURI(
        Thread.currentThread().getContextClassLoader().getResource(BASIC_TYPES_JAR_PATH).toString());
    
    @Override 
    public LinkedHashSet<URI> getImportedUris(Resource resource) {
        LinkedHashSet<URI> importedURIs = new LinkedHashSet<URI>(5);
                
        //implicit import of the built-in types and variables in globals.base
        importedURIs.add(BASIC_TYPES_PATH);
        
        return importedURIs;
    }
}
