
//Wap to check a number is odd or even
import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " is an Even number");
        } else {
            System.out.println(n + " is an Odd Number");
        }
    }
}
