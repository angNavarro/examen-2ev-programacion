public class VehiculoTerrestre extends Vehiculo {
    protected int ruedas;

    public VehiculoTerrestre(String matricula, String modelo, int ruedas) {
        super(matricula, modelo);
        this.ruedas = ruedas;
    }

    public int getRuedas() {
        return ruedas;
    }

    @Override
    public void imprimir() {
        System.out.println("Vehículo terrestre. Matrícula: " + matricula + ", Modelo: " + modelo + ", Ruedas: " + ruedas);
    }
}