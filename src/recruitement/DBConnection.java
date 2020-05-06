
package recruitement;

import java.sql.*;
import java.util.ArrayList;

public class DBConnection {
    private Connection con;
    private Statement st;
    private ResultSet rs;
    public DBConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3308/recurit_me","root","");
            st=con.createStatement();
            }catch(Exception ex){
            System.out.println("error: "+ex);
        }
    }
   public void InsertApplication(String applicantName,String applicantEmail,String qualifications,String applicantbrief,int UserId){
    try {
        String sql=("INSERT INTO application (app_id, app_name, app_email, app_qualification, app_brief, app_js_id) VALUES (NULL, '"+applicantName+"', '"+applicantEmail+"', '"+qualifications+"', '"+applicantbrief+"', '"+UserId+"')");
        st.executeQuery(sql);
    }catch (Exception e){
        System.out.println(e);
    }
   }
   public ArrayList<Application> getApplications(){
       ArrayList<Application> result = new ArrayList();
       try {
           Statement stmt = con.createStatement();
           ResultSet rs = stmt.executeQuery("select * from application");
           while (rs.next()) {
               result.add(new Application(rs.getString("app_name"), rs.getString("app_email"), rs.getString("app_qualification"), rs.getString("app_brief")));
           }
       } catch (Exception e) {
           System.err.println("DATABASE QUERY ERROR: " + e.toString());
       }
       return result;
   }
   }
    

