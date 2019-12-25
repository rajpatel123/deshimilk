package com.delhidairy.model;

import android.icu.text.AlphabeticIndex;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Readresponse {

    @SerializedName("records")
    @Expose
    private List<AlphabeticIndex.Record> records = null;

    public List<AlphabeticIndex.Record> getRecords() {
        return records;
    }

    public void setRecords(List<AlphabeticIndex.Record> records) {
        this.records = records;
    }

}