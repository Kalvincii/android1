package com.example.viewpagerrobospiceretrofit.robospice;

import retrofit.http.GET;

import com.example.viewpagerrobospiceretrofit.model.Product;

public interface ApiService {

	@GET("/product.json")
	public Product getListProduct();
	
	public void getListCategory();

	public void getListOrder();
}
