package sheet7;

import javax.swing.JFrame;
import javax.swing.*;

public class Question1 extends JFrame
{
    JPanel p1 = new JPanel();
    JLabel l1 = new JLabel("WELCOME TO MY BANK");
    JLabel l2 = new JLabel("Enter Your Pin");
    JTextField t1 = new JTextField();
    JButton b1 = new JButton("OK");
    JButton b2 = new JButton("1");
    JButton b3 = new JButton("2");
    JButton b4 = new JButton("3");
    JButton b5 = new JButton("4");
    JButton b6 = new JButton("5");
    JButton b7 = new JButton("6");
    JButton b8 = new JButton("7");
    JButton b9 = new JButton("8");
    JButton b10 = new JButton("9");
    JButton b11 = new JButton("0");
    JButton b12 = new JButton("Backspace");
    public Question1()
    {
        setTitle("Diffren Layouts");
        setSize(500,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocation(200,60);
        setLayout(null);
        p1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        p1.setBounds(50, 20, 400, 300);
        add(p1);
        p1.setLayout(null);
        l1.setBounds(40, 20, 300, 30);
        p1.add(l1);
        l2.setBounds(5, 70, 100, 30);
        p1.add(l2);
        t1.setBounds(120, 70, 180, 30);
        p1.add(t1);
        b1.setBounds(310, 70, 80, 30);
        p1.add(b1);
        b2.setBounds(60, 130, 80, 20);
        p1.add(b2);
        b3.setBounds(160, 130, 80, 20);
        p1.add(b3);
        b4.setBounds(260, 130, 80, 20);
        p1.add(b4);
        b5.setBounds(60, 170, 80, 20);
        p1.add(b5);
        b6.setBounds(160, 170, 80, 20);
        p1.add(b6);
        b7.setBounds(260, 170, 80, 20);
        p1.add(b7);
        b8.setBounds(60, 210, 80, 20);
        p1.add(b8);
        b9.setBounds(160, 210, 80, 20);
        p1.add(b9);
        b10.setBounds(260, 210, 80, 20);
        p1.add(b10);
        b11.setBounds(80, 250, 110, 20);
        p1.add(b11);
        b12.setBounds(220, 250, 110, 20);
        p1.add(b12);
        
    }
    public static void main(String[] args) 
    {
        Question1 ob = new Question1();
    }
    
}
