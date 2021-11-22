package com.example.ck;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.ck.Adapter.RecentAdapter;
import com.example.ck.Adapter.TopPlacesAdapter;
import com.example.ck.model.RecentData;
import com.example.ck.model.RecentsData;
import com.example.ck.model.TopPlacesData;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private BottomNavigationView navigationView;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        navigationView= findViewById(R.id.bottom);
        viewPager= findViewById(R.id.view_pager);
        setUpViewpager();

        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {

                    case R.id.trang_chu:
                        viewPager.setCurrentItem(0);
                        break;
                    case R.id.ban_do:
                        viewPager.setCurrentItem(1);
                        break;
                    case R.id.khach_san:
                        viewPager.setCurrentItem(2);
                        break;
                    case R.id.ca_nhan:
                        viewPager.setCurrentItem(3);
                        break;
                }
                return true;
            }
        });
    }
    private void setUpViewpager(){
        ViewPagerAdapter viewPagerAdapter= new ViewPagerAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(viewPagerAdapter);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case 0:
                        navigationView.getMenu().findItem(R.id.trang_chu).setChecked(true);
                        break;
                    case 1:
                        navigationView.getMenu().findItem(R.id.ban_do).setChecked(true);
                        break;
                    case 2:
                        navigationView.getMenu().findItem(R.id.khach_san).setChecked(true);
                        break;
                    case 3:
                        navigationView.getMenu().findItem(R.id.ca_nhan).setChecked(true);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }



}