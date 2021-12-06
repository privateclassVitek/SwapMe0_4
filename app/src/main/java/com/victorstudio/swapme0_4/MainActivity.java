package com.victorstudio.swapme0_4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ConstraintLayout next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        next = (ConstraintLayout) findViewById(R.id.next);
        next.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent;
        if (v.getId() == R.id.next) {
            intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
            finish();
        }
    }
}