package com.delhidairy.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.delhidairy.R;
import com.delhidairy.home.DashBoardActivity;

public class Activity_Confirmation extends AppCompatActivity {


    private Button buttonOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);

        buttonOk = findViewById(R.id.btn_ok);

        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_Confirmation.this, DashBoardActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
