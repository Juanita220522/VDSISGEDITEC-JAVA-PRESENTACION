package vdesisgeditec.Modelo;

public class Usuario {
    Conexion cn;
    
    private int id_usuario;
    private String nombre_usuario;
    private String password;
    private String tipo_usuario;
    
    
    public Usuario (){
        cn = new Conexion();
        this.id_usuario = 0;
        this.nombre_usuario ="";
        this.password="";
        this.tipo_usuario="";
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }
    
   

}
