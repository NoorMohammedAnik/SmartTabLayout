package com.anik.smarttablayout;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


   //declaring objects
    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;


    //for set icon into tab items
    final int[] ICONS = new int[]{
            R.drawable.ic_home,
            R.drawable.ic_friends,
            R.drawable.ic_group
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
        adapter.AddFragment(new FirstFragment(), "Home");
        adapter.AddFragment(new SecondFragment(), "Friends");
        adapter.AddFragment(new ThirdFragment(), "Group");

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
