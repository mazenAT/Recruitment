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
    public Jobseeker(String name, Date DOB, String phone, String address, String gender) {
        super(name, DOB, phone, address, gender);
    }
}
