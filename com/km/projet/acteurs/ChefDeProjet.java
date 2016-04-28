package com.km.projet.acteurs;

import com.km.projet.elements.Tache;

import java.util.Date;

/**
 * Auteur : Christopher
 * Date : 28 Avril 2016
 * Objet : Classe correspondant au chef de projet héritant de la classe acteur
 */

public class ChefDeProjet extends Acteur
{
	/*
	 * Appel du constructeur de la classe mère
	 */
	public ChefDeProjet(String c_nom, String c_prenom, Double c_salaire)
	{
		super(c_nom, c_prenom, c_salaire);
	}

	/*
	 * Actions du chef de projet
	 */
	public Tache creerTache()
	{
		Tache t = new Tache();
		//TODO Méthode de création de la tâche
	}

	public boolean supprimerTache(int id)
	{

	}

	public boolean addPrecedence(int target, int id)
	{

	}

	public boolean setCoutFinancier(Double coutFinancier)
	{

	}

	public boolean addLivrable(Livrable livrable)
	{

	}

	public boolean setControleur(ControleurDeTache cdt)
	{

	}

	public boolean setResponsable(ResponsableDeTache rdt)
	{

	}

	public boolean setEtatTache(int target, EtatTache etatTache)
	{

	}

	public boolean setDateProjet(Date debut, Date fin)
	{

	}
}

