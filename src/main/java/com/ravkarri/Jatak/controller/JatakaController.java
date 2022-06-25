package com.ravkarri.Jatak.controller;

import com.ravkarri.Jatak.entity.ChartInput;
import com.ravkarri.Jatak.entity.HoroscopeData;
import com.ravkarri.Jatak.util.ProcessHoroscope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JatakaController {

    @Autowired
    ProcessHoroscope processHoroscope;

    @GetMapping("hello")
    public HoroscopeData hello(){
        HoroscopeData horoscopeData = new HoroscopeData();
        return horoscopeData;
    }

    @PostMapping("natal")
    public HoroscopeData natalChart(@RequestBody ChartInput chartInput){
        System.out.println("ravi");
        return processHoroscope.returnHoroscope(chartInput);
    }
}
