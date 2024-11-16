
package vdesisgeditec.Controlador;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import vdesisgeditec.Modelo.Conexion;
import vdesisgeditec.Modelo.Clientes;

public class registrarclientesController {

    public boolean registrar(Clientes objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = (PreparedStatement) cn.prepareStatement("INSERT INTO clientes (id_usuario, nombre_empresa, nombre_cliente, linea, direccion, numero_telefonico) VALUES (?,?,?,?,?,?)");
            consulta.setInt(1, objeto.getId_usuario());
            consulta.setString(2, objeto.getNombre_empresa());
            consulta.setString(3, objeto.getNombre_cliente());
            consulta.setString(4, objeto.getLinea());
            consulta.setString(5, objeto.getDireccion());
            consulta.setLong(6, objeto.getNumerotelefono());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al Registrar un Cliente" + e);
        }
        return respuesta;
    }
    
   
}
