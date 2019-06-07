package com.example.pokemonhelper.Util;

public class StringUtil {
    public  static  String getLevelString(int lvl){
        return ("Lvl: " + String.valueOf(lvl));

    }

    public  static String getPokeString(int pokemon){
        return ("Name="+String.valueOf(pokemon));
    }
    public  static String getCounterString(int counter){
        return ("Counter= "+String.valueOf(counter));
    }
    public static String convertIntToString(int count){
        return ("1 in  " +String.valueOf(count) + " Encounters");
    }


}
