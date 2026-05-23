/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiontransportepublico;

/**
 *
 * @author Lucas
 */
public abstract class Vehiculo implements Comparable<Vehiculo>{
    protected String patente;
    protected String marca;
    protected int capacidadPasajeros;
    protected int anioFabricacion;
    
    
    public Vehiculo(String patente, String marca, int capacidadPasajeros, int anioFabricacion){
        this.patente = patente;
        this.marca = marca;
        this.capacidadPasajeros = capacidadPasajeros;
        this.anioFabricacion = anioFabricacion; 
    }
    
    public String mostrarVehiculo(){
        return "PATENTE: " + patente + " MARCA: " + marca + " Capacidad pasajeros: " + capacidadPasajeros + " Anio Fabricacion: " + anioFabricacion;
    }
    
    
    
    @Override
    public boolean equals(Object o){
        if(this == o){ 
            return true;
        }
        if(o == null || getClass() != o.getClass()){ 
            return false;
        }
        
        Vehiculo v = (Vehiculo)o; 
        return this.patente.equals(v.patente); 
    }
    
    @Override
    public int compareTo(Vehiculo v) {
        int diferenciaAnio = v.anioFabricacion - this.anioFabricacion;

        if (diferenciaAnio != 0) {
            return diferenciaAnio;
        }
        return v.capacidadPasajeros - this.capacidadPasajeros;
    }
    
}
