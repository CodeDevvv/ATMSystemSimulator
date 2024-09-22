
package atm.simulator.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener {
    
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String formno;

    SignupThree(String formno){
     this.formno = formno;

     setLayout(null);
     getContentPane().setBackground(Color.WHITE);
     setTitle("Continue to Sign-up!");
     setSize(850,820);
     setLocation(350, 10);
     setVisible(true); 
     
     JLabel additionalDetails = new JLabel("Page 3 : Account Details");
     additionalDetails.setBounds(180, 25 ,600, 45);
     additionalDetails.setFont(new Font("Raleway", Font.BOLD, 38));
     add(additionalDetails);
        
     JLabel type = new JLabel("Account Type");
     type.setBounds(100, 100 ,200, 30);
     type.setFont(new Font("Raleway", Font.BOLD, 22));
     add(type);     
        
     r1 = new JRadioButton("Savings Account");
     r1.setFont(new Font("Raleway", Font.BOLD, 16));
     r1.setBackground(Color.WHITE);
     r1.setBounds(100,150,170,20);
     add(r1);
     
     r2 = new JRadioButton("Fixed Deposit Account");
     r2.setFont(new Font("Raleway", Font.BOLD, 16));
     r2.setBackground(Color.WHITE);
     r2.setBounds(350,150,250,20);
     add(r2);
     
     r3 = new JRadioButton("Current Account");
     r3.setFont(new Font("Raleway", Font.BOLD, 16));
     r3.setBackground(Color.WHITE);
     r3.setBounds(100,190,250,20);
     add(r3);
     
     r4 = new JRadioButton("Recurring Deposit Account");
     r4.setFont(new Font("Raleway", Font.BOLD, 16));
     r4.setBackground(Color.WHITE);
     r4.setBounds(350,190,250,20);
     add(r4);
     
     ButtonGroup gAccount = new ButtonGroup();
     gAccount.add(r1);
     gAccount.add(r2);
     gAccount.add(r3);
     gAccount.add(r4);

     
     JLabel card = new JLabel("Card Number :");
     card.setFont(new Font("Raleway",Font.BOLD,22));
     card.setBounds(100,230,200,30);
     add(card);
     
     JLabel number = new JLabel("XXXX-XXXX-XXXX-4184");
     number.setFont(new Font("Raleway",Font.BOLD,22));
     number.setBounds(330,230,300,30);
     add(number);
     
     JLabel cardDetail = new JLabel("Your 16 Digit Card Number");
     cardDetail.setFont(new Font("Raleway",Font.BOLD,12));
     cardDetail.setBounds(100,270,300,20);
     add(cardDetail);
     
     JLabel pin = new JLabel("PIN :");
     pin.setFont(new Font("Raleway",Font.BOLD,22));
     pin.setBounds(100,300,200,30);
     add(pin);
     
     JLabel pnumber = new JLabel("XXXX");
     pnumber.setFont(new Font("Raleway",Font.BOLD,22));
     pnumber.setBounds(330,300,300,30);
     add(pnumber);     
     
     JLabel pinDetail = new JLabel("Your 4 Digit PIN Number");
     pinDetail.setFont(new Font("Raleway",Font.BOLD,12));
     pinDetail.setBounds(100,340,300,20);
     add(pinDetail);  
    
     JLabel services = new JLabel("Services Required");
     services.setFont(new Font("Raleway",Font.BOLD,22));
     services.setBounds(100,380,400,30);
     add(services);  
    
     c1 = new JCheckBox("ATM CARD");
     c1.setBackground(Color.WHITE);
     c1.setBounds(100,430,200,30);
     c1.setFont(new Font("Raleway", Font.BOLD,16));
     add(c1);

     c2 = new JCheckBox("Internet Banking");
     c2.setBackground(Color.WHITE);
     c2.setBounds(350,430,200,30);
     c2.setFont(new Font("Raleway", Font.BOLD,16));
     add(c2);
     
     c3 = new JCheckBox("Mobile Banking");
     c3.setBackground(Color.WHITE);
     c3.setBounds(100,480,200,30);
     c3.setFont(new Font("Raleway", Font.BOLD,16));
     add(c3);

     c4 = new JCheckBox("EMAIL&SMS Alerts");
     c4.setBackground(Color.WHITE);
     c4.setBounds(350,480,200,30);
     c4.setFont(new Font("Raleway", Font.BOLD,16));
     add(c4);
     
     c5 = new JCheckBox("Cheque Book");
     c5.setBackground(Color.WHITE);
     c5.setBounds(100,530,200,30);
     c5.setFont(new Font("Raleway", Font.BOLD,16));
     add(c5);
     
     c6 = new JCheckBox("E-Statement");
     c6.setBackground(Color.WHITE);
     c6.setBounds(350,530,200,30);
     c6.setFont(new Font("Raleway", Font.BOLD,16));
     add(c6);

     c7 = new JCheckBox("I Hereby Declare that above entered details are correct to the best of my knowledge.");
     c7.setBackground(Color.WHITE);
     c7.setBounds(100,580,600,30);
     c7.setFont(new Font("Raleway", Font.BOLD,18));
     add(c7);

     submit = new JButton("Submit");
     submit.setBackground(Color.ORANGE);
     submit.setForeground(Color.BLACK);
     submit.setFont(new Font("Raleway",Font.BOLD,14));
    submit.setBounds(250,630,100,30);
    submit.addActionListener(this);
    add(submit);
    
     cancel = new JButton("Cancel");
     cancel.setBackground(Color.ORANGE);
     cancel.setForeground(Color.BLACK);
     cancel.setFont(new Font("Raleway",Font.BOLD,14));
     cancel.setBounds(420,630,100,30);
     cancel.addActionListener(this);
     add(cancel);    
    
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()== submit){
            String accountType = null;
            if (r1.isSelected()){
                accountType = "Savings Account";
            } else if (r2.isSelected()){
                accountType = "Fixed Depoist Account";
            } else if (r3.isSelected()){
                accountType = "Current Account";
            } else if (r4.isSelected()){
                accountType = "Recurring Deposit Account";
            }
            
            Random random = new Random();
            String cardnumber = "" + Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);
            
            String pinnumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L) ;
            
            String Facility = "";
            if (c1.isSelected()){
                Facility = Facility + " ATM CARD";
            }else if(c2.isSelected()){
                Facility = Facility + " Internet Banking";
            } else if (c3.isSelected()){
                Facility = Facility + " Mobile Banking";
            } else if (c4.isSelected()){
                Facility = Facility + " EMAIL&SMS Services";
            } else if(c5.isSelected()){
                Facility = Facility + " Cheque Book";
            } else if (c6.isSelected()){
                Facility = Facility + " E-Statement";
            }
            
    try{
        if(accountType.equals("")){
            JOptionPane.showMessageDialog(null,"Account Type is required");
        } else{
            Conn conn = new Conn();
            String query1 = "insert into signupthree values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+Facility+"')";
            String query2 = "insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
       
            conn.s.executeUpdate(query1);
            conn.s.executeUpdate(query2);
          
            JOptionPane.showMessageDialog(null,"Card Number :" + cardnumber + "\n PIN :" + pinnumber); 
            
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        }    
    } catch (Exception e){
        System.out.println(e);
    }
            
        }else if (ae.getSource()== cancel){
            setVisible(false);
            new Login().setVisible(true); 
        }
    }
    
    
    
      public static void main(String args[]){
        new SignupThree("");
    }
    
}
