package com.dsoft.myrestaurant;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Marco Barrios on 31/10/2014.
 */
public class ActivityAbout extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setHomeButtonEnabled(true);
    }
}
