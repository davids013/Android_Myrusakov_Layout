package com.example.a1_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 /*       Button b = new Button(this);
        b.setText("It's a button");
        b.setLayoutParams(new LinearLayout.LayoutParams(dpToPx(200),dpToPx(300)));
        setContentView(b);
*/

        Button buttonSum = findViewById(R.id.button_sum);
        Button buttonEnter = findViewById(R.id.button_enter);

        buttonSum.setOnClickListener(this);
    }
/*
    private int dpToPx (int dp) {
        float scale = getApplicationContext().getResources().getDisplayMetrics().density;
        return Math.round(dp * scale);
    }
*/
    @SuppressLint("DefaultLocale")
    @Override
    public void onClick(View v) {
        EditText number1 = findViewById(R.id.editTextNumber1);
        EditText number2 = findViewById(R.id.editTextNumber2);
        String n1 = number1.getText().toString();
        String n2 = number2.getText().toString();
        if (!n1.trim().isEmpty() && !n2.trim().isEmpty()) {
            double sum = Double.parseDouble(n1) + Double.parseDouble(n2);
            String resStr;
            if (sum % 1 != 0) {
                resStr = String.format(getResources().getString(R.string.sum_format_float), n1, n2, Rnd(sum, 4));
            } else resStr = String.format(getResources().getString(R.string.sum_format_int), n1, n2, (int)sum);
            Toast.makeText(this, resStr, Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, BackActivity.class);
            intent.putExtra("Result", resStr);
            startActivity(intent);
        } else Toast.makeText(this, getResources().getString(R.string.invalid_data), Toast.LENGTH_SHORT).show();
    }

    public static double Rnd(double d, int signs)
    {
        d *= Math.pow(10, signs);
        d += .5;
        d = (int)d;
        d /= Math.pow(10, signs);
        return d;
    }

    public void clickEnter(View view) {
        EditText editEmail = findViewById(R.id.editTextTextEmailAddress);
        EditText editPassword = findViewById(R.id.editTextTextPassword);
        String email = editEmail.getText().toString().toLowerCase();
        String password = editPassword.getText().toString().toLowerCase();
        String nomEmail = getResources().getString(R.string.nom_email);
        String nomPassword = getResources().getString(R.string.nom_password);
        if (email.equals(nomEmail) && password.equals(nomPassword)) {
            Toast.makeText(this, getResources().getString(R.string.valid_enter), Toast.LENGTH_LONG).show();
            Intent intentLogin = new Intent(this, EnterActivity.class);
            intentLogin.putExtra("email", email);
            startActivity(intentLogin);
        } else Toast.makeText(this, getResources().getString(R.string.invalid_data), Toast.LENGTH_SHORT).show();
    }
}