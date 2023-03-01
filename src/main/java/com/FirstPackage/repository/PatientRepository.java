package com.FirstPackage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FirstPackage.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer>{

}
