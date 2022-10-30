package Questions;
import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for table = ");
        int n = sc.nextInt();
        System.out.println("Enter multiplication values till = ");
        int k = sc.nextInt();
        int result = 1;

        for (int m = 1; m <= k ; m++){
            result = n * m;
            System.out.println(n + " * " + m + " = " + result);
        }
    }
}
