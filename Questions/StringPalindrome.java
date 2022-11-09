package Questions;

public class StringPalindrome {
    public static void main(String[] args) {
        String x = "liril";
        x.replace(" ", "");
        x.toLowerCase();
        char[] y = x.toCharArray();
        int size = y.length;
        char[] a = new char[size];
        int i = 0;

        while(i != size){
            a[size - 1 - i] = y[i];
            i++;
        }

        //check palindrome
        i = 0;
        while (i != size){
            if(a[i] != y[i]){
                System.out.println("Not a Palindrome string");
                System.exit(0);
            }else{
                i++;
            }
        }
        System.out.println("Palindrome String");
    }
}
