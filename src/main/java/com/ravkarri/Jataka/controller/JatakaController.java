package com.ravkarri.Jataka.controller;

import com.ravkarri.Jataka.entity.ChartInput;
import com.ravkarri.Jataka.entity.HoroscopeData;
import com.ravkarri.Jataka.util.ProcessHoroscope;
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
