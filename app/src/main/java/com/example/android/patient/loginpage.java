package com.example.android.patient;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class loginpage extends AppCompatActivity {


     TextView logt;
     EditText email,password;
     Button lg,forpass,signup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);

        logt=(TextView)findViewById(R.id.textView3);
        email=(EditText)findViewById(R.id.editText5);
        password=(EditText)findViewById(R.id.editText7);
        lg=(Button)findViewById(R.id.button2);
        forpass=(Button)findViewById(R.id.button4);
        signup=(Button)findViewById(R.id.button5);
        this.getIntent();

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(loginpage.this,signup_page.class);
                startActivity(intent);
            }
        });


    }
}
