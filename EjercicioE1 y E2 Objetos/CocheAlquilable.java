public class CocheAlquilable extends Coche implements Alquilable {
    private boolean alquilado;
    private String cliente;
    private int dias;
    private double precio;

    public CocheAlquilable(String matricula, String modelo, int ruedas, boolean aireAcondicionado, double precio) {
        super(matricula, modelo, ruedas, aireAcondicionado);
        this.alquilado = false;
        this.cliente = "";
        this.dias = 0;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public double alquilar(String nombre, int dias) {
        if(!alquilado) {
            this.alquilado = true;
            this.cliente = nombre;
            this.dias = dias;

            return precio * dias * IVA;
        } else {
            System.out.println("El coche ya está alquilado.");
            
            return 0;
        }
    }

    @Override
    public void devolver() {
        if(alquilado) {
            this.alquilado = false;
            this.cliente = "";
            this.dias = 0;
            System.out.println("El coche se ha devuelto correctamente.");
        } else {
            System.out.println("El coche no está alquilado en este momento.");
        }
    }

    @Override
    public void imprimir() {
        super.imprimir();
        if(alquilado) {
            System.out.println("Alquilado a:" + cliente + " para " + dias + " días por " + precio * dias * IVA);
        } else {
            System.out.println("El coche no está alquilado.");
        }
    } 
}
