package com.example.latihan1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

//07-april-2020, mengerjakan Biodata layout dan say hai layout, 10117151-prayoga maulana putra s-IF4
public class biodata extends AppCompatActivity {
    EditText name;
    Button  btnkd;

    private String KEY_NAME = "NAMA";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        name = (EditText) findViewById(R.id.editbiodata);
        btnkd = (Button) findViewById(R.id.btnkode1);

        btnkd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String nama = name.getText().toString();
                    if (nama != null && nama != ""){
                        Intent i = new Intent(biodata.this, say_hai.class);
                        i.putExtra(KEY_NAME, nama);
                        startActivity(i);

                    } else {
                        Toast.makeText(getApplication(), "YOU NEED TO FILL YOUR NAME",Toast.LENGTH_SHORT);
                    }

                } catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(getApplication(), "ERROR, TRY AGAIN !",Toast.LENGTH_SHORT);
                }

            }
        });
    }
}
