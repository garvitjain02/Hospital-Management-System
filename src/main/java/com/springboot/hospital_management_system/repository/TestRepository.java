package com.springboot.hospital_management_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.hospital_management_system.model.Test;

public interface TestRepository extends JpaRepository<Test, Integer> {

}
