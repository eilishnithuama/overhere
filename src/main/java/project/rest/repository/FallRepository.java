package project.rest.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import project.rest.entities.Fall;

public interface FallRepository extends CrudRepository<Fall, Long> {
	Fall findById(int id);
	List<Fall> findByXaxis(double xaxis);
}
