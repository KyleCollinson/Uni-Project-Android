package com.example.pokemonhelper.models;

import java.util.HashMap;
import com.example.pokemonhelper.R;
import com.example.pokemonhelper.models.Pokemon;

public class Pokemons {

    public Pokemon[] POKEMON ={TEST, BULBASAUR, IVYSAUR, VENUSAUR, CHARMANDER, CHARMELEON, CHARIZARD, SQUIRTLE, WARTORTLE, BLASTOISE, CATERPIE, METAPOD, BUTTERFREE, WEEDLE, KAKUNA, BEEDRILL, PIDGEY, PIDGEOTTO, PIDGEOT, RATTATA, RATICATE};
     public  HashMap<String, Pokemon> POKEMON_MAP= new HashMap<>();


    public Pokemons(){
        for(Pokemon pokemon : POKEMON){
            POKEMON_MAP.put(String.valueOf(pokemon.getPokeId()), pokemon);
        }
    }

    //region POKEMON DECLARATION
    public  static final Pokemon TEST = new Pokemon( 0, "Test", "AbilitySlot1 ", "AbilitySlot2", "AbilitySlotHidden ", " Move1", " Move2", " Move3", "Move4 ", R.drawable.shiny_vulpix, R.drawable.vulpix);
    public  static final Pokemon BULBASAUR = new Pokemon( 1, "Bulbasaur", "Overgrow", "_", "Chlorophyll", "Tackle", "Vine Whip", "Poison Powder", "Take Down", R.drawable.shiny_bulbasaur, R.drawable.bulbasaur);

    public  static final Pokemon IVYSAUR = new Pokemon( 2, "Ivysaur", "Overgrow", "_", "Chlorophyll", "Razor Leaf", "Vine Whip", "Poison Powder", "Take Down", R.drawable.shiny_ivysaur, R.drawable.ivysaur);

    public  static final Pokemon VENUSAUR = new Pokemon( 3, "Venusaur", "Overgrow", "_", "Chlorophyll", "Razor Leaf", "Vine Whip", "Poison Powder", "Take Down", R.drawable.shiny_venusaur, R.drawable.venusaur);

    public  static final Pokemon CHARMANDER = new Pokemon( 4, "Charmander", "Blaze", "_", "Solar Power", "Scratch", "Growl", "Ember", "Scary Face", R.drawable.shiny_charmander, R.drawable.charmander);

    public  static final Pokemon CHARMELEON = new Pokemon( 5, "Charmeleon", "Blaze", "_", "Solar Power", "Ember", "Scratch", "Smokescreen", "Dragon Rage", R.drawable.shiny_charmeleon, R.drawable.charmeleon);

    public  static final Pokemon CHARIZARD = new Pokemon( 6, "Charizard", "Blaze", "_", "Solar Power", "Dragon Claw", "Fire Fang", "Slash", "Flame Burst", R.drawable.shiny_charizard, R.drawable.charizard);

    public  static final Pokemon SQUIRTLE = new Pokemon( 7, "Squirtle", "Torrent", "_", "Rain Dish", "Tackle", "Water Gun", "Withdraw", "Bubble", R.drawable.shiny_squirtle, R.drawable.squirtle);

    public  static final Pokemon WARTORTLE = new Pokemon( 8, "Wartortle", "Torrent", "_", "Rain Dish", "Tackle", "Water Gun", "Bite", "Rapid Spin", R.drawable.shiny_wartortle, R.drawable.wartortle);

    public  static final Pokemon BLASTOISE = new Pokemon( 9, "Blastoise", "Torrent", "_", "Rain Dish", "Flash Cannon", "Aqua Tail", "Skull Bash", "Iron Defense", R.drawable.shiny_blastoise, R.drawable.blastoise);

    public  static final Pokemon CATERPIE = new Pokemon( 10, "Caterpie", "Shield Dust", "_", "Run Away", "Tackle", "String Shot", "Bug Bite", " ", R.drawable.shiny_caterpie, R.drawable.caterpie);

    public  static final Pokemon METAPOD = new Pokemon( 11, "Metapod", "Shed Skin", "_", " ", "Harden", "", "", "", R.drawable.shiny_metapod, R.drawable.metapod);

    public  static final Pokemon BUTTERFREE = new Pokemon( 12, "Butterfree", "Compound Eyes ", "_", "Tinted Lens", "Gust", "Confusion", "Poison Powder", "Stun Spore", R.drawable.shiny_butterfree, R.drawable.butterfree);

    public  static final Pokemon WEEDLE = new Pokemon( 13, "Weedle", "Shield Dust", "_", "Run Away", "Poison Sting", "String Shot", "Bug Bite", "", R.drawable.shiny_weedle, R.drawable.weedle);

    public  static final Pokemon KAKUNA = new Pokemon( 14, "Kakuna", "Shed Skin", "_", " ", "Harden", " ", " ", " ", R.drawable.shiny_kakuna, R.drawable.kakuna);

    public  static final Pokemon BEEDRILL = new Pokemon( 15, "Beedrill", "Swarm", "_", "Sniper", "Twineedle", "Fury Attack", "Rage", "Pursuit", R.drawable.shiny_beedrill, R.drawable.beedrill);

    public  static final Pokemon PIDGEY = new Pokemon( 16, "Pidgey", "Keen Eye", "Tangled Feet", "Big Pecks", "Tackle", "Sand Attack", "Gust", "Quick Attack", R.drawable.shiny_pidgey, R.drawable.pidgey);

    public  static final Pokemon PIDGEOTTO = new Pokemon( 17, "Pidgeotto", "Keen Eye", "Tangled Feet", "Big Pecks", "Gust", "Quick Attack", "Whirlwind", "Twister", R.drawable.shiny_pidgeotto, R.drawable.pidgeotto);

    public  static final Pokemon PIDGEOT = new Pokemon( 18, "Pidgeot", "Keen Eye", "Tangled Feet", "Big Pecks", "Wing Attack", "Agility", "Roost", "Feather Dance", R.drawable.shiny_pidgeot, R.drawable.pidgeot);

    public  static final Pokemon RATTATA = new Pokemon( 19, "Rattata", "Run Away", "Guts", "Hustle", "Tackle", "Tail Whip", "Quick Attack", "Focus Energy", R.drawable.shiny_rattata, R.drawable.rattata);

    public  static final Pokemon RATICATE = new Pokemon( 20, "Raticate", "Run Away", "Guts", "Hustle", "Hyper Fang", "Assurance", "Crunch", "Pursuit", R.drawable.shiny_raticate, R.drawable.raticate);

//endregion

}
