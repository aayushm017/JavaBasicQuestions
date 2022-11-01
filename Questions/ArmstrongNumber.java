package Questions;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to find its Armstrong number or not = ");
        int n = sc.nextInt();
        int original_num = n;
        int o_num = n;
        int rem, sum = 0, count = 0;

        while(n%10 != 1){
            n = n/10;
            count++;
        }
        int digit = count+1;
        while (original_num != 0){
            rem = original_num % 10;
            sum = (int) (sum + Math.pow(rem, digit));
            n = n/10;
        }
        System.out.println(sum);
        if(o_num == sum){
            System.out.println(original_num + " = is an Armstrong number");
        }else{
            System.out.println(original_num + " = is Not an Armstrong Number");
        }
    }
}
