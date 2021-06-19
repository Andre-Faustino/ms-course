package com.ms.hruser.resources;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ms.hruser.entities.User;
import com.ms.hruser.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	
	private static Logger logger = org.slf4j.LoggerFactory.getLogger(UserResource.class);
	

	@Autowired
	private UserRepository repo;
	
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		List<User> list = repo.findAll();		
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		User obj = repo.findById(id).get();		
		return ResponseEntity.ok(obj);
	}
	
	@GetMapping(value = "/search")
	public ResponseEntity<User> findByEmail(@RequestParam String email){
		User obj = repo.findByEmail(email).get();		
		return ResponseEntity.ok(obj);
	}
}
