package com.FirstPackage.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PathVariable;

import com.FirstPackage.entity.*;

public interface DonarRepository extends JpaRepository<Donar, Integer> {
	
	List<Donar> findByDonarBloodType(@PathVariable(value = "donarBloodType") String donarBloodType);
	
	List<Donar> findByDonarCity(@PathVariable(value = "donarCity") String donarCity);
	
	
}
