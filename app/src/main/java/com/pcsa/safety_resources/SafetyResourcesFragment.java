package com.pcsa.safety_resources;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pcsa.R;


/**
 * A placeholder fragment containing a simple view.
 */
public class SafetyResourcesFragment extends Fragment {

    public SafetyResourcesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_safety_resources, container, false);
    }
}
