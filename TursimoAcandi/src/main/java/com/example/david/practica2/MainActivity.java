package com.example.david.practica2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.mProfile:
                Intent intent = new Intent(MainActivity.this,ProfileActivity.class);
                intent.putExtra("user", getIntent().getStringExtra("user"));
                intent.putExtra("pass", getIntent().getStringExtra("pass"));
                intent.putExtra("email", getIntent().getStringExtra("email"));
                intent.putExtra("ok","RESULT_OK");
                startActivity(intent);
                break;
            case R.id.mSignout:
                Intent intent2 = new Intent(MainActivity.this,LoginActivity.class);
                intent2.putExtra("user", getIntent().getStringExtra("user"));
                intent2.putExtra("pass", getIntent().getStringExtra("pass"));
                intent2.putExtra("email", getIntent().getStringExtra("email"));
                intent2.putExtra("ok","RESULT_OK");
                startActivity(intent2);
                break;
        }
        return true;
    }
    @Override
    public void onBackPressed() {
    }
}
