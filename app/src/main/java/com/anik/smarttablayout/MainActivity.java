package com.anik.smarttablayout;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;


    //for set icon into tab items
    final int[] ICONS = new int[]{
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout=(TabLayout)findViewById(R.id.tablayout);
        viewPager=(ViewPager)findViewById(R.id.viewpager);


        //create viewpageradaper class object
        ViewPagerAdapter adapter=new ViewPagerAdapter(getSupportFragmentManager());
        //adding fragments using adapter object
        adapter.AddFragment(new FirstFragment(), "First Fragment");
        adapter.AddFragment(new SecondFragment(), "Second Fragment");
        adapter.AddFragment(new ThirdFragment(), "Third Fragment");

        //set adapter into viewpager
        viewPager.setAdapter(adapter);

        //set viewpager into tablayout
        tabLayout.setupWithViewPager(viewPager);

        //set icon to tab items
        tabLayout.getTabAt(0).setIcon(ICONS[0]);
        tabLayout.getTabAt(1).setIcon(ICONS[1]);
        tabLayout.getTabAt(2).setIcon(ICONS[2]);


    }
}
