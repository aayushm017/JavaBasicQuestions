package Questions;
import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of which you have to find the Sum = ");
        long n = sc.nextLong();
        long sum = 0;
        long rem;

        while (n!=0){
            rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        System.out.println("Sum of digits is = " + sum);
    }
}
