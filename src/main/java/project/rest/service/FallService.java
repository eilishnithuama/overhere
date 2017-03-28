package project.rest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.rest.entities.Fall;
import project.rest.repository.FallRepository;

@Service
public class FallService {
	
	@Autowired
	FallRepository fallRepo;
	int size = 0;

	public Fall findById(int id) {
		return fallRepo.findById(id);
	}

	public Fall findLatest() {
		if(size == 0){
			Iterable<Fall> fullList = fallRepo.findAll();
			ArrayList<Fall> myList = new ArrayList<Fall>();
			for(Fall fall : fullList){
				myList.add(fall);
			}
			size = myList.size();
			return myList.get((myList).size());
			
		}
		else{
			size++;
			return fallRepo.findById(size-1);
		}
		
	}

	public Iterable<Fall> findAll() {
		return fallRepo.findAll();
	}

	public void save(Fall fall) {
		fallRepo.save(fall);
		
	}
}
