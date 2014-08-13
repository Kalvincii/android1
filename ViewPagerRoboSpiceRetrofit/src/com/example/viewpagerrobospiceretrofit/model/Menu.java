package com.example.viewpagerrobospiceretrofit.model;

import java.util.ArrayList;
import java.util.List;


import com.google.gson.annotations.Expose;

public class Menu {

	@Expose
	private List<Category> category = new ArrayList<Category>();

	public List<Category> getCategory() {
		return category;
	}

	public void setCategory(List<Category> category) {
		this.category = category;
	}

	public Menu withCategory(List<Category> category) {
		this.category = category;
		return this;
	}

}