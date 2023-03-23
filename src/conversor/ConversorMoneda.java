package conversor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class ConversorMoneda {

	ListaMonedas listaMonedas = new ListaMonedas();
	Object[] lista = listaMonedas.getMonedaList().toArray();
	
	private Agrega monedaDestino;
	private Agrega monedaOrigen;
	private double cantidad ;
	
	
	
	public void mostrarInterfaz() {
		JOptionPane.showMessageDialog(null, "Bienvenido al conversor de monedas"); 
		
		while (true) {
			monedaOrigen = (Agrega) JOptionPane.showInputDialog(null, "Selecciona una moneda que se va a convertir ", "Lista de opciones", JOptionPane.OK_CANCEL_OPTION, null, lista, lista [0]);
				if (monedaOrigen == null) {
					return;
			    }
				while (true) {
					String cuadroInput = JOptionPane.showInputDialog(null, "Ingresa la cantidad a convertir:", "Cantidad", JOptionPane.OK_CANCEL_OPTION);
				    if (cuadroInput == null) {
				        break;
				    }
				    if (!cuadroInput.matches("^(?:0|[1-9]\\d*)(?:\\.\\d\\d?)?$")) {
				    	JOptionPane.showMessageDialog(null, "valor no valido solo se permite numeros");
				    	continue;
				    }else{
				    	cantidad = Double.parseDouble(cuadroInput);
				    }
			    	//while (true) {
				    monedaDestino = (Agrega) JOptionPane.showInputDialog(null, "Selecciona una moneda a convertir", "Lista de opciones", JOptionPane.OK_CANCEL_OPTION, null, lista, lista [0]);
				    if (monedaDestino == null) { 
				        continue;	
				    	}
			        JOptionPane.showMessageDialog(null, cantidad + " " + monedaOrigen.getNombre() + " es equivalente a " + resultado() + " " + monedaDestino.getNombre());
			       // break;
			    	return;
				}	
		}	
	}
	
	private double resultado(){
	    double valorIngresado = this.cantidad;
	    double valorSeleccionado = monedaOrigen.getValor();
	    double valorMultiplicador = monedaDestino.getValor();
	    
	    double resultado = (valorIngresado/valorSeleccionado) * valorMultiplicador; 
	    
	    if (monedaDestino.getNombre() == monedaOrigen.getNombre()) {
	    	resultado = valorIngresado;
	    }
	    
	    if (monedaOrigen.getNombre().equals("Euro")){
	    	if (monedaDestino.getNombre().equals("Libra esterlina")) {
		            resultado =  this.cantidad * 0.88;
		        } else if (monedaDestino.getNombre().equals("Yen japones")) {
		            resultado =  this.cantidad * 143;
		        } else if (monedaDestino.getNombre().equals("Won surcoreano")) {
		            resultado =  this.cantidad * 1409;
		        }	
	    }
	    if (monedaOrigen.getNombre().equals("Libra esterlina")){ 
	    	if (monedaDestino.getNombre().equals("Euro")) {
	            resultado =  this.cantidad * 1.13;
	        } else if (monedaDestino.getNombre().equals("Yen japones")) {
	            resultado =  this.cantidad * 161;
	        } else if (monedaDestino.getNombre().equals("Won surcoreano")) {
	            resultado =  this.cantidad * 1593;
	        }	
	    }
	    if (monedaOrigen.getNombre().equals("Yen japones")){ 
	    	if (monedaDestino.getNombre().equals("Euro")) {
	            resultado =  this.cantidad * 0.0070;
	        } else if (monedaDestino.getNombre().equals("Libra esterlina")) {
	            resultado =  this.cantidad * 0.0062;
	        } else if (monedaDestino.getNombre().equals("Won surcoreano")) {
	            resultado =  this.cantidad * 10;
	        }	
	    }
	    if (monedaOrigen.getNombre().equals("Won surcoreano")){  
	    	if (monedaDestino.getNombre().equals("Euro")) {
	            resultado =  this.cantidad * 0.00071;
	        } else if (monedaDestino.getNombre().equals("Libra esterlina")) {
	            resultado =  this.cantidad * 0.00063;
	        } else if (monedaDestino.getNombre().equals("Yen japones")) {
	            resultado =  this.cantidad * 0.1;
	        }	
	    }
	    
	    return resultado;
	}

}