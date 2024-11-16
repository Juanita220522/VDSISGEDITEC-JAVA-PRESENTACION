package vdesisgeditec.Modelo;

public class Proveedor {

    private int id_usuario;
    private int id_proveedor;
    private String nombre_proveedor;
    private long numerotelefono;

    public Proveedor() {
        this.id_usuario = 0;
        this.id_proveedor = 0;
        this.nombre_proveedor = "";
        this.numerotelefono = 0;
    }

    public Proveedor(int id_proveedor, String nombre_proveedor) {
        this.id_proveedor = id_proveedor;
        this.nombre_proveedor = nombre_proveedor;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getNombre_proveedor() {
        return nombre_proveedor;
    }

    public void setNombre_proveedor(String nombre_proveedor) {
        this.nombre_proveedor = nombre_proveedor;
    }

    public long getNumerotelefono() {
        return numerotelefono;
    }

    public void setNumerotelefono(long numerotelefono) {
        this.numerotelefono = numerotelefono;
    }

    @Override
    public String toString() {
        return nombre_proveedor;
    }
}
