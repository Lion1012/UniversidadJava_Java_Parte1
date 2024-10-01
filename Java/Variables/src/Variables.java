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

        /*

        Las reglas en Java sobre variables nos enseñan:
        1. Debe comenzar con una letra minuscula, un simbolo de dolar ($) o guion bajo (_)
            Ej. nombre, $nombre, _nombre
        2. No puede contener espacios o caracteres especiales.
            Ej union de palabras. nombreCliente, nombreCompleto, holaAngel
        3. No se pueden utilizar palabras reservadas de Java ( o Keyword ) ya que nos dará errores de compilación
            Ej. No usar tipos de datos ( int, string, double ) o tipos de bucles ( while, for ) etc.
        4. Distingue entre mayúsculas y minusculas.
            Ej. No es la misma variable "angel" que "Angel"


         Las buenas prácticas no marcan error de compilación pero son recomendaciones que facilitan la legibilidad del codigo.

         1. Usar CamelCase o alguna notacion validada.
            -Comienza con minuscula y si son varias palabras, la primera palabra empieza en minuscula y la segunda en mayuscula Ej. nombreCompleto
         2. Ser descriptivo y claro en los nombres de las variables. ( no se recomienda utilizar acentos o caracteres especiales no admitidos en inglés fuera de comentarios )
            -Deben describir claramente su proposito Ej. precioProducto , numeroTelefono etc. )
         3. Si es necesario se permite prefijos o sufijos claros
            - En tipos Booleanos se puede utilizar el prefijo "is" o "has" is = si está activa , o "has" si tiene. Ej. isActivo/esActivo o hasSaldo/tieneSaldo = se usa para especificar.
            - Recomienda mantener el mismo idioma en el lenguaje y no saltar entre ellos con diferentes variables .
         4. Se debe evitar nombres de variables de una sola letra.
            -Debes ser descriptivo para ser más legible.
         5- No abusar de abreviaturas
            -No debes asumir la legibilidad del codigo aunque quizá tu lo entiendas, es mejor ser descriptivo y claro.   Ej. Deberias usar totalPiezas en lugar de totPzs
         */
    }
}
