package com.example.viewpagerrobospiceretrofit.fragments;

import com.example.viewpagerrobospiceretrofit.R;
import com.example.viewpagerrobospiceretrofit.model.Product;
import com.example.viewpagerrobospiceretrofit.request.ProductRoboSpiceRequest;
import com.octo.android.robospice.persistence.DurationInMillis;
import com.octo.android.robospice.persistence.exception.SpiceException;
import com.octo.android.robospice.request.listener.RequestListener;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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
	public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onViewCreated(view, savedInstanceState);

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
		getSpiceManager().execute(productRoboSpiceRequest, productRoboSpiceRequest.createCacheKey(),  DurationInMillis.ONE_DAY, new ProductRobospiceRequestListner());

	}

	public class ProductRobospiceRequestListner implements RequestListener<Product>{


		public ProductRobospiceRequestListner() {

		}

		@Override
		public void onRequestFailure(SpiceException e) {
			Log.e("ProductRobospiceRequestListner", e.getMessage());
		}

		@Override
		public void onRequestSuccess(Product model) {

		}


	}

}
