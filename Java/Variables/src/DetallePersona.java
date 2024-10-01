public class DetallePersona {
    public static void main(String[] args) {
        //Debemos declarar las variables nombre completo, edad, altura ( en metros ) , pais de origen y indicar si soy casado o soltero con un solo caracter.

        String nombreCompleto = "Ángel León";
        int edad = 23;
        double altura = 1.87;  // podemos asignarlo como float, de esta forma : float altura = 1.87F (añadimos la F al final para mostrar que es un float y no lo detecte como un double)
        String paisOrigen = "España";
        char estadoCivil = 'C';

        System.out.println("Hola mi nombre es " + nombreCompleto + " tengo " + edad + " años, mido " + altura + " y soy de " + paisOrigen + ". Ademas, actualmente mi estado civil es: " + estadoCivil + "asado."  );

    }
}
