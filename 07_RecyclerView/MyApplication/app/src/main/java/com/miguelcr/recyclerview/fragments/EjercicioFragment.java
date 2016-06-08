package com.miguelcr.recyclerview.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.miguelcr.recyclerview.R;
import com.miguelcr.recyclerview.interfaces.OnRecyclerViewEjercicioClickListener;
import com.miguelcr.recyclerview.pojos.Ejercicio;

import java.util.ArrayList;
import java.util.List;

/**
 * A fragment representing a list of Items.
 * <p/>
 * Activities containing this fragment MUST implement the {@link OnRecyclerViewEjercicioClickListener}
 * interface.
 */
public class EjercicioFragment extends Fragment {

    // TODO: Customize parameters
    private int mColumnCount = 1;
    List<Ejercicio> items;

    private OnRecyclerViewEjercicioClickListener mListener;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public EjercicioFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ejercicio_list, container, false);

        // Completa la lista de ejercicios con elementos
        items = new ArrayList<Ejercicio>();
        items.add(new Ejercicio("Carrera 5Km","Running",R.drawable.ic_running,60,5000));
        items.add(new Ejercicio("Carrera 10Km","Running",R.drawable.ic_running,60,10000));
        items.add(new Ejercicio("Carrera 15Km","Running",R.drawable.ic_running,60,15000));
        items.add(new Ejercicio("Carrera 20Km","Running",R.drawable.ic_running,60,20000));


        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;
            if (mColumnCount <= 1) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
            } else {
                recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
            }
            recyclerView.setAdapter(new MyEjercicioRecyclerViewAdapter(items, mListener));
        }
        return view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnRecyclerViewEjercicioClickListener) {
            mListener = (OnRecyclerViewEjercicioClickListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnListFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

}
