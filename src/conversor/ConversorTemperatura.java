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
	
	
	private Agrega temperaturaDestino;
	private Agrega temperaturaOrigen;
	private double cantidad;
	 
	/*private String nombre = "Conversor de Temperaturas" ;

    public String getNombre() {
        return nombre;
    } */
	
	
	public void mostrarInterfaz() {	
		
		JOptionPane.showMessageDialog(null, "Bienvenido al conversor de temperatura");
		
		while (true) {
			temperaturaOrigen = (Agrega) JOptionPane.showInputDialog(null, "Selecciona una temperatura que se va a convertir ", "Lista de opciones", JOptionPane.OK_CANCEL_OPTION, null, lista, lista [0]);
				if (temperaturaOrigen == null) { // Si se presionó el botón "Cancelar"
					return; // Termina el programa
			    }
				while (true) {
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
				  //  while (true) {
			    	temperaturaDestino = (Agrega) JOptionPane.showInputDialog(null, "Selecciona una temperatura a convertir", "Lista de opciones", JOptionPane.QUESTION_MESSAGE, null, lista, lista [0]);
						if (temperaturaDestino == null) { // Si se presionó el botón "Cancelar"
							continue;
							//break;
							//return cuadroInput;
						}
						JOptionPane.showMessageDialog(null, cantidad + " " + temperaturaOrigen.getNombre() + " es equivalente a " + resultado() + " " + temperaturaDestino.getNombre());
						//break;
			    	//}
				return;//para q termine y regrese al inicio
				//break; este es para repetir el ciclo de este conversor y es para testeo nomas
			}
			
		}
	}
	private double resultado(){
	    double resultados = 0 ;
	    if (temperaturaOrigen.getNombre().equals("Celsius")) {
	        if (temperaturaDestino.getNombre().equals("Kelvin")) {
	            resultados =  this.cantidad + 273.15;

	        } else if (temperaturaDestino.getNombre().equals("Fahrenheit")) {
	            resultados =  this.cantidad * 9/5 + 32;
	        }
	    } else if (temperaturaOrigen.getNombre().equals("Fahrenheit")) {
	        if (temperaturaDestino.getNombre().equals("Celsius")) {
	        	resultados =  (this.cantidad - 32) * (5.0/9.0);

	        } else if (temperaturaDestino.getNombre().equals("Kelvin")) {
	            resultados =  (this.cantidad - 32) * (5/9) + 273.15;
	        }
	    } else if (temperaturaOrigen.getNombre().equals("Kelvin")) {
	        if (temperaturaDestino.getNombre().equals("Celsius")) {
	            resultados =  this.cantidad - 273.15;

	        } else if (temperaturaDestino.getNombre().equals("Fahrenheit")) {
	            resultados =  ((this.cantidad - 273.15) * 9/5 ) + 32;
	        }
	    } 
	    if (temperaturaDestino.getNombre() == temperaturaOrigen.getNombre()) { // es para q se transforme a dos monedas igual a la lisma cantidad
	    	//valorMultiplicador = (valorSeleccionado * valorIngresado)/ valorMultiplicador;
	    	//valorMultiplicador = 1;
	    	resultados = this.cantidad;
	    }
	    return resultados;
	}
}
	    
	  
	    /* if ( valorSeleccionado.equals("celsius") == valorMultiplicador.equals("kelvin") ) {
	    	// hacer el ejercicio
	    	resultados = valorIngresado +  273.15;
	    	//return resultados;
	    }else if ( valorSeleccionado.equals("celsius") || valorMultiplicador.equals("fahrenheit") ) {
	    	// hacer el ejercicio
	    	resultados = valorIngresado *9/5 + 32;
	    	//return resultados;
	    }
	   
	   /*  if ( temperaturaOrigen.getNombre().contains("fahrenheit") && temperaturaDestino.getNombre().contains("celsius") ) {
	    	// hacer el ejercicio
	    	resultados = (valorIngresado - 32) * (5/9);
	    	return resultados;
	    }
	    if ( temperaturaOrigen.getNombre().equals("fahrenheit") && temperaturaDestino.getNombre().contains("fahrenheit") ) {
	    	// hacer el ejercicio
	    	resultados = valorIngresado *9/5 + 32;
	    	return resultados;
	    }
	    if ( temperaturaOrigen.getNombre().contains("kelvin") && temperaturaDestino.getNombre().contains("fahrenheit") ) {
	    	// hacer el ejercicio
	    	resultados = valorIngresado *9/5 + 32;
	    	return resultados;
	    }
	    if ( temperaturaOrigen.getNombre().contains("kelvin") && temperaturaDestino.getNombre().contains("fahrenheit") ) {
	    	// hacer el ejercicio
	    	resultados = valorIngresado *9/5 + 32;
	    	return resultados;
	    }
	    //return resultado;*/
		//return resultados;
	

	/*public void getConversores() {
		// TODO Auto-generated method stub
		return mostrarInterfaz();
	}*/


		
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
		
		
		
		