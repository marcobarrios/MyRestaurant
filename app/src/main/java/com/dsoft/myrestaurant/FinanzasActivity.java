package com.dsoft.myrestaurant;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;

import com.androidplot.pie.PieChart;
import com.androidplot.pie.Segment;
import com.androidplot.pie.SegmentFormatter;
import com.androidplot.xy.BarFormatter;
import com.androidplot.xy.PointLabelFormatter;
import com.androidplot.xy.SimpleXYSeries;
import com.androidplot.xy.XYPlot;
import com.androidplot.xy.XYSeries;

import java.util.Arrays;

/**
 * Created by enrique on 30/10/14.
 */
public class FinanzasActivity extends Activity {

    private XYPlot mySimpleXYPlot;
    private PieChart pie;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finanzas);

        // Inicializamos el objeto XYPlot búscandolo desde el layout:
        mySimpleXYPlot = (XYPlot) findViewById(R.id.mySimpleXYPlot);
        pie = (PieChart) findViewById(R.id.pie);

        Number[] series1Numbers = {1, 8, 2, 7, 5, 2, 6, 4, 7, 4};
        BarFormatter bf1 = new BarFormatter(Color.RED, Color.BLACK);
        bf1.setPointLabelFormatter(new PointLabelFormatter(Color.WHITE));
        XYSeries series1 = new SimpleXYSeries(
                Arrays.asList(series1Numbers),  // Array de datos
                SimpleXYSeries.ArrayFormat.Y_VALS_ONLY, // Sólo valores verticales
                "Series1"); // Nombre de la primera serie

        Segment a = new Segment("prueba", 3);
        pie.addSegment(a,new SegmentFormatter(Color.RED,Color.BLACK));

        Segment b = new Segment("prueba2", 5);
        pie.addSegment(b,new SegmentFormatter(Color.GREEN,Color.BLACK));

        Segment c = new Segment("prueba3", 8);
        pie.addSegment(c,new SegmentFormatter(Color.BLUE,Color.BLACK));


        mySimpleXYPlot.addSeries(series1, bf1);
    }
}
