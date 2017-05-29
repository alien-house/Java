package com.company;
/**
 * Created by shinji on 2017/05/26.
 */

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LoadDataView extends JFrame{
    private JButton loadButton = new JButton("Load Data");
    private JButton writeButton = new JButton("Write Data");
    private JLabel label = new JLabel("Ok, the text is currently not loaded...");
    private JLabel labelLoad = new JLabel("");
    private JTextArea txtArea = new JTextArea("",5,20);
    private JPanel loadPanel;

    public LoadDataView(){
        loadPanel = new JPanel();
        this.setTitle("Load Data");
//        this.setLayout(new GridLayout(3, 3));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,600);

        label.setSize(350,50);
        txtArea.setBounds(10,30, 200,200);

        loadPanel.add(label);
        loadPanel.add(loadButton);
        loadPanel.add(txtArea);
        loadPanel.add(writeButton);
        this.add(loadPanel);
    }

    public void setTextString(String txt){
        txtArea.setText("");
        txtArea.append(txt);
    }

    public void setTextSringLoad(String txt){
        loadPanel.add(labelLoad);
        labelLoad.setText(txt);
    }

    public String getTextString(){
        return txtArea.getText();
    }

    public void addLoadDataListener(ActionListener listenerforLoadButton){
        loadButton.addActionListener(listenerforLoadButton);
    }

    public void addSaveDataListener(ActionListener listenerforSaveButton){
        writeButton.addActionListener(listenerforSaveButton);
    }

}
