package main.java.language;

import main.java.util.Setup;

import java.util.HashMap;
import java.util.Map;

public class Language {
    private Map<String,String> LanguagePairs = new HashMap<>();
    private Setup setup = Setup.getInstance();
    private Setup.languageSet language = setup.getLanguageToUse();
    public void setLanguagePairs(Map<String, String> languagePairs) {
        LanguagePairs = languagePairs;
    }

    public Map<String, String> getLanguagePairs() {
        return LanguagePairs;
    }

    public String getLanguagePair(String key){
        if(getLanguagePairs().containsKey(key)){
        return getLanguagePairs().get(key);
        }
        return key;
    }


    public void BuildKeySet(Map<String,Object> languageJson){
        Setup.languageSet language = setup.getLanguageToUse();
        Map<String,String> lang = new HashMap<>();
        if(language == Setup.languageSet.ENGLISH){
            lang =(Map<String,String>) languageJson.get("ENGLISH");
        } else if (language == Setup.languageSet.TELUGU) {
            lang =(Map<String,String>) languageJson.get("TELUGU");
        } else{
            lang =(Map<String,String>) languageJson.get("ENGLISH");
        }

        setLanguagePairs(lang);
    }
}
