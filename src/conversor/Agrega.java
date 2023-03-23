package conversor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//import model.Aula;

public class Agrega {
	private String nombre;
	private double valor;
	
	public Agrega(String nombre, double valor) {	
		this.nombre = nombre;
		this.valor = valor;
	}
	
	public String getNombre() {
		return nombre;
	}


	public double getValor() {
		return valor;
	}
	
	
	
	@Override
	public String toString() {// es creado para q muestre el contenido de este objeto y no el tostring del objeto creado por java(ejm ids)
		// TODO Auto-generated method stub
		//return super.toString();
		return this.nombre;
	}
	
}
