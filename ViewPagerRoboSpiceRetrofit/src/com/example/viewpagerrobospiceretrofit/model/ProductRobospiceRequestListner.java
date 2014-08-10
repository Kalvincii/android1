package com.example.viewpagerrobospiceretrofit.model;

import com.octo.android.robospice.persistence.exception.SpiceException;
import com.octo.android.robospice.request.listener.RequestListener;

public class ProductRobospiceRequestListner implements RequestListener<Product>{

	@Override
	public void onRequestFailure(SpiceException e) {
		
	}

	@Override
	public void onRequestSuccess(Product model) {
		
	}
	

}
