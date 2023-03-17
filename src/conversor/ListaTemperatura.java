package conversor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListaTemperatura {
	
    private Collection<Moneda> temperaturaList = new ArrayList<>();

    public ListaTemperatura() {
        Moneda celsius = new Moneda("Celsius", 1.0);
        Moneda fahrenheit = new Moneda("Fahrenheit", 0.84);
        Moneda kelvin = new Moneda("Kelvin", 0.73);
        Moneda yen = new Moneda("Yen japones", 118.3);
        Moneda won = new Moneda("Won surcoreano", 1117.8);

        temperaturaList.add(celsius);
        temperaturaList.add(fahrenheit);
        temperaturaList.add(kelvin);
        temperaturaList.add(yen);
        temperaturaList.add(won);

    }

    public Collection<Moneda> getMonedaList() {
        return monedaList;
    }
    
}
