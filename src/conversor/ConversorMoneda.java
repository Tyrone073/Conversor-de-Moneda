package conversor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

//import ejecutor.JComboBox;

public class ConversorMoneda {

	ListaMonedas listaMonedas = new ListaMonedas();//esto es para crear una intancia de la lista
	Object[] lista = listaMonedas.getMonedaList().toArray();//aqui se transforma esa intancia para q se pueda utilizar en la seleccion
	
	
	private Agrega monedaDestino;
	private Agrega monedaOrigen;
	private double cantidad;
	private String nombre = "Conversor de Monedas";

	public String getNombre() {
		return nombre;
	} 
	
	
	public void mostrarInterfaz() {	
		JOptionPane.showMessageDialog(null, "Bienvenido al conversor de monedas");
		
		while (true) {
			monedaOrigen = (Agrega) JOptionPane.showInputDialog(null, "Selecciona una moneda que se va a convertir ", "Lista de opciones", JOptionPane.OK_CANCEL_OPTION, null, lista, lista [0]);
				if (monedaOrigen == null) { // Si se presionó el botón "Cancelar"
			        System.exit(0); // Termina el programa
			    }else {
			    	cantidad = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la cantidad a convertir", "Cantidad", JOptionPane.OK_CANCEL_OPTION));
			    	if (cantidad == JOptionPane.CANCEL_OPTION) { // Si se presionó el botón "Cancelar"
				        //System.exit(0); // Termina el programa
			    	return;
				    }
			    	monedaDestino = (Agrega) JOptionPane.showInputDialog(null, "Selecciona una moneda a convertir", "Lista de opciones", JOptionPane.QUESTION_MESSAGE, null, lista, lista [0]);
						if (monedaDestino == null) { // Si se presionó el botón "Cancelar"
				        //System.exit(0); // Termina el programa
						return;
						}
						break;
			    	}
			}
		JOptionPane.showMessageDialog(null, cantidad + " " + monedaOrigen.getNombre() + " es equivalente a " + resultado() + " " + monedaDestino.getNombre());
			
		}
	
	private double resultado(){
	    double valorIngresado = this.cantidad;
	    double valorSeleccionado = monedaOrigen.getValor();
	    double valorMultiplicador = monedaDestino.getValor();
	    
	   /* if (monedaDestino.equals("dolar")) {
	    	valorMultiplicador = valorIngresado/valorMultiplicador;
	    }*/
	    /*if (monedaDestino.getNombre().equals("dolar") == monedaOrigen.getNombre().equals("dolar")) { // es para q se transforme a dolar sin q multipliq la cantiddad del dolar elebada(1.5)// no es nada de eso esto es para q multipliq por 1 si los valores son iguales y el dolar ya esta em 1.5 haci q al seleccionarlo va a multilpicar por ese
	    	//valorMultiplicador = (valorSeleccionado * valorIngresado)/ valorMultiplicador;
	    	valorMultiplicador = 1;
	    }*/
	    
	    //double resultado = valorIngresado * valorMultiplicador;
	    //double resultado = ((valorIngresado/100)/valorSeleccionado) * valorMultiplicador;
	   // double resultado = ((valorIngresado/100)*valorSeleccionado) * valorMultiplicador;//*100
	    
	    //double resultado = (valorIngresado/valorSeleccionado) * valorMultiplicador; // valorMultiplicador;// solo funciona al transformar con dolares
	    double resultado = (valorIngresado * valorSeleccionado) / valorMultiplicador;
	    //(valorIngresado / valorOrigen) * valorDestino
	    
	    if (monedaDestino.getNombre() == monedaOrigen.getNombre()) { // es para q se transforme a dos monedas igual a la lisma cantidad
	    	//valorMultiplicador = (valorSeleccionado * valorIngresado)/ valorMultiplicador;
	    	//valorMultiplicador = 1;
	    	resultado = valorIngresado * 1;
	    }
	    
	    if (monedaDestino.getNombre().contains("dolar") || monedaOrigen.getNombre().contains("dolar")) {// esto funciona si es seleccionado dolar
	    	  //resultado = valorIngresado * valorMultiplicador;
	    	  resultado = (valorIngresado/valorSeleccionado) * valorMultiplicador;
	    	}
	    
	    return resultado;
	}

	

}	//1.2 *1.5)/23) * 
		
	/*public void mostrarInterfaz() {	
			Moneda inicia = monedaOrigen = (Moneda) JOptionPane.showInputDialog(null, "Selecciona una moneda que se va a convertir ", "Lista de opciones", JOptionPane.OK_CANCEL_OPTION, null, lista, lista [0]);
			if (monedaOrigen == null) { // Si se presionó el botón "Cancelar"
		        System.exit(0); // Termina el programa
		    }else {
		    	cantidad = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la cantidad a convertir", "Cantidad", JOptionPane.OK_CANCEL_OPTION));
		    	monedaDestino = (Moneda) JOptionPane.showInputDialog(null, "Selecciona una moneda a convertir", "Lista de opciones", JOptionPane.QUESTION_MESSAGE, null, lista, lista [0]);
					if (monedaDestino == null) { // Si se presionó el botón "Cancelar"
			        System.exit(0); // Termina el programa
					}
		    }*/
		
		
		
		