package com.example.pokemonhelper.Util;


import com.example.pokemonhelper.InputActivity;
import com.example.pokemonhelper.R;
import com.example.pokemonhelper.models.Pokemon;

import java.util.ArrayList;
import java.util.Random;

public class MovesUtil {
    static Random randomnumber = new Random();
   static ArrayList MoveList = new ArrayList();



    public  MovesUtil() {
         int i = 0;
         int position;
        ArrayList RandomNumber = new ArrayList();







        //POPULATE ARRAY WITH RANDOM NUMBERS//
             do{
                i ++;
                position= randomnumber.nextInt();
                 RandomNumber.add(position);
             } while (i <=128);


    }



    public static String getMove1(String move1) {
    int randommove;
    //GET RANDOM NUMBER FROM RANDOM ARRAY
    randommove = randomnumber.nextInt();

        move1 = (String) MoveList.get(randommove);

        return move1;
    }

    public static String getMove2(String move2) {

        return move2;
    }

    public static String getMove3(String move3) {
        return move3;

    }

    public static String getMove4(String move4) {

        return move4;
    }
}
