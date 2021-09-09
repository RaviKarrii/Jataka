package main.java.util;

import java.util.Date;

public class Setup {

    private static Setup setup = null;
    public enum ayanamsaSet{
        lahiri("1"),DeLuce("2"),Raman("3"),Ushashashi("4"),Krishnamurti(5);
        private String value;

        // getter method
        public String getValue()
        {
            return this.value;
        }

        // enum constructor - cannot be public or protected
        private ayanamsaSet(String value)
        {
            this.value = value;
        }
    };
    public String lat,lon;
    public Date date;
    private ayanamsaSet ayanamsa = ayanamsaSet.lahiri;

    public enum languageSet{
        TELUGU,ENGLISH
    };
    private languageSet languageToUse = languageSet.ENGLISH;

    public static Setup getInstance()
    {
        if (setup == null)
            setup = new Setup();

        return setup;
    }

    public ayanamsaSet getAyamansa(){
        return ayanamsa;
    }

    public void setAyanamsa(ayanamsaSet ayanamsa) {
        this.ayanamsa = ayanamsa;
    }

    public languageSet getLanguageToUse() {
        return languageToUse;
    }

    public void setLanguageToUse(languageSet languageToUse) {
        this.languageToUse = languageToUse;
    }
}
