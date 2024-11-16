
package vdesisgeditec.Controlador;

import vdesisgeditec.Modelo.Conexion;
import java.sql.Connection;
import vdesisgeditec.Modelo.Usuario;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class registrarusuarioController {
    public boolean registrar(Usuario usuario) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        String sql = "INSERT INTO usuario (nombre_usuario, password, tipo_usuario) VALUES (?, ?, ?)";
        
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, usuario.getNombre_usuario());
            pst.setString(2, usuario.getPassword());
            pst.setString(3, usuario.getTipo_usuario());
            
            if (pst.executeUpdate() > 0) {
                respuesta = true; 
            }
            pst.close();
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al registrar usuario: " + e);
        }
        return respuesta;
    }
}

