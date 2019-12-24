package com.delhidairy.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.delhidairy.R;

public class DairyAdapter extends RecyclerView.Adapter<DairyAdapter.ProgrammingViewholder> {


    private String[] data;

    public DairyAdapter(String[] data)
    {
        this.data = data;

    }

    @NonNull
    @Override
    public ProgrammingViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.activity_item_list_layout, parent, false);

        return new ProgrammingViewholder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ProgrammingViewholder holder, int position) {

        String title = data[position];
        holder.txtTitle.setText(title);


    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public void setTitle(String title) {
        this.data = data;
    }

    public class ProgrammingViewholder extends RecyclerView.ViewHolder{

        ImageView imgIcon;
        TextView txtTitle;
        public ProgrammingViewholder(@NonNull View itemView) {
            super(itemView);

            imgIcon =(ImageView) itemView.findViewById(R.id.imgIcon);
            txtTitle = (TextView) itemView.findViewById(R.id.txtTitle);

        }
    }
}


