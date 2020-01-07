package com.delhidairy.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.delhidairy.R;
import com.delhidairy.model.getAddress.Record;

import java.util.List;


public class AddressListAdapter extends RecyclerView.Adapter<AddressListAdapter.MyViewHolder> {


    private Context applicationContext;
    private List<Record> addreseListData;






    public AddressListAdapter(List<Record> addreseListData,Context applicationContext) {
        this.applicationContext = applicationContext;
        this.addreseListData = addreseListData;
    }

    public void setAddreseList(List<Record> addreseList) {
        this.addreseListData = addreseList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.recycler_address_data, viewGroup, false);
        return new AddressListAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int i) {

        Record addreseList=addreseListData.get(i);

        if (addreseList.getAddress() != null) {
            holder.textViewName.setText("" + addreseList.getFullname());
        }
        if (addreseList.getEmail() != null) {
            holder.textViewEmail.setText("" + addreseList.getEmail());
        }
        if (addreseList.getContactno() != null) {
            holder.textViewMobile.setText("" + addreseList.getContactno());
        }
        if (addreseList.getCity() != null) {
            holder.textViewCity.setText("" + addreseList.getCity());
        }
        if (addreseList.getLandmark() != null) {
            holder.textViewState.setText("" + addreseList.getLandmark());
        }




    }




    @Override
    public int getItemCount() {
        if (addreseListData != null && addreseListData.size() > 0) {
            return addreseListData.size();
        } else {
            return 0;
        }

    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textViewName;

        TextView textViewEmail;


        TextView textViewMobile;

        TextView textViewState;





        TextView textViewCity;




        public MyViewHolder(View view) {
            super(view);

            textViewName = view.findViewById(R.id.txt_address_name);
            textViewCity = view.findViewById(R.id.txt_address_city);
            textViewEmail=view.findViewById(R.id.txt_address_email);
            textViewMobile= view.findViewById(R.id.txt_address_mobile);
            textViewState=view.findViewById(R.id.txt_address_state);
           return;
        }
    }




}
