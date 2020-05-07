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
    public int tempID1;


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
                for (int i = 0; i < Users.size(); i++)
                {
                    if(User.getEmail().equals(Users.get(i).getEmail()) && User.getPassword().equals(Users.get(i).getPassword()) && User.getType().equals(Users.get(i).getType()))
                    {
                        tempID1= DB.currentUserID(User.getEmail());
                        JOptionPane.showMessageDialog(null,"successful log in "+tempID1);
                    }

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
