package com.example.pokemonhelper;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.pokemonhelper.models.MyDB;

public class RegisterActivity extends AppCompatActivity {

    EditText et1, et2, et3;
    static MyDB myDB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        et1=(EditText)findViewById(R.id.username);
        et2=(EditText)findViewById(R.id.email);
        et3=(EditText)findViewById(R.id.password1);
        et1=(EditText)findViewById(R.id.username);
        et2=(EditText)findViewById(R.id.email);
        et3=(EditText)findViewById(R.id.password1);

    }
    //Logic 2 call insert data of MYDB class
    public void saveData(View v){
        String Username=et1.getText().toString().trim();
        String Email=et2.getText().toString().trim();
        String Password=et3.getText().toString().trim();

        boolean result = RegisterActivity.myDB.insertData(Username, Email, Password);

        if(result){
            Toast.makeText(RegisterActivity.this,Username+"Registered", Toast.LENGTH_LONG).show();
            //finish method
            et1.setText("");
            et2.setText("");
            et3.setText("");

        }else{
            AlertDialog.Builder ad=new AlertDialog.Builder(this );
            ad.setMessage("Invalid Input");
            ad.show();
        }
        et3.setText("");
    }

    public void goBack(View v){
        Intent i= new Intent(RegisterActivity.this, MainActivity.class);
        startActivity(i);


    }


    public void login(View view) {
        Intent i= new Intent(RegisterActivity.this, LoginActivity.class);
        startActivity(i);
    }
}
