package com.example.david.practica2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class H2ContentActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    TextView user,email;
    ImageView photo;
    String us,mail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h2_content);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        TextView text1,text2;
        ImageView img;

        text1 = (TextView)findViewById(R.id.ltitle);
        text2 = (TextView)findViewById(R.id.linfo);
        img = (ImageView) findViewById(R.id.lpic);
        String pos = getIntent().getStringExtra("pos");
        switch (pos){
            case "0":
                text1.setText(getString(R.string.lhotel1));
                text2.setText(getString(R.string.linfo1));
                img.setImageResource(R.drawable.labohemia);
                break;
            case "1":
                text1.setText(getString(R.string.lhotel2));
                text2.setText(getString(R.string.linfo2));
                img.setImageResource(R.drawable.lasmananitas);
                break;
            case "2":
                text1.setText(getString(R.string.lhotel3));
                text2.setText(getString(R.string.linfo3));
                img.setImageResource(R.drawable.kachikine);
                break;
            case "3":
                text1.setText(getString(R.string.lhotel4));
                text2.setText(getString(R.string.linfo4));
                img.setImageResource(R.drawable.acuali);
                break;
        }


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        user = (TextView)findViewById(R.id.name);
        email = (TextView)findViewById(R.id.eMail);
        photo = (ImageView)findViewById(R.id.photo);
        us = getIntent().getStringExtra("user");
        mail = getIntent().getStringExtra("email");
        user.setText(getString(R.string.username)+": "+us);
        email.setText(getString(R.string.email)+": "+mail);
        photo.setImageResource(R.drawable.profile);
        return true;
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        switch (id){
            case R.id.main:
                Intent intent = new Intent(H2ContentActivity.this,MainDActivity.class);
                intent.putExtra("user", getIntent().getStringExtra("user"));
                intent.putExtra("pass", getIntent().getStringExtra("pass"));
                intent.putExtra("email", getIntent().getStringExtra("email"));
                intent.putExtra("ok","RESULT_OK");
                startActivity(intent);
                break;
            case R.id.mHotel:
                Intent intent2 = new Intent(H2ContentActivity.this,HotelDActivity.class);
                intent2.putExtra("user", getIntent().getStringExtra("user"));
                intent2.putExtra("pass", getIntent().getStringExtra("pass"));
                intent2.putExtra("email", getIntent().getStringExtra("email"));
                intent2.putExtra("ok","RESULT_OK");
                startActivity(intent2);
                break;
            case R.id.mHotel2:
                Intent intent22 = new Intent(H2ContentActivity.this,Hotel2Activity.class);
                intent22.putExtra("user", getIntent().getStringExtra("user"));
                intent22.putExtra("pass", getIntent().getStringExtra("pass"));
                intent22.putExtra("email", getIntent().getStringExtra("email"));
                intent22.putExtra("ok","RESULT_OK");
                startActivity(intent22);
                break;
            case R.id.mRest:
                Intent intent3 = new Intent(H2ContentActivity.this,RestaurantDActivity.class);
                intent3.putExtra("user", getIntent().getStringExtra("user"));
                intent3.putExtra("pass", getIntent().getStringExtra("pass"));
                intent3.putExtra("email", getIntent().getStringExtra("email"));
                intent3.putExtra("ok","RESULT_OK");
                startActivity(intent3);
                break;
            case R.id.mTuris:
                Intent intent4 = new Intent(H2ContentActivity.this,TouristDActivity.class);
                intent4.putExtra("user", getIntent().getStringExtra("user"));
                intent4.putExtra("pass", getIntent().getStringExtra("pass"));
                intent4.putExtra("email", getIntent().getStringExtra("email"));
                intent4.putExtra("ok","RESULT_OK");
                startActivity(intent4);
                break;
            case R.id.mSignout:
                Intent intent5 = new Intent(H2ContentActivity.this,LoginActivity.class);
                intent5.putExtra("user", getIntent().getStringExtra("user"));
                intent5.putExtra("pass", getIntent().getStringExtra("pass"));
                intent5.putExtra("email", getIntent().getStringExtra("email"));
                intent5.putExtra("ok","RESULT_OK");
                startActivity(intent5);
                break;
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
