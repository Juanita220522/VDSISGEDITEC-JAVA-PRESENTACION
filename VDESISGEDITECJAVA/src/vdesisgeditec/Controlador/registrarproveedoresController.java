
package vdesisgeditec.Controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import vdesisgeditec.Modelo.Conexion;
import vdesisgeditec.Modelo.Proveedor;

public class registrarproveedoresController {
     public boolean registrar(Proveedor objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = (PreparedStatement) cn.prepareStatement("INSERT INTO proveedores (id_usuario, nombre_proveedor, telefono) VALUES (?,?,?)");
            consulta.setInt(1, objeto.getId_usuario());
            consulta.setString(2, objeto.getNombre_proveedor());
            consulta.setLong(3, objeto.getNumerotelefono());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al Registrar un Proveedor" + e);
        }
        return respuesta;
    }
}
