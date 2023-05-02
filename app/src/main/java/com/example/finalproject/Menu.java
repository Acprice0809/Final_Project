package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Menu extends AppCompatActivity {
    Button Pizzabutton;
    Button Drinkbutton;
    Button Dessertbutton;
    Button Paybutton;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
       Pizzabutton = findViewById(R.id.Pizzabutton);
        Drinkbutton = findViewById(R.id.Drinkbutton);
        Dessertbutton = findViewById(R.id.Dessertbutton);
        Paybutton = findViewById(R.id.Paybutton);


        Pizzabutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Pizza_menu.class);
                startActivity(i);
            }
        });

        Drinkbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(getApplicationContext(),Drinks_menu.class);
                startActivity(j);
            }
        });

        Dessertbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k = new Intent(getApplicationContext(),Dessert_menu.class);
                startActivity(k);
            }
        });

        Paybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l = new Intent(getApplicationContext(),Total_menu.class);
                startActivity(l);
            }
        });
        }
    }
