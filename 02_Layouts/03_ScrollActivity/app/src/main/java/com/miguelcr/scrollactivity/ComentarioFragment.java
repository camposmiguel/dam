    package com.miguelcr.scrollactivity;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class ComentarioFragment extends Fragment {

    // TODO: Customize parameters
    private int mColumnCount = 1;

    private List<Comentario> items;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public ComentarioFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_comentario_list, container, false);

        items = new ArrayList<Comentario>();
        items.add(new Comentario("pepe92","Casa Santos","La tortilla del carajo!","5/5/2016"));
        items.add(new Comentario("mcampos","Miami","El pescaito frio","1/10/2016"));
        items.add(new Comentario("juanvic","100 montaitos","Desayuno barato y bueno","6/6/2016"));
        items.add(new Comentario("pepe92","Casa Santos","La tortilla del carajo!","5/5/2016"));
        items.add(new Comentario("mcampos","Miami","El pescaito frio","1/10/2016"));
        items.add(new Comentario("juanvic","100 montaitos","Desayuno barato y bueno","6/6/2016"));
        items.add(new Comentario("pepe92","Casa Santos","La tortilla del carajo!","5/5/2016"));
        items.add(new Comentario("mcampos","Miami","El pescaito frio","1/10/2016"));
        items.add(new Comentario("juanvic","100 montaitos","Desayuno barato y bueno","6/6/2016"));
        items.add(new Comentario("pepe92","Casa Santos","La tortilla del carajo!","5/5/2016"));
        items.add(new Comentario("mcampos","Miami","El pescaito frio","1/10/2016"));
        items.add(new Comentario("juanvic","100 montaitos","Desayuno barato y bueno","6/6/2016"));


        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;
            if (mColumnCount <= 1) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
            } else {
                recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
            }
            recyclerView.setAdapter(new MyComentarioRecyclerViewAdapter(items));
        }
        return view;
    }



}
