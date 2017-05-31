
package demoofsetsandmaps;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class Booksetdemo {
    public static void main(String[] args) {
        Set<Book> book = new TreeSet<>();
        Book b1 = new Book(101, "lets teach C", "aaaa",5);
        Book b2 = new Book(105, "Java Programming", "qqqq",10);
        Book b3 = new Book(103, "HTML","ccc",4);
        book.add(b1);
        book.add(b2);
        book.add(b3);
        
        for(Book b:book){
            System.out.println(b.id + " "+b.title+" "+b.author+ " "+ b.quantity);
        }
    }
    
}
