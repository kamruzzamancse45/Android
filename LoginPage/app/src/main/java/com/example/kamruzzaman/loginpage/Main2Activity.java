package com.example.kamruzzaman.loginpage;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.BufferedReader;

public class Main2Activity extends AppCompatActivity {
    EditText edUserName, edPassword;
    Button btnsec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        edUserName = findViewById(R.id.userName);
        edPassword = findViewById(R.id.userPassword);
        btnsec = findViewById(R.id.btnregister);


        Intent in2 =getIntent();

        Intent in =getIntent();

        final String UNTValue = in.getExtras().getString("UserName");
        final String PTValue = in.getExtras().getString("password");

        btnsec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                BufferedReader input;

                String UserNamevalue = String.valueOf(edUserName.getText().toString());
                String Passwordvalue = String.valueOf(edPassword.getText().toString());

                if(String.valueOf(UserNamevalue).equals(null) && String.valueOf(Passwordvalue).equals(null)){

                    Intent in  = new Intent(getApplicationContext(),Main4Activity.class);
                    startActivity(in);
                }
                else {
                    Intent in2 = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(in2);
                }



            }
        });
    }
}
