package com.karp.anna.myapplication;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;

// Programmatically, there is only px units.
// Thus we need to convert any other units to pixels.
public class MainActivity extends AppCompatActivity {

    private TextView textViewDynamic;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewDynamic = (TextView)findViewById(R.id.textViewDynamic);
    }

    public void buttonSetWidth_onClick(View view) {

        // Get device's display metrics:
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();


        // Get TextView's Width :
        float dp = textViewDynamic.getWidth();

        // Convert 100dp to pixels:
        float pixels = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 10, displayMetrics);

        // Set TextView's Width in Pixels:
        textViewDynamic.setWidth(Math.round(pixels+dp));

        // Set TextView's Text:
        textViewDynamic.setText(Math.round(pixels+dp)+"dp");
    }
}