package conversor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Conversores {
	
	private List<String> conversores = new ArrayList<>();
	Object[] listaDeConversores;
	
	String ConversorDeMoneda = new String("conversor de monedas");
	String ConversorDeTemperatura = new String("conversor de Temperaturas");
	Object Opcion;
		
	public Conversores() {
	
        conversores.add(ConversorDeMoneda);
        conversores.add(ConversorDeTemperatura);
        listaDeConversores = conversores.toArray();
    }
	
	public void mostrarMenu() {
		 Opcion = JOptionPane.showInputDialog(null, "Selecciona un tipo de conversor", "Lista de opciones", JOptionPane.OK_CANCEL_OPTION, null, listaDeConversores, listaDeConversores[0]);
		 
		 if (Opcion != null) {
		        if (Opcion.equals(ConversorDeMoneda)) {
		            new ConversorMoneda().mostrarInterfaz();
		        } else if (Opcion.equals(ConversorDeTemperatura)) {
		            new ConversorTemperatura().mostrarInterfaz();
		        }
		    } else {
		        //JOptionPane.showMessageDialog(null, "Operación cancelada");
		       // System.exit(0);
		        return;
		    }   
	}	
}