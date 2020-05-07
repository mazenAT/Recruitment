
package recruitement;

import javax.swing.JOptionPane;

public class Admin extends User {
    private int id;
    private int adminId;

    public Admin(String name, int age, String phone, String address, String gender, String email, String password, String type, int adminId) {
        super(name, age, phone, address, gender, email, password, type);
        this.adminId = adminId;
    }

    
}
