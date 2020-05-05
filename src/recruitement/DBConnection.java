
package recruitement;

import java.sql.*;
public class DBConnection {
    private Connection con;
    private Statement st;
    private ResultSet rs;
    public DBConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/recruit_me","root","");
            st=con.createStatement();
            }catch(Exception ex){
            System.out.println("error: "+ex);
        }
    }
   
    
}
