package project.rest.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import project.rest.entities.HeartRate;

public interface HeartRateRepository extends CrudRepository<HeartRate, Long> {
	HeartRate findById(int id);
	List<HeartRate> findByTimestamp(Date date);
}
