package com.example.pokemonhelper.models;
import android.os.Parcel;

import java.util.List;

public class Pokemon {

    private static final String TAG = "Pokemon";

    private int PokeId;
    private String Pokename;
    private String AbilitySlot1;
    private String AbilitySlot2;
    private String AbilitySlotHidden;
    private String Move1;
    private String Move2;
    private String Move3;
    private String Move4;
    private int image;
    private int Shinyimage;


    public Pokemon(int PokeId, String Pokename, String AbilitySlot1, String AbilitySlot2, String AbilitySlotHidden, String Move1,String Move2,String Move3,String Move4, int Shinyimage , int image){
        this.PokeId = PokeId;
        this.Pokename = Pokename;
        this.AbilitySlot1 = AbilitySlot1;
        this.AbilitySlot2 = AbilitySlot2;
        this.AbilitySlotHidden = AbilitySlotHidden;
        this.Move1 = Move1;
        this.Move2 = Move2;
        this.Move3 = Move3;
        this.Move4 = Move4;
        this.Shinyimage = Shinyimage;
        this.image = image;


    }

    public Pokemon(List<Pokemon> IDs, String s, int i){

    }
    protected Pokemon(Parcel in){


    }


    public int getPokeId(){
        return  PokeId;
    }

    public  String getPokename(){
        return Pokename;
    }
    public  void  setPokename(String pokename){
        this.Pokename = pokename;
    }

    public String getMove1() {
        return Move1;
    }
    public   void  setMove1(String move1){
        this.Move1 = move1;
    }
    public String getMove2() {
        return Move2;
    }
    public  void  setMove2(String move2){
        this.Move2 = move2;
    }
    public String getMove3() {
        return Move3;
    }
    public void   setMove3(String move3){
        this.Move3= move3;
    }

    public String getMove4() {
        return Move4;
    }
    public void   setMove4(String Move4){
        this.Move4 = Move4;
    }

    public int  getImage(){
        return image;
    }
    public void  setImage(int image){

        this.image = image;
    }

    public int  getShinyimage(){
        return Shinyimage;
    }
    public void  setShinyimage(int shinyimage){
        this.Shinyimage = shinyimage;
    }

}


