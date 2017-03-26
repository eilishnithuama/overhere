package service;

import java.util.List;

import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import project.rest.entities.Fall;
import project.rest.repository.FallRepository;

@Service
public class FallService {
	
	@Autowired
	FallRepository fallRepo;

	public Fall findById(int id) {
		return fallRepo.findById(id);
	}

	public Fall findLatest() {
		Iterable <Fall> fullList = fallRepo.findAll();
		List<Fall> myList = Lists.newArrayList(fullList);
		return myList.get(myList.size()-1);
	}

	public Iterable<Fall> findAll() {
		return fallRepo.findAll();
	}

	public void save(Fall fall) {
		fallRepo.save(fall);
		
	}
	
	
	

}
