package com.example.robospicev1.network;

import com.octo.android.robospice.retrofit.RetrofitGsonSpiceService;

public class SampleRetrofitSpiceService extends RetrofitGsonSpiceService{
	private static final String URL = "http://dwickrema.inetdev.fr/prestashop1.5.6.1/ci/index.php/api";
	
	@Override
	public void onCreate() {
		super.onCreate();
		addRetrofitInterface(ServiceList.class);
	}
	

	@Override
	protected String getServerUrl() {
		return URL;
	}

}
