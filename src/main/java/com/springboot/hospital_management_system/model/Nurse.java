package com.springboot.hospital_management_system.model;

import com.springboot.hospital_management_system.enums.ShiftTiming;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Nurse {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Enumerated(EnumType.STRING)
	private ShiftTiming shiftTiming;
	
	@ManyToOne
	private Department department;

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ShiftTiming getShiftTiming() {
		return shiftTiming;
	}

	public void setShiftTiming(ShiftTiming shiftTiming) {
		this.shiftTiming = shiftTiming;
	}
	
	
}
