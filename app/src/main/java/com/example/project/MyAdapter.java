package com.example.project;

import android.content.Context;
import android.widget.BaseAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends FragmentPagerAdapter {
    public MyAdapter(@NonNull FragmentManager fm, Context context) {
        super(fm);
    }
    List<Fragment>myfragment=new ArrayList<>();
    List<String>titleList=new ArrayList<>();

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return myfragment.get(position);
    }

    @Override
    public int getCount() {
        return titleList.size();
    }

    public  void adder(Fragment fragment,String title){
        myfragment.add(fragment);
        titleList.add(title);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titleList.get(position);
    }
}
