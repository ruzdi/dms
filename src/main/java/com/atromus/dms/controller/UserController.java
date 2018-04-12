package com.atromus.dms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.atromus.dms.model.User;
import com.atromus.dms.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
    UserService userService;
	
	@RequestMapping(
		value = "/", 
		method=RequestMethod.POST, 
		produces = MediaType.APPLICATION_JSON_VALUE, 
		consumes = MediaType.APPLICATION_JSON_VALUE
	)
	public ResponseEntity<User> save(@RequestBody User user) {
		User u = userService.save(user);
		HttpHeaders responseHeaders = new HttpHeaders();
	    //responseHeaders.setLocation(location);
	    responseHeaders.set("MyResponseHeader", "MyValue");
		return new ResponseEntity<User>(u, responseHeaders, HttpStatus.CREATED);
	}
	
	
	@RequestMapping(
		value = "/", 
		method=RequestMethod.GET, 
		produces = MediaType.APPLICATION_JSON_VALUE
	)
	public ResponseEntity<List<User>> getAll() {
		List<User> users = userService.getAll();
		HttpHeaders responseHeaders = new HttpHeaders();
	    //responseHeaders.setLocation(location);
	    responseHeaders.set("MyResponseHeader", "MyValue");
		return new ResponseEntity<List<User>>(users, responseHeaders, HttpStatus.OK);
	}
	
	
	@RequestMapping(
		value = "/{id}", 
		method=RequestMethod.GET, 
		produces = MediaType.APPLICATION_JSON_VALUE
	)
	public ResponseEntity<User> get(@PathVariable("id") String id) {
		User user = userService.get(id);
		HttpHeaders responseHeaders = new HttpHeaders();
	    //responseHeaders.setLocation(location);
	    responseHeaders.set("MyResponseHeader", "MyValue");
		return new ResponseEntity<User>(user, responseHeaders, HttpStatus.OK);
	}
	
	
	@RequestMapping(
		value = "/{id}", 
		method=RequestMethod.PUT, 
		produces = MediaType.APPLICATION_JSON_VALUE
	)
	public ResponseEntity<User> update(@RequestBody User user) {
		User u = userService.save(user);
		HttpHeaders responseHeaders = new HttpHeaders();
	    //responseHeaders.setLocation(location);
	    responseHeaders.set("MyResponseHeader", "MyValue");
		return new ResponseEntity<User>(u, responseHeaders, HttpStatus.OK);
	}
	
	@RequestMapping(
		value = "/{id}", 
		method=RequestMethod.DELETE, 
		produces = MediaType.APPLICATION_JSON_VALUE
	)
	public ResponseEntity<String> delete(@PathVariable String id) {
		boolean status = userService.delete(id);
		HttpHeaders responseHeaders = new HttpHeaders();
	    //responseHeaders.setLocation(location);
	    responseHeaders.set("MyResponseHeader", "MyValue");
	    
	    if(status) {
	    		return new ResponseEntity<String>(id, responseHeaders, HttpStatus.OK);
	    }else {
	    		return new ResponseEntity<String>(id, responseHeaders, HttpStatus.NOT_FOUND);
	    }
	    
	}
	
	
}
