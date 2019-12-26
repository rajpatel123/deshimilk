package com.delhidairy.retrofitcall;

import com.delhidairy.model.LoginRequest;
import com.delhidairy.model.LoginResponse;
import com.delhidairy.model.Readresponse;

import retrofit2.Callback;

import okhttp3.Call;

public class RestClient {

    public static void loginUser(LoginRequest loginRequest, Callback<LoginResponse> callback){
        RetrofitClient.getClient().login(loginRequest).enqueue(callback);

    }



    public static void getAllProduct(Callback<Readresponse> callback){
        RetrofitClient.getClient().getAllProduct().enqueue(callback);

    }

}
