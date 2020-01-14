package com.delhidairy.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.viewpager.widget.ViewPager;

import com.delhidairy.R;
import com.delhidairy.adapter.CustomPagerWithoutTitleAdapter;
import com.delhidairy.databinding.ActivityProductDescriptionBinding;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class ProductDescriptionActivity extends AppCompatActivity {
    ActivityProductDescriptionBinding binding;
    CustomPagerWithoutTitleAdapter adapter;
    TextView textViewDescription;
    ImageView imageViewitem;
    RelativeLayout relativeLayout;

   private Button buttonDec, buttonInc;
    int currentPage = 0;
    Timer timer;
    final long DELAY_MS = 2000;//delay in milliseconds before task is to be executed
    final long PERIOD_MS = 3000; // time in milliseconds between successive task executions.
    private EditText txtCount;

    int count = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_product_description);

        buttonDec=  findViewById(R.id.btnminus);
        buttonInc=  findViewById(R.id.btnplush);
        txtCount =  findViewById(R.id.et_number);
        textViewDescription = findViewById(R.id.decsription);
        imageViewitem = findViewById(R.id.itemimage);

        relativeLayout = findViewById(R.id.relativelayouttext);


        setPagerAdapter();
        setPagerIndicator();


        Bundle bundle = getIntent().getExtras();
        final String author = bundle.getString("author");
        String imageitem = bundle.getString("des");
        String title = bundle.getString("title");
        String image = bundle.getString("image");


        Picasso.with(this).load(imageitem).into(imageViewitem);

        textViewDescription.setText(author);


        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProductDescriptionActivity.this,AddressForSubscriptionListActivity.class);
                startActivity(intent);
            }
        });

        buttonInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtCount.setText(String.valueOf(count));
                count++;

            }
        });
        buttonDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count<=0)
                    System.out.print(count=1);
                count--;
                txtCount.setText(String.valueOf(count));

            }
        });


    }

    private void setPagerIndicator() {
        ViewPager.LayoutParams layoutParams = new ViewPager.LayoutParams();
        layoutParams.width = ViewPager.LayoutParams.MATCH_PARENT;
        layoutParams.height = ViewPager.LayoutParams.WRAP_CONTENT;
        layoutParams.gravity = Gravity.BOTTOM;

        binding.indicator.setViewPager(binding.vpOnboard);
    }

    private void setPagerAdapter() {
        adapter = new CustomPagerWithoutTitleAdapter(this, getImages());
        binding.vpOnboard.setAdapter(adapter);
        binding.vpOnboard.setCurrentItem(0);
        binding.vpOnboard.setOffscreenPageLimit(3);
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {

                int NUM_PAGES = 3;
                if (currentPage == NUM_PAGES) {
                    currentPage = 0;
                }
                binding.vpOnboard.setCurrentItem(currentPage++, true);
            }
        };

        timer = new Timer(); // This will create a new Thread
        timer.schedule(new TimerTask() { // task to be scheduled
            @Override
            public void run() {
                handler.post(Update);
            }
        }, DELAY_MS, PERIOD_MS);
    }


    private ArrayList<Integer> getImages() {

        ArrayList imagesList = new ArrayList<Integer>();
        imagesList.add(R.drawable.milkimage);
        imagesList.add(R.drawable.milkimage);
        imagesList.add(R.drawable.milkimage);
        return imagesList;
    }


}








