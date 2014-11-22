package com.dsoft.myrestaurant;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by enrique on 30/10/14.
 */
public class ActivityFinanzas extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finanzas);

        if (savedInstanceState == null) {
            // on first time display view for first nav item
            Fragment fragment = new FragmentDatosFinanzasList();

            ////**** Ingresar arreglo de datos: Float [] datos
            Bundle b = new Bundle();
            float [] datos = {5,3,10,4, (float) 7.5,6,1};
            b.putFloatArray("datos",datos);
            fragment.setArguments(b);
            /////

            FragmentManager fragmentManager = getFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.fragmento_grafica, fragment).commit();


        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_finanzas, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_list_datos) {
            Fragment fragment = new FragmentDatosFinanzasList();
            ////**** Ingresar arreglo de datos: Float [] datos
            Bundle b = new Bundle();
            float [] datos = {5,3,10,4, (float) 7.5,6,1};
            b.putFloatArray("datos",datos);
            fragment.setArguments(b);
            /////
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragmento_grafica, fragment);
            ft.commit();
            return true;
        }
        if (id == R.id.action_grafica_datos) {

            Fragment fragment = new FragmentGraficaFinanzas();
            ////**** Ingresar arreglo de datos: Float [] datos
            Bundle b = new Bundle();
            float [] datos = {5,3,10,4, (float) 7.5,6,1};
            b.putFloatArray("datos",datos);
            fragment.setArguments(b);
            /////


            if (fragment != null) {
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmento_grafica, fragment).commit();

            } else {
                // error in creating fragment
                Log.e("ERROR", "MainActivity - Error cuando se creo el fragment");
            }


            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
