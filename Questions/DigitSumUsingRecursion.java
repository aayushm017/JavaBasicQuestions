package Questions;
import java.util.Scanner;

public class DigitSumUsingRecursion {
    public static int SumDigits(int num){
        if(num == 0){
            return 0;
        }
        else{
            return num % 10 + SumDigits(num / 10);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to sum the digits = ");
        int num = sc.nextInt();
        int res = SumDigits(num);
        System.out.println(res);
    }
}
