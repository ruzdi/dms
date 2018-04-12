package com.atromus.dms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atromus.dms.model.User;
import com.atromus.dms.repository.UserRepository;
import com.atromus.dms.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
    UserRepository userRepository;

	@Override
	public List<User> getAll() {
		return (List<User>)userRepository.findAll();
	}
	
	@Override
	public User get(String id) {
		return userRepository.findOne(id);
	}

	@Override
	public User save(User user) {
		userRepository.save(user);
		return user;
	}

	@Override
	public User update(User user) {
		return userRepository.save(user);
	}

	@Override
	public boolean delete(String id) {
		try {
			userRepository.delete(id);
			return true;
		}catch (Exception e) {
			return false;
		}
		
	}

	

}
