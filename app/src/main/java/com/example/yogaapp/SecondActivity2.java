// Before age 18 screen

package com.example.yogaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SecondActivity2 extends AppCompatActivity {


    int[] newArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

// activities which are defined in activity_second.xml are defined in a array

        newArray = new int[]{

                R.id.mountain,
                R.id.basiccrunches,
                R.id.benchdips,
                R.id.bicyclecrunches,
                R.id.legraise,
                R.id.alternative,
                R.id.legupcrunches,
                R.id.situp,
                R.id.alternativev,
                R.id.plankrotation,
                R.id.plankwithleftleg,
                R.id.russiantwist,
                R.id.bridge,
                R.id.verticalleg,
                R.id.windmill,

        };
    }

    public void Imagebuttonclicked(View view) {


        for(int i=0;i<newArray.length;i++){

            if(view.getId() == newArray[i]){
                int value = i+1;
                Log.i("FIRST",String.valueOf(value));
                Intent intent = new Intent(SecondActivity2.this,ThirdActivity.class);
                intent.putExtra("value",String.valueOf(value));
                startActivity(intent);
            }
        }




    }
}