package Questions;
import java.util.Scanner;

public class ReverseNumberWithTestCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter test cases = ");
        int t = sc.nextInt();

        for(int i = 1; i <= t; i++)
        {
            System.out.println("Enter number which is to be Reversed = ");
            int n = sc.nextInt();
            int rem, rev = 0;

            while(n != 0){
                rem = n % 10;
                rev = rev*10 + rem;
                n = n/10;
            }
            System.out.println(rev);
        }
    }
}
