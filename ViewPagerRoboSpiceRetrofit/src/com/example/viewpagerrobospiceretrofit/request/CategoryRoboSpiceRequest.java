package com.example.viewpagerrobospiceretrofit.request;

import com.example.viewpagerrobospiceretrofit.model.Category;
import com.example.viewpagerrobospiceretrofit.robospice.ApiService;
import com.octo.android.robospice.request.retrofit.RetrofitSpiceRequest;

public class CategoryRoboSpiceRequest extends RetrofitSpiceRequest<Category, ApiService>{

	public CategoryRoboSpiceRequest() {
		super(Category.class, ApiService.class);
	}

	@Override
	public Category loadDataFromNetwork() throws Exception {
		return getService().getListCategory();
	}
	
	public String createCacheKey(){
		return "CategoryKEY";
	}

}
