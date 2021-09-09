package model;

import java.time.LocalDate;
import java.util.Date;

public class ChakraInput {
    private String latitude;
    private String longitude;
    private Date birthDate;

    public String getLatitude()
    {
     return this.latitude;
    }
    public void setLatitude(String latitude){
        this.latitude = latitude;
    }
    public String getLongitude()
    {
        return this.longitude;
    }
    public void setLongitude(String longitude){
        this.longitude = longitude;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
