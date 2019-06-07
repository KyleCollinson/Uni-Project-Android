package com.example.pokemonhelper.Adapters;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import com.example.pokemonhelper.CounterActivity;
import com.example.pokemonhelper.IMethod;
import com.example.pokemonhelper.databinding.DialogChooseMethodBinding;


public class ChooseMethodDialog extends DialogFragment {

    public static int MethodPosition;
        private static final String TAG = "ChooseMethodDialog";

        // data binding
        DialogChooseMethodBinding mBinding;

        @Nullable
        @Override
        public View onCreateView (@NonNull LayoutInflater inflater, @Nullable ViewGroup
        container, @Nullable Bundle savedInstanceState){

            mBinding = DialogChooseMethodBinding.inflate(inflater);
            mBinding.listView.setOnItemClickListener(mOnItemClickListener);
            mBinding.closeDialog.setOnClickListener(mCloseDialogListener);

            return mBinding.getRoot();
        }


        public AdapterView.OnItemClickListener mOnItemClickListener = new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d(TAG, "onItemSelected: selected: " + adapterView.getItemAtPosition(i));
                IMethod iMethod= (IMethod) getActivity();
                iMethod.setMethod((String) adapterView.getItemAtPosition(i));
                MethodPosition=i;



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














