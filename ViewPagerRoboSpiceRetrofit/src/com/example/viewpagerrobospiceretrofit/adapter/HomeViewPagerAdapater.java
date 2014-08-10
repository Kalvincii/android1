package com.example.viewpagerrobospiceretrofit.adapter;

import com.example.viewpagerrobospiceretrofit.fragments.CategoryFragment;
import com.example.viewpagerrobospiceretrofit.fragments.OrderFragment;
import com.example.viewpagerrobospiceretrofit.fragments.ProductFragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class HomeViewPagerAdapater extends FragmentPagerAdapter {
	static final String[] titles = new String[]{"coucou", "def", "ok", "fe"};

	public HomeViewPagerAdapater(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int position) {
		switch (position) {
		case 0:
			return new ProductFragment();
			
			
		case 1:
			return new OrderFragment();
			
			
		case 2: 
			return new CategoryFragment();
			
		
		default:
			break;
		}
		return new ProductFragment();
	}

	@Override
	public int getCount() {
		return 4;
	}
	
	@Override
	public CharSequence getPageTitle(int position) {
		return titles[position];
	}

}
