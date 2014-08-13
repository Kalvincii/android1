package com.example.viewpagerrobospiceretrofit.robospice;

import retrofit.http.GET;


import com.example.viewpagerrobospiceretrofit.model.Menu;
import com.example.viewpagerrobospiceretrofit.model.Product;

public interface ApiService {

	@GET("/product.json")
	public Product getListProduct();
	
	  @GET("/category_list.json")
	  Menu getListCategory();

	public void getListOrder();
}
