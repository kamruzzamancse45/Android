package com.example.kamruzzaman.loginpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView reg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         btn = findViewById(R.id.btnSubmit);
         reg = findViewById(R.id.register);




        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getApplicationContext(),Main3Activity.class);


                startActivity(in);

            }
        });



        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pp = new Intent(getApplicationContext(),Main2Activity.class);

                startActivity(pp);
            }
        });
    }
}
