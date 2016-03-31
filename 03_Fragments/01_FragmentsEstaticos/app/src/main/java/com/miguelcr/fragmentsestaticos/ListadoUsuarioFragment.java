package com.miguelcr.fragmentsestaticos;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListadoUsuarioFragment extends Fragment {
    TextView texto;

    public ListadoUsuarioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_listado_usuario, container, false);


        // modificaciones
        texto = (TextView)v.findViewById(R.id.textViewlistado);

        return v;
    }

}
