package com.example.listarlayout;
/**
 * @author Eri
 * Actividad 17 de la actividad 16
 * Esta es una versi�n mas compleja para poner informaci�n dentro de un layout, en este caso
 * Se listar� el array y se cambiar� el icono seg�n el dato
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
	String[] so = {"Android", "Iphone", "WindowsMobile", 
			"Blackberry","WebOs", "Windows7","Max OS X",
			"Linux", "Os/2","Android", "Iphone", "WindowsMobile", 
			"Blackberry","WebOs", "Windows7","Max OS X",
			"Linux", "Os/2" };
		
	/**  
	 * Sustituyo el ArrayAdapter ArrayAdapter<String> adapter = new ArrayAdapter<String>
	 * (this,R.layout.activity_main,R.id.textViewSo,so); que es el que estaba poniendo la 
	 * informaci�n por un adaptador propio, po ruqe las imagenes van a ser diferentes,
	 * dependiendo del texto, 
	 *  
     *  Usar� estos parametros para el constructor igual que en el anterior ArrayAdapter
     *  = new MiAdaptador(context, resource, textViewResourceId, objects)
     *  */
	
	MiAdaptador adapter = new MiAdaptador(this, R.layout.activity_main, R.id.textViewSo, so);
	
	/**
	 * Utilizamos el metodo para ponerle el adapter, el list View coge estos datos y los 
	 * representa por pantalla
	 * */
	 setListAdapter(adapter);
	}
	
	/**
	 * ListActivity tiene este listener onListItemClick donde nos va a devolver los parametros
	 * entre parentesis (el listView, el View sobre el cual est� el listView, que posicion 
	 * dentro del array se ha seleccionado y otro elemento)
	 * */
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id){
	/** lo que se quiere obtener es el item, entonces, del ListAdapter se coje el item que hemos clicado */
	String item = (String) getListAdapter().getItem(position);
	/** Se utiliza la clase Toast para mostrar por pantalla un pop up o mensaje que podemos lanzar*/
	Toast.makeText(this, item + " selected", Toast.LENGTH_LONG).show();
	}
}
