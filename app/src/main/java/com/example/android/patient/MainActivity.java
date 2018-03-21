package com.example.android.patient;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button sg,lg,em;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sg=(Button)findViewById(R.id.b1);
        lg=(Button)findViewById(R.id.b2);
        em=(Button)findViewById(R.id.b3);

        sg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(MainActivity.this,signup_page.class);
                startActivity(intent1);
            }
        });
        lg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(MainActivity.this,loginpage.class);
                startActivity(intent2);
            }
        });

    }
}
