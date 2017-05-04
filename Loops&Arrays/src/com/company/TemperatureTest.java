package com.company;

/**
 * Created by shinji on 2017/05/04.
 */
public class TemperatureTest {

    //01
    public static double[] dailyTemp = {70,61,64,71,66,68,62};

    TemperatureTest(/*double dailyTemps[]*/){
//        dailyTemp = dailyTemps;

        //02
        for (int i = 0; i < dailyTemp.length; i++){
            System.out.println( "dailyTemp is "+ dailyTemp[i]);
        }

    }

    //03
    public static double average(double[] aDouble){
        double tem = 0.0;
        for (int i = 0; i < dailyTemp.length; i++){
            tem += dailyTemp[i];
        }
        return tem/dailyTemp.length;
    }



}
