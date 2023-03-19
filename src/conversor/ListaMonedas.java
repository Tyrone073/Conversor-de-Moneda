package conversor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListaMonedas {
	
    private Collection<Agrega> monedaList = new ArrayList<>();

    public ListaMonedas() {
        Agrega dolar = new Agrega("dolar", 1.50);//1.0
        Agrega euro = new Agrega("Euro", 1.41);//1.40//0.94  0.813399   1.2200985
        Agrega libra = new Agrega("Libra esterlina", 1.23);//0.82
        Agrega yen = new Agrega("Yen japones", 198);//132
        Agrega won = new Agrega("Won surcoreano", 1962);//1308/1963

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
