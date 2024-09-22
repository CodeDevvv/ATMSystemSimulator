package atm.simulator.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener {
    
    JTextField nameTextField, fnameTextField, cityTextField, stateTextField, pinTextField , emailTextField, addressTextField;
    JDateChooser dateChooser;
    JRadioButton male, female, married , unmarried, other;
    JButton next;
    long random;
    
    SignupOne(){
        
        setLayout(null);
        getContentPane().setBackground(new Color(245, 245, 245));
        
        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L) + 1000L);
        
        JLabel formno = new JLabel("Application Form NO." + random);
        formno.setBounds(180, 20 ,600, 40);
        formno.setFont(new Font("Raleway", Font.BOLD, 32));
        formno.setForeground(new Color(60, 60, 60));
        add(formno);
        
        JLabel personalDetails = new JLabel("Page 1 : Personal Details");
        personalDetails.setBounds(290, 80 ,400, 30);
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 24));
        personalDetails.setForeground(new Color(60, 60, 60));
        add(personalDetails);
        
        JLabel name = new JLabel("Name:");
        name.setBounds(100, 140, 100, 30 );
        name.setFont(new Font("Raleway", Font.PLAIN, 20));
        name.setForeground(new Color(80, 80, 80));
        add(name);
        
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Arial" , Font.PLAIN, 18));
        nameTextField.setBounds(300,140,400,30);
        nameTextField.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200), 2));
        add(nameTextField);
        
        JLabel fname = new JLabel("Father's Name:");
        fname.setBounds(100, 190, 200, 30 );
        fname.setFont(new Font("Raleway", Font.PLAIN, 20));
        fname.setForeground(new Color(80, 80, 80));
        add(fname);
        
        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Arial" , Font.PLAIN, 18));
        fnameTextField.setBounds(300,190,400,30);
        fnameTextField.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200), 2));
        add(fnameTextField);
        
        JLabel dob = new JLabel("Date Of Birth:");
        dob.setBounds(100, 240, 200, 30 );
        dob.setFont(new Font("Raleway", Font.PLAIN, 20));
        dob.setForeground(new Color(80, 80, 80));
        add(dob);
   
        dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 240,400,30);
        dateChooser.setForeground(Color.BLACK);
        dateChooser.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200), 2));
        add(dateChooser);
        
        JLabel gender = new JLabel("Gender:");
        gender.setBounds(100, 290, 200, 30 );
        gender.setFont(new Font("Raleway", Font.PLAIN, 20));
        gender.setForeground(new Color(80, 80, 80));
        add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(300,290,120,30 );
        male.setBackground(new Color(245, 245, 245));
        male.setFont(new Font("Arial", Font.PLAIN, 18));
        male.setForeground(new Color(60, 60, 60));
        add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(450,290,120,30 );
        female.setBackground(new Color(245, 245, 245));
        female.setFont(new Font("Arial", Font.PLAIN, 18));
        female.setForeground(new Color(60, 60, 60));
        add(female);
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
        JLabel email = new JLabel("Email Address:");
        email.setBounds(100, 340, 200, 30 );
        email.setFont(new Font("Raleway", Font.PLAIN, 20));
        email.setForeground(new Color(80, 80, 80));
        add(email);
        
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Arial" , Font.PLAIN, 18));
        emailTextField.setBounds(300,340,400,30);
        emailTextField.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200), 2));
        add(emailTextField);
        
        JLabel marital = new JLabel("Marital Status:");
        marital.setBounds(100, 390, 200, 30 );
        marital.setFont(new Font("Raleway", Font.PLAIN, 20));
        marital.setForeground(new Color(80, 80, 80));
        add(marital);
         
        married = new JRadioButton("Married");
        married.setBounds(300,390,100,30 );
        married.setBackground(new Color(245, 245, 245));
        married.setFont(new Font("Arial", Font.PLAIN, 18));
        married.setForeground(new Color(60, 60, 60));
        add(married);
        
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450,390,100,30 );
        unmarried.setBackground(new Color(245, 245, 245));
        unmarried.setFont(new Font("Arial", Font.PLAIN, 18));
        unmarried.setForeground(new Color(60, 60, 60));
        add(unmarried);
        
        other = new JRadioButton("Other");
        other.setBounds(630,390,100,30 );
        other.setBackground(new Color(245, 245, 245));
        other.setFont(new Font("Arial", Font.PLAIN, 18));
        other.setForeground(new Color(60, 60, 60));
        add(other);
        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(other);
            
        JLabel address = new JLabel("Address:");
        address.setBounds(100, 440, 200, 30 );
        address.setFont(new Font("Raleway", Font.PLAIN, 20));
        address.setForeground(new Color(80, 80, 80));
        add(address);
    
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Arial" , Font.PLAIN, 18));
        addressTextField.setBounds(300,440,400,30);
        addressTextField.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200), 2));
        add(addressTextField);
        
        JLabel city = new JLabel("City:");
        city.setBounds(100, 490, 200, 30 );
        city.setFont(new Font("Raleway", Font.PLAIN, 20));
        city.setForeground(new Color(80, 80, 80));
        add(city);      
        
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Arial" , Font.PLAIN, 18));
        cityTextField.setBounds(300,490,400,30);
        cityTextField.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200), 2));
        add(cityTextField);
        
        JLabel state = new JLabel("State:");
        state.setBounds(100, 540, 200, 30 );
        state.setFont(new Font("Raleway", Font.PLAIN, 20));
        state.setForeground(new Color(80, 80, 80));
        add(state); 
       
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Arial" , Font.PLAIN, 18));
        stateTextField.setBounds(300,540,400,30);
        stateTextField.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200), 2));
        add(stateTextField);
        
        JLabel pincode = new JLabel("PINCODE:");
        pincode.setBounds(100, 590, 200, 30 );
        pincode.setFont(new Font("Raleway", Font.PLAIN, 20));
        pincode.setForeground(new Color(80, 80, 80));
        add(pincode); 
        
        pinTextField = new JTextField();
        pinTextField.setFont(new Font("Arial" , Font.PLAIN, 18));
        pinTextField.setBounds(300,590,400,30);
        pinTextField.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200), 2));
        add(pinTextField);
        
        next = new JButton("NEXT");
        next.setBackground(new Color(255, 140, 0));
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 16));
        next.setBounds(620,640,100,30);
        next.addActionListener(this);
        add(next);
        
        setTitle("Sign-up Form");
        setSize(850,800);
        setLocation(350, 10);
        setVisible(true);   
    }
    
    public void actionPerformed(ActionEvent ae){
        String formno = "" + random;
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (male.isSelected()){
            gender = "Male";
        } else if(female.isSelected()){
            gender = "Female";
        }
        String email = emailTextField.getText();
        String marital = null;
        if(married.isSelected()){
            marital = "Married";
        } else if(unmarried.isSelected()){
            marital = "Unmarried";
        } else if(other.isSelected()){
            marital = "Other";
        }
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pin = pinTextField.getText();
        String address = addressTextField.getText();
        
        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null,"Name is Required");
            } else{
                Conn c = new Conn();
                String query = "insert into signup values ('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"' )"; 
                c.s.executeUpdate(query);
                
                setVisible(false);
                new SignupTwo(formno).setVisible(true);
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
    
    public static void main(String args[]){
        new SignupOne();
    }
}
