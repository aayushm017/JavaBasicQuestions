package Questions;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length till which you want to print fibonacci = ");
        int length = sc.nextInt();
        int a = 0, b = 1, c;
        System.out.print(a + " ");
        System.out.print(b + " ");

        for(int i = 0; i <= length; i++){
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
