package com.delhidairy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText name;
    EditText emailId;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    EditText mobileNumber;
    EditText address;
    EditText pincode;
    EditText quantity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btn_button1);
        name = findViewById(R.id.fname);
        emailId = findViewById(R.id.femail);
        mobileNumber = findViewById(R.id.fmob);
        address=findViewById(R.id.fadd);
        pincode=findViewById(R.id.fpin);
        quantity=findViewById(R.id.fquantity);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (name.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "enter  name", Toast.LENGTH_SHORT).show();
                }else if(name.getText().toString().length()<=3 && name.getText().toString().length()>=25) {
                    Toast.makeText(getApplicationContext(),"Invalid name",Toast.LENGTH_SHORT).show();
                }


               else if  (mobileNumber.getText().toString().isEmpty()) {
            Toast.makeText(getApplicationContext(), "enter valid mob no", Toast.LENGTH_SHORT).show();
            } else if (mobileNumber.getText().toString().length()!=10) {
            Toast.makeText(getApplicationContext(), "Invalid mobile no", Toast.LENGTH_SHORT).show();
            }

            else if (emailId.getText().toString().isEmpty()) {
            Toast.makeText(getApplicationContext(), "enter email address", Toast.LENGTH_SHORT).show();
            } else if (!(emailId.getText().toString().matches(emailPattern))) {
            Toast.makeText(getApplicationContext(), "Invalid email address", Toast.LENGTH_SHORT).show();
            }


            else if (address.getText().toString().isEmpty()) {
            Toast.makeText(getApplicationContext(), "enter your address", Toast.LENGTH_SHORT).show();
            }


            else if (pincode.getText().toString().isEmpty()) {
            Toast.makeText(getApplicationContext(), "enter valid pincode", Toast.LENGTH_SHORT).show();
            } else if (pincode.getText().toString().length()!=6) {
            Toast.makeText(getApplicationContext(), "Invalid pincode ", Toast.LENGTH_SHORT).show();
            }

            else  if (quantity.getText().toString().isEmpty()) {
            Toast.makeText(getApplicationContext(), "enter quamtity", Toast.LENGTH_SHORT).show();
            }


            }
        });


    }
}
