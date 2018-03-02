package com.example.android.patient;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signup_page extends AppCompatActivity {

    private EditText userName, userPassword,userEmail,userNumber;
    private Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_page);
        setupViews();

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(validate()){
                    //upload data to the database
                }
            }
        });



    }
    private void setupViews() {
        userName = (EditText)findViewById(R.id.editText2);
        userPassword=(EditText)findViewById(R.id.);
        userEmail = (EditText)findViewById(R.id.editText);
        submit = (Button)findViewById(R.id.button);

    }

    private Boolean validate(){
        Boolean result = false;

        String name = userName.getText().toString();
        String password = userPassword.getText().toString();
        String email = userEmail.getText().toString();
        String nnumber = userNumber.getText().toString();

        if(name.isEmpty() && password.isEmpty() && email.isEmpty() && nnumber.isEmpty()){
            Toast.makeText(this, "Please enter all details", Toast.LENGTH_SHORT ).show();
        }else{
            result = True;
        }
        return result;
    }
}
