package com.test.technique.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.test.technique.dto.EmployeDTO;
import com.test.technique.model.Employe;

@Mapper(componentModel = "spring")
public interface EmployeMapper {

	EmployeDTO toDto(Employe Employe);

	Employe toEntity(EmployeDTO EmployeDTO);

	List<EmployeDTO> toDtoList(List<Employe> EmployeList);

	List<Employe> toEntityList(List<EmployeDTO> EmployeDTOList);

}
