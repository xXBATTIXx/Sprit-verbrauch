package de.BATTI.sprit_verbrauch;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends Activity {
	
	
	public static final String BETRAG_LITER ="liter";
	public static final String BETRAG_METER ="meter";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}




	public void onClickumrechner(final View view)
	{
			
			final EditText txtliter = (EditText) findViewById(R.id.liter);
			final float liter = Float.parseFloat(txtliter.getText().toString());
			
			final EditText txtmeter = (EditText) findViewById(R.id.meter);
			final float meter = Float.parseFloat(txtmeter.getText().toString());
			
			
			
			
			
			final Intent intent = new Intent(this,ErgebnisActivity.class);
			
			intent.putExtra(BETRAG_LITER, liter);
			intent.putExtra(BETRAG_METER, meter);
			
			startActivity(intent);
			
			
		
		}

}	

