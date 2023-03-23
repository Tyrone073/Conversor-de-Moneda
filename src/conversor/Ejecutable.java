package conversor;

import javax.swing.JOptionPane;

public class Ejecutable {

	    public static void main(String[] args) {
	    	System.out.println("Bienvenido");
	    	metodo0();
	    	

	    }
	    
	    private static void metodo0() {
	    	Conversores conversores = new Conversores();
	    	conversores.mostrarMenu();
	    	int finalizar = JOptionPane.showConfirmDialog(null, "desea salir", "Confirmar salida", JOptionPane.YES_NO_OPTION);
		    	if (finalizar == JOptionPane.YES_OPTION) {
			        System.exit(0);
			    }else {
			    	 metodo0();
			    }
		    }
	    
	    private static void metodo1() {
	    	JOptionPane.showMessageDialog(null, "Bienvenido al conversor de monedas");
	    	metodo2();
	    }

	    private static void metodo2() {
	    	ConversorMoneda conversorMoneda = new ConversorMoneda();
	    	conversorMoneda.mostrarInterfaz();
	    }
	   
}