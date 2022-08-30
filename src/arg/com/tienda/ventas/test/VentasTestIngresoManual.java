package arg.com.tienda.ventas.test;

import arg.com.tienda.ventas.*;

public class VentasTestIngresoManual {

    public static void main(String[] args) {

        Producto producto1 = new Producto("Remera a rayas", 1950);
        Producto producto2 = new Producto("Remera roja", 1700);
        Producto producto3 = new Producto("Remera negra", 2200);
        Producto producto4 = new Producto("Remera estampado", 1900);

        Producto producto5 = new Producto("Jean basico", 1250);
        Producto producto6 = new Producto("Jean a rayas", 1700);
        Producto producto7 = new Producto("Jean flores", 2200);
        Producto producto8 = new Producto("Jean negro", 3200);

        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        orden1.agregarProducto(producto4);
        orden1.mostrarOrden();
        System.out.println("Otra orden:\n-------");
        Orden orden2 = new Orden();
        orden2.agregarProducto(producto5);
        orden2.agregarProducto(producto6);
        orden2.agregarProducto(producto7);
        orden2.agregarProducto(producto8);
        orden2.mostrarOrden();

    }

}
