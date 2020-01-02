package com.delhidairy.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.delhidairy.R;
import com.delhidairy.home.DashBoardActivity;

public class ProductDescriptionActivity extends AppCompatActivity {


    private Button buttonDec, buttonInc;
    Button buttonenquiry;
    private EditText txtCount;

    int count=1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_description);


         txtCount =(EditText) findViewById(R.id.et_number);
         buttonDec= (Button) findViewById(R.id.btnminus);
         buttonInc= (Button) findViewById(R.id.btnplush);
         buttonenquiry = (Button) findViewById(R.id.btn_enquiry);




        buttonInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtCount.setText(String.valueOf(count));
                count++;

            }
        });

        buttonDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count<=0)
                    System.out.print(count=1);
                    count--;
                    txtCount.setText(String.valueOf(count));
            }
        });

        buttonenquiry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProductDescriptionActivity.this, Activity_Token_Amount.class);
                startActivity(intent);
                finish();

            }
        });
    }

}




