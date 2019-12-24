package com.delhidairy.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginResponse {

@SerializedName("message")
@Expose
private String message;
@SerializedName("jwt")
@Expose
private String jwt;

public String getMessage() {
return message;
}

public void setMessage(String message) {
this.message = message;
}

public String getJwt() {
return jwt;
}

public void setJwt(String jwt) {
this.jwt = jwt;
}

}