
import java.util.HashSet;
import java.util.Iterator;
public class hashing {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(12);
        hs.add(23);
        hs.add(30);
        hs.add(40); 
      //to chech if element exist.
        if (hs.contains(14)) {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
      //size
        System.out.println("size of set "+ hs.size());
      //print all element
        System.out.println("all element of set are "+ hs );
      // remove
        hs.remove(12);
      // loop to print all
         Iterator it = hs.iterator();
         while ( it.hasNext()) {
            System.out.println( it.next());
         }
        }
}
