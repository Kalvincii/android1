package com.example.robospicev1;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.view.View.OnClickListener;


public class MainActivity extends FragmentActivity {
	FragmentManager fragmentManager;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		fragmentManager =  getSupportFragmentManager();
		findViewById(R.id.button1).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				MyListFragment myListFragment = (MyListFragment) fragmentManager.findFragmentByTag(MyListFragment.TAG);
				if(myListFragment == null){
					myListFragment = new MyListFragment();
					fragmentManager.beginTransaction().add(R.id.container, myListFragment, MyListFragment.TAG).addToBackStack(null).commit();
				}

			}
		});


	}

}
