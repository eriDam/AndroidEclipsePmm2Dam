package com.example.dobleventana;

 

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FirstActivity extends Activity {
	//Declaramos la etiqueta y el texto a mostrar
	private static final String TAG = "Primera Ventana";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//Creo los elementos de la pantalla gr�fica
		//Cojemos del recurso boton1 y lo almacenamos en la variable de tipo button
		final Button comprobar = (Button) findViewById(R.id.button1);
		final EditText editText1User=(EditText)findViewById(R.id.editText1);
		final EditText editText2Passw=(EditText)findViewById(R.id.editText2);
		//final TextView txt=(EditText)findViewById(R.id.textView3); 		
				
				//A�ado un nuevo listener
		comprobar.setOnClickListener(new Button.OnClickListener(){
		

			@Override
			public void onClick(View v) {
				//Para intentar lanzar un nuevo activity, se utiliza la clase Intent
				//Intent espera como primer par�metro un contexto de quien esta llamando a la segunda parte,
				//
				Intent abre2 = new Intent(
						FirstActivity.this, //Utilizamos this como en java para pasarle como primer parametro quien esta llamando(First activity que hereda de activity)			
						SecondActivity.class//Y en  la segunda le pasamos a quien est� llamando
						);
				//En el intent se intenta enviar la informaci�n de la primera ventana
				//Se utilizan pares de nombre y valor, el nombre ser� usuario y contras y cogeremos el texto que se haya introducido
				//A trav�s del m�todo putExtra podemos poner informaci�n b�sica no muy extensa
				abre2.putExtra("usuario", editText1User.getText().toString());
				abre2.putExtra("pass", editText2Passw.getText().toString());
				//Esta es otra forma de lanzar el intent de abrir la segunda ventana, vamos a esperar que nos devuelva un resultado
				//El segundo parametro, nos indica si es mayor o igual que 0, el resultado pasar� por el metodo onActivityResult 
				startActivityForResult(abre2,1);
			}
		}
	);
				//El Log es la herramienta para poder controlar o hacer debug de nuestra app
			    //no son mas que la lectura de lo que va pasando en nuestra aplicaci�n.
				//Incorporamos el Log al final de cada m�todo de la actividad de android
				Log.i(TAG, "on create");
				Log.d(TAG, "Debug");
				Log.e(TAG, "Error");
				Log.v(TAG, "Mensaje de Registro - Verbose Log");
				Log.w(TAG, "Mensaje de Advertencia - Warn");
	}

	//M�todo que 
	protected void onActivityResult(int requestCode, int resultCode, Intent data){
		
			final TextView comprobado=(TextView) findViewById(R.id.textView3);
			
			if (requestCode ==1) {
			
				if(resultCode == RESULT_OK) {
					String resultado=data.getStringExtra("txt");
					comprobado.setText(resultado);	
				}
				if (resultCode == RESULT_CANCELED) {
				}
			}
		}//onActivityResult
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
		
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	//Generamos e incorporamos los metodos de Log, automaticamente desde bot�n dcho source-Override/Implement methodes
	//Override, en realidad ni sobrecarga ni sustituye, le dice al compilador que haga caso a este m�todo y no al del padre
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.i(TAG, "onStart");
		Log.d(TAG, "Debug");
		Log.e(TAG, "Error");
		Log.v(TAG, "Mensaje de Registro - Verbose Log");
		Log.w(TAG, "Mensaje de Advertencia - Warn");
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	
	Log.i(TAG, "onResume");
	Log.d(TAG, "Debug");
	Log.e(TAG, "Error");
	Log.v(TAG, "Mensaje de Registro - Verbose Log");
	Log.w(TAG, "Mensaje de Advertencia - Warn");
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.i(TAG, "onPause");
		Log.d(TAG, "Debug");
		Log.e(TAG, "Error");
		Log.v(TAG, "Mensaje de Registro - Verbose Log");
		Log.w(TAG, "Mensaje de Advertencia - Warn");
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.i(TAG, "onStop");
		Log.d(TAG, "Debug");
		Log.e(TAG, "Error");
		Log.v(TAG, "Mensaje de Registro - Verbose Log");
		Log.w(TAG, "Mensaje de Advertencia - Warn");
	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		Log.i(TAG, "onRestart");
		Log.d(TAG, "Debug");
		Log.e(TAG, "Error");
		Log.v(TAG, "Mensaje de Registro - Verbose Log");
		Log.w(TAG, "Mensaje de Advertencia - Warn");
	}
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.i(TAG, "onDestroy");
		Log.d(TAG, "Debug");
		Log.e(TAG, "Error");
		Log.v(TAG, "Mensaje de Registro - Verbose Log");
		Log.w(TAG, "Mensaje de Advertencia - Warn");
	}
	
	
	
}
