package Questions;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number = ");
        int n = sc.nextInt();
        int rem, rev=0;
        int original_num = n;

        while(n != 0){
            rem = n%10;
            rev = rev*10 + rem; //Wrong wrong
            n = n/10;
        }

        if(original_num == rev){
            System.out.println(original_num + " = is a palindrome number");
        }else{
            System.out.println(original_num + " = is not a palindrome number");
        }
    }
}
