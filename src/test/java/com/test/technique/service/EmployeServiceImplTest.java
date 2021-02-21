package com.test.technique.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import com.test.technique.dao.EmployeRepository;
import com.test.technique.dto.EmployeDTO;
import com.test.technique.model.Employe;

/**
 * Classe de test du service employe
 * 
 *
 */
@Sql(scripts = "/scripts/01-script.sql", executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureDataJpa
public class EmployeServiceImplTest {

	@Autowired
	EmployeRepository employeRepository;

	@Autowired
	EmployeService employeService;

	private EmployeDTO employeDTO;
	private EmployeDTO employeDTO1;

	private static Integer ID_EMPLOYE = 1;
	private static String ADRESSE = "PARIS";
	private static Integer ANNEE_EXPERIENCE = 6;
	private static String FONCTION = "Consultant java jee";
	private static String PRENOM = "marwen";
	private static Integer SALAIRE = 2500;

	private static Integer ID_EMPLOYE1 = 2;
	private static String ADRESSE1 = "NANTES";
	private static Integer ANNEE_EXPERIENCE1 = 4;
	private static String FONCTION1 = "TESTEUR";
	private static String PRENOM1 = "asma";
	private static Integer SALAIRE1 = 2200;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		employeDTO = new EmployeDTO(ID_EMPLOYE, PRENOM, FONCTION, ANNEE_EXPERIENCE, ADRESSE, SALAIRE, null);
		employeDTO1 = new EmployeDTO(ID_EMPLOYE1, PRENOM1, FONCTION1, ANNEE_EXPERIENCE1, ADRESSE1, SALAIRE1, null);

	}

	/**
	 * Teste la validation du getAllEmploye
	 * {@link com.test.technique.service.impl.EmployeServiceImpl#getAllEmploye()}.
	 * pour le service et le repository
	 * 
	 * @throws Exception
	 */
	@Test
	public final void testGetAllEmploye() throws Exception {

		// Quand
		List<Employe> employeList = (List<Employe>) employeRepository.findAll();
		List<EmployeDTO> employeDtoList = employeService.getAllEmploye();

		// Alors
		assertThat(employeList.size()).isNotNull().isEqualTo(2);
		assertEquals(employeList.size(), employeDtoList.size());
	}

	/**
	 * Test la validation du getEmployeByIdEmploye pour la méthode du service
	 * employe
	 * {@link com.test.technique.servic.impl.EmployeServiceImpl#getEmployeByIdEmploye(Integer)}
	 * et la méthode du repository employe
	 * 
	 * @throws Exception
	 */
	@Test
	public final void testGetEmployeByIdEmploye() throws Exception {

		Integer id = 1;

		// Quand
		Optional<Employe> employe = employeRepository.findById(id);

		EmployeDTO employeDto = employeService.getEmployeByIdEmploye(id);

		// Alors
		assertThat(employe).isPresent().isNotNull();
		assertEquals(id, employe.get().getIdEmploye());
		assertEquals(employe.get().getIdEmploye(), employeDto.getIdEmploye());
		assertEquals(employe.get().getPrenom(), employeDto.getPrenom());
		assertEquals(employe.get().getFonction(), employeDto.getFonction());
		assertEquals(employe.get().getAnneeExperience(), employeDto.getAnneeExperience());
		assertEquals(employe.get().getAdresse(), employeDto.getAdresse());
		assertEquals(employe.get().getSalaire(), employeDto.getSalaire());
		assertEquals(employe.get().getDateNaissance(), employeDto.getDateNaissance());
	}

	/**
	 * Test le retour null du getEmployeById en cas d'id inexistant pour la méthode
	 * du service employe
	 * {@link com.test.technique.service.EmployeServiceImpl#getEmployeById(Integer)}
	 * et la méthode du repository employe
	 * 
	 * @throws Exception
	 */
	@Test
	public final void testEmployeById_Null() throws Exception {

		Integer idEmp = 5;

		// Quand
		Optional<Employe> employe = employeRepository.findById(idEmp);

		EmployeDTO employeDto = employeService.getEmployeByIdEmploye(idEmp);

		// Alors
		assertThat(employe).isEmpty();
		assertThat(employeDto).isNull();
	}

	/**
	 * Teste la validation du createEmploye pour la méthode du service employe
	 * {@link com.test.technique.serviceimpl.EmployeServiceImpl#createEmploye()}.
	 * et la méthode du repository type
	 * entite{@link employeRepository#createEmploye()}
	 * 
	 * @throws Exception
	 */
	@Test
	public final void testCreateEmploye() throws Exception {

		// Quand
		EmployeDTO employeResultat = employeService.createEmploye(employeDTO);

		// Alors
		assertThat(employeDTO.getIdEmploye()).isNotNull().isEqualTo(ID_EMPLOYE);
		assertEquals(employeDTO.getFonction(), employeResultat.getFonction());
		assertEquals(employeDTO.getAnneeExperience(), employeResultat.getAnneeExperience());
		assertEquals(employeDTO.getAdresse(), employeResultat.getAdresse());
		assertEquals(employeDTO.getSalaire(), employeResultat.getSalaire());
		assertEquals(employeDTO.getDateNaissance(), employeResultat.getDateNaissance());

	}

	/**
	 * Teste la validation du deleteEnfant pour la méthode du service type entite
	 * {@link com.test.technique.service.impl.EmployeServiceImpl#deleteEmploye()}.
	 * et la méthode du repository employe
	 * {@link EmployeRepository#deleteEmploye()}	
	 */
	@Test
	public final void testSupprimerEmploye() {

		employeService.deleteEmploye(ID_EMPLOYE);
		assertThat(employeDTO.getIdEmploye()).isNotNull().isEqualTo(ID_EMPLOYE);
	}

}
