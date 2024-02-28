public class Barco extends VehiculoAcuatico {
    protected boolean motor;

    public Barco(String matricula, String modelo, int eslora, boolean motor) {
        super(matricula, modelo, eslora);
        this.motor = motor;
    }

    public boolean getMotor() {
        return motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }

    @Override
    public void imprimir() {
        System.out.println("Vehículo terrestre. Matrícula: " + matricula + ", Modelo: " + modelo + ", Eslora: " + eslora + ", Motor: " + motor);
    }
}