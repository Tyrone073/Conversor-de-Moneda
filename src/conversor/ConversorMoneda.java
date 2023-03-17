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
	 
	
	
	public void mostrarInterfaz() {	
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
		JOptionPane.showMessageDialog(null, cantidad + " " + monedaOrigen.getMoneda() + " es equivalente a " + resultado() + " " + monedaDestino.getMoneda());
			
		}
	
	private double resultado(){
	    double valorIngresado = this.cantidad;
	    double valorSeleccionado = monedaOrigen.getValor();
	    double valorMultiplicador = monedaDestino.getValor();
	    double resultado = (valorIngresado * valorSeleccionado) / valorMultiplicador;
	    return resultado;
	}

}	
		
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
		
		
		
		