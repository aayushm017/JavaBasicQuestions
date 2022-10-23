//WAP to check whether a number is divisible by 5

import java.util.Scanner;

public class CheckDivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();

        if (n % 5 == 0) {
            System.out.println(n + " is divisible by 5");
        } else {
            System.out.println(n + " is Not divisible by 5");
        }
    }
}
