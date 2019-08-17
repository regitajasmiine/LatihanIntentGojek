package com.example.gojek;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainMenu extends AppCompatActivity implements View.OnClickListener {
    ImageView food;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        food = (ImageView)findViewById(R.id.img4);
        food.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        Intent food = new Intent(MainMenu.this ,OrderFood.class);
        startActivity(food);
    }
}
