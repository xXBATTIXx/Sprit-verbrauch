package de.BATTI.sprit_verbrauch;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ErgebnisActivity extends Activity {
	@Override
	public void onCreate(Bundle icicle){
		super.onCreate(icicle);
		setContentView(R.layout.ergebnis_anzeigen);
		
		final Bundle extras = getIntent().getExtras();
		
		if(extras != null){
			final Ergebnis ergebnis = new Ergebnis();

			 ergebnis.liter = extras.getFloat(MainActivity.BETRAG_LITER);
			 ergebnis.meter = extras.getFloat(MainActivity.BETRAG_METER);
			 zeigeErgebnis(ergebnis);
		}
		
	}
 
	private void zeigeErgebnis(Ergebnis ergebnis){
		setTitle("Ergebnis");
		
		ergebnis.berechneErgebnis();
		
		final TextView txtdurchschnitt = (TextView) findViewById(R.id.durchschnitt);
		txtdurchschnitt.setText(String.valueOf(ergebnis.ergebniss));
		
				
		
	}
}