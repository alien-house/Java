package com.company;

import java.util.*;

/**
 * Created by shinji on 2017/05/05.
 */
public class SalonReport {

    public static void main(String[] args) {
        ArrayList<Service> array = new ArrayList<Service>();
//        List<Service> array = new ArrayList<Service>();
        Service service1 = new Service("Cut",8.00,15);
        Service service2 = new Service("Shampoo",4.00,10);
        Service service3 = new Service("Manicure",18.00,30);
        Service service4 = new Service("Style",48.00,55);
        Service service5 = new Service("Permanent",18.00,35);
        Service service6 = new Service("Trim",6.00,5);

        array.add(service1);
        array.add(service2);
        array.add(service3);
        array.add(service4);
        array.add(service5);
        array.add(service6);

        System.out.println("May I help you?");
        showDetail(array);


        boolean isLock = true;

        while (isLock){
            System.out.println("You can operate to sort the menu.");
            System.out.println("[1] Service Description : Ascending");
            System.out.println("[2]                     : Descending");
            System.out.println("[3] Price               : Ascending");
            System.out.println("[4]                     : Descending");
            System.out.println("[5] Time(Minutes)       : Ascending");
            System.out.println("[6]                     : Descending");
            System.out.println("[9] Exit");
            Scanner number = new Scanner(System.in);
            int a = number.nextInt();
            switch (a) {
                case 1:
                    sortOrderString(array,true);
                    break;
                case 2:
                    sortOrderString(array,false);
                    break;
                case 3:
                    sortOrderDouble(array,true);
                    break;
                case 4:
                    sortOrderDouble(array,false);
                    break;
                case 5:
                    sortOrderInt(array,true);
                    break;
                case 6:
                    sortOrderInt(array,false);
                    break;
                case 9:
                    System.out.println("Good bye");
                    isLock = false;
                    break;
                default :
                    break;
            }
        }

    }


    public static void sortOrderInt(ArrayList list, Boolean ascOrder){

        Collections.sort(list, new Comparator() {
            public int compare(Object q1, Object q2) {
                if(ascOrder){
                    return Integer.compare(((Service)q1).getMinutes(),((Service)q2).getMinutes());
                }else{
                    return Integer.compare(((Service)q2).getMinutes(),((Service)q1).getMinutes());
                }
            }
        });
        showDetail(list);

    }


    public static void sortOrderDouble(ArrayList list, Boolean ascOrder){

        Collections.sort(list, new Comparator() {
            public int compare(Object q1, Object q2) {
                if(ascOrder) {
                    return Double.compare(((Service) q1).getPrice(), ((Service) q2).getPrice());
                }else{
                    return Double.compare(((Service) q2).getPrice(), ((Service) q1).getPrice());
                }
            }
        });
        showDetail(list);

    }

    public static void sortOrderString(ArrayList list, Boolean ascOrder){

        // compare String
        Collections.sort(list, new Comparator() {
            public int compare(Object q1, Object q2) {
                if(ascOrder) {
                    return ((Service) q1).getDesc().compareTo(((Service) q2).getDesc());
                }else{
                    return ((Service) q2).getDesc().compareTo(((Service) q1).getDesc());
                }
            }
        });

        System.out.println("");
        showDetail(list);

    }


    public static void showDetail(ArrayList list){

        System.out.println("==========================");
        System.out.print(String.format("%10s", "Service"));
        System.out.print(String.format("%8s", "Price"));
        System.out.println(String.format("%6s", "Time"));
        System.out.println("--------------------------");

        for (int i = 0; i < list.size();i++){
            System.out.print(String.format("%10s", ((Service)list.get(i)).getDesc()));
            System.out.print(String.format("%8s", ((Service)list.get(i)).getPrice()));
            System.out.println(String.format("%6s", ((Service)list.get(i)).getMinutes()));
        }
        System.out.println("==========================");
        System.out.println("");

    }


}
