package main.java.util;

import java.util.Date;

public class Setup {

    private static Setup setup = null;
    public enum ayanamsaSet{
        LAHIRI,KRISHNAMURTHY
    };
    public String lat,lon;
    public Date date;
    private ayanamsaSet ayanamsa = ayanamsaSet.LAHIRI;

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
