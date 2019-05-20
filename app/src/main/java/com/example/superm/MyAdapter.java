package com.example.superm;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.superm.Departamentos.MyViewHolder;

class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    String[] companyList;
    Bitmap[] logoList;

    private Context context;

    public MyAdapter(String[] companyList, Bitmap[] logoList) {
        this.companyList = companyList;
        this.logoList = logoList;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.logo.setImageBitmap(logoList[position]);
        holder.logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Esto es " + companyList[position], Toast.LENGTH_SHORT).show();
            }

        });
        holder.name.setText(companyList[position]);
    }

    @Override
    public int getItemCount() {
        return companyList.length;
    }


}

