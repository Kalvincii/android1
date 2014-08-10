package com.example.viewpagerrobospiceretrofit.fragments;

import com.example.viewpagerrobospiceretrofit.R;
import com.example.viewpagerrobospiceretrofit.model.ProductRoboSpiceRequest;
import com.example.viewpagerrobospiceretrofit.model.ProductRobospiceRequestListner;
import com.octo.android.robospice.persistence.DurationInMillis;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ProductFragment extends BaseFragment implements BaseFragment.IRequest{
	public static final String TAG = "ProductFragment";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRetainInstance(true);
		performRequest();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		View v  = inflater.inflate(R.layout.product_fragment, null);
		return v;
	}


	@Override
	public void onActivityCreated(@Nullable Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
	}

	@Override
	public void onStart() {
		super.onStart();
	}

	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub
		super.onAttach(activity);
	}

	@Override
	public void performRequest() {
		ProductRoboSpiceRequest productRoboSpiceRequest = new ProductRoboSpiceRequest();
		getSpiceManager().execute(productRoboSpiceRequest, productRoboSpiceRequest.createCacheKey(),  DurationInMillis.ALWAYS_EXPIRED, new ProductRobospiceRequestListner());

	}

}
