package com.delhidairy.retrofitcall;

import com.delhidairy.model.LoginRequest;
import com.delhidairy.model.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiInterface {



 @POST("api/login.php")
 Call<LoginResponse>   login(@Body LoginRequest loginRequest);



}
