package gr.ekt.cerif.services.additional;

import gr.ekt.cerif.features.additional.DublinCoreProvenance;

import org.springframework.data.repository.CrudRepository;

@Deprecated
public interface DublinCoreProvenanceCrudRepository extends CrudRepository<DublinCoreProvenance, Long> {

}
