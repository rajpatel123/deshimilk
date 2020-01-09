package com.delhidairy.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginResponse {

@SerializedName("message")
@Expose
private String message;
@SerializedName("token")
@Expose
private String token;
@SerializedName("id")
@Expose
private String id;
@SerializedName("firstname")
@Expose
private String firstname;
@SerializedName("lastname")
@Expose
private String lastname;
@SerializedName("email")
@Expose
private String email;
@SerializedName("address")
@Expose
private String address;
@SerializedName("contactno")
@Expose
private String contactno;

public String getMessage() {
return message;
}

public void setMessage(String message) {
this.message = message;
}

public String getToken() {
return token;
}

public void setToken(String token) {
this.token = token;
}

public String getId() {
return id;
}

public void setId(String id) {
this.id = id;
}

public String getFirstname() {
return firstname;
}

public void setFirstname(String firstname) {
this.firstname = firstname;
}

public String getLastname() {
return lastname;
}

public void setLastname(String lastname) {
this.lastname = lastname;
}

public String getEmail() {
return email;
}

public void setEmail(String email) {
this.email = email;
}

public String getAddress() {
return address;
}

public void setAddress(String address) {
this.address = address;
}

public String getContactno() {
return contactno;
}

public void setContactno(String contactno) {
this.contactno = contactno;
}

}