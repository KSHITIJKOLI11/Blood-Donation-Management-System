package com.FirstPackage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FirstPackage.service.DonarService;
import com.FirstPackage.dto.*;

@RestController
@RequestMapping("/api/v1/donar")
public class DonarController {
	
	@Autowired
	DonarService donarService;
	
	@PostMapping("/addDonar")
	public ResponseEntity<DonarDto>addDonar(@RequestBody DonarDto donarDto){
		return new ResponseEntity<DonarDto>(donarService.addNewDonar(donarDto), HttpStatus.OK);
	}
	
	

}
