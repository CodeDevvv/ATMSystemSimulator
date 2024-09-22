
package atm.simulator.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PinChange extends JFrame implements ActionListener {
    
    JButton change,back;
    JPasswordField pin,repin;
    String pinnumber;
   
    PinChange(String pinnumber){
        
        this.pinnumber = pinnumber;
               
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text = new JLabel("Change Your Pin");
        text.setBounds(250,280,500,35);
        text.setFont(new Font("System",Font.BOLD,16));
        text.setForeground(Color.WHITE);
        image.add(text);
        
        JLabel pintext = new JLabel("New PIN:");
        pintext.setBounds(165,320,180,25);
        pintext.setFont(new Font("System",Font.BOLD,16));
        pintext.setForeground(Color.WHITE);
        image.add(pintext);
        
        
        pin = new JPasswordField();
        pin.setFont(new Font("Raleway",Font.BOLD,25));
        pin.setBounds(330,320,180,25);
        image.add(pin);
        
        JLabel repintext = new JLabel("Re-Enter New PIN:");
        repintext.setBounds(165,360,180,25);
        repintext.setFont(new Font("System",Font.BOLD,16));
        repintext.setForeground(Color.WHITE);
        image.add(repintext);
        
        repin = new JPasswordField();
        repin.setFont(new Font("Raleway",Font.BOLD,25));
        repin.setBounds(330,360,180,25);
        image.add(repin);
        
        change = new JButton("Change");
        change.setBounds(355,485,150,30);
        change.addActionListener(this);
        image.add(change);
        
        back = new JButton("Back");
        back.setBounds(355,520,150,30);
        change.addActionListener(this);
        image.add(back);
        
        setLayout(null);
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    
    
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == change){
    try{
        String npin = pin.getText();
        String rpin = repin.getText();
        if(!npin.equals(rpin)){
            JOptionPane.showMessageDialog(null,"Entered PIN Does not match!");
            return;
        }  
         if(npin.equals("")){
            JOptionPane.showMessageDialog(null,"Please Enter New PIN");
            return;
        }  
          if(rpin.equals("")){
            JOptionPane.showMessageDialog(null,"Please Re-Enter New PIN ");
            return;
        }  
          
          Conn conn = new Conn();
          String query1 = "update bank set PIN = '"+rpin+"' where PIN = '"+pinnumber+"'";
          String query2 = "update login set PIN = '"+rpin+"' where PIN = '"+pinnumber+"'";
          String query3 = "update signupthree set PIN = '"+rpin+"' where PIN = '"+pinnumber+"'";

          conn.s.executeUpdate(query1);
          conn.s.executeUpdate(query2);
          conn.s.executeUpdate(query3);
          JOptionPane.showMessageDialog(null,"PIN Changed Successfully");
          setVisible(false);
          new Transactions(rpin).setVisible(true);

          
    } catch(Exception e){
        System.out.println(e);
    } 
    }
    else {
    setVisible(false);
    new Transactions(pinnumber).setVisible(true);
}   
}
    public static void main(String args[]){
        new PinChange("");
    }
}
