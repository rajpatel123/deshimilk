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

public class ActivityLoginPage extends AppCompatActivity {
   private Button loginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        loginBtn = findViewById(R.id.loginBtn);


        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityLoginPage.this, DashBoardActivity.class);
                DairyPrefs.putBoolean(ActivityLoginPage.this, Constants.IS_LOGGED_IN,true);
                startActivity(intent);
                finish();

            }
        });
    }
}
