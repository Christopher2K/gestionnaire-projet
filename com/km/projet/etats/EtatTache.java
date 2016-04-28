package com.km.projet.etats;

/**
 * Auteur : Christopher
 * Date : 28 Avril 2016
 * Objet : Enumération des états de tache possibles
 */
public enum EtatTache
{
	EN_ATTENTE(1, "La tâche est en attente, elle n'a pas encore commencé."),
	DEBUTEE(2, "La tâche a été débutée, les livrables sont en cours de production."),
	VALIDEE(3, "La tâche a été validée et les livrables livrés."),
	TERMINEE(0, "La tâche est terminée.");

	private int 	id;
	private String 	description;

	EtatTache(int c_id, String c_description)
	{
		this.id 			= c_id;
		this.description 	= c_description;
	}

	public String getDescription()
	{
		return this.description;
	}
}
