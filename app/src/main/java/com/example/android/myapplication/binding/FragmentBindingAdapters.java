package com.example.android.myapplication.binding;

import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;

import javax.inject.Inject;

public class FragmentBindingAdapters {
    final Fragment fragment;

    @Inject
    public FragmentBindingAdapters(Fragment fragment) {
        this.fragment = fragment;
    }
    public void bindImage(ImageView imageView, String url) {
        Glide.with(fragment).load(url).into(imageView);
    }
}

