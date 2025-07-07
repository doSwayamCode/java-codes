import java.util.*;

public class Hashmaps{
    public static void main(String[] args) {
        // String name = "Swayam";

        // int code = name.hashCode();
        // System.out.println("Hash code of " + name + " is: " + code);



        HashMap <String, Integer> map = new HashMap<>();

        map.put("Swayam", 89);
        map.put("Kunal", 99);
        map.put("Rahul", 94);
       
        System.out.println(map.get("Swayam"));
        System.out.println(map.getOrDefault("Apporv", 78));
        System.out.println(map.containsKey("Kunal"));

        
    HashSet<Integer> set = new HashSet <>();
    set.add(1);
    set.add(2);
    set.add(3);
    set.add(4);

    set.add(4); // Duplicate value, will not be added

    System.out.println(set);


        TreeMap <String, Integer> maps = new TreeMap<>(); //everything is sorted in ascending order.

        maps.put("Swayam", 89);
        maps.put("Kunal", 99);
        maps.put("Rahul", 94);
       
        System.out.println(maps.get("Swayam"));
        System.out.println(maps.getOrDefault("Apporv", 78));
        System.out.println(maps.containsKey("Kunal"));

    }


  
}