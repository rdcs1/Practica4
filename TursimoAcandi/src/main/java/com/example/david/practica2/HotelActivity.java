package com.example.david.practica2;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

public class HotelActivity extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hotel, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        switch (id){
            case R.id.main:
                Intent intent = new Intent(HotelActivity.this,MainActivity.class);
                intent.putExtra("user", getIntent().getStringExtra("user"));
                intent.putExtra("pass", getIntent().getStringExtra("pass"));
                intent.putExtra("email", getIntent().getStringExtra("email"));
                intent.putExtra("ok","RESULT_OK");
                startActivity(intent);
                break;
            case R.id.mProfile:
                Intent intent2 = new Intent(HotelActivity.this,ProfileActivity.class);
                intent2.putExtra("user", getIntent().getStringExtra("user"));
                intent2.putExtra("pass", getIntent().getStringExtra("pass"));
                intent2.putExtra("email", getIntent().getStringExtra("email"));
                intent2.putExtra("ok","RESULT_OK");
                startActivity(intent2);
                break;
            case R.id.mRest:
                Intent intent3 = new Intent(HotelActivity.this,RestaurantActivity.class);
                intent3.putExtra("user", getIntent().getStringExtra("user"));
                intent3.putExtra("pass", getIntent().getStringExtra("pass"));
                intent3.putExtra("email", getIntent().getStringExtra("email"));
                intent3.putExtra("ok","RESULT_OK");
                startActivity(intent3);
                break;
            case R.id.mTuris:
                Intent intent4 = new Intent(HotelActivity.this,TuristicActivity.class);
                intent4.putExtra("user", getIntent().getStringExtra("user"));
                intent4.putExtra("pass", getIntent().getStringExtra("pass"));
                intent4.putExtra("email", getIntent().getStringExtra("email"));
                intent4.putExtra("ok","RESULT_OK");
                startActivity(intent4);
                break;
            case R.id.mSignout:
                Intent intent5 = new Intent(HotelActivity.this,LoginActivity.class);
                intent5.putExtra("user", getIntent().getStringExtra("user"));
                intent5.putExtra("pass", getIntent().getStringExtra("pass"));
                intent5.putExtra("email", getIntent().getStringExtra("email"));
                intent5.putExtra("ok","RESULT_OK");
                startActivity(intent5);
                break;
        }
        return true;
    }


    public class PagerAdapter extends FragmentPagerAdapter{

        public PagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return null;
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return super.getPageTitle(position);
        }
    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            switch (position){
                case 0: Hotel1 tab1 = new Hotel1();
                    return tab1;
                case 1: Hotel2 tab2 = new Hotel2();
                    return tab2;
                case 2: Hotel3 tab3 = new Hotel3();
                    return tab3;
                default: return null;
            }
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return getString(R.string.hotel1);
                case 1:
                    return getString(R.string.hotel2);
                case 2:
                    return getString(R.string.hotel3);
            }
            return null;
        }
    }
}
