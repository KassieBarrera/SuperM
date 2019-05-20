package com.example.superm;


import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.superm.Departamentos.Panaderia;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Tab2 extends Fragment {
    RecyclerView rvMain;
    private GridLayoutManager mGridLayoutMgr;

    public Tab2() {


        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tab2, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        String[] lista = {"", "", "", ""};
        rvMain = (RecyclerView) view.findViewById(R.id.rvMain);
        Bitmap[] logos = new Bitmap[12];
        logos[0] = BitmapFactory.decodeResource(getResources(), R.drawable.panaderia);
        logos[1] = BitmapFactory.decodeResource(getResources(), R.drawable.belleza);
        logos[2] = BitmapFactory.decodeResource(getResources(), R.drawable.embutidos);
        logos[3] = BitmapFactory.decodeResource(getResources(), R.drawable.higiene);
        MyAdapter adapter = new MyAdapter(lista, logos);
        mGridLayoutMgr = new GridLayoutManager(
                getActivity(), 2, GridLayoutManager.VERTICAL, false);
        rvMain.setLayoutManager(mGridLayoutMgr);
        //rvMain.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        rvMain.setAdapter(adapter);


    }
}
