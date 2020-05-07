package recruitement;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp extends javax.swing.JFrame {
    private JButton jobSeekerButton;
    private JButton employerButton;
    private JPanel signUp;
    private JButton Login;


    public SignUp() {

        add (signUp);
        setTitle("SignUp");
        setSize(300,350);
        setLocationRelativeTo(null);

        jobSeekerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JsignUp j = new JsignUp();
                j.setVisible(true);
                dispose();

            }
        });
        employerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                EsignUp ee = new EsignUp();
                ee.setVisible(true);
                dispose();

            }
        });
        Login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Login l = new Login();
                l.setVisible(true);
                dispose();

            }
        });
    }
}
