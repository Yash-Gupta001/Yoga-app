// food & nutritions page

package com.example.yogaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Food_Activity_Details extends AppCompatActivity {


    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_details);



        textview = findViewById(R.id.txt);
        String dstory = getIntent().getStringExtra("story");
        textview.setText(dstory);
    }

    public void gooback(View view) {

        Intent intent = new Intent(Food_Activity_Details.this,FoodActivity.class);
        startActivity(intent);
        finish();


    }


    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Food_Activity_Details.this,FoodActivity.class);
        startActivity(intent);
        finish();
    }
}