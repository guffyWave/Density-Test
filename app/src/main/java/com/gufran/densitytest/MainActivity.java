package com.gufran.densitytest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);

        int density = getResources().getDisplayMetrics().densityDpi;

        switch (density) {
            case DisplayMetrics.DENSITY_LOW:
                Toast.makeText(this, "LDPI", Toast.LENGTH_SHORT).show();
                textView.setText("LDPI");
                break;
            case DisplayMetrics.DENSITY_MEDIUM:
                Toast.makeText(this, "MDPI", Toast.LENGTH_SHORT).show();
                textView.setText("MDPI");
                break;
            case DisplayMetrics.DENSITY_HIGH:
                Toast.makeText(this, "HDPI", Toast.LENGTH_SHORT).show();
                textView.setText("HDPI");
                break;
            case DisplayMetrics.DENSITY_XHIGH:
                Toast.makeText(this, "XHDPI", Toast.LENGTH_SHORT).show();
                textView.setText("XHDPI");
                break;
            case DisplayMetrics.DENSITY_XXHIGH:
                Toast.makeText(this, "XXHDPI", Toast.LENGTH_SHORT).show();
                textView.setText("XXHDPI");
                break;
            case DisplayMetrics.DENSITY_XXXHIGH:
                Toast.makeText(this, "XXXHDPI", Toast.LENGTH_SHORT).show();
                textView.setText("XXXHDPI");
                break;
            case DisplayMetrics.DENSITY_TV:
                Toast.makeText(this, "TVHDPI", Toast.LENGTH_SHORT).show();
                textView.setText("TVHDPI");
                break;
        }
    }
}
