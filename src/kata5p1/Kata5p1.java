/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5p1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
 
/**
 *
 * @author amct2
 */
public class Kata5p1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO code application logic here
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\amct2\\Desktop\\asdad\\IS2\\Kata5\\KATAS.DB");
        String query = "SELECT * FROM PEOPLE";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(query);
        
        while(rs.next()){
            System.out.print("ID: " + rs.getInt(1) + " ");
            System.out.println("Nombre: " + rs.getString(2) + " " + rs.getString(3));
        }
        
  
              
    }
    
    
    
}
