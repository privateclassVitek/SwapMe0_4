package com.victorstudio.swapme0_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class Registration extends AppCompatActivity implements View.OnClickListener {

   private EditText registration_Phone, registration_Email,registration_second_name, registration_name;
   private Button registration, google_to_com_in, facebook_to_com_in, to_come_in;
   private Button previus_on_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        init();
    }

    private void init(){
        registration_second_name = (EditText) findViewById(R.id.registration_second_name);
        registration_name = (EditText) findViewById(R.id.registration_name);

        registration_Phone = (EditText) findViewById(R.id.registration_Phone);
        registration_Email = (EditText) findViewById(R.id.registration_Email);

        registration = (Button) findViewById(R.id.registration);
        google_to_com_in = (Button) findViewById(R.id.google_to_com_in);
        facebook_to_com_in = (Button) findViewById(R.id.facebook_to_com_in);
        to_come_in = (Button) findViewById(R.id.to_come_in);
        previus_on_login = (Button) findViewById(R.id.previus_on_login);
        previus_on_login.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.previus_on_login:
                intent = new Intent(Registration.this, activity_login.class);
                startActivity(intent);
                finish();
                break;
            //case:
        }

    }
}