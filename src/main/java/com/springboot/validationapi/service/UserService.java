package com.springboot.validationapi.service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.validationapi.dto.UserRequest;
import com.springboot.validationapi.entity.User;
import com.springboot.validationapi.exception.UserNotFoundException;
import com.springboot.validationapi.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	 private UserRepository repository;
	
	public User saveUser(UserRequest userRequest) {
		User user= User.build(0,userRequest.getName(), userRequest.getEmail(), userRequest.getMobile(), userRequest.getGender(),userRequest.getAge(),userRequest.getNationality());
		return repository.save(user);
	}
	
	public List<User> getAllUsers(){
		return repository.findAll();
	}
	
	public User getUser(int id) throws UserNotFoundException {
		User user = repository.findByUserId(id);
		if (user!=null) {
			return user;
		}else {
			throw new UserNotFoundException("user not found with id : " +id);
		}
	}
}
