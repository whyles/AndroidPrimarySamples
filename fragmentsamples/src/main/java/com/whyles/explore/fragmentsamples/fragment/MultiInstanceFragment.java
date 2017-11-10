package com.whyles.explore.fragmentsamples.fragment;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.whyles.explore.fragmentsamples.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MultiInstanceFragment extends Fragment {

    private static final String TAG = "MultiInstanceFragment";

    public MultiInstanceFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d(TAG, "onCreate()");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView()");

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_multi_instance, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Log.d(TAG, "onActivityCreated()");
    }

    @Override
    public void onStart() {
        super.onStart();

        Log.d(TAG, "onStart()");
    }

    @Override
    public void onResume() {
        super.onResume();

        Log.d(TAG, "onResume()");

    }

    @Override
    public void onPause() {
        super.onPause();

        Log.d(TAG, "onPause()");

    }

    @Override
    public void onStop() {
        super.onStop();

        Log.d(TAG, "onStop()");

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        Log.d(TAG, "onDestroyView()");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        Log.d(TAG, "onDestroy()");

    }

    @Override
    public void onDetach() {
        super.onDetach();

        Log.d(TAG, "onDetach()");

    }

}
