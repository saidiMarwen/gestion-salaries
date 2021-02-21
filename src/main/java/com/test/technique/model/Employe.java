package com.test.technique.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * The persistent class for the employe database table.
 * 
 */
@Entity
@Table(name = "Employe")
public class Employe implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_employe")
	@SequenceGenerator(name = "employe_id_seq_gen", sequenceName = "employe_id_seq")
	@GeneratedValue(generator = "employe_id_seq_gen")
	private Integer idEmploye;

	@Column(name = "prenom")
	private String prenom;

	@Column(name = "fonction")
	private String fonction;

	@Column(name = "annee_experience")
	private Integer anneeExperience;

	@Column(name = "adresse")
	private String adresse;

	@Column(name = "salaire")
	private Integer salaire;

	@Column(name = "date_naissance")
	private Date dateNaissance;

	public Employe() {
	}

	/**
	 * @param idemploye
	 * @param prenom
	 * @param fonction
	 * @param anneeExperience
	 * @param adresse
	 * @param salaire
	 * @param dateNaissance
	 */
	public Employe(Integer idEmploye, String prenom, String fonction, Integer anneeExperience, String adresse, Integer salaire,
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
	 * @return the idEmploye
	 */
	public Integer getIdEmploye() {
		return idEmploye;
	}

	/**
	 * @param idEmploye the idEmploye to set
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