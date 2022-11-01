package Questions;
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find it is a Perfect number or not = ");
        int n = sc.nextInt();
        int sum = 0;

        int i= 1;
        while (n % i == 0){
            sum = sum + i;
            i++;
        }
        System.out.println("Sum = " + sum);
        if (sum == n){
            System.out.println(n + " = is a Perfect Number");
        }else{
            System.out.println(n + " = is not a Perfect Number");
        }
    }
}
