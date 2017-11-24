package com.whyles.explore.fragmentsamples.DynamicFragment;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import com.whyles.explore.fragmentsamples.R;

/**
 * Add a fragment from code
 */
public class FromCodeActivity extends AppCompatActivity {

    private FromCodeFragment fromCodeFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_from_code);

        init();
    }

    private void init(){

        if (fromCodeFragment == null){
            fromCodeFragment = FromCodeFragment.newInstance();
        }


        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.add(R.id.container, fromCodeFragment);

        transaction.commit();
    }
}
