package vdesisgeditec.Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public static Connection conectar() {

        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/vdsisgeditec", "root", "12345678");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en la conexion de base de datos");
        }
        return null;
    }
}
