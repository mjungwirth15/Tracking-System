package com.example.b_versionierung_git_c_uebung;

public class GPS {
    float longitude;
    float lattitude;
    String myDate;

    public GPS(float longitude, float lattitude, String myDate) {
        this.longitude = longitude;
        this.lattitude = lattitude;
        this.myDate = myDate;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getLattitude() {
        return lattitude;
    }

    public void setLattitude(float lattitude) {
        this.lattitude = lattitude;
    }

    public String getMyDate() {
        return myDate;
    }

    public void setMyDate(String myDate) {
        this.myDate = myDate;
    }
}
