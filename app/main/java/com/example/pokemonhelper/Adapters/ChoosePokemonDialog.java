package com.example.pokemonhelper.Adapters;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import com.example.pokemonhelper.IPokemon;
import com.example.pokemonhelper.R;
import com.example.pokemonhelper.databinding.DialogChoosePokemonBinding;

import java.util.List;

public class ChoosePokemonDialog extends DialogFragment {

    public static int PokemonPosition;
        private static final String TAG = "ChoosePokemonDialog";

        // data binding
        DialogChoosePokemonBinding mBinding;

        @Nullable
        @Override
        public View onCreateView (@NonNull LayoutInflater inflater, @Nullable ViewGroup
        container, @Nullable Bundle savedInstanceState){

            mBinding = DialogChoosePokemonBinding.inflate(inflater);
            mBinding.listView.setOnItemClickListener(mOnItemClickListener);
            mBinding.closeDialog.setOnClickListener(mCloseDialogListener);

            return mBinding.getRoot();
        }


        public AdapterView.OnItemClickListener mOnItemClickListener = new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d(TAG, "onItemSelected: selected: " + adapterView.getItemAtPosition(i));
                IPokemon iPokemon = (IPokemon) getActivity();
                iPokemon.setPokemon((String) adapterView.getItemAtPosition(i));
                PokemonPosition =i;


                getDialog().dismiss();
            }
        };

        public View.OnClickListener mCloseDialogListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getDialog().dismiss();
            }
        };
    }














