package com.example.pokemonhelper.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pokemonhelper.R;

import java.util.ArrayList;

public class SpinnerAdapter extends ArrayAdapter<CustomItems>{
    public SpinnerAdapter(@NonNull Context context, ArrayList<CustomItems>customList) {
        super(context, 0, customList);
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        return customView(position, convertView, parent);
    }

    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        return customView(position, convertView, parent);
    }

    public View customView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            if (convertView == null){
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.custom_spinner_layout,parent,false);

            }
            CustomItems items = getItem(position);
        ImageView spinnerImage = convertView.findViewById(R.id.ivCustomSpinner);
        TextView spinnerName = convertView.findViewById(R.id.tvCustomSpinner);
        if (items != null){
            spinnerImage.setImageResource(items.getSpinnerImage());
            spinnerName.setText(items.getSpinnerText());
        }
        return convertView;

    }

}
