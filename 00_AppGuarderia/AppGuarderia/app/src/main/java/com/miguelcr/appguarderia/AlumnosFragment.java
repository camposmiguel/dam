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
    public static int COME_BIEN=0, COME_REGULAR=1, COME_MAL=2;
    public static int DEPOSITA_BIEN=0, DEPOSITA_MAL=1, NO_DEPOSITA=2;
    public static boolean DUERME=true, NO_DUERME=false;


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
        alumnos.add(new Alumnos("Juan",NO_DEPOSITA,DEPOSITA_BIEN,COME_BIEN,COME_REGULAR,DUERME,NO_DUERME));

        // Instanciar el adaptador

        return v;
    }

}
