package conversor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListaMonedas {
	
    private Collection<Moneda> monedaList = new ArrayList<>();

    public ListaMonedas() {
        Moneda dolar = new Moneda("dolar", 1.0);
        Moneda euro = new Moneda("Euro", 0.84);
        Moneda libra = new Moneda("Libra esterlina", 0.73);
        Moneda yen = new Moneda("Yen japones", 118.3);
        Moneda won = new Moneda("Won surcoreano", 1117.8);

        monedaList.add(dolar);
        monedaList.add(euro);
        monedaList.add(libra);
        monedaList.add(yen);
        monedaList.add(won);

    }

    public Collection<Moneda> getMonedaList() {
        return monedaList;
    }
    
}
