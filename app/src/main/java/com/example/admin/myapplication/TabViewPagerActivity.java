package com.example.admin.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class TabViewPagerActivity extends AppCompatActivity {
    private TabLayout mTabLayout;
    private ViewPager mViewPager;

    private ViewFragmentPagerAdapter mViewFragmentPagerAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        inItView();
    }

    private void inItView() {
        mTabLayout = (TabLayout) findViewById(R.id.tab_demo);
        mViewPager = (ViewPager) findViewById(R.id.viewpager_demo);
        mViewFragmentPagerAdapter = new ViewFragmentPagerAdapter(getSupportFragmentManager());

        mViewPager.setAdapter(mViewFragmentPagerAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
    }
}
