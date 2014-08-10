package com.example.viewpagerrobospiceretrofit.robospice;

import com.example.viewpagerrobospiceretrofit.model.Product;

public interface ApiService {

	public Product getListProduct();
	
	public void getListCategory();

	public void getListOrder();
}
