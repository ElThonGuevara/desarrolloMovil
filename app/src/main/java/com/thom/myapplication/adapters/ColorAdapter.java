package com.thom.myapplication.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.thom.myapplication.R;
import com.thom.myapplication.clases.Color;

import java.util.List;

public class ColorAdapter extends RecyclerView.Adapter<ColorAdapter.BasicViewHolder> {
    private List<Color> colores;

    public ColorAdapter(List<Color> colores){
        this.colores=colores;
    }

    @NonNull
    @Override
    public BasicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_basic, parent, false);
        return new BasicViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BasicViewHolder holder, int position) {
        View vColor = holder.itemView.findViewById(R.id.vColor);
        TextView tvNombre = holder.itemView.findViewById(R.id.tvNombre);
        TextView tvColorHex = holder.itemView.findViewById(R.id.tvNumero);
        tvNombre.setText(colores.get(position).getName());
        tvColorHex.setText(colores.get(position).getColorHex());
        vColor.setBackgroundColor(android.graphics.Color.parseColor(tvColorHex.getText().toString()));
        //vColor.setBackgroundColor(Color.parseColor(tvColorHex.getText().toString()));


    }

    @Override
    public int getItemCount() {
        return colores.size();
    }

    public class BasicViewHolder extends RecyclerView.ViewHolder{
        public BasicViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
