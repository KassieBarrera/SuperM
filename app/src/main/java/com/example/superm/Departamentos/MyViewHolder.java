package com.example.superm.Departamentos;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.superm.R;

public class MyViewHolder extends RecyclerView.ViewHolder {
    public ImageView logo;
    public TextView name;

    public MyViewHolder(View itemView) {
        super(itemView);
        logo = (ImageView)itemView.findViewById(R.id.ivLogo);
        name = (TextView)itemView.findViewById(R.id.tvCompany);
    }
}
