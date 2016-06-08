package com.miguelcr.recyclerview.fragments;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.miguelcr.recyclerview.R;
import com.miguelcr.recyclerview.interfaces.OnRecyclerViewEjercicioClickListener;
import com.miguelcr.recyclerview.pojos.Ejercicio;

import java.util.List;


public class MyEjercicioRecyclerViewAdapter extends RecyclerView.Adapter<MyEjercicioRecyclerViewAdapter.ViewHolder> {

    private final List<Ejercicio> mValues;
    private final OnRecyclerViewEjercicioClickListener mListener;

    public MyEjercicioRecyclerViewAdapter(List<Ejercicio> items, OnRecyclerViewEjercicioClickListener listener) {
        mValues = items;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_ejercicio_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.iconoView.setImageResource(mValues.get(position).getIcono());
        holder.tituloView.setText(mValues.get(position).getTitulo());
        holder.distanciaView.setText(String.valueOf(mValues.get(position).getDistancia()/1000)+" Km");
        holder.duracionView.setText(String.valueOf(mValues.get(position).getDuracion())+" min");

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onClickItemEjercicio(holder.mItem);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final ImageView iconoView;
        public final TextView tituloView;
        public final TextView duracionView;
        public final TextView distanciaView;
        public Ejercicio mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            iconoView = (ImageView) view.findViewById(R.id.imageViewIconoEjercicio);
            tituloView = (TextView) view.findViewById(R.id.textViewTituloEjercicio);
            distanciaView = (TextView) view.findViewById(R.id.textViewDistanciaEjercicio);
            duracionView = (TextView) view.findViewById(R.id.textViewDuracionEjercicio);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + distanciaView.getText() + "'";
        }
    }
}
