package com.victorstudio.swapme0_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class thirdActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnBack;
    private Button nextBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        btnBack = (Button) findViewById(R.id.btnBack);
        nextBtn = (Button) findViewById(R.id.nextBtn);
        nextBtn.setOnClickListener(this);
        btnBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        if (v.getId() == R.id.btnBack) {
            intent = new Intent(this, SecondActivity.class);
        }else{
            intent = new Intent(this, fourthActivity.class);
        }
        startActivity(intent);
        finish();
    }
}