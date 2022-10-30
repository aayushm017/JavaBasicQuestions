package Questions;
import java.util.*;

public class ReverseAnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to reverse = ");
        int n = sc.nextInt();
        int rem, rev = 0;

        while(n!=0){
            rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        System.out.println(rev);
    }
}
