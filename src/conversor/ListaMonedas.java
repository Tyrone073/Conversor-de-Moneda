package conversor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListaMonedas {
	
    private Collection<Agrega> monedaList = new ArrayList<>();

    public ListaMonedas() {
        Agrega dolar = new Agrega("dolar", 1.0);
        Agrega euro = new Agrega("Euro", 0.84);
        Agrega libra = new Agrega("Libra esterlina", 0.73);
        Agrega yen = new Agrega("Yen japones", 118.3);
        Agrega won = new Agrega("Won surcoreano", 1117.8);

        monedaList.add(dolar);
        monedaList.add(euro);
        monedaList.add(libra);
        monedaList.add(yen);
        monedaList.add(won);

    }

    public Collection<Agrega> getMonedaList() {
        return monedaList;
    }
    
}
