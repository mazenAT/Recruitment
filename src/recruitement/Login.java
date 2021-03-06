package recruitement;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends javax.swing.JFrame {

    private JButton login;
    private JPanel panel1;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton SignUp;
    private JComboBox comboBox1;
    private int tempID1;


    public Login() {
        DBConnection DB = new DBConnection();
        add (panel1);
        setTitle("Login");
        setSize(300,350);
        setLocationRelativeTo(null);


        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CurrentUser User = CurrentUser.getInstance();
                String email = textField1.getText();
                String password = String.valueOf(passwordField1.getPassword());
                String type = comboBox1.getSelectedItem().toString();
                User.setEmail(email);
                User.setPassword(password);
                User.setType(type);
                tempID1 = 0;



                ArrayList<User> Users = DB.checkUsers();
                boolean found = false;
                for (int i = 0; i < Users.size(); i++)
                {
                    if(User.getEmail().equals(Users.get(i).getEmail()) && User.getPassword().equals(Users.get(i).getPassword()) )
                    {
                        tempID1= DB.currentUserID(User.getEmail());

                        if(User.getType().equals("jobseeker")){
                            JGUI jobseekerWindow = new JGUI(tempID1);
                            jobseekerWindow.setVisible(true);
                            dispose();
                        }
                        else if(User.getType().equals("employer")){
                            EGUI employerWindow = new EGUI(tempID1);
                            employerWindow.setVisible(true);
                            dispose();
                        }

                        found = true;
                    }

                }
                if(found == false) {
                    JOptionPane.showMessageDialog(null, "Wrong User Name OR PASSWORD");

                }

            }
        });
        SignUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SignUp s = new SignUp();
                s.setVisible(true);
                dispose();
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
