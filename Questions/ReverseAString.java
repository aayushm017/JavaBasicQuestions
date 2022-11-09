package Questions;

public class ReverseAString {
    public static void main(String[] args) {
        String x = "aayush";
        char[] y = x.toCharArray();
        int start = 0;
        int end = y.length - 1;

        while (start < end){
            char temp = y[end];
            y[end] = y[start];
            y[start] = temp;
            start++;
            end--;
        }
        System.out.println(y);
    }
}

