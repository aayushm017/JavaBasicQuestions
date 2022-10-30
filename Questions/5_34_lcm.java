package Questions;
import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number n1 & n2 = ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int rem;
        int original_n1 = n1;
        int original_n2 = n2;

        while( n1 % n2 != 0){
            rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        int gcd = n2;
        int lcm = (original_n1 * original_n2) / gcd;
        System.out.println(lcm);
    }
}
