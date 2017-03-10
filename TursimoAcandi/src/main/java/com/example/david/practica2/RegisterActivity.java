package com.example.david.practica2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    EditText user,pass,cpass,mail;
    Button reg,cancel;

    String uid,pw,cpw,em;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        user = (EditText)findViewById(R.id.eUserR);
        pass = (EditText)findViewById(R.id.ePassR);
        cpass = (EditText)findViewById(R.id.eRPass);
        mail = (EditText)findViewById(R.id.eMail);
        reg = (Button)findViewById(R.id.bReg);
        cancel = (Button)findViewById(R.id.bCancel);

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uid = user.getText().toString();
                pw = pass.getText().toString();
                cpw = cpass.getText().toString();
                em = mail.getText().toString();
                if(!(pw.equals(""))&&!(cpw.equals(""))&&!(uid.equals(""))&&!(em.equals(""))){
                    if(pw.equals(cpw)) {
                        Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                        intent.putExtra("user", uid);
                        intent.putExtra("pass", cpw);
                        intent.putExtra("email", em);
                        intent.putExtra("ok","RESULT_OK");
                        Toast.makeText(getApplicationContext(),R.string.treg,Toast.LENGTH_SHORT).show();
                        startActivity(intent);
                    }
                    else{
                        Toast.makeText(getApplicationContext(),R.string.tpassm,Toast.LENGTH_SHORT).show();
                        pass.setText("");
                        cpass.setText("");
                    }
                }
                else {
                    Toast.makeText(getApplicationContext(),R.string.tempty,Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
    @Override
    public void onBackPressed() {
    }


}
