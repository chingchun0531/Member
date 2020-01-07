package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public abstract class MainActivity extends AppCompatActivity {
boolean data = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(!data){
            Intent intent = new Intent(this,NicknameActivity.class);
            startActivity(intent);

        }
    }

}
