package com.example.a1_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EnterActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back);

        Intent intent = getIntent();
        String email = intent.getStringExtra("email");

        TextView textGreeting = findViewById(R.id.textViewSum);
        textGreeting.setText(getString(R.string.greeting_prefix) + email);

        Button buttonBack = findViewById(R.id.buttonBack);
    }


    public void clickBack(View view) {
        Intent intentBack = new Intent(this, MainActivity.class);
        startActivity(intentBack);
    }
}