package com.km.projet.acteurs;

/**
 * Auteur : Christopher
 * Date : 28 Avril 2016
 * Objet : Classe correspondant au controleur de tâche héritant de la classe acteur
 */
public class ControleurDeTache extends Acteur
{
	/*
	 * Appel du constructeur de la classe mère
	 */
	public ControleurDeTache(String c_nom, String c_prenom, Double c_salaire)
	{
		super(c_nom, c_prenom, c_salaire);
	}

	/*
	 * Actions du controleur de tâche
	 */
	public boolean validerTache()
	{

	}
}
