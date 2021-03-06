/**
 * 
 */
package gr.ekt.cerif.services.multilingual.indicator;

import java.util.List;

import gr.ekt.cerif.entities.second.Indicator;
import gr.ekt.cerif.features.multilingual.IndicatorDescription;

/**
 * @author bonisv
 *
 */
public interface IndicatorDescriptionRepository {

	public void delete(IndicatorDescription entity); 
	
	public void delete(Iterable<IndicatorDescription> entities); 

	public Iterable<IndicatorDescription> save(Iterable<IndicatorDescription> entities); 
	
	public IndicatorDescription save(IndicatorDescription entity);
	
	List<IndicatorDescription> findByIndicator(Indicator indicator);
}
