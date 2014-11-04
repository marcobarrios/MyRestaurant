package com.dsoft.myrestaurant;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Marco Barrios on 31/10/2014.
 */
public class ActivityProduccion extends Activity {

    private ArrayAdapter<Productos> adapter;
    private ListView productsListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produccion);

        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setHomeButtonEnabled(true);

        inicializarComponentes();
        inicializarListView();
        agregarProductos(1, "Tomate");
        agregarProductos(2, "Queso");
        agregarProductos(3, "Cebolla");
        agregarProductos(4, "Jamon");
        agregarProductos(5, "Pepinillos");
        agregarProductos(6, "Carne de res");
        agregarProductos(7, "Ketchup");
        agregarProductos(8, "Mayonesa");
        agregarProductos(9, "Limon");
        agregarProductos(10, "Papalinas");
    }

    private void agregarProductos(int id, String nombre) {
        Productos nuevo = new Productos(id, nombre);
        adapter.add(nuevo);
    }

    private void inicializarListView() {
        adapter = new ProductoListAdapter(this, new ArrayList<Productos>());
        productsListView.setAdapter(adapter);
    }

    private void inicializarComponentes() {
        productsListView = (ListView)findViewById(R.id.listViewProductos);
    }
}
