/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recruitement;


import javax.swing.*;
import java.util.ArrayList;

/**
 *
 * @author mazen174825
 */
public class    Application {
    private String applicantName;
    private String applicantEmail;
    private String qualifications;
    private String applicantbrief;
    private boolean Appstatus;
    private DBConnection D ;
    private int vacancy_id;
    private JPanel panel1;
    private JButton submit;
    private JTextField ApplicantName;
    private JTextField ApplicantEmail;
    private JTextField ApplicantQ;
    private JTextField ApplicantB;


    public Application(String applicantName, String applicantEmail, String qualifications, String applicantbrief) {
        this.applicantName = applicantName;
        this.applicantEmail = applicantEmail;
        this.qualifications = qualifications;
        this.applicantbrief = applicantbrief;
        this.D = new DBConnection();


    }

    public int getVacancy_id() {
        return vacancy_id;
    }

    public void setVacancy_id(int vacancy_id) {
        this.vacancy_id = vacancy_id;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getApplicantEmail() {
        return applicantEmail;
    }

    public void setApplicantEmail(String applicantEmail) {
        this.applicantEmail = applicantEmail;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    public String getApplicantbrief() {
        return applicantbrief;
    }

    public void setApplicantbrief(String applicantbrief) {
        this.applicantbrief = applicantbrief;
    }


    public void fillApplication(String applicantName, String applicantEmail, String qualifications, String applicantbrief, int userid, int vacancy_id ) {
        D.InsertApplication(applicantName, applicantEmail, qualifications, applicantbrief, userid, vacancy_id);
    }

    public void searchApplicants() {
        ArrayList<Application> applist= new ArrayList<>();
        applist= (ArrayList<Application>) D.getApplications(this.vacancy_id);
    }

    public boolean approve() {
        boolean Astatus = false;
        if (Astatus == true) {
            return Astatus;
        } else {
            Astatus = false;
            return Astatus;
        }
    }

    public boolean reject() {
        boolean Rstatus = false;
        if (Rstatus == true) {
            return Rstatus;
        } else {
            Rstatus = false;
            return Rstatus;
        }
    }

    public boolean shortlist() {
        boolean Sstatus = false;
        if (Sstatus == true) {
            return Sstatus;
        } else {
            Sstatus = false;
            return Sstatus;
        }
    }

    public boolean trackApplication() {
        boolean AppStatus = false;
        if (approve() == true) {
            AppStatus = true;
            return AppStatus;
        }else if (reject()==true){
            AppStatus = false;
            return AppStatus;
        }
        return false;
    }
}



