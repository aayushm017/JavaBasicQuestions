package Questions;
import java.util.Scanner;

public class FactorialUsingRecursion {
    public static long fact(long num)
    {
        if(num == 0){
            return 1;
        }else{
            long res = fact(num-1);
            return num * res;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find factorial = ");
        long n  =sc.nextLong();
        long res = fact(n);
        System.out.println(res);
    }
}
