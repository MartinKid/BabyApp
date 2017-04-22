package com.example.martinkid.babyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public class OpeningActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening);
    }

    public void pressAddBabyButton(View view){
        Intent addBaby = new Intent(this, CreateBaby.class);
        startActivity(addBaby);
    }
}
