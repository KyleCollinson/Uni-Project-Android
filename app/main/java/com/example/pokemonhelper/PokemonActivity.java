package com.example.pokemonhelper;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.pokemonhelper.Adapters.RecyclerAdapter;
import com.example.pokemonhelper.databinding.ActivityPokemonBinding;
import com.example.pokemonhelper.databinding.RecyclercardBinding;
import com.example.pokemonhelper.models.DBAdapter;
import com.example.pokemonhelper.models.Poke;
import com.example.pokemonhelper.models.Pokemons;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PokemonActivity extends AppCompatActivity  {
    Context context;

    ActivityPokemonBinding mBinding;
    public String UI_ID;
    private List<Poke> mPoke;
    private RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mPoke= preparePoke();
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_pokemon);
        mBinding.pokemonRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mBinding.pokemonRecyclerView.setHasFixedSize(true);

        adapter = new RecyclerAdapter(this, preparePoke());
        mBinding.pokemonRecyclerView.setAdapter(adapter);
        List<String> mPoke = Arrays.asList(getResources().getStringArray(R.array.IDs));

    }

        private List<Poke> preparePoke(){
            List<String> ids = Arrays.asList(getResources().getStringArray(R.array.IDs));
            List<String> names = Arrays.asList(getResources().getStringArray(R.array.names));
            int[] imageId = {R.drawable.bulbasaur, R.drawable.ivysaur, R.drawable.venusaur, R.drawable.charmander,
                    R.drawable.charmeleon, R.drawable.charizard, R.drawable.squirtle, R.drawable.wartortle, R.drawable.blastoise, R.drawable.caterpie, R.drawable.metapod,
                    R.drawable.butterfree, R.drawable.weedle, R.drawable.kakuna, R.drawable.beedrill, R.drawable.pidgey, R.drawable.pidgeotto,
                    R.drawable.pidgeot, R.drawable.rattata, R.drawable.raticate};
            List<Poke> IDs = new ArrayList<>();
            int count = 0;
            for (String id : ids) {

                IDs.add(new Poke(id, names.get(count), imageId[count]));
                count++;
            }
            return IDs;
        }

        public void back (View v){
            Intent i = new Intent(PokemonActivity.this, MainActivity.class);
            startActivity(i);

        }

/*    @Override
    public void OnNoteClick(int position) {
       UI_ID = mPoke.get(position).toString();
        Intent i = new Intent(PokemonActivity.this, InputActivity.class);
        startActivity(i);

    }*/
}
