package conversor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//import model.Aula;

public class Agrega {// madre q tiene el valor y q se rellena la moneda y su valor
// es creada para agregar una moneda con su nombre y valor
	private String nombre;
	private double valor;
	//private List<Moneda> monedaList = new ArrayList<>();
	
	public Agrega(String nombre, double valor) {	
		this.nombre = nombre;
		this.valor = valor;// * valor para q al seleccionar esa moneda multiplique hacia ella
	}
	
	public String getNombre() {// es para ver el nombre de la moneda creada, creo q el static es para q se haga visible en todas la clases
		return nombre;
	}


	public double getValor() {// es para ver el valor de la moneda creada
		return valor;
	}
	
	
	/*public double Resuelve (double cantidad, String salida) { // algun metodo para q resuelva
		 salida = getMoneda();
		cantidad = getValor() * cantidad;
		return cantidad;
	
	}*/
	/*public List<Moneda> getMonedaList() {// no sirve porq esto solo es para referenciar lo q se debe de completar y no guarda ningun dato
		return Collections.unmodifiableList(monedaList);//creo q es para ver la liasta de monedas, no es para eso es para q no sea modificalble la lista
	}*/
	
	@Override
	public String toString() {// es creado para q muestre el contenido de este objeto y no el tostring del objeto creado por java(ejm ids)
		// TODO Auto-generated method stub
		//return super.toString();
		return this.nombre;
	}
	/*@Override
	public boolean equals(Object obj){// este y el hashcode se modificaror porq se utiliso el new hashset
		Moneda moneda = (Moneda)obj;
		return this.moneda.equals(monedaList.getMoneda());
	}*/
	
}
