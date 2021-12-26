package com.example.framlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imageviewOne,imageviewtwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageviewOne = findViewById(R.id.image1);
        imageviewtwo = findViewById(R.id.image2);

        imageviewOne.setOnClickListener(this);
        imageviewtwo.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if(view.getId() == R.id.image1){
            imageviewOne.setVisibility(view.GONE);
            imageviewtwo.setVisibility(view.VISIBLE);
        }else if(view.getId() == R.id.image2){
            imageviewOne.setVisibility(view.VISIBLE);
            imageviewtwo.setVisibility(view.GONE);
        }

    }
}