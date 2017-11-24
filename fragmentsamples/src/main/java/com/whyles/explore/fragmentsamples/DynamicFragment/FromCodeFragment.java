package com.whyles.explore.fragmentsamples.DynamicFragment;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.whyles.explore.fragmentsamples.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FromCodeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FromCodeFragment extends Fragment {

    public FromCodeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FromCodeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FromCodeFragment newInstance() {
        FromCodeFragment fragment = new FromCodeFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_from_code, container, false);
    }

}
