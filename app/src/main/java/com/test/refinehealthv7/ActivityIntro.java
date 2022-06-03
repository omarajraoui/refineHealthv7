package com.test.refinehealthv7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityIntro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        configureButton1();
        configureButton2();
    }


    private void configureButton1(){
        TextView btnLogin =findViewById(R.id.tvLogin);
        btnLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(ActivityIntro.this,ActivityLogin.class));
            }


        });

    }
    private void configureButton2(){
        TextView btnSignUp =findViewById(R.id.tvSignUp);
        btnSignUp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(ActivityIntro.this,ActivitySignup.class));
            }


        });

    }

}