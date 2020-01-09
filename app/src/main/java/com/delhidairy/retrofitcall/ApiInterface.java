package com.delhidairy.retrofitcall;

import com.delhidairy.model.DairyResponse;
import com.delhidairy.model.LoginRequest;
import com.delhidairy.model.LoginResponse;
import com.delhidairy.model.addaddress.AddAddressRequest;
import com.delhidairy.model.addaddress.AddAddressResponse;
import com.delhidairy.model.dairyNamemodel.DairyNameResponse;
import com.delhidairy.model.dairyallitemmodel.DairyAllItemResponse;
import com.delhidairy.model.getAddress.GetAddressRequest;
import com.delhidairy.model.getAddress.GetAddressResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiInterface {



 @POST("api/login.php")
 Call<LoginResponse>   login(@Body LoginRequest loginRequest);

 @GET ("api/read.php")
 Call<DairyAllItemResponse>  getAllProduct();


 @GET ("api/viewdairy.php")
 Call<DairyResponse>  getAllDairy();

 @GET ("https://primech.000webhostapp.com/api/viewdairy.php")
 Call<DairyNameResponse>  getAllDairyName();

 @POST ("https://primech.000webhostapp.com/api/billingaddres.php")
 Call<AddAddressResponse> addAddress(@Body AddAddressRequest addAddressRequest);

 @POST ("https://primech.000webhostapp.com/api/viewaddress.php")
 Call<GetAddressResponse> getAddress(@Body GetAddressRequest getAddressRequest);

}
