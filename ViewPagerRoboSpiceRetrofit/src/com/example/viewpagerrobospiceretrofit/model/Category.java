package com.example.viewpagerrobospiceretrofit.model;

import com.google.gson.annotations.Expose;

public class Category {

	@Expose
	private String nom;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Category withNom(String nom) {
		this.nom = nom;
		return this;
	}

}