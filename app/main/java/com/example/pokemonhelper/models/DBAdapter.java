package com.example.pokemonhelper.models;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.ArrayRes;

import java.util.ArrayList;

public class DBAdapter extends SQLiteOpenHelper {
    private SQLiteDatabase mDatabase;
    public static final String DBName = "Pokemon.db";
    public static String DBPath = "";
    private Context mcontext;

    public DBAdapter(Context context) {
        super(context, DBName, null, 2);
        this.mcontext = context;
        this.DBPath = "/data/data" + context.getPackageName() + "/" + "databases/";

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


    public void openDatabase() {
        String dbPath = mcontext.getDatabasePath(DBName).getPath();
        if (mDatabase != null && mDatabase.isOpen()) {
            return;
        }
        mDatabase = SQLiteDatabase.openDatabase(dbPath, null, SQLiteDatabase.OPEN_READWRITE);
    }

    public void closeDatabase() {
        if (mDatabase != null) {
            mDatabase.close();
        }
    }

    //SQL FUNCTIONS
    //DATA TO STRING ARRAYS
    public ArrayList<String> getAllPID() {
        openDatabase();
        Cursor cursor = mDatabase.rawQuery("SELECT * FROM Pokemon", null);
        ArrayList<String> pIDList = new ArrayList<String>();
        while (cursor.moveToNext()) {
            pIDList.add(cursor.getString(1));
        }
        cursor.close();
        closeDatabase();
        return pIDList;

    }

    public String getAllPName(String meanW) {
        openDatabase();
        Cursor cursor = mDatabase.rawQuery("SELECT * FROM Pokemon ='" + meanW + "';", null);
        ArrayList<String> pNameList = new ArrayList<String>();
        while (cursor.moveToNext()) {
            meanW = cursor.getString(2);
        }
        cursor.close();
        closeDatabase();
        return meanW;

    }



    public ArrayList<String> PredictedMoves(String UchosenID,String UchosenLevel) {
        //GET VALUES

        //GET MOVESET
        Cursor cursor = mDatabase.rawQuery("SELECT * FROM Moveset WHERE PokeID ==" + UchosenID + " AND LevelLearnt ==" + UchosenLevel + " LIMIT 4 ", null);
        ArrayList<String> Pmoves = new ArrayList<>();
        while (cursor.moveToNext()) {
            Pmoves.add(cursor.getString(1));
        }
        cursor.close();
        closeDatabase();
        return Pmoves;

    }
}