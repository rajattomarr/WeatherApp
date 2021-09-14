package com.example.android.myapplication.binding;

import android.view.View;
import android.widget.ImageView;

import com.example.android.myapplication.R;
import com.squareup.picasso.Picasso;

public class BindingAdapters {
    public static void showHide(View view, boolean show) {
        view.setVisibility(show ? View.VISIBLE : View.GONE);
    }

    public static void setImageUrl(ImageView view, String imageUrl) {
        if (imageUrl != null && imageUrl.length() > 0) {
            Picasso.with(view.getContext())
                    .load(imageUrl)
                    .fit()
                    .centerCrop()
                    .placeholder(R.drawable.cloud)
                    .into(view);

        }
    }
}