package com.example.android.myapplication.binding;

import androidx.fragment.app.Fragment;

public class FragmentDataBindingComponent implements DataBindingComponent {
    private final FragmentBindingAdapters adapter;

    public FragmentDataBindingComponent(Fragment fragment) {
        this.adapter = new FragmentBindingAdapters(fragment);
    }

    //@Override
    public FragmentBindingAdapters getFragmentBindingAdapters() {
        return adapter;
    }
}
