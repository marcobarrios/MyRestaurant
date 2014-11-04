package com.dsoft.myrestaurant;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Marco Barrios on 03/11/2014.
 */
public class ProductoListAdapter extends ArrayAdapter<Productos> {

    private Activity ctx;

    public ProductoListAdapter(Activity context, List<Productos> producto) {
        super(context, R.layout.item_producto, producto);
        this.ctx = context;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        if(view == null) {
            view = ctx.getLayoutInflater().inflate(R.layout.item_producto, parent, false);
        }
        Productos actual = this.getItem(position);
        inicializarCampos(view, actual);
        return view;
    }

    private void inicializarCampos(View view, Productos actual) {
        TextView textView = (TextView)view.findViewById(R.id.viewProducto);
        textView.setText(actual.getNombreProducto());
    }
}
