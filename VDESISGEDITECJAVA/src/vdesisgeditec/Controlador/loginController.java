package vdesisgeditec.Controlador;

import java.sql.Statement;
import java.sql.Connection;
import javax.swing.JOptionPane;
import vdesisgeditec.Modelo.Usuario;
import java.sql.SQLException;
import vdesisgeditec.Modelo.Conexion;
import java.sql.ResultSet;

public class loginController {

    public int loginUser(Usuario objeto) {
        int idUsuario = -1;

        Connection cn = Conexion.conectar();
        String sql = "SELECT id_usuario, tipo_usuario FROM vdsisgeditec.usuario WHERE nombre_usuario = '" + objeto.getNombre_usuario() + "' AND password = '" + objeto.getPassword() + "'";

        try (Statement st = cn.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            if (rs.next()) {
                idUsuario = rs.getInt("id_usuario");
                objeto.setTipo_usuario(rs.getString("tipo_usuario"));
            }
        } catch (SQLException e) {
            System.out.println("Error al iniciar sesión: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al iniciar sesión");
        }

        return idUsuario;
    }
}
