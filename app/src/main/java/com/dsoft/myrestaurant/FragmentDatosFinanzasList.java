package com.dsoft.myrestaurant;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Enrique Matul on 04/11/2014.
 */
public class FragmentDatosFinanzasList extends Fragment {

    View view;
    private ListView productsListView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_list_datos_finanzas, container,false);

        productsListView = (ListView) view.findViewById(R.id.listViewDatosFinanzas);

        Bundle bundle = getArguments();
        float[] datos = bundle.getFloatArray("datos");
        String [] gastos = new String[datos.length];
        for(int i = 0; i< datos.length; i++)
        {
            gastos[i] = datos[i]+"";
        }
        setListViewAdapter(gastos);

        return view;
    }

    private void setListViewAdapter(String [] list) {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(view.getContext(),android.R.layout.simple_list_item_1,list);
        productsListView.setAdapter(adapter);

    }


}
