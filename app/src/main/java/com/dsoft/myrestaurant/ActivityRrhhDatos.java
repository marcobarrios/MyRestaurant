package com.dsoft.myrestaurant;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Marco Barrios on 03/11/2014.
 */
public class ActivityRrhhDatos extends Activity {

    Button btnAceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_datos_rrhh);

        inicializarComponentes();
    }

    private void inicializarComponentes() {
        btnAceptar = (Button)findViewById(R.id.btn_aceptar_planilla);
        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
