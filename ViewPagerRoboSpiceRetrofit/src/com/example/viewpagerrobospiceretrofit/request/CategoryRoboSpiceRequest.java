package com.example.viewpagerrobospiceretrofit.request;




import com.example.viewpagerrobospiceretrofit.model.Menu;
import com.example.viewpagerrobospiceretrofit.robospice.ApiService;
import com.octo.android.robospice.request.retrofit.RetrofitSpiceRequest;

public class CategoryRoboSpiceRequest extends RetrofitSpiceRequest<Menu, ApiService>{

	public CategoryRoboSpiceRequest() {
		super(Menu.class, ApiService.class);
	}

	@Override
	public Menu loadDataFromNetwork() throws Exception {
		return getService().getListCategory();
	}
	
	public String createCacheKey(){
		return "CategoryKEY";
	}

}
