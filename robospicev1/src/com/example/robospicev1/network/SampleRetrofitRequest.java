package com.example.robospicev1.network;

import com.example.robospicev1.model.Example;
import com.octo.android.robospice.request.retrofit.RetrofitSpiceRequest;

public class SampleRetrofitRequest extends RetrofitSpiceRequest<Example, ServiceList>{

	public SampleRetrofitRequest() {
		super(Example.class, ServiceList.class);
	}

	@Override
	public Example loadDataFromNetwork() throws Exception {
		return getService().getLeads();
	}

	
	public String createCacheKey(){
		return "key";
	}
}
