package com.delhidairy.model;



    import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

    public class Record1 {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("dairyname")
        @Expose
        private String dairyname;
        @SerializedName("ownername")
        @Expose
        private String ownername;
        @SerializedName("contactno")
        @Expose
        private String contactno;
        @SerializedName("email")
        @Expose
        private String email;
        @SerializedName("address")
        @Expose
        private String address;
        @SerializedName("pincode")
        @Expose
        private String pincode;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getDairyname() {
            return dairyname;
        }

        public void setDairyname(String dairyname) {
            this.dairyname = dairyname;
        }

        public String getOwnername() {
            return ownername;
        }

        public void setOwnername(String ownername) {
            this.ownername = ownername;
        }

        public String getContactno() {
            return contactno;
        }

        public void setContactno(String contactno) {
            this.contactno = contactno;
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

        public String getPincode() {
            return pincode;
        }

        public void setPincode(String pincode) {
            this.pincode = pincode;
        }

    }

