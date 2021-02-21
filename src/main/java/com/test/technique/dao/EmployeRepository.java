package com.test.technique.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.test.technique.model.Employe;


public interface EmployeRepository extends JpaRepository<Employe, Integer>, JpaSpecificationExecutor<Employe>{

}
