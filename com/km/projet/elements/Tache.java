package com.km.projet.elements;

import java.util.Date;

/**********
 *
 * @auteur :seraphin
 * date :28 avril 2016
 **/

public class Tache {
	/*
	 * Caractéristiques de la tâche
	 */
	private int id;
	private String nom;
	private int dureeHeure;
	private Double coutFinancier;
	private Date dateTot;
	private Date dateTard;


	/*
	 * Constructeur
	 */
	public Tache(String nom, int dureeHeure, Double coutFinancier, Date dateTot, Date dateTard) {
		this.nom = nom;
		this.dureeHeure = dureeHeure;
		this.coutFinancier = coutFinancier;
		this.dateTot = dateTot;
		this.dateTard = dateTard;
	}

	/*
	 * GETTERS & SETTERS
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getDureeHeure() {
		return dureeHeure;
	}

	public void setDureeHeure(int dureeHeure) {
		this.dureeHeure = dureeHeure;
	}

	public Double getCoutFinancier() {
		return coutFinancier;
	}

	public void setCoutFinancier(Double coutFinancier) {
		this.coutFinancier = coutFinancier;
	}

	public Date getDateTot() {
		return dateTot;
	}

	public void setDateTot(Date dateTot) {
		this.dateTot = dateTot;
	}

	public Date getDateTard() {
		return dateTard;
	}

	public void setDateTard(Date dateTard) {
		this.dateTard = dateTard;
	}
}