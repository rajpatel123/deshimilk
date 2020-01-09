package com.delhidairy.model.addaddress;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AddAddressRequest {

@SerializedName("fullname")
@Expose
private String fullname;
@SerializedName("email")
@Expose
private String email;
@SerializedName("contactno")
@Expose
private String contactno;
@SerializedName("address")
@Expose
private String address;
@SerializedName("landmark")
@Expose
private String landmark;
@SerializedName("city")
@Expose
private String city;
@SerializedName("userid")
@Expose
private String userid;

public String getFullname() {
return fullname;
}

public void setFullname(String fullname) {
this.fullname = fullname;
}

public String getEmail() {
return email;
}

public void setEmail(String email) {
this.email = email;
}

public String getContactno() {
return contactno;
}

public void setContactno(String contactno) {
this.contactno = contactno;
}

public String getAddress() {
return address;
}

public void setAddress(String address) {
this.address = address;
}

public String getLandmark() {
return landmark;
}

public void setLandmark(String landmark) {
this.landmark = landmark;
}

public String getCity() {
return city;
}

public void setCity(String city) {
this.city = city;
}

public String getUserid() {
return userid;
}

public void setUserid(String userid) {
this.userid = userid;
}

}