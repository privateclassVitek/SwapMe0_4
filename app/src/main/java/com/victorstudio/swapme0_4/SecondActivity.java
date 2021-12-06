package com.victorstudio.swapme0_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    private Button skip_present;
    private Button btnNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        skip_present = (Button) findViewById(R.id.skip_present);
        btnNext = (Button) findViewById(R.id.btnNext4);
        btnNext.setOnClickListener(this);

        skip_present.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent;
        if (v.getId() == R.id.skip_present) {
            intent = new Intent(this, activity_login.class);
        }else{
            intent = new Intent(this, thirdActivity.class);
        }
        startActivity(intent);


    }
}