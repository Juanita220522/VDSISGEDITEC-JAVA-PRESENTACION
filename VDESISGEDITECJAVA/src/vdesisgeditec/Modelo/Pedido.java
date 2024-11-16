package vdesisgeditec.Modelo;

public class Pedido {

    private int id_usuario;
    private int id_pedido;
    private int id_proveedor;
    private int id_producto;
    private int id_cliente;
    private String direccion;
    private int numero_items;
    private double precio_total;
    private long telefono;

    public Pedido() {
        this.id_usuario = 0;
        this.id_pedido = 0;
        this.id_proveedor = 0;
        this.id_producto = 0;
        this.id_cliente = 0;
        this.direccion = "";
        this.numero_items = 0;
        this.precio_total = 0.0;
        this.telefono = 0;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumero_items() {
        return numero_items;
    }

    public void setNumero_items(int numero_items) {
        this.numero_items = numero_items;
    }

    public double getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(double precio_total) {
        this.precio_total = precio_total;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public static class ComboItem {

        private int id;
        private String nombre;

        public ComboItem(int id, String nombre) {
            this.id = id;
            this.nombre = nombre;
        }

        public int getId() {
            return id;
        }

        public String getNombre() {
            return nombre;
        }

        @Override
        public String toString() {
            return nombre;
        }
    }
}
