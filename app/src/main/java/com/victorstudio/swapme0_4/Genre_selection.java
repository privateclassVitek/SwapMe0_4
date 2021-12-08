package com.victorstudio.swapme0_4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class Genre_selection extends AppCompatActivity implements View.OnClickListener {

    int coutCategory = 0;

    ImageView bussines_book;
    ImageView baby_book;
    ImageView adventure_book;
    ImageView classic_book;
    ImageView detectives_book;
    ImageView fantastic_book;
    ImageView horrors_book;
    ImageView humor_book;
    ImageButton imageView_back_login;

    CheckBox checkBox_bussines_book;
    CheckBox checkBox_baby_book;
    CheckBox checkBox_adventure_book;
    CheckBox checkBox_classic_book;
    CheckBox checkBox_detectives_book;
    CheckBox checkBox_fantastic_book;
    CheckBox checkBox_horrors_book;
    CheckBox checkBox_humor_book;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genre_selection);
        init();
    }

    public void init() {
        imageView_back_login = (ImageButton) findViewById(R.id.imageView_back_login);

        bussines_book = findViewById(R.id.bussines_book);
        baby_book = findViewById(R.id.baby_book);
        adventure_book = findViewById(R.id.adventure_book);
        classic_book = findViewById(R.id.classic_book);
        detectives_book = findViewById(R.id.detectives_book);
        fantastic_book = findViewById(R.id.fantastic_book);
        horrors_book = findViewById(R.id.horrors_book);
        humor_book = findViewById(R.id.humor_book);

        checkBox_bussines_book = findViewById(R.id.checkbox_bussines_book);
        checkBox_baby_book = findViewById(R.id.checkbox_baby_book);
        checkBox_adventure_book = findViewById(R.id.checkbox_adventure_book);
        checkBox_classic_book = findViewById(R.id.checkbox_classic_book);
        checkBox_detectives_book = findViewById(R.id.checkbox_detectives_book);
        checkBox_fantastic_book = findViewById(R.id.checkbox_fantastic_book);
        checkBox_horrors_book = findViewById(R.id.checkbox_horrors_book);
        checkBox_humor_book = findViewById(R.id.checkbox_humor_book);

        bussines_book.setOnClickListener(this);
        baby_book.setOnClickListener(this);
        adventure_book.setOnClickListener(this);
        classic_book.setOnClickListener(this);
        detectives_book.setOnClickListener(this);
        fantastic_book.setOnClickListener(this);
        horrors_book.setOnClickListener(this);
        humor_book.setOnClickListener(this);

        imageView_back_login.setOnClickListener(this);

    }
    public void onClicBackToLogin(@NonNull  View view) {
        Intent intent;
        if(view.getId() == R.id.imageView_back_login) {
            intent = new Intent(this, activity_login.class);
            startActivity(intent);
            finish();
        }
    }


    @Override
    public void onClick(View v) {
        if (coutCategory < 5) {
        Intent intent;

            switch (v.getId()) {


                case R.id.bussines_book:
                    if (checkBox_bussines_book.isChecked()) {
                        checkBox_bussines_book.setChecked(false);
                        coutCategory--;
                    } else {
                        checkBox_bussines_book.setChecked(true);
                        coutCategory++;
                    }
                    break;
                case R.id.baby_book:
                    if (checkBox_baby_book.isChecked()) {
                        checkBox_baby_book.setChecked(false);
                        coutCategory--;
                    } else {
                        checkBox_baby_book.setChecked(true);
                        coutCategory++;
                    }
                    break;
                case R.id.adventure_book:
                    if (checkBox_adventure_book.isChecked()) {
                        checkBox_adventure_book.setChecked(false);
                        coutCategory--;
                    } else {
                        checkBox_adventure_book.setChecked(true);
                        coutCategory++;
                    }
                    break;
                case R.id.classic_book:
                    if (checkBox_classic_book.isChecked()) {
                        checkBox_classic_book.setChecked(false);
                        coutCategory--;
                    } else {
                        checkBox_classic_book.setChecked(true);
                        coutCategory++;
                    }
                    break;
                case R.id.detectives_book:
                    if (checkBox_detectives_book.isChecked()) {
                        checkBox_detectives_book.setChecked(false);
                        coutCategory--;
                    } else {
                        checkBox_detectives_book.setChecked(true);
                        coutCategory++;
                    }
                    break;
                case R.id.fantastic_book:
                    if (checkBox_fantastic_book.isChecked()) {
                        checkBox_fantastic_book.setChecked(false);
                        coutCategory--;
                    } else {
                        checkBox_fantastic_book.setChecked(true);
                        coutCategory++;
                    }
                    break;
                case R.id.horrors_book:
                    if (checkBox_horrors_book.isChecked()) {
                        checkBox_horrors_book.setChecked(false);
                        coutCategory--;
                    } else {
                        checkBox_horrors_book.setChecked(true);
                        coutCategory++;
                    }
                    break;
                case R.id.humor_book:
                    if (checkBox_humor_book.isChecked()) {
                        checkBox_humor_book.setChecked(false);
                        coutCategory--;
                    } else {
                        checkBox_humor_book.setChecked(true);
                        coutCategory++;
                    }
                    break;
                default:
                    if (v.getId() == R.id.imageView_back_login) {
                        intent = new Intent(this, activity_login.class);
                        startActivity(intent);
                        finish();

                    }
            }
        }
    }


}