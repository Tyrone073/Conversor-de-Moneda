package conversor;

import javax.swing.JOptionPane;

public class Ejecutable {

	    public static void main(String[] args) {
	    	System.out.println("Bienvenido");
	    	metodo0();
	    	

	    }
	    
	    private static void metodo0() {
	    	//JOptionPane.showInputDialog(null, "Selecciona un tipo de conversor ", "Lista de opciones", JOptionPane.OK_CANCEL_OPTION, null, lista, lista [0]);
	    	Conversores conversores = new Conversores();
	    	conversores.mostrarMenu();
	    	//metodo1();
	    	int finalizar = JOptionPane.showConfirmDialog(null, "desea salir", "Confirmar salida", JOptionPane.YES_NO_OPTION);
		    	if (finalizar == JOptionPane.YES_OPTION) { // Si se presionó el botón "Cancelar"
			        System.exit(0); // Termina el programa
			    }else {
			    	 metodo0();
			    }
		    }
	    
	    private static void metodo1() {
	    	JOptionPane.showMessageDialog(null, "Bienvenido al conversor de monedas");
	    	metodo2();
	    }
	    
	    /*private static void metodo2() {
			//JOptionPane.showInputDialog(null, "ingrese el valor q decee cambiar");// esto es para agregar el valor a combertir
	    	metodo3();
	    }*/
	    
	    private static void metodo2() {
	    	ConversorMoneda conversorMoneda = new ConversorMoneda();
	    	conversorMoneda.mostrarInterfaz();
	    	//cambioMoneda.monedaSeleccionada();
	    	
	    }
	   
}

