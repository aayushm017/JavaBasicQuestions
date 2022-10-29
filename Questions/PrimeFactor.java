package Questions;
import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for which you have to find prime factor = ");
        int n = sc.nextInt();
        int temp = n;
        int div = 2;

        while(n > 1){
            if(n % div == 0)
            {
                System.out.print(div + " ");
                n = n / div;
            }
            else{
                div++;
            }
        }
    }
}
