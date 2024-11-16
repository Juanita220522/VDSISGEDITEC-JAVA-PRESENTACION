package vdesisgeditec.Controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import vdesisgeditec.Modelo.Conexion;
import vdesisgeditec.Modelo.Pedido;

public class registrarpedidosController {
    
    public boolean registrar(Pedido pedido) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();

        try {
            String sql = "INSERT INTO pedidos (id_usuario, id_proveedor, id_producto, id_cliente, direccion, numero_items, precio_total, telefono) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement consulta = cn.prepareStatement(sql);

            consulta.setInt(1, pedido.getId_usuario());
            consulta.setInt(2, pedido.getId_proveedor());
            consulta.setInt(3, pedido.getId_producto());
            consulta.setInt(4, pedido.getId_cliente());
            consulta.setString(5, pedido.getDireccion());
            consulta.setInt(6, pedido.getNumero_items());
            consulta.setDouble(7, pedido.getPrecio_total());
            consulta.setLong(8, pedido.getTelefono());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
                
            }

            consulta.close();
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al registrar el pedido: " + e);
            JOptionPane.showMessageDialog(null, "Error al registrar el pedido: " + e.getMessage());
        }
        return respuesta;
    }
}
