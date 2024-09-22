package atm.simulator.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {

    JButton login, signup, clear;
    JTextField cardTextField;
    JPasswordField pinTextField;

    Login() {
        setTitle("AUTOMATED TELLER MACHINE");
        setLayout(null);
        getContentPane().setBackground(new Color(34, 45, 65));  // Darker background
        
        // // Logo
        // ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        // Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        // ImageIcon i3 = new ImageIcon(i2);
        // JLabel label = new JLabel(i3);
        // label.setBounds(150, 10, 100, 100);
        // add(label);

        // Welcome Text
        JLabel text = new JLabel("ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setForeground(Color.WHITE);
        text.setBounds(350, 40, 400, 40);
        add(text);

        // Card Number Label
        JLabel cardno = new JLabel("Card No.");
        cardno.setFont(new Font("Raleway", Font.BOLD, 28));
        cardno.setForeground(Color.LIGHT_GRAY);
        cardno.setBounds(120, 150, 150, 40);
        add(cardno);

        // Card Number TextField
        cardTextField = new JTextField();
        cardTextField.setBounds(300, 150, 250, 40);
        cardTextField.setFont(new Font("Arial", Font.BOLD, 14));
        cardTextField.setBackground(new Color(60, 63, 65));  
        cardTextField.setForeground(Color.WHITE);
        cardTextField.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));  
        add(cardTextField);

        // PIN Label
        JLabel pin = new JLabel("PIN");
        pin.setFont(new Font("Raleway", Font.BOLD, 28));
        pin.setForeground(Color.LIGHT_GRAY);
        pin.setBounds(120, 220, 150, 40);
        add(pin);

        // PIN TextField
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300, 220, 250, 40);
        pinTextField.setFont(new Font("Arial", Font.BOLD, 14));
        pinTextField.setBackground(new Color(60, 63, 65));
        pinTextField.setForeground(Color.WHITE);
        pinTextField.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        add(pinTextField);

        // Login Button
        login = new JButton("SIGN-IN");
        styleButton(login);
        login.setBounds(250, 320, 100, 30);
        add(login);

        // Clear Button
        clear = new JButton("CLEAR");
        styleButton(clear);
        clear.setBounds(400, 320, 100, 30);
        add(clear);

        // Signup Button
        signup = new JButton("SIGN-UP");
        styleButton(signup);
        signup.setBounds(250, 380, 250, 30);
        add(signup);

        // Frame settings
        setLocation(320, 150);
        setSize(800, 480);
        setVisible(true);
    }

    private void styleButton(JButton button) {
        button.setBackground(new Color(255, 102, 0));  
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setFont(new Font("Arial", Font.BOLD, 14));
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));  
        button.setOpaque(true);
        button.setContentAreaFilled(true);
        button.setBorderPainted(false);
        
        // Add hover effect
        button.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                button.setBackground(new Color(255, 153, 51));  
            }

            public void mouseExited(MouseEvent evt) {
                button.setBackground(new Color(255, 102, 0));  
            }
        });
        
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == clear) {
            cardTextField.setText("");
            pinTextField.setText("");
        } else if (ae.getSource() == login) {
            Conn conn = new Conn();

            String cardnumber = cardTextField.getText();
            String pinnumber = pinTextField.getText();

            String query = "select * from login where CardNumber = '" + cardnumber + "' and PIN = '" + pinnumber + "'";
            try {
                ResultSet rs = conn.s.executeQuery(query);
                if (rs.next()) {
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
                }

            } catch (Exception e) {
                System.out.println(e);
            }

        } else if (ae.getSource() == signup) {
            setVisible(false);
            new SignupOne().setVisible(true);
        }
    }

    public static void main(String args[]) {
        new Login();
    }
}
