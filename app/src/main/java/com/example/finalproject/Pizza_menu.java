package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Pizza_menu extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton Cheese;
    RadioButton Pepperoni;
    RadioButton Sausage;
    RadioGroup toppinggroup;
    RadioButton Xtra_Cheese;
    RadioButton Beef;
    RadioButton Mushshrooms;
    RadioButton Pineapple;
    RadioButton Fried_Onions;
    Button Next;
    Button Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_menu);
        radioGroup = findViewById(R.id.radioGroup);
        Cheese = findViewById(R.id.Cheese);
        Pepperoni = findViewById(R.id.Pepperoni);
        Sausage = findViewById(R.id.Sausage);
        toppinggroup = findViewById(R.id.toppinggroup);
        Xtra_Cheese = findViewById(R.id.Xtra_Cheese);
        Pepperoni = findViewById(R.id.Pepperoni);
        Beef = findViewById(R.id.Beef);
        Mushshrooms = findViewById(R.id.Mushshrooms);
        Pineapple = findViewById(R.id.Pineapple);
        Fried_Onions = findViewById(R.id.Fried_Onions);
        Next = findViewById(R.id.Next);
        Back = findViewById(R.id.Back);


        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sp = getSharedPreferences("shared", MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                if (Cheese.isChecked()) {
                    editor.putString("Type", "Cheese");
                } else if (Pepperoni.isChecked()) {
                    editor.putString("Type", "Pepperoni");
                } else if (Sausage.isChecked()) {
                    editor.putString("Type", "Sausage");
                }
                if (Xtra_Cheese.isChecked()) {
                    editor.putString("Toppings", "Xtra Cheese");
                } else if (Beef.isChecked()) {
                    editor.putString("Toppings", "Beef");
                } else if (Mushshrooms.isChecked()) {
                    editor.putString("Toppings", "Mushrooms");
                } else if (Pineapple.isChecked()) {
                    editor.putString("Toppings", "Pineapple");
                } else if (Fried_Onions.isChecked()) {
                    editor.putString("Toppings", "Fried Onions");
                }
                editor.commit();
                Intent i = new Intent(getApplicationContext(), Drinks_menu.class);
                startActivity(i);
            }
        });

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sp = getSharedPreferences("shared", MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                if (Cheese.isChecked()) {
                    editor.putString("Type", "Cheese");
                } else if (Pepperoni.isChecked()) {
                    editor.putString("Type", "Pepperoni");
                } else if (Sausage.isChecked()) {
                    editor.putString("Type", "Sausage");
                }
                if (Xtra_Cheese.isChecked()) {
                    editor.putString("Toppings", "Xtra Cheese");
                } else if (Beef.isChecked()) {
                    editor.putString("Toppings", "Beef");
                } else if (Mushshrooms.isChecked()) {
                    editor.putString("Toppings", "Mushrooms");
                } else if (Pineapple.isChecked()) {
                    editor.putString("Toppings", "Pineapple");
                } else if (Fried_Onions.isChecked()) {
                    editor.putString("Toppings", "Fried Onions");
                }
                editor.commit();
                Intent j = new Intent(getApplicationContext(), Menu.class);
                startActivity(j);
            }
        });
    }

    private void updatetype() {
        SharedPreferences sp = getSharedPreferences("shared", MODE_PRIVATE);
        String type = sp.getString("Type", "Cheese");
        if (type.equals("Cheese")) {
            Cheese.setChecked(true);
        } else if (type.equals("Pepperoni")) {
            Pepperoni.setChecked(true);
        } else if (type.equals("Sausage")) {
            Sausage.setChecked(true);
        }
    }

    private void updatetoppings() {
        SharedPreferences sp = getSharedPreferences("shared", MODE_PRIVATE);
        String toppings = sp.getString("Toppings", "Xtra Cheese");
        if (toppings.equals("Xtra Cheese")) {
            Xtra_Cheese.setChecked(true);
        } else if (toppings.equals("Beef")) {
            Beef.setChecked(true);
        } else if (toppings.equals("Mushrooms")) {
            Mushshrooms.setChecked(true);
        } else if (toppings.equals("Pineapple")) {
            Pineapple.setChecked(true);
        } else if (toppings.equals("Fried Onions")) {
            Fried_Onions.setChecked(true);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        updatetype();
        updatetoppings();
    }
}