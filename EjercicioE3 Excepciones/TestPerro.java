public class TestPerro {
    public static void main(String[] args) {
        
        try {
            Perro perro = new Perro("bobby", 3);
            perro.imprimir();

            try {
                perro.setNombre("js");
            } catch (Perro.NombreInvalidoException e) {
                System.out.println(e.getMessage());
            }
    
            try {
                perro.setEdad(-1);
            } catch (Perro.EdadInvalidadaException e) {
                System.out.println(e.getMessage());
            }    


        } catch(Perro.NombreInvalidoException | Perro.EdadInvalidadaException e) {
            System.out.println(e.getMessage());
        }

        Perro[] perros = new Perro[5];

        try {
            perros[6] = new Perro("Pluto", 5);
        } catch(ArrayIndexOutOfBoundsException e) {
            // System.out.println(e.getMessage());
            System.out.println("Error: El índice está fuera de los límites del array.");
        } catch(Perro.NombreInvalidoException | Perro.EdadInvalidadaException e) {
            System.out.println(e.getMessage());
        }

    }
}
