package com.springboot.hospital_management_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.hospital_management_system.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
