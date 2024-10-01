public class ReglasNombresVariables {
    public static void main(String[] args) {
        String nombreCompleto = "Ángel León"; // Correcto, usa CamelCase , cumple reglas y aplica buenas prácticas.
        System.out.println("nombreCompleto = " + nombreCompleto);
        String NombreCompleto = "Ángel León 2"; // No cumple las buenas prácticas pero es para demostrar que es diferente al no respetar el uso de mayusculas o minusculas.
        System.out.println("NombreCompleto = " + NombreCompleto);
        // String nombre-Cliente = "Angel"; Es incorrecto ya que no respeta las reglas y te lo detecta como un error.
        String nombre_cliente = "Angel"; // Aunque funcione, no estamos utilizando la notación de camelcase.
        String _apellido = "León"; // Es correcta y permitida.
        String $apellido = "León"; // Tiene diferente simbolo la variable por lo cual es diferente de la anterior y si es correcto y aceptable.
        int totPzs = 10; // Correcto y funciona, pero no aplica las buenas prácticas al abusar de abreviaciones.
        int totalPiezas = 11; // Correcto y aplica las buenas prácticas.
        boolean casado = true; // es correcta pero podría mejor al no estar dando contexto sobre el tipo de variable.
        boolean esCasado = true; // En este caso es correcto y aplica las buenas prácticas al estar indicando mediante el prefijo el tipo de variable.
        boolean isCasado = true; // Es correcto y aplica buenas practicas, dependiendo del tipo de lenguaje con el que estemos trabajando aunque es mejor que sea el mismo.
        boolean tieneSaldo = true; // Es correcto y aplica buenas practicas.
        boolean hasSaldo = true ; // Es correcto pero es mejor unificarlo al mismo lenguaje.

    }
}
