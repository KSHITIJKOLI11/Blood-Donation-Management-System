package com.FirstPackage.service;

import java.util.List;
import com.FirstPackage.dto.DonarDto;
import com.FirstPackage.entity.Donar;


public interface DonarService {
	
	DonarDto addNewDonar(DonarDto donarDto);
	
	List<Donar> getAllDonar();

	Donar updateDonarById(int id, Donar donar);
	
	String deleteDonarById(int id);

}
