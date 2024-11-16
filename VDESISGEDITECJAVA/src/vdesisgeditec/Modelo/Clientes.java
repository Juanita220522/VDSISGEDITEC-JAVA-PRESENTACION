package vdesisgeditec.Modelo;

public class Clientes {

    private int id_usuario;
    private int id_cliente;
    private String nombre_empresa;
    private String nombre_cliente;
    private String linea;
    private String direccion;
    private long numerotelefono;

    public Clientes() {
        this.id_usuario = 0;
        this.id_cliente = 0;
        this.nombre_empresa = "";
        this.nombre_cliente = "";
        this.linea = "";
        this.direccion = "";
        this.numerotelefono = 0;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getNumerotelefono() {
        return numerotelefono;
    }

    public void setNumerotelefono(long numerotelefono) {
        this.numerotelefono = numerotelefono;
    }

}
