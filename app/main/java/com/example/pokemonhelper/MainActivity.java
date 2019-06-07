package com.example.pokemonhelper;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.example.pokemonhelper.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding mBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        Context context;
    }

    public void TEST(View view){
        Intent i= new Intent(MainActivity.this, CounterActivity.class);
        startActivity(i);
    }

    public void Hunt(View view) {
        Intent i= new Intent(MainActivity.this, InputActivity.class);
        startActivity(i);

    }

    public void Login(View view) {
        Intent i= new Intent(MainActivity.this, LoginActivity.class);
        startActivity(i);

    }

    public void Register(View view) {
        Intent i= new Intent(MainActivity.this, RegisterActivity.class);
        startActivity(i);

    }
}
