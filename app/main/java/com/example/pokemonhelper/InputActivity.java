package com.example.pokemonhelper;


import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import android.widget.Spinner;


import com.example.pokemonhelper.Adapters.ChooseLevelDialog;
import com.example.pokemonhelper.Adapters.ChooseMethodDialog;
import com.example.pokemonhelper.Adapters.ChoosePokemonDialog;
import com.example.pokemonhelper.Adapters.InputCounterAdapter;
import com.example.pokemonhelper.databinding.ActivityInputBinding;
import com.example.pokemonhelper.Adapters.CustomItems;


import java.util.ArrayList;


public class InputActivity extends AppCompatActivity implements IInputActivity, IPokemon, IMethod  {
    private Spinner customSpinner;
    public String Pokemonname;
    public String Methodname;
    //ALLOW FOR DATA BINDING
    ActivityInputBinding mBinding;
    InputCounterAdapter inputCounterAdapter = new InputCounterAdapter();

    //This will be the page where the user can choose the Poke they're hunting
    private static final String TAG = "Input Activity";
    private int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //BINDING DATA
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_input);



        mBinding.setPokemon("Bulbasaur");
        mBinding.setIPokemon((IPokemon) this);

        mBinding.setLevel(1);
        mBinding.setIInputActivity((IInputActivity)this);

        mBinding.setMethod("Base");
        mBinding.setIMethod((IMethod) this);



        //LOG FOR DEBUGGING
        Log.d("onCreateINPUT:Started", TAG);


//region START
/*

        SpinnerAdapter customAdapter=new SpinnerAdapter(this,customList);
        if (customSpinner != null){
            customSpinner.setAdapter(customAdapter);
            customSpinner.setOnItemSelectedListener(this);
        }*/



    }
//endregion


    public void Pokemon(View v) {
//LOGIC TO CHOOSE POKEMON
        //WILL BE CARDVIEW OR RECYCLERVIEW AND TOAST TO CHOOSE
        //SEND TO FRAGMENT
        //SEARCH FUNCTION?


/*
        Intent i= new Intent(InputActivity.this, PokemonActivity.class);
        startActivity(i);
*/

    }

    public void Method(View v) {
        //LOGIC TO CHOOSE METHOD
        //WILL BE CARDVIEW OR RECYCLERVIEW AND TOAST TO CHOOSE
        //SPINNER?? LOOK AT AFTER POKEMON NAME


    }


    public void goHunt(View v) {
        //LOGIC TO SEND TO COUNTER PAGE
        //ALL VARIABLES WILL BE NEEDED

        Intent i= new Intent(InputActivity.this, CounterActivity.class);
        startActivity(i);

    }


    public void goBack(View v) {
        //RETURN TO MAIN ACTIVITY
    }

    @Override
    public void inflateLevelDialog() {
        ChooseLevelDialog dialog = new ChooseLevelDialog();
        dialog.show(getSupportFragmentManager(), getString(R.string.dialog_choose_level));
    }

    @Override
    public void setLevel(int level) {
            mBinding.setLevel(level);
    }



    @Override
    public void inflatePokemonDialog() {
        ChoosePokemonDialog dialog = new ChoosePokemonDialog();
            dialog.show(getSupportFragmentManager(), getString(R.string.dialog_choose_pokemon));

        }

    @Override
    public void setPokemon(String pokemon) {
        //ASSIGN VARIABLE TO USE IN COUNTER ACTIVITY
        Intent intent = new Intent(this, CounterActivity.class);
           Pokemonname = pokemon;
           inputCounterAdapter.getUserPokemon(Pokemonname);
        mBinding.setPokemon(Pokemonname);
        intent.putExtra("pokemon",Pokemonname);
    }


    @Override
    public void inflateMethodDialog() {
        ChooseMethodDialog dialog = new ChooseMethodDialog();
        dialog.show(getSupportFragmentManager(), getString(R.string.dialog_choose_pokemon));

    }

    @Override
    public void setMethod(String method) {
        //ASSIGN VARIABLE TO USE IN COUNTER ACTIVITY

        Methodname = method;
        inputCounterAdapter.getUserMethod(Methodname);
        mBinding.setMethod(Methodname);

    }
}


/*
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        CustomItems items=(CustomItems) adapterView.getSelectedItem();
        Toast.makeText(this, items.getSpinnerText(), Toast.LENGTH_SHORT).show();
        if (items.getSpinnerText() != null) {

      */
/*      UchosenLevel= items.getSpinnerText();*//*

        }
    }
*/






