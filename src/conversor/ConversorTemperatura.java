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

public class ConversorTemperatura {

	ListaTemperatura listaTemperatura = new ListaTemperatura();//esto es para crear una intancia de la lista
	Object[] lista = listaTemperatura.getTemperaturaList().toArray();//aqui se transforma esa intancia para q se pueda utilizar en la seleccion
	
	
	private Agrega temperaturtaDestino;
	private Agrega temperaturaOrigen;
	private double cantidad;
	 
	private String nombre = "Conversor de Temperaturas" ;

    public String getNombre() {
        return nombre;
    } 
	
	
	public void mostrarInterfaz() {	
		while (true) {
			temperaturaOrigen = (Agrega) JOptionPane.showInputDialog(null, "Selecciona una temperatura que se va a convertir ", "Lista de opciones", JOptionPane.OK_CANCEL_OPTION, null, lista, lista [0]);
				if (temperaturaOrigen == null) { // Si se presionó el botón "Cancelar"
			        System.exit(0); // Termina el programa
			    }else {
			    	cantidad = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la cantidad a convertir", "Cantidad", JOptionPane.OK_CANCEL_OPTION));
			    	if (cantidad == JOptionPane.CANCEL_OPTION) { // Si se presionó el botón "Cancelar"
				        //System.exit(0); // Termina el programa
			    	return;
				    }
			    	temperaturtaDestino = (Agrega) JOptionPane.showInputDialog(null, "Selecciona una temperatura a convertir", "Lista de opciones", JOptionPane.QUESTION_MESSAGE, null, lista, lista [0]);
						if (temperaturtaDestino == null) { // Si se presionó el botón "Cancelar"
				        //System.exit(0); // Termina el programa
						return;
						}
						break;
			    	}
			}
		JOptionPane.showMessageDialog(null, cantidad + " " + temperaturaOrigen.getNombre() + " es equivalente a " + resultado() + " " + temperaturtaDestino.getNombre());
			
		}
	
	private double resultado(){
	    double valorIngresado = this.cantidad;
	    double valorSeleccionado = temperaturaOrigen.getValor();
	    double valorMultiplicador = temperaturtaDestino.getValor();
	    double resultado = (valorIngresado * valorSeleccionado) / valorMultiplicador;
	    return resultado;
	}

	/*public void getConversores() {
		// TODO Auto-generated method stub
		return mostrarInterfaz();
	}*/

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
		
		
		
		