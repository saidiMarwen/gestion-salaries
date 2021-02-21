package com.test.technique.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.test.technique.controller.impl.EmployeControllerImpl;
import com.test.technique.dto.EmployeDTO;
import com.test.technique.service.EmployeService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeControllerImplTest {

	private MockMvc mockMvc;

	@Mock
	private EmployeService employeService;

	@InjectMocks
	private EmployeControllerImpl employeControllerImpl;

	// Objets DTO
	private EmployeDTO employeDto;
	private EmployeDTO employeDto1;
	private EmployeDTO employeDto2;

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
	 * 
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		mockMvc = MockMvcBuilders.standaloneSetup(employeControllerImpl).build();
		employeDto1 = new EmployeDTO(ID_EMPLOYE, PRENOM, FONCTION, ANNEE_EXPERIENCE, ADRESSE, SALAIRE, null);
		employeDto2 = new EmployeDTO(ID_EMPLOYE1, PRENOM1, FONCTION1, ANNEE_EXPERIENCE1, ADRESSE1, SALAIRE1, null);
	}
	
	/**
	 * Teste client erreur sur le mapping /entite pour {@link EmployeImpl}
	 * Check si aucune interaction sur les differents services du controller entite

	 * 
000	 * @throws Exception
	 */
	@Test
	public void testClientErrorStatutsEmployeControllerImpl() throws Exception {
		mockMvc.perform(get("/entite")).andExpect(status().is4xxClientError());
	}

}
