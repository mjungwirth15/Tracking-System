package com.example.b_versionierung_git_c_uebung;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class Tabellen extends AppCompatActivity {
ListView lv_tabelle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.datenaustabelleanzeigen);
        lv_tabelle = findViewById(R.id.lv_GPS);
    }
}
