package Questions;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to find its Armstrong number or not = ");
        int n = sc.nextInt();
        int original_num = n;
        int rem, sum = 0;

        while (n != 0){
            rem = n % 10;
            sum = sum + (rem*rem*rem);
            n = n/10;
        }
        if(original_num == sum){
            System.out.println(original_num + " = is an Armstrong number");
        }else{
            System.out.println(original_num + " = is Not an Armstrong Number");
        }
    }
}
