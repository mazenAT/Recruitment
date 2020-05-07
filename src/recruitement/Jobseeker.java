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
    public Jobseeker(int id, String name, int age, String phone, String address, String gender, String email, String password, String type) {
        super(id, name, age, phone, address, gender, email, password, type);
    }
}
