
//WAP to generate natural numbers upto n
import java.util.Scanner;

public class NaturalNumberUptoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number upto which you want a natural number = ");
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.println("Natural Upto N = " + i);
        }
    }
}
