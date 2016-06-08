package com.miguelcr.scrollactivity;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyComentarioRecyclerViewAdapter extends RecyclerView.Adapter<MyComentarioRecyclerViewAdapter.ViewHolder> {

    private final List<Comentario> mValues;

    public MyComentarioRecyclerViewAdapter(List<Comentario> items) {
        mValues = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_comentario, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.mNombreUsuarioView.setText(mValues.get(position).getUsuario());
        holder.mFechaComentarioView.setText(mValues.get(position).getFecha());
        holder.mComentarioView.setText(mValues.get(position).getComentario());
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final ImageView mAvatarView;
        public final TextView mNombreUsuarioView;
        public final TextView mFechaComentarioView;
        public final TextView mComentarioView;

        public Comentario mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mAvatarView = (ImageView) view.findViewById(R.id.imageViewAvatar);
            mNombreUsuarioView = (TextView) view.findViewById(R.id.textViewNombre);
            mFechaComentarioView = (TextView) view.findViewById(R.id.textViewFecha);
            mComentarioView = (TextView) view.findViewById(R.id.textViewComentario);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mFechaComentarioView.getText() + "'";
        }
    }
}
