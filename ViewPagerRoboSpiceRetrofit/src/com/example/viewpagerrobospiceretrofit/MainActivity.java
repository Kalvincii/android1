package com.example.viewpagerrobospiceretrofit;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.example.viewpagerrobospiceretrofit.adapter.HomeViewPagerAdapater;
import com.example.viewpagerrobospiceretrofit.fragments.CategoryFragment;
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


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
