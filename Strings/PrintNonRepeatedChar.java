package Strings;

import java.util.*;

public class PrintNonRepeatedChar {
    public static void main(String[] args) {
        String x = "SILLYSPIDERS";
        char[] y = x.toCharArray();
        int size = y.length;

        Map<Character, Integer> map = new HashMap<>();
        int i=0;
        while(i!=size){
            if(map.containsKey(y[i])==false){
                map.put(y[i], 1); //putting (key, value) pair
            }else{
                int oldval = map.get(y[i]);
                int newval = oldval + 1;
                map.put(y[i], newval); //putting back the new value in the table after equating
            }
            i++;
        }

        //Accessing key and value pair using for-each loop and Inbuilt methods
        Set<Map.Entry<Character, Integer>> hmap = map.entrySet();  //creating new set and store the map elements into them.
        for(Map.Entry<Character, Integer> data: hmap){
            if(data.getValue()==1){
                System.out.println(data.getKey());
            }
        }
    }
}
