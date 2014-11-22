package com.dsoft.myrestaurant;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Enrique Matul on 03/11/2014.
 */
public class DatosListAdapter extends ArrayAdapter<Personal> {

    private Activity ctx;

    public DatosListAdapter(Activity context, List<Personal> personal) {
        super(context, R.layout.item_dato, personal);
        this.ctx = context;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        if(view == null) {
            view = ctx.getLayoutInflater().inflate(R.layout.item_dato, parent, false);
        }
        Personal actual = this.getItem(position);
        inicializarCampos(view, actual);
        return view;
    }

    private void inicializarCampos(View view, Personal actual) {
        TextView textView = (TextView)view.findViewById(R.id.viewPersonal);
        textView.setText(actual.getNombrePersonal());
    }
}
