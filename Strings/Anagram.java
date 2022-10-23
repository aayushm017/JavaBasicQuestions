package Strings;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String x = "HE Is aRadhYa";
        String y = "is he HradaYa";

        x = x.replace(" ", "");
        y = y.replace(" ", "");

        x = x.toLowerCase();
        y = y.toLowerCase();

        char[] a = x.toCharArray();
        char[] b = y.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        Boolean result = Arrays.equals(a, b);

        if(result==true){
            System.out.println("String is an Anagram");
        }else{
            System.out.println("String is not an Anagram");
        }
    }
}
