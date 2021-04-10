package com.example.a1_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BackActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back);

        Intent intent = getIntent();
        String resStr = intent.getStringExtra("Result");

        TextView textSum = findViewById(R.id.textViewSum);
        textSum.setText(getString(R.string.sum_prefix) + resStr);

        Button buttonBack = findViewById(R.id.buttonBack);
    }

    public void clickBack(View view) {
        Intent intentBack = new Intent(this, MainActivity.class);
        startActivity(intentBack);
    }
}