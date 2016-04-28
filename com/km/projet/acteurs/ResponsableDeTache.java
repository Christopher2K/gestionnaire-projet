package com.km.projet.acteurs;

/**
 * Auteur : Christopher
 * Date : 28 Avril 2016
 * Objet : Classe correspondant au responsable de tâche héritant de la classe acteur
 */
public class ResponsableDeTache extends Acteur
{
	/*
	 * Appel du constructeur de la classe mère
	*/
	public ResponsableDeTache(String c_nom, String c_prenom, Double c_salaire)
	{
		super(c_nom, c_prenom, c_salaire);
	}

	/*
	 * Actions du responsable de tâche
	 */
	public boolean addIntervenant(Intervenant i)
	{

	}

	public boolean delIntervenant(Intervenant i)
	{

	}

	public boolean setEtatTache()
	{

	}

	public boolean changerEtatLivrable()
	{

	}
}
