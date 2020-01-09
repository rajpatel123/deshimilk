package com.delhidairy.adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.delhidairy.R;

public class ProductDescriptionItem extends RecyclerView.Adapter<ProductDescriptionItem.MyViewHolder> {
    @NonNull
    @Override
    public ProductDescriptionItem.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.description_product_item, parent, false);



        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductDescriptionItem.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
