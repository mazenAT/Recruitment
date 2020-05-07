/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recruitement;

import java.util.Date;

/**
 *
 * @author mazen174825
 */
public class Jobseeker extends User {

    private String degree;
    private String careerlvl;
    public Jobseeker( String name, int age, String phone, String address, String gender, String email, String password, String type, String degree, String careerlvl) {
        super( name, age, phone, address, gender, email, password, type);
        this.degree = degree;
        this.careerlvl = careerlvl;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getCareerlvl() {
        return careerlvl;
    }

    public void setCareerlvl(String careerlvl) {
        this.careerlvl = careerlvl;
    }
}
