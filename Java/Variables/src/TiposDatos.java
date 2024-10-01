public class TiposDatos {
    public static void main(String[] args) {
        //Tipos de Datos en Java

        //Enteros ( Valor por default 0)

        // Cuidado con estos, pueden tener perdida de precisión en la conversión, usar en caso de estar seguros
        byte tipoByte = 127;  // introducimos soutv (intellij) para nombre + la variable | Maximo valor en byte 127
        System.out.println("tipoByte = " + tipoByte);
        short tipoShort = 32000; // Maximo valor en short 32000
        System.out.println("tipoShort = " + tipoShort);
        int tipoInt = 2147483647; // Maximo valor positivo en int 2147483647 ( 32 bits )
        System.out.println("tipoInt = " + tipoInt);
        long tipoLong = 987654321098765432L; // Usamos L al final para declarar que es Long , no es el limite exacto pero si cerca del limite ( 64 bits )

        // Punto flotante ( con decimales, valor por default 0.0 )
        float tipoFloat = 3.14F; // Añadimos F al final para dictar que es un tipo Float, si no, java lo reconoce como un tipo double ( Float soporta hasta 32 bits )
        System.out.println("tipoFloat = " + tipoFloat);
        double tipoDouble = 3.1315D;  // Opcional añadir la D / d para indicar que es double, ya que por default es tipo double ( Hasta 64 bits )
        System.out.println("tipoDouble = " + tipoDouble);

        // Caracter ( valor por default '\u0000' valor 0 en unicode)
        char tipoChar = 'A'; // Caracteres de unicode, ya que es el estandar diseñado para soportar la mayoria de sistemas al trabajar en pc. Acepta tambien el uso de un decimal
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 65; // es el equivalente a la letra A en unicode
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = '@'; // tambien pertenece a unicode, no solo letras o numeros, tambien algunos simbolos.
        System.out.println("tipoChar = " + tipoChar);


        // Booleano ( valor por default False )
        boolean tipoBoolean = true; // Se utiliza para asignar verdadero
        System.out.println("tipoBoolean = " + tipoBoolean);
        tipoBoolean = false; // lo utilizamos para asignar falso
        System.out.println("tipoBoolean = " + tipoBoolean);

        // Tipo Object ( o tipos de referencia )
        String nombre = null; // Ausencia de valor o referencia a un objeto
        System.out.println("nombre = " + nombre);
        nombre = "Angel Leon"; // Ya no imprime ausencia de valor, imprime el valor del objeto al que está apuntando.
        System.out.println("nombre = " + nombre);
    }
}
