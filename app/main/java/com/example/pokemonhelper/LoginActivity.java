package com.example.pokemonhelper;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.pokemonhelper.models.MyDB;

public class LoginActivity extends AppCompatActivity {
    EditText name,pass;
    static MyDB myDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        name= (EditText) findViewById(R.id.username);
        pass = (EditText) findViewById(R.id.password);
        myDB=new MyDB(this);
    }

    //Logic for Login
    public void loginCheck(View v) {
        String email=name.getText().toString().trim();
        String pass1=pass.getText().toString().trim();
        Cursor c=LoginActivity.myDB.loginCheck(email);
        c.moveToFirst();
        if (c==null){
            Toast.makeText(LoginActivity.this, "invalid Credentials  for "+email,Toast.LENGTH_LONG ).show();;
            name.setText("");
            pass.setText("");

        }else{
            String name2=c.getString(0);
            String pass2=c.getString(1);

        }
    }

    //Logic for Register
    public void register(View v) {
        Intent i= new Intent(LoginActivity.this, RegisterActivity.class);
        startActivity(i);

    }

    public void back(View v) {
        Intent i= new Intent(LoginActivity.this, MainActivity.class);
        startActivity(i);

    }
}
