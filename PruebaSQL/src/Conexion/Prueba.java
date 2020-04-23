package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Prueba {
    public static void main(String[] args) throws SQLException {
        Prueba prueba = new Prueba();
        prueba.createConnection();
    }
    void createConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/base?useUnicode=true&useTimeZone=true&serverTimezone=UTC"
                    , "user", "password");
            System.out.println("Database connection Success");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
