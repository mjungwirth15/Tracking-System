package com.example.b_versionierung_git_c_uebung;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

public void werteAnzeigen(View source)
{
    Intent intent = new Intent(this,Tabellen.class);
    startActivity(intent);
}
}
