package project.rest.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import project.rest.entities.Fall;
import project.rest.entities.GPSLocation;
import project.rest.entities.User;
import project.rest.repository.FallRepository;
import project.rest.repository.GPSLocationRepository;
import project.rest.repository.UserRepository;
import service.FallService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyRestController {
	
	@Autowired
	FallService fallService;
	@Autowired
	GPSLocationRepository gpsRepo;
	@Autowired
	UserRepository userRepo;
	
    @RequestMapping(value="/saveAccel",method=RequestMethod.POST)
    public ResponseEntity<Fall> process(@RequestBody Fall fall){
    	fallService.save(fall);
    	
    	return new ResponseEntity<Fall>(fall,HttpStatus.OK);
    }
    
    @RequestMapping("/")
    public String home(){
    	return "index";
    }
    
    @RequestMapping(value="/saveGPS",method=RequestMethod.POST)
    public ResponseEntity<GPSLocation> process(@RequestBody GPSLocation gps){
    	gpsRepo.save(gps);
    	
    	return new ResponseEntity<GPSLocation>(gps,HttpStatus.OK);
    }
       
    @CrossOrigin
    @RequestMapping(value = "/findall")
    public Iterable<Fall> findAll(){
        return fallService.findAll();
    }
    
    @CrossOrigin
    @RequestMapping(value = "/findLatest")
    public Fall findLatest(){
        return fallService.findLatest();
    }
    
    
    
    @CrossOrigin
    @RequestMapping(value = "/findbyid")
    public @ResponseBody Fall findById(@RequestParam("id") int id){
        return fallService.findById(id);
        
    }
    
    @CrossOrigin
    @RequestMapping(value = "/findLatestGPS")
    public @ResponseBody GPSLocation findLatestGPS(){
    	return gpsRepo.findLatestGPSLocationEntry();
    }
    
    @CrossOrigin
    @RequestMapping(value="/user")
    public ResponseEntity<User> signIn(@RequestBody User user){
    	
    	User userDb = userRepo.findByUsername(user.getUsername());
    	if(userDb.getPassword().equals(user.getPassword())){
    		return  new ResponseEntity<User>(userDb,HttpStatus.OK);
    	}
    	else {
    		return new ResponseEntity<User>(user,HttpStatus.UNAUTHORIZED);
    	}
    }
	
}
