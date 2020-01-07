package com.delhidairy.model.getAddress;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetAddressRequest {

@SerializedName("userid")
@Expose
private Integer userid;

public Integer getUserid() {
return userid;
}

public void setUserid(Integer userid) {
this.userid = userid;
}

}