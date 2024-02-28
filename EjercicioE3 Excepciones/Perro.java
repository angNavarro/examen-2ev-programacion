public class Perro {
    private String nombre;
    private int edad;

    static class NombreInvalidoException extends Exception {
        public NombreInvalidoException(String message) {
            super(message);
        }
    }

    static class EdadInvalidadaException extends Exception {
        public EdadInvalidadaException(String message) {
            super(message);
        }
    }

    public Perro(String nombre, int edad) throws NombreInvalidoException, EdadInvalidadaException {
        setNombre(nombre);
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws NombreInvalidoException {
        if(nombre == null || nombre.length() < 3) {
            throw new NombreInvalidoException("El nombre debe tener al menos 3 caracteres: " + nombre);
        }
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws EdadInvalidadaException {
        if(edad < 0) {
            throw new EdadInvalidadaException("La edad no puede ser negativa: " + edad);
        }
        this.edad = edad;
    }

    public void imprimir() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }

}