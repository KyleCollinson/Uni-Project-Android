package com.example.pokemonhelper.Adapters;
import com.example.pokemonhelper.CounterActivity;
import com.example.pokemonhelper.InputActivity;


public class InputCounterAdapter {

    private static String UserPokemon;
    private static String UserMethod;
    private InputActivity inputActivity;
    private CounterActivity counterActivity;


    public String getUserPokemon(String Pokemon) {

        Pokemon = UserPokemon;
        return (Pokemon);
    }

    public String getUserMethod(String Method) {

        Method = UserMethod;
        return (Method);
    }
    public String setUserPokemon() {;
        return UserPokemon;
    }

    public String setUserMethod() {

        return UserMethod;
    }



}
