package com.ravkarri.jataka.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ravkarri.jataka.asthakoot.Astakoot;
import com.ravkarri.jataka.asthakoot.NakshatraAndRaasiConverter;
import com.ravkarri.jataka.beans.input.AsthakootInput;
import com.ravkarri.jataka.beans.input.AsthakootOutput;

@RestController
public class AsthakootController {

	@PostMapping("/asthakoot")
	public AsthakootOutput asthakoot(@RequestBody AsthakootInput input) {
		AsthakootOutput asthakootOutput;
		NakshatraAndRaasiConverter convertor = new NakshatraAndRaasiConverter(input.getGroomNakshatra(),input.getBrideNakshatra(),input.getGroomRaasi(),input.getBrideRaasi());
		Astakoot koot = convertor.astakootGenerator();
		asthakootOutput = new AsthakootOutput(input.getGroomName(),input.getBrideName(),String.valueOf(koot.calcVarnaKoota()),String.valueOf(koot.calcVasyaKoota()),koot.calcYoni(),String.valueOf(koot.calcMaitri()),String.valueOf(koot.calcDinaKuta()),String.valueOf(koot.calcGanaKuta()),String.valueOf(koot.calcBahkut()),String.valueOf(koot.calcNadi()));
		return asthakootOutput;
	}
	
}
