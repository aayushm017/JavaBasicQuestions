package Questions;
import java.util.Scanner;

public class GenericRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number = ");
        int n = sc.nextInt();
        int rem, sum = 0;

        while (n != 0){
            rem = n % 10;
            sum = sum + rem;
            n = n / 10;
         }
        System.out.println(sum);
        int add = sum;

        int s = 0, r;
        while (add != 0){
            r = add % 10;
            s = s + r;
            add = add / 10;
        }
        System.out.println(s + " = Generic Number(Single digit number)");
    }
}
