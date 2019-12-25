package com.delhidairy.retrofitcall;

import com.delhidairy.model.LoginRequest;
import com.delhidairy.model.LoginResponse;

import retrofit2.Callback;

import okhttp3.Call;

public class RestClient {

    public static void loginUser(LoginRequest loginRequest, Callback<LoginResponse> callback){
        RetrofitClient.getClient().login(loginRequest).enqueue(callback);

    }

}
