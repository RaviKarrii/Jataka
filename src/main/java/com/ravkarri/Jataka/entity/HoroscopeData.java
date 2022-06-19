package com.ravkarri.Jataka.entity;

import org.springframework.stereotype.Component;

import java.util.Date;

public class HoroscopeData {
    private String Lat,Lon;

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    private Date dateOfBirth;
    private String Sun;
    private String Moon;
    private String Mars;
    private String Mercury;
    private String Venus;
    private String Jupiter;
    private String Saturn;
    private String Rahu;

    public HoroscopeData(String sun, String moon, String mars, String mercury, String venus, String jupiter, String saturn, String rahu, String ketu) {
        Sun = sun;
        Moon = moon;
        Mars = mars;
        Mercury = mercury;
        Venus = venus;
        Jupiter = jupiter;
        Saturn = saturn;
        Rahu = rahu;
        Ketu = ketu;
    }

    private String Ketu;

    public HoroscopeData(String lat, String lon, Date DOB) {
        Lat = lat;
        Lon = lon;
        this.DOB = DOB;
    }
    public HoroscopeData(){
        this.dateOfBirth = new Date();
    }

    private Date DOB;

    public String getLat() {
        return Lat;
    }

    public void setLat(String lat) {
        Lat = lat;
    }

    public String getLon() {
        return Lon;
    }

    public void setLon(String lon) {
        Lon = lon;
    }

    public String getSun() {
        return Sun;
    }

    public void setSun(String sun) {
        Sun = sun;
    }

    public String getMoon() {
        return Moon;
    }

    public void setMoon(String moon) {
        Moon = moon;
    }

    public String getMars() {
        return Mars;
    }

    public void setMars(String mars) {
        Mars = mars;
    }

    public String getMercury() {
        return Mercury;
    }

    public void setMercury(String mercury) {
        Mercury = mercury;
    }

    public String getVenus() {
        return Venus;
    }

    public void setVenus(String venus) {
        Venus = venus;
    }

    public String getJupiter() {
        return Jupiter;
    }

    public void setJupiter(String jupiter) {
        Jupiter = jupiter;
    }

    public String getSaturn() {
        return Saturn;
    }

    public void setSaturn(String saturn) {
        Saturn = saturn;
    }

    public String getRahu() {
        return Rahu;
    }

    public void setRahu(String rahu) {
        Rahu = rahu;
    }

    public String getKetu() {
        return Ketu;
    }

    public void setKetu(String ketu) {
        Ketu = ketu;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }
}
