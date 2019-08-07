package com.rajeshdonepudi.snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        relativeLayout = (RelativeLayout) findViewById(R.id.mainLayout);

    }

    public void showSnackbar(View view) {
        /* Snackbar Created by RAJESH DONEPUDI */
        Snackbar snackbar = Snackbar.make(relativeLayout, "Sample Snackbar", Snackbar.LENGTH_LONG);
        snackbar.show();
    }
}
