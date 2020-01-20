package com.example.b_versionierung_git_c_uebung;

import java.util.Date;

public class GPS {

    private double longitude;
    private double lattitude;
    private Date myDate;

    public GPS() {
    }

    public GPS(double longitude, double lattitude, Date myDate) {
  
    public GPS(double longitude, double lattitude, Date myDate) {
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

    public Date getMyDate() {
        return myDate;
    }

    public void setMyDate(Date myDate) {
        this.myDate = myDate;
    }
}
