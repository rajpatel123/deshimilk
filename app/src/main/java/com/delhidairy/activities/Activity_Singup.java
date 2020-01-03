package com.delhidairy.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.delhidairy.R;

public class Activity_Singup extends AppCompatActivity {

    private Button submit, login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        submit = findViewById(R.id.btn_Submit);
        login = findViewById(R.id.btn_Login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_Singup.this, ActivityLoginPage.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
