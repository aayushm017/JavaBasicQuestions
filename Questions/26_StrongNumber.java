package Questions;
import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find it's a Strong number or not? = ");
        int n = sc.nextInt();
        int sum = 0, rem;
        int original_n = n;

        while(n != 0){
            int fact = 1;
            rem = n % 10;
            for(int  i = rem; i >= 1; i--){
                fact = fact * i;
            }
            sum = sum + fact;
            n = n / 10;
        }

        if(original_n == sum){
            System.out.println(original_n + " = is a Strong Number");
        }else{
            System.out.println(original_n + " = is not a Strong Number");
        }
    }
}
