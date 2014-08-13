package com.example.viewpagerrobospiceretrofit.fragments;

import com.example.viewpagerrobospiceretrofit.robospice.RobospiceService;
import com.octo.android.robospice.SpiceManager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;

public class BaseFragment extends ListFragment{

	protected SpiceManager spiceManager = new SpiceManager(RobospiceService.class);
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
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
	
	public interface IRequest{
		public void performRequest();
	}
}
