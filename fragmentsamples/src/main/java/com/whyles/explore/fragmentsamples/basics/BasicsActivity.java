package com.whyles.explore.fragmentsamples.basics;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.whyles.explore.fragmentsamples.R;

public class BasicsActivity extends AppCompatActivity {

    private static final String TAG = "BasicsActivity";

    private BasicsFragment basicsFragment;

    private Button btnAdd;

    private Button btnRemove;

    private Button btnReplace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d(TAG, "onCreate()");

        setContentView(R.layout.activity_basics);

        init();
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG, "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(TAG, "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(TAG, "onDestroy()");
    }

    private void init() {

        if (basicsFragment == null) {
            basicsFragment = BasicsFragment.newInstance("", "");
        }

        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.container, basicsFragment);
//        fragmentTransaction.addToBackStack(null);

        fragmentTransaction.commit();

        Log.d(TAG, "FragmentTransaction add commit");

        initView();

    }

    private void initView() {

        btnAdd = findViewById(R.id.btn_add);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addFragment();
            }
        });

        btnReplace = findViewById(R.id.btn_replace);
        btnReplace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragment();
            }
        });
    }

    private void addFragment() {


        MultiInstanceFragment multiInstanceFragment = new MultiInstanceFragment();

        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.container, multiInstanceFragment);
//        fragmentTransaction.addToBackStack(null);

        fragmentTransaction.commit();

        Log.d(TAG, "FragmentTransaction add commit");

    }

    private void removeFragment() {

        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
//        fragmentTransaction.addToBackStack(null);

        fragmentTransaction.commit();

        Log.d(TAG, "FragmentTransaction remove commit");

    }

    private void replaceFragment() {

        MultiInstanceFragment multiInstanceFragment = new MultiInstanceFragment();

        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container, multiInstanceFragment);
//        fragmentTransaction.addToBackStack(null);

        fragmentTransaction.commit();

        Log.d(TAG, "FragmentTransaction replace commit");

    }
}
