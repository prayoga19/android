package com.example.latihan1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

//06-april-2020, mengerjakan layout welcome dan login code, 10117151-prayoga maulana putra s-IF4

public class MainActivity extends AppCompatActivity {
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void pindah(View view) {
        Intent intent = new Intent(MainActivity.this,layout_code.class);
        startActivity(intent);
    }
}
