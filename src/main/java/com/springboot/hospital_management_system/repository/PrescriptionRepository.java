package com.springboot.hospital_management_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.hospital_management_system.model.Prescription;

public interface PrescriptionRepository extends JpaRepository<Prescription, Integer> {

}
