package Strings;

import java.util.Locale;

public class CountVowelsConsonantSplSym {
    public static void main(String[] args) {
        String x = "AAYuSH'S BrILLIaNCE ACADeMY";
        x = x.toUpperCase();
        char[] y = x.toCharArray();
        int size = y.length;

        int vowcnt = 0;
        int conscnt = 0;
        int splcnt = 0;

        int i=0;
        while(i!=size){
            if(y[i]>='A' && y[i]<='Z'){
                if(y[i]=='A' || y[i]=='E' || y[i]=='I' || y[i]=='O' || y[i]=='U'){
                    vowcnt++;
                }else{
                    conscnt++;
                }
            }else{
                splcnt++;
            }
            i++;
        }
        System.out.println("Vowels = " + vowcnt);
        System.out.println("Consonant = " + conscnt);
        System.out.println("Special Symbols = " + splcnt);
    }
}
