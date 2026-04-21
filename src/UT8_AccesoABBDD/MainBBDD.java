package UT8_AccesoABBDD;

import java.sql.*;

public class MainBBDD {
    public static Connection conexion(String url, String user, String pass)throws SQLException{

        Connection conn = DriverManager.getConnection(url, "alumno", "alumno");
        return conn;
    }


    public static void main(String[] args) throws SQLException{
        String url = "jdbc:mysql://localhost:3306/DAM1?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC";
        String user = "alumno";
        String password = "alumno";
        /// FASE DE CONEXIÓN
        Connection conn=null;
        try {
            conn = conexion(url,user, password);
        } catch (SQLException e) {
            System.out.println("¿salta la excepcion por aqui?");
            e.printStackTrace();
        }

        //FASE DE CONSTRUCCIÓN
        String sql = "SELECT nombre, descripcion, precio FROM productos";
        PreparedStatement stmt = conn.prepareStatement(sql);

        //FASE DE EJECUCIÓN
        ResultSet rs = stmt.executeQuery();




        //conn.close();
    }
}
