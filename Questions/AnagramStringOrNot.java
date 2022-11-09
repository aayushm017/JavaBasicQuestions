package Questions;

import java.util.Arrays;

public class AnagramStringOrNot {
    public static void main(String[] args) {
        String x = "Aradhya";
        String y = "Hradaya";

        x = x.toLowerCase();
        y = y.toLowerCase();

        x = x.replace(" ", "");
        y = y.replace(" ", "");

        char[] a = x.toCharArray();
        char[] b = x.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        boolean results = Arrays.equals(a, b);

        if(results == true){
            System.out.println("Anagram String");
        }else{
            System.out.println("Not an Anagram");
        }
    }
}
