package project.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import project.rest.entities.GPSLocation;

public interface GPSLocationRepository extends CrudRepository<GPSLocation, Long>{

	GPSLocation findById(int id);
	List<GPSLocation> findByLongitude(float longitude);
	List<GPSLocation> findByLatitude(float latitude);
	
	@Query(nativeQuery = true,value ="SELECT * FROM GPSLocation ORDER BY timestamp DESC LIMIT 1")
	GPSLocation findLatestGPSLocationEntry();
}
