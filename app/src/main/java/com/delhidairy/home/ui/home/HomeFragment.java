package com.delhidairy.home.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.delhidairy.CowMilkActivity;
import com.delhidairy.ProductPage;
import com.delhidairy.R;

public class HomeFragment extends Fragment {
    private TextView deshimilk;
    private ImageView logodairy;
    private Button cowmilk, buffallomilk, chhach, ghee, curd, paneer;
    private SearchView search;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        initViews(root);
        return root;
    }

    private void initViews(View root) {
        logodairy = root.findViewById(R.id.iv_logo);
        deshimilk = root.findViewById(R.id.tv_deshimilk);
        search = root.findViewById(R.id.sv_search);
        cowmilk = root.findViewById(R.id.btn_cowmilk);
        buffallomilk = root.findViewById(R.id.btn_buffallo);
        chhach = root.findViewById(R.id.btn_chhach);
        ghee = root.findViewById(R.id.btn_ghee);
        curd = root.findViewById(R.id.btn_curd);
        paneer = root.findViewById(R.id.btn_paneer);

        cowmilk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(getActivity(), CowMilkActivity.class);
                startActivity(c);
            }
        });

    }
}