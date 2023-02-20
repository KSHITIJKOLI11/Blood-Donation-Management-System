package com.FirstPackage.service;

import java.util.List;

import com.FirstPackage.dto.DonarDto;

public interface DonarService {
	
	DonarDto addNewDonar(DonarDto donarDto);
	List<DonarDto> getAllDonar();
	
	
	

}
