package com.delhidairy.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.delhidairy.R;

public class Activity_Token_Amount extends AppCompatActivity {

    private Button btnPay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_token_amount);

        btnPay = findViewById(R.id.btn_pay);

        btnPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent (Activity_Token_Amount.this, Activity_Confirmation.class);
                startActivity(intent);
                finish();

            }
        });

    }
}
