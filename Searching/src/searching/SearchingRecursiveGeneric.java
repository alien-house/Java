package searching;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shinji
 */
public class SearchingRecursiveGeneric{
    
    public static <T extends Comparable<T>> boolean binarySearch(T[] data, T target){
        return binarySearch(data, 0, data.length - 1, target);
    }
    
    //下記のbinarySearchが使えるのはcomparableを継承しているものじゃないと使えないと言う制限。
    private static <T extends Comparable<T>> boolean binarySearch(T[] data, int min, int max, T target){
        boolean found = false;
        int midpoint = (min + max) / 2;
        
        // 見つかった時
        if(data[midpoint].compareTo(target) == 0){
             found = true;
             
        // 前にある場合
        }else if(data[midpoint].compareTo(target) > 0){
            if(min <= midpoint -1){
                //半分の半分で探す
                found = binarySearch(data, min, midpoint - 1, target);
            }
            
        //後にある場合、さらに中間ポイントが最大値より小さい場合
        }else if(midpoint + 1 <= max){
                found = binarySearch(data, midpoint - 1, max, target);
        }
        return found;
    }
    
    
    
}
