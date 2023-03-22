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

//import ejecutor.JComboBox;

public class ConversorMoneda {

	ListaMonedas listaMonedas = new ListaMonedas();//esto es para crear una intancia de la lista
	Object[] lista = listaMonedas.getMonedaList().toArray();//aqui se transforma esa intancia para q se pueda utilizar en la seleccion
	// private Collection<Agrega> actualizacionEuro = new ArrayList<>();
	// Collection<Agrega> NuevoEuro = listaMonedas.getActualizacionEuro();
	
	private Agrega monedaDestino;
	private Agrega monedaOrigen;
	private double cantidad ;
	
	
	
	public void mostrarInterfaz() {	// este codigo sirve 
		JOptionPane.showMessageDialog(null, "Bienvenido al conversor de monedas"); 
		
		while (true) {
			monedaOrigen = (Agrega) JOptionPane.showInputDialog(null, "Selecciona una moneda que se va a convertir ", "Lista de opciones", JOptionPane.OK_CANCEL_OPTION, null, lista, lista [0]);
				if (monedaOrigen == null) { // Si se presionó el botón "Cancelar"
					return; // esta parte esta bien ya q si se preciona canselar va a correr y preguntar el int finalizar
			    }
				while (true) {// este si sirve al precionar cancel si regresa a origen
					String cuadroInput = JOptionPane.showInputDialog(null, "Ingresa la cantidad a convertir:", "Cantidad", JOptionPane.OK_CANCEL_OPTION);
				    if (cuadroInput == null) {
				        break; // Si el usuario presiona "Cancelar" o "Cerrar", salir del bucle
				    }
				    if (!cuadroInput.matches("^(?:0|[1-9]\\d*)(?:\\.\\d\\d?)?$")) {
				    	JOptionPane.showMessageDialog(null, "valor no valido solo se permite numeros");
				    	continue;
				    }else{
				    	cantidad = Double.parseDouble(cuadroInput);
				    }
			    	//while (true) {
				    monedaDestino = (Agrega) JOptionPane.showInputDialog(null, "Selecciona una moneda a convertir", "Lista de opciones", JOptionPane.OK_CANCEL_OPTION, null, lista, lista [0]);
				    if (monedaDestino == null) { // Si se presionó el botón "Cancelar"
				        continue;	
				    	//;// para q cierre el problema
				    	}
			        JOptionPane.showMessageDialog(null, cantidad + " " + monedaOrigen.getNombre() + " es equivalente a " + resultado() + " " + monedaDestino.getNombre());
			       // break;
			    	//}
			    	return;
			    	//break;
				}	
		}	
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
	    
	    double resultado = (valorIngresado/valorSeleccionado) * valorMultiplicador; // valorMultiplicador;// solo funciona al transformar con dolares
	    //double resultado = (valorIngresado * valorSeleccionado) / valorMultiplicador;
	    //double resultado = valorIngresado;
	    //(valorIngresado / valorOrigen) * valorDestino
	    
	    if (monedaDestino.getNombre() == monedaOrigen.getNombre()) { // es para q se transforme a dos monedas igual a la lisma cantidad
	    	//valorMultiplicador = (valorSeleccionado * valorIngresado)/ valorMultiplicador;
	    	//valorMultiplicador = 1;
	    	resultado = valorIngresado;
	    }
	    
	    /*if (monedaDestino.getNombre().contains("Dolar") && monedaOrigen.getNombre().contains("Dolar")) {// esto funciona si es seleccionado dolar ye el || es un O
	    	  //resultado = valorIngresado * valorMultiplicador;
	    	  resultado = (valorIngresado/valorSeleccionado) * valorMultiplicador;
	    	}*/
	    if (monedaOrigen.getNombre().equals("Euro")){ /*|| monedaOrigen.getNombre().contains("Libra esterlina")*/
		       /* if (monedaDestino.getNombre().equals("Dolar")) {
		            resultado =  this.cantidad * 1.09;

		        } else*/ if (monedaDestino.getNombre().equals("Libra esterlina")) {
		            resultado =  this.cantidad * 0.88;
		        } else if (monedaDestino.getNombre().equals("Yen japones")) {
		            resultado =  this.cantidad * 143;
		        } else if (monedaDestino.getNombre().equals("Won surcoreano")) {
		            resultado =  this.cantidad * 1409;
		        }	
	    }
	    if (monedaOrigen.getNombre().equals("Libra esterlina")){ /*|| monedaOrigen.getNombre().contains("Libra esterlina")*/
	       /* if (monedaDestino.getNombre().equals("Dolar")) {
	            resultado =  this.cantidad * 1.23;

	        } else*/ if (monedaDestino.getNombre().equals("Euro")) {
	            resultado =  this.cantidad * 1.13;
	        } else if (monedaDestino.getNombre().equals("Yen japones")) {
	            resultado =  this.cantidad * 161;
	        } else if (monedaDestino.getNombre().equals("Won surcoreano")) {
	            resultado =  this.cantidad * 1593;
	        }	
	    }
	    if (monedaOrigen.getNombre().equals("Yen japones")){ /*|| monedaOrigen.getNombre().contains("Libra esterlina")*/
	        /*if (monedaDestino.getNombre().equals("Dolar")) {
	            resultado =  this.cantidad * 0.0076;

	        } else */if (monedaDestino.getNombre().equals("Euro")) {
	            resultado =  this.cantidad * 0.0070;
	        } else if (monedaDestino.getNombre().equals("Libra esterlina")) {
	            resultado =  this.cantidad * 0.0062;
	        } else if (monedaDestino.getNombre().equals("Won surcoreano")) {
	            resultado =  this.cantidad * 10;
	        }	
	    }
	    if (monedaOrigen.getNombre().equals("Won surcoreano")){ /*|| monedaOrigen.getNombre().contains("Libra esterlina")*/
	       /* if (monedaDestino.getNombre().equals("Dolar")) {
	            resultado =  this.cantidad * 0.00077;

	        } else*/ if (monedaDestino.getNombre().equals("Euro")) {
	            resultado =  this.cantidad * 0.00071;
	        } else if (monedaDestino.getNombre().equals("Libra esterlina")) {
	            resultado =  this.cantidad * 0.00063;
	        } else if (monedaDestino.getNombre().equals("Yen japones")) {
	            resultado =  this.cantidad * 0.1;
	        }	
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
		
		/*else {
			    	cantidad = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la cantidad a convertir", "Cantidad", JOptionPane.OK_CANCEL_OPTION));
			    	if (cantidad == JOptionPane.CANCEL_OPTION) { // Si se presionó el botón "Cancelar"
			    		continue;
				    }
			    	monedaDestino = (Agrega) JOptionPane.showInputDialog(null, "Selecciona una moneda a convertir", "Lista de opciones", JOptionPane.OK_OPTION, null, lista, lista [0]);
						/*if (monedaDestino == null) { // Si se presionó el botón "Cancelar"
				        //System.exit(0); // Termina el programa
						return;
						}*/
						/*break;
			    	}*/
		
		