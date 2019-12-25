package com.delhidairy.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.delhidairy.R;
import com.delhidairy.model.Record;
import com.delhidairy.utils.Constants;
import com.squareup.picasso.Picasso;

import java.util.List;

public class DairyAdapter extends RecyclerView.Adapter<DairyAdapter.ProgrammingViewholder> {

    Context context;
    private List<Record> data;

    public DairyAdapter(List<Record> data, Context context)
    {
        this.data = data;
        this.context = context;

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
        Record records = data.get(position);
        holder.txtTitle.setText(records.getProductname());
        Picasso.with(context).load(Constants.BASE_URL+records.getProductimage());


    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void setTitle(String title) {
        this.data = data;
    }

    public void setRecords(List<Record> records) {
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


