package com.delhidairy.adapter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.delhidairy.R;
import com.delhidairy.activities.CowMilkActivity;
import com.delhidairy.model.Record;
import com.delhidairy.utils.Constants;
import com.squareup.picasso.Picasso;

import java.util.List;

public class DairyAdapter extends RecyclerView.Adapter<DairyAdapter.ProgrammingViewholder> {

    Button btnTitle;

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

        Log.d("Init","onCreateViewHolder");

        return new ProgrammingViewholder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ProgrammingViewholder holder, int position) {
        Record records = data.get(position);
        holder.btnTitle.setText(records.getProductname());
        holder.btnTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(context, CowMilkActivity.class);
                context.startActivity(intent);
            }
        });
        Picasso.with(context).load(Constants.BASE_URL+records.getProductimage());
        Log.d("Init","onBindViewHolder");


    }

    @Override
    public int getItemCount() {

        Log.d("Init","getItemCount");

        if (data!=null){
            return data.size();
        }else{
            return 0;
        }
    }

    public void setTitle(String title) {
        this.data = data;
    }

    public void setRecords(List<Record> records) {
        this.data = records;
    }

    public class ProgrammingViewholder extends RecyclerView.ViewHolder{

        ImageView imgIcon;
        Button btnTitle;
        public ProgrammingViewholder(@NonNull View itemView) {
            super(itemView);

            imgIcon =(ImageView) itemView.findViewById(R.id.imgIcon);
            btnTitle = (Button) itemView.findViewById(R.id.btnTitle);

        }
    }
}


