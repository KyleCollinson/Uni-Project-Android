package com.example.pokemonhelper.models;

import android.databinding.BindingAdapter;
import android.support.v4.content.ContextCompat;
import android.view.View;

import de.hdodenhof.circleimageview.CircleImageView;

public class Poke {
    public String id, name;
    public int imageId;

    public Poke(String id, String name, int imageId) {
        this.id = id;
        this.name = name;
        this.imageId = imageId;
    }

    @BindingAdapter("android:imageUrl")
    public static void loadImage(View view, int imageId){
        CircleImageView circleImageView = (CircleImageView) view;
        circleImageView.setImageDrawable(ContextCompat.getDrawable(view.getContext(),imageId));
    }


}
