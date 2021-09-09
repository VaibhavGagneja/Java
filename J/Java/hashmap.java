import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        
        var hashmap = new HashMap<Integer,String>();
        hashmap.put(23, "HP");
        hashmap.put(12, "Dell");
        hashmap.put(10, "Apple");
        hashmap.put(25, "Invitus");
        hashmap.put(22, "Asus"); 


        var entrySet = hashmap.keySet();

    // System.out.println(hashmap.getKey());
        for (var entry : entrySet) {
            // System.out.println("key:" + entry.getKey() + "--" + "Value: " + entry.getValue());
            System.out.println(entry);
        }

    }
}
