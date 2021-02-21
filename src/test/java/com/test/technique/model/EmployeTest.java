package com.test.technique.model;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class EmployeTest {

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
	private static String PRENOM1 = "zayed";
	private static Integer SALAIRE1 = 2200;

	@Test
	public void testRefMediationTest_Settters() throws Exception {

//		String date = "1987-01-07";
//		String date1 ="1989-01-07";
//		
//		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
//		Date DATE_NAISSANCE = formatter.parse(date);
//		Date DATE_NAISSANCE1 = formatter.parse(date1);

		Employe employe = new Employe();
		Employe employe1 = new Employe(ID_EMPLOYE1, PRENOM1, FONCTION1, ANNEE_EXPERIENCE1, ADRESSE1, SALAIRE1,
				null);

		employe.setIdEmploye(ID_EMPLOYE);
		employe.setAdresse(ADRESSE);
		employe.setAnneeExperience(ANNEE_EXPERIENCE);
		employe.setFonction(FONCTION);
		employe.setPrenom(PRENOM);
		employe.setSalaire(SALAIRE);
		//employe.setDateNaissance(DATE_NAISSANCE);

		assertEquals(employe.getIdEmploye(), ID_EMPLOYE);
		assertEquals(employe.getAdresse(), ADRESSE);
		assertEquals(employe.getAnneeExperience(), ANNEE_EXPERIENCE);
		assertEquals(employe.getFonction(), FONCTION);
		assertEquals(employe.getPrenom(), PRENOM);
		assertEquals(employe.getSalaire(), SALAIRE);
	//	assertEquals(employe.getDateNaissance(), DATE_NAISSANCE);

		assertEquals(employe1.getIdEmploye(), ID_EMPLOYE1);
		assertEquals(employe1.getAdresse(), ADRESSE1);
		assertEquals(employe1.getAnneeExperience(), ANNEE_EXPERIENCE1);
		assertEquals(employe1.getFonction(), FONCTION1);
		assertEquals(employe1.getPrenom(), PRENOM1);
		assertEquals(employe1.getSalaire(), SALAIRE1);
		//assertEquals(employe1.getDateNaissance(), DATE_NAISSANCE1);

	}
}
