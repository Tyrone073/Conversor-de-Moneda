package conversor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListaTemperatura {
	
    private Collection<Agrega> temperaturaList = new ArrayList<>();

    public ListaTemperatura() {
        Agrega celsius = new Agrega("Celsius",273.15);// estos valores esran de referencias y nu los use llamandolos sino q los puse directamente
        Agrega fahrenheit = new Agrega("Fahrenheit", 459.67);
        Agrega kelvin = new Agrega("Kelvin",273.15);
       
        temperaturaList.add(celsius);
        temperaturaList.add(fahrenheit);
        temperaturaList.add(kelvin);
        
    }
	public Collection<Agrega> getTemperaturaList() {
		return temperaturaList;
	}
}
