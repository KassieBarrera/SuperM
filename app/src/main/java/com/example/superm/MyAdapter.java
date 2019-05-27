package com.example.superm;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.superm.Departamentos.Panaderia;

class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    static String[] companyList;
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

public static class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    ImageView logo;
    TextView name;
    Context context;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        logo = itemView.findViewById(R.id.ivLogo);
        name = itemView.findViewById(R.id.tvCompany);
        logo.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        context = v.getContext();
        int position = getAdapterPosition();
        Intent intent = new Intent(context, Panaderia.class);
        intent.putExtra("nombre", companyList[position]);
        context.startActivity(intent);
        }
    }
}

