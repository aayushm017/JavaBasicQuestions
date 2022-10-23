package Strings;

public class DelOccurencesOfGivenChar {
    public static void main(String[] args) {
        String x = "SPIDERLIES";
//         x = x.toLowerCase();
        char[] y = x.toCharArray();
        int size = y.length;
        char key = 'S';

        int i=0;
        String res = "";
        while(i!=size){
            if(y[i]!=key){
                res = res + y[i];
            }
            i++;
        }
        System.out.println(res);
    }
}
