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
        String columnaOrden = "nombre";
        //String sql = "SELECT nombre as n, descripcion, precio FROM productos";
        String sql1 = "INSERT INTO productos (nombre, descripcion, precio) VALUES ('Camiseta de lANA', 'Camiseta de manga larga, 5% algodón', 59.99)";
        System.out.println(sql1);
        String sql = "SELECT nombre,  descripcion, precio " +
                "FROM productos " +
                "WHERE precio > ? AND precio < ? "+
                "ORDER BY " + columnaOrden ;
        System.out.println(sql);
        try (Connection conn = conexion(url,user, password);
             PreparedStatement stmt = conn.prepareStatement(sql);)
        {
            stmt.setFloat(1,25);
            stmt.setFloat(2,100);
           // stmt.setString(3,"nombre");

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

        try (Connection conn = conexion(url,user, password);
            PreparedStatement stmt = conn.prepareStatement(sql1, Statement.RETURN_GENERATED_KEYS);){

            int reg = stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            System.out.println("FILAS AFECTADAS : " + reg);
            if (rs.next()) System.out.println("ULTIMO ID INSERTADO : " + rs.getInt(1));




        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("FIN DEL PROGRAMA");


    }
}
