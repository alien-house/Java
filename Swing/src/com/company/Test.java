package com.company;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Created by shinji on 2017/05/15.
 */
public class Test extends JFrame {
    private JButton button1;
//    JFrame f;
    private JTextField textField1;
    private JLabel label1;
    private JPanel panel1;
    private JPasswordField passwordField1;
    private JButton loginButton;

    Test(){
//        f = new JFrame();
//        f.setSize(400,500);
//        f.setLayout(new GridLayout(3,2));
//        f.setVisible(true);
//        System.out.print("dedede");
//        f.add(textField1);
//        label1.setText("user name");
//        f.add(label1);
//
//        loginButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                textField1.setText("Welcome to Javat.");
//                System.out.print("suceesss");
//            }
//        });
    }

    public static void main(String[] args) {
        new Test();
        JFrame frame = new JFrame("te");
        frame.setContentPane(new Test().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    public void setData(Test data) {
    }

    public void getData(Test data) {
    }

    public boolean isModified(Test data) {
        return false;
    }
}
