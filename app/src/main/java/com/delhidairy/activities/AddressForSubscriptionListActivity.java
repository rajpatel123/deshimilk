package com.delhidairy.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.delhidairy.R;
import com.delhidairy.adapter.AddressListAdapter;
import com.delhidairy.model.getAddress.GetAddressRequest;
import com.delhidairy.model.getAddress.GetAddressResponse;
import com.delhidairy.model.getAddress.Record;
import com.delhidairy.retrofitcall.RestClient;
import com.delhidairy.utils.Constants;
import com.delhidairy.utils.DairyPrefs;
import com.delhidairy.utils.DairyUtils;
import com.delhidairy.utils.Util;

import java.io.IOException;
import java.util.List;


import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AddressForSubscriptionListActivity extends AppCompatActivity {


    RecyclerView recyclerView;

    AddressListAdapter addressListAdapter;
    TextView addAddress;


    String userId, amount, subscription_id, shippingCharge, totalDiscountGiven, totalADDDiscountGiven, couponValue, couponValueAdd, totalValue, plan_id, months, pack_key, order_id;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address_list);
        recyclerView = findViewById(R.id.recycler);
        addAddress = findViewById(R.id.addaddress);
        addAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddressForSubscriptionListActivity.this,PaymentAddressSaveActivity.class);
                startActivity(intent);
            }
        });


        getAddressData();

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setTitle("Address");
        }

    }


    @Override
    protected void onResume() {
        super.onResume();
        getAddressData();
    }


    private void getAddressData() {

        GetAddressRequest getAddressRequest = new GetAddressRequest();
        getAddressRequest.setUserid(Integer.parseInt(DairyPrefs.getString(AddressForSubscriptionListActivity.this, Constants.USER_ID)));
        Util.showProgressDialog(this);
        RestClient.addnewAddressget(getAddressRequest, new Callback<GetAddressResponse>() {
            @Override
            public void onResponse(Call<GetAddressResponse> call, Response<GetAddressResponse> response) {
            Util.dismissProgressDialog();
                if (response.body() != null) {
                    if (response.body().getRecords().size()>0) {
                        List<Record>records = response.body().getRecords();

                        if (response != null && response.body().getRecords().size() > 0) {
                            addressListAdapter = new AddressListAdapter(records, getApplicationContext());
                            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
                            recyclerView.setLayoutManager(layoutManager);
                            recyclerView.setItemAnimator(new DefaultItemAnimator());
                            recyclerView.setAdapter(addressListAdapter);
                        }

                    }


                }
            }

            @Override
            public void onFailure(Call<GetAddressResponse> call, Throwable t) {


                Toast.makeText(AddressForSubscriptionListActivity.this, "Response Failed", Toast.LENGTH_SHORT).show();
            }
        });
    }


}

