package com.example.viewpagerrobospiceretrofit.robospice;

import com.octo.android.robospice.retrofit.RetrofitGsonSpiceService;

public class RobospiceService extends RetrofitGsonSpiceService{

	public static final String URL = "http://dwickrema.inetdev.fr/api";
	
	@Override
	public void onCreate() {
		super.onCreate();
		addRetrofitInterface(ApiService.class);
	}
	
	

	@Override
	protected String getServerUrl() {
		return URL;
	}

	

}
