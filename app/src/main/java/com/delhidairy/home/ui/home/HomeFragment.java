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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.delhidairy.R;

import com.delhidairy.adapter.DairyAdapter;

public class HomeFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        initViews(root);
        return root;

    }

    private void initViews(View root) {

        final RecyclerView productlist = (RecyclerView) root.findViewById(R.id.productlist);
        productlist.setLayoutManager(new LinearLayoutManager(getActivity()));
        String[] product = {"cowmilk", "buffalo", "chhach", "ghee", "paneer", "curd", "cheese"};
        productlist.setAdapter(new DairyAdapter(product));
    }
}