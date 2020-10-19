package com.cg.healthcare.repository;


import com.cg.healthcare.entities.User;

public interface UserRepository {
		User findByUsername(String username);
}
