package com.dsoft.myrestaurant;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.faizmalkani.floatingactionbutton.FloatingActionButton;

/**
 * Created by Marco Barrios on 31/10/2014.
 */
public class ActivityMarketing extends Activity {

    private FloatingActionButton fabRefresh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marketing);

        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setHomeButtonEnabled(true);

        fabRefresh = (FloatingActionButton)findViewById(R.id.fab_marketing);
        fabRefresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Actualizar Datos", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
