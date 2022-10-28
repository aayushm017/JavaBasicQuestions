package Questions;
import java.util.*;

public class NumberPowerEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b, c values for calculation = ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = (int) Math.pow(b, a);
        if(result == c)
        {
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}


// Online C compiler to run C program online

//#include <stdio.h>
//        #include <math.h>
//
//        int main() {
//        int a, b, c, result;
//        printf("Enter a, b, c values = ");
//        scanf("%d%d%d", &a, &b, &c);
//
//        result = pow(b, a);
//        if(result==c){
//        printf("True");
//        }else{
//        printf("False");
//        }
//        }