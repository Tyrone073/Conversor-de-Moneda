package conversor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListaTemperatura {
	
    private Collection<Agrega> temperaturaList = new ArrayList<>();

    public ListaTemperatura() {
        Agrega celsius = new Agrega("Celsius",273.15);// este se suma o se resta con kelvin
        Agrega fahrenheit = new Agrega("Fahrenheit", 459.67);// se suma o resta con kelvin
        Agrega kelvin = new Agrega("Kelvin", 0.0);
       
        temperaturaList.add(celsius);
        temperaturaList.add(fahrenheit);
        temperaturaList.add(kelvin);
        
    }
	public Collection<Agrega> getTemperaturaList() {
		return temperaturaList;
	}
}
