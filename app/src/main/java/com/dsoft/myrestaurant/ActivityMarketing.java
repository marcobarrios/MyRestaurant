package com.dsoft.myrestaurant;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Marco Barrios on 31/10/2014.
 */
public class ActivityMarketing extends Activity {

    private Button btnBuscarCliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marketing);

        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setHomeButtonEnabled(true);

        inicializarComponentes();
    }

    private void inicializarComponentes() {
        btnBuscarCliente = (Button)findViewById(R.id.btn_buscar_cliente);
        btnBuscarCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityMarketing.this, ActivityMarketingDatos.class);
                startActivity(intent);
            }
        });
    }
}
