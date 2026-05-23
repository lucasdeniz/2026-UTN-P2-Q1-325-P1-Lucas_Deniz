/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiontransportepublico;

/**
 *
 * @author Lucas
 */
public class VanEjecutiva extends Vehiculo{
    private boolean aireAcondicionado;
    public VanEjecutiva(String patente, String marca, int capacidadPasajeros, int anioFabricacion, boolean aireAcondicionado) {
        super(patente, marca, capacidadPasajeros, anioFabricacion);
        this.aireAcondicionado = aireAcondicionado;
    }

    @Override
    public String mostrarVehiculo(){
        return "VAN EJECUTIVA " + super.mostrarVehiculo() + " TIENE AIRE ACOND. : " + aireAcondicionado;
    }
}
