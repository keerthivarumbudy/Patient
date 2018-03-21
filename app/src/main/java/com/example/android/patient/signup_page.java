package com.example.android.patient;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class signup_page extends AppCompatActivity {

    private EditText userName, userPassword,userEmail,userNumber;
    private Button submit;
    private FirebaseAuth firath;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_page);
        setupViews();
        this.getIntent();

        firath =FirebaseAuth.getInstance();

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(validate()){
                    //upload data to the database
                    String user_email=userEmail.getText().toString().trim();
                    String password=userPassword.getText().toString().trim();
                    String number=userNumber.getText().toString().trim();

                    firath.createUserWithEmailAndPassword(user_email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                Toast.makeText(signup_page.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(signup_page.this ,loginpage.class));
                            } else {
                                Toast.makeText(signup_page.this, "Registration Unsuccessful", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            }
        });



    }
    private void setupViews() {
        userName = (EditText)findViewById(R.id.editText2);
        userPassword=(EditText)findViewById(R.id.editText3);
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
            result = true;
        }
        return result;
    }
}
