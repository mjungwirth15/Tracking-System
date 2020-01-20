package com.example.b_versionierung_git_c_uebung;

public class CPS_TBL {

    private final static String TABLE_NAME = "GPS";
    private final static String GPS_ID = "id";
    private final static String LONGITUDE = "longitude";
    private final static String LATITUDE = "longitude";
    private final static String DATE = "date";

    final static String CREAT_TABLE_GPS =
            "CREATE TABLE " + TABLE_NAME +
                    "(" +
                    GPS_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    LONGITUDE + " REAL," +
                    LATITUDE + " REAL," +
                    DATE + " DATE);";

    final static String INSERT_TABLE_GPS =
            "INSERT INTO " + TABLE_NAME +
                    "(" + LONGITUDE + ", " + LATITUDE + ", " + DATE + ")" +
                    "VALUES (?,?,?);";
}
