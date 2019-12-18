package com.delhidairy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.TextView;

public class ProductPage extends AppCompatActivity {

    TextView desimilk;
    ImageView logodairy;
    Button cowmilk, buffallomilk, chhach, ghee, curd, paneer;
    SearchView search;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_page);

        logodairy = findViewById(R.id.iv_logodairy);
        desimilk = findViewById(R.id.tv_desimilk);
        search = findViewById(R.id.sv_search);
        cowmilk = findViewById(R.id.btn_cowmilk);
        buffallomilk = findViewById(R.id.btn_buffallo);
        chhach = findViewById(R.id.btn_chhach);
        ghee = findViewById(R.id.btn_ghee);
        curd = findViewById(R.id.btn_curd);
        paneer = findViewById(R.id.btn_paneer);


    }
}
