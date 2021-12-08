package com.victorstudio.swapme0_4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class activity_login extends AppCompatActivity  {
    private FirebaseAuth mAuth;
    private EditText to_come_in_EmailAddress, to_come_in_password;
    private Button forgot_password, to_come_in, google_registration, facebook_registration, button_registration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
    }
    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser currentUser = mAuth.getCurrentUser();

    }

    private void init(){
        to_come_in_EmailAddress = (EditText) findViewById(R.id.to_come_in_EmailAddress);
        to_come_in_password = (EditText) findViewById(R.id.to_come_in_password);
        forgot_password = (Button) findViewById(R.id.forgot_password);
        to_come_in = (Button) findViewById(R.id.to_come_in);
        google_registration = (Button) findViewById(R.id.google_registration);
        facebook_registration = (Button) findViewById(R.id.facebook_registration);
        button_registration = (Button) findViewById(R.id.button_registration);
        mAuth = FirebaseAuth.getInstance();


    }

    public void onClickSingIn(View view){
        if(!TextUtils.isEmpty(to_come_in_EmailAddress.getText().toString()) && !TextUtils.isEmpty(to_come_in_password.getText().toString())){
            mAuth.signInWithEmailAndPassword(to_come_in_EmailAddress.getText().toString(),to_come_in_password.getText().toString()).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()){
                        Intent intent;
                        Toast.makeText(getApplicationContext(), "Вход", Toast.LENGTH_LONG).show();
                        intent = new Intent(activity_login.this, Genre_selection.class);
                        startActivity(intent);
                        onStop();
                    }else{
                        Toast.makeText(getApplicationContext(), "Вы ввели не правильно логин или пароль", Toast.LENGTH_LONG).show();
                    }
                }
            });
        }else{
            Toast.makeText(getApplicationContext(), "Заполните поля", Toast.LENGTH_LONG).show();
        }


    }

    public void onClickRegistrationButton(View view){
        Intent intent = new Intent(this, Registration.class);
        startActivity(intent);
        onStop();
    }


}