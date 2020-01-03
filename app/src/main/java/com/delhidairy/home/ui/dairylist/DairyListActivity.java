package com.delhidairy.home.ui.dairylist;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.delhidairy.R;
import com.delhidairy.adapter.DairyListAdapter;
import com.delhidairy.model.DairyResponse;
import com.delhidairy.retrofitcall.RestClient;


import com.delhidairy.utils.DairyUtils;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;



public class DairyListActivity extends Fragment{

        private RecyclerView productlist1;
        DairyResponse dairyResponse = new DairyResponse();
        private DairyListAdapter adpter;

        public View onCreateView(@NonNull LayoutInflater inflater,
                                 ViewGroup container, Bundle savedInstanceState) {
            View root = inflater.inflate(R.layout.dairy_list_recycler, container, false);
            initViews(root);

            getAllProduct();
            return root;

        }


        private void initViews(View root) {

            productlist1 = root.findViewById(R.id.productlist1);
            productlist1.setLayoutManager(new GridLayoutManager(getActivity(), 2));
            productlist1.setHasFixedSize(true);
            adpter = new DairyListAdapter(dairyResponse.getRecords(), getActivity());
            productlist1.setAdapter(adpter);

            Log.d("Init", "Success");
        }


        private void getAllProduct() {

            if (DairyUtils.getConnectivityStatus(getActivity())) {
                DairyUtils.showProgress(getActivity(), "Please wait...", false);
                RestClient. getAllDairy(new Callback<DairyResponse>() {
                    @Override
                    public void onResponse(Call<DairyResponse> call, Response<DairyResponse> response) {
                        DairyUtils.dismissDialog();

                        if (response.body() != null) {
                            dairyResponse = response.body();
                            adpter.setRecords(dairyResponse.getRecords());
                            adpter.notifyDataSetChanged();
                        }
                    }

                    @Override
                    public void onFailure(Call<DairyResponse> call, Throwable t) {
                        DairyUtils.dismissDialog();
                    }


                });

            } else {
                Toast.makeText(getActivity(), getString(R.string.no_internet), Toast.LENGTH_LONG).show();
            }

        }

    }