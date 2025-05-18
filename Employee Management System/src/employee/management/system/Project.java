package employee.management.system;

import javax.swing.*;
import java.awt.*;

public class Project extends JFrame {
    
    Project(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        heading.setBounds(130,30,1200,60);
        heading.setFont(new Font("serif",Font.PLAIN,60));
        heading.setForeground(Color.RED);
        add(heading);
                
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1100,700,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(110,100,1050,500);
        add (image);
        
        JButton clickhere = new JButton("CLICK HERE TO CONTINUE");
        clickhere.setBounds (500,500,300,70);
        clickhere.setBackground(Color.BLACK);
        clickhere.setForeground(Color.WHITE);
        add(clickhere);
        
        
        
        
        
        setSize(650,1170);
        setLocation(200,50);
        setVisible(true);
    }
    
    public static void main(String[] args){
        new Project();
        
    }           
    
}
