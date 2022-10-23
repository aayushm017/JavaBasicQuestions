
//WAP to generate multiples of 5 upto n 
import java.util.Scanner;

public class Multipleof5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number = ");
        int n = sc.nextInt();

        for (int number = 1; number <= n; number++) {
            if (number % 5 == 0) {
                System.out.println("Multiples of 5 = " + number);
            }
        }
    }
}
