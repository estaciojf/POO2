package com.example.ads.estaciojf.poo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Fofinha magali = new Fofinha();
        Carente clarinha = new Carente();

        magali.comunicar();
        magali.roncar();


        clarinha.comunicar();
        clarinha.serCarente();

        Toast.makeText(this, magali.comunicar(), Toast.LENGTH_LONG).show();























    }
}
