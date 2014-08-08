package com.example.robospicev1;


import java.util.ArrayList;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.robospicev1.adapter.ListAdapter;
import com.example.robospicev1.model.Example;
import com.example.robospicev1.network.SampleRetrofitRequest;
import com.example.robospicev1.network.SampleRetrofitSpiceService;
import com.octo.android.robospice.SpiceManager;
import com.octo.android.robospice.persistence.DurationInMillis;
import com.octo.android.robospice.persistence.exception.SpiceException;
import com.octo.android.robospice.request.listener.RequestListener;

public class MyListFragment extends ListFragment{
	public static final String TAG = MyListFragment.class.getSimpleName();

	SpiceManager spiceManager = new SpiceManager(SampleRetrofitSpiceService.class);

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRetainInstance(true);
		performTask();
	}

	@Override
	public void onActivityCreated(@Nullable Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_list, container, false);
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
	}

	@Override
	public void onStart() {
		super.onStart();
		spiceManager.start(getActivity());

	}

	@Override
	public void onStop() {
		if(spiceManager.isStarted()){
			spiceManager.shouldStop();
		}
		super.onStop();
	}

	public SpiceManager getSpiceManager() {
		return spiceManager;
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		//outState.putParcelableArrayList("data", getSpiceManager().get);
	}
	
	

	private void performTask(){
		MyListFragment.this.getActivity().setProgressBarIndeterminateVisibility(true);
		SampleRetrofitRequest sampleRetrofitRequest = new SampleRetrofitRequest();
		getSpiceManager().execute(sampleRetrofitRequest, sampleRetrofitRequest.createCacheKey(), DurationInMillis.ALWAYS_EXPIRED, new LeadRequestListner());
	}

	private class LeadRequestListner implements RequestListener<Example>{

		@Override
		public void onRequestFailure(SpiceException e) {
			System.out.println(e.getMessage());
		}

		@Override
		public void onRequestSuccess(Example model) {
			ListAdapter listAdapter = new ListAdapter(getActivity(), 0, model.getEmployee());
			setListAdapter(listAdapter);
		}

	}

}
