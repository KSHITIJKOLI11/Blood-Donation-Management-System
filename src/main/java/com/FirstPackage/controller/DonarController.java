package com.FirstPackage.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FirstPackage.service.DonarService;
import com.FirstPackage.dto.*;
import com.FirstPackage.entity.Donar;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/donar")
public class DonarController {
	
	@Autowired
	DonarService donarService;
	
	@PostMapping("/addDonar")
	public ResponseEntity<DonarDto>addDonar(@RequestBody DonarDto donarDto){
		return new ResponseEntity<DonarDto>(donarService.addNewDonar(donarDto), HttpStatus.OK);
	}
	
	@GetMapping("/Alldonars")
	public ResponseEntity<List<Donar>> getAllDonar(){
		return new ResponseEntity<List<Donar>>(donarService.getAllDonar(), HttpStatus.OK);
	}
   	
	@PutMapping("/updateDonar")
	public ResponseEntity<DonarDto>updateDonarById(@RequestBody DonarDto donarDto ){
	    return new ResponseEntity<DonarDto>(donarService.updateDonarById(donarDto), HttpStatus.OK);	
	}
	
	@DeleteMapping("/deleteDonar/{id}")
	public ResponseEntity<String> deleteDonarById(@PathVariable int id) {
		return new ResponseEntity<String>(donarService.deleteDonarById(id),HttpStatus.OK);
	}
	
	@GetMapping("/findbybt/{donarBloodType}")
	public ResponseEntity<List<Donar>> findByDonarBloodType(@PathVariable(value="donarBloodType") String donarBloodType){
		return new ResponseEntity<List<Donar>>(donarService.findByDonarBloodType(donarBloodType), HttpStatus.OK);
	}
	
	@GetMapping("/findbycity/{donarCity}")
	public ResponseEntity<List<Donar>> findByDonarCity(@PathVariable(value="donarCity") String donarCity){
		return new ResponseEntity<List<Donar>>(donarService.findByDonarCity(donarCity), HttpStatus.OK);
	}
	
	@GetMapping("/getbyid/{id}")
	public ResponseEntity<Donar> getDonarById(@PathVariable int id){
		return new ResponseEntity<Donar>(donarService.getDonarById(id), HttpStatus.OK);
	}
	
	
}












