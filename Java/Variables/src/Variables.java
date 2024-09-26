public class Variables {
    public static void main(String[] args) {
        // Variables
        int edad = 23; // Solo acepta enteros
        double precio = 300.40; // Acepta decimales
        boolean disponible = true; // puede ser T or F
        char genero; // almacenamos espacio en la ram. Pero no la declaramos aún
        genero = 'M'; // Masculino o Femenino , se usa ' en vez de " porque es char y no string

        //Acceder a las variables
        System.out.println("Tengo " + edad + " años y " + precio + " euros.");
        //Modificamos el valor
        edad = 24;
        precio= 25;
        System.out.println("Tengo " + edad + " años y " + precio + " euros.");
        //Resto de variables ( ejercicio del curso )
        System.out.println("1.Edad= " + edad + " 2.Precio= " + precio + " 3.Disponible= " + disponible + " 4.Genero(en char)= " + genero);
    }
}
