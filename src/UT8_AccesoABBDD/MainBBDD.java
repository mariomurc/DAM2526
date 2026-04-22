package UT8_AccesoABBDD;

import java.sql.*;
import java.util.ArrayList;

public class MainBBDD {
    public static Connection conexion(String url, String user, String pass)throws SQLException{

        Connection conn = DriverManager.getConnection(url, user, pass);
        return conn;
    }


    public static void main(String[] args) throws SQLException{
        String url = "jdbc:mysql://localhost:3306/DAM1?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC";
        String user = "alumno";
        String password = "alumno";
        ArrayList<Productos> listaProductos = new ArrayList<>();
        /// FASE DE CONEXIÓN

        //String sql = "SELECT nombre as n, descripcion, precio FROM productos";
        String sql = "SELECT nombre,  descripcion, precio " +
                "FROM productos " +
                "WHERE precio > ? AND precio < ? "+
                "ORDER BY ? ASC";
        try (Connection conn = conexion(url,user, password);
             PreparedStatement stmt = conn.prepareStatement(sql);)
        {
            stmt.setFloat(1,25);
            stmt.setFloat(2,100);
            stmt.setString(3,"nombre");

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String descripcion = rs.getString(2);
                Float precio = rs.getFloat("precio");
                listaProductos.add(new Productos(nombre, descripcion, precio));
                System.out.println(nombre + " - " + descripcion + " - " + precio);
            }
        }catch (SQLException e) {
            System.out.println("¿salta la excepcion por aqui?");
            e.printStackTrace();
        }


        System.out.println("FIN DEL PROGRAMA");


    }
}
