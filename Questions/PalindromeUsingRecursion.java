package Questions;
import java.util.Scanner;

public class PalindromeUsingRecursion {
    public static int palin(int num){
        if(num == 0){
            return 0;
        }
        else {
            return num%10 + palin(num/10) ;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check palindrome or not? = ");
        int n =sc.nextInt();
        int res = palin(n);
        if(res == n){
            System.out.println("Palindrome number");
        }
        else{
            System.out.println("Not a palindrome number");
        }
    }
}
