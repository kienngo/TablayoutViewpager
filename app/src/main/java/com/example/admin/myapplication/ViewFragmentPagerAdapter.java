package com.example.admin.myapplication;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewFragmentPagerAdapter extends FragmentPagerAdapter {
    private final int CASE_0 = 0;
    private final int CASE_1 = 1;
    private final int CASE_2 = 2;
    private final int TAB_NUMBER = 3;
    private final String TITLE_TAB = "PAGE ";

    public ViewFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case CASE_0:
                fragment = FragmentDemo.newInstance();
                break;
            case CASE_1:
                fragment = FragmentDemo.newInstance();
                break;
            case CASE_2:
                fragment = FragmentDemo.newInstance();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return TAB_NUMBER;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return TITLE_TAB + position;
    }
}
