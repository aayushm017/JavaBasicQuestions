package Strings;

public class FirstLetterFromLowerToUpper {
    public static void main(String[] args) {
        String x = "aayush brilliance academy";
        char[] y = x.toCharArray();
        int size = y.length;

        y[0] = (char)(y[0]-32);  //Lower case to Upper case
        int i=1;
        while(i!=size){
            if(y[i] == ' '){     //while traversing Array we find space then capitalize the next letter after the space.
                y[i+1] = (char) (y[i+1]-32);  //capitalizing the first letter of each word
            }
            i++;
        }

        System.out.println(x);
        System.out.println(y);
    }
}
