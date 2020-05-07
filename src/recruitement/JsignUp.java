package recruitement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JsignUp extends javax.swing.JFrame {
    private JPanel jsu;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField6;
    private JButton button1;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JSpinner spinner1;
    private JComboBox comboBox1;
    private String type = "jobseeker";
    private DBConnection D;

    public JsignUp() {
        add (jsu);
        setTitle("Job Seeker SignUp");
        setSize(250,600);
        setLocationRelativeTo(null);
        D = new DBConnection();



        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textField1.getText();
                String phone = textField2.getText();
                String address = textField3.getText();
                int age = (Integer) spinner1.getValue();
                String degree = textField6.getText();
                String careerlvl = textField7.getText();
                String email = textField8.getText();
                String password = textField9.getText();
                String gender = comboBox1.getSelectedItem().toString();
                Jobseeker js = new Jobseeker(name, age, phone, address, gender, email, password, type, degree, careerlvl);
                D.insertJobseeker(js);




            }
        });
    }
}
