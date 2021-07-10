
package book.application;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Dbconnect {
    Connection conn;
    public static Connection Dbconn(){
    
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","");
        JOptionPane.showMessageDialog(null, "database connect");
        
        return conn;
    
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
         return null;}
  
    }
    
}
