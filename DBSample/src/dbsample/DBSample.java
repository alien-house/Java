/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbsample;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author shinji
 */
public class DBSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        NewJFrame panel = new NewJFrame();
        LoginForm frame = new LoginForm();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        
        
    }
    
    
}
