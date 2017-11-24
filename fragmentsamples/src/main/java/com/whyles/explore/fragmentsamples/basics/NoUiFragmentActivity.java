package com.whyles.explore.fragmentsamples.basics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.whyles.explore.fragmentsamples.R;

/**
 * Add a fragment which didn't contain UI
 */
public class NoUiFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_ui_fragment);
    }
}
