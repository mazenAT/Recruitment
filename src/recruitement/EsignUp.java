package recruitement;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EsignUp extends javax.swing.JFrame {
    private JPanel esu;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JSpinner spinner1;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JTextField textField10;
    private JTextField textField12;
    private JButton signUpButton;
    private JComboBox comboBox1;
    private JPasswordField passwordField1;
    private DBConnection D;
    private String type = "employer";

    public EsignUp() {
        add (esu);
        setTitle("Employer SignUp");
        setSize(400,500);
        setLocationRelativeTo(null);


        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String name = textField1.getText();
                String phone = textField2.getText();
                String address = textField3.getText();
                int age = (Integer) spinner1.getValue();
                String jobRole = textField4.getText();
                String companyName = textField5.getText();
                String companyPhone = textField6.getText();
                String bussinessMail = textField7.getText();
                String comapnyIndustry = textField8.getText();
                String companyWebsite = textField9.getText();
                String companyAddress = textField10.getText();
                String email = textField12.getText();
                String password = String.valueOf(passwordField1.getPassword());
                String gender = comboBox1.getSelectedItem().toString();
                Employer emp = new Employer(name, age, phone, address, gender, email, password, type,
                        jobRole, companyName, companyPhone, comapnyIndustry, bussinessMail, companyWebsite, companyAddress);
                //D.insertEmployer(emp);
                System.out.print(emp.getName() + emp.getAge() + emp.getPhone() +emp.getAddress() +
                        emp.getGender() + emp.getEmail() + emp.getPassword() + emp.getType()
                + emp.getJobRole() + emp.getCompanyName() + emp.getCompanyPhone() + emp.getComapnyIndustry()
                + emp.getBussinessMail() + emp.getCompanyWebsite() + emp.getCompanyAddress());

            }
        });
    }
}
