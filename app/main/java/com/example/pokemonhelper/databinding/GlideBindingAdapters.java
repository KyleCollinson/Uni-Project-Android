package com.example.pokemonhelper.databinding;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.pokemonhelper.R;

public class GlideBindingAdapters {

    @BindingAdapter("imageid")
    public static void setImage(ImageView view, int imageid){
        Context context = view.getContext();

        RequestOptions options = new RequestOptions()
                .placeholder(R.drawable.vulpix)
                .error(R.drawable.ic_x_black);

        Glide.with(context)
                .setDefaultRequestOptions(options)
                .load(imageid)
                .into(view);
    }
    @BindingAdapter("Shinyimageid")
    public static void setShinyimage(ImageView view, int Shinyimageid){

        Context context = view.getContext();

        RequestOptions options = new RequestOptions()
                .placeholder(R.drawable.shiny_vulpix)
                .error(R.drawable.ic_x_black);

        Glide.with(context)
                .setDefaultRequestOptions(options)
                .load(Shinyimageid)
                .into(view);
    }










}
