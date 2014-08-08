package com.example.robospicev1.model;

import com.google.gson.annotations.Expose;

public class Employee {

	@Expose
	private String nom;
	@Expose
	private String prenom;

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

}


