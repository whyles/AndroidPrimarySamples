package com.whyles.explore.fragmentsamples.activity;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.whyles.explore.fragmentsamples.R;
import com.whyles.explore.fragmentsamples.fragment.BasicsFragment;

/**
 * Add a fragment from code
 */
public class FromCodeActivity extends AppCompatActivity {

    private BasicsFragment basicsFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_from_code);

        init();
    }

    private void init(){

        if (basicsFragment == null){
            basicsFragment = BasicsFragment.newInstance("", "");
        }


        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.add(R.id.container, basicsFragment);

        transaction.commit();
    }
}
