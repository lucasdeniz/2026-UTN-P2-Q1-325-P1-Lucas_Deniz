
package gestiontransportepublico;

import java.util.ArrayList;
import java.util.Collections;


public class EmpresaGestion {
    private ArrayList<Vehiculo> vehiculos;
    
    public EmpresaGestion(){
        this.vehiculos = new ArrayList<>();
    }
    
    
    public void vehiculosCapacidadMayorAlValor(int capacidad){
        if(!vehiculos.isEmpty()){
            for(Vehiculo v : vehiculos){
                if(v != null){
                    if(v.capacidadPasajeros > capacidad){
                        System.out.println(v.mostrarVehiculo());
                    }
                }
            }
        }
    }
    
    public Vehiculo buscarVehiculoPorPatente(String patente){
        if(!vehiculos.isEmpty()){
            for(Vehiculo v : vehiculos){
                if(v.patente.equals(patente)){
                    return v;
                }
            }
        }
        return null;
    }
    
    public void realizarServiciosTuristicos(){
        System.out.println("INICIANDO SERVICIOS TURISTICOS");
        System.out.println("LAS SIGUIENTES UNIDADES INICIARAN SERVICIO TURISTICO:  ");
        if(!vehiculos.isEmpty()){
            for(Vehiculo v : vehiculos){
                if(v instanceof ColectivoTuristico || v instanceof LanchaTuristica){
                    System.out.println(v.mostrarVehiculo());
                }
            }
        }
    }
    
    public String mostrarVehiculos(){
        StringBuilder sb = new StringBuilder();
        
        if(!vehiculos.isEmpty()){
            sb.append("\n*** Vehiculos Disponibles ***").append("\n");
            for(Vehiculo v : vehiculos){
                sb.append(v.mostrarVehiculo()).append("\n");
            }
        }
        return sb.toString();
    }
    
    public boolean agregarVehiculo(Vehiculo vehiculo){
        for(Vehiculo v : vehiculos){
            if(vehiculos != null){
                if(v.equals(vehiculo)){ // valida patente existente
                    return false;
                }
            }
        }
        vehiculos.add(vehiculo);
        return true;
    }
    
        public String ordenaPorAnio(){
        StringBuilder sb = new StringBuilder();
        if(!vehiculos.isEmpty()){
            Collections.sort(vehiculos);
            for(Vehiculo v : vehiculos){
                sb.append(v.mostrarVehiculo()).append("\n");
            }    
        }
        return sb.toString();
    }
        
        public String ordenaPorCapacidadPasajeros(){
        StringBuilder sb = new StringBuilder();
        if(!vehiculos.isEmpty()){
            Collections.sort(vehiculos, new ComparadorPorPasajeros());
            for(Vehiculo v : vehiculos){
                sb.append(v.mostrarVehiculo()).append("\n");
            }    
        }
        return sb.toString();
    }
}
