package com.example.david.practica2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText user,pass;
    String us,pw,mail,okay,en ="RESULT_OK";
    Button login;
    TextView reg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        user = (EditText) findViewById(R.id.eUser);
        pass = (EditText) findViewById(R.id.ePass);
        login = (Button) findViewById(R.id.bLog);
        reg = (TextView) findViewById(R.id.tReg);


        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });

        us = getIntent().getStringExtra("user");
        pw = getIntent().getStringExtra("pass");
        mail = getIntent().getStringExtra("email");
        okay = getIntent().getStringExtra("ok");
        if(en.equals(okay)){
            reg.setVisibility(View.INVISIBLE);
        }
        user.setText(us);
        pass.setText(pw);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,MainDActivity.class);
                if (user.getText().toString().equals(getIntent().getStringExtra("user"))){
                    if(pass.getText().toString().equals(getIntent().getStringExtra("pass"))){
                        intent.putExtra("user", us);
                        intent.putExtra("pass", pw);
                        intent.putExtra("email", mail);
                        intent.putExtra("ok","RESULT_OK");
                        startActivity(intent);
                    }
                    else if(pass.getText().toString().equals("")){
                        Toast.makeText(getApplicationContext(),R.string.tempty,Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(),R.string.twpass,Toast.LENGTH_SHORT).show();
                    }
                }
                else if(user.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(),R.string.tempty,Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),R.string.twuser,Toast.LENGTH_SHORT).show();
                }
            }
        });

    }


    @Override
    public void onBackPressed() {
    }



}
