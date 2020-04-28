
package recruitement;

import java.sql.*;
public class DBConnection {
    private Connection con;
    private Statement st;
    private ResultSet rs;
    public DBConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3308/recruitment","MazenAtef","Mazenzx-12");
            st=con.createStatement();
            }catch(Exception ex){
            System.out.println("error: "+ex);
        }
    }
    public void getData(){
        
            try{
                String query="select * from users";
                rs=st.executeQuery(query);
                System.out.println("REcords from Database");
                
                while(rs.next()){
                    String name=rs.getString("username");
                    String address=rs.getString("address");
                    System.out.println("name is: "+name+" address is: "+address);
                }
            }catch(Exception ex){
            System.out.println("error: "+ex);
        }
    }
}
