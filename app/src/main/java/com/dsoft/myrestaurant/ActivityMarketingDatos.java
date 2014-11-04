package com.dsoft.myrestaurant;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Marco Barrios on 03/11/2014.
 */
public class ActivityMarketingDatos extends Activity {

    Button aceptarDatosClientes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_datos_clientes);

        aceptarDatosClientes = (Button)findViewById(R.id.btn_aceptar_datos_cliente);
        aceptarDatosClientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
