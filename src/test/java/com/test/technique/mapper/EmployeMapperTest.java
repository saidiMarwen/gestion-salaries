/**
 * 
 */
package com.test.technique.mapper;

import static org.junit.Assert.*;

import java.util.List;

import java.util.Arrays;
import org.junit.Test;
import org.mapstruct.factory.Mappers;

import com.test.technique.dto.EmployeDTO;
import com.test.technique.model.Employe;

/**
 * Classe de test du mapper employe
 * 
 *
 */
public class EmployeMapperTest {

	private EmployeMapper employeMapper = Mappers.getMapper(EmployeMapper.class);

	private static Integer ID_EMPLOYE = 1;
	private static String ADRESSE = "PARIS";
	private static Integer ANNEE_EXPERIENCE = 6;
	private static String FONCTION = "Consultant java jee";
	private static String PRENOM = "marwen";
	private static Integer SALAIRE = 2500;

	/**
	 * Teste le mapper de EmployeDTO pour la méthode
	 * {@link com.test.technique.mapper.EmployeMapper#toDto(com.test.technique.model.Employe)}.
	 * 
	 * @throws Exception
	 */
	@Test
	public final void testToDto() throws Exception {

		// Donne
		Employe employe = new Employe();
		employe.setIdEmploye(ID_EMPLOYE);
		employe.setAdresse(ADRESSE);
		employe.setAnneeExperience(ANNEE_EXPERIENCE);
		employe.setFonction(FONCTION);
		employe.setPrenom(PRENOM);
		employe.setSalaire(SALAIRE);

		// Quand
		EmployeDTO employeDto = employeMapper.toDto(employe);

		// Alors
		assertEquals(employe.getIdEmploye(), ID_EMPLOYE);
		assertEquals(employe.getAdresse(), ADRESSE);
		assertEquals(employe.getAnneeExperience(), ANNEE_EXPERIENCE);
		assertEquals(employe.getFonction(), FONCTION);
		assertEquals(employe.getPrenom(), PRENOM);
		assertEquals(employe.getSalaire(), SALAIRE);
	}

	/**
	 * Teste le mapper de EmployeDTO pour la méthode
	 * {@link fr.gouv.justice.aac.bejic.mapper.EmployeMapper#toEntity(fr.gouv.justice.aac.bejic.dto.EmployeDTO)}.
	 * 
	 * @throws Exception
	 */
	@Test
	public final void testToEntity() throws Exception {

		// Donne
		EmployeDTO employeDto = new EmployeDTO();
		employeDto.setIdEmploye(ID_EMPLOYE);
		employeDto.setAdresse(ADRESSE);
		employeDto.setAnneeExperience(ANNEE_EXPERIENCE);
		employeDto.setFonction(FONCTION);
		employeDto.setPrenom(PRENOM);
		employeDto.setSalaire(SALAIRE);

		// Quand
		Employe employe = employeMapper.toEntity(employeDto);

		// Alors
		assertEquals(Integer.valueOf(ID_EMPLOYE), employe.getIdEmploye());
		assertEquals(String.valueOf(ADRESSE), employe.getAdresse());
		assertEquals(Integer.valueOf(ANNEE_EXPERIENCE), employe.getAnneeExperience());
		assertEquals(String.valueOf(FONCTION), employe.getFonction());
		assertEquals(String.valueOf(PRENOM), employe.getPrenom());
		assertEquals(Integer.valueOf(SALAIRE), employe.getSalaire());
	}

	/**
	 * Teste le mapper de EmployeDTO pour la méthode
	 * {@link com.test.technique.mapper.EmployeMapper#toDtoList(java.util.List)}.
	 * 
	 * @throws Exception
	 */
	@Test
	public final void testToDtoList() throws Exception {

		// Donne
		Employe employe1 = new Employe();
		employe1.setIdEmploye(ID_EMPLOYE);
		employe1.setAdresse(ADRESSE);
		employe1.setAnneeExperience(ANNEE_EXPERIENCE);
		employe1.setFonction(FONCTION);
		employe1.setPrenom(PRENOM);
		employe1.setSalaire(SALAIRE);

		Employe employe2 = new Employe();
		employe2.setIdEmploye(ID_EMPLOYE);
		employe2.setAdresse(ADRESSE);
		employe2.setAnneeExperience(ANNEE_EXPERIENCE);
		employe2.setFonction(FONCTION);
		employe2.setPrenom(PRENOM);
		employe2.setSalaire(SALAIRE);

		List<Employe> employes = Arrays.asList(employe1, employe2);

		// Quand
		List<EmployeDTO> employesDto = employeMapper.toDtoList(employes);

		// Alors
		assertEquals(Integer.valueOf(ID_EMPLOYE), employesDto.get(0).getIdEmploye());
		assertEquals(String.valueOf(PRENOM), employesDto.get(0).getPrenom());
		assertEquals(String.valueOf(FONCTION), employesDto.get(0).getFonction());
		assertEquals(Integer.valueOf(ANNEE_EXPERIENCE), employesDto.get(0).getAnneeExperience());
		assertEquals(String.valueOf(ADRESSE), employesDto.get(0).getAdresse());
		assertEquals(Integer.valueOf(SALAIRE), employesDto.get(0).getSalaire());
		
		assertEquals(Integer.valueOf(ID_EMPLOYE), employesDto.get(1).getIdEmploye());
		assertEquals(String.valueOf(PRENOM), employesDto.get(1).getPrenom());
		assertEquals(String.valueOf(FONCTION), employesDto.get(1).getFonction());
		assertEquals(Integer.valueOf(ANNEE_EXPERIENCE), employesDto.get(1).getAnneeExperience());
		assertEquals(String.valueOf(ADRESSE), employesDto.get(1).getAdresse());
		assertEquals(Integer.valueOf(SALAIRE), employesDto.get(1).getSalaire());
		
	}

	/**
	 * Teste le mapper de EmployeDTO pour la méthode
	 * {@link com.test.technique.mapper.EmployeMapper#toEntityList(java.util.List)}.
	 * 
	 * @throws Exception
	 */
	@Test
	public final void testToEntityList() throws Exception {

		// Donne
		EmployeDTO employeDto1 = new EmployeDTO();
		employeDto1.setIdEmploye(ID_EMPLOYE);
		employeDto1.setAdresse(ADRESSE);
		employeDto1.setAnneeExperience(ANNEE_EXPERIENCE);
		employeDto1.setFonction(FONCTION);
		employeDto1.setPrenom(PRENOM);
		employeDto1.setSalaire(SALAIRE);

		EmployeDTO employeDto2 = new EmployeDTO();
		employeDto2.setIdEmploye(ID_EMPLOYE);
		employeDto2.setAdresse(ADRESSE);
		employeDto2.setAnneeExperience(ANNEE_EXPERIENCE);
		employeDto2.setFonction(FONCTION);
		employeDto2.setPrenom(PRENOM);
		employeDto2.setSalaire(SALAIRE);

		List<EmployeDTO> employesDto = Arrays.asList(employeDto1 , employeDto2);

		// Quand
		List<Employe> employes = employeMapper.toEntityList(employesDto);

		// Alors
		assertEquals(Integer.valueOf(ID_EMPLOYE), employes.get(0).getIdEmploye());
		assertEquals(String.valueOf(PRENOM), employes.get(0).getPrenom());
		assertEquals(String.valueOf(FONCTION), employes.get(0).getFonction());
		assertEquals(Integer.valueOf(ANNEE_EXPERIENCE), employes.get(0).getAnneeExperience());
		assertEquals(String.valueOf(ADRESSE), employes.get(0).getAdresse());
		assertEquals(Integer.valueOf(SALAIRE), employes.get(0).getSalaire());
		
		assertEquals(Integer.valueOf(ID_EMPLOYE), employes.get(1).getIdEmploye());
		assertEquals(String.valueOf(PRENOM), employes.get(1).getPrenom());
		assertEquals(String.valueOf(FONCTION), employes.get(1).getFonction());
		assertEquals(Integer.valueOf(ANNEE_EXPERIENCE), employes.get(1).getAnneeExperience());
		assertEquals(String.valueOf(ADRESSE), employes.get(1).getAdresse());
		assertEquals(Integer.valueOf(SALAIRE), employes.get(1).getSalaire());
	}

}
