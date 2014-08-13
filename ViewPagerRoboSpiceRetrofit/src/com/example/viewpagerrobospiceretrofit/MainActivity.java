package com.example.viewpagerrobospiceretrofit;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.example.viewpagerrobospiceretrofit.adapter.HomeViewPagerAdapater;
import com.example.viewpagerrobospiceretrofit.fragments.ProductFragment;
import com.viewpagerindicator.TitlePageIndicator;


public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager = (ViewPager)findViewById(R.id.pager);
        viewPager.setOffscreenPageLimit(4);
        HomeViewPagerAdapater homeViewPagerAdapater = new HomeViewPagerAdapater(getSupportFragmentManager());
        viewPager.setAdapter(homeViewPagerAdapater);
        TitlePageIndicator pageIndicator = (TitlePageIndicator)findViewById(R.id.title_indicator);
        pageIndicator.setViewPager(viewPager);
    }

}
