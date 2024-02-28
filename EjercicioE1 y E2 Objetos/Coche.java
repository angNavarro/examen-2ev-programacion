public class Coche extends VehiculoTerrestre {
    protected boolean aireAcondicionado;

    public Coche(String matricula, String modelo, int ruedas, boolean aireAcondicionado) {
        super(matricula, modelo, ruedas);
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean getAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    @Override
    public void imprimir() {
        System.out.println("Vehículo terrestre. Matrícula: " + matricula + ", Modelo: " + modelo + ", Ruedas: " + ruedas + ", Aire Acondicionado: " + aireAcondicionado);
    }
}