package com.example.viewpagerrobospiceretrofit.robospice;

import retrofit.http.GET;

import com.example.viewpagerrobospiceretrofit.model.Category;
import com.example.viewpagerrobospiceretrofit.model.Product;

public interface ApiService {

	@GET("/product.json")
	public Product getListProduct();
	
	@GET("/category.json")
	public Category getListCategory();

	public void getListOrder();
}
