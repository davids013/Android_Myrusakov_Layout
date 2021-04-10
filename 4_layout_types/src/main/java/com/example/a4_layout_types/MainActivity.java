package com.example.a4_layout_types;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main_linear);

    }

    public void show_tableLayout(View view) {
        setContentView(R.layout.act_main_table);
    }

    public void show_linearLayout(View view) {
        setContentView(R.layout.act_main_linear);
    }

    public void show_frameLayout(View view) {
        setContentView(R.layout.act_main_frame);
    }

    public void show_relativeLayout(View view) {
        setContentView(R.layout.act_main_relative);
    }

    public void show_constraintLayout(View view) {
        setContentView(R.layout.act_main_constr);
    }

    public void show_scrollView(View view) {
        setContentView(R.layout.act_main_scroll);
    }

    public void show_gridLayout(View view) {
        setContentView(R.layout.act_main_grid);
    }

    public void show_program(View view) {
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);

        TextView tv1 = new TextView(this);
        tv1.setText("Registration");
        tv1.setTextSize(24);
        tv1.setGravity(1);

        TextView tv2 = new TextView(this);
        tv2.setText("E-mail");
        tv2.setTextSize(18);
        tv2.setGravity(1);

        EditText et1 = new EditText(this);
        et1.setHint("Enter e-mail");
        et1.setGravity(1);

        TextView tv3 = new TextView(this);
        tv3.setText("Password");
        tv3.setTextSize(18);
        tv3.setGravity(1);

        EditText et2 = new EditText(this);
        et2.setHint("Enter password");
        et2.setGravity(1);

        Button b1 = new Button(this);
        b1.setText("Registration");
        b1.setTextSize(24);
        b1.setGravity(1);

        layout.addView(tv1);
        layout.addView(tv2);
        layout.addView(et1);
        layout.addView(tv3);
        layout.addView(et2);
        layout.addView(b1);

        setContentView(layout);
    }

    public void show_complex(View view) {
        setContentView(R.layout.act_main_complex);
    }
}