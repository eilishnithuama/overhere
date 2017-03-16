package project.rest.repository;

import org.springframework.data.repository.CrudRepository;

import project.rest.entities.User;

public interface UserRepository extends CrudRepository<User,Long> {

	User findByUsername(String username);

}
