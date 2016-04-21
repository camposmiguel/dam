package com.miguelcr.appguarderia;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class AlumnosFragment extends Fragment {
    ListView listViewAlumnos;
    public static int COME_BIEN=1, COME_REGULAR=2, COME_MAL=3;
    public static int DEPOSITA_BIEN=1, DEPOSITA_MAL=2, NO_DEPOSITA=3;
    public static int DUERME=1, NO_DUERME=2;
    AlumnoAdapter adapter;


    public AlumnosFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_alumnos, container, false);

        listViewAlumnos = (ListView)v.findViewById(R.id.listViewAlumnos);

        ArrayList<Alumnos> alumnos = new ArrayList<>();
        alumnos.add(new Alumnos("María",DEPOSITA_MAL,DEPOSITA_BIEN,COME_BIEN,COME_REGULAR,DUERME,NO_DUERME));
        alumnos.add(new Alumnos("Juan",NO_DEPOSITA,DEPOSITA_BIEN,COME_MAL,COME_REGULAR,DUERME,NO_DUERME));

        // Instanciar el adaptador
        adapter = new AlumnoAdapter(getActivity(),alumnos);
        listViewAlumnos.setAdapter(adapter);

        return v;
    }

}
