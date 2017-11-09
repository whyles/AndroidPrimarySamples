package com.whyles.explore.fragmentsamples.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.whyles.explore.fragmentsamples.R;

/**
 * Add a fragment from xml layout
 */
public class FromXmlActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_from_xml);
    }
}
