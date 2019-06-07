package com.example.pokemonhelper;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pokemonhelper.Adapters.ChooseMethodDialog;
import com.example.pokemonhelper.Adapters.ChoosePokemonDialog;
import com.example.pokemonhelper.Adapters.InputCounterAdapter;
import com.example.pokemonhelper.Util.ArrayUtil;
import com.example.pokemonhelper.databinding.ActivityCounterBinding;
import com.example.pokemonhelper.models.Pokemon;
import com.example.pokemonhelper.models.Pokemons;

import java.util.ArrayList;


public class CounterActivity extends AppCompatActivity {

    ActivityCounterBinding mBinding;
    //DECLARE VARIABLES
    public String move1;
    public String move2;
    public String move3;
    public String move4;
    public static int Method;
    private static int PokemonID;
    private int counter;
    private Pokemon mPokemon;
    int odds;
    public String PokeName;
    public boolean charm;
    public boolean lure;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // region ONCREATE METHODS
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_counter);
        InputCounterAdapter inputCounterAdapter = new InputCounterAdapter();
        Method = ChooseMethodDialog.MethodPosition;
        PokemonID = ChoosePokemonDialog.PokemonPosition + 1;
        charm = false;

        odds = 1;
        counter =4098;


        //DATA BINDING
        Pokemons pokemons = new Pokemons();
        mPokemon = pokemons.POKEMON[PokemonID]; //CHANGE TO USER CHOICE VARIABLE
        move1 = (pokemons.POKEMON[PokemonID].getMove1());
        move2 = (pokemons.POKEMON[PokemonID].getMove2());
        move3 = (pokemons.POKEMON[PokemonID].getMove3());
        move4 = (pokemons.POKEMON[PokemonID].getMove4());

        PokeName = mPokemon.getPokename();

        if (move1 == null) {
            move1 = "NULL";
        }
        if (move2 == null) {
            move2 = "NULL";
        }
        if (move3 == null) {
            move3 = "NULL";
        }
        if (move4 == null) {
            move4 = "NULL";
        }


        //SET VIEW TO DATA BINDING
        mBinding.setSetTestInt(Method);


        mBinding.setPokemon(mPokemon);

        mBinding.setMove1(move1);
        mBinding.setMove2(move2);
        mBinding.setMove3(move3);
        mBinding.setMove4(move4);

/*
        mBinding.setSetTestInt(PokemonID);
*/

//endregion
    }



    public int updateOdds(int count, int method) {
        if (method == 0) {

            if (charm = false) {//BASE ODDS
                odds = 4096;
            }
            if (charm = true) {
                odds = 2048;
            }
        }
        if (method == 1) { // BASE BREEDING
            if (charm = false) {
                odds = 4096;
            }
            if (charm = true) {
                odds = 2048;
            }

        }
        if (method == 2) { //MASUDA

            if (charm = false) {
                odds = 4096;
            }
            if (charm = true) {
                odds = 2048;
            }
        }
        if (method == 3) {//POKE RADAR

            //region
            if (count < 5) {
                odds = 8192;
            }
            if ((count < 9) && (count > 5)) {
                odds = 7282;
            }
            if ((count < 15) && (count >= 9)) {
                odds = 5958;
            }
            if ((count < 20) && (count >= 15)) {
                odds = 4681;
            }
            if ((count < 26) && (count >= 20)) {
                odds = 3121;
            }
            if ((count < 30) && (count >= 26)) {
                odds = 2185;
            }
            if (count == 30) {
                odds = 2185;
            }
            if (count == 31) {
                odds = 1986;
            }
            if (count == 32) {
                odds = 1771;
            }
            if (count == 33) {
                odds = 1598;
            }
            if (count == 34) {
                odds = 1394;
            }
            if (count == 35) {
                odds = 1192;
            }
            if (count == 36) {
                odds = 993;
            }
            if (count == 37) {
                odds = 799;
            }
            if (count == 38) {
                odds = 596;
            }
            if (count == 39) {
                odds = 400;
            }
            if (count > 40) {
                odds = 200;
            }
            //endregion
        }
        if (method == 4) { //FRIEND SAFARI
            odds = 814;

        }
        if (method == 5) { //CHAIN FISHING

            //region

            if (count == 1) {
                if (charm = true) {
                    odds = 820;
                } else {
                    odds = 1366;
                }
            }
            if (count == 2) {
                if (charm = true) {
                    odds = 586;
                } else {
                    odds = 820;
                }
            }
            if (count == 3) {
                if (charm = true) {
                    odds = 456;
                } else {
                    odds = 586;
                }
            }
            if (count == 4) {
                if (charm = true) {
                    odds = 373;
                } else {
                    odds = 456;
                }
            }
            if (count == 5) {
                if (charm = true) {
                    odds = 316;
                } else {
                    odds = 373;
                }
            }
            if (count == 6) {
                if (charm = true) {
                    odds = 274;
                } else {
                    odds = 316;
                }
            }
            if (count == 7) {
                if (charm = true) {
                    odds = 241;
                } else {
                    odds = 274;
                }
            }
            if (count == 8) {
                if (charm = true) {
                    odds = 216;
                } else {
                    odds = 241;
                }
            }
            if (count == 9) {
                if (charm = true) {
                    odds = 196;
                } else {
                    odds = 216;
                }
            }
            if (count == 10) {
                if (charm = true) {
                    odds = 179;
                } else {
                    odds = 196;
                }
            }
            if (count == 11) {
                if (charm = true) {
                    odds = 164;
                } else {
                    odds = 179;
                }
            }
            if (count == 12) {
                if (charm = true) {
                    odds = 152;
                } else {
                    odds = 164;
                }
            }
            if (count == 13) {
                if (charm = true) {
                    odds = 142;
                } else {
                    odds = 152;
                }
            }
            if (count == 14) {
                if (charm = true) {
                    odds = 133;
                } else {
                    odds = 142;
                }
            }
            if (count == 15) {
                if (charm = true) {
                    odds = 125;
                } else {
                    odds = 133;
                }
            }
            if (count == 16) {
                if (charm = true) {
                    odds = 118;
                } else {
                    odds = 125;
                }
            }
            if (count == 17) {
                if (charm = true) {
                    odds = 118;
                } else {
                    odds = 111;
                }
            }
            if (count == 18) {
                if (charm = true) {
                    odds = 106;
                } else {
                    odds = 111;
                }
            }
            if (count == 19) {
                if (charm = true) {
                    odds = 100;
                } else {
                    odds = 106;
                }
            }
            if (count >= 20) {
                if (charm = true) {
                    odds = 96;
                } else {
                    odds = 100;
                }
            }
            //endregion
        }
        if (method == 6) { //DEX NAV

            //region
            if (count < 10) {
                if (charm = true) {
                    odds = 1366;
                } else {
                    odds = 4096;
                }
            }
            if (count >= 10) {
                if (charm = true) {
                    odds = 945;
                } else {
                    odds = 2777;
                }
            }
            if (count >= 20) {
                if (charm = true) {
                    odds = 733;
                } else {
                    odds = 2101;
                }
            }
            if (count >= 40) {
                if (charm = true) {
                    odds = 569;
                } else {
                    odds = 1689;
                }
            }
            if (count >= 60) {
                if (charm = true) {
                    odds = 501;
                } else {
                    odds = 1413;
                }
            }

            if (count >= 80) {
                if (charm = true) {
                    odds = 433;
                } else {
                    odds = 1214;
                }
            }

            if (count >= 100) {
                if (charm = true) {
                    odds = 381;
                } else {
                    odds = 1064;
                }
            }
            if (count >= 150) {
                if (charm = true) {
                    odds = 340;
                } else {
                    odds = 947;
                }
            }
            if (count >= 200) {
                if (charm = true) {
                    odds = 307;
                } else {
                    odds = 853;
                }
            }
            if (count >= 300) {
                if (charm = true) {
                    odds = 280;
                } else {
                    odds = 777;
                }
            }
            if (count >= 400) {
                if (charm = true) {
                    odds = 257;
                } else {
                    odds = 713;
                }
            }
            if (count >= 500) {
                if (charm = true) {
                    odds = 238;
                } else {
                    odds = 658;
                }
            }
            if (count >= 1000) {
                if (charm = true) {
                    odds = 173;
                } else {
                    odds = 476;
                }
            }
            if (count >= 2000) {
                if (charm = true) {
                    odds = 112;
                } else {
                    odds = 307;
                }
            }
            if (count >= 3000) {
                if (charm = true) {
                    odds = 83;
                } else {
                    odds = 227;
                }
            }
            if (count >= 4000) {
                if (charm = true) {
                    odds = 66;
                } else {
                    odds = 180;
                }
            }
            if (count >= 5000) {
                if (charm = true) {
                    odds = 55;
                } else {
                    odds = 149;
                }
            }
            if (count >= 10000) {
                if (charm = true) {
                    odds = 30;
                } else {
                    odds = 80;
                }
            }
            if (count > 15000) {
                if (charm = true) {
                    odds = 20;
                } else {
                    odds = 55;
                }
            }
            //endregion
        }
        if (method == 7) { //SOS CHAIN
            //region
            if (count <= 1) {
                if (charm = true) {
                    odds = 2048;
                } else {
                    odds = 4096;
                }
            }
            if (count >= 1) {
                if (charm = true) {
                    odds = 1366;
                } else {
                    odds = 4096;
                }
            }
            if (count >= 11) {
                if (charm = true) {
                    odds = 581;
                } else {
                    odds = 814;
                }
            }
            if (count >= 21) {
                if (charm = true) {
                    odds = 370;
                } else {
                    odds = 452;
                }
            }
            if (count > 31) {
                if (charm = true) {
                    odds = 271;
                } else odds = 313;
            }
//endregion
        }
        if (method == 8) {//WORMHOLE
            odds = 150;
        }
        if (method == 9) { //CATCH CHAIN
            //region
            if (count <= 1) {
                if (charm = true) {
                    if (lure = true){
                        odds = 1024;
                    }
                    odds = 1365;
                } else {
                    if (lure = true){
                        odds = 2048;
                    }
                    odds = 4096;
                }
            }
            if (count > 1) {
                if (charm = true) {
                    if (lure = true){
                        odds = 1024;
                    }
                    odds = 1365;
                } else {
                    if (lure = true){
                        odds = 2048;
                    }
                    odds = 4096;
                }
            }
            if (count > 10) {
                if (charm = true) {
                    if (lure = true){
                        odds = 585;
                    }
                    odds = 683;
                } else {
                    if (lure = true){
                        odds = 819;
                    }
                    odds = 1024;
                }
            }

            if (count > 20) {
                if (charm = true) {
                    if (lure = true){
                        odds = 372;
                    }
                    odds = 410;
                } else {
                    if (lure = true){
                        odds = 455;
                    }
                    odds = 512;
                }
            }
            if (count > 30) {
                if (charm = true) {
                    if (lure = true){
                        odds = 273;
                    }
                    odds = 293;
                } else {
                    if (lure = true){
                        odds = 315;
                    }
                    odds = 341;
                }
            }
//endregion
        }
            return odds;
    }

    public void countDown(View view) {
        counter--;
        if (counter<=0) {
            counter=0;
        }

       odds = updateOdds(counter, Method);
        mBinding.setOdds(odds);
        mBinding.setCounter(counter);
    }


    public void countUp(View view) {
        counter++;

        if (counter<=0) {
            counter=0;
        }
        odds = updateOdds(counter, Method);
        mBinding.setOdds(odds);
        mBinding.setCounter(counter);
    }

    public void Caught(View view) {
        Toast.makeText(this, "CONGRATULATIONS ON CATCHING YOUR SHINY  "+ PokeName, Toast.LENGTH_SHORT).show();
        goBack(view);
    }
    public void goBack(View view) {
        //region RESET
        move1 = null;
        move2 = null;
        move3 = null;
        move4 = null;
        PokeName = null;
        Method = 0;
        PokemonID = 0;
        odds=0;
        counter = 0;
        mPokemon = null;
        //endregion

        Intent i = new Intent(CounterActivity.this, MainActivity.class);
        startActivity(i);

    }
}