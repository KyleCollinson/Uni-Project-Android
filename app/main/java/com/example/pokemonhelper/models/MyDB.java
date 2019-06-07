package com.example.pokemonhelper.models;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;
                                                                                                            //DB ADDITION FOR LOGIN/REGISTER SYSTEM
public class MyDB extends SQLiteOpenHelper {
    Context c;
    public static String  DBNAME="LoginSystem";
    public static int VERSION=1;
    public MyDB(Context context){
        super(context,DBNAME, null,VERSION);
        c=context;


    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try{
            String qry="create table User(Username TEXT, Email TEXT PRIMARY KEY ,  Password TEXT)";
            db.execSQL(qry);
            Toast.makeText(c, "Table Created Successfully", Toast.LENGTH_LONG).show ();
        }catch (Exception e){
            Log.e("MyDB ", "Table Creation Error",e);

        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    //REGISTER AND LOG IN

    //PERSISTENT LOGIC FOR RECORD INSERTION INTO Database TABLE FOR USER
    public  boolean insertData(String Username, String Email, String Password) {
        try {                                                                        //Strings require both ' & ", intergers and floats only require "
            String qry = "insert into User values('" + Username + "','" + Email + "', '" + Password + "')";
            SQLiteDatabase db = getWritableDatabase();
            db.execSQL(qry);
            Toast.makeText(c, Username + " Record Inserted Successfully ", Toast.LENGTH_LONG).show();
            return true;
        } catch (Exception e) {
            Log.e("MyDB ", "Record Insertion Error", e);

            return false;
        }
    }
    public Cursor loginCheck(String email){
        try{
            String qry="Select Username, Password from User where Email='"+email+"'";
            SQLiteDatabase db=getWritableDatabase();
            Cursor c= db.rawQuery(qry, null );
            return c;
        }catch (Exception e){
            Log.e("MyDB ", "Logical Error-Login", e);
            return null;
        }
    }

}

