package com.test.technique.controller.impl;


import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.technique.controller.EmployeController;
import com.test.technique.dto.EmployeDTO;
import com.test.technique.service.EmployeService;
import com.test.technique.util.LogMessages;


@RestController
@RequestMapping("/GestionEmployees")
@CrossOrigin(origins = "*", maxAge = 3600)
public class EmployeControllerImpl implements EmployeController {

	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeControllerImpl.class);

	@Autowired
	EmployeService employeService;

	@Override
	@GetMapping(value = "/employees", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<EmployeDTO> getAllEmploye() {
		EmployeControllerImpl.LOGGER.info(LogMessages.EMPLOYEE_GETALL);
		return this.employeService.getAllEmploye();
	}

	@Override
	@GetMapping(value = "/employe/{idEmploye}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<EmployeDTO> getEmployeById(@PathVariable Integer idEmploye) {
		EmployeControllerImpl.LOGGER.info(LogMessages.EMPLOYEE_GET_ID, idEmploye);
		final EmployeDTO employeDTO = this.employeService.getEmployeByIdEmploye(idEmploye);
		if (employeDTO == null) {
			LOGGER.error(LogMessages.EMPLOYEE_ERREUR_GET_ID);
			return ResponseEntity.noContent().build();
		} else {
			LOGGER.info(LogMessages.EMPLOYEE_SUCCESS);
			return ResponseEntity.ok(employeDTO);
		}
	}

	@Override
	@PostMapping(value = "/ajoutEmploye", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<EmployeDTO> createEmploye(@Valid @RequestBody EmployeDTO employeDTO) {
		// TODO Auto-generated method stub
		EmployeControllerImpl.LOGGER.info(LogMessages.EMPLOYEE_SAVE);
		EmployeDTO employe = employeService.createEmploye(employeDTO);
		return ResponseEntity.status(HttpStatus.CREATED).body(employe);
	}

	@Override
	@DeleteMapping(value ="/{idEmploye}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Object> supprimerEmploye(@PathVariable Integer idEmploye) {
		
		EmployeControllerImpl.LOGGER.info(LogMessages.EMPLOYEE_DELETE);
		employeService.deleteEmploye(idEmploye);
		return ResponseEntity.ok(true);
	}

}
