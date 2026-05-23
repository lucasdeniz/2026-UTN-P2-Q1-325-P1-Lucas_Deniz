
package gestiontransportepublico;

import java.util.Scanner;

public class Main {
    static Scanner entrada = new Scanner(System.in);
    static EmpresaGestion empresa = new EmpresaGestion();
    static FabricaVehiculos fabrica = new FabricaVehiculos();
    
    
    public static void desplegarMenu(){
        int opcion;
        
        do{
            System.out.println("=== SISTEMA DE GESTION DE TRANSPORTE TURISTICO ===");
            System.out.println("1. Agregar Vehiculo");
            System.out.println("2. Mostrar todos los vehiculos");
            System.out.println("3. Realizar servicios turisticos");
            System.out.println("4. Buscar vehiculo por patente");
            System.out.println("5. Mostrar vehículos con capacidad mayor a un valor ingresado");
            System.out.println("6. Mostrar vehículos ordenados por año de fabricación descendente");
            System.out.println("7. Mostrar vehículos ordenados por capacidad de pasajeros descendente");
            System.out.println("8. Salir");
            System.out.print("Opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            ejecutarOpcion(opcion);
            System.out.println();
        }
        while(opcion != 8);
        
    }
    
    public static void ejecutarOpcion(int opcion){
        String patenteIngresada;
        int valorIngresado;
        
        if(opcion == 1){
            Vehiculo nuevoVehiculo = FabricaVehiculos.crearVehiculo();

            if(empresa.agregarVehiculo(nuevoVehiculo)){
                System.out.println(" +++ Vehiculo agregado correctamente +++");
            }
            else{
                System.out.println("--- Ya existe un vehiculo con esa patente ---");
            }
        }
        else if(opcion == 2){
            System.out.println(empresa.mostrarVehiculos());
        }
        else if(opcion == 3){
            empresa.realizarServiciosTuristicos();
        }
        else if(opcion == 4){
            System.out.println("Ingrese la patente: ");
            patenteIngresada = entrada.nextLine();
            Vehiculo rastreado = empresa.buscarVehiculoPorPatente(patenteIngresada);
            if(rastreado != null){
                System.out.println("DATOS VEHICULO: ");
                System.out.println(rastreado.mostrarVehiculo());
            }
            else{
                System.out.println("Vehiculo no encontrado.");
            }
            
        }
        else if(opcion == 5){
            System.out.println("Ingrese un valor para capacidad: ");
            valorIngresado = entrada.nextInt();
            empresa.vehiculosCapacidadMayorAlValor(valorIngresado);
        }
        else if(opcion == 6){
            System.out.println("ORDEN POR ANIO: ");
            System.out.println(empresa.ordenaPorAnio());
        }
        else if(opcion == 7){
            System.out.println("ORDEN POR CANTIDAD PASAJEROS: ");
            System.out.println(empresa.ordenaPorCapacidadPasajeros());
        }
    }
    
    public static void main(String[] args) {
        //llamar fabrica
        
        desplegarMenu();
        //VanEjecutiva v1 = new VanEjecutiva("ASD", "FORD", 8, 2020, true);
        //VanEjecutiva v2 = new VanEjecutiva("ASD", "HONDA", 8, 2020, true);
        //System.out.println(v1.equals(v2));
        
        //no valida patente al ingresar
    }
}
