package com.springboot.hospital_management_system.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class PatientAdmittedToRoom {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private LocalDate dateAdmitted;
	
	@Column
	private LocalDate dateDischarged;
	
	@ManyToOne
	private Room room;
	
	@ManyToOne
	private Patient patient;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDateAdmitted() {
		return dateAdmitted;
	}

	public void setDateAdmitted(LocalDate dateAdmitted) {
		this.dateAdmitted = dateAdmitted;
	}

	public LocalDate getDateDischarged() {
		return dateDischarged;
	}

	public void setDateDischarged(LocalDate dateDischarged) {
		this.dateDischarged = dateDischarged;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	
}
