package com.km.projet.acteurs;

/**
 * Auteur : Christopher
 * Date : 28 Avril 2016
 * Objet : Classe abstraites représentant les comportements en commun des acteurs
 */
abstract public class Acteur
{
	/*
	 * Attributs
	 */
	protected String nom;
	protected String prenom;
	protected Double salaireHeure;

	/*
	 * Constructeur
	 */

	public Acteur(String c_nom, String c_prenom, Double c_salaire)
	{
		this.setNom(c_nom);
		this.setPrenom(c_prenom);
		this.setSalaireHeure(c_salaire);
	}

	/*
	 * GETTERS & SETTER
	 */
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Double getSalaireHeure() {
		return salaireHeure;
	}

	public void setSalaireHeure(Double salaireHeure) {
		this.salaireHeure = salaireHeure;
	}

	/*
	 * Méthodes de classe
	 */
	public void genererPlanning()
	{
		//TODO à compléter méthode de génération de planning || N'EST PAS UN VOID ||
	}
}
