package com.delhidairy.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.delhidairy.R;
import com.delhidairy.home.DashBoardActivity;
import com.delhidairy.model.LoginRequest;
import com.delhidairy.model.LoginResponse;
import com.delhidairy.retrofitcall.RestClient;
import com.delhidairy.utils.Constants;
import com.delhidairy.utils.DairyPrefs;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ActivityLoginPage extends AppCompatActivity {
    private Button loginBtn;
    private EditText editemail, editpassword;
    private LinearLayout textsignup;

    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        loginBtn = findViewById(R.id.loginBtn);
        editemail = findViewById(R.id.et_email);
        editpassword = findViewById(R.id.et_password);
        textsignup = findViewById(R.id.llsignup);


        textsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityLoginPage.this, Activity_Singup.class);
                startActivity(intent);
                finish();
            }
        });


        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editemail.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "enter email address", Toast.LENGTH_SHORT).show();
                    return;
                } else if (!(editemail.getText().toString().matches(emailPattern))) {
                    Toast.makeText(getApplicationContext(), "Invalid email address", Toast.LENGTH_SHORT).show();
                    return;
                } else if (editpassword.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter password", Toast.LENGTH_SHORT).show();
                    return;
                }

                loginuser();
            }
        });
    }

    public void loginuser() {
        String userEmail = editemail.getText().toString().trim();
        String userPassword = editpassword.getText().toString().trim();


        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setEmail(userEmail);
        loginRequest.setPassword(userPassword);
        //loginRequest.setTocken("token");


        RestClient.loginUser(loginRequest, new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                if (response.body() != null) {
                    String token = response.body().getToken();

                    if (TextUtils.isEmpty(token)) {
                        Toast.makeText(ActivityLoginPage.this, "Invalid usename or password", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    Intent intent = new Intent(ActivityLoginPage.this, DashBoardActivity.class);
                    DairyPrefs.putBoolean(ActivityLoginPage.this, Constants.IS_LOGGED_IN, true);
                    startActivity(intent);
                    Toast.makeText(ActivityLoginPage.this, "success", Toast.LENGTH_SHORT).show();
                    finish();
                } else {
                    Toast.makeText(ActivityLoginPage.this, "Invalid usename or password", Toast.LENGTH_SHORT).show();

                }
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {

            }
        });

    }
}
