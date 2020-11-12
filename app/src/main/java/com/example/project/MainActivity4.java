package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity4 extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        viewPager=findViewById(R.id.vpager);
        tabLayout=findViewById(R.id.tab1);
// btn1
        Intent intent1=getIntent();
        String s1=intent1.getStringExtra("kalama");
        String m1=intent1.getStringExtra("english");
        // send to data fragment1
        BlankFragment blankFragment11=new BlankFragment();
        Bundle bundle11=new Bundle();
        bundle11.putString("kalama",s1);
        blankFragment11.setArguments(bundle11);
        // send to data fragment2
        BlankFragment2 blankFragment21=new BlankFragment2();
        Bundle bundle21 =new Bundle();
        bundle21.putString("english",m1);
        blankFragment21.setArguments(bundle21);






        //Adapter

        MyAdapter myAdapter =new MyAdapter(getSupportFragmentManager(),getApplicationContext());
        myAdapter.adder(blankFragment11,"English");
        myAdapter.adder(blankFragment21,"Urdu");
        viewPager.setAdapter(myAdapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}