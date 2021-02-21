package com.test.technique.dto;

import java.util.Date;

public class EmployeDTO {

	private Integer idEmploye;
	private String prenom;
	private String fonction;
	private Integer anneeExperience;
	private String adresse;
	private Integer salaire;
	private Date dateNaissance;

	/**
	 * @param idEmploye
	 * @param prenom
	 * @param fonction
	 * @param anneeExperience
	 * @param adresse
	 * @param salaire
	 * @param dateNaissance
	 */
	public EmployeDTO(Integer idEmploye, String prenom, String fonction, Integer anneeExperience, String adresse, Integer salaire,
			Date dateNaissance) {
		this.idEmploye = idEmploye;
		this.prenom = prenom;
		this.fonction = fonction;
		this.anneeExperience = anneeExperience;
		this.adresse = adresse;
		this.salaire = salaire;
		this.dateNaissance = dateNaissance;
	}

	/**
	 * 
	 */
	public EmployeDTO() {

	}

	/**
	 * @return the idEmploye
	 */
	public Integer getIdEmploye() {
		return idEmploye;
	}

	/**
	 * @param idemploye the idemploye to set
	 */
	public void setIdEmploye(Integer idEmploye) {
		this.idEmploye = idEmploye;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the fonction
	 */
	public String getFonction() {
		return fonction;
	}

	/**
	 * @param fonction the fonction to set
	 */
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	/**
	 * @return the anneeExperience
	 */
	public Integer getAnneeExperience() {
		return anneeExperience;
	}

	/**
	 * @param anneeExperience the anneeExperience to set
	 */
	public void setAnneeExperience(Integer anneeExperience) {
		this.anneeExperience = anneeExperience;
	}

	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * @return the salaire
	 */
	public Integer getSalaire() {
		return salaire;
	}

	/**
	 * @param salaire the salaire to set
	 */
	public void setSalaire(Integer salaire) {
		this.salaire = salaire;
	}

	/**
	 * @return the dateNaissance
	 */
	public Date getDateNaissance() {
		return dateNaissance;
	}

	/**
	 * @param dateNaissance the dateNaissance to set
	 */
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

}
