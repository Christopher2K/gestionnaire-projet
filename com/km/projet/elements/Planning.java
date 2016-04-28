package com.km.projet.elements;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Auteur : Christopher
 * Date : 28 Avril 2016
 * Objet : Classe du planning pouvan être généré par tous les membres
 */
public class Planning
{
	/*
	 * Caractéristiques
	 */
	private String nom;
	private ArrayList<String> timeTable;

	/*
	 * Getters & Setters
	 */

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ArrayList<String> getTimeTable() {
		return timeTable;
	}

	public void setTimeTable(ArrayList<String> timeTable) {
		this.timeTable = timeTable;
	}
}
