package Strings;
import java.nio.charset.CharacterCodingException;
import java.util.*;

public class MaxOccuringChar {
    public static void main(String[] args) {
        String x = "GOD_BLESS_SPIDERMAN";
        char[] y = x.toCharArray();
        int size = y.length;

        Map<Character, Integer> map = new HashMap<>();
        int i=0;
        while(i!=size){
            if(map.containsKey(y[i])==false){
                map.put(y[i], 1);
            }else{
                int oldval = map.get(y[i]);
                int newval = oldval+1;
                map.put(y[i], newval);
            }
            i++;
        }

        Set<Map.Entry<Character, Integer>> hmap = map.entrySet();
        int maxval = 0;
        char maxkey = ' ';
        for(Map.Entry<Character, Integer> data : hmap){  //using for each to travel along the length of the map and each time check that value present in the map is greater than my MaxVal.
            if(data.getValue() > maxval){  //getValue is inside that hidden table which we want
                maxval = data.getValue();
                maxkey = data.getKey();;
            }
        }
        System.out.println("Max Occuring Key = " + maxkey);
        System.out.println("Max Occuring Value = " + maxval);
    }
}
