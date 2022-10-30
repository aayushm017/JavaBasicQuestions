package Questions;
import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number n1 & n2 = ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int rem;

        while( n1 % n2 != 0){
            rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        int gcd = n2;
        System.out.println(gcd);
    }
}
