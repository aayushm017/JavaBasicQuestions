package BasicImpQuestions;
import java.util.Scanner;

public class GCD_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to find GCD/HCF & LCM = ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int on1 = n1;
        int on2 = n2;

        while(n1 % n2 != 0){
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        int gcd = n2;
        int lcm = (on1 * on2) / gcd;

        System.out.println("GCD is = " + gcd);
        System.out.println("LCM is = " + lcm);
    }
}
