public class TipoVar {
    public static void main(String[] args) {
        System.out.println("*** Uso de var en Java ***");
        //Sin el uso de var ( se añade apartir de Java 10 )
        String nombre1 = "Angel";
        //Utilizando var (añade el tipo de dato de forma automatica, es local = solo existe durante el metodo main, si hacemos otro metodo, no tendría uso )
        var nombre2 = "Juan";
        System.out.println("nombre2 = " + nombre2);
        // Pruebas de otras variables usando
        var edad = 24; // se añade tipo int
        System.out.println("edad = " + edad);
        var existe = true; // se añade tipo boolean
        existe= false; // Funciona cambiando el valor, pero no se puede cambiar el tipo con el que se ha inicializado al principio
        System.out.println("existe = " + existe);
        var sueldo = 5000.5F; // se añade tipo float
        System.out.println("sueldo = " + sueldo);

        // var precio; Lanza error, porque debemos asignar un valor desde el inicio.
        // precio = 10;

        // Se debe inferir el tipo de dato.
        // var apellido = null; da error, porque es un valor no inferible


    }
}
