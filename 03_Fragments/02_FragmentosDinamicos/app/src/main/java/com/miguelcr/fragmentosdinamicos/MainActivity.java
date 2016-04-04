package com.miguelcr.fragmentosdinamicos;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    boolean cargarGrid = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Con el siguiente método cargamos en el FrameLayout
        // cuyo id es R.id.container el contenido del fragmento
        // ListadoFragment (en este ejemplo sólo muestra un TextView)
        Fragment f = new ListadoFragment();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.container,f)
                .commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options_menu_main, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.action_grid_list:

                Fragment f = null;

                if(cargarGrid) {
                    f = new GridFragment();
                    item.setIcon(R.drawable.ic_action_list);
                    cargarGrid = false;
                } else {
                    f = new ListadoFragment();
                    item.setIcon(R.drawable.ic_action_grid);
                    cargarGrid = true;
                }

                // Cargo en el container el fragment que muestra la vista Grid
                // GridFragment
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, f)
                        .commit();

                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}


