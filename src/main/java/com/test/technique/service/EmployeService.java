package com.test.technique.service;

import java.util.stream.Stream;

import com.test.technique.dto.EmployeDTO;

public interface EmployeService {
	/**
	 * methode qui permet de recuperer tout les Employes
	 * 
	 * @return List<EmployeDTO>
	 */
	public Stream<EmployeDTO> getAllEmploye();

	/**
	 * methode qui permet du recuperer un Employe par code
	 * 
	 * @return EmployeDTO
	 */
	public EmployeDTO getEmployeByIdEmploye(Integer idEmploye);

	EmployeDTO createEmploye(EmployeDTO employeDTO);

	void deleteEmploye(Integer idEmploye);
}
