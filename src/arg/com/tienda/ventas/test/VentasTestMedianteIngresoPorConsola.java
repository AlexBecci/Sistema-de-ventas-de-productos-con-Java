package arg.com.tienda.ventas.test;

import arg.com.tienda.ventas.*;
import java.util.Scanner;

public class VentasTestMedianteIngresoPorConsola {

    public static void main(String[] args) {

        int num = inicio();
        switch (num) {
            case 1:
                System.out.println("Ingrese su prenda");
                Scanner string = new Scanner(System.in);
                String prenda = string.nextLine();
                System.out.println("Ingrese el valor correspondiente");
                Scanner valorDouble = new Scanner(System.in);
                double precio;
                precio = Integer.parseInt(valorDouble.nextLine());
                Producto producto1 = new Producto(prenda, precio);
                Orden orden1 = new Orden();
                orden1.agregarProducto(producto1);
                orden1.mostrarOrden();
                break;
            default:
                break;

        }

    }

    public static int inicio() {
        System.out.println("Bienvenido..\nPara subir su prenda en la web:\n ingrese--[1]" + "\nPara salir:\n ingrese--[2]");
        Scanner numeroIngresado = new Scanner(System.in);
        int numero = Integer.parseInt(numeroIngresado.next());
        switch (numero) {
            case 1:
                return numero;
            case 2:
                System.out.println("Hasta luego\nNos vemos...");
                return 0;
            default:
                System.out.println("Valor mal ingresado vuelva.\nIntentelo nuevamente");
                return 0;
        }
    }
}
