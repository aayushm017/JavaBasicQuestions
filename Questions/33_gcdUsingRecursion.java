package Questions;
import java.util.Scanner;

public class gcdUsingRecursion {

    public static int gcd(int n1, int n2) {
        if (n1 == 0 || n2 == 0) {
            return n1;
        } else {
            return gcd(n2, n1 % n2);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number n1 & n2 = ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int res = gcd(n1, n2);
        System.out.println("GCD is = " + res);
    }
}
