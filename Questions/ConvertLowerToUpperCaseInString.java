package Questions;

public class ConvertLowerToUpperCaseInString {
    public static void main(String[] args) {
        String x = "aayush";
        char[] y = x.toCharArray();
        int size = y.length;

        int  i = 0;
        while (i != size){
            y[i] = (char) (y[i] - 32);
            i++;
        }
        System.out.println(x);
        System.out.println(y);
    }
}
