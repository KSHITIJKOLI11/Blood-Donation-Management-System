package com.FirstPackage.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.FirstPackage.dto.DonarDto;
import com.FirstPackage.entity.Donar;


public interface DonarService {
	
	DonarDto addNewDonar(DonarDto donarDto);
	
	List<Donar> getAllDonar();

	DonarDto updateDonarById(DonarDto donarDto);
	
	String deleteDonarById(int id);
	
	List<Donar> findByDonarBloodType(@PathVariable(value = "donarBloodType") String donarBloodType);
	
	List<Donar> findByDonarCity(@PathVariable(value = "donarCity") String donarCity);
	
	Donar getDonarById(int id);

}
