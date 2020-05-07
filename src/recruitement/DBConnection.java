
package recruitement;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;

public class DBConnection {
    private Connection con;
    private Statement st;
    private ResultSet rs;

    public DBConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3308/recruit_me", "root", "");
            st = con.createStatement();
        } catch (Exception ex) {
            System.out.println("error: " + ex);
        }
    }

    public void InsertApplication(String applicantName, String applicantEmail, String qualifications, String applicantbrief, int UserId, int vacancy_id) {
        try {
            String sql = ("INSERT INTO application (app_id, app_name, app_email, app_qualification, app_brief, app_js_id) " +
                    "VALUES (NULL, '" + applicantName + "', '" + applicantEmail + "', '" + qualifications + "', '" + applicantbrief + "', '" + UserId + "' )");

            st.executeQuery(sql);
            String sql2 = ("SELECT app_id FROM application WHERE app_name =" + applicantName );
            rs = st.executeQuery(sql2);
            int curr_id = rs.getInt("app_id");
            String sql3 = ("INSERT INTO  vacancyapp (appID, vacancyID) " + " VALUES('"+curr_id+"', '"+vacancy_id+"' )" );
            st.executeQuery(sql3);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public ResultSet getApplications(int vacancy_ID) {
        try {
            rs = st.executeQuery("select * from application WHERE app_id IN(select appID from vacancyapp where vacancyID = )" + vacancy_ID  );

        } catch (Exception e) {
            System.err.println("DATABASE QUERY ERROR: " + e.toString());
        }
        return rs;
    }

    public void InsertVacancy(String title, String type, String about, String requirements, String educationLevel, String languages, float salary, int openPositions, int emp_id) {
        try {
            String sql = ("INSERT INTO vacancy (v_id, v_title, v_type, v_about, v_requirements, v_edu_lvl, v_lang, v_salary, v_open_position, employer_id ) " +
                    "VALUES (NULL, '" + title + "', '" + type + "', '" + about + "', '" + requirements + "', '" + educationLevel + "', '" + languages + "', '" + salary + "', '" + openPositions + "', '" + emp_id + "')");
            st.executeQuery(sql);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public ResultSet RetrieveAllVacancies() {
        try {
            String sql = ("SELECT * FROM `vacancy` ");
            rs = st.executeQuery(sql);
        } catch (Exception e) {
            System.out.println(e);


        }
        return rs;
    }

    public int RetrieveVacancyID(String title) {
        int id = 0;
        try {
            String sql = ("SELECT v_id FROM `vacancy` WHERE v_title = title");
            rs = st.executeQuery(sql);
            id = rs.getInt("v_id");

        } catch (Exception e) {
            System.out.println(e);


        }
        return id;

    }


    public ResultSet RetrieveEmployerVacancy(int Employer_ID) {
        try {
            String sql = ("SELECT * FROM `vacancy` WHERE employer_id = Employer_ID");
            rs = st.executeQuery(sql);
        } catch (Exception e) {
            System.out.println(e);


        }
        return rs;
    }

    public ResultSet getAllUsers() {
        try {
            rs = st.executeQuery("select * from user");
        } catch (Exception e) {
            System.err.println("DATABASE QUERY ERROR: " + e.toString());
        }
        return rs;
    }


}