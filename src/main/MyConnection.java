
package main;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class MyConnection {
    public static Connection getConnection(){
        Connection conn = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        conn= DriverManager.getConnection("jdbc://localhost/ap", "root","");
        }catch( Exception ex){
            System.out.println(ex.getMessage());
        }
    return conn;
}
}
