public class DetalleProducto {
    public static void main(String[] args) {
        //Tenemos que indicar el detalle a almacenar de un producto de una tienda en linea. Utilizando buenas prácticas

        System.out.println("------------*Bienvenidos a mi tienda*------------");
        System.out.println("------------*Primer producto*------------");

        String nombreProducto = "Vaso";
        System.out.println("nombreProducto = " + nombreProducto);
        float precioProducto = 1.55f;
        System.out.println("precioProducto = " + precioProducto);
        int hasDisponible = 15;
        System.out.println("tieneDisponible = " + hasDisponible);
        boolean isDisponible = true;
        System.out.println("isDisponible = " + isDisponible);

        // Modificamos el valor de cada variable con nuevos datos.
        System.out.println("------------*Segundo producto*------------");
        nombreProducto = "Plato";
        System.out.println("nombreProducto = " + nombreProducto);
        precioProducto = 2.54f;
        System.out.println("precioProducto = " + precioProducto);
        hasDisponible = 0;
        System.out.println("hasDisponible = " + hasDisponible);
        isDisponible = false;
        System.out.println("isDisponible = " + isDisponible);
    }
}
