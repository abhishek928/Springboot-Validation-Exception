package com.springboot.validationapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.validationapi.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUserId(int id);

}
