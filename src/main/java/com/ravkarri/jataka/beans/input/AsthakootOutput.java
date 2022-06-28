package com.ravkarri.jataka.beans.input;

import org.springframework.stereotype.Component;

public class AsthakootOutput {

	String boyName,girlName;
	String varnaKoota,vasyaKoota,yoni,maithri,dinakuta,ganaKuta,bakut,nadi;
	
	public String getBoyName() {
		return boyName;
	}
	public void setBoyName(String boyName) {
		this.boyName = boyName;
	}
	public AsthakootOutput(String boyName, String girlName, String varnaKoota, String vasyaKoota,
			String yoni, String maithri, String dinakuta, String ganaKuta, String bakut, String nadi) {
		super();
		this.boyName = boyName;
		this.girlName = girlName;
		this.varnaKoota = varnaKoota;
		this.vasyaKoota = vasyaKoota;
		this.yoni = yoni;
		this.maithri = maithri;
		this.dinakuta = dinakuta;
		this.ganaKuta = ganaKuta;
		this.bakut = bakut;
		this.nadi = nadi;
	}
	public String getGirlName() {
		return girlName;
	}
	public void setGirlName(String girlName) {
		this.girlName = girlName;
	}
	public String getVarnaKoota() {
		return varnaKoota;
	}
	public void setVarnaKoota(String varnaKoota) {
		this.varnaKoota = varnaKoota;
	}
	public String getVasyaKoota() {
		return vasyaKoota;
	}
	public void setVasyaKoota(String vasyaKoota) {
		this.vasyaKoota = vasyaKoota;
	}
	public String getYoni() {
		return yoni;
	}
	public void setYoni(String yoni) {
		this.yoni = yoni;
	}
	public String getMaithri() {
		return maithri;
	}
	public void setMaithri(String maithri) {
		this.maithri = maithri;
	}
	public String getDinakuta() {
		return dinakuta;
	}
	public void setDinakuta(String dinakuta) {
		this.dinakuta = dinakuta;
	}
	public String getGanaKuta() {
		return ganaKuta;
	}
	public void setGanaKuta(String ganaKuta) {
		this.ganaKuta = ganaKuta;
	}
	public String getBakut() {
		return bakut;
	}
	public void setBakut(String bakut) {
		this.bakut = bakut;
	}
	public String getNadi() {
		return nadi;
	}
	public void setNadi(String nadi) {
		this.nadi = nadi;
	}
}
