package Questions;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of which we have to calculate factorial = ");
        int n = sc.nextInt();
        int fact = 1;

        for(int i = n; i >= 1; i--){
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
