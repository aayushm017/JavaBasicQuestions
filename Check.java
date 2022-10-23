
//WAP to find whether a given number is a negative number,
// zero, positive number. If the number is positive check 
//whether the number is odd or even. If the number is odd 
//check whether the number is divisible by five or not. 
//Display the suitable message for the given number
import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner chk = new Scanner(System.in);
        System.out.println("Enter the Number = ");
        int check = chk.nextInt();

        if (check < 0) {
            System.out.println("Negative Number");
        }
        if (check == 0) {
            System.out.println("Zero");
        }
        if (check > 0) {
            System.out.println("Positive Number");
            if (check % 2 == 0) {
                System.out.println("Even Number");
            } else {
                System.out.println("Odd number");
                if (check % 5 == 0) {
                    System.out.println("Divisible by 5");
                } else {
                    System.out.println("Not Divisible by 5");
                }
            }

        }
    }

}
