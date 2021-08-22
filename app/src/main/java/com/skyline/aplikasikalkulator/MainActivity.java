package com.skyline.aplikasikalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText angka_pertama, angka_kedua;
    Button tambah, kurang, kali, bagi, bersihkan;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        angka_pertama = findViewById(R.id.angka_pertama);
        angka_kedua = findViewById(R.id.angka_kedua);
        tambah = findViewById(R.id.tambah);
        kurang = findViewById(R.id.kurang);
        kali = findViewById(R.id.kali);
        bagi = findViewById(R.id.bagi);
        bersihkan = findViewById(R.id.bersihkan);
        hasil = findViewById(R.id.hasil);

        tambah.setOnClickListener(view -> {
            if ((angka_pertama.getText().length() > 0) && (angka_kedua.getText().length() > 0)) {
                double angka1 = Double.parseDouble(angka_pertama.getText().toString());
                double angka2 = Double.parseDouble(angka_kedua.getText().toString());
                double result = angka1 + angka2;
                hasil.setText(Double.toString(result));
            } else {
                Toast toast = Toast.makeText(MainActivity.this, "Mohon masukan Angka pertama & Kedua", Toast.LENGTH_LONG);
                toast.show();
            }
        });

        kurang.setOnClickListener(view -> {
            if ((angka_pertama.getText().length() > 0) && (angka_kedua.getText().length() > 0)) {
                double angka1 = Double.parseDouble(angka_pertama.getText().toString());
                double angka2 = Double.parseDouble(angka_kedua.getText().toString());
                double result = angka1 - angka2;
                hasil.setText(Double.toString(result));
            } else {
                Toast toast = Toast.makeText(MainActivity.this, "Mohon masukan Angka pertama & Kedua", Toast.LENGTH_LONG);
                toast.show();
            }
        });

        kali.setOnClickListener(view -> {
            if ((angka_pertama.getText().length() > 0) && (angka_kedua.getText().length() > 0)) {
                double angka1 = Double.parseDouble(angka_pertama.getText().toString());
                double angka2 = Double.parseDouble(angka_kedua.getText().toString());
                double result = angka1 * angka2;
                hasil.setText(Double.toString(result));
            } else {
                Toast toast = Toast.makeText(MainActivity.this, "Mohon masukan Angka pertama & Kedua", Toast.LENGTH_LONG);
                toast.show();
            }
        });

        bagi.setOnClickListener(view -> {
            if ((angka_pertama.getText().length() > 0) && (angka_kedua.getText().length() > 0)) {
                double angka1 = Double.parseDouble(angka_pertama.getText().toString());
                double angka2 = Double.parseDouble(angka_kedua.getText().toString());
                double result = angka1 / angka2;
                hasil.setText(Double.toString(result));
            } else {
                Toast toast = Toast.makeText(MainActivity.this, "Mohon masukan Angka pertama & Kedua", Toast.LENGTH_LONG);
                toast.show();
            }
        });

        bersihkan.setOnClickListener(view -> {
            angka_pertama.setText("");
            angka_kedua.setText("");
            hasil.setText("0");
            angka_pertama.requestFocus();
        });
    }
}