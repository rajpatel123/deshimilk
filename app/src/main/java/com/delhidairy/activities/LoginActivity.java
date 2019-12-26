package com.delhidairy.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.delhidairy.R;
import com.delhidairy.home.DashBoardActivity;
import com.delhidairy.utils.Constants;
import com.delhidairy.utils.DairyPrefs;

public class LoginActivity extends AppCompatActivity {
   private Button loginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginBtn = findViewById(R.id.loginBtn);


        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, DashBoardActivity.class);
                DairyPrefs.putBoolean(LoginActivity.this, Constants.IS_LOGGED_IN,true);
                startActivity(intent);
                finish();

            }
        });
    }
}
