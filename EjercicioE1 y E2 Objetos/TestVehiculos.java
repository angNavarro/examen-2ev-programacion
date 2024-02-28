import java.util.ArrayList;

public class TestVehiculos {
    public static void main(String[] args) {
        //VehiculoTerrestre vehiculo = new VehiculoTerrestre("1234HAB", "modelo", 4);
        //vehiculo.imprimir();
        //Coche coche = new Coche("1234HAB", "modelo", 4, true);
        //coche.imprimir();

        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Coche("1234ABC", "Toyota", 4, true));
        vehiculos.add(new Barco("9012GHI", "Yamaha", 10, true));

        for(Vehiculo vehiculo : vehiculos){
            if(vehiculo instanceof VehiculoTerrestre) {
                System.out.println("Ruedas: " + ((VehiculoTerrestre) vehiculo).getRuedas());
            }
        }
    }
}