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
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.delhidairy.R;
import com.delhidairy.activities.ProductDescriptionActivity;
import com.delhidairy.home.DashBoardActivity;
import com.delhidairy.home.ui.dairylist.DairyListActivity;
import com.delhidairy.home.ui.home.HomeFragment;
import com.delhidairy.model.Record;
import com.delhidairy.utils.Constants;
import com.squareup.picasso.Picasso;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.delhidairy.R;
import com.delhidairy.activities.ProductDescriptionActivity;
import com.delhidairy.model.Record;
import com.delhidairy.utils.Constants;
import com.squareup.picasso.Picasso;

import java.util.List;
import java.util.List;

public class DairyListAdapter  extends RecyclerView.Adapter<DairyListAdapter.ProgrammingViewholder> {





    TextView tvTitle;
    CardView cardView;

    Context context;
    private List<Record> data;

    public DairyListAdapter(List<Record> data, Context context)
    {
        this.data = data;
        this.context = context;

    }

    @NonNull
    @Override
    public ProgrammingViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.activity_dairy_list, parent, false);

        Log.d("Init","onCreateViewHolder");

        return new ProgrammingViewholder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ProgrammingViewholder holder, int position) {
        Record records = data.get(position);
        //holder.cardView.setText(records.getProductname());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(context, DairyListActivity.class);
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

        ImageView DairyimgIcon;
        TextView tvTitle;
        CardView cardView;
        public ProgrammingViewholder(@NonNull View itemView) {
            super(itemView);

            DairyimgIcon =(ImageView) itemView.findViewById(R.id.DairyimgIcon);
            tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);
            cardView = (CardView)  itemView.findViewById(R.id.cardView);

        }
    }
}
