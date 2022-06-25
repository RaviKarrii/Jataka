package com.ravkarri.Jatak.util;

import com.ravkarri.Jatak.entity.HoroscopeData;
import com.ravkarri.Jatak.entity.ChartInput;
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
