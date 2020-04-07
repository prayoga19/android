package com.example.latihan1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class say_hai extends AppCompatActivity {
    TextView tampil;
    private String nama;
    private String KEY_NAME = "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_say_hai);
        tampil = (TextView) findViewById(R.id.tampil);

        Bundle extras = getIntent().getExtras();
        nama = extras.getString(KEY_NAME);
        tampil  .setText("Beres! Sekarang " + nama + " udah bisa ngecek penggunaan HP "+ nama +" tiap hari buat bantu "+ nama +" ngatur waktu :)");

    }


}
