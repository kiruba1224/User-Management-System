package com.me.ums.service;

import org.springframework.http.ResponseEntity;

import com.me.ums.entity.User;
import com.me.ums.requestdto.UserRequest;
import com.me.ums.responsedto.UserResponse;
import com.me.ums.util.ResponseStructure;

public interface UserService 
{
	// 1. Adding the User
	
	ResponseEntity<ResponseStructure<UserResponse>> addUser(UserRequest userRequest);
	
	// 2. Updating the User

	ResponseEntity<ResponseStructure<UserResponse>> updateUser(int userId, User user);
	
	// 3. Deleting the User
	
	ResponseEntity<ResponseStructure<UserResponse>> deleteUser(int userId);
	
	// 4. Finding the User

	ResponseEntity<ResponseStructure<UserResponse>> findUserById(int userId);
}
