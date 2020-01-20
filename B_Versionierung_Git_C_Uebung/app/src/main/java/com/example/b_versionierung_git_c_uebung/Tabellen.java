package com.example.b_versionierung_git_c_uebung;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Tabellen extends AppCompatActivity {
ListView lv_tabelle;
ArrayAdapter adapter;
ArrayList<GPS> al = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.datenaustabelleanzeigen);
        lv_tabelle = findViewById(R.id.lv_GPS);
        loadData();

    }
    private void loadData ()
    {
        MySQLiteHelper dbhelper = new MySQLiteHelper(this);
        SQLiteDatabase db = dbhelper.getReadableDatabase();
        Cursor rows = db.rawQuery(
                "SELECT longitude,lattitude,myDate " +
                        "FROM GPS",null);

        while(rows.moveToNext()) {
           GPS gps = new GPS(12.2222,12.3333,"12.12.2012 12:03");
            al.add(gps);
        }

        rows.close();
        db.close();

        adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,al);
        lv_tabelle.setAdapter(adapter);
    }
}
