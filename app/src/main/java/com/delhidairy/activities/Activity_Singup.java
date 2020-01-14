package com.delhidairy.activities;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.delhidairy.R;
import com.delhidairy.model.usercreate.Createrequest;
import com.delhidairy.utils.DairyUtils;

public class Activity_Singup extends AppCompatActivity {

    EditText editFirstName, editLastName, editEmailName, editEnterAddress, editMobile, editpassword;
    String name1, name2, emailId, address, Mobile, password;
    private Button submit, login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        editFirstName = findViewById(R.id.editFirstName);
        editLastName = findViewById(R.id.editLastName);
        editEmailName = findViewById(R.id.editEmailName);
        editEnterAddress = findViewById(R.id.editEnterAddress);
        editMobile = findViewById(R.id.editMobile);
        editpassword = findViewById(R.id.editpassword);


        submit = findViewById(R.id.btn_Submit);
        //   login = findViewById(R.id.btn_Login);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveUserdata();
            }
        });

    }

    private void saveUserdata() {

        name1 = editFirstName.getText().toString().trim();
        name2 = editLastName.getText().toString().trim();
        emailId = editEmailName.getText().toString().trim();
        address = editEnterAddress.getText().toString().trim();
        Mobile = editMobile.getText().toString().trim();
        password = editpassword.getText().toString().trim();

        if (TextUtils.isEmpty(name1.trim()) || name1.length() == 0) {
            editFirstName.setError("Please enter valid name!!");
            DairyUtils.displayToast(getApplicationContext(), "Please enter valid name!!");
            return;
        }
        if (TextUtils.isEmpty(name2.trim()) || name1.length() == 0) {
            editLastName.setError("Please enter valid name!!");
            DairyUtils.displayToast(getApplicationContext(), "Please enter valid name!!");
            return;
        }
        if (TextUtils.isEmpty(emailId.trim()) || emailId.length() == 0) {
            editEmailName.setError("Please enter valid email!!");
            DairyUtils.displayToast(getApplicationContext(), "Please enter valid email!!");
            return;
        }
        if (TextUtils.isEmpty(address.trim()) || address.length() == 0) {
            editEnterAddress.setError("Please enter valid address!!");
            DairyUtils.displayToast(getApplicationContext(), "Please enter valid address!!");
            return;
        }
        if (TextUtils.isEmpty(Mobile)) {

            editMobile.setError("Please enter valid mobile!!");

            return;

        }
        if (TextUtils.isEmpty(password)) {
            editpassword.setError("please correct password");
            return;
        }


        Createrequest addCreaterequest = new Createrequest();
        addCreaterequest.setFirstname(name1);
    }
}
