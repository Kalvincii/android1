package com.example.viewpagerrobospiceretrofit.request;

import com.example.viewpagerrobospiceretrofit.model.Product;
import com.example.viewpagerrobospiceretrofit.robospice.ApiService;
import com.octo.android.robospice.request.retrofit.RetrofitSpiceRequest;

public class ProductRoboSpiceRequest extends RetrofitSpiceRequest<Product, ApiService>{
	
	public ProductRoboSpiceRequest() {
		super(Product.class, ApiService.class);
	}

	@Override
	public Product loadDataFromNetwork() throws Exception {
		return getService().getListProduct();
	}
	
	public String createCacheKey(){
		return "ProductKEY";
	}
	
}
