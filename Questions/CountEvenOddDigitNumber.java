package Questions;
import java.util.Scanner;

public class CountEvenOddDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number = ");
        int n = sc.nextInt();
        int rem;
        int even = 0, odd = 0;

        while (n != 0){
            rem = n % 10;
            if (rem % 2 == 0){
                even++;
            }
            else {
                odd++;
            }
            n = n / 10;
        }
        System.out.println(even + " = Total Even digits");
        System.out.println(odd + " = Total Odd digits");
    }
}
