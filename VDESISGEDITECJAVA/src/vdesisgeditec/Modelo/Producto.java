package vdesisgeditec.Modelo;

public class Producto {
    private int id_usuario;
    private int id_producto;
    private int id_proveedor;
    private String nombre_producto;
    private String marca;
    private double preciounidad;

    public Producto() {
        this.id_usuario = 0;
        this.id_producto = 0;
        this.id_proveedor = 0;
        this.nombre_producto = "";
        this.marca = "";
        this.preciounidad = 0.0;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreciounidad() {
        return preciounidad;
    }

    public void setPreciounidad(double preciounidad) {
        this.preciounidad = preciounidad;
    }
    
}
