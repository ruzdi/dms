package com.atromus.dms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.atromus.dms.model.User;


public interface UserService {

	public List<User> getAll();
	
	public User get(String id);
	
	public User save(User user);
	
	public User update(User user);
	
	public boolean delete(String id);

}
