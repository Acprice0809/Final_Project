package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Dessert_menu extends AppCompatActivity {
    RadioGroup radioGroup3;
    RadioButton LavaCake;
    RadioButton Cheesecake;
    RadioButton Strawberryshortcake;
    Button BackButton;
    Button NextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert_menu);
        radioGroup3 = findViewById(R.id.radioGroup3);
        LavaCake = findViewById(R.id.LavaCake);
        Cheesecake = findViewById(R.id.Cheesecake);
        Strawberryshortcake = findViewById(R.id.Strawberryshortcake);
        BackButton =findViewById(R.id.BackButton);
        NextButton = findViewById(R.id.NextButton);

        BackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sp = getSharedPreferences("shared", MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                if (LavaCake.isChecked()) {
                    editor.putString("Choice", "Lava Cake");
                } else if (Cheesecake.isChecked()) {
                    editor.putString("Choice", "Cheesecake");
                } else if (Strawberryshortcake.isChecked()) {
                    editor.putString("Choice", "Strawberry Shortcake");
                }
                Intent i = new Intent(getApplicationContext(),Drinks_menu.class);
                startActivity(i);
            }
        });

        NextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sp = getSharedPreferences("shared", MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                if (LavaCake.isChecked()) {
                    editor.putString("Choice", "Lava Cake");
                } else if (Cheesecake.isChecked()) {
                    editor.putString("Choice", "Cheesecake");
                } else if (Strawberryshortcake.isChecked()) {
                    editor.putString("Choice", "Strawberry Shortcake");
                }
                Intent j = new Intent(getApplicationContext(),Menu.class);
                startActivity(j);
            }
        });
    }

    private void updateChoice() {
        SharedPreferences sp = getSharedPreferences("shared", MODE_PRIVATE);
        String Choice= sp.getString("Choice", "Cheesecake");
        if (Choice.equals("Lava Cake")) {
            LavaCake.setChecked(true);
        } else if (Choice.equals("Cheesecake")) {
            Cheesecake.setChecked(true);
        } else if (Choice.equals("Strawberry Shortcake")) {
            Strawberryshortcake.setChecked(true);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        updateChoice();
    }
}