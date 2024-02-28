public class VehiculoAcuatico extends Vehiculo {
    protected int eslora;

    public VehiculoAcuatico(String matricula, String modelo, int eslora) {
        super(matricula, modelo);
        this.eslora = eslora;
    }

    public int getEslora() {
        return eslora;
    }

    @Override
    public void imprimir() {
        System.out.println("Vehículo acuático. Matrícula: " + matricula + ", Modelo: " + modelo + ", Eslora: " + eslora);
    }
}