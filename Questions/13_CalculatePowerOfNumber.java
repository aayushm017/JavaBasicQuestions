package Questions;
import java.util.Scanner;

public class CalculatePowerOfNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number = ");
        int n = sc.nextInt();
        System.out.println("Enter power = ");
        int pow = sc.nextInt();
        int result = 1;

        for(int i = 1; i <= pow; i++){
            result = result * n;
        }
        System.out.println("Answer is = " + result);
    }
}
