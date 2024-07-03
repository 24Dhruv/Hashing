import java.util.*;
import java.util.HashSet;
import java.util.Iterator;
public class hashing {

HashMap<String,Integer> map = new HashMap<>();

        //insertion
        map.put("indo", 123);
        map.put("india", 233);
        map.put("usa", 23);
        map.put("indo", null);
      
System.out.println(map);

map.put("india", 23);
  System.out.println(map);
  if (map.containsKey("india")) {
System.out.println("there");
  }
  else{
    System.out.println("not there");
  }

  //key exists
  System.out.println(map.get("indo"));
  System.out.println(map.get("inni"));

  for( map.Entry<String, Integer> e : map.entrySet()){
    System.out.println(e.getKey());
  }
  map.remove("indo");
  System.out.println(map);
    }

    
}
