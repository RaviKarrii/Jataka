package main.java.calc;

import main.java.util.Setup;
import model.ChakraInput;
import swisseph.SwissEph;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PlanetPosition {
    Setup setup = Setup.getInstance();
    String latitude,longitude;

    public PlanetPosition(ChakraInput ci){
        SwissEph eph = new SwissEph();


    }

    public static void main(String[] args) throws ParseException {
        ChakraInput ci = new ChakraInput();
        ci.setLatitude("16.9891° N");
        ci.setLongitude("82.2475° E");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy' 'HH:mm:ss");
        Date birthDate = dateFormat.parse("16/09/1993 17:55:00");
        ci.setBirthDate(birthDate);
        PlanetPosition pp = new PlanetPosition(ci);
    }
}
