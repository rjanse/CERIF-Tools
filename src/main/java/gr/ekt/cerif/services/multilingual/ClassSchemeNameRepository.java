
package gr.ekt.cerif.services.multilingual;

import gr.ekt.cerif.features.multilingual.ClassSchemeName;

import org.springframework.data.repository.CrudRepository;


/**
 * A repository for ClassSchemeName.
 * 
 */
public interface ClassSchemeNameRepository extends CrudRepository<ClassSchemeName, Long> {
	
	ClassSchemeName findByName(String name);
	
}
