package arg.com.tienda.ventas;

public class Producto {

    private final int idProducto;
    private String nombreProducto;
    private double precio;
    private static int contadorProductos;

    private Producto() {
        this.idProducto = ++Producto.contadorProductos;
    }

    public Producto(String nombreProducto, double precio) {
        this();
        this.nombreProducto = nombreProducto;
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombreProducto;
    }

    public void setNombre(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre del producto=" + nombreProducto + ", precio=" + precio + '}';
    }

}
