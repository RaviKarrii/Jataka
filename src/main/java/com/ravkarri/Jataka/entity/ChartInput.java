package com.ravkarri.Jataka.entity;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ChartInput {

    private String longitude;
    private String latitude;
    private Date dateOfBirth;

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
