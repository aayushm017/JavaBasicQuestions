package Questions;
import java.util.Scanner;

public class MaxIntegerInDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find max digit = ");
        int num = sc.nextInt();
        int rem;
        int max = 0;

        while (num != 0){
            rem = num % 10;
            if (rem > max){
                max = rem;
            }
            num = num / 10;
        }
        System.out.println("Maximum digit = " + max);
    }
}
