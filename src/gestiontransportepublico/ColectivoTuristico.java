
package gestiontransportepublico;



public class ColectivoTuristico extends Vehiculo{
    private int cantidadPisos;

    public ColectivoTuristico(String patente, String marca, int capacidadPasajeros, int anioFabricacion, int cantidadPisos) {
        super(patente, marca, capacidadPasajeros, anioFabricacion);
        this.cantidadPisos = cantidadPisos;
    }

    @Override
    public String mostrarVehiculo(){
        return "COLECTIVO TURISTICO " + super.mostrarVehiculo() + " CANTIDAD PISOS: " + cantidadPisos;
    }
}

