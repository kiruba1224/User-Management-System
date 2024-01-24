package com.me.ums.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.me.ums.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> 
{

	Optional<User> findByUserName(String userName);
	
}