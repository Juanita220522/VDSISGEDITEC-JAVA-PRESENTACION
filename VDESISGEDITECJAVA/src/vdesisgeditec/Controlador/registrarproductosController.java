package vdesisgeditec.Controlador;

import vdesisgeditec.Modelo.Producto;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import vdesisgeditec.Modelo.Conexion;
public class registrarproductosController {
    
    public boolean registrar(Producto producto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();

        try {
            PreparedStatement consulta = (PreparedStatement) cn.prepareStatement("INSERT INTO vdsisgeditec.productos (id_usuario, id_proveedor ,nombre_producto, marca, precio_unidad) VALUES (?, ?, ?, ?,?)");
            consulta.setInt(1, producto.getId_usuario());
            consulta.setInt(2, producto.getId_proveedor());
            consulta.setString(3, producto.getNombre_producto());
            consulta.setString(4, producto.getMarca());
            consulta.setDouble(5, producto.getPreciounidad());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al registrar el producto: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al registrar el producto: " + e.getMessage());
        } finally {
            try {
                cn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return respuesta;
    }
}
