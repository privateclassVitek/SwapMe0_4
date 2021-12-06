package com.victorstudio.swapme0_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class activity_login extends AppCompatActivity implements View.OnClickListener {
    private EditText to_come_in_EmailAddress, to_come_in_password;
    private Button forgot_password, to_come_in, google_registration, facebook_registration, button_registration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
    }

    private void init(){
        to_come_in_EmailAddress = (EditText) findViewById(R.id.to_come_in_EmailAddress);
        to_come_in_password = (EditText) findViewById(R.id.to_come_in_password);
        forgot_password = (Button) findViewById(R.id.forgot_password);
        to_come_in = (Button) findViewById(R.id.to_come_in);
        google_registration = (Button) findViewById(R.id.google_registration);
        facebook_registration = (Button) findViewById(R.id.facebook_registration);
        button_registration = (Button) findViewById(R.id.button_registration);

        forgot_password.setOnClickListener(this);
        to_come_in.setOnClickListener(this);
        google_registration.setOnClickListener(this);
        facebook_registration.setOnClickListener(this);
        button_registration.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.button_registration:
                intent = new Intent(activity_login.this, Registration.class);
                startActivity(intent);
                break;
            case R.id.google_registration:
               // intent = new Intent(activity_login.this, Genre_selection.class);
               // startActivity(intent);
                break;
            case R.id.facebook_registration:
                //intent = new Intent(activity_login.this, )
                //startActivity(intent);
                break;
            case R.id.to_come_in:
                intent = new Intent(activity_login.this, Genre_selection.class );
                startActivity(intent);
                break;
            case R.id.forgot_password:
                //intent = new Intent(activity_login.this, );
                //startActivity(intent);
        }
    }
}