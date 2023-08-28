 package SDCS;

import java.sql.*;


 
public class DConnection {
    
    Connection c;
    Statement s;
    
    
    public DConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver"); 
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/software","root","");
            s = c.createStatement();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
