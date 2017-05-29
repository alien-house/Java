package com.company;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        LoadDataModel theModel = new LoadDataModel();
        LoadDataView theView = new LoadDataView();
        LoadDataController theController = new LoadDataController(theView, theModel);
        theView.setVisible(true);
    }
}
