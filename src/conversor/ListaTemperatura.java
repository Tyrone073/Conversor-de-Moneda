package conversor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListaTemperatura {
	
    private Collection<Agrega> temperaturaList = new ArrayList<>();

    public ListaTemperatura() {
        Agrega celsius = new Agrega("Celsius", 1.0);
        Agrega fahrenheit = new Agrega("Fahrenheit", 0.84);
        Agrega kelvin = new Agrega("Kelvin", 0.73);
       
        temperaturaList.add(celsius);
        temperaturaList.add(fahrenheit);
        temperaturaList.add(kelvin);
        
    }
	public Collection<Agrega> getTemperaturaList() {
		return temperaturaList;
	}
}
