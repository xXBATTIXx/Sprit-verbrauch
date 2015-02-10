package de.BATTI.sprit_verbrauch;

public class Ergebnis {

	
	
	public float liter;
	public float meter;
	
	
	public float ergebniss;
	
	public void berechneErgebnis(){
		ergebniss = (liter/meter) *100;
		}

}
