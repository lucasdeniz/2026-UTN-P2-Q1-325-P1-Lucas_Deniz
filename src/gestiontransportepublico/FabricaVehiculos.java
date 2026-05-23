
package gestiontransportepublico;

import java.util.Scanner;


public class FabricaVehiculos {
    
    public static Vehiculo crearVehiculo(){
        Scanner entrada = new Scanner(System.in);
        String patente;
        String marca;
        int pasajeros;
        int anio;
        int opcionTipoMotor;
        int opcionTipoVehiculo;
        int opcionAire;
        int pisos;
        boolean tieneAire = false;
        TipoMotor motor;
        
        System.out.println("*** CREACION DE VEHICULOS ***");
        System.out.println("Ingrese los datos para un nuevo vehiculo ...");
        do{
            System.out.println("PATENTE: ");
            patente = entrada.nextLine();
            if(patente != null && !patente.isBlank()){
                break;
            }
            System.out.println("Ingrese una PATENTE VALIDA...");
        }while(true);
        
        
        do{
            System.out.println("MARCA: ");
            marca = entrada.nextLine();
            if(marca != null && !marca.isBlank()){
                break;
            }
            System.out.println("Ingrese una MARCA VALIDA...");
        }
        while(true);
        
        do{
            System.out.println("PASAJEROS: ");
            pasajeros = entrada.nextInt();
            entrada.nextLine();
        }
        while(pasajeros <= 0);
        
        do{
            System.out.println("AÑO FABRICACION: ");
            anio = entrada.nextInt();
            entrada.nextLine();
            if(anio >= 1990 && anio <= 2026){
                break;
            }
            System.out.println("Ingrese un anio VALIDO");
        }
        while(true);
        
        do{
            System.out.println("Elija un tipo de Vehiculo: ");
            System.out.println("1. COLECTIVO TURISTICO");
            System.out.println("2. VAN EJECUTIVA");
            System.out.println("3. LANCHA TURISTICA");
            System.out.print("Opcion : ");
            opcionTipoVehiculo = entrada.nextInt();
            entrada.nextLine();
            
            if(opcionTipoVehiculo > 0 && opcionTipoVehiculo < 4){
                break;
            }
            System.out.println("Ingrese una opcion VALIDA.");
        }
        while(true);
        
        if(opcionTipoVehiculo == 1){
            do{
                System.out.println("CANTIDAD DE PISOS");
                pisos = entrada.nextInt();
                entrada.nextLine();
                if(pisos == 1 || pisos == 2){
                    ColectivoTuristico ct = new ColectivoTuristico(patente, marca, pasajeros, anio, pisos);
                    return ct;
                }
                System.out.println("La cantidad debe ser 1 o 2");
            }
            while(true);
        }
        else if(opcionTipoVehiculo == 2){
            do{
                System.out.println("AIRE ACONDICIONADO: ");
                System.out.println("1. SI");
                System.out.println("2. NO");
                System.out.print("Opcion: ");
                opcionAire = entrada.nextInt();
                entrada.nextLine();
                if(opcionAire == 1 || opcionAire == 2){
                    if(opcionAire == 1){
                        tieneAire = true;
                    }
                    VanEjecutiva ve = new VanEjecutiva(patente, marca, pasajeros, anio, tieneAire);
                    return ve;                 
                }  
            }
            while(true);
        }
        else{
            do{
                System.out.println("TIPO MOTOR: ");
                System.out.println("1. NAFTA");
                System.out.println("2. DIESEL");
                System.out.println("3. ELECTRICO");
                System.out.print("Opcion: ");
                opcionTipoMotor = entrada.nextInt();
                entrada.nextLine();
                if(opcionTipoMotor >= 1 && opcionTipoMotor <= 3){
                    if(opcionTipoMotor == 1){
                        motor = TipoMotor.NAFTA;
                    }
                    else if(opcionTipoMotor == 2){
                        motor = TipoMotor.DIESEL;
                    }
                    else{
                        motor = TipoMotor.ELECTRICO;
                    }
                    LanchaTuristica lt = new LanchaTuristica(patente, marca, pasajeros, anio, motor);
                    return lt;
                }  
            }
            while(true);
        }
        
    }
    
}
