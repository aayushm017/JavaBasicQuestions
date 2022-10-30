package Questions;
import java.util.Scanner;

public class ReverseUsingRecursion {
    //Using Recursion
    public static void rev(int number){
        if(number < 10){
            System.out.print(number);
            return;
        }else{
            System.out.print(number % 10);
            rev(number/10);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse = ");
        int num = sc.nextInt();
        rev(num);
    }
}