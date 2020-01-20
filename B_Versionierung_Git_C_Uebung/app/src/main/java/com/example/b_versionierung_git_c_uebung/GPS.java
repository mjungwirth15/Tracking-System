package com.example.b_versionierung_git_c_uebung;

public class GPS {
    private double longitude;
    private double lattitude;
    private String myDate;

    public GPS() {
    }

    public GPS(double longitude, double lattitude, String myDate) {
        this.longitude = longitude;
        this.lattitude = lattitude;
        this.myDate = myDate;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public double getLattitude() {
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
