
//WAP to check a number is even or odd,  
//if odd then check it's divisible by 7 or not
import java.util.Scanner;

public class CheckOddEvenDiv7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number = ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.print(n + " is an Even Number");
        } else if (n % 2 != 0) {
            System.out.print(n + " is an Odd Number");
            if (n % 7 == 0) {
                System.out.print(" and is divisible by 7");
            } else {
                System.out.print(". Hence it's not divisible by 7");
            }
        }
    }
}