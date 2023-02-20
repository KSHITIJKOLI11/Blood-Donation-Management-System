package com.FirstPackage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FirstPackage.entity.*;

public interface DonarRepository extends JpaRepository<Donar, Integer> {

}
