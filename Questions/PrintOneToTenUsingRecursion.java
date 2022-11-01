package Questions;
import java.util.Scanner;

public class PrintOneToTenUsingRecursion {
    public static void fun(int num){
        if(num == 0){
            return;
        }else{
            fun(num - 1);
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number till which I have to print = ");
        int n = sc.nextInt();
        fun(n);
    }
}
