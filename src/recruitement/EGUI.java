package recruitement;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EGUI extends javax.swing.JFrame {
    private JButton addVacancyButton;
    private JButton viewMyVacanciesButton;
    private JButton updtaeProfileButton;
    private JButton logOutButton;
    private JPanel empGUI;
    private JLabel empName;
    private int currID = 0;
    private DBConnection D;
    private String currName;

    public EGUI(int currID) {
        D = new DBConnection();
        add (empGUI);
        setTitle("Wuzzafny");
        setSize(400,500);
        setLocationRelativeTo(null);
        this.currID = currID;
        currName = D.RetrieveCurrentUserName(currID);
        empName.setText(currName);

        addVacancyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });
        viewMyVacanciesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        updtaeProfileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        logOutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Login l = new Login();
                l.setVisible(true);
                dispose();
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
