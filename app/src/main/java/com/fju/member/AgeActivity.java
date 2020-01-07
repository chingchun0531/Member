package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AgeActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);
        findViewById(R.id.next).setOnClickListener(this);
        EditText edAge = findViewById(R.id.age);
        String age = edAge.getText().toString();
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this,SharedPreferences.class);
        startActivity(intent);
    }
}
