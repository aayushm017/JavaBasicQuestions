package HashMap_HashSet;
import java.util.*;

public class HashMapp {
    public static void main(String[] args) {
        //Creating hashmap
        HashMap<String, Integer> map=new HashMap<>();

        //Insertion country(key), population(value)
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);
//        System.out.println(map);
//
//        map.put("China", 180);
//        System.out.println(map);
//
//        //Search
//        if(map.containsKey("China")){
//            System.out.println("Key is present in the Map");
//        }else{
//            System.out.println("Key is not present in the Map");
//        }

        //Iterations
//        int arr[]={12,15,18};
//        for(int i=0; i<3; i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//
//        for(int val:arr){   //key value pair
//            System.out.print(val + " ");
//        }
//        System.out.println();

        for(Map.Entry<String, Integer> e: map.entrySet()){
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
        }

        map.remove("China");
        System.out.println(map);
    }
}
