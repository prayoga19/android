package com.example.latihan1;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class layout_code extends AppCompatActivity {
    Button masuk;
    EditText kd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_code);
    }



    public void masuk(View view) {
            Intent intent = new Intent(layout_code.this, biodata.class);
            startActivity(intent);

        }
    }
