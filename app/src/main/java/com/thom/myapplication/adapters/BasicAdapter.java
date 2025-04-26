package com.thom.myapplication.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.thom.myapplication.R;
import com.thom.myapplication.clases.Contacto;

import java.util.List;

public class BasicAdapter extends RecyclerView.Adapter<BasicAdapter.BasicViewHolder> {

    public List<Contacto> contactos;
    public BasicAdapter(List<Contacto> contactos){
        this.contactos=contactos;
    }

    @NonNull
    @Override
    public BasicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_basic, parent, false);
        return new BasicViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BasicViewHolder holder, int position) {
        TextView tvNombre = holder.itemView.findViewById(R.id.tvNombre);
        TextView tvNumero = holder.itemView.findViewById(R.id.tvNumero);
        tvNombre.setText(contactos.get(position).getNombre());
        tvNumero.setText(String.valueOf(contactos.get(position).getNumero()));
    }

    @Override
    public int getItemCount() {
        return contactos.size();
    }

    public class BasicViewHolder extends RecyclerView.ViewHolder {
        public BasicViewHolder(@NonNull View itemView) {
            super(itemView);
        }

    }
}
