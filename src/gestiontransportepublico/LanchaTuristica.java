package gestiontransportepublico;

public class LanchaTuristica extends Vehiculo{
    private TipoMotor tipoMotor;
 
    public LanchaTuristica(String patente, String marca, int capacidadPasajeros, int anioFabricacion, TipoMotor tipoMotor) {
        super(patente, marca, capacidadPasajeros, anioFabricacion);
        this.tipoMotor = tipoMotor;
    }

    @Override
    public String mostrarVehiculo(){
        return "LANCHA TURISTICA " + super.mostrarVehiculo() + " TIPO MOTOR : " + tipoMotor;
    }
}
