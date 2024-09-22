
package atm.simulator.system;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    String databaseName = "yourDatabaseName";
    String user = "yourUserName";
    String password = "yourPassword";
    
    public Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            c = DriverManager.getConnection("jdbc:mysql:///"+databaseName, user,password);
            s = c.createStatement();
            
        } catch(Exception e){
            System.out.println(e);
        }
    }
    
}
