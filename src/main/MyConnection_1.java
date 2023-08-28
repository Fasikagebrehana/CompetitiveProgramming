
package main;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class MyConnection_1 {
    private static Connection conn ;
    public static Connection getConnection(){
        
        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
        conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/database1", "root","");
        }catch( Exception ex){
            System.out.println(ex.getMessage());
        }
        
    return conn;
}
     public void deleteData(String tableName, String srno) {
        try {
            String sql = "DELETE FROM " + tableName + " WHERE " + srno + "=?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, srno);
            int rowsDeleted = statement.executeUpdate();
            System.out.println(rowsDeleted + " rows deleted from " + tableName);
        } catch (SQLException e) {
            System.out.println("Error deleting data from " + tableName + ": " + e.getMessage());
        }
    }

    PreparedStatement prepareStatement(String s) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

