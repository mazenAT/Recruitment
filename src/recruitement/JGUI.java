package recruitement;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JGUI extends javax.swing.JFrame {
    private JButton updateProfileButton;
    private JButton browseVacanciesButton;
    private JButton trackApplicationsButton;
    private JButton logOutButton;
    private JPanel js;

    public JGUI() {

        add (js);
        setTitle("Wuzzafny");
        setSize(400,500);
        setLocationRelativeTo(null);

        updateProfileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        browseVacanciesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        trackApplicationsButton.addActionListener(new ActionListener() {
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
