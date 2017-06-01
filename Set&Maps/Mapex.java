package demoofsetsandmaps;

import java.util.*;

public class Mapex {

    public static void main(String[] args) {

        Map<Integer, String> m1 = new TreeMap<>();
        m1.put(110,"ppp");
        m1.put(101, "aaa");
        m1.put(105, "zzz");
        m1.put(103,"ccc");
        m1.put(108,"sss");
        System.out.println("data is " + m1);
        
        System.out.println("deleted data is " + m1.remove(103));
        System.out.println("data is " + m1);
        System.out.println("value at 110 is " +m1.get(110));
        
    }
}
