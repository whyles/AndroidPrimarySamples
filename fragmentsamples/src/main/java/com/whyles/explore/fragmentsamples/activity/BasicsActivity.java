package com.whyles.explore.fragmentsamples.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.whyles.explore.fragmentsamples.R;

public class BasicsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basics);

        init();
    }

    private void init(){
        
    }
}