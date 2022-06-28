package com.ravkarri.jataka.asthakoot;

public class NakshatraAndRaasiConverter {
	
	String boyNak;
	String girlNak;
	String boyRaasi;
	String girlRaasi;
	public NakshatraAndRaasiConverter(String boyNak, String girlNak, String boyRaasi, String girlRaasi) {
		super();
		this.boyNak = boyNak;
		this.girlNak = girlNak;
		this.boyRaasi = boyRaasi;
		this.girlRaasi = girlRaasi;
	}

	public Astakoot astakootGenerator() {

		Astakoot koot = new Astakoot(nakshatraConvert(this.boyNak),nakshatraConvert(this.girlNak),raasiConvert(this.boyRaasi),raasiConvert(this.girlRaasi));
		return koot;
	}
	private int nakshatraConvert(String nakshatra) {
		
		System.out.print(nakshatra);
		String nak[] = {"Ashwini", "Bharani", "Krittika", "Rohini", "Mrigshira", "Ardra", "Punarvasu", "Pushya", "Ashlesha", "Magha", "Purva Phalguni", "Uttara Phalguni", "Hasta", "Chitra", "Swati", "Vishakha", "Anuradha", "Jyestha", "Mula", "Purva Ashadha", "Uttara Ashadha", "Shravana", "Dhanishta", "Satabhisha", "Purva Bhadrapada", "Uttara Bhadrapada", "Revati", "Abhijit"};
	    
		for (int i = 0; i < nak.length; i++) {
	        if (nakshatra.equalsIgnoreCase(nak[i])) {
	            return i;
	        }
	    }
		return -1;
	}
	
	private int raasiConvert(String raasi) {
		String raasiArray[] = {"Aries","Tarus","Gemini","Cancer","Leo","Virgo","Libra","Scorpio","Sagittarious","Capricorn","Aquarious","Pieces"};
		for (int i = 0; i < raasiArray.length; i++) {
	        if (raasi.equalsIgnoreCase(raasiArray[i])) {
	            return i;
	        }
	    }
		return -1;
	}
	
}
