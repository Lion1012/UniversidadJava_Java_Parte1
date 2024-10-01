public class DetalleLibro {
    public static void main(String[] args) {
        // Detalles de un Libro
        String tituloLibro= "El Señor de los anillos";
        int cuandoPublicacion = 1954;
        boolean libroDisponible = true;
        double precio = 500.50;

        //Ejercicio practica para mostrar los valores donde personalemnte utilizo \n para el salto de linea.
        System.out.println("Información del Libro:\n" + "Titulo: " + tituloLibro + "\nCuando se publico el libro? " + cuandoPublicacion + "\nEstá disponible? " + libroDisponible + "\nCuanto vale? " + precio + " Euros");
        tituloLibro = "El señor de los Anillos"; // modificamos el titulo.
        System.out.println(tituloLibro);
    }
}
