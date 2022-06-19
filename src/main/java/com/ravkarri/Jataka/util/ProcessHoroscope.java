package com.ravkarri.Jataka.util;

import com.ravkarri.Jataka.entity.ChartInput;
import com.ravkarri.Jataka.entity.HoroscopeData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProcessHoroscope {
    public HoroscopeData getHoroscopeData() {
        return horoscopeData;
    }

    public void setHoroscopeData(HoroscopeData horoscopeData) {
        this.horoscopeData = horoscopeData;
    }

    private HoroscopeData horoscopeData;
    public HoroscopeData returnHoroscope(ChartInput chartInput){
        horoscopeData.setLat(chartInput.getLatitude());
        horoscopeData.setLon(chartInput.getLongitude());
        //ProcessHoroscope processHoroscope = new ProcessHoroscope();
        return horoscopeData;
    }
}
