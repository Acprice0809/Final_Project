package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Drinks_menu extends AppCompatActivity {
    RadioGroup radioGroup2;
    RadioButton Coco_Cola;
    RadioButton Diet_Cola;
    RadioButton Sprite;
    RadioButton Fanta;
    RadioButton Root_Beer;
    Button Backbutton;
    Button Nextbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks_menu);
        radioGroup2 = findViewById(R.id.radioGroup2);
        Coco_Cola = findViewById(R.id.Coco_Cola);
        Diet_Cola = findViewById(R.id.Diet_Cola);
        Sprite = findViewById(R.id.Sprite);
        Fanta = findViewById(R.id.Fanta);
        Root_Beer = findViewById(R.id.Root_Beer);
        Backbutton = findViewById(R.id.Backbutton);
        Nextbutton = findViewById(R.id.Nextbutton);

        Backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sp = getSharedPreferences("shared", MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                if (Coco_Cola.isChecked()) {
                    editor.putString("Choice", "Coco Cola");
                } else if (Diet_Cola.isChecked()) {
                    editor.putString("Choice","Diet Cola");
                } else if (Sprite.isChecked()) {
                    editor.putString("Choice", "Sprite");
                } else if (Fanta.isChecked()) {
                    editor.putString("Choice", "Fanta");
                } else if (Root_Beer.isChecked()) {
                    editor.putString("Choice", "Root Beer");
                }
                Intent i = new Intent(getApplicationContext(),Pizza_menu.class);
                startActivity(i);
            }
        });

        Nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sp = getSharedPreferences("shared", MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                if (Coco_Cola.isChecked()) {
                    editor.putString("Choice", "Coco Cola");
                } else if (Diet_Cola.isChecked()) {
                    editor.putString("Choice","Diet Cola");
                } else if (Sprite.isChecked()) {
                    editor.putString("Choice", "Sprite");
                } else if (Fanta.isChecked()) {
                    editor.putString("Choice", "Fanta");
                } else if (Root_Beer.isChecked()) {
                    editor.putString("Choice", "Root Beer");
                }
                Intent j = new Intent(getApplicationContext(),Dessert_menu.class);
                startActivity(j);
            }
        });
    }

    private void updatechoice() {
        SharedPreferences sp = getSharedPreferences("shared", MODE_PRIVATE);
        String Choice = sp.getString("Choice", "Sprite");
        if (Choice.equals("Coco Cola")) {
            Coco_Cola.setChecked(true);
        } else if (Choice.equals("Diet Cola")) {
            Diet_Cola.setChecked(true);
        } else if (Choice.equals("Sprite")) {
            Sprite.setChecked(true);
        } else if (Choice.equals("Fanta")) {
            Fanta.setChecked(true);
        } else if (Choice.equals("Root Beer")) {
            Root_Beer.setChecked(true);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        updatechoice();
    }
}