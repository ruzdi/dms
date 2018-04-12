package com.atromus.dms.repository;

import org.springframework.data.repository.CrudRepository;

import com.atromus.dms.model.User;

public interface UserRepository  extends CrudRepository<User, String> {
	
	@Override
    User findOne(String id);

    @Override
    void delete(User deleted);

}
