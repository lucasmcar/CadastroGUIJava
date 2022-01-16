package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
    
    protected static Connection conn;
    
    public static Connection getConnection(){
        
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/PJTVEICULO?serverTimezone=UTC","root","Lucas1990");
            
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            e.getMessage();
        }
        return conn;
    }
}
