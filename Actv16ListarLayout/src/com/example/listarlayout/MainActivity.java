package com.example.listarlayout;
/**
 * @author Eri
 * Esta es una versi�n mas compleja para poner informaci�n de ntro de un layout
 * */
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState); 
		
		/**Creo el array aqu� en lugar de en strings
		 * */
	String[] so = {"Android", "Iphone", "windowsMobile", 
			"Blackberry","WebOs", "Windows7","Max OS X",
			"Linux", "Os/2" };
		
	/**  
	 * Utilizo el layout personalizado, con los parametros del contexto, el layout, 
	 * el id del textview(que como minimo tiene que tener uno) y el array de strings,
     * ya que le he indicado que es un array de strings
     * */
	ArrayAdapter<String> adapter = new ArrayAdapter<String> (this,R.layout.activity_main,R.id.textViewSo,so);
	/**Utilizamos el metodo para ponerle el adapter*/
	setListAdapter(adapter);
	}
	
	/**
	 * ListActivity tiene este listener onListItemClick donde nos va a devolver los parametros entre parentesis
	 * (el listView, el View sobre el cual est� el listView, que posicion dentro del array se ha seleccionado y otro elemento)
	 * */
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id){
	/** lo que se quiere obtener es el item, entonces, del ListAdapter se coje el item nque hemos clicado */
	String item = (String) getListAdapter().getItem(position);
	/** Se utiliza la clase Toast para mostrar por pantalla un pop up o mensaje que podemos lanzar*/
	Toast.makeText(this, item + " selected", Toast.LENGTH_LONG).show();
	}
}
