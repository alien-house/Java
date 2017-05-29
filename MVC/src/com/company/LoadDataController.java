package com.company;

/**
 * Created by shinji on 2017/05/26.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoadDataController {
    private LoadDataView theView;
    private LoadDataModel theModel;

    public LoadDataController(LoadDataView theView, LoadDataModel theModel){
        this.theView = theView;
        this.theModel = theModel;
        this.theView.addLoadDataListener(new loaddataListner());
        this.theView.addSaveDataListener(new savedataListner());
    }

    class savedataListner implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String str = theView.getTextString();
            Boolean isSaved = theModel.setTextData("newFile_re.txt",str);
            System.out.println("😅");
            System.out.println(isSaved);
        }
    }

    class loaddataListner implements ActionListener{

        @Override
        //Called just after the user performs an action.
        public void actionPerformed(ActionEvent e) {
            String result = theModel.getTextData("newFile.txt");

            theView.setTextSringLoad(result);
//            theView.setTextString(result); // Q.01




            //newFile.txt
//            int no1,no2;
//            no1 = theView.getFirstNumber();
//            no2 = theView.getSecondNumber();
//            theModel.addTwoNumbers(no1, no2);
//            int result = theModel.getCalcvalue();//calcurate in model
//            theView.setCalcSolution(result); // pass the result to view
        }

    }

}
