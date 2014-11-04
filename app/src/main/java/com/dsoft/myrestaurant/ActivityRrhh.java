package com.dsoft.myrestaurant;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Marco Barrios on 31/10/2014.
 */
public class ActivityRrhh extends Activity {

    private ArrayAdapter<Personal> adapter;
    private ListView personalListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rrhh);

        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setHomeButtonEnabled(true);

        inicializarComponentes();
        inicializarListView();
        agregarPersonal(1, "Marco Barrios");
        agregarPersonal(2, "Marco Perez");
        agregarPersonal(3, "Enrique Matul");
        agregarPersonal(4, "Gerson Villatoro");
        agregarPersonal(5, "Everto Lopez");
        agregarPersonal(6, "Carlos Garcia");
        agregarPersonal(7, "Mariajose Juanta");
        agregarPersonal(8, "Rudy Ovalle");
        agregarPersonal(9, "Erick Coyoy");
        agregarPersonal(10, "Walter Aceituno");

    }

    private void agregarPersonal(int id, String nombre) {
        Personal nuevo = new Personal(id, nombre);
        adapter.add(nuevo);
    }

    private void inicializarListView() {
        adapter = new PersonalListAdapter(this, new ArrayList<Personal>());
        personalListView.setAdapter(adapter);
    }

    private void inicializarComponentes() {
        personalListView = (ListView)findViewById(R.id.listViewPersonal);
    }
}
