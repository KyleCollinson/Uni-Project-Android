package com.example.pokemonhelper.Util;


import com.example.pokemonhelper.CounterActivity;
import com.example.pokemonhelper.R.array;
import com.example.pokemonhelper.models.Pokemon;
import com.example.pokemonhelper.models.Pokemons;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayUtil {

    int index = -1;
    private static ArrayList<String> PokemonList;

    public static int StringToInt(String Pokemonname) {
        int position;
        PokemonList.clear();
        if (PokemonList.isEmpty()) {
            PokemonList.add("BUFFER"); //COZ ID STARTS AT 1 AND ARRAYS START AT 0
            PokemonList.add("Bulbasaur");
            PokemonList.add("Ivysaur");
            PokemonList.add("Venusaur");
            PokemonList.add("Charmander");
            PokemonList.add("Charmeleon");
            PokemonList.add("Charizard");
            PokemonList.add("Squirtle");
            PokemonList.add("Wartortle");
            PokemonList.add("Blastoise");
            PokemonList.add("Caterpie");
            PokemonList.add("Metapod");
            PokemonList.add("Butterfree");
            PokemonList.add("Weedle");
            PokemonList.add("Kakuna");
            PokemonList.add("Beedrill");
            PokemonList.add("Pidgey");
            PokemonList.add("Pidgeotto");
            PokemonList.add("Pidgeot");
            PokemonList.add("Rattata");
            PokemonList.add("Raticate");
        }

        if (Pokemonname != null) {
            position = Arrays.asList(PokemonList).indexOf(Pokemonname);

        } else {
            position = 0;
        }

        return position;
    }
}



