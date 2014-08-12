package com.example.viewpagerrobospiceretrofit.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.viewpagerrobospiceretrofit.R;
import com.example.viewpagerrobospiceretrofit.model.Category;
import com.example.viewpagerrobospiceretrofit.request.CategoryRoboSpiceRequest;
import com.octo.android.robospice.persistence.DurationInMillis;
import com.octo.android.robospice.persistence.exception.SpiceException;
import com.octo.android.robospice.request.listener.RequestListener;

public class CategoryFragment extends BaseFragment implements BaseFragment.IRequest{
	public static final String TAG = "CategoryFragment";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRetainInstance(true);
		performRequest();

	}

	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		View v  = inflater.inflate(R.layout.category_fragment, null);
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
		super.onAttach(activity);
	}
	
	@Override
	public void performRequest() {
		CategoryRoboSpiceRequest categoryRoboSpiceRequest = new CategoryRoboSpiceRequest();
		getSpiceManager().execute(categoryRoboSpiceRequest, categoryRoboSpiceRequest.createCacheKey(),  DurationInMillis.ONE_DAY, new CategoryRobospiceRequestListner());


	}

	public class CategoryRobospiceRequestListner implements RequestListener<Category>{


		public CategoryRobospiceRequestListner() {

		}

		@Override
		public void onRequestFailure(SpiceException e) {
			Log.e("ProductRobospiceRequestListner", e.getMessage());
		}

		@Override
		public void onRequestSuccess(Category model) {
			System.out.println(model.category);
			TextView tx = (TextView)getView().findViewById(R.id.textView1);
			tx.setText(model.category);
			Toast.makeText(getActivity(), model.category, Toast.LENGTH_LONG).show();
		}


	}

	
}
