package com.example.pokemonhelper.models;

public class Globals {
    private static Globals instance;
    private static String UchosenID;
    private static String UchosenLevel;
    private static String UMoves;

    Globals g = Globals.getInstance();

    public  void  setUchosenID(String t){
            Globals.UchosenID =t;
    }
    public String getUchosenID(){
    return Globals.UchosenID;
    }


    public  void  setUchosenLevel(String t){
        Globals.UchosenLevel =t;
    }
    public String getUchosenLevel(){
        return Globals.UchosenLevel;
    }

    public  void  setUMoves(String t){
        Globals.UMoves =t;
    }
    public String getUMoves(){
        return Globals.UMoves;
    }

    public static synchronized Globals getInstance(){
        if (instance==null){
            instance = new Globals();
        } return instance;
    }


}
