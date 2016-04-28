package com.km.projet.etats;

/**
 * Auteur : Christopher
 * Date : 28 Avril 2016
 * Objet : Enumeration des etats de livrables possibles
 */
public enum EtatLivrable
{
	EN_COURS(1, "La production du livrable est en cours."),
	LIVRE(0, "La production du livrable a été terminée. Il est désormais livré.");

	private int 	id;
	private String 	description;

	EtatLivrable(int c_id, String c_description)
	{
		this.id 			= c_id;
		this.description 	= c_description;
	}

	public String getDescription()
	{
		return this.description;
	}
}
