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
	Object Frase;
		
	public Conversores() {
	
        conversores.add(ConversorDeMoneda);
        conversores.add(ConversorDeTemperatura);
        listaDeConversores = conversores.toArray();
    }
	
	public void mostrarMenu() {
		 Frase = JOptionPane.showInputDialog(null, "Selecciona un tipo de conversor", "Lista de opciones", JOptionPane.QUESTION_MESSAGE, null, listaDeConversores, listaDeConversores[0]);
	    if (Frase.equals(ConversorDeMoneda)) {
	    	new ConversorMoneda().mostrarInterfaz();
	    }
	    if (Frase.equals(ConversorDeTemperatura)) {
	    	new ConversorTemperatura().mostrarInterfaz();
	    }
	}
	
}
	
	
	


/*public class Conversores {
    private List<Object> conversores = new ArrayList<>();
    Object[] lista = conversores.getoArray();

    public Conversores() {
        conversores.add(new ConversorMoneda());
        conversores.add(new ConversorTemperatura());
    }*/

    /*public void mostrarMenu() {
    	Object[] nombresConversores = new Object[conversores.size()];
        for (int i = 0; i < conversores.size(); i++) {
            nombresConversores[i] = conversores.get(i).getNombre();
        }
        String nombreConversor = (String) JOptionPane.showInputDialog(null, "Selecciona un tipo de conversor", "Lista de opciones", JOptionPane.QUESTION_MESSAGE, null, nombresConversores, nombresConversores[0]);
        if (nombreConversor != null) {
            for (Object conversor : conversores) {
                if (conversor.getNombre().equals(nombreConversor)) {
                    conversor.mostrarInterfaz();
                    break;
                }
            }
        }
    }
}



/*public class Conversores {
	private List<Object> conversores = new ArrayList<>();
	//Object[] lista = conversores.getConversores().toArray();
	//private List<String> nombresConversores = new ArrayList<>();
	
	//Object[] lista = conversores.toArray();
	
	//public void mostrarMenu()
	 public Conversores() {*/
			
	/*		conversores.add(new ConversorMoneda().getNombre());
	        conversores.add(new ConversorTemperatura().getNombre());
	 }

	public List<Object> getConversores() {
		return conversores;
	}  
	
	 
	public void mostrarMenu() {
		
		String[] opciones = new String[getConversores().size()];
        for (int i = 0; i < conversores.size(); i++) {
            opciones[i] = getConversores().get(i).getNombre();
        }
        String seleccion = (String) JOptionPane.showInputDialog(
                null, "Selecciona un tipo de conversor",
                "Lista de opciones", JOptionPane.PLAIN_MESSAGE,
                null, opciones, opciones[0]);
        if (seleccion != null) {
            for (Conversor conversor : conversores) {
                if (conversor.getNombre().equals(seleccion)) {
                    conversor.mostrarInterfaz();
                    break;
                }
		
		 //JOptionPane.showInputDialog(null, "Selecciona un tipo de conversor", "Lista de opciones", JOptionPane.OK_CANCEL_OPTION, null, lista, lista[0]);
		
	}
/*Object seleccion =*/
	 
		/*Object[] lista = new Object[conversores.size()];
		for (int i = 0; i < conversores.size(); i++) {
			lista[i] = ((Conversores) conversores.get(i)).getNombre();
		}*/
			/*ConversorMoneda conversorMoneda = new ConversorMoneda();
	ConversorTemperatura conversorTemperatura = new ConversorTemperatura();
	Object[] lista = conversorMoneda.mostrarInterfaz();
	//String lista = (String) conversorMoneda.mostrarInterfaz() ;//.toArray();
	private Collection<String> ConversoresList = new ArrayList<>();
	
	Object tipo1 = conversorMoneda.mostrarInterfaz();
	ConversoresList.add(this.case 1);*/
			/*Scanner scanner = new Scanner(System.in);
	        int opcion;
	        do {
	            System.out.println("Seleccione el tipo de conversión:");
	            System.out.println("1. Conversión de moneda");
	            System.out.println("2. Conversión de temperatura");
	            System.out.println("0. Salir");

	            opcion = scanner.nextInt();
	            switch (opcion) {
	                
	                    
	                    break;
	                case 2:
	                    conversorTemperatura.mostrarInterfaz();
	                    break;
	                case 0:
	                    System.out.println("Saliendo...");
	                    break;
	                default:
	                    System.out.println("Opción inválida");
	                    break;
	                    
	                   
	            }
	        } while (opcion != 0);*/
	    
			
			/*conversorMoneda = (ConversorMoneda) JOptionPane.showInputDialog(null, "Selecciona una temperatura que se va a convertir ", "Lista de opciones", JOptionPane.OK_CANCEL_OPTION, null, lista, lista [0]);
	    	//ConversorMoneda conversorMoneda = new ConversorMoneda();
	    	//ConversorTemperatura conversorTemperatura = new ConversorTemperatura();
	        /*Agrega celsius = new Agrega("Celsius",273.15);// este se suma o se resta con kelvin
	        Agrega fahrenheit = new Agrega("Fahrenheit", 459.67);// se suma o resta con kelvin
	        Agrega kelvin = new Agrega("Kelvin", 0.0);*/
			/*conversorMoneda.mostrarInterfaz();
			conversorTemperatura.mostrarInterfaz();
			conversorMoneda
			
			
			/*ConversorMoneda conversorMoneda =new ConversorMoneda().mostrarInterfaz(); ;
	    	conversorTemperatura = conversorTemperatura.mostrarInterfaz();*/
	    	/*ConversoresList.add(lista);
	        ConversoresList.add(conversorTemperatura);
	        
	    }*/
		 /* public List<List<Agrega>> getConversoresList() {
			  return ConversoresList;
		  }*/

