package com.delhidairy.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.delhidairy.R;
import com.delhidairy.model.LoginRequest;
import com.delhidairy.model.LoginResponse;
import com.delhidairy.retrofitcall.RestClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setEmail("atul@gmail.com");
        loginRequest.setPassword("000");


        RestClient.loginUser(loginRequest, new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {

                Log.d("Data",response.body().getMessage());

            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {

            }
        });

    }
}
