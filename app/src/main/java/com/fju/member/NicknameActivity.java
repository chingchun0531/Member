package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NicknameActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nickname);
        findViewById(R.id.next).setOnClickListener(this);
        EditText edNickname = findViewById(R.id.nickname);
        String nickname = edNickname.getText().toString();

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this,SharedPreferences.class);
        startActivity(intent);
    }
}
