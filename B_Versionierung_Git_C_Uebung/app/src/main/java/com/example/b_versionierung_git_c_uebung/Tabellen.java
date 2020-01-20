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
                "SELECT * " +
                        "FROM GPS",null);

        while(rows.moveToNext()) {
           GPS gps = new GPS(rows.getDouble(0),rows.getDouble(1),rows.getString(2));
            al.add(gps);
        }

        rows.close();
        db.close();

        adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,al);
        lv_tabelle.setAdapter(adapter);
    }
}
