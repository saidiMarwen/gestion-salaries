package com.test.technique.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.test.technique.dto.EmployeDTO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * Interface de gestion du controller des employees
 * 
 *
 */
@Api(description = "API REST des references")
public interface EmployeController {
	
	
	@ApiOperation(value = "Récupérer toutes les Employees")
	List<EmployeDTO> getAllEmploye();

	@ApiOperation(value = "Récupérer l'employe par Id")
	ResponseEntity<EmployeDTO> getEmployeById(Integer idEmploye);
	
	@ApiOperation(value = "Créer ou Metre à jour un employe ")
	ResponseEntity<EmployeDTO> createEmploye(EmployeDTO employeDTO);
	
	@ApiOperation(value = "Supprimer un employe")
	ResponseEntity<Object> supprimerEmploye(Integer IdEmploye) ;

}
