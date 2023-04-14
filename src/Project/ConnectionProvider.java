/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;
/**
 *
 * @author prati
 */
public class ConnectionProvider {
    public static Connection getCon() throws Exception
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","Pratik@1234");
            return con;
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
            return null;
        }
    }
    
}
