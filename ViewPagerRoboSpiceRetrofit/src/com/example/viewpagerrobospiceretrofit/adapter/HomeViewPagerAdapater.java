package com.example.viewpagerrobospiceretrofit.adapter;


import com.example.viewpagerrobospiceretrofit.fragments.CategoryListFragment;
import com.example.viewpagerrobospiceretrofit.fragments.OrderFragment;
import com.example.viewpagerrobospiceretrofit.fragments.ProductFragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class HomeViewPagerAdapater extends FragmentPagerAdapter {
	static final String[] titles = new String[]{"coucou", "def", "ok", "fe"};
	FragmentManager fm;
	
	public HomeViewPagerAdapater(FragmentManager fm) {
		super(fm);
		this.fm = fm;
	}

	@Override
	public Fragment getItem(int position) {
		switch (position) {
		case 0:
	        ProductFragment cat = (ProductFragment)fm.findFragmentByTag(ProductFragment.TAG);
			return new ProductFragment();
			
			
		case 1:
			return new CategoryListFragment();
			
			
			
		case 2: 
			return new OrderFragment();
			
		
		default:
			return new ProductFragment();
		}
		
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
