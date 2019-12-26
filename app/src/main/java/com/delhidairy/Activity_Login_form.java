package com.delhidairy;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_Login_form extends AppCompatActivity {

    TextView login_signup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__login_form);

        login_signup = findViewById(R.id.login_signup);

        login_signup.setOnClickListener(new View.OnClickListener() {
            
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Activity_Login_form.this,Signup_Activity.class);
                startActivity(intent);
            }
        });
    }
}
