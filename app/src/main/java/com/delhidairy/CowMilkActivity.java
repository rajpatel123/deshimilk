package com.delhidairy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CowMilkActivity extends AppCompatActivity {


    Button buttonDec, buttonInc;
    EditText txtCount;
    int count=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cow_milk);


         txtCount =(EditText) findViewById(R.id.et_number);
         buttonDec= (Button) findViewById(R.id.btnminus);
         buttonInc= (Button) findViewById(R.id.btnplush);

        buttonInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                txtCount.setText(String.valueOf(count));

            }
        });

        buttonDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

if(count<1)
    System.out.print(count=1);
                count--;
                txtCount.setText(String.valueOf(count));

            }
        });
    }

}




