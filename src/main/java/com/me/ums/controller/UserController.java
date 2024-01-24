package com.me.ums.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.me.ums.entity.User;
import com.me.ums.requestdto.UserRequest;
import com.me.ums.responsedto.UserResponse;
import com.me.ums.service.UserService;
import com.me.ums.util.ResponseStructure;

import jakarta.validation.Valid;

@RestController
public class UserController 
{
	@Autowired
	private UserService userservice;
	
	// 1. Adding the User
	
	@PostMapping(path = "/add")
	public ResponseEntity<ResponseStructure<UserResponse>> addUser(@RequestBody @Valid UserRequest userRequest)
	{
		return userservice.addUser(userRequest);
	}
	
	// 2. Updating the User
	
	@PutMapping(value = "/update/{userId}")
	public ResponseEntity<ResponseStructure<UserResponse>> updateUser(@PathVariable int userId , @RequestBody User user)
	{
		return userservice.updateUser(userId , user);
	}
	
	// 3. Deleting the User
	
	@DeleteMapping("/delete/{userId}")
	public ResponseEntity<ResponseStructure<UserResponse>> deleteUser(@PathVariable int userId)
	{
		return userservice.deleteUser(userId);
	}
	
	// 4. Finding the User
	
	@GetMapping("/find/{userId}")
	public ResponseEntity<ResponseStructure<UserResponse>> findUserById(@PathVariable int userId)
	{
		return userservice.findUserById(userId);
	}
}
