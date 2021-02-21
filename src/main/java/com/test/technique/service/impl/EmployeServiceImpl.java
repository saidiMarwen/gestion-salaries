package com.test.technique.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.technique.dao.EmployeRepository;
import com.test.technique.dto.EmployeDTO;
import com.test.technique.mapper.EmployeMapper;
import com.test.technique.model.Employe;
import com.test.technique.service.EmployeService;

@Service
@Configuration
@Transactional
public class EmployeServiceImpl implements EmployeService {

	@Autowired
	EmployeMapper employeMapper;

	@Autowired
	EmployeRepository employeRepository;

	@Override
	public Stream<EmployeDTO> getAllEmploye() {

		List<EmployeDTO> listEmploye = employeRepository.findAll().parallelStream().map(employeMapper::toDto)
				.collect(Collectors.toList());

		return listEmploye.parallelStream();
	}

	@Override
	public EmployeDTO getEmployeByIdEmploye(Integer idEmploye) {
		Optional<Employe> employe = this.employeRepository.findById(idEmploye);
		if (employe.isPresent()) {
			return employeMapper.toDto(employe.get());
		}
		return null;
	}

	@Override
	public EmployeDTO createEmploye(EmployeDTO employeDTO) {
		Employe employe = employeMapper.toEntity(employeDTO);
		return employeMapper.toDto(employeRepository.save(employe));
	}

	@Override
	public void deleteEmploye(Integer idEmploye) {
		this.employeRepository.deleteById(idEmploye);

	}

}
