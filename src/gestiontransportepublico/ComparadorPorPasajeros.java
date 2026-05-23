
package gestiontransportepublico;

import java.util.Comparator;

public class ComparadorPorPasajeros implements Comparator<Vehiculo>{

    @Override
    public int compare(Vehiculo v1, Vehiculo v2) {// ordena el mas nuevo primero
        return v2.capacidadPasajeros - v1.capacidadPasajeros;
    }
    
}
