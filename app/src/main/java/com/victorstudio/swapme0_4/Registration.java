package com.victorstudio.swapme0_4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Registration extends AppCompatActivity  {
    private FirebaseAuth mAuth;

   private EditText registration_Phone, registration_Email,registration_second_name, registration_name, registration_Password;
   private Button registration, google_to_com_in, facebook_to_com_in, to_come_in;
   private Button previus_on_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        init();
    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser currentUser = mAuth.getCurrentUser();

    }

    private void init(){
        registration_second_name = (EditText) findViewById(R.id.registration_second_name);
        registration_name = (EditText) findViewById(R.id.registration_name);

        registration_Phone = (EditText) findViewById(R.id.registration_Phone);
        registration_Email = (EditText) findViewById(R.id.registration_Email);
        registration_Password = (EditText) findViewById(R.id.registration_password);

        registration = (Button) findViewById(R.id.registration);
        google_to_com_in = (Button) findViewById(R.id.google_to_com_in);
        facebook_to_com_in = (Button) findViewById(R.id.facebook_to_com_in);
        to_come_in = (Button) findViewById(R.id.to_come_in);
        previus_on_login = (Button) findViewById(R.id.previus_on_login);

        mAuth = FirebaseAuth.getInstance();


    }

    public void onClickSingUp(View view){
        if(!TextUtils.isEmpty(registration_Email.getText().toString()) && !TextUtils.isEmpty(registration_Password.getText().toString())) {
            mAuth.createUserWithEmailAndPassword(registration_Email.getText().toString(), registration_Password.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()){
                        Toast.makeText(getApplicationContext(), "Пользователь зарегистрировался", Toast.LENGTH_LONG).show();

                    }else {
                        Toast.makeText(getApplicationContext(), "Пользователь с такими данными уже существует! Или вы ввели не правлильный Email", Toast.LENGTH_LONG).show();
                    }
                }
            });
        } else {
            Toast.makeText(getApplicationContext(), "Заполните поля", Toast.LENGTH_LONG).show();
        }

    }

    public void onClickBack(View view){
        Intent intent = new Intent(this, activity_login.class);
        startActivity(intent);
        onStop();

    }


}