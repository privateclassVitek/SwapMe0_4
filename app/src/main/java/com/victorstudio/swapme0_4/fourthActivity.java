package com.victorstudio.swapme0_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fourthActivity extends AppCompatActivity implements View.OnClickListener {
    private Button previous4;
    private Button btnNext4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        previous4 = (Button) findViewById(R.id.skip_present);
        btnNext4 = (Button) findViewById(R.id.btnNext4);

        previous4.setOnClickListener(this);
        btnNext4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        if(v.getId() == R.id.skip_present){
            intent = new Intent(this, thirdActivity.class);

        }else{
            intent = new Intent(this, activity_login.class);
        }
        startActivity(intent);
        finish();
    }
}