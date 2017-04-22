package com.example.martinkid.babyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CreateBaby extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_baby);
    }

    public void pressNextButton(View view){
        Intent procNextView = new Intent(this, CreateBabyPt2.class);
        startActivity(procNextView);
        String babyName = view.findViewById(R.id.firstName).toString();
        int babyGender = view.findViewById(R.id.weightText);
    }
}
