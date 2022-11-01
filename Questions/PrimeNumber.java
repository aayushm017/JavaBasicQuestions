package Questions;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check whether it is a prime number or not? = ");
        int n = sc.nextInt();
        int temp = 0;

        for(int div = 2; div <= n-1; div++){
            if(n % div == 0){
                temp = temp + 1;
            }
        }
        if(temp == 0){
            System.out.println(n + " = is a prime number");
        }else{
            System.out.println(n + " = is not a prime number");
        }
    }
}
