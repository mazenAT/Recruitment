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

    public EGUI() {

        add (empGUI);
        setTitle("Wuzzafny");
        setSize(400,500);
        setLocationRelativeTo(null);

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

            }
        });
    }
}
