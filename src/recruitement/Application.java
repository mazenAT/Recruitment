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
public class Application {
    private String applicantName;
    private String applicantEmail;
    private String qualifications;
    private String applicantbrief;
    private boolean Appstatus;
    DBConnection D = new DBConnection();
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


    public void fillApplication(String applicantName, String applicantEmail, String qualifications, String applicantbrief, int userid) {
        D.InsertApplication(applicantName, applicantEmail, qualifications, applicantbrief, userid);
    }

    public void searchApplicants() {
        ArrayList<Application> applist= new ArrayList<>();
        applist=D.getApplications();
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


